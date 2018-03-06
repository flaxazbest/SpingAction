package ua.azbest.knight;

import org.aspectj.lang.annotation.Pointcut;

public interface Knight {
    @Pointcut("execution(* *.embarkOnQuest(..))")
    void embarkOnQuest();
}