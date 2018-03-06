package ua.azbest.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
            Knight knight = context.getBean(Knight.class);
            knight.embarkOnQuest();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
