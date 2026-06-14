package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a;  //java will do the implicit widening by their own
        // chhote dabbe se bade badde me rakhne me koi issue nhi hota
        // Storing from smaller to bigger - > no Risk of data loss
        System.out.println(b);
    }
}
