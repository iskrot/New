public class Main {
    public static void main(String[] args) {
        byte age = 20;
        if (age >= 18) {
            System.out.println("Вам " +age +" лет, вы совершеннолетний.");
        } else {
            System.out.println("Вам " +age +" лет, вы не достигли совершеннолетия, нужно немного подождать.");
        }

        byte temperature = -10;
        if (temperature <= 5) {
            System.out.println("На улице " +temperature +" градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " +temperature +" градусов, можно идти без шапки.");
        }

        byte speed = 78;
        if (speed > 60){
            System.out.println("Ваша скорость "+speed+" км/ч, придется заплатить штраф");
        }else {
            System.out.println("Ваша скорость "+speed+" км/ч, можно ездить спокойно");
        }

        byte ageMen = 119;
        if (ageMen >= 2 && ageMen <= 6){
            System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить в деский сад");
        } else if (ageMen >= 7 && ageMen <= 17) {
            System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить в школу");
        } else if (ageMen >= 18 && ageMen <= 24){
            System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить в университет");
        }else{
            System.out.println("Если возраст человека равен "+ageMen+", то ему нужно ходить на работу");
        }

        byte ageKid = 14;
        if (ageKid <5) {
            System.out.println("Возраст ребенка равен " +ageKid+ " лет, он не может кататься на атракционе");
        } else if (ageKid >=5 && ageKid<14) {
            System.out.println("Возраст ребенка равен " +ageKid+ " лет, он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else{
            System.out.println("Возраст ребенка равен " +ageKid+ " лет, он может кататься без сопровождения взрослого.");
        }

        byte places =20;
        if (places <60) {
            System.out.println("Осталось " +(102-places)+" мест, из них "+(60-places) +" сидячих.");
        } else if (places >=60 && places <102) {
            System.out.println("Осталось " +(102-places)+" мест. Сидячих мест не осталось.");
        }else{
            System.out.println("Мест не осталось");
        }

        int one = 5;
        int two = 2;
        int three = 1;

        if (one > two && one > three){
            System.out.println(one+" наибольшее число");
        }else  if (two>one && two > three){
            System.out.println(two+" наибольшее число");
        }else{
            System.out.println(three+" наибольшее число");
        }
    }
}