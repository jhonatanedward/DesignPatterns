package behavioral.command.remote;

public class CellingFanOnCommand implements Command {

    CellingFan cellingFan;
    int prevSpeed;
    public CellingFanOnCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CellingFan.HIGH) {
            cellingFan.high();
        }else if(prevSpeed == CellingFan.LOW) {
            cellingFan.low();
        }else if(prevSpeed == CellingFan.MEDIUM) {
            cellingFan.medium();
        }else if(prevSpeed == 0) {
            cellingFan.off();
        }
    }
}
