package ex_24_Exception;

public class Lab209 {
    public static void main(String[] args) {
        int a= 0;
        int b = 0;

        try{
            b = 10/0;
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
//        catch (Exception f){   // exception java.lang.Exception has already been caught
//            System.out.println(f.getMessage());
//        }
        System.out.println(b);
    }
}
