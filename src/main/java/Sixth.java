import java.util.Scanner;

public class Sixth {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        boolean dayDefined = false;

        while (!dayDefined) {
            System.out.println("Введіть номер дня тижня: ");

            int dayNum = sc.nextInt();
            if (dayNum <= 12 && dayNum > 0) {
                switch (dayNum) {
                    case 1:
                        System.out.println("Понеділок!");
                        dayDefined = true;
                        break;
                    case 2:
                        System.out.println("Вівторок!");
                        dayDefined = true;
                        break;
                    case 3:
                        System.out.println("Середа!");
                        dayDefined = true;
                        break;
                    case 4:
                        System.out.println("Четвер!");
                        dayDefined = true;
                        break;
                    case 5:
                        System.out.println("П'ятниця!");
                        dayDefined = true;
                        break;
                    case 6:
                        System.out.println("Субота! Можна відпочити!");
                        dayDefined = true;
                        break;
                    case 7:
                        System.out.println("Неділя! Можна відпочити!");
                        dayDefined = true;
                        break;
                }
            } else {
                System.out.println("Введіть коректний номер у діапазоні 1-7!");
            }
        }
    }
}
