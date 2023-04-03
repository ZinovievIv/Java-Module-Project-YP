// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String products = "";
        String product = "";
        double inprices = 0;
        double inprice = 0;

        Checking quantityPeople = new Checking();

        products = products + product;
        inprices = inprices + inprice;


        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счет?");


        int i = quantityPeople.afterCheck();


        while (true) {
            System.out.println("Введите наименование товара или введите 'Завершить' для подсчета:");
            product = scanner.next();
            if (product.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                System.out.println("Введите сумму товара (рубли,копейки):");
                inprice = scanner.nextDouble();
                System.out.println("Товар успешно добавлен");
                products = products + "\n" + product;
                inprices = inprices + inprice;
            }
        }
        System.out.println("Добавленные товары:" + products);
        System.out.println("Выходит по " + Ending.rounding(Calculator.calculate(inprices, i)) + " рубля" +  " на человека.");


    }
}


class Calculator {
    public static double calculate(double a, double b) {
        double i = (a / b);
        String.format("%2f", i);
        return i;
    }
}


class Ending {

    public static double rounding(double i) {
        double c = Math.floor(i);
        return c;
    }
}
