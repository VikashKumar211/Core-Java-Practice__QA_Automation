package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String[] args) {
        father f1 = new father();
        f1.home();
        son s1 = new son();
        s1.home();
        System.out.println("----");
        s1.newhome();
        System.out.println(s1.gold);
    }
}

class father{

    father() {
        System.out.println("Default constructor");
    }
    int gold = 100;
    void home() {
        System.out.println("father house");
    }

}

class son extends father{
    son(){
        super();
    }

    int gold = 200;

    void bike(){
        System.out.println("son bike");

    }


    void newhome(){
        super.home();

        this.bike();

    }

}

