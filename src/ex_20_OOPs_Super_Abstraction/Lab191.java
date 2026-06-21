package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        kumar k1 = new kumar();
        k1.display();
        vikash v1 = new kumar();
        v1.display();
        System.out.println(v1.a);
    }
}

class kumar implements vikash{
    @Override
    public void display(){
        System.out.println("vikash kumar");
    }
}
interface vikash{
    int a =10;

    void display();
}