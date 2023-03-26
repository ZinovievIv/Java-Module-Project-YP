// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inPeople = new Scanner(System.in);
        Scanner chek = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счет?");
        int quantityPeople = inPeople.nextInt();
        System.out.println("Вы ввели - " + quantityPeople);
        while (quantityPeople <= 1) {
            System.out.println("Число должно быть больше 1, введите еще раз:");
            quantityPeople = inPeople.nextInt();
            if (quantityPeople > 1)
                break;
        }
        System.out.println("Введите сумму счета");
        double summa = chek.nextInt();
        double resultat = Calculate.calculater(summa, quantityPeople);
        System.out.println("Итого на человека:" + resultat);
    }
}