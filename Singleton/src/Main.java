//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Database db= Database.getInstance();
        Connection connect;
        System.out.println(db.getConnection());

    }
}