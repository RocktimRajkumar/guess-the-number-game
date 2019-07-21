package rock.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    // ==== fields ====
    private int maxNumber =50;

    // ==== bean methods ====
    @Bean
    public int getMaxNumber() {
        return maxNumber;
    }
}
