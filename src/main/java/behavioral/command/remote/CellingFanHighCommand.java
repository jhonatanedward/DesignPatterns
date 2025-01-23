package behavioral.command.remote;

public class CellingFanHighCommand implements Command {

    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
        System.out.println("High Speed selected !!");
    }

    @Override
    public void undo() {
        System.out.println("Turning back Speed...");
        if(prevSpeed == CellingFan.HIGH) {
            cellingFan.high();
        }else if(prevSpeed == CellingFan.LOW) {
            cellingFan.low();
        }else if(prevSpeed == CellingFan.MEDIUM) {
            cellingFan.medium();
        }else if(prevSpeed == 0) {
            cellingFan.off();
        }
        System.out.println("undo done, speed: " + cellingFan.getSpeed());
    }
}
