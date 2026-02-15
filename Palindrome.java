import java.util.Scanner;

public class Palindrome{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
         
        while(n>0){
             // find the last digit
            int digit = n % 10;
            reverse = reverse*10 + digit;
            n = n / 10;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
     }


}
