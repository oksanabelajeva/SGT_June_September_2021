package heroAppLesson16Lesson18;

import java.util.ArrayList;

public class DistrictsAndVillainsTaskLesson17 {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Janis", "Liepins", "Ninja", 45, 45);
        Hero hero2 = new Hero("Julia", "Skaista", "Go-girl", 56,  1);
        Hero hero3 = new Hero("John", "Markovich", "Marko", 657, 46);
        Hero hero4 = new Hero("Nicolas", "Great", "Great man", 234, 21);
        Hero hero5 = new Hero("Grim", "Belyaev", "BeGrim", 789, 34);
        Hero hero6 = new Hero("Maris", "Zalitis", "Grass man", 12, 50);
        Hero hero7 = new Hero("Margarita", "Beautiful", "Beauty-girl", 5, 19);

        ArrayList<Hero> districtSmallList = new ArrayList<>();
        districtSmallList.add(hero1);
        districtSmallList.add(hero2);
        districtSmallList.add(hero3);

        ArrayList<Hero> districtLargeList = new ArrayList<>();
        districtLargeList.add(hero4);
        districtLargeList.add(hero5);
        districtLargeList.add(hero6);
        districtLargeList.add(hero7);

        District districtSmall = new District("Small district", "Kandava", 1, districtSmallList);
        System.out.println("Average level of Small district is " + districtSmall.calculateAvgLevelInDistrict() + ".");
        District districtLarge = new District("Large district", "New York", 2, districtLargeList);
        System.out.println("Average level of Large district is " + districtLarge.calculateAvgLevelInDistrict() + ".");

        System.out.println(districtSmall);
        System.out.println(districtLarge);

        ArrayList<District> allDistricts = new ArrayList<>();
        allDistricts.add(districtSmall);
        allDistricts.add(districtLarge);
        System.out.println(allDistricts);

        int numberOfHeroesInBothDistricts = districtSmallList.size() + districtLargeList.size();
        System.out.println("There are " + numberOfHeroesInBothDistricts + " heroes in both Districts.");

        if (districtSmall.calculateAvgLevelInDistrict() > districtLarge.calculateAvgLevelInDistrict()) {
            System.out.println("Small district is the best based on the average level of heroes.");
        } else {
            System.out.println("Small district is the best based on the average level of heroes.");
        }

        System.out.println(allDistricts.remove(districtSmall)); // ir printed out true

        // TASK 2
        Hero heroWithCrimeTimeFirst = new Hero("Oxana", "Belyaeva", "Cool Star", 45, 78);
        Hero heroWithCrimeTimeSecond = new Hero("Lidija", "Belyaeva", "Saver", 54, 87);
        System.out.println(heroWithCrimeTimeFirst);
        System.out.println(heroWithCrimeTimeSecond);
    }
}