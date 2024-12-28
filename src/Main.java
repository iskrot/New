public class Main {
    public static void main(String[] args) {
        int money = 0;
        short month = 0;
        while (money < 2_459_000) {
            month++;
            money += 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
        }
        byte y = 1;
        while (y <= 10 ) {
            y++;
            System.out.print(y + " ");
        }
        System.out.println();
        for (byte i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int population = 17_000_000;
        byte birth = 17;
        byte mortality = 8;
        for (byte i = 1; i <= 10; i++) {
            population += (birth - mortality) * (population / 1000);
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
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
            }
        }

        int friday = 1;
        for (byte i = 1; i <= 31; i++) {
            if (i % 7 == friday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        short endYear = 2124;
        short realYear = 2024;
        short startYear = 0;

        while (startYear < endYear){

            if (startYear>realYear-200){
                System.out.println(startYear);
            }
            startYear += 79;
        }
    }
}