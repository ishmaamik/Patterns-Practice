public class BaseDecorator {
    INotifier notifier;
    public BaseDecorator(INotifier notifier){
        this.notifier= notifier;
    }

    public BaseDecorator() {

    }

    public void sendNotification(){
        notifier.sendNotification();
    }
}
