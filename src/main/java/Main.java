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
                products = products + "\n - " + product;
                inprices = inprices + inprice;
            }
        }
        System.out.println("Добавленные товары:" + products + "\nНа сумму: "
                + Format.format(inprices) + Money.money(inprices));
        System.out.print("Выходит по " + (Format.format(Calculator.calculate(inprices, quantityPeople)))
                + (Money.money(Calculator.calculate(inprices, quantityPeople))) +  " на человека.");



    }
}


class Calculator { //Производим вычисление суммы на человека
    public static double calculate(double a, double b) {
        double i = (a / b);
        return i;
    }
}

class Format { //Округляем значение до 2-х знаков после запятой

    public static String format (double i) {
        String s = String.format("%.2f", i);
        return s;
    }
}

class Money { //Вычисляем по модулю окончание для "рублей"

    public static String money(double i) {
        int money = (int)(i);
        String s = "";
        int LastNumber = money % 100 / 10;
        if (LastNumber == 1) {
            return " рублей";
        }
        switch (money % 10) {
            case 1:
                return " рубль";
            case 2:
            case 3:
            case 4:
                return " рубля";
            default:
                return " рублей";
        }

    }
}
