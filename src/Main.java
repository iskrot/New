public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper =763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog+ 4;
        cat = cat+ 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog-3.5;
        cat = cat-1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        var men1 = 78.2;
        var men2 = 82.7;
        System.out.println(men1 + men2);
        System.out.println(men2 - men1);
        System.out.println((men1 + men2) % (men2 - men1));
        var time = 640;
        var timework = 8;
        var workers = time / timework;
        System.out.println("Всего работников в компании — " +workers + " человек.");
        workers += 94;
        time = timework * workers;
        System.out.println("Если в компании работает " +workers + " человек, то всего " +time + " часов работы может быть поделено между сотрудниками.");

        int i = 200;
        byte b = 100;
        short s = 3000;
        long l = 10000L;
        float f = 0.1234567f;
        double d = 0.12345678;
        System.out.println("Значение переменной i с типом int равно " +i);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной s с типом short равно " +s);
        System.out.println("Значение переменной l с типом long равно " +l);
        System.out.println("Значение переменной f с типом float равно " +f);
        System.out.println("Значение переменной d с типом double равно " +d);
        int i2 = 569;
        byte b2 = 67;
        short s2 = -159;
        short s21 = 27897;
        long l2 = 987678965549L;
        float f2 = 27.12f;
        double d2 = 2.786;

        byte clas1 = 23;
        byte clas2 = 27;
        byte clas3 = 30;
        short lists = 480;
        byte list = (byte) (lists/(clas1+ clas2 +clas3));
        System.out.println("На каждого ученика рассчитано " +list +" листов бумаги.");

        byte machinePerformance = 16/2;
        short machinePerformance1 = (short) (machinePerformance*20);
        short machinePerformance2 = (short) (machinePerformance*60*24);
        int machinePerformance3 = (int) (machinePerformance2*3);
        int machinePerformance4 = (int) (machinePerformance2*30);
        System.out.println("За 20 минут машина произвела " + machinePerformance1 +" штук бутылок.");
        System.out.println("За сутки машина произвела " +machinePerformance2 +" штук бутылок.");
        System.out.println("За 3 дня машина произвела " +machinePerformance3 +" штук бутылок.");
        System.out.println("За месяц машина произвела " +machinePerformance4 +" штук бутылок.");

        float white = 2;
        float brown = 4;
        byte allPaints = 120;
        byte clas = (byte) (allPaints/(white+brown));
        byte allWhite = (byte) (allPaints*(white/(white+brown)));
        byte allBrown = (byte) (allPaints-allWhite);
        System.out.println("В школе, где " +clas + " классов, нужно " +allWhite +" банок белой краски и " +allBrown +" банок коричневой краски.");

        byte bananas = 5;
        byte bananaMassa = 80;
        short milks = 2;
        byte milkMassaFor100Ml = 105;
        byte plombirs = 2;
        byte plombirMassa = 100;
        byte eggs = 4;
        byte eggMassa = 70;
        float allMassa = (float) (bananaMassa * bananas + milks * milkMassaFor100Ml + plombirMassa * plombirs + eggs * eggMassa);
        System.out.println(allMassa+"г");
        float allMassaKg = (float) (allMassa/1000);
        System.out.println(allMassaKg+"кг");

        float loseWeight = 7;
        float diet1 = (float) (7/0.25);
        float diet2 = (float) (7/0.5);
        System.out.println("При диете в 250 грамм понадобится "+diet1+" дней");
        System.out.println("При диете в 500 грамм понадобится "+diet2+" дней");



        float salaryM = 67760;
        float salaryD = 83690;
        float salaryK = 76230;

        System.out.println("Маша теперь получает "+update(salaryM)+" рублей. Годовой доход вырос на "+(annualIncome(update(salaryM))-annualIncome(salaryM))+" рублей");
        System.out.println("Маша теперь получает "+update(salaryD)+" рублей. Годовой доход вырос на "+(annualIncome(update(salaryD))-annualIncome(salaryD))+" рублей");
        System.out.println("Маша теперь получает "+update(salaryK)+" рублей. Годовой доход вырос на "+(annualIncome(update(salaryK))-annualIncome(salaryK))+" рублей");

    }
    static float update (float zp){
        float newZp = zp * 1.1f;
        return newZp;
    }
    static float annualIncome (float zp){
        float annual = zp*12;
        return annual;
    }
}