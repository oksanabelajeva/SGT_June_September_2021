package lesson16;

public class ComputerRun {
    public static void main(String[] args) {
        Computer computerFirst = new Computer();
        System.out.println("Size of PC first = " + computerFirst.getSizeInches());

        Computer computerSecond = new Computer(13.4f, 3.0f, "Black", (short) 8, 500f);
        System.out.println("Size of PC second = " + computerSecond.getSizeInches());
    }
}
