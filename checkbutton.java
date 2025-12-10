import java.util.*;

public class checkbutton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();

        // if(button==1){
        //     System.out.println("hello");
        // }else if(button==2){
        //     System.out.println("namste");
        // }else if(button==3){
        //     System.out.println("Radhe Radhe");
        // }else {
        //     System.out.println("invalid button");
        // }

        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Radhe Radhe");
            break;
            case 4 : System.out.println("Radhe Krishna");
            break;
            case 5 : System.out.println("Jay shree shyam");
            break;
            case 6 : System.out.println("Jay Radhe");
            break;
            default : System.out.println("inavlid button");
        }
    }
    
}


