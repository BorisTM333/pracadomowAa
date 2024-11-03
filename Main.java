import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Imię: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String firstName = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();

        System.out.print("Podaj wiek: ");
        int age = scanner.nextInt();

        Person person = new Person(firstName, lastName, age);

        System.out.println("\nDane wprowadzonej osoby:");
        person.displayInfo();

        scanner.close();
    }
}