import java.util.Scanner;

public class fibbonacchi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 0;
        while(count<n){
            System.out.println(a + " ");
            int next = a+b;
            a = b;
            b = next;
            count++;
        }
    }
}
