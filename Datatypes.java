import java.util.Scanner;

public class Datatypes {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long n = s.nextLong();
                boolean b = false;
                boolean sh = false;
                boolean in = false;
                boolean l = false;

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    b = true;
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    sh = true;
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    in = true;
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    l = true;
                }

                System.out.println(n + " can be fitted in:");

                if (b) {
                    System.out.println("* byte");
                }
                if (sh) {
                    System.out.println("* short");
                }
                if (in) {
                    System.out.println("* int");
                }
                if (l) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(s.next() + " can't be fitted anywhere.");
            }
        }
    }
    
}
