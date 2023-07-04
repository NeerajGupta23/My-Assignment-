// Ans 01: 
// In Java, streams are the sequence of data that are read from the source and written to the destination. An input stream is used to read data from the source. And, an output stream is used to write data to the destination.




// Ans 02: 
// Methods of OutputStream
// write() - writes the specified byte to the output stream.
// write(byte[] array) - writes the bytes from the specified array to the output stream.
// flush() - forces to write all data present in output stream to the destination.
// close() - closes the output stream.




// Ans 03: 
// To serialize an object means to convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object. A Java object is serializable if its class or any of its superclasses implements the java. io. Serializable interface




// Ans 04: 
// Serializable interface is a marker interface. The marker interface provides a hint to the Java runtime that the implementing class allows itself to be serialized. The runtime will take advantage of this interface to serialize the object.




// Ans 05: 
// deserialization is the process of converting a stream of bytes to the original state of the object. To perform deserialization, Java provides the ObjectInputStream class, which is again opposite to the ObjectOutputStream






// Ans 06, 07: 
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;
// class Cricketer implements Serializable {
//     private String name;
//     private int age;
//     private int runs;

//     public Cricketer(String name, int age, int runs) {
//         this.name = name;
//         this.age = age;
//         this.runs = runs;
//     }

//     public void Hello() {
//         System.out.println("Hello my name is " + name + " , age = " + age + " , runs = " + runs);
//     } 
// }

// public class april_10 {
//     public static void main(String[] args) throws Exception {
//         Cricketer c1 = new Cricketer("Neeraj", 23, 35000);
//         Cricketer c2 = new Cricketer("Ujjawal", 22, 35000);

//         // File file = new File("prg15.txt");
//         // file.createNewFile();
//         FileOutputStream fos = new FileOutputStream("prg15.txt");
//         ObjectOutputStream oos = new ObjectOutputStream(fos);
//         oos.writeObject(c1);
//         oos.writeObject(c2);
//         oos.flush();
//         oos.close();
//         FileInputStream fis =  new FileInputStream("prg15.txt");
//         ObjectInputStream ois = new ObjectInputStream(fis);
//         Cricketer obj1;
//         obj1 =  (Cricketer)ois.readObject();
//         obj1.Hello();
//         obj1 = (Cricketer)ois.readObject();
//         obj1.Hello();
//         ois.close();
//     }
// }





// Ans 08: 
// Java transient variables are variables whose values are not serialized during serialization and that are initialized by default during de-serialization.





// Ans 09: 
// Java.io - File.
// Java.io - BufferedInputStream.
// Java.io - BufferedOutputStream.
// Java.io - BufferedReader.
// Java.io - BufferedWriter.
// Java.io - ByteArrayInputStream.
// Java.io - ByteArrayOutputStream.




// Ans 10: 

// Serializable: 
// => A serializable interface is used to implement serialization. 
// => Serializable is a marker interface i.e. it does not contain any method.	
// => Serializable interface passes the responsibility of serialization to JVM and the programmer has no control over serialization, and it is a default algorithm.

// Externalizable: 
// => An externalizable interface used to implement Externalization
// => The externalizable interface is not a marker interface and thus it defines two methods writeExternal() and readExternal().
// => The externalizable interface provides all serialization responsibilities to a programmer and hence JVM has no control over serialization.
