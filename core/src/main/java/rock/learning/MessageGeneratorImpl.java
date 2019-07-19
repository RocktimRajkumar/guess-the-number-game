package rock.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class MessageGeneratorImpl implements MessageGenerator {

    // ==== Constant ====
    private static final Logger log = LoggerFactory.getLogger(MessageGeneratorImpl.class);

    // ==== Fields ====
    @Autowired
    private Game game;

    private int guessCount = 10;

    // ==== init methods ====
    @PostConstruct
    public void init(){
        log.info("game = {}",game);
    }

    // ==== Public Methods ====

    @Override
    public String getMainMessage() {
        return "getMainMsg";
    }

    @Override
    public String getResultMessage() {
        return "getResultMsg";
    }
}
