public class SMSDecorator implements INotifier{

    @Override
    public void sendNotification() {
        System.out.println("SMS Notified!");
    }
}
