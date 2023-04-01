import java.util.HashSet;

//Write a Java program to remove all of the elements from a hash set
public class Question4 {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("Lily");
        st.add("Hana");
        st.add("Avery");
        st.add("Grayson");
        st.add("Jameson");
        st.add("Nash");
        st.add("Alexander");
        System.out.println("Set: "+st);
        st.clear();
        System.out.println("Set: "+st);
    }
}

