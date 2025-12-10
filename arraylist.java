import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    static void reverseList(ArrayList<Integer> list){
        //  int i = 0, j = list.size()-1;{}
        //  while(i<j){
        //     Integer temp = Integer.valueOf(list.get(i));
        //     list.set(i , list.get(j));
        //     list.set(j, temp);
        //     i++;
        //     j--;
        //  }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(9);
        System.out.println("Original List" + list);
        Collections.reverse(list);
        // reverseList(list);
        System.out.println("Revesed list" + list);
        Collections.sort(list);
        System.out.println("Ascending order" + list);
         Collections.sort(list, Collections.reverseOrder());
         System.out.println("decending order" + list);
         
    }
}

