package ex_26_Generic;

public class Lab_GenericClass {
    public static void main(String[] args) {
        IntTypeClass a1 = new IntTypeClass(12);
        genericDataType a2 = new genericDataType(12.4);
        genericDataType a3 = new genericDataType("kumar");
     //   IntTypeClass a2 = new IntTypeClass("kumar"); //java: incompatible types: java.lang.String cannot be converted to java.lang.Integer
        a1.print();
        a2.print();
        a3.print();
    }

}
class IntTypeClass{
    private Integer data;

    public IntTypeClass(Integer data) {
        this.data = data;
    }
    public Integer getData(){
        return data;
    }
    void print(){
        System.out.println(getData());
    }

}

class genericDataType<T>{
    private T data2;
    public genericDataType(T data2){
        this.data2 = data2;
    }
    public T getData2(){
        return data2;
    }
    void print(){
        System.out.println(getData2());
    }

}
