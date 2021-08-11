package lesson19;

import java.util.ArrayList;

public class AllLessonsRepeated {
    public static void main(String[] args) {
        Food myFood = new Food();
        myFood.setWeight(500);
        System.out.println(myFood.getWeight());

        System.out.println(Food.seeGlobalProductionRate());

        CatsToBeCalled cat1 = new CatsToBeCalled();
        cat1.setName("Muris");
        CatsToBeCalled cat2 = new CatsToBeCalled();
        cat2.setName("Puris");
        CatsToBeCalled cat3 = new CatsToBeCalled();
        cat3.setName("Barsik");
        CatsToBeCalled.allTheCats.add(cat1);
        CatsToBeCalled.allTheCats.add(cat2);
        CatsToBeCalled.allTheCats.add(cat3);

        CatsToBeCalled.callingToCome();

        // 2 examples how to create an instance with ArrayLists
        CatsToBeCalled catWithFleas = new CatsToBeCalled("Boris", "Riga", new ArrayList<>());
        catWithFleas.getFleas().add("Harry");
        catWithFleas.getFleas().add("Mary");
        catWithFleas.getFleas().add("Johny");
        System.out.println(catWithFleas);

        ArrayList<String> fleas = new ArrayList<>();
        fleas.add("Summer");
        fleas.add("Demi");
        fleas.add("Mash");

        CatsToBeCalled anotherCatWithFleas = new CatsToBeCalled("Long John", "Islands", fleas);
        System.out.println(anotherCatWithFleas);
    }

    // SCOPES
    public static void methodWithPrivateScope() {
        int variableWithLimitedScope = 10;
        System.out.println(variableWithLimitedScope);
    }
}