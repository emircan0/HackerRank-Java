import java.util.Scanner;

public class StaticInitializerBlock {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        try{
        int b = s.nextInt();
        int h = s.nextInt();
        int alan = 0;

        if (b <= 0 || h <= 0) {
                throw new IllegalArgumentException("Breadth and height must be positive");
            }
            
            alan = b*h;
            System.out.println(alan);
      
        }catch(Exception e){
            System.out.printf("java.lang.Exception: " +e.getMessage());
        }
        
        
    }
}
