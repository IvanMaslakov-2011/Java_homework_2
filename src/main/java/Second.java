import java.util.Scanner;

public class Second {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        boolean isAgeDefined = false;

        while (!isAgeDefined) {

            System.out.println("Введіть ваш вік:");
            int age = sc.nextInt();

            if (age >= 0 && age <= 6 )  {
                System.out.println("Ви дитина!");
                isAgeDefined = true;
            } else if (age >= 7 && age <= 17) {
                System.out.println("Ви підліток!");
                isAgeDefined = true;
            } else if (age > 17 && age <= 59) {
                System.out.println("Ви дорослий!");
                isAgeDefined = true;
            } else if (age >= 60) {
                System.out.println("Ви пенсіонер!");
                isAgeDefined = true;
            } else {
                System.out.println("Введіть коректне значення!");
            }
        }
    }
}
