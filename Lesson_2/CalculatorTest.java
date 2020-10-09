import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String again = "yes";
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (again.equals("yes")) {
            System.out.print("Введите первое число: ");
            int firstNum = sc.nextInt();
            sc.nextLine();

            System.out.print("Введите знак математической операции: ");
            char operation = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Введите второе число: ");
            int secondNum = sc.nextInt();
            sc.nextLine();

            calculator.operation(firstNum, operation, secondNum);
            
            System.out.print("Хотите продолжить? [yes/no]: ");
            again = sc.nextLine();

            while (!again.equals("yes") && !again.equals("no")) {
                System.out.println("Некорректное значение");
                System.out.print("Хотите продолжить? [yes/no]: ");
                again = sc.nextLine();
            }
        }
    }
}