import java.util.HashSet;

//Write a Java program to compare two hash set
public class Question5 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Avery");
        st.add("Grayson");
        st.add("Jameson");
        st.add("Nash");
        st.add("Alexander");
        HashSet<String> lt = new HashSet<>();
        lt.add("Avery");
        lt.add("Grayson");
        lt.add("Nan");
        lt.add("Nash");
        for (String element : st) {
            System.out.println(lt.contains(element) ? "Yes" : "No");
        }
    }
}

