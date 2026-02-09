import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double a = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double b = scanner.nextDouble();

        double area = a * b;
        double perimeter = 2 * (a + b);

        System.out.println("Площадь: " + area);
        System.out.println("Периметр: " + perimeter);
    }
}
