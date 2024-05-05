package command_observer;

// Concrete Command
public class LightOnCommand implements Command {
    private Light light;
    private CommandLogger logger;

    public LightOnCommand(Light light, CommandLogger logger) {
        this.light = light;
        this.logger = logger;
    }

    public void execute() {
        light.turnOn();
        logger.logCommand("Luz ligada");
    }

}
