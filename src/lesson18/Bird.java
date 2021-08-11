package lesson18;

public class Bird extends Animal{

    public String flyAway(){
        String flyAwayString = "I am flying to Brazil!";
        return flyAwayString;
    }

    public void sleep(){
        System.out.println("Tweet Tweet! I am sleeping!");
    }
}
