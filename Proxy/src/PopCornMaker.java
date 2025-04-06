public class PopCornMaker {

    public String flavor;

    public void makePopcorn(String flavor){
        System.out.println(flavor+ " Popcorn created ");
    }

    public void caramel(){
        this.flavor= "Caramel";
        makePopcorn(flavor);
    }

    public void salt(){
        this.flavor= "Salty";
        makePopcorn(flavor);
    }
}
