package behavioral.command.remote;

public class CellingFanLowCommand implements Command {

    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanLowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.low();
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
