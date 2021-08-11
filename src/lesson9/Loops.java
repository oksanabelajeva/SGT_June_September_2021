package lesson9;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Hello! You are in an iteration!");
        }

        //A loop starts with 53, runs 100 times, negatively
        for (int i = 53; i > -47; i--) {
            System.out.println(" The loop will be: " + i);
        }

        int counter = 0;
        for (int i = 59; i < 1005; i++) {
            System.out.println("This is iteration # " + counter);
            counter++;
        }

        counter = 1;
        for (int currentTime = 8; currentTime < 12; currentTime++) {
            System.out.println("BOM BOM! It is " + currentTime + " o'clock!");
            System.out.println("This is the " + counter + " time the clock alarmed.");
            counter = counter + 1;
        }
    }
}
