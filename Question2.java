import java.util.*;

//Write a Java program to retrieve but does not remove, the first element of a linked list.
public class Question2 {
    public static void main(String[] args) {
        LinkedList<String> st=new LinkedList<>();
        st.add("Lily");
        st.add("Hana");
        st.add("Avery");
        st.add("Grayson");
        st.add("jameson");
        System.out.println("List 1: "+st);
        String s=st.peek();
        System.out.println(s);

    }

}
