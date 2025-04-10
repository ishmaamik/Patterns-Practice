public class ISquareAdapter extends RoundPeg{
    SquarePeg sqrpeg;

    public ISquareAdapter(SquarePeg sqrpeg) {
        super(0);
        this.sqrpeg= sqrpeg;
    }

    @Override
    public double getRadius() {
        return sqrpeg.getWidth() * Math.sqrt(2)/2;
    }
}
