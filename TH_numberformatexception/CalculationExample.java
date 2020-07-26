package TH_numberformatexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        CalculationExample calc = new CalculationExample();
        try {
            calc.Calculate();
        }
        catch (InputMismatchException ex){
            System.out.println("Exception : Wrong data input");
        } finally {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter y: ");
                int y = scanner.nextInt();
            }
            catch (InputMismatchException ex) {
                System.out.println("Exception : wrong data input");
            }
        }

    }

    private void Calculate() throws InputMismatchException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x : ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        Cal(x, y);
    }

    private void Cal(int x, int y) {
        try {
            int sum = x + y;
            int sub = x - y;
            int multi = x * y;
            int div = x / y;
            System.out.println(" x + y = " + sum);
            System.out.println(" x - y = " + sub);
            System.out.println(" x * y = " + multi);
            System.out.println(" x / y = " + div);
        } catch (ArithmeticException ex){
            System.out.println("Exception : " + ex.getMessage());
        }
    }
}
