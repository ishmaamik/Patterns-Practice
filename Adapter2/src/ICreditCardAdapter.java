public class ICreditCardAdapter implements IPaymentAdapter{
    private CreditCard creditCard= new CreditCard();
    private int cost;

    public ICreditCardAdapter(int cost) {
        this.cost= cost;
    }

    @Override
    public double processPayment() {
        return creditCard.pay(cost);
    }
}
