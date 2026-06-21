package ex_21_Static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB s1= new ATB(1122, "vikash");
        ATB s2= new ATB(3344, "kumar");
        s1.display();
        s2.display();
        System.out.println(s1.phone_no);
    }


}

class ATB{
    int phone_no;
    String name;

    static String courseName = "JavaLearning";
    public ATB(int phone_no, String name){
        this.phone_no = phone_no;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_no+ " " + this.name+" " + courseName);
    }

    static void attendance(){
        System.out.println("Mark attendance");
    }
}
