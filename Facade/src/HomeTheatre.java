public class HomeTheatre {
    String popcorn;
    String movie;

    public HomeTheatre(String popcorn, String movie) {
        this.popcorn= popcorn;
        this.movie= movie;
    }
    DVDPlayer dvdplayer= new DVDPlayer();
    Light light= new Light();
    Tv tv= new Tv();
    PopCornMaker popcornMaker= new PopCornMaker();

    public void start(){
        dvdplayer.playMovie(movie);
        light.turnOn();
        tv.turnOn();
        popcornMaker.makePopcorn(popcorn);
    }

    public void dimLight(){
        light.dimLight();
    }

    public void caramelPopcorn(){
        popcornMaker.caramel();
    }

    public void changeMovie(String movie){
        dvdplayer.playMovie(movie);
    }
}
