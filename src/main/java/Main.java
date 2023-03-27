// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String products = "";
        String product = "";
        float inprices = 0;
        float inprice = 0;

        products = products + product;
        inprices = inprices + inprice;


        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счет?");
        int quantityPeople = scanner.nextInt();
        while (quantityPeople <= 1) {
            System.out.println("Число должно быть больше 1, введите еще раз:");
            quantityPeople = scanner.nextInt();
            if (quantityPeople > 1)
                break;
        }

        while (true) {
            System.out.println("Введите наименование товара:");
            product = scanner.next();
            if (product.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                System.out.println("Введите сумму товара (рубли.копейки):");
                inprice = scanner.nextFloat();
                System.out.println("Товар успешно добавлен");
                products = products + "\n" + product;
                inprices = inprices + inprice;
            }
        }
        System.out.println("Добавленные товары:" + products);
        System.out.println(inprices);
    }
}

class Calculator {

    public static int calculate (int a, int b) {
        int i = a / b ;
        return i;
    }
}