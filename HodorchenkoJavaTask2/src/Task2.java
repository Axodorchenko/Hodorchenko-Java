import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in, "Cp866");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println(name);
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("нет такого имени");
        }
    }
}