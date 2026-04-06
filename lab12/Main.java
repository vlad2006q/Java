import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = sc.nextLine();

        System.out.println("\nВыберите действие:");
        System.out.println("1 - Количество гласных и согласных");
        System.out.println("2 - Удалить пробелы");
        System.out.println("3 - Найти самое длинное слово");
        System.out.println("4 - Количество символов без пробелов");
        System.out.println("5 - Проверить начало строки");
        System.out.println("6 - Проверить конец строки");
        System.out.println("7 - Перевернуть строку");
        System.out.println("8 - Удалить цифры");
        System.out.println("9 - Заменить гласные на *");
        System.out.println("10 - Частота символов");
        System.out.println("11 - Только ли цифры");

        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1:
                int vowels = 0, consonants = 0;
                String v = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";

                for(char c : str.toCharArray()) {
                    if(Character.isLetter(c)) {
                        if(v.indexOf(c) != -1)
                            vowels++;
                        else
                            consonants++;
                    }
                }

                System.out.println("Гласные: " + vowels);
                System.out.println("Согласные: " + consonants);
                break;

            case 2:
                System.out.println(str.replace(" ", ""));
                break;

            case 3:
                String[] words = str.split(" ");
                String longest = "";

                for(String w : words) {
                    if(w.length() > longest.length())
                        longest = w;
                }

                System.out.println("Самое длинное слово: " + longest);
                break;

            case 4:
                System.out.println("Символов: " + str.replace(" ", "").length());
                break;

            case 5:
                System.out.println("Введите слово:");
                String start = sc.nextLine();
                System.out.println(str.startsWith(start));
                break;

            case 6:
                System.out.println("Введите символ:");
                String end = sc.nextLine();
                System.out.println(str.endsWith(end));
                break;

            case 7:
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println(reversed);
                break;

            case 8:
                System.out.println(str.replaceAll("[0-9]", ""));
                break;

            case 9:
                System.out.println(str.replaceAll("[aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ]", "*"));
                break;

            case 10:
                Map<Character,Integer> map = new HashMap<>();

                for(char c : str.toCharArray()) {
                    map.put(c, map.getOrDefault(c,0)+1);
                }

                for(char c : map.keySet()) {
                    System.out.println(c + " : " + map.get(c));
                }
                break;

            case 11:
                System.out.println(str.matches("\\d+"));
                break;

            default:
                System.out.println("Неверный выбор");
        }

        sc.close();
    }
}