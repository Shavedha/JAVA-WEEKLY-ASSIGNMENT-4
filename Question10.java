import java.util.TreeMap;

public class Question10 {
//    Write a Java program to get a key-value mapping associated with the least key greater than or
//    equal to the given key. Return null if there is no such key.
public static void main(String[] args) {
    TreeMap< Integer, String > np = new TreeMap < Integer, String > ();
    // Put elements to the map
    np.put(1,"Ross");
    np.put(2,"Joey");
    np.put(4,"Chandler");
    np.put(5,"Monica");
    np.put(6,"Phoebe");
    np.put(7,"Rachel");

    System.out.println("Orginal TreeMap content: " + np);
    System.out.println("For Value = 1");
    System.out.println("Value is: " + np.floorEntry(1));
    System.out.println("For Value = 4");
    System.out.println("Value is: " + np.floorEntry(4));
    System.out.println("For Value = 7");
    System.out.println("Value is: " + np.floorEntry(7));
}
}
