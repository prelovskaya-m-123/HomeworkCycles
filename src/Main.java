public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 8");
        int monthlySavings = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + monthlySavings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача 9");
        int monthlySavings1 = 29000;
        int totalSavings = 0;
        for (int i = 1; i <= 12; i++) {
            totalSavings = totalSavings + totalSavings/100;
            totalSavings = totalSavings + monthlySavings1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println();
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
