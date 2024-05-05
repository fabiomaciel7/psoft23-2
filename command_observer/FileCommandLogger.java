package command_observer;

// Concrete Observer
public class FileCommandLogger implements CommandLogger {
    public void logCommand(String command) {
        // Lógica para registrar o comando em um arquivo
        System.out.println("Comando registrado em arquivo: " + command);
    }
}
