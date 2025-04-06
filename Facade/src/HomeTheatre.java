public class HomeTheatre {
    String flavor;
    String movie;

    public HomeTheatre(String flavor, String movie) {
        this.flavor= flavor;
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
        popcornMaker.makePopcorn(flavor);
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
