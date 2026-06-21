package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        car c1 = new car();
      //  System.out.println(c1.display());
        c1.display();
        System.out.println(c1.max_speed);
    }
}

class vehicle{
    public int max_speed = 180;

    void notest(){
        System.out.println("DC");
    }
    vehicle(){
        System.out.println();
    }
    vehicle(int a){
        System.out.println("PC");
    }
    vehicle(int a, int b){
        System.out.println("with args and with retrun type");
    }
    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void display(){
        System.out.println("vehicle");
    }

}

class car extends vehicle{
    public int max_speed=210;

    car(){
        super(100);
    }
    void test(){
    }

    void display(){

        System.out.println(super.max_speed);
        System.out.println("car");
        super.notest();
        this.test();

    }
}