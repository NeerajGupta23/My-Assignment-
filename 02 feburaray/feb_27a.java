// Ans 01: Lambda Expressions were added in Java 8. A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method. 



// Ans 02: You can pass lambda expressions as arguments to a function. If you have to pass a lambda expression as a parameter, the parameter type should be able to hold it. If you pass an integer as an argument to a function, you must have an int or Integer parameter. If you are passing an instance of a class as a parameter, you must specify the class name or the object class as a parameter to hold the object. 
// interface MyFunctionInterface
// {
//     void abstractFunction(int x);
//       default void nonAbstractFunction()
//     {
//        System.out.println("Hello World!");
//     }
// }
// public class feb_27a
// {
//     public static void main(String args[])
//     {
//         MyFunctionInterface functionObj = (int x) -> System.out.println(x * x);
//         functionObj.abstractFunction(5);
//     }
// }




// Ans 03: An Interface that contains exactly one abstract method is known as functional interface. It can have any number of default, static methods but can contain only one abstract method. It can also declare methods of object class. Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. 



// Ans 04: Lambda expressions are a new and important feature included in Java SE 8. They provide a clear and concise way to represent one method interface using an expression. Lambda expressions also improve the Collection libraries making it easier to iterate through, filter, and extract data from a Collection .



// Ans 05: it is not mandatory for lambda expression to have parameters.