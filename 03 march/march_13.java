// Ans 01: Multithreading is a programming concept in which the application can create a small unit of tasks to execute in parallel. If you are working on a computer, it runs multiple applications and allocates processing power to them. A simple program runs in sequence and the code statements execute one by one.
// Multithreading saves time as you can perform multiple operations together. The threads are independent, so it does not block the user to perform multiple operations at the same time and also, if an exception occurs in a single thread, it does not affect other threads


// Ans 02: 
// Improved throughput. 
// Simultaneous and fully symmetric use of multiple processors for computation and I/O.
// Superior application responsiveness. 
// Improved server responsiveness. 
// Minimized system resource usage. 
// Program structure simplification. 
// Better communication.



// Ans 03: A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently. Every thread has a priority. Threads with higher priority are executed in preference to threads with lower priority.



// Ans 04: 
// 1st way is by runnable interface: 
// class MyClass implements Runnable {
//     public void run() {
//         System.out.println("Expression 01");
//         System.out.println("Expression 02");
//         System.out.println("Expression 03");
//     }
// }
// public class march_13 {
//     public static void main(String[] args) {
//         MyClass t = new MyClass();
//         Thread t1 = new Thread(t);
//         Thread t2 = new Thread(t);
//         Thread t3 = new Thread(t);
//         t1.start();
//         t2.start();
//         t3.start();
//     }    
// }


// 2nd way is by thread class: 
// class MyClass extends Thread {
//     public void run() {
//         System.out.println("Expression 01");
//         System.out.println("Expression 02");
//         System.out.println("Expression 03");
//     }
// }
// public class march_13 {
//     public static void main(String[] args) {
//         MyClass t1 = new MyClass();
//         MyClass t2 = new MyClass();
//         MyClass t3 = new MyClass();
//         t1.start();
//         t2.start();
//         t3.start();
//     }    
// }


// Ans 05: 
// Process 
// Process means any program is in executio
// The process takes more time to terminate.
// It takes more time for creation.
// It also takes more time for context switching.
// The process is less efficient in terms of communication.

// Thread
// Thread means a segment of a process.
// The thread takes less time to terminate.
// It takes less time for creation.
// It takes less time for context switching.
// Thread is more efficient in terms of communication.



// Ans 06: Daemon thread in Java is a low-priority thread that runs in the background to perform tasks such as garbage collection. Daemon thread in Java is also a service provider thread that provides services to the user thread. Its life depends on the mercy of user threads i.e. when all the user threads die, JVM terminates this thread automatically.
// Java program to demonstrate the usage of
// setDaemon() and isDaemon() method.

// public class march_13 extends Thread {
//     public march_13(String name) {
//         super(name);
//     }

//     public void run() {
//         if (Thread.currentThread().isDaemon()) {
//             System.out.println(getName() + " is Daemon thread");
//         } else {
//             System.out.println(getName() + " is User thread");
//         }
//     }

//     public static void main(String[] args) {
//         march_13 t1 = new march_13("t1");
//         march_13 t2 = new march_13("t2");
//         march_13 t3 = new march_13("t3");
//         t1.setDaemon(true);
//         t1.start();
//         t2.start();
//         t3.setDaemon(true);
//         t3.start();
//     }
// }




// Ans 07: 
// In Java, the wait() method is used to pause the execution of a thread until another thread signals that it can resume. When a thread calls wait() on an object, it releases the lock on the object and waits until another thread calls notify() or notifyAll() on the same object.

// sleep causes the current thread to suspend execution for a specified period. This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system.