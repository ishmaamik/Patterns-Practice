import java.sql.SQLOutput;

public class ProxyTheatre implements TheatreInterface{
    private HomeTheatre theatre;
    private boolean isAuthorized;
    private String flavor;
    private String movie;
    public ProxyTheatre(boolean isAuthorized, String flavor, String movie) {
        this.isAuthorized= isAuthorized;
        this.flavor=flavor;
        this.movie= movie;
    }

    public void initializeRealTheatre(){
        if(isAuthorized==true){
            theatre= new HomeTheatre(flavor, movie);
        }
        else{
            System.out.println("Unauthorized User!");
        }
    }

    @Override
    public void start() {
        if(!isAuthorized){
            System.out.println("Access denied!");
        }

        if(theatre==null){
            theatre=new HomeTheatre(flavor, movie);

        }

        theatre.start();

    }

    public void changeMovie(String movie){
        if(!isAuthorized){
            System.out.println("Access denied!");
        }
        if(theatre==null){
            theatre= new HomeTheatre(flavor, movie);
        }

        theatre.changeMovie(movie);

    }

    @Override
    public void changePopcornFlavor(String flavor) {
        if(!isAuthorized){
            System.out.println("Access denied!");
        }
        if(theatre==null){
            theatre= new HomeTheatre(flavor, movie);
        }

            theatre.changePopcornFlavor(flavor);

    }

    @Override
    public void dimLight() {
        if(!isAuthorized){
            System.out.println("Access denied!");
        }
        if(theatre==null){
            theatre= new HomeTheatre(flavor, movie);
        }

        theatre.dimLight();

    }
}
