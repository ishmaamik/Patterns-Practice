import java.util.ArrayList;

public class Product {
    private ArrayList<Subscribe> subsList= new ArrayList<>();

    public void addSubscriber(Subscribe sub){
        subsList.add(sub);
    }

    public void removeSubscriber(Subscribe s){
        subsList.remove(s);
    }

    public void sendNotification(String notification){
        for(Subscribe sub: subsList){
            sub.getNotification(notification);
        }
    }
}
