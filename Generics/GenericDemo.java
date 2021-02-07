import java.util.*;

class A {
    public String toString() {
        return "Class A Object";
    }
}

class B {
    public String toString() {
        return "Class B Object";
    }
}

class GenericDemo {
    public static void main(String args[]) {
        List v = new ArrayList();
        v.add(new A());
        v.add(new A());
        // v.add(new B());
        Iterator en = v.iterator();
        while(en.hasNext()) {
            A o = (A)en.next();
            System.out.println(o);
        }
    }
}