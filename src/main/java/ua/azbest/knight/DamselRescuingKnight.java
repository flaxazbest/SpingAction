package ua.azbest.knight;

import org.aspectj.lang.annotation.Pointcut;
import ua.azbest.knight.quest.RescueDamselQuest;

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
