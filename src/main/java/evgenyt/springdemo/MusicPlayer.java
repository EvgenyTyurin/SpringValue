package evgenyt.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Setting volume property using @Value annotation
 */

@Component
public class MusicPlayer {
    // Just a value
    @Value("50")
    private int volume;

    public void play() {
        System.out.println("Playing song at " + volume + "% volume...");
    }

    // Inject value from another bean
    @Value("#{appSettings.playerInitValue}")
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
