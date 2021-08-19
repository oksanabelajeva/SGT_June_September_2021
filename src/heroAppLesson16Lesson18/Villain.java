package heroAppLesson16Lesson18;

public class Villain extends Person {

    private String nickname;
    private int heroID;
    private int crimeTime;

    public Villain() {
    }

    public Villain(String name, String surname, String nickname, int heroID, int crimeTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.crimeTime = crimeTime;
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
        return "Villain{" +
                "nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", crimeTime=" + crimeTime +
                "} " + super.toString();
    }
}