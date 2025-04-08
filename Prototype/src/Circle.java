public class Circle implements ShapeAsInterface{
    protected int radius;

    public Circle(){

    }

    public Circle(Circle c1){
        super();
        this.radius= c1.radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
    @Override
    public ShapeAsInterface clone() {
        return new Circle(this);
    }
}
