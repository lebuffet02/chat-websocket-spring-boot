package api.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import java.util.Date;
import java.util.Locale;

@SpringBootApplication
public class WebsocketApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebsocketApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
    }

    @Override
    public void run(String... args) {
        LOGGER.info("-------------SUBIU-------------");
        LOGGER.info(String.valueOf(new Date()).concat(new Locale(" pt", "BR").toString()));
    }
}