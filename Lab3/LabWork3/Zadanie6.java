import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double x = scanner.nextDouble();

        double square = x * x;
        double cube = x * x * x;

        System.out.println("Квадрат числа: " + square);
        System.out.println("Куб числа: " + cube);
    }
}
