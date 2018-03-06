package ua.azbest.knight;

import org.springframework.context.annotation.*;

import ua.azbest.knight.quest.Quest;
import ua.azbest.knight.quest.RescueDamselQuest;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new RescueDamselQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }

}
