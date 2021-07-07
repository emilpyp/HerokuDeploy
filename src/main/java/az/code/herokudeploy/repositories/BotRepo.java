package az.code.herokudeploy.repositories;

import az.code.herokudeploy.models.BotModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BotRepo extends JpaRepository<BotModel, Long> {
}
