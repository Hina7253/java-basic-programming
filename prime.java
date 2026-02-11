import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2 ;
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            while(i<=n/2){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if(isPrime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
