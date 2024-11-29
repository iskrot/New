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
        System.out.println( "Если в компании работает " +workers + " человек, то всего " +time + " часов работы может быть поделено между сотрудниками.");

    }
}