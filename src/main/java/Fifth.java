import java.util.Scanner;

public class Fifth {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        boolean monthDefined = false;

        while (!monthDefined){
            System.out.println("Введіть номер місяця (1-12): ");

            int monthNum = sc.nextInt();

            if (monthNum <= 12) {
                switch (monthNum) {
                    case 1:
                        System.out.println("Січень!");
                        monthDefined = true;
                        break;
                    case 2:
                        System.out.println("Лютий!");
                        monthDefined = true;
                        break;
                    case 3:
                        System.out.println("Березень!");
                        monthDefined = true;
                        break;
                    case 4:
                        System.out.println("Квітень!");
                        monthDefined = true;
                        break;
                    case 5:
                        System.out.println("Травень!");
                        monthDefined = true;
                        break;
                    case 6:
                        System.out.println("Червень!");
                        monthDefined = true;
                        break;
                    case 7:
                        System.out.println("Липень!");
                        monthDefined = true;
                        break;
                    case 8:
                        System.out.println("Серпень!");
                        monthDefined = true;
                        break;
                    case 9:
                        System.out.println("Вересень!");
                        monthDefined = true;
                        break;
                    case 10:
                        System.out.println("Жовтень!");
                        monthDefined = true;
                        break;
                    case 11:
                        System.out.println("Листопад!");
                        monthDefined = true;
                        break;
                    case 12:
                        System.out.println("Грудень!");
                        monthDefined = true;
                        break;
                }
                } else {
                    System.out.println("Введіть коректний номер у діапазоні від 0 до 12!");
                }
        }
    }
}
