package Controller;

public class User {

    private String name;
    private String password;
    private String nickname;
    private int score;

    public User(String name, String nickname, String password) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        score = 0;
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
