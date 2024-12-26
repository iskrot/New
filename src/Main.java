public class Main {
    public static void main(String[] args) {

        for (byte i = 1; i < 11; i++) {
            System.out.println(i);
        }

        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (byte i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        for (byte i = 10; i > -11; i--) {
            System.out.println(i);
        }

        for (short i = 1904; i < 2096; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i + " год является високосным");
            }
        }

        for (byte i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        for (short i = 1; i <= 512; i += i) {
            System.out.println(i);
        }
        float money = 0;
        for (byte i = 1; i <= 12; i++) {
            money += 29000;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }

        for (byte i = 1; i <= 12; i++) {
            money *= 1.12;
            money += 29000;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + money + " рублей");
        }

        for (byte i = 1; i <= 10; i++){
            System.out.println(2*i);
        }

    }
}