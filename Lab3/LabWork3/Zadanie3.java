import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double r = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * r * r;

        System.out.println("Площадь круга: " + area);
    }
}
