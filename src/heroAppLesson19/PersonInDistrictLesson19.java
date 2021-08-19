package heroAppLesson19;

import java.util.ArrayList;
import java.util.Collections;

public class PersonInDistrictLesson19 {
    public static void main(String[] args) {

        Hero hero1 = new Hero("Janis", "Liepins", "Ninja", 45, 45);
        Hero hero2 = new Hero("Julia", "Skaista", "Go-girl", 56, 1);
        Hero hero3 = new Hero("John", "Markovich", "Marko", 657, 46);
        Hero hero4 = new Hero("Nicolas", "Great", "Great man", 234, 21);
        Hero hero5 = new Hero("Grim", "Belyaev", "BeGrim", 789, 34);
        Hero hero6 = new Hero("Maris", "Zalitis", "Grass man", 12, 50);
        Hero hero7 = new Hero("Margarita", "Beautiful", "Beauty-girl", 5, 19);

        ArrayList<Person> districtSmallList = new ArrayList<>();
        ArrayList<Person> districtLargeList = new ArrayList<>();

        District districtSmall = new District("Small district", "Kandava", 1, districtSmallList);
        District districtLarge = new District("Large district", "New York", 2, districtLargeList);

        Villain villain1 = new Villain("John", "Malkovich", "Evil husband", 767, 100);
        Villain villain2 = new Villain("Maria", "Malkovich", "Evil wife", 768, 200);
        Villain villain3 = new Villain("Michael", "Malkovich", "Evil son", 769, 50);

        districtSmallList.add(hero1);
        districtSmallList.add(hero2);
        districtSmallList.add(hero3);
        districtSmallList.add(villain1);
        districtSmallList.add(villain2);

        districtLargeList.add(hero4);
        districtLargeList.add(hero5);
        districtLargeList.add(hero6);
        districtLargeList.add(hero7);
        districtLargeList.add(villain3);

        System.out.println(districtSmall);
        System.out.println(districtLarge);

        System.out.println("Average level of Heroes in Small district is " + String.format("%.2f", districtSmall.calculateHeroesAvgLevelInDistrict()) + ".");
        System.out.println("Average level of Heroes in Large district is " + String.format("%.2f", districtLarge.calculateHeroesAvgLevelInDistrict()) + ".");

        ArrayList<District> allDistricts = new ArrayList();
        allDistricts.add(districtSmall);
        allDistricts.add(districtLarge);
        System.out.println(allDistricts);

        //f.      Find out which District is with the highest amount of Persons.
        int highestAmountOfPersonsInDistrict = 0;
        for (District districtToCompareSize : allDistricts) {
            if (districtToCompareSize.findSizeOfDistrict() > highestAmountOfPersonsInDistrict) {
                highestAmountOfPersonsInDistrict = districtToCompareSize.findSizeOfDistrict();
            } else if (districtToCompareSize.findSizeOfDistrict() == highestAmountOfPersonsInDistrict) {
                System.out.println("All Districts have the same amount of Persons.");
            }
        }

        ArrayList<District> districtWithHighestAmountOfPersonsInDistrict = new ArrayList<>();
        for (District districtToCompareSize : allDistricts) {
            if (districtToCompareSize.findSizeOfDistrict() == highestAmountOfPersonsInDistrict) {
                districtWithHighestAmountOfPersonsInDistrict.add(districtToCompareSize);
                System.out.println("District with the highest amount of Persons is " + districtToCompareSize.getTitle() + ".");
            }
        }
    }
}