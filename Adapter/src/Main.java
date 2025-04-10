//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RoundHole r1= new RoundHole(50);
        RoundPeg r2= new RoundPeg(30);
        System.out.println(r1.fits(r2));
        SquarePeg squarePeg= new SquarePeg(70);
        ISquareAdapter sqrAdapter= new ISquareAdapter(squarePeg);
        System.out.println(r1.fits(sqrAdapter));
        TrianglePeg trianglePeg= new TrianglePeg(174);
        ITriangleAdapter triangleAdapter= new ITriangleAdapter(trianglePeg);
        System.out.println(r1.fits(triangleAdapter));
    }
}