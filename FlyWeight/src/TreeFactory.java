import java.util.ArrayList;

public class TreeFactory {
    private static ArrayList<TreeType> treeTypes= new ArrayList<>();

    public static TreeType getTreeType(String name, String color, String size){
        for(TreeType type: treeTypes){
            if(type.getName().equals(name) && type.getSize().equals(size) && type.getColor().equals(color)){
                return type;
            }
        }
        TreeType newType= new TreeType(color, size, name);
        treeTypes.add(newType);
        return newType;
    }

}
