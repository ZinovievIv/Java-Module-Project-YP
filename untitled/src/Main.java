import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Введите Пол");
        String pol = scanner.next();

        if (age >= 18) {
            Adult person1 = new Adult(name, age, pol);
            System.out.println("Создан пол " + pol + " Имя = " + name + " Возраст = " + age);
            person1.action();
        } else {
            Сhild person2 = new Сhild(name, age, pol);
            System.out.println("Создан пол " + pol + " Имя = " + name + " Возраст = " + age);
            person2.action();
        }
    }
}


