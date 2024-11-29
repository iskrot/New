public class Main {
    public static void main(String[] args) {
        int money = 0;
        short month = 0;
        while (money < 2_459_000) {
            month++;
            money += 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }

        for (byte i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (byte i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        int population = 17_000_000;
        for (byte i = 1; i <= 10; i++) {
            population += (17 - 8) * (population % 1000);
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
        money = 15_000;
        month = 0;
        while (money <= 12_000_000) {
            month++;
            money *= 1.07;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }

        money = 15_000;
        month = 0;
        while (money <= 12_000_000) {
            month++;
            money *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }

        money = 15_000;
        month = 0;
        while (month <= 9 * 12) {
            month++;
            money *= 1.07;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }

        int friday = 1;
        for (byte i = 1; i <= 31; i++) {
            if (i % 7 == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        short year = 0;
        do {
            year += 79;
            if (year > 2024 - 200) {
                System.out.println(year);
            }
        } while (year < 2024);
    }
}