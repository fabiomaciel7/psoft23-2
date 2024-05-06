package command_observer.command.miniteste;
public class Client {
    public static void main(String[] args){
        Receiver receiver = new Receiver();

        Command playCommand = new PlayCommand(receiver);
        Command stopCommand = new StopCommand(receiver);
        Command goForwardCommand = new GoForwardCommand(receiver);
        Command goBackCommand = new GoBackCommand(receiver);
        Radio radio = new Radio();
        radio.setCommand(playCommand);
        radio.executeCommand();
        radio.setCommand(stopCommand);
        radio.executeCommand();
        radio.setCommand(goBackCommand);
        radio.executeCommand();
        radio.setCommand(goForwardCommand);
        radio.executeCommand();

    }
}
