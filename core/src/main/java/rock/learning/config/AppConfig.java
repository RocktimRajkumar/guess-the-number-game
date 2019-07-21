package rock.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import rock.learning.*;

@Configuration
@Import(GameConfig.class)
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


