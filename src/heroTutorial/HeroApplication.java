package heroTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {

    public static String[] addHeroName(String heroArrayList[], String newHeroName) {
        List<String> heroList = new ArrayList<>(Arrays.asList(heroArrayList));
        heroList.add(newHeroName);
        heroArrayList = heroList.toArray(heroArrayList);
        return heroArrayList;
    }

    public static String[] removeHero(String heroArrayList[], int heroIndexToDelete) {
        List<String> heroList = new ArrayList<>(Arrays.asList(heroArrayList));
        heroList.remove(heroIndexToDelete);
        heroArrayList = heroList.toArray(heroArrayList);
        return heroArrayList;
    }

    public static void main(String[] args) {

        String[] heroArrayList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};

        int menuEntry;
        Scanner menuScanner = new Scanner(System.in);

        do {
            System.out.println("Welcome!");
            System.out.println("Please select what to do: ");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero from the list");
            System.out.println("0 - Exit");
            menuEntry = menuScanner.nextInt();

            switch (menuEntry) {
                case 1:
                    System.out.println("***** HERO LIST *****");
                    for (String heroName : heroArrayList
                    ) {
                        System.out.println(heroName);
                    }
                    System.out.println("****************************");
                    break;
                case 2:
                    System.out.println("Please enter hero's name to be added: ");
                    String newHeroName = menuScanner.next();
                    heroArrayList = addHeroName(heroArrayList, newHeroName);
                    break;
                case 3:
                    // Variable initialization
                    String heroName;
                    String heroCity;

                    String heroPower1, heroPower2, heroPower3;

                    boolean isEvil;

                    double heroSalary;
                    String realName;

                    String universe;

                    // Variable assignment
                    heroName = "STAR";
                    heroCity = "Ukhta";
                    heroPower1 = "Super smile";
                    heroPower2 = "Super fast thinking";
                    heroPower3 = "";
                    isEvil = false;
                    heroSalary = 100.00;
                    realName = "Oxana";
                    universe = "Earth universe";

                    // Print out Hero information card
                    System.out.println("****************************");
                    System.out.println("***** HERO INFORMATION *****");
                    System.out.println("****************************");

                    System.out.println("Hero name: " + heroName);
                    System.out.println("This hero was born in " + heroCity + ".");

                    System.out.println("-----------------------------");
                    System.out.println("Hero Superpowers: ");
                    System.out.println("---" + heroPower1);
                    System.out.println("---" + heroPower2);
                    System.out.println("---" + heroPower3);

                    System.out.println("Is this SuperHero evil? " + isEvil);

                    System.out.println("This hero earns: " + heroSalary + " EUR per week.");
                    System.out.println(realName + " hides her identity.");
                    System.out.println("Hero lives in " + universe + ".");

                    System.out.println("****************************");
                    System.out.println("***** HERO INFORMATION *****");
                    System.out.println("****************************");

                    // How many cookies can superhero purchase for his / her salary
                    // 1 cookie costs = 1.29 euro
                    System.out.println("****************************");
                    System.out.println("***** Financials *****");
                    int numberOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println("Hero can purchase " + numberOfCookies + " cookies.");
                    double averageDailySalary = Math.round(heroSalary / 30 * 100) / 100;
                    System.out.println("Hero average daily salary is " + averageDailySalary + " euro.");

                    // If a hero is a villain or a hero
                    if (isEvil) {
                        System.out.println("Hero is a villain, he is stealing cookies!!!");
                    } else {
                        System.out.println("Hero protects the city!");
                    }

                    heroCity = "Metropolis";

                    switch (heroCity) {
                        case "New York":
                            heroSalary = 2000;
                            break;
                        case "Riga":
                            heroSalary = 1200.91;
                            break;
                        case "Metropolis":
                            heroSalary = 1000000;
                            break;
                        default:
                            heroSalary = 100;
                    }

                    System.out.println("Hero's new salary is " + heroSalary + " euros.");

                    // How many cookies can superhero purchase for his / her salary
                    // 1 cookie costs = 1.29 euro
                    System.out.println("****************************");
                    System.out.println("***** Financials *****");
                    int numberOfCookiesWithNewSalary = (int) Math.floor(heroSalary / 1.29);
                    System.out.println("Hero can purchase " + numberOfCookiesWithNewSalary + " cookies.");
                    double averageDailySalaryWithNewSalary = Math.round(heroSalary / 30);
                    System.out.println("Hero average daily salary is " + averageDailySalaryWithNewSalary + " euro.");

                    char grade;

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please, enter a grade (one of these: A, B, C, D, E, F, G, H) ");
                    grade = scanner.next().charAt(0);

                    switch (grade) {
                        case 'A':
                        case 'B':
                            System.out.println("Perfect! You are so brave!");
                            break;
                        case 'C':
                            System.out.println("Good! But You can do better!");
                            break;
                        case 'D':
                        case 'E':
                            System.out.println("It is not good! You should choose your bad or good side!");
                            break;
                        case 'G':
                            System.out.println("Bad, you are true villain");
                            break;
                        case 'F':
                        case 'H':
                            System.out.println("Better luck next time!");
                            break;
                        default:
                            System.out.println("Please choose the correct grade!");
                    }
                    break;
                case 4:
                    System.out.println("Please enter index to deleted: ");
                    int heroIndex = menuScanner.nextInt();
                    heroArrayList = removeHero(heroArrayList, heroIndex);
                   // heroArrayList = Arrays.copyOf(heroArrayList, heroArrayList.length - 1);
                    for (String heroIndexDeleted : heroArrayList) {
                        System.out.println(heroIndexDeleted);
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("The menu item does not exist.");
            }
        } while (menuEntry != 0);
    }
}