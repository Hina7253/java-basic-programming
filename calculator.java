import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter first number");
        Double a = Sc.nextDouble();
        System.out.println("enter operator");
        char operator = Sc.next().charAt(0);
        System.out.println("enter second number");
        Double b = Sc.nextDouble();
        Double result;

        switch (operator) {
            case '+': result = a+b;
                System.out.println("result :"+ result);
                break;
            case '-': result = a-b;
            System.out.println("result :"+ result);
            break;
            case '*' : result = a*b;
            System.out.println("result :"+ result);
            case '/' :
            if(b!=0){
                result = a/b;
                System.out.println("result :"+ result);
            }else{
               System.out.println("error");
            }
            break;
        
            default: System.out.println("invalid operator please enter valid operator");
                
        }


    }
    
}




