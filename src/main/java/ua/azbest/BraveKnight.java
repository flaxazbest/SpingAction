package ua.azbest;

import org.aspectj.lang.annotation.Pointcut;
import ua.azbest.quest.Quest;

public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }

}
