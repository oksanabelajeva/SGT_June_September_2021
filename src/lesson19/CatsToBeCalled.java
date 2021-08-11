package lesson19;

import java.util.ArrayList;

public class CatsToBeCalled {
    private String name;
    private String address;
    private ArrayList<String> fleas;

    public CatsToBeCalled() {
    }

    public CatsToBeCalled(String name, String address, ArrayList<String> fleas) {
        this.name = name;
        this.address = address;
        this.fleas = fleas;
    }

    // Static array to hold all the instances of the class
    public static ArrayList<CatsToBeCalled> allTheCats = new ArrayList<>();


    static void callingToCome() {
        System.out.println("Pssst! Pssst! Pssst!");
        for (CatsToBeCalled specificCats : allTheCats) {
            System.out.println("Meow meow, I am " + specificCats.getName() + " and I am running.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getFleas() {
        return fleas;
    }

    public void setFleas(ArrayList<String> fleas) {
        this.fleas = fleas;
    }

    @Override
    public String toString() {
        return "CatsToBeCalled{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fleas=" + fleas +
                '}';
    }
}