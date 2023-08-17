import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        StringBuilder palindrome = new StringBuilder();

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
     
        for(int i=a.length()-1;i>=0;i--) 
        {
            palindrome.append(a.charAt(i));
        }

        String result = palindrome.toString();
        if(a.equals(result)){
        System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
