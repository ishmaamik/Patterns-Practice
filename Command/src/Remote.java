public class Remote implements Command{
    private Command command;

    public Remote(Command command) {
        this.command= command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}
