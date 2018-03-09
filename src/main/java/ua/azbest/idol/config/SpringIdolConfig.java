package ua.azbest.idol.config;

import org.springframework.context.annotation.Bean;
import ua.azbest.idol.*;

public class SpringIdolConfig {

    @Bean
    public Performer duke() {
        return new Juggler(15);
    }

    @Bean
    public Poem sonet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(15, sonet29());
    }

    @Bean
    public Stage theStage() {
        return Stage.getInstance();
    }

    @Bean
    public Ticket ticket() {
        return new Ticket();
    }

    @Bean
    public Auditorium auditorium() {
        return new Auditorium();
    }

    @Bean
    public Instrument saxophone() {
        return new Saxophone();
    }

//    @Bean
//    public Instrument piano() {
//        return new Piano();
//    }

    @Bean
    public Performer kenny() {
        Instrumentalist p = new Instrumentalist();
        p.setSong("Jingle Bells");
        return p;
    }

}
