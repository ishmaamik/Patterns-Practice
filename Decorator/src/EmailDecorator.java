public class EmailDecorator extends BaseDecorator{
    INotifier notifier;

    public EmailDecorator(INotifier notifier) {
        super(notifier);
    }
    @Override
    public void sendNotification() {
        super.sendNotification();
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Email sent");
    }
}
