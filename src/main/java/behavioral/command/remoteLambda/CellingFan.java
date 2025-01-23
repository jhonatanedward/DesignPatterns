package behavioral.command.remoteLambda;

public class CellingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;
    public CellingFan(String location) {
        this.location = location;
    }

    public void high() {
        this.level = HIGH;
    }

    public void medium() {
        this.level = MEDIUM;
    }

    public void low() {
        this.level = LOW;
    }

    public void off() {
        level = 0;
    }
    public int getSpeed() {
        return this.level;
    }
}
