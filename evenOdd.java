import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(n>0){
            int digit = n%10;
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            n = n/10;
        }
        System.out.println("Even = :"+ even);
        System.out.println("odd = :"+ odd);

    }
}
