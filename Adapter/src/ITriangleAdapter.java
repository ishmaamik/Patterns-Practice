public class ITriangleAdapter extends RoundPeg{
    private TrianglePeg tpeg;

    public ITriangleAdapter(TrianglePeg tpeg) {
        super(0);
        this.tpeg= tpeg;
    }

    @Override
    public double getRadius() {
        return tpeg.getSidelength() * Math.sqrt(3)/6;
    }
}
