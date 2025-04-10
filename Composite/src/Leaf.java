public class Leaf implements IBox{
    private double weight;

    public Leaf(double weight) {
        this.weight= weight;
    }
    @Override
    public double calculateWeight() {
        return weight;
    }
}
