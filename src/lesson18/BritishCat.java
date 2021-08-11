package lesson18;

import java.util.ArrayList;

public class BritishCat extends Cat {

    private int numberOfMedals;
    private ArrayList<String> previousCompetitions = new ArrayList<>();

    public BritishCat() {
    }

    public void englishMeow() {
        System.out.println("I am British Cat and I am saying meow, not meow.");
    }
}
