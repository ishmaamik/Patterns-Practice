public class MessengerDecorator extends BaseDecorator{

    public MessengerDecorator(INotifier notifier) {
        super(notifier);
    }
    @Override
    public void sendNotification() {
        super.sendNotification();
        sendMessenger();
    }

    public void sendMessenger(){
        System.out.println("Messenger message sent");
    }
}
