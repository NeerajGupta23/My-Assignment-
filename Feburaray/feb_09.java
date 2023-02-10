// ans 1:
// Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.
// In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.



// ans 2: 
// Encapsulation prevents outer classes from accessing and changing fields and methods of a class. This also helps to achieve data hiding.



// ans 3:
// Getters and setters are used to protect your data, particularly when creating classes. For each instance variable, a getter method returns its value while a setter method sets or updates its value.



// ans 4: 
// The this keyword refers to the current object in a method or constructor. The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name
// eg.
class Student {
    private int age;
    private String name;

    public void setAgeName(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class feb_09 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAgeName(21, "Neeraj");
        obj1.setAgeName(25, "Pawan");
        obj.show();
        obj1.show();
    }
}



// ans 5:
// The class will maintain its data members and methods as read-only. Data
// hiding prevents the user from the complex implementations in the code. The
// variables of the class can be read-only or write-only as per the programmer's
// requirement.



// ans 6:
class Student1 {
    private int age;
    private String name;
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void show() {
        System.out.println(name + " " + age);
    }

}

public class feb_09 {
    public static void main(String[] args) {
        Student1 obj = new Student();
        Student1 obj1 = new Student();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("Navin");
        obj1.setName("Kiran");

        int stud1Age = obj.getAge();
        System.out.println(stud1Age);

        int stud2Age = obj1.getAge();
        System.out.println(stud2Age);

    }
}