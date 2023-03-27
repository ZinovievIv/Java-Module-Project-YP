// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inPeople = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счет?");
        int quantityPeople = inPeople.nextInt();
        while (quantityPeople <= 1) {
            System.out.println("Число должно быть больше 1, введите еще раз:");
            quantityPeople = inPeople.nextInt();
            if (quantityPeople > 1)
                break;
        }

        Scanner product = new Scanner(System.in);
        Scanner price = new Scanner(System.in);

        String products = products + " " + product;

        while (true) {
            System.out.println("Введите наименование товара:");
            String inproduct = product.next();
            if (inproduct.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                System.out.println("Введите сумму товара (рубли.копейки):");
                double inprice = price.nextFloat();
                String line = line + inproduct;
                System.out.println("Товар успешно добавлен");
                System.out.println(inproduct);
            }
        }

    }
}
