import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        int satirNumarasi = 1;

        while (scanner.hasNext()) {
            String satir = scanner.nextLine();
            System.out.println(satirNumarasi + " " + satir);
            satirNumarasi++;
        }

        scanner.close();
    }
}
