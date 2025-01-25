import java.time.LocalDate;

// Установите версию приложения для Android по ссылке

public class Main {
    public static void main(String[] args) {
        int year = 2000;
        if (leapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        boolean clientOS = true;
        int clientDeviceYear = 2000;
        if (operator(clientOS, clientDeviceYear) != null){
            System.out.println(operator(clientOS, clientDeviceYear));
        }

        int deliveryDistance = 30;
        if (deliveryTime(deliveryDistance) == 4) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime(deliveryDistance));
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static String operator(boolean clientOS, int clientDeviceYear) {
        int currentYear = 2015;
        if (clientDeviceYear < currentYear && clientOS) {
            return "Установите версию приложения для Android по ссылке";
        } else if (!clientOS && clientDeviceYear < currentYear) {
            return "Установите версию приложения для iOS по ссылке";
        }
        return null;
    }

    public static byte deliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        }
        return 4;

    }
}