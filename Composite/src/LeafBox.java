import java.util.ArrayList;

public class LeafBox implements IBox{
    ArrayList<IBox> LeafBox= new ArrayList<>();
    double weight=0;

    public void addLeaf(IBox box){
        LeafBox.add(box);
    }
    public void removeLeaf(IBox box){
        LeafBox.remove(box);
    }

    @Override
    public double calculateWeight() {
        weight=0;
        for(IBox i: LeafBox){
            weight+= i.calculateWeight();
        }
        return weight;
    }

}
