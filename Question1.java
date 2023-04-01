import java.util.ArrayList;
//Q1. Write a Java program to join two array lists
public class Question1 {

    public static void main(String[] args) {
            ArrayList<String> st=new ArrayList<>();
            st.add("Lily");
            st.add("Hana");
            st.add("Avery");
            System.out.println("List 1: "+st);
            ArrayList<String> st1=new ArrayList<>();
            st1.add("Grayson");
            //st1.add("Jameson");
            //st1.add("Nash");
            System.out.println("List 2: "+st1);
            st.addAll(st1);
            System.out.println("Joined List: "+st);
        }
}

