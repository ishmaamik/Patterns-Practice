public class Customer implements Subscribe{

    private String name;

    public Customer(String name) {
        this.name= name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void subscribe(Product product) {
        product.addSubscriber(this);
    }

    public void getNotification(String message){
        System.out.println("Dear "+this.name+", New notification: "+message);
    }
}
