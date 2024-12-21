public class Main {
    public static void main(String[] args) {
        boolean clientOS = false;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (!clientOS && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short year = 2100;
        if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        short deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        byte monthNumber = 1;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;


            case 3, 4, 5:
                System.out.println("Весна");
                break;

            case 6, 7, 8:
                System.out.println("Лето");
                break;

            case 9, 11, 10:
                System.out.println("Осень");
                break;


        }

        }
    }
}