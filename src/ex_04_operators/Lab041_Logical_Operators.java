package ex_04_operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args){
        boolean a = true;

        System.out.println(!a); //false
        System.out.println(!!a);  //true
        System.out.println("-----------");  //true

        // OR GATE
        /*
        T T -> T
        T F -> T
        F F -> F
        F T -> T
         */

        boolean c = true || false;
        boolean d = true || true;
        boolean e = false || false;
        boolean f = false || true;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        //AND GATE &&
                /*
        T T -> T
        T F -> F
        F F -> F
        F T -> F
         */
        System.out.println("---------");
        boolean G = true && false;
        boolean H = true && true;
        boolean I = false && false;
        boolean J = false && true;
        System.out.println(G);
        System.out.println(H);
        System.out.println(I);
        System.out.println(J);



    }
}
