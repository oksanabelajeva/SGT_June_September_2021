package lesson17;

import lesson16.HeroTask;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private ArrayList<HeroTask> heroesInTheDistrict;

    public District() {
    }

    public District(String title, String city, int districtID, ArrayList<HeroTask> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    public boolean addNewHero(HeroTask hero) {
        return heroesInTheDistrict.add(hero);
    }

    public HeroTask removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }

    public float calculateAvgLevelInDistrict() {
        float heroLevelSum = 0;
        for (int i = 0; i < heroesInTheDistrict.size(); i++) {
            HeroTask hero = heroesInTheDistrict.get(i);
            heroLevelSum += hero.calculatedLevel();
        }
        return heroLevelSum / heroesInTheDistrict.size();
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

    public ArrayList<HeroTask> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<HeroTask> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtID=" + districtID +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }
}