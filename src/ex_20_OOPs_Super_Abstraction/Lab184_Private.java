package ex_20_OOPs_Super_Abstraction;

public class Lab184_Private {
    public static void main(String[] args) {
        XYZ a1= new XYZ();
        System.out.println(a1.gold);
    }
}

class ABC{

    ABC(){
        System.out.println("Default constructor");
    }
    protected int gold = 100;
}

class XYZ extends ABC{
    void display(){
        System.out.println(super.gold);
    }

}