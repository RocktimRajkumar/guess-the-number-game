package src.main.java.rock.learning.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rock.learning.AppConfig;
import rock.learning.MessageGenerator;
import rock.learning.NumberGenerator;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the Number game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // get numberGenerator bean from context (container)
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info(" number = {}", number);

        // get messageGenerator bean from context (container)
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

        // close context (container)
        context.close();
    }
}
