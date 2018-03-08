package ua.azbest.stereo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.azbest.stereo.CompactDisc;
import ua.azbest.stereo.SgtPeppers;

@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
