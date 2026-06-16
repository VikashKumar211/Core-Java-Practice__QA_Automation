package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int i = 0;
        while(i > 5){
            System.out.println(i);
            i++;
        }
        System.out.println("-------");
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }while(j > 5);
    }

}
