import java.util.HashMap;

public class Preference {
    private static Preference instance;
    private HashMap<String, String> preferences;

    private Preference(){
        preferences= new HashMap<>();
    }

    public void setPreference(String user, String volume){
        preferences.put(user, volume);
    }
    public String getPreference(String user){
        return preferences.get(user);
    }

    public static Preference getInstance(){
        if(instance==null){
            instance= new Preference();
        }
        return instance;
    }
}
