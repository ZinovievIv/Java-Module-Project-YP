// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Checking checkQuantityPeople = new Checking();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String products = "";
        String product = "";
        double inprices = 0;
        double inprice = 0;
        products = products + product;
        inprices = inprices + inprice;

        System.out.println("На сколько человек необходимо разделить счет?");

        int quantityPeople = checkQuantityPeople.afterCheck();



        while (true) {
            System.out.println("Введите наименование товара или введите 'Завершить' для подсчета:");
            product = scanner.nextLine();
            if (product.equalsIgnoreCase("Завершить")) {
                break;
            } else {
                System.out.println("Введите сумму товара (рубли,копейки):");
                inprice = checkQuantityPeople.finishCheckPriceProduct();
                System.out.println("Товар успешно добавлен");
                products = products + "\n" + product;
                inprices = inprices + inprice;
            }
        }
        System.out.println("Добавленные товары:" + products + "\nНа сумму: " + inprices);
        System.out.print("Выходит по " + (Format.format(Calculator.calculate(inprices, quantityPeople))) + Money.money(inprice) +  " на человека.");
        System.out.print(Money.money(33));


    }
}


class Calculator {
    public static double calculate(double a, double b) {
        double i = (a / b);
        return i;
    }
}

class Format {

    public static String format (double i) {
        String s = String.format("%.2f", i);
        return s;
    }
}

class Ending {

    public static double rounding(String i) {
        double c = Double.parseDouble(i);
        double b =Math.floor(c);
        return b;
    }
}

class Money {

    public static String money(double money) {
        String i = "";
        double x = money % 100;
        double y = money % 10;
        if (x == 1 || y == 1) {
            i = " рубль";
        } else if (5 > x && x > 1 || y > 1 && y < 5) {
            i = " рубля";
        } else if (20 > x && x > 10 || y > 5 && y < 10) {
            i = " рублей";
        } else {
            i = " рублей";
        }
            return i;
    }
}
