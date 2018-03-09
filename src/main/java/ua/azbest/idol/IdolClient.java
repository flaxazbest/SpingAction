package ua.azbest.idol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.azbest.idol.config.SpringIdolConfig;
import ua.azbest.knight.KnightConfig;

public class IdolClient {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringIdolConfig.class);
        Auditorium aud = (Auditorium) context.getBean("auditorium");
        Performer duke = (Performer) context.getBean("poeticDuke");
        try {
            duke.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }

        Performer kenny = (Performer) context.getBean("kenny");
        try {
            kenny.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }

}
