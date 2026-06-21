package ex_19_OOPs_Part2.poly.methodOverriding;

public class RealExample {
    public static void main(String[] args) {
        TC1 tc1 = new TC1();
        tc1.browser();
    }
}

class commonToAll{
    void browser(){
        System.out.println("Start the browser");
    }
}

class TC1 extends commonToAll{
    void browser(){
        System.out.println("Open the chrome");
    }
}