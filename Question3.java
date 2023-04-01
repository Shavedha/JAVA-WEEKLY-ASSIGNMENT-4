import java.util.LinkedList;

//Write a Java program to check if a particular element exists in a linked list
public class Question3 {
    public static void main(String[] args) {
        LinkedList<String> st=new LinkedList<>();
        st.add("Lily");
        st.add("Hana");
        st.add("Avery");
        st.add("Grayson");
        st.add("Jameson");
        st.add("Nash");
        st.add("Alexander");
        System.out.println("List: "+st);
        if(st.contains("Jameson")){
            System.out.println("Jameson is in the list");
        }
        else {
            System.out.println("Jameson is not in the list");
        }

    }
}
