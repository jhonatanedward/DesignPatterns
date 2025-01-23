package behavioral.command.remote;

public class Stereo {
    String location;
    Integer volume;
    public Stereo(String location) {
        this.location = location;
    }
    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCd() {
        System.out.println("CD Defined");
    }

    public void setDvd() {
        System.out.println("DVD Defined");
    }

    public void setRadio() {
        System.out.println("Radio Defined");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume Defined");
    }
}
