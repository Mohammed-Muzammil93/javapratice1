// checking elgible for vote

import java.util.*;
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        if(age >18) {
        System.out.println("you are elgible");
        } else {
            System.out.println("you are not eligible");
        
                        sc.close();
        }
    }
}