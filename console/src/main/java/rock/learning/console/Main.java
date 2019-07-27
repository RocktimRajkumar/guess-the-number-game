package rock.learning.console;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rock.learning.config.GameConfig;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess the Number game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // close context (container)
        context.close();
    }
}
