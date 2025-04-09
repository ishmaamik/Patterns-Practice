import java.util.ArrayList;

public class Forest {
    private ArrayList<Tree> treeList= new ArrayList<>();

    public void plantTree(int x, int y, TreeType ty){
        TreeType type= TreeFactory.getTreeType(ty.getName(), ty.getColor(), ty.getSize());
        Tree tree= new Tree(type, x, y);
        treeList.add(tree);
    }

    public void canvas(){
        for(Tree tree: treeList){
            tree.move(tree.getX(), tree.getY());
        }
    }
}
