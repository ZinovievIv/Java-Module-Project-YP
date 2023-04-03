import java.util.Scanner;

public class Checking {
    Scanner scanner = new Scanner(System.in);
    int inQuantityPeople;

    public int afterCheck() {
        while (true) {
            if (checkIn() & moreOne()) {
                return inQuantityPeople;
            } else {
                moreOne();
            }
        }
    }


    public boolean checkIn() {

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
                checkIn();
            }
        }
    }
}

