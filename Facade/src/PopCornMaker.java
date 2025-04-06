public class PopCornMaker {

    public String popcorn;

    public void makePopcorn(String popcorn){
        System.out.println(popcorn+ " Popcorn created ");
    }

    public void caramel(){
        this.popcorn= "Caramel";
        makePopcorn(popcorn);
    }

    public void salt(){
        this.popcorn= "Salty";
        makePopcorn(popcorn);
    }
}
