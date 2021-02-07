import java.util.*;

class GenericWildcards {
    List<?> getList() {
        List<String> l = new ArrayList<String>();
        l.add("Hello");
        l.add("Generics");
        return l;
    }
    void print(Collection<?> c) {
        Iterator<?> i = c.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        } 
    }
    public static void main(String args[]) {
        GenericWildcards gwc = new GenericWildcards();
        List<?> l = gwc.getList();
        gwc.print(l);
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(1));
        li.add(new Integer(2)); 
        li.add(new Integer(3));
        gwc.print(li); 
    }
}