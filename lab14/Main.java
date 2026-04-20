import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1 - Сумма от 1 до N");
            System.out.println("2 - Количество цифр");
            System.out.println("3 - Таблица умножения");
            System.out.println("4 - Максимальная цифра");
            System.out.println("5 - Палиндром");
            System.out.println("6 - Количество чётных цифр");
            System.out.println("7 - Случайные числа до 0");
            System.out.println("8 - Сумма до 0");
            System.out.println("9 - Проверка пароля");
            System.out.println("10 - Минимальное число");
            System.out.println("0 - Выход");
            System.out.print("Выбери задачу: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int n, i = 1, sum = 0;
                    System.out.print("Введите N: ");
                    n = sc.nextInt();

                    do {
                        sum += i;
                        i++;
                    } while (i <= n);

                    System.out.println("Сумма: " + sum);
                    break;

                case 2:
                    int num, count = 0;
                    System.out.print("Введите число: ");
                    num = sc.nextInt();

                    do {
                        count++;
                        num /= 10;
                    } while (num != 0);

                    System.out.println("Количество цифр: " + count);
                    break;

                case 3:
                    System.out.print("Введите число: ");
                    int m = sc.nextInt();
                    int j = 1;

                    do {
                        System.out.println(m + " * " + j + " = " + (m * j));
                        j++;
                    } while (j <= 10);
                    break;

                case 4:
                    System.out.print("Введите число: ");
                    int number = sc.nextInt();
                    int max = 0;

                    do {
                        int digit = number % 10;
                        if (digit > max) max = digit;
                        number /= 10;
                    } while (number > 0);

                    System.out.println("Максимальная цифра: " + max);
                    break;

                case 5:
                    System.out.print("Введите число: ");
                    int original = sc.nextInt();
                    int temp = original;
                    int reversed = 0;

                    do {
                        reversed = reversed * 10 + temp % 10;
                        temp /= 10;
                    } while (temp > 0);

                    if (original == reversed)
                        System.out.println("Палиндром");
                    else
                        System.out.println("Не палиндром");
                    break;

                case 6:
                    System.out.print("Введите число: ");
                    int num6 = sc.nextInt();
                    int evenCount = 0;

                    do {
                        int digit = num6 % 10;
                        if (digit % 2 == 0) evenCount++;
                        num6 /= 10;
                    } while (num6 > 0);

                    System.out.println("Чётных цифр: " + evenCount);
                    break;

                case 7:
                    int rand;
                    do {
                        rand = (int)(Math.random() * 10);
                        System.out.println(rand);
                    } while (rand != 0);
                    System.out.println("Выпал 0");
                    break;

                case 8:
                    int input, total = 0;
                    do {
                        System.out.print("Введите число (0 - стоп): ");
                        input = sc.nextInt();
                        total += input;
                    } while (input != 0);

                    System.out.println("Сумма: " + total);
                    break;

                case 9:
                    sc.nextLine(); // очистка буфера
                    String password;
                    do {
                        System.out.print("Введите пароль (мин 6 символов): ");
                        password = sc.nextLine();
                    } while (password.length() < 6);

                    System.out.println("Пароль принят");
                    break;

                case 10:
                    int val;
                    int min = Integer.MAX_VALUE;

                    do {
                        System.out.print("Введите число (0 - стоп): ");
                        val = sc.nextInt();

                        if (val != 0 && val < min) {
                            min = val;
                        }

                    } while (val != 0);

                    System.out.println("Минимальное число: " + min);
                    break;

                case 0:
                    System.out.println("Выход...");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }

        } while (choice != 0);
    }
}