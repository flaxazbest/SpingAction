package ua.azbest.idol;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Auditorium  {

    @PostConstruct
    public void turnOnLights() {
        System.out.println("Turn on Lights");
    }

    @PreDestroy
    public void turnOffLights() {
        System.out.println("Turn off Lights");
    }

}
