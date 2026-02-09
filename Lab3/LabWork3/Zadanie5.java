import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость: ");
        double v = scanner.nextDouble();

        System.out.print("Введите время: ");
        double t = scanner.nextDouble();

        double s = v * t;

        System.out.println("Расстояние: " + s);
    }
}
