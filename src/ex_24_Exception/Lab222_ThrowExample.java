package ex_24_Exception;

public class Lab222_ThrowExample {
    public static void main(String[] args) {
        valid_age_for_club(17);

    }
    static void valid_age_for_club(int age){
        if(age<18){
            try{
                throw new Exception("can not go");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }else{
            System.out.println("enjoy club");
        }
    }
}
