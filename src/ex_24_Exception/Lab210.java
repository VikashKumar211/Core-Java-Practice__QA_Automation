package ex_24_Exception;

public class Lab210 {
    public static void main(String[] args) {
        String s1 = null;

        try{
            s1.trim();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}
