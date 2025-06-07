// import java.util.*;

// public class function  {
//     public static int calculatesum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//    public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();
//         int sum = calculatesum(a, b);
//         System.out.println(sum);
//     }
    
// }

//product of two number
// import java.util.*;
// public class function{
//     public static int calculateproduct(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner Sc = new Scanner(System.in);
//         int a = Sc.nextInt();
//         int b = Sc.nextInt();
//         System.out.println("product of two number "+ calculateproduct(a, b));
//     }
// }


// find factorial
import java.util.*;
public class function{
    public static void calculatefactorial(int n){
        if(n<0){
            System.out.println("invalid number");
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
         System.out.println(factorial);
        return;
        
    }
    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        calculatefactorial(n);
    }
}