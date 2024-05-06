package command_observer.command.miniteste;
//Concrete Command

public class GoForwardCommand implements Command{

        
    private Receiver receiver;
    
        
    public GoForwardCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.goForward();
    }
}
