package command_observer;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        CommandLogger logger = new FileCommandLogger();

        Command lightOnCommand = new LightOnCommand(light, logger);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.executeCommand(lightOnCommand); // Saída: Luz ligada. Comando registrado em arquivo: Luz ligada
    }
}
