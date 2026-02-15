import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            // find last digit of a number
            int digit = n%10;
            sum = sum + (digit * digit * digit);
            n = n /10;
        }
        if(original==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}

