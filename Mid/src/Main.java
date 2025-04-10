//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void demo(){
        Preference p= Preference.getInstance();
        p.setPreference("Ishu", "high");
        System.out.println(p.getPreference("Ishu"));
    }

    public static void main(String[] args) {
            demo();
    }
}