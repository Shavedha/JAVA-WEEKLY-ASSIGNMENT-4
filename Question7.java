import java.util.PriorityQueue;

public class Question7 {
    //Write a Java program to convert a Priority Queue elements to a string representation
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Maeve");
        pq.add("Otis");
        pq.add("Beck");
        pq.add("Peach");
        pq.add("Joe");
        System.out.println("Priority Queue: "+pq);
        String st1 = pq.toString();
        System.out.println("String Representation: "+st1);

    }
}
