public class Seller implements Subscribe{
    private Product product;
    private String name;

    public Seller(String name) {
        this.name= name;
    }

    public void subscribe(Product product) {
        this.product= product;
        product.addSubscriber(this);
    }
    public void getNotification(String message){
        System.out.println("Dear "+this.name+", New notification: "+message);
    }
}
