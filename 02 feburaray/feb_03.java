// ans 1 = string is collection of character which is enclosed within double quotes


// ans 2  = types of string = 2 types 
// 1st => immutable string(not changable) = use String class
// 2nd => mutable string(changable) = StringBuilder and StringBuffer


public class feb_03 {
    public static void main(String[] args) {
        
        // ans 3 = In 3 ways we can create string object in java
        String varName1 = "PW1";
        String varName2 = "PW2";
        char []ch = {'P', 'W' , '3'};
        String varName3 = new String(ch);
        StringBuilder varName4 = new StringBuilder("PW4");
        System.out.print(varName1 + "  " + varName2 + "  " + varName3 + "  " + varName4);


        // ans 4 = string constant pool(scp) is memory area present in heap which does not allow duplicate objects and in this memory area garbage is not collected by garbage collector.
        
        
        // ans 5 = immutable objects are those object which doesn't changable and mutable objects are those object which is cahngable. eg.
        String str1 = "pwskills"; //immutable object
        StringBuilder str2 = new StringBuilder("PWSKILLS"); // mutable object
        System.out.println("\n" + str1 + "   " + str2);
        str1.concat(" modified");
        str2.append(" modified");
        System.out.println(str1 + "   " + str2);


        // ans 6 = string constant pool(scp) is located in stack memory area 
    }
}