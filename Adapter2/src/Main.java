//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cost= 300;
        IPaypalAdapter pp= new IPaypalAdapter(cost);
        System.out.println(pp.processPayment());
        ICreditCardAdapter cc= new ICreditCardAdapter(cost);
        System.out.println(cc.processPayment());
    }
}