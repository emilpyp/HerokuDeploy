package az.code.herokudeploy.controllers;

import az.code.herokudeploy.services.BotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class BotController {
    private final BotService botService;

    public BotController(BotService botService) {
        this.botService = botService;
    }

    @GetMapping("version")
    public String getVersion(){
        return "version-1";
    }

    @GetMapping("bots")
    public List<?> getBots(){
        return botService.getBots();
    }
}
