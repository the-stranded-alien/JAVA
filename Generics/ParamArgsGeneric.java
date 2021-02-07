import java.util.*;

class ParamArgsGeneric {
    List<String> getList() {
        List<String> l = new ArrayList<String>();
        l.add("Hello");
        l.add("Generics");
        return l;
    }
    void print(List<String> c) {
        Iterator<String> i = c.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void main(String args[]) {
        ParamArgsGeneric pag = new ParamArgsGeneric();
        List<String> l = pag.getList();
        pag.print(l);
    }
}