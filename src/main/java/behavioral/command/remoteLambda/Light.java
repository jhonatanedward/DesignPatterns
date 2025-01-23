package behavioral.command.remoteLambda;

public class Light {

    String location = "";

    public Light(String location){
        this.location = location;
    }

    public void on () {
        System.out.println(location + " light is on");
    }

    void off() {
        System.out.println(location + " light Off");
    }
}
