import java.util.*;

class Q2 {
    
    public static void main(String[] args){
        HashMap<String, String> h1 = new HashMap();
        HashMap<String, Integer> h2 = new HashMap();

        h1.put("A", "Python, Maths, C");
        h1.put("B", "C, C++");
        h1.put("C", "C++, Physics, Chemistry");

        h2.put("Python", 111);
        h2.put("Maths", 222);
        h2.put("C", 333);
        h2.put("C++", 444);
        h2.put("Physics", 555);
        h2.put("Chemistry", 666);
        h2.put("Digital Electronics", 777);

        String subjectOfB = h1.get("B");
        String[] subjects = subjectOfB.split(", ");
        for (String subject : subjects ) {
            System.out.println(h2.get(subject));
        }
        
    }

}