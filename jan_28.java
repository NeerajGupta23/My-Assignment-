// ans 1 = there are total 3 conditional operator in java 1st logical and operator (&&) it is only true if both of their operands are true otherwise false
// eg. System.out.println(((1==1) && (2 != 1)) + "  " + ((1 > 2) && (2 ==2 ))); => print:  true false
// 2nd logical operator is || => it gives value true if atleast one operands is true otherwise give false
// eg. System.out.println(((1==1) || (2 != 1)) + "  " + ((1 > 2) || (2 !=2 )));
// 3rd conditional operator is ternary operator (?:) it is a shorthand of if-else statment
// val % 2 = 0 ? System.out.println("value entered is even") : System.out.println("value entered is odd") 


// ans 2 = three types 1st is unary operator 2nd is binary operator 3rd is ternary operator



// ans 3 = we can use switch case in the place of if else blocks because it improve readibility of code, so that programmers get easily understand, 
// syntax: switch(expression) {
//     case 1: code1;
//             break;
//     case 2: code2;
//             break;
//     default: code3;
// }



// ans 4 = Parentheses > Multiplication/Division/modulus > Addition/Subtraction



// ans 5 = Conditional statements are mostly used in decision-making scenarios which means these statements take a decision on the basis of some conditions. The conditional statements are also referred as branching statements because the program takes a decision based on the result of the assessed condition. A very simple example of conditional statements from our daily life can be if today is Friday, then tomorrow will be Saturday.
// types: 1.)if statement in Java  2.)else Statement in Java  3.)else if Statement in Java  4.)ternary Operator in Java



// ans 6 =
// if(expression) {
//     block1;
//     block2;
// }
// else {
//     block3;
//     block4;
// }



// ans 7 = three types of iterative statements in java are: 1st for loop , 2nd while loop, 3rd do-while loop



// ans 8 = The difference between while and do while loop is that in the while loop the condition is checked prior to executing any statements whereas in the case of do while loop, statements are run at least once, and then the condition is verified.


// ans 9 = 
public class jan_28 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }
}