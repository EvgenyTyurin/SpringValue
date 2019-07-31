package evgenyt.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Setting volume property using @Value annotation
 */

@Component
@PropertySource("classpath:application.properties")
public class MusicPlayer {
    // Just a value
    @Value("50")
    private int volume;

    public void play() {
        System.out.println("Playing song at " + volume + "% volume...");
    }

    // Get volume from application.properties file
    @Value("${player.init-volume}")
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
