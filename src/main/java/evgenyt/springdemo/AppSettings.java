package evgenyt.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class AppSettings {
    // Get volume from application.properties file
    @Value("${player.init-volume}")
    public int playerInitValue;
}
