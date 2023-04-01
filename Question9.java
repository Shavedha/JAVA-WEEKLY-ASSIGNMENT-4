import java.util.HashMap;
import java.util.Set;

public class Question9 {
    //Write a Java program to get a set view of the keys contained in this map.
    public static void main(String[] args) {
        HashMap<Integer,String> hp= new HashMap<Integer,String>();
        hp.put(1,"Morgan");
        hp.put(2,"Katy");
        hp.put(3,"Charlie");
        hp.put(4,"Jack");
        hp.put(5,"Garver");
        Set key=hp.keySet();
        System.out.println("Keyset values are: "+key);


    }
}
