import javax.swing.plaf.nimbus.State;

// q.1 What is an interface in java 
// ans: interface is discribed as what to do not how to do, in interface we can give decalration of methods but not give the definition of those method for defining those method we have to implement that interface in child class and then we can give the implementation of that abstract method present in that interface 

// q.2 Which modifier is allowed for methods in an Interface ? Wxplain with an example 
// public, abstract, static, and default modifiers is allowed for method in interface 
interface myInterface {
    void disp1();

    public void disp2();

    abstract void disp3();

    public abstract void disp4();

    default void disp5() {
        System.out.println("Hello 5");
    }

    static void disp6() {
        System.out.println("Hello 6");
    }
}

class myClass implements myInterface {
    public void disp1() {
        System.out.println("Hello 1");
    }

    public void disp2() {
        System.out.println("Hello 2");
    }

    public void disp3() {
        System.out.println("Hello 3");
    }

    public void disp4() {
        System.out.println("Hello 4");
    }
}

public class feb_27 {
    public static void main(String[] args) {
        // q.2
        myInterface m = new myClass();
        m.disp1();
        m.disp2();
        m.disp3();
        m.disp4();
        m.disp5();
        myInterface.disp6();




        // ans 3
        // Interfaces are used in Java to achieve abstraction. By using the implements keyword, a java class can implement an interface. In general terms, an interface can be defined as a container that stores the signatures of the methods to be implemented in the code segment. It improves the levels of abstraction and with the help of interface we can achieve 100% abstration.



        // ans 4: 
        // Abstratct class : 
        // -> here we can create constructor 
        // -> here we have to make the method as abstract 
        // -> here by default varibles are not public Static and final 
        // -> here we use extends keyword to extened that class 
        // -> if any method in class is abstract type then we have tk make class as a abstract class 
        // -> here we can create static and non static blocks 

        
        // interface 
        // -> here we can't create constructor 
        // -> here we may or may not use abstract keyword 
        // -> here by default variable is public, static and final
        // -> here we use implements keyword to implement that interface in a class 
        // -> in by default every methods are public and abstract 
        // -> here we can't create static and non static blocks 
    }
}
