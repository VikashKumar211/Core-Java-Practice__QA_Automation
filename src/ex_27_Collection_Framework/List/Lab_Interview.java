package ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_Interview {
    public static void main(String[] args) {
        //Input 1,2,3,4  ->output 24,18,12,6


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());

        for (Integer o : list){
            System.out.println(6*o);
        }



    }
}
