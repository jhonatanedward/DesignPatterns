package behavioral.command.remote;

public class CellingFanMediumCommand implements Command {

    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanMediumCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.medium();
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
