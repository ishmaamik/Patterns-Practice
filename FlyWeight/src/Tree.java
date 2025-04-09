public class Tree {
    TreeType type;
    Integer x;
    Integer y;

    public Tree(TreeType type, Integer x, Integer y) {
        this.x= x;
        this.y= y;
        this.type= type;
    }

    public void move(Integer x, Integer y){
        type.move(x,y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


}
