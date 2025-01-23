package behavioral.command.remote;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(1);
    }

    @Override
    public void undo() {
        stereo.off();
        stereo.setVolume(0);
    }
}
