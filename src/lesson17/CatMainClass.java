package lesson17;

public class CatMainClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.setName("Masja");
        myCat.sleep();
        myCat.setAge(16);
        System.out.println("My cat's age is " + myCat.getAge());

        myCat.setAge(myCat.getAge() + 1);
        System.out.println("Yay! It is my cat's birthday! Now " + myCat.getName() + " is " + myCat.getAge() + " years old!");

        Cat myNeighbourCat = new Cat("Barsik", "Stray", "brown", true, 6);
        myNeighbourCat.toString();

    }
}
