import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarFactory cf= new CarFactory();
        Scanner scanner = new Scanner(System.in);

        String s1= scanner.nextLine();
        IVehicle s2= cf.createVehicle(s1);
        s2.drive();

    }
}