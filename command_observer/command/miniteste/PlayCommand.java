package command_observer.command.miniteste;
//Concrete Command

public class PlayCommand implements Command {

    private Receiver receiver;

    public PlayCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.play();
    }
    
}
