 import java.util.Scanner;

public class Third {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        int a = sc.nextInt();

        System.out.println("Введіть друге число:");
        int b = sc.nextInt();

        System.out.println("Введіть третє число:");
        int c = sc.nextInt();

        boolean isDefined = false;

        while (!isDefined) {
            if (a == b && b == c) {
                System.out.println("Всі числа рівні!");
                isDefined = true;
            } else if (a == b) {
                System.out.println("Перше та друге число рівні: " + a + " = " + b);
                if (a > c) {
                    System.out.println("І вони найбільші числа");
                } else {
                    System.out.println("Але трєтє число найбільше " + c + " > " + a);
                }
                isDefined = true;
            } else if (a == c) {
                System.out.println("Перше та третє число рівні: " + a + " = " + c);
                if (a > b) {
                    System.out.println("І вони найбільші числа");
                } else {
                    System.out.println("Але друге число найбільше " + b + " > " + a);
                }
                isDefined = true;
            } else if (b == c) {
                System.out.println("Друге та третє число рівні: " + b + " = " + c);
                if (b > a) {
                    System.out.println("І вони найбільші числа");
                } else {
                    System.out.println("Але перше число найбільше " + a + " > " + b);
                }
                isDefined = true;
            } else if (a > b && a > c) {
                System.out.println("Перше число найбільше!");
                isDefined = true;
            } else if (b > a && b > c) {
                System.out.println("Друге число найбільше!");
                isDefined = true;
            } else if (c > a && c > b) {
                System.out.println("Третє число найбільше!");
                isDefined = true;
            }
        }
    }
}


