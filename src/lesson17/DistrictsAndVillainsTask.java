package lesson17;

import lesson16.HeroTask;
import lesson16.HeroType;

import java.util.ArrayList;

public class DistrictsAndVillainsTask {
    public static void main(String[] args) {

        HeroTask hero1 = new HeroTask("Janis", "Liepins", "Ninja", 45, HeroType.Hero, 45);
        HeroTask hero2 = new HeroTask("Julia", "Skaista", "Go-girl", 56, HeroType.Villain, 1);
        HeroTask hero3 = new HeroTask("John", "Markovich", "Marko", 657, HeroType.Hero, 46);
        HeroTask hero4 = new HeroTask("Nicolas", "Great", "Great man", 234, HeroType.Hero, 21);
        HeroTask hero5 = new HeroTask("Grim", "Belyaev", "BeGrim", 789, HeroType.Hero, 34);
        HeroTask hero6 = new HeroTask("Maris", "Zalitis", "Grass man", 12, HeroType.Hero, 50);
        HeroTask hero7 = new HeroTask("Margarita", "Beautiful", "Beauty-girl", 5, HeroType.Villain, 19);

        ArrayList<HeroTask> districtSmallList = new ArrayList<>();
        districtSmallList.add(hero1);
        districtSmallList.add(hero2);
        districtSmallList.add(hero3);

        ArrayList<HeroTask> districtLargeList = new ArrayList<>();
        districtLargeList.add(hero4);
        districtLargeList.add(hero5);
        districtLargeList.add(hero6);
        districtLargeList.add(hero7);

        District districtSmall = new District("Small district", "Kandava", 2, districtSmallList);
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
    }
}