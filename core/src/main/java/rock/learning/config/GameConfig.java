package rock.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rock.learning.GuessCount;
import rock.learning.MaxNumber;

@Configuration
public class GameConfig {

    // ==== fields ====
    private int maxNumber =100;

    private int guessCount = 8;

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
}
