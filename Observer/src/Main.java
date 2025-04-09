public class Main {
    public static void main(String[] args) {
        Product p1= new Product();
        Customer c1= new Customer("Ishu");
        Customer c2= new Customer("Jony");
        c1.subscribe(p1);
        c2.subscribe(p1);
        p1.sendNotification("New product available!");
        Seller s1= new Seller("Ashwin");
        s1.subscribe(p1);
        p1.sendNotification("New Watch Available!");
        c1.unsubscribe(p1);
        p1.sendNotification("New Belt available!");
    }
}