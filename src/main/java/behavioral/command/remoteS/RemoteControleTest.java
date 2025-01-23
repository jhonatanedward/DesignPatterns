package behavioral.command.remoteS;

public class RemoteControleTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        simpleRemoteControl.setCommand(new LightOnCommand(light));
        simpleRemoteControl.buttonWasPressed();
    }
}
