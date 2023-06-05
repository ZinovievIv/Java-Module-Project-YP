public class Person {
    String name;
    int age;
    String pol;
    public Person(String name, int age, String pol) {
        this.name = name;
        this.age = age;
        this.pol = pol;
    }

    void action() {

    }
}


class Сhild extends Person {

    public Сhild(String name, int age, String pol) {
        super(name, age, pol);
    }
    @Override
    void action() {
        System.out.println("Играет");
    }
}

class Adult extends Person {

    public Adult(String name, int age, String pol) {
        super(name, age, pol);
    }
    @Override
    void action() {
        System.out.println("Работает");
    }
}
