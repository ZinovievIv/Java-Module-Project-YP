import java.util.Scanner;

public class Checking {
    Scanner scanner = new Scanner(System.in);
    int inQuantityPeople;
    double priceProduct;

    public int afterCheck() {
        //Окончательная проверка по двум методам,
        // если обе проверки возвращают true, то возвращаем проверенное значение
        while (true) {
            if (checkInQuantityPeople() & moreOne()) {
                return inQuantityPeople;
            } else {
                moreOne();
            }
        }
    }


    public boolean checkInQuantityPeople() {
        //Метод для проверки вводимого количества человек на int
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
        //Метод для проверки вводимого числа, чтобы оно было больше 1
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
        //Окончательная проверка вводимой суммы продукта по двум методам
        //Если оба метода возвращают true, то отдаем проверенное значение
        while (true) {
            if (checkPriceProduct() & moreZero()) {
                return priceProduct;
            } else {
                moreZero();
            }
        }
    }


    public boolean checkPriceProduct() {
        //Метод для проверки вводимого значение цены продукта
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
        //Метод для проверки вводимого значения продукта, чтобы оно было больше 0
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
