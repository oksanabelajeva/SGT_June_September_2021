package heroAppLesson16Lesson19;

import java.util.Arrays;
import java.util.Scanner;

public class HeroTaskRunLesson16 {

    public static void main(String[] args) {
        Hero heroBatman = new Hero("Nicolas", "Pitt",
                "Batman", 324, 67);
        Hero heroWonderWoman = new Hero("Margo", "Cage",
                "Wonder Woman", 768, 897);
        Hero heroUltron = new Hero("Grim", "Reaper",
                "Ultron", 10, 19);

        System.out.println("Information about heroes: \nBatman " + heroBatman + "\nWonder Woman " + heroWonderWoman +
                "\nUltron " + heroUltron);

        Hero[] metropoleHeroes = {heroBatman, heroWonderWoman, heroUltron};

        System.out.println(heroUltron.calculatedLevel());

        int counter = 0;
        for (Hero hero : metropoleHeroes) {
            if (hero.calculatedLevel() == 1) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("There is " + counter + " hero with level 1 in the Metropole.");
        } else {
            System.out.println("There are " + counter + " heroes with level 1 in the Metropole.");
        }

        counter = 0;
        for (Hero hero : metropoleHeroes) {
            if (hero.calculatedLevel() > 1) {
                counter++;
            }
        }
        if (counter == 1) {
            System.out.println("There is " + counter + " hero with level which is larger than 1 in the Metropole.");
        } else {
            System.out.println("There are " + counter + " heroes with level which is larger than 1 in the Metropole.");
        }

        counter = 0;
        for (Hero hero : metropoleHeroes) {
            if ("John".equals(hero.getName())) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There is no hero with the name “John”.");
        } else {
            System.out.println("There is some hero with the name “John”.");
        }

        // Another way to check if there is any John.
//        boolean isJohn = false;
//        for (HeroTask hero : metropoleHeroes) {
//            if (hero.getName().matches("John")) {
//                isJohn = true;
//                break;
//            }
//        }
//        if (isJohn) {
//            System.out.println("There is some hero with the name “John”.");
//        } else {
//            System.out.println("There is no hero with the name “John”.");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input new hero's name:");
        String newHeroName = scanner.nextLine();
        System.out.println("Please input new hero's surname:");
        String newHeroSurname = scanner.nextLine();
        System.out.println("Please input new hero's nickname:");
        String newHeroNickname = scanner.nextLine();
        System.out.println("Please input new hero's ID:");
        int newHeroID = scanner.nextInt();
//        Scanner of boolean
//        System.out.println("Please input new hero's type:");
//        HeroType newHeroType = HeroType.valueOf(scanner.next());
        System.out.println("Please input new hero's deed time:");
        int newHeroDeedTime = scanner.nextInt();

        Hero newHero = new Hero(newHeroName, newHeroSurname, newHeroNickname,
                newHeroID, newHeroDeedTime);

        Hero[] newMetropoleHeroes = {metropoleHeroes[0], metropoleHeroes[1], metropoleHeroes[2], newHero};
        System.out.println(Arrays.toString(newMetropoleHeroes));

        System.out.println("Please input hero's ID about who you want to receive an information:");
        int inputHeroID = scanner.nextInt();
        if (inputHeroID == metropoleHeroes[0].getHeroID()) {
            System.out.println(metropoleHeroes[0]);
        } else if (inputHeroID == metropoleHeroes[1].getHeroID()) {
            System.out.println(metropoleHeroes[1]);
        } else if (inputHeroID == metropoleHeroes[2].getHeroID()) {
            System.out.println(metropoleHeroes[2]);
        } else if (inputHeroID == newHero.getHeroID()) {
            System.out.println(newHero);
        } else {
            System.out.println("There is no such ID. Please try again!");
        }
    }
}