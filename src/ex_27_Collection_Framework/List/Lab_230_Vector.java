package ex_27_Collection_Framework.List;

import java.util.Vector;

public class Lab_230_Vector {
    public static void main(String[] args) {
        Vector v1 = new Vector<>();
        v1.add(1);
        v1.add(1.23);
        v1.add(null);
        v1.add(true);
        v1.add("vikash");
        v1.add('a');

        System.out.println(v1);

        System.out.println("******");
        for(int i = 0; i < v1.size(); i++){
            System.out.println(v1.get(i));
        }
    }
}
