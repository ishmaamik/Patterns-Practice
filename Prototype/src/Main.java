public class Main {
    public static void main(String[] args) {
        Square s1= new Square();
        s1.setWidth(50);
        s1.setLength(70);
        ShapeAsClass s2= s1.clone();
        System.out.println(s2.getArea());  //outputs same as s1
        Circle c1= new Circle();
        c1.radius=25;
        Circle c2= (Circle) c1.clone(); //Java requires explicit casting for broader/general type to narrower
        ShapeAsInterface c3= (Circle) c1.clone();
        System.out.println(c2.getArea());
    }
}