public class SubStrategy implements IStrategy{
    @Override
    public double execute(int a, int b) {
        return a-b;
    }
}
