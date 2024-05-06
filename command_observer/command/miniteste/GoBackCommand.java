package command_observer.command.miniteste;
//Concrete Command

public class GoBackCommand implements Command{

    private Receiver receiver;

    public GoBackCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.goBack();
    }
}
