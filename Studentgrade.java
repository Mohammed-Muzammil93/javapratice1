// students marks

import java.util.*;
 public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();

        if (Marks >= 90 && Marks <=100 ) {
            System.out.println("Grade A");
        }
         else if (Marks >= 75 ) {
            System.out.println("Grade B");
        }
        else if (Marks >= 60 ) {
            System.out.println("Grade C");
        }
        else if (Marks >= 40 ) {
            System.out.println("Grade D");
        } else {
            System.out.println("fail");        }
        
        sc.close();
        
    }

 }