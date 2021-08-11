package lesson19;

public class Food {
    private int weight;
    private String taste;
    private String name;
    private boolean isVegan;

    // STATIC METHOD EXAMPLE
    static public int seeGlobalProductionRate(){
        return 5000;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}