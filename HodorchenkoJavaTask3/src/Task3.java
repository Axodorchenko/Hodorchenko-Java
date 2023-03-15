import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int quantity = scanner.nextInt();
        System.out.println("Введите числа");
        ArrayList<Integer> list = new ArrayList<>();
        int numb;
        for (int a = 0; a < quantity; a++) {
            numb = scanner.nextInt();
            list.add(numb);
        }
        scanner.close();
        System.out.println("Числа, кратные 3:");
        for (int b : list) {
            if (b % 3 == 0) {
                System.out.println(b);
            }
        }
    }
}