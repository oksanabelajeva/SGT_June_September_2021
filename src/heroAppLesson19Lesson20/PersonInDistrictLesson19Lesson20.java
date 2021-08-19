package heroAppLesson19Lesson20;

import java.util.ArrayList;

public class PersonInDistrictLesson19Lesson20 {
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

        int highestAmountOfPersonsInDistrict = 0;
        for (District districtToCompareSize : allDistricts) {
            if (districtToCompareSize.findSizeOfDistrict() > highestAmountOfPersonsInDistrict) {
                highestAmountOfPersonsInDistrict = districtToCompareSize.findSizeOfDistrict();
            } else if (districtToCompareSize.findSizeOfDistrict() == highestAmountOfPersonsInDistrict) {
                System.out.println("All Districts have the same amount of Persons.");
            }
        }

        for (District districtToCompareSize : allDistricts) {
            if (districtToCompareSize.findSizeOfDistrict() == highestAmountOfPersonsInDistrict) {
                System.out.println("District with the highest amount of Persons is " + districtToCompareSize.getTitle() + ".");
            }
        }

        Hero hero8 = new Hero("Marta", "Liepina", "Grass", 876, 5);
        Hero hero9 = new Hero("Karlis", "Liepins", "Sun", 796, 3557);
        Hero hero10 = new Hero("Martins", "Liepins", "Rain", 135, 865);
        Hero hero11 = new Hero("Edgars", "Popovs", "Flash", 3, 9421);
        Hero hero12 = new Hero("Laila", "Popova", "Hero", 578, 6357);
        Hero hero13 = new Hero("Olga", "Skala", "Sound", 76, 2782);
        Hero hero14 = new Hero("Markuss", "Skals", "Flow", 84, 7962);

        ArrayList<Person> districtThirdList = new ArrayList<>();
        districtThirdList.add(hero8);
        districtThirdList.add(hero9);
        districtThirdList.add(hero10);
        districtThirdList.add(hero11);
        districtThirdList.add(hero12);
        districtThirdList.add(hero13);
        districtThirdList.add(hero14);

        District districtThird = new District("Third district", "Chicago", 3, districtThirdList);

        allDistricts.add(districtThird);

        float largestAverageHeroLevel = 0;
        for (District checkedDistricts : allDistricts){
            if (checkedDistricts.calculateHeroesAvgLevelInDistrict() > largestAverageHeroLevel){
                largestAverageHeroLevel = checkedDistricts.calculateHeroesAvgLevelInDistrict();
                System.out.println("District with the largest average Hero level of a district is " + checkedDistricts.getTitle() + ".");
            }
        }
    }
}