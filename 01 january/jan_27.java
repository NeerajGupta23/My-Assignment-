// ans 1 =  dynamically type = The interpreter assigns variables a type at runtime based on the variable's value at the time. and statically typed = A statically-typed language is a language (such as Java, C, or C++) where variable types are known at compile time

// ans 2 = variable in java refer to a container which stores data in memory blocks, the size of variable is varying according to it's data 

// ans 3 = we can assign a value in variable in two different ways: a.) int var1 = 57; or int var2; var2 = 57;

//ans 4 = primitive data types in java are: byte , short , int , long, float , double, boolean, char .

// ans 5 = identifiers are the name given by programmer to methods, variable, class etc.

// ans 6 = Operators in java = + , - , * , / , % , ! , && , || ,  ++ , -- etc.

// ans 7 = Increment operator => increse the value of variable by one => a.) post increment (a++) and pre increment (++a)
// Decrement operator => decrease the value of variable by one => a.) post decrement (a--) and pre decrement (--a)
// eg. 
public class jan_27 {
    public static void main(String[] args) {
        int i = 6;
        System.out.println(i++ + "  " + ++i + "  " + i-- + "  " + --i);
    }
}