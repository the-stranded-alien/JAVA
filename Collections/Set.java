import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("John");
        set.add("Jack");
        set.add("Jennie");
        set.add("Jim");
        set.add("John");
        set.add("Joe");
        set.add("John");
        System.out.println(set);
    
    
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Jim");
        if(set.contains("John")) {
            System.out.println("John is in set");
        }
    }
}