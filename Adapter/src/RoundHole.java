public class RoundHole {
    private double radius;
    public RoundHole(int radius) {
        this.radius= radius;
    }

    public double getRadius(){
        return radius;
    }

    public boolean fits(RoundPeg peg){
        return this.getRadius()>=peg.getRadius();
    }
}
