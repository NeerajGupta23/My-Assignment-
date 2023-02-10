// ans 1: 
// The static keyword is used for a constant variable or a method that is the same for every instance of a class, so that program take less memory
import java.lang.Thread.State;
import java.util.Scanner;

class Farmer {
    int pa;
    float td;
    static float ri; // => allocate only one time and save memory(because it is same for every
                     // object)
    float si;

    static {
        ri = 8.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please mention the amount required: ");
        pa = scan.nextInt();
        System.out.print("Please mention time duration: ");
        td = scan.nextFloat();
        // ri = 8.5f; => we can use this instead of static variable but it will consume
        // more memory according to no. of objects
    }

    void compute() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("Simple interest is: " + si);
    }
}

public class feb_07_08 {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }
}

// ans 2 :
// classloading is the process of loading class files into jvm at runtime, It is
// responsible for loading classes from various sorces, such as the file system,
// network, and databases, and making them availabe to the JVM for execution
// the class loading has three phases: loading, linking and initialization

// ans 3:
// static variable is a class variable (for whole class). So if we have static
// local variable (a variable with scope limited to function), it violates the
// purpose of static. Hence compiler does not allow static local variable

// ans 4:
// The static blocks always execute first before the main() method in Java
// because the compiler stores them in memory at the time of class loading and
// before the object creation. Here, the compiler executes all the static blocks
// first, and after finishing the static block execution, it invokes the main()
// method

// ans 5:
// A static method is a method that belongs to a class rather than an instance
// of a class. This means you can call a static method without creating an
// object of the class therfore static method also called as class method

// ans 6:
// static block is used to perform initialization of the static variable

// ans 7:
// Instance variables are declared in a class, but outside a method, constructor
// or any block.
// Instance variables are created when an object is created with the use of the
// keyword 'new' and destroyed when the object is destroyed.
// Class variables also known as static variables are declared with the static
// keyword in a class, but outside a method, constructor or a block.
// Static variables are created when the program starts and destroyed when the
// program stops.

// ans 8:
// Static variables are shared among all instances of a class. Non static
// variables are specific to that instance of a class. Static variable is like a
// global variable and is available to all methods. Non static variable is like
// a local variable and they can be accessed through only instance of a class.