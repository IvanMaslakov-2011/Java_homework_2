import java.util.Scanner;

public class Eighth {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        boolean isNameCorrect = false;

        while (!isNameCorrect) {

            System.out.println("Введіть ваше ім'я: ");
            String name = sc.next();

            if (name.isEmpty()) {
                System.out.println("Ім'я не може бути порожнім!");
            } else if (name.length() <= 2) {
                System.out.println("Ім'я занадто коротке!");
            } else if (name.length() >= 15) {
                System.out.println("Ім'я занадто довге!");
            } else {
                System.out.println("Ім'я: " + name.toUpperCase() + ";" + " Довжина імені: " + name.length());
                isNameCorrect = true;
            }
    }
    }
}

