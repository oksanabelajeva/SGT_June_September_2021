package lesson17;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private boolean isAMammal;
    private int age;

    public Cat() {
        System.out.println("I am here. Meow!");
    }

    public Cat(String name, String breed, String color, boolean isAMammal, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.isAMammal = isAMammal;
        this.age = age;
    }

    public void sleep(){
        System.out.println("Zzzzzzzzzzz......");
    }

     public void catchPrey(String prey){
         System.out.println("I have caught a " + prey + ".");
     }

     public String formatCat(){
        return "Name: " + name;
     }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", isAMammal=" + isAMammal +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAMammal() {
        return isAMammal;
    }

    public void setAMammal(boolean AMammal) {
        isAMammal = AMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Please insert correct age, the cat is not born.");
        } else if (age > 31){
            System.out.println("Please insert correct age, the cat is too old.");
        }else {
            this.age = age;
        }
    }
}
