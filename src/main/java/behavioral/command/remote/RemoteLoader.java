package behavioral.command.remote;


public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CellingFan cellingFan = new CellingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitcheLightOff = new LightOffCommand(kitchenLight);
        CellingFanOnCommand cellingFanOn = new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitcheLightOff);
        remoteControl.setCommand(2, cellingFanOn, cellingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(5,
                new MacroCommand(
                        new Command[]{livingRoomLightOn, kitchenLightOn, cellingFanOn, garageDoorUp, stereoOnWithCD}),
                new MacroCommand(
                        new Command[]{livingRoomLightOff, kitcheLightOff, cellingFanOff, garageDoorDown, stereoOff})
        );

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
        remoteControl.offCommandWasPushed(5);
    }
}
