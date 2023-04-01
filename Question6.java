import java.util.TreeSet;

public class Question6 {
//    Write a Java program to retrieve and remove the last element of a tree set.
public static void main(String[] args) {
    TreeSet<Integer> tr=new TreeSet<Integer>();
    tr.add(45);
    tr.add(56);
    tr.add(12);
    tr.add(24);
    tr.add(90);
    tr.add(78);
    System.out.println("The Tree Set: "+tr);
    System.out.println("The last element: "+tr.pollLast());
    System.out.println("Tree set after removing the last element: "+tr);
}
}
