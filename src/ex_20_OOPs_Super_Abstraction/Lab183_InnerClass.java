package ex_20_OOPs_Super_Abstraction;

public class Lab183_InnerClass {
    public static void main(String[] args) {

        A a1= new A();
        a1.dc();
    }
}
class A{
    void dc(){
        System.out.println("DC");
    }
    class b{
        class c{

        }
    }
}
