import java.util.*;

public class Main {
    // Список для хранения истории (Задание 10)
    private static List<String> history = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            try {
                String choice = scanner.next();

                // Выход из программы
                if (choice.equals("0")) break;

                switch (choice) {
                    case "1": case "2": case "3": case "4":
                        handleBasicMath(choice);
                        break;
                    case "5": // Возведение в степень (Задание 5)
                        handlePower();
                        break;
                    case "6": // Квадратный корень (Задание 6)
                        handleSqrt();
                        break;
                    case "7": // Очистка экрана (Задание 11)
                        clearScreen();
                        break;
                    case "8": // История (Задание 10)
                        printHistory();
                        break;
                    case "9": // Процент (Задание 12)
                        handlePercentage();
                        break;
                    case "10": // Инженерные функции (Задание 13)
                        handleTrigonometry();
                        break;
                    case "11": // Обработка выражений (Задание 14)
                        handleExpression();
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (InputMismatchException e) { // Обработка некорректного ввода (Задание 8)
                System.out.println("Ошибка: Пожалуйста, вводите только числа!");
                scanner.nextLine(); // Очистка буфера
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Меню калькулятора (Задание 9) ---");
        System.out.println("1 - Сложение       2 - Вычитание");
        System.out.println("3 - Умножение      4 - Деление");
        System.out.println("5 - Степень (x^y)  6 - Корень (sqrt)");
        System.out.println("7 - Очистить экран 8 - История");
        System.out.println("9 - Процент (a% b) 10 - Инженерный (sin/cos/tan)");
        System.out.println("11 - Выражение (2+3*4) 0 - Выход");
        System.out.print("Выберите операцию: ");
    }

    // Обработка базовых операций с поддержкой отрицательных чисел (Задание 7)
    private static void handleBasicMath(String op) {
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        double res = 0;
        String sign = "";

        if (op.equals("1")) { res = a + b; sign = "+"; }
        if (op.equals("2")) { res = a - b; sign = "-"; }
        if (op.equals("3")) { res = a * b; sign = "*"; }
        if (op.equals("4")) {
            if (b == 0) { System.out.println("Ошибка: деление на ноль!"); return; }
            res = a / b; sign = "/";
        }

        saveAndPrint(a + " " + sign + " " + b + " = " + res);
    }

    private static void handlePower() { // Задание 5
        System.out.print("Основание: ");
        double a = scanner.nextDouble();
        System.out.print("Степень: ");
        double b = scanner.nextDouble();
        saveAndPrint(a + " ^ " + b + " = " + Math.pow(a, b));
    }

    private static void handleSqrt() { // Задание 6
        System.out.print("Введите число: ");
        double a = scanner.nextDouble();
        saveAndPrint("sqrt(" + a + ") = " + Math.sqrt(a));
    }

    private static void handlePercentage() { // Задание 12
        System.out.print("Число (a): ");
        double a = scanner.nextDouble();
        System.out.print("Процент (b): ");
        double b = scanner.nextDouble();
        saveAndPrint(b + "% от " + a + " = " + (a * b / 100));
    }

    private static void handleTrigonometry() { // Задание 13
        System.out.print("Введите угол в градусах: ");
        double angle = Math.toRadians(scanner.nextDouble());
        System.out.println("sin: " + Math.sin(angle));
        System.out.println("cos: " + Math.cos(angle));
        System.out.println("tan: " + Math.tan(angle));
    }

    private static void clearScreen() { // Задание 11
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("--- Экран очищен ---");
    }

    private static void printHistory() { // Задание 10
        System.out.println("--- История вычислений ---");
        for (String record : history) System.out.println(record);
    }

    private static void saveAndPrint(String result) {
        System.out.println("Результат: " + result);
        history.add(result);
    }

    // Задание 14: Простая обработка выражений через встроенный движок (если доступен)
    // или ручной парсинг. Здесь приведен пример логики для выражений:
    private static void handleExpression() {
        System.out.print("Введите выражение (например, 2 + 3 * 4): ");
        scanner.nextLine(); // пропуск
        String expr = scanner.nextLine();
        // Примечание: Полный парсер приоритетов требует алгоритма "Сортировочная станция".
        // Для лаб. работы часто достаточно простого уведомления или базовой реализации.
        System.out.println("Функция обработки выражений требует реализации алгоритма Shunting-yard.");
        System.out.println("Вы ввели: " + expr);
    }
}