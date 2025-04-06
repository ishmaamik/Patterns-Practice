public class Main {
    public static void main(String[] args) {

        //See how our client doesn't even need to work
        //with so many classes=> light, movie, popcorn!!
        //Just one simple class with its simple methods!

        HomeTheatre homeTheatre= new HomeTheatre("Salt", "Avengers");
        homeTheatre.start();
        homeTheatre.caramelPopcorn();
        homeTheatre.dimLight();
        homeTheatre.changeMovie("Endgame");
    }
}
