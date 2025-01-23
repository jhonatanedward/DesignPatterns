package behavioral.command.remote;

public class UndoTest {
    public static void main(String[] args) {
        CellingFan cellingFan = new CellingFan("Living Room");
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, cellingFanHighCommand, cellingFanOffCommand);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWassPressed();
    }
}
