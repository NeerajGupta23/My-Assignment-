// Ans 01: Inheritance in Java is a concept that acquires the properties from one class to other classes; for example, the relationship between father and son. Inheritance in Java is a process of acquiring all the behaviours of a parent object.



// Ans 02: In Java, the superclass, also known as the parent class , is the class from which a child class (or a subclass) inherits its constructors, methods, and attributes. For instance, in our above example, BankAccount was the superclass from which our subclass SavingsAccount inherited its values.



// Ans 03: Inheritance in java is one of the core concepts of Object-Oriented Programming. Java Inheritance is used when we have is-a relationship between objects. Inheritance in Java is implemented using extends keyword.
// class A {
//     public void disp() {
//         System.out.println("Hello");
//     }
// }

// class B extends A {
//     public void disp1() {
//         System.out.println("Hello1");
//     }
// }

// public class feb_20 extends A{
//     public static void main(String[] args) {
//         B b = new B();
//         b.disp();
//         b.disp1();
//     }
// }



// Ans 04: Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance. Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks.



// Ans 05: 
// Method Overloading: 
// => Method overloading is a compile-time polymorphism.
// => It helps to increase the readability of the program.
// => It occurs within the class.
// => Method overloading may or may not require inheritance.
// => In method overloading, methods must have the same name and different signatures.

// Method Overriding: 
// => Method overriding is a run-time polymorphism.
// => It is used to grant the specific implementation of the method which is already provided by its parent class or superclass.
// => It is performed in two classes with inheritance relationships.
// => Method overriding always needs inheritance.
// => In method overriding, methods must have the same name and same signature.



// Ans 06: 
// Abstraction is a process of hiding the implementation details and showing only functionality to the user. Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message.

// abstract class Animal {
//     // Abstract method (does not have a body)
//     public abstract void animalSound();
//     public void sleep() {
//         System.out.println("Zzz");
//     }
// }

// class Pig extends Animal {
//     public void animalSound() {
//         System.out.println("The pig says: wee wee");
//     }
// }

// class feb_20 {
//     public static void main(String[] args) {
//         Pig myPig = new Pig();
//         myPig.animalSound();
//         myPig.sleep();
//     }
// }





// Ans 07:  The abstract method is incomplete while the final method is regarded as complete. The only way to use an abstract method is by overriding it, but you cannot override a final method in Java.
// abstract eg 
// abstract class AbstractMethodTest{
// 	abstract void show();
 
// }
// public class feb_20 extends AbstractMethodTest {
//     void show() {
//         System.out.println("Inside overridden show method");
//     }
// 	public static void main(String args[]){
// 		//creating object of Main Class
// 		feb_20 obj = new feb_20();
// 		obj.show();
// 	}
// }


// final eg. 
// class FinalMethodTest{
// 	final void show(){
// 		System.out.println("w3spoint.com");
// 	}
// }
// public class feb_20 extends FinalMethodTest{
// 	public static void main(String args[]){
// 		//creating object of FinalMethodTest Class
// 		FinalMethodTest obj = new FinalMethodTest();
// 		obj.show();
// 	}
// }




// Ans 08: The final class is a class that is declared with the final keyword. We can restrict class inheritance by making use of the final class. Final classes cannot be extended or inherited. If we try to inherit a final class, then the compiler throws an error during compilation.




// Ans 09: 
// Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates. Another way to think about encapsulation is, that it is a protective shield that prevents the data from being accessed by the code outside this shield. Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of its own class in which they are declared. As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding. Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables. 

// Abstraction in Java
// Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or the non-essential units are not displayed to the user. Ex: A car is viewed as a car rather than its individual components. Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects. 



// Ans 10: 
// Compile Time Polymorphism: Whenever an object is bound with its functionality at the compile time, this is known as the compile-time polymorphism. At compile-time, java knows which method to call by checking the method signatures. So this is called compile-time polymorphism or static or early binding. Compile-time polymorphism is achieved through method overloading. Method Overloading says you can have more than one function with the same name in one class having a different prototype. Function overloading is one of the ways to achieve polymorphism but it depends on technology and which type of polymorphism we adopt. In java, we achieve function overloading at compile-Time. The following is an example where compile-time polymorphism can be observed. 
// public class feb_20 {
// 	public static int add(int a, int b)
// 	{
// 		return a + b;
// 	}
// 	public static double add(
// 		double a, double b)
// 	{
// 		return a + b;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(add(2, 3));
// 		System.out.println(add(2.0, 3.0));
// 	}
// }


// Run-Time Polymorphism: Whenever an object is bound with the functionality at run time, this is known as runtime polymorphism. The runtime polymorphism can be achieved by method overriding. Java virtual machine determines the proper method to call at the runtime, not at the compile time. It is also called dynamic or late binding. Method overriding says the child class has the same method as declared in the parent class. It means if the child class provides the specific implementation of the method that has been provided by one of its parent classes then it is known as method overriding. The following is an example where runtime polymorphism can be observed.
// class Test {
// 	public void method()
// 	{
// 		System.out.println("Method 1");
// 	}
// }
 
// public class feb_20 extends Test {
// 	public void method()
// 	{
// 		System.out.println("Method 2");
// 	}
// 	public static void main(String args[])
// 	{
// 		Test test = new feb_20();
// 		test.method();
// 	}
// }