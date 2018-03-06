package ua.azbest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.*;

import ua.azbest.BraveKnight;
import ua.azbest.Knight;
import ua.azbest.quest.Quest;
import ua.azbest.quest.RescueDamselQuest;
import ua.azbest.quest.SlayDragonQuest;

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
