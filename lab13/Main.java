import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// Задание 14: Создание класса Student [cite: 105-110]
class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("Студент{имя='%s', возраст=%d, оценка=%.1f}", name, age, grade);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 10, 11, 15, 20);
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "pear", "cherry", "kiwi");
        List<Student> students = Arrays.asList(
                new Student("Иван", 20, 85.5),
                new Student("Мария", 19, 92.0),
                new Student("Алексей", 21, 75.0),
                new Student("Ольга", 20, 81.0)
        );

        while (true) {
            System.out.println("\n--- Выберите задание (1-20) или 0 для выхода ---");
            int choice = scanner.nextInt();
            if (choice == 0) break;

            switch (choice) {
                case 1: // Сложение двух чисел [cite: 77, 78]
                    BinaryOperator<Integer> sum = (a, b) -> a + b;
                    System.out.println("Сложение 5 + 10: " + sum.apply(5, 10));
                    break;

                case 2: // В верхний регистр (Function) [cite: 79, 80]
                    Function<String, String> toUpper = s -> s.toUpperCase();
                    System.out.println("Результат: " + toUpper.apply("java stream api"));
                    break;

                case 3: // Отфильтровать нечётные (Predicate) [cite: 81, 82]
                    Predicate<Integer> isEven = n -> n % 2 == 0;
                    System.out.print("Четные числа: ");
                    numbers.stream().filter(isEven).forEach(n -> System.out.print(n + " "));
                    System.out.println();
                    break;

                case 4: // Квадрат каждого числа (map) [cite: 83, 84]
                    System.out.print("Квадраты: ");
                    numbers.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
                    System.out.println();
                    break;

                case 5: // Максимальный элемент (Comparator) [cite: 85, 86]
                    numbers.stream().max(Integer::compare).ifPresent(m -> System.out.println("Максимум: " + m));
                    break;

                case 6: // Сортировка строк по длине [cite: 87, 88]
                    strings.stream().sorted(Comparator.comparingInt(String::length))
                            .forEach(System.out::println);
                    break;

                case 7: // Первая буква заглавная [cite: 89, 90]
                    strings.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                            .forEach(System.out::println);
                    break;

                case 8: // Длина строки > 5 [cite: 91, 92]
                    strings.stream().filter(s -> s.length() > 5).forEach(System.out::println);
                    break;

                case 9: // Method Reference [cite: 93-95]
                    System.out.println("Вывод через System.out::println:");
                    numbers.forEach(System.out::println);
                    break;

                case 10: // Optional [cite: 96, 97]
                    Optional<Integer> minVal = numbers.stream().min(Integer::compare);
                    System.out.println("Минимум: " + minVal.orElse(0));
                    break;

                case 11: // Consumer [cite: 98, 99]
                    Consumer<String> printer = s -> System.out.println("Consumer вывел: " + s);
                    printer.accept("Привет, мир!");
                    break;

                case 12: // Supplier [cite: 100, 101]
                    Supplier<Integer> randomGen = () -> new Random().nextInt(100);
                    System.out.println("Случайное число: " + randomGen.get());
                    break;

                case 13: // Сортировка по полю (возраст) [cite: 102, 103]
                    students.stream().sorted(Comparator.comparingInt(s -> s.age))
                            .forEach(System.out::println);
                    break;

                case 14: // Список студентов (фильтр > 80 и сортировка по имени) [cite: 104, 111-113]
                    students.stream()
                            .filter(s -> s.grade > 80)
                            .sorted(Comparator.comparing(s -> s.name))
                            .forEach(System.out::println);
                    break;

                case 15: // Stream Chaining [cite: 114-119]
                    numbers.stream()
                            .filter(n -> n > 5)         // фильтр [cite: 116]
                            .map(n -> n * 10)           // map [cite: 117]
                            .sorted()                   // сортировка [cite: 118]
                            .forEach(System.out::println); // вывод [cite: 119]
                    break;

                case 16: // Grouping by age [cite: 120-122]
                    Map<Integer, List<Student>> grouped = students.stream()
                            .collect(Collectors.groupingBy(s -> s.age));
                    System.out.println("Группировка по возрасту: " + grouped);
                    break;

                case 17: // Reduce (сумма) [cite: 123-125]
                    int totalSum = numbers.stream().reduce(0, Integer::sum);
                    System.out.println("Сумма всех элементов: " + totalSum);
                    break;

                case 18: // Distinct + Limit [cite: 126-128]
                    System.out.println("Удаление дубликатов и первые 3 элемента:");
                    strings.stream().distinct().limit(3).forEach(System.out::println);
                    break;

                case 19: // FlatMap (список списков) [cite: 129, 130]
                    List<List<Integer>> complexList = Arrays.asList(
                            Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6)
                    );
                    List<Integer> flat = complexList.stream()
                            .flatMap(List::stream)
                            .collect(Collectors.toList());
                    System.out.println("Плоский список: " + flat);
                    break;

                case 20: // Real case (обработка заказов) [cite: 131-134]
                    List<Integer> orders = Arrays.asList(1200, 500, 3000, 150, 2000);
                    System.out.println("Заказы > 1000 (отсортированы):");
                    orders.stream()
                            .filter(o -> o > 1000)
                            .sorted()
                            .forEach(System.out::println);
                    break;

                default:
                    System.out.println("Неверный номер задания.");
            }
        }
        scanner.close();
    }
}