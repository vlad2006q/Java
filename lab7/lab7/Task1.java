public class Task1 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();

    }

    public static void task1() {

        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 41) - 20;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("Задание 1: Сумма отрицательных элементов: " + sum);
    }
    public static void task2() {

        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < B.length; i++) {
            B[i] = (int)(Math.random() * 41) - 20;
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("Задание 2: Сумма положительных элементов: " + sum);
    }
    public static void task3() {
        double[] A = new double[12];
        double product = 1; // Начальное значение для произведения
        boolean hasNegative = false; // Чтобы проверить, есть ли отрицательные числа

        // Заполнение массива случайными вещественными числами от -10 до 10
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 20 - 10; // от -10 до 10
        }

        // Вывод массива для наглядности




        // Вычисление произведения отрицательных элементов
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }

        if (hasNegative) {
            System.out.println("Задание 3: Произведение отрицательных элементов: " + product);
        } else {
            System.out.println("Отрицательных элементов нет.");
        }
    }
    public static void task4() {
        double[] C = new double[25];
        double product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < C.length; i++) {
            C[i] = Math.random() * 20 - 10;
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }

        if (hasPositive) System.out.println("Задание 4: Произведение положительных элементов C = " + product);
        else System.out.println("Задание 4: Положительных элементов нет");
    }

    // ====== Задание 5 ======
    public static void task5() {
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < D.length; i++) {
            D[i] = Math.random() * 20 - 10;
            sum += D[i];
        }

        double average = sum / D.length;
        System.out.println("Задание 5: Среднее арифметическое D = " + average);
    }

    // ====== Задание 6 ======
    public static void task6() {
        double[][] A = new double[10][10];
        double[] B = new double[10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = Math.random() * 20 - 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            double sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) sum += A[i][j];
            }
            B[i] = sum;
        }

        System.out.print("Задание 6: Сумма отрицательных элементов по строкам B = ");
        for (double val : B) System.out.print(val + " ");
        System.out.println();
    }

    // ====== Задание 7 ======
    public static void task7() {
        double[][] B = new double[5][5];
        double[] A = new double[5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                B[i][j] = Math.random() * 20 - 10;

        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) sum += B[i][j];
            }
            A[i] = sum;
        }

        System.out.print("Задание 7: Сумма положительных элементов по строкам A = ");
        for (double val : A) System.out.print(val + " ");
        System.out.println();
    }

    // ====== Задание 8 ======
    public static void task8() {
        double[][] A = new double[12][6];
        double[] productCols = new double[6];

        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 6; j++)
                A[i][j] = Math.random() * 20 - 10;

        for (int j = 0; j < 6; j++) {
            double prod = 1;
            boolean hasNegative = false;
            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    prod *= A[i][j];
                    hasNegative = true;
                }
            }
            productCols[j] = hasNegative ? prod : 0;
        }

        System.out.print("Задание 8: Произведение отрицательных элементов по столбцам = ");
        for (double val : productCols) System.out.print(val + " ");
        System.out.println();
    }

    // ====== Задание 9 ======
    public static void task9() {
        double[][] C = new double[5][5];
        double product = 1;
        boolean hasPositive = false;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                C[i][j] = Math.random() * 20 - 10;

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }

        System.out.println("Задание 9: Произведение положительных элементов главной диагонали = " + (hasPositive ? product : 0));
    }

    // ====== Задание 10 ======
    public static void task10() {
        double[][] D = new double[7][7];
        double sum = 0;

        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 7; j++)
                D[i][j] = Math.random() * 20 - 10;

        for (int i = 0; i < 7; i++) sum += D[i][i];
        double average = sum / 7;
        System.out.println("Задание 10: Среднее арифметическое главной диагонали = " + average);
    }

    // ====== Задание 11 ======
    public static void task11() {
        double[] A = new double[25];

        for (int i = 0; i < 25; i++) A[i] = Math.random() * 20 - 10;

        int minIndex = 0, maxIndex = 0;
        for (int i = 0; i < 25; i++) {
            if (A[i] < A[minIndex]) minIndex = i;
            if (A[i] > A[maxIndex]) maxIndex = i;
        }

        double temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        System.out.println("Задание 11: Поменяли местами макс и мин элементы массива A");
    }

    // ====== Задание 12 ======
    public static void task12() {
        double[] B = new double[25];
        for (int i = 0; i < 25; i++) B[i] = Math.random() * 20 - 10;

        java.util.Arrays.sort(B);

        System.out.print("Задание 12: Отсортированный массив B = ");
        for (double val : B) System.out.print(val + " ");
        System.out.println();
    }

    // ====== Задание 13 ======
    public static void task13() {
        double[] C = new double[20];
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            C[i] = Math.random() * 20 - 10;
            sum += C[i];
        }
        System.out.println("Задание 13: Среднее значение массива C = " + sum / 20);
    }

    // ====== Задание 14 ======
    public static void task14() {
        int[] D = new int[30];
        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < 30; i++) {
            D[i] = (int) (Math.random() * 41 - 20);
            if (D[i] % 2 == 0) sumEven += D[i];
            else sumOdd += D[i];
        }

        System.out.println("Задание 14: Сумма чётных = " + sumEven + ", сумма нечётных = " + sumOdd);
    }

    // ====== Задание 15 ======
    public static void task15() {
        System.out.println("Задание 15: Таблица 3x5 случайных чисел <10");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((int) (Math.random() * 10) + " ");
            }
            System.out.println();
        }
    }

    // ====== Задание 16 ======
    public static void task16() {
        int[] X = new int[10];
        for (int i = 0; i < 10; i++) X[i] = (int) (Math.random() * 50 - 25);

        int max = maxX(X);
        System.out.println("Задание 16: Максимальный элемент массива X = " + max);
    }

    public static int maxX(int[] array) {
        int max = array[0];
        for (int num : array) if (num > max) max = num;
        return max;
    }

    // ====== Задание 17 ======
    public static void task17() {
        String s1 = "Hello", s2 = "World", s3 = "Java", s4 = "Test", s5 = "Test";
        String result = (s4.equals(s5)) ? (s1 + s2) : (s1 + s3);
        System.out.println("Задание 17: Результат = " + result);
    }
}
