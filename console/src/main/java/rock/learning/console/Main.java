package rock.learning.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rock.learning.config.GameConfig;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the Number game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // close context (container)
        context.close();
    }
}
