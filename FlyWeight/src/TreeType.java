public class TreeType {
    String color;
    String size;
    String name;

    public TreeType(String color, String size, String name){
        this.name= name;
        this.color= color;
        this.size=size;
    }

    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }

    public void move(Integer x, Integer y){
        System.out.println(this.name+" is at "+x+","+y+" coordinates");
        //draw method here because the drawing logic is same
        //even though coordinates different
    }
}
