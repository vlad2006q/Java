import java.util.*;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1 - Длина строки");
            System.out.println("2 - Верхний/нижний регистр");
            System.out.println("3 - Подсчёт слов");
            System.out.println("4 - Обратный порядок слов");
            System.out.println("5 - Поиск слова");
            System.out.println("6 - Замена слова");
            System.out.println("7 - Палиндром");
            System.out.println("8 - Сравнение строк");
            System.out.println("9 - Разделение строки");
            System.out.println("10 - Гласные и согласные");
            System.out.println("11 - Удалить пробелы");
            System.out.println("12 - Самое длинное слово");
            System.out.println("13 - Символы без пробелов");
            System.out.println("14 - Начинается ли с...");
            System.out.println("15 - Заканчивается ли...");
            System.out.println("16 - Строка наоборот");
            System.out.println("17 - Удалить цифры");
            System.out.println("18 - Гласные -> *");
            System.out.println("19 - Частота символов");
            System.out.println("20 - Только цифры?");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) break;

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Длина: " + input.length());
                    break;

                case 2:
                    System.out.println("Верхний: " + input.toUpperCase());
                    System.out.println("Нижний: " + input.toLowerCase());
                    break;

                case 3:
                    String[] words = input.trim().split("\\s+");
                    System.out.println("Количество слов: " + words.length);
                    break;

                case 4:
                    String[] w = input.split(" ");
                    for (String word : w) {
                        System.out.print(new StringBuilder(word).reverse() + " ");
                    }
                    break;

                case 5:
                    System.out.print("Введите слово для поиска: ");
                    String search = scanner.nextLine();
                    System.out.println(input.contains(search) ? "Найдено" : "Не найдено");
                    break;

                case 6:
                    System.out.print("Что заменить: ");
                    String oldWord = scanner.nextLine();
                    System.out.print("На что заменить: ");
                    String newWord = scanner.nextLine();
                    System.out.println(input.replace(oldWord, newWord));
                    break;

                case 7:
                    String cleaned = input.replaceAll("\\s+", "").toLowerCase();
                    String reversed = new StringBuilder(cleaned).reverse().toString();
                    System.out.println(cleaned.equals(reversed) ? "Палиндром" : "Не палиндром");
                    break;

                case 8:
                    System.out.print("Введите вторую строку: ");
                    String second = scanner.nextLine();
                    System.out.println(input.equals(second) ? "Равны" : "Не равны");
                    break;

                case 9:
                    System.out.print("Введите разделитель: ");
                    String delimiter = scanner.nextLine();
                    String[] parts = input.split(delimiter);
                    for (String part : parts) {
                        System.out.println(part);
                    }
                    break;

                case 10:
                    int vowels = 0, consonants = 0;
                    String letters = input.toLowerCase();
                    for (char c : letters.toCharArray()) {
                        if ("aeiouаеёиоуыэюя".indexOf(c) != -1) vowels++;
                        else if (Character.isLetter(c)) consonants++;
                    }
                    System.out.println("Гласные: " + vowels);
                    System.out.println("Согласные: " + consonants);
                    break;

                case 11:
                    System.out.println(input.replace(" ", ""));
                    break;

                case 12:
                    String[] arr = input.split(" ");
                    String longest = "";
                    for (String word : arr) {
                        if (word.length() > longest.length()) longest = word;
                    }
                    System.out.println("Самое длинное слово: " + longest);
                    break;

                case 13:
                    System.out.println("Символов без пробелов: " + input.replace(" ", "").length());
                    break;

                case 14:
                    System.out.print("Введите слово: ");
                    String start = scanner.nextLine();
                    System.out.println(input.startsWith(start));
                    break;

                case 15:
                    System.out.print("Введите символ/окончание: ");
                    String end = scanner.nextLine();
                    System.out.println(input.endsWith(end));
                    break;

                case 16:
                    System.out.println(new StringBuilder(input).reverse());
                    break;

                case 17:
                    System.out.println(input.replaceAll("\\d", ""));
                    break;

                case 18:
                    System.out.println(input.replaceAll("[aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ]", "*"));
                    break;

                case 19:
                    Map<Character, Integer> map = new HashMap<>();
                    for (char c : input.toCharArray()) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
                    }
                    System.out.println(map);
                    break;

                case 20:
                    System.out.println(input.matches("\\d+") ? "Только цифры" : "Есть другие символы");
                    break;

                default:
                    System.out.println("Неверный выбор");
            }
        }

        scanner.close();
    }
}