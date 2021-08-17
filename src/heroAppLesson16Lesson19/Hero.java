package heroAppLesson16Lesson19;

public class Hero extends Person {

    private String nickname;
    private int heroID;
    private int crimeTime;

    public Hero() {
    }

    public Hero(String name, String surname, String nickname, int heroID, int crimeTime) {
        super(name, surname);
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
        return "Hero{" +
                "nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", crimeTime=" + crimeTime +
                "} " + super.toString();
    }
}