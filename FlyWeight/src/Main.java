public class Main {
    public static void main(String[] args) {

        Forest f1= new Forest();
        TreeType t1= new TreeType("Yellow", "Big", "Oak");
        TreeFactory tf= new TreeFactory();
        f1.plantTree(25,31, t1);
        f1.canvas();
    }
}