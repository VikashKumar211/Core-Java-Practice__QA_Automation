package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        son1 s1= new son1();
        s1.loan50K();
    }
}

class normal{

}
abstract class father01{
    abstract void loan50K();
}


class son1 extends father01{

    @Override
    void loan50K() {
        System.out.println("Loan given!!");
    }


}
