package lesson18;

import java.util.ArrayList;

public class InheritanceExamples {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.sleep();

        Cat myCat = new Cat();
        myCat.setName("Muris");
        myCat.sayMeow();
        myCat.sleep();

        Bird myBird = new Bird();
        System.out.println(myBird.flyAway());
        myBird.sleep();
        myBird.foodLimit = 100;
        System.out.print("I am cute bird and ");
        myBird.setFood(150);
        System.out.println(myBird.foodLimit = myBird.foodLimit + 100);

        BritishCat britishCat = new BritishCat();
        britishCat.sleep();
        britishCat.setName("Lord");
        britishCat.sayMeow();
        britishCat.englishMeow();

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(britishCat);
        System.out.println(animalList);

        Cat someCat = new Cat("Trout");
        System.out.println(someCat.getFavoriteFood());
        someCat.setFavoriteFood("Potato");
        System.out.println(someCat.getFavoriteFood());
    }
}