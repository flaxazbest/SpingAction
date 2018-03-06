package ua.azbest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.azbest.Knight;

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
