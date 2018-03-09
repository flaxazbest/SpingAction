package ua.azbest.idol;

public class Sonnet29 implements Poem {
    private static String[] LINES = {
      "one",
      "two",
      "three"
    };

    public Sonnet29() {
    }

    public void recite() {
        for(String s: LINES)
            System.out.println(s);
    }
}
