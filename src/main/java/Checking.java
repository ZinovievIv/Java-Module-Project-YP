import java.util.Scanner;

public class Checking {
    Scanner scanner = new Scanner(System.in);
    int inQuantityPeople;
    double priceProduct;

    public int afterCheck() {
        while (true) {
            if (checkInQuantityPeople() & moreOne()) {
                return inQuantityPeople;
            } else {
                moreOne();
            }
        }
    }


    public boolean checkInQuantityPeople() {

        while (true) {
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Ошибка ввода. Введите число:");
            } else {
                inQuantityPeople = scanner.nextInt();
                return true;
            }
        }
    }

    public boolean moreOne() {
        while (true) {
            if (inQuantityPeople > 1) {
                return true;
            } else {
                System.out.println("Введите число больше 1");
                checkInQuantityPeople();
            }
        }
    }


    public double finishCheckPriceProduct () {

        while (true) {
            if (checkPriceProduct() & moreZero()) {
                return priceProduct;
            } else {
                moreZero();
            }
        }
    }


    public boolean checkPriceProduct() {

        while (true) {
            if (!scanner.hasNextDouble()) {
                scanner.nextLine();
                System.out.println("Ошибка ввода. Введите число:");
            } else {
                priceProduct = scanner.nextDouble();
                return true;
            }
        }
    }

    public boolean moreZero() {
        while (true) {
            if(priceProduct > 0) {
                return true;
            } else {
                System.out.println("Сумма продуктов должна быть больше 0");
                checkPriceProduct();
            }

        }
    }
}
