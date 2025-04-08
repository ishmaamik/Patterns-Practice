public class Rectangle extends ShapeAsClass{

    public Rectangle(Rectangle r1) {
        super();
        this.length=length;
        this.width=width;
    }
    public Rectangle(){

    }
    @Override
    public ShapeAsClass clone() {
        return new Rectangle(this);
    }
}
