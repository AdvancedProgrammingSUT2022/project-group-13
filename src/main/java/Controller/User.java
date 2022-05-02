package Controller;

public class User {

    private String name;
    private String password;
    private String nickname;
    private int score;
    private int gold;
    private int turns;

    public User(String name, String nickname, String password) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        turns=0;
        gold=0;
        score = 0;
    }

    public int getGold() {
        return gold;
    }

    public int getTurns() {
        return turns;
    }

    public void setGold(int gold) {
        this.gold += gold;
    }

    public void setTurns(int turns) {
        this.turns += turns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void increaseScore(int amount) {
        this.score += amount;
    }

    public void decreaseScore(int amount) {
        this.score -= amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", score=" + score +
                '}';
    }
}
