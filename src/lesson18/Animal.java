package lesson18;

public class Animal {

    private String name;
    private int food;
    public int foodLimit;

    public Animal() {
    }

    public void sleep(){
        System.out.println("Zzzzzzzzzzzz...... I am sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > foodLimit){
            System.out.println("I can't eat so much!");
        }
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", foodLimit=" + foodLimit +
                '}';
    }
}