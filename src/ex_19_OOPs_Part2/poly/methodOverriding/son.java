package ex_19_OOPs_Part2.poly.methodOverriding;

public class son extends father{
    int money = 2000;

    @Override
    void car(){
        System.out.println("son car");
    }
}
