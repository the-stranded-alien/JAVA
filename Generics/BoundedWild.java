import java.util.*;

class A {
    public static void main(String args[]) {

    }
    public String toString() {
        return "Class A";
    }
}

class B extends A {
    public String toString() {
        return "Class B";
    }
}

class C {}

class BoundedWild {
    void print(List<? extends A> c) {
        Iterator<?> i = c.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void main(String args[]) {
        BoundedWild bwc = new BoundedWild();
        List<B> li = new ArrayList<B>();
        li.add(new B());
        li.add(new B());
        bwc.print(li);
        List<A> la = new ArrayList<A>();
        la.add(new A());
        la.add(new A()); 
        bwc.print(la);
        List<C> lc = new ArrayList<C>();
        lc.add(new C());
        lc.add(new C());
        // bwc.print(lc);
    }
}