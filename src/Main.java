public class Main {
    public static void main(String[] args) {
        short[] spendingSchedule = {10_000, 25_000, 12_400, 9_900, 16_400};
        int monthlyExpenses = 0;
        for (short i : spendingSchedule) {
            monthlyExpenses += i;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyExpenses + " рублей");

        int minCosts = 30_000;
        short maxConts = -1;
        for (short i : spendingSchedule) {
            if (maxConts < i) {
                maxConts = i;
            }
            if (minCosts > i) {
                minCosts = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minCosts + " рублей. Максимальная сумма трат за неделю составила " + maxConts + " рублей");

        short averageWaste = (short) (monthlyExpenses / 5);
        System.out.println("Средняя сумма трат за месяц составила " + averageWaste + " рублей");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char bufer;
        for (byte i = 0; i < reverseFullName.length/2; i++){
            bufer = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = bufer;
        }
        System.out.println(reverseFullName);
    }
}
