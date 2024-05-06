package command_observer.command.miniteste;
//Invoker

public class Radio {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
