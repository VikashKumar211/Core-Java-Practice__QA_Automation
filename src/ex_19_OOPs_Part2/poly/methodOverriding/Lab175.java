package ex_19_OOPs_Part2.poly.methodOverriding;

public class Lab175 {
    public static void main(String[] args) {
        son s1 = new  son();
        father f1 = new father();
        f1.car();
        s1.car();
        System.out.println(s1.fathermoney);
        System.out.println(s1.money);
    }
}
