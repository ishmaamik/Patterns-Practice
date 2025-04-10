public class Context {
    IStrategy IStrategy;

    public void setStrategy(IStrategy IStrategy) {
        this.IStrategy=IStrategy;
    }

    public double execute(int a, int b){
        return IStrategy.execute(a, b);
    }
}
