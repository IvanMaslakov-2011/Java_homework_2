import java.util.Scanner;

public class Fourth {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть суму покупки: ");

        double purchaseSum = sc.nextInt();
        double discount;
        double discountSum = 0;

        if (purchaseSum <= 500){
            discount = 0;
        } else if (purchaseSum >= 500 && purchaseSum <= 999) {
            discount = 0.05;
            discountSum = purchaseSum * discount;
        } else if (purchaseSum >= 1000 && purchaseSum <= 1999) {
            discount = 0.1;
            discountSum = purchaseSum * discount;
        } else if (purchaseSum >= 2000 ) {
            discount = 0.15;
            discountSum = purchaseSum * discount;
        }

        double finalSum = (purchaseSum - discountSum) ;

        System.out.println("Фінальна ціна до сплати: " + finalSum + ". " + "Сума знижки: " + discountSum + ".");
    }
}
