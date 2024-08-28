public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }


        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }


        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " является високосным");
        }


        int seven = 7;
        int plus = 0;
        for (int i = 0; i < 14; i++) {
            plus = plus + seven;
            System.out.println(plus);
        }


        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }


        int sum = 29000;
        int contribution = 0;
        for (int i = 1; i <= 12; i++) {
            contribution = sum + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + contribution + " рублей");
        }

        int sum1 = 29000;
        int contribution1 = 0;
        for (int i = 1; i <= 12; i++) {
            contribution1 = contribution1 + contribution1 / 100;
            contribution1 = contribution1 + sum1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + contribution1 + " рублей");
        }


        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}