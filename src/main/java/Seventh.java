import java.util.Scanner;

public class Seventh {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        double a = sc.nextDouble();
        System.out.println("Введіть друге число: ");
        double b = sc.nextDouble();
        System.out.println("Введіть дію: (+, -, *, /)");
        String act = sc.next();

        switch (act) {
                case "+":
                    System.out.println("Результат: " + (a + b));
                    break;
                case "-":
                    System.out.println("Результат: " + (a - b));
                    break;
                case "*":
                    System.out.println("Результат: " + (a * b));
                    break;
                case "/":
                    if (a != 0 && b != 0) {
                        System.out.println("Результат: " + (a / b));
                    } else {
                        System.out.println("Ділення на нуль!");
                    }
                    break;
            }
        }

    }