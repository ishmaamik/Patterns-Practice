public class HomeTheatre {

    DVDPlayer dvdplayer= new DVDPlayer();
    Light light= new Light();
    Tv tv= new Tv();
    PopCornMaker popcorn= new PopCornMaker();

    public void start(){
        dvdplayer.playMovie("Avengers");
        light.turnOn();
        tv.turnOn();
        popcorn.makePopcorn();
    }
}
