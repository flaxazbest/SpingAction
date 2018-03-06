package ua.azbest;

import org.aspectj.lang.annotation.Pointcut;
import ua.azbest.quest.RescueDamselQuest;

@Deprecated
public class DamselRescuingKnight implements Knight {

  private RescueDamselQuest quest;

  public DamselRescuingKnight() {
    this.quest = new RescueDamselQuest(System.out);
  }

  @Pointcut("execution(* *.embarkOnQuest(..))")
  public void embarkOnQuest() {
    quest.embark();
  }

}
