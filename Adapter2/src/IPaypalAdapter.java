public class IPaypalAdapter implements IPaymentAdapter{
    private Paypal pp= new Paypal();
    private int cost;

    public IPaypalAdapter(int cost) {
        this.cost= cost;
    }
    @Override
    public double processPayment() {
        return pp.pay(cost);
    }
}
