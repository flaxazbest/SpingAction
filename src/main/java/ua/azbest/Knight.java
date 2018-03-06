package ua.azbest;

import org.aspectj.lang.annotation.Pointcut;

public interface Knight {
    @Pointcut("execution(* *.embarkOnQuest(..))")
    void embarkOnQuest();
}