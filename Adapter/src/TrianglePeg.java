public class TrianglePeg {
    double sidelength; //equilateral triangle

    public TrianglePeg(int sidelength) {
        this.sidelength=sidelength;
    }

    public double getSidelength(){
        return sidelength;
    }

    public void setSidelength(int sidelength){
        this.sidelength= sidelength;
    }
}
