public class Main {
    public static void main(String[] args) {
        Square s1= new Square();
        s1.setWidth(50);
        s1.setLength(70);
        ShapeAsClass s2= s1.clone();
        System.out.println(s2.getArea());  //outputs same as s1
    }
}