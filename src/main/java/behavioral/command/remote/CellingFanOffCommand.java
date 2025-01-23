package behavioral.command.remote;

public class CellingFanOffCommand implements Command {

    CellingFan cellingFan;
    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }

    @Override
    public void undo() {
        cellingFan.off();
    }
}
