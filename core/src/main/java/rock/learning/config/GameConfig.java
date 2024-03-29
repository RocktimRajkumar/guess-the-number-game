package rock.learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import rock.learning.GuessCount;
import rock.learning.MaxNumber;
import rock.learning.MinNumber;

@Configuration
@ComponentScan(basePackages = "rock.learning")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    // ==== fields ====
    @Value("${game.maxNumber:70}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Value("${game.minNumber:2}")
    private int minNumber;

    // ==== bean methods ====
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }
}
