package heroAppLesson16Lesson18;

public class Hero extends Person {

    private String nickname;
    private int heroID;
    private int deedTime;

    public Hero() {
    }

    public Hero(String name, String surname, String nickname, int heroID, int crimeTime) {
        super(name, surname);
        this.nickname = nickname;
        this.heroID = heroID;
        this.deedTime = crimeTime;
    }

    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if (deedTime >= 20 && deedTime <= 40) {
            return 2;
        } else if (deedTime > 40) {
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

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "nickname='" + nickname + '\'' +
                ", heroID=" + heroID +
                ", crimeTime=" + deedTime +
                "} " + super.toString();
    }
}