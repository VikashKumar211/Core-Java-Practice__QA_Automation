package ex_19_OOPs_Part2.accessmodifer.cops;

public class jrPolice {
    public static void main(String[] args) {
        police p1= new police(10);

        System.out.println(p1.iCard);
//        System.out.println(p1.gun);
        p1.canShoot();
    }

}


