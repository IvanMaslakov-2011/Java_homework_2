import java.util.Scanner;

public class Seventh {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число: ");
        double a = sc.nextDouble();
        System.out.println("Введіть друге число: ");
        double b = sc.nextDouble();
        System.out.println("Введіть дію: (+, -, *, /)");
        String act = sc.next();

        if (a != 0 && b != 0) {
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
                    System.out.println("Результат: " + (a / b));
                    break;
                default:
            }
        } else if (act.equals("/")  && (a == 0 || b == 0) ){
            System.out.println("Ділення на нуль!");
        }
    }
}

