package ex_24_Exception;

public class Lab206_Checked {
    public static void main(String[] args) {
        int a = 0;
      //  int b;
        try {
            a = 10 / 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);


        String s1 = null;
        try {
            s1.trim();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
