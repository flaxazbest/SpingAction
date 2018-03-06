package ua.azbest.knight;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.PrintStream;

@Aspect
public class Minstrel {

    private PrintStream stream;
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    @Before("execution(* *.embarkOnQuest(..))")
    public void singBefeoreQuest() {
        stream.println("Тра-ла-ла, лиціар такий хоробрий!");
    }

    @After("execution(* *.embarkOnQuest(..))")
    public void singAfterQuest() {
        stream.println("О-хо-хо, хоробрий лицар " +
                "виконав квест!");
    }

}
