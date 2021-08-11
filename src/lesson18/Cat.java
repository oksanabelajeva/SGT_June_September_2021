package lesson18;

public class Cat extends Animal {

    private String favoriteFood;

    public Cat() {
    }

    public Cat(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void sayMeow(){
        System.out.println("Meow! My name is " + getName() + ".");
    }

    public void sleep() {
        System.out.println("Murrr.... I am sleeping!");
    }
}