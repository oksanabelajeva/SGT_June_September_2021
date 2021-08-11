package lesson16;

public class HeroTask {

    String name;
    String surname;
    String nickname;
    int heroID;
    int crimeTime;

    public HeroTask() {
    }

    public HeroTask(String name, String surname, String nickname, int heroID, int crimeTime) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.heroID = heroID;
        this.crimeTime = crimeTime;
    }

    public int calculatedLevel() {
        if (crimeTime < 20) {
            return 1;
        } else if (crimeTime >= 20 && crimeTime <= 40) {
            return 2;
        } else if (crimeTime > 40) {
            return 3;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }

    @Override
    public String toString() {
        return "HeroTask{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", deedTime=" + crimeTime +
                '}';
    }
}