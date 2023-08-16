import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Loops2 {

     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sonuc=0;
        
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        
    for(int i=0; i<q; i++){
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
             
    for(int j=0; j<n; j++){
          
         sonuc += ((int)Math.pow(2, j)*b); 
         sonuc += a;
            System.out.print(sonuc + " ");
            sonuc -= a;
        }
        sonuc = 0;
        System.out.println();
    }
}
    
}
