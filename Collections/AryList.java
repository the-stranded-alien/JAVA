import java.util.ArrayList;
import java.util.Iterator;

public class AryList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    
        list.add("Sahil");
        list.add("Gupta");
        
        System.out.println("LIST : " + list);

        String name = list.get(0);
        System.out.println(name);
        Object lname = list.get(1);
        System.out.println(lname);
        list.set(1, "Bangalore");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        //list.clear();
        if(list.contains("Bangalore")) {
            System.out.println("City");
        } else {
            System.out.println("NO City");
        }
        
        list.add("Gupta");
        list.add("Bangalore");

        for(String str : list) {
            System.out.println(str);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator<String> itr = list.iterator();
        // System.out.println(itr.next());
        // System.out.println(itr.next());
        // System.out.println(itr.next());

        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Sahil")){
                itr.remove();
            }
        }
        System.out.println(list);
    }
} 