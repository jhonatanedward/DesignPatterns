package behavioral.command.remoteLambda;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Living Room");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Room");
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, cellingFan::high, cellingFan::off);
        remoteControl.setCommand(3, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(4, stereoOnWithCD, stereo::off);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offCommandWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offCommandWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offCommandWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offCommandWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offCommandWasPushed(4);
    }
}
