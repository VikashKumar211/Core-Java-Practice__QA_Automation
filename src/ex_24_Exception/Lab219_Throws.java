package ex_24_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader f1 = new FileReader(new File("C://abc.txt"));

    }
}
