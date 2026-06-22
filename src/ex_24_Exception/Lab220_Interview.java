package ex_24_Exception;

import java.io.File;
import java.io.FileInputStream;

public class Lab220_Interview {
    public static void main(String[] args) {
        try{
            FileInputStream f1= new FileInputStream(new File("C://abc.txt"));
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("File not found");
        }finally {
            System.out.println("Always run");
        }
    }
}
