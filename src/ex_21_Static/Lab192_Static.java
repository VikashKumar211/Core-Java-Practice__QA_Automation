package ex_21_Static;

public class Lab192_Static {
    public static void main(String[] args) {
        students s1 = new students(10);
        students s2 = new students(20);
        System.out.println(s1.age);
        System.out.println(s1.courseName);
        System.out.println(s2.courseName);
        s1.age = 15;
        System.out.println(s1.age);
        System.out.println(s2.age);

        students.m3();
    }



}

class students{
    int age;
    static String courseName = "JavaLearing";

    public students(int age){
        this.age= age;
    }
    static void m3(){
        System.out.println("Static method");
    }
}
