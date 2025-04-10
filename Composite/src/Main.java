//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LeafBox lb= new LeafBox();
        Leaf l1= new Leaf(5);
        Leaf l2= new Leaf(4);
        Leaf l3= new Leaf(3);
        LeafBox lb2= new LeafBox();
        lb.addLeaf(l1);
        lb.addLeaf(l2);
        lb.addLeaf(l3);
        Leaf l4= new Leaf(45);
        lb2.addLeaf(l4);
        lb2.addLeaf(lb);
        System.out.println(lb2.calculateWeight());
        System.out.println(lb.calculateWeight());
    }
}