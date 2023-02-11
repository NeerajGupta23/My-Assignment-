// ans 1: 
// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created(zero parametrized or no zero parametrized).


// ans 2:
// Constructor chaining is the process of calling a sequence of constructors. We can do it in two ways: by using this() keyword for chaining constructors in the same class. by using super() keyword for chaining constructors from the parent class.


// ans 3:
// No, we cannot call subclass constructor from superclass constructor.



// ans 4: 
// If we add a return type to a constructor, then it will become a method of the class.


// ans 5: 
// no arg constructor is a constructor which does not take any argument and it is written by programmer.


// ans 6:
// if the programmer writes any constructor in the code, then the compiler doesn't add any constructor. Every default constructor is a no argument constructor but every no argument constructor is not a default constructor.


// ans 7: 
// As construction overloading enables the creation of the object of a specific class in several ways ( with different types and different numbers of arguments), and ease the programmer work.



// ans 8: 
// A default constructor is a constructor created by the compiler if we do not define any constructor(s) for a class.
class Demo {
    private int a;
    private int b;
    // automatic default constructor(zero parameterized constructor) added
    // public Demo() {
    // }
    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}
public class feb_10 {
    public static void main(String[] args) {
        Demo d = new Demo(); //here Demo() constructor is not there then why that code not give error => behind the scene automatic default constructor is added (if there is parameterized constructor is not present)
        d.disp(); // not give error because there is disp method is present 
        // d.add(); give error because there add method is not in that class
        Demo d1 = new Demo(); // not give error because it is default constructor (ie zero parameterized cunstructor)
        // Demo d2 = new Demo("neeraj"); give error because that cunstructor is not zero parameteriezed cunstructor

    }    
}
