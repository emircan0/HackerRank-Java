import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        
        try{
        
        int n = s.nextInt();
        String strNumber = Integer.toString(n); 
        System.out.println("Good job");
        
        }catch(Exception e){
            System.out.println("Wrong answer");
            
        }
        
    }
    
}
