package rock.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import rock.learning.*;

@Configuration
@ComponentScan(basePackages = "rock.learning")
public class AppConfig {

    // ==== Bean methods ====
    @Bean
    public NumberGenerator numberGenerator (){
        return new NumberGeneratorImpl();
    }

    @Bean
    public Game game (){
        return new GameImpl();
    }

    @Bean
    public MessageGenerator messageGenerator(){
        return new MessageGeneratorImpl();
    }

}


