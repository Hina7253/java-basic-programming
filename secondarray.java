// Take an array as input from the user. search for a given number x
// and print the index at which it occurs.

import java.util.*;

public class secondarray {
    public static void main(String[] args) {
        System.out.println("enter your array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x) {
                System.out.println("found at index :" + i);
            }
        }
    

    }
    
}
