import java.util.Scanner;

public class Ninth {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введіть ваш логін: ");
        String login = sc.next();

        System.out.println("Введіть ваш вік: ");
        int age = sc.nextInt();
        
        if (login.equals("admin") && age >= 18){
            System.out.println("Ласкаво просимо, адміністраторе!");
        } else if (login.equals("admin") && age < 18) {
            System.out.println("Доступ забороненно: замалий вік!");
        } else {
            System.out.println("Невірний логін!");
        }
    }
}
