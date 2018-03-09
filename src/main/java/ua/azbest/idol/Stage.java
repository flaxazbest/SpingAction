package ua.azbest.idol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stage {

    private Stage() {
    }

    private static class StageSingleHolder {
        static Stage instance = new Stage();
    }

    @Autowired
    public static Stage getInstance() {
        return StageSingleHolder.instance;
    }
}
