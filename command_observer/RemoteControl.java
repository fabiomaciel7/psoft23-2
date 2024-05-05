package command_observer;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class RemoteControl {
    private List<Command> history = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        history.add(command);
    }
}