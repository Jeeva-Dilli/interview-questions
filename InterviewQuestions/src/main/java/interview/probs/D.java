package interview.probs;

interface A {

    default void print(){
        System.out.println("Class A");
    }
}
interface B{
    default void print(){
        System.out.println("Class B");
    }
}
class C implements A,B{

    @Override
    public void print() {
        A.super.print();
        B.super.print();
    }
}
public class D
{
    public static void main(String[] args) {
        C c= new C();
        c.print();
    }
}
