package ex_19_OOPs_Part2.poly.methodOverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperation m1= new MathOperation();

        int sum1 = m1.add(5, 7);
        double sum2 = m1.add(3.12, 4.12);
        System.out.println(sum2);
        System.out.println(m1.add(10,20));
    }
}
