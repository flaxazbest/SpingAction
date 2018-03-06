package ua.azbest.knight.quest;

import java.io.PrintStream;

public class RescueDamselQuest implements Quest {

  private PrintStream stream;

    public RescueDamselQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
    System.out.println("Почати квест, щоб врятувати дівчину.");
  }

}
