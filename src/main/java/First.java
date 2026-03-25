import java.util.Scanner;

public class First {
   public static void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введіть будь-яке ціле число:");
    int number = sc.nextInt();

    if (number > 0){
        System.out.println("Позитивне!");
    } else if (number == 0) {
        System.out.println("Нуль!");
    } else {
        System.out.println("Негативне!");
    }
   }
}
