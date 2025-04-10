import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StrategyFactory sf= new StrategyFactory();
        Context c1= new Context();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            // Read first and second numbers
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            // Read the desired action from the user
            System.out.print("Enter the operation (add, sub): ");
            String action = scanner.next();

            c1.setStrategy(sf.createStrategy(action));
            System.out.println(c1.execute(firstNumber, secondNumber));


        }
    }
}