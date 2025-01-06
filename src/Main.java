public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        float[] b = {1.57f, 7.654f, 9.986f};
        byte[] c = {1, 2, 3};

        System.out.print(a[0]);
        for (byte i = 1; i <= 2;i++ ){
            System.out.print(","+a[i]);
        }
        System.out.println();
        System.out.print(b[0]);
        for (byte i = 1; i <= 2;i++ ){
            System.out.print(","+b[i]);
        }
        System.out.println();
        System.out.print(c[0]);
        for (byte i = 0; i <= 2;i++ ){
            System.out.print(","+c[i]);
        }
        System.out.println();

        System.out.print(a[2]);
        for (byte i = 1; i <= 2;i++ ){
            System.out.print(","+a[a.length-i-1]);
        }
        System.out.println();
        System.out.print(b[2]);
        for (byte i = 0; i <= 2;i++ ){
            System.out.print(","+b[b.length-i-1]);
        }
        System.out.println();
        System.out.print(c[2]);
        for (byte i = 0; i <= 2;i++ ){
            System.out.print(","+c[c.length-i-1]);
        }
        System.out.println();

        for (byte i = 0; i < a.length; i++){
            if (a[i]%2!=0){
                a[i] += 1;
            }
        }
        System.out.print(a[0]);
        for (byte i = 1; i <= 2;i++ ){
            System.out.print(","+a[i]);
        }
    }
}