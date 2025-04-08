public class Square extends ShapeAsClass{

    public Square(Square r1) {
        super();
        this.length= r1.length;
        this.width= r1.width;
    }
    public Square(){

    }
    public ShapeAsClass clone() {
        return new Square(this);
    }
}
