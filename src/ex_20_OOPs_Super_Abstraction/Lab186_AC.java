package ex_20_OOPs_Super_Abstraction;

public class Lab186_AC {
    public static void main(String[] args) {
        son s1 = new son();
        s1.money();

    }
}

class son implements father, mother{
    @Override
    public void money(){
        System.out.println("Son money");
    }

    public void f1(){
        System.out.println("Son f1");
    }

    public void df(){
        father.super.df();
        mother.super.df();
    }
}

interface father{
    void money();
    void f1();

    default void df(){
        System.out.println("df");
    }

}

interface mother{
    void money();
    void f1();

    default void df(){
        System.out.println("mf");
    }

}