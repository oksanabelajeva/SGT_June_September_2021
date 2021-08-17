package heroAppLesson16Lesson19;

import java.util.ArrayList;

public class HeroesVillainsPersonLesson18 {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Janis", "Liepins", "Ninja", 45, 45);
        Hero hero2 = new Hero("Julia", "Skaista", "Go-girl", 56, 1);
        Hero hero3 = new Hero("John", "Markovich", "Marko", 657, 46);
        Hero hero4 = new Hero("Nicolas", "Great", "Great man", 234, 21);
        Hero hero5 = new Hero("Grim", "Belyaev", "BeGrim", 789, 34);
        Hero hero6 = new Hero("Maris", "Zalitis", "Grass man", 12, 50);
        Hero hero7 = new Hero("Margarita", "Beautiful", "Beauty-girl", 5, 19);

        ArrayList<Hero> districtSmallList = new ArrayList<>();
        ArrayList<Hero> districtLargeList = new ArrayList<>();

        District districtSmall = new District("Small district", "Kandava", 1, districtSmallList);
        District districtLarge = new District("Large district", "New York", 2, districtLargeList);

        Villain villain1 = new Villain("John", "Malkovich", "Evil husband", 767, 100);
        Villain villain2 = new Villain("Maria", "Malkovich", "Evil wife", 768, 200);
        Villain villain3 = new Villain("Michael", "Malkovich", "Evil son", 769, 50);

        districtSmallList.add(hero1);
        districtSmallList.add(hero2);
        districtSmallList.add(hero3);

        districtLargeList.add(hero4);
        districtLargeList.add(hero5);
        districtLargeList.add(hero6);
        districtLargeList.add(hero7);

        System.out.println(districtSmall);
        System.out.println(districtLarge);

        System.out.println(villain1.toString() + villain2.toString() + villain3.toString());

        ArrayList<Villain> villainsStoring = new ArrayList<>();
        villainsStoring.add(villain1);
        villainsStoring.add(villain2);
        villainsStoring.add(villain3);

        float villainTotalTimeOfCrimes = 0;
        for (int i = 0; i < villainsStoring.size(); i++) {
            Villain villain = villainsStoring.get(i);
            villainTotalTimeOfCrimes += villain.getCrimeTime();
        }
        System.out.println("The total number (total time) of the crimes in which the Villains were involved is " + villainTotalTimeOfCrimes + ".");

        Villain villainWithMaxTimeSpentInCrime = villainsStoring.get(0);
        for (int i = 0; i < villainsStoring.size(); i++) {
            Villain villain = villainsStoring.get(i);
            if (villainWithMaxTimeSpentInCrime.getCrimeTime() < villain.getCrimeTime()) {
                villainWithMaxTimeSpentInCrime = villain;
            } else {
                villainWithMaxTimeSpentInCrime = villainWithMaxTimeSpentInCrime;
            }
        }
        System.out.println("The most involved to crimes (max time spent) villain is: " + villainWithMaxTimeSpentInCrime + ".");
    }
}