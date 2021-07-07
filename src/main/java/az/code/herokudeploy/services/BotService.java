package az.code.herokudeploy.services;

import antlr.collections.impl.IntRange;
import az.code.herokudeploy.models.BotModel;
import az.code.herokudeploy.repositories.BotRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class BotService {

    private final BotRepo botRepo;

    public BotService(BotRepo repo) {
        this.botRepo = repo;
    }

    public List<?> getBots(){
        return botRepo.findAll();
    }

    @PostConstruct
    void init(){
        IntStream.range(1,5)
                .mapToObj(i -> BotModel.builder().from("from " + i).to("to " + i).build())
                .forEach(botRepo::save);
    }
}
