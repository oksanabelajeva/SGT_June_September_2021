package heroAppLesson19Lesson20;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private ArrayList<Person> personInTheDistrict;

    public District() {
    }

    public District(String title, String city, int districtID, ArrayList<Person> personInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.personInTheDistrict = personInTheDistrict;
    }

    public float calculateHeroesAvgLevelInDistrict() {
        float onlyHeroLevelSum = 0;
        int counter = 0;
        for (Person person : personInTheDistrict) {
            if (person instanceof Hero) {
                onlyHeroLevelSum += ((Hero) person).getDeedTime();
                counter++;
            }
        }
        return onlyHeroLevelSum / counter;
    }

    public int findSizeOfDistrict(){
        return personInTheDistrict.size();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Person> getPersonInTheDistrict() {
        return personInTheDistrict;
    }

    public void setPersonInTheDistrict(ArrayList<Person> personInTheDistrict) {
        this.personInTheDistrict = personInTheDistrict;
    }

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", personInTheDistrict=" + personInTheDistrict +
                '}';
    }
}