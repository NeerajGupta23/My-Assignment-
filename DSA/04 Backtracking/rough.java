import java.util.ArrayList;

public class rough {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(ar);
        ar.removeAll(ar);
        ;System.out.println(ar);
    }   
}
