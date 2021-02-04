
interface cat {
    void run();
    void eat();
    void sleep();
}

class DomesticCat implements cat {
    public void run() {
        System.out.println("Domestic Cat Running");
    }
    public void eat() {
        System.out.println("Domestic Cat Eating");
    }
    public void sleep() {
        System.out.println("Domestic Cat Sleeping");
    }
    public void play() {
        System.out.println("Domestic Cat Playing");
    }
}


class StreetCat implements cat {
    public void run() {
        System.out.println("Street Cat Running");
    }
    public void eat() {
        System.out.println("Street Cat Eating");
    }
    public void sleep() {
        System.out.println("Street Cat Sleeping");
    }
    public void searchFood() {
        System.out.println("Street Cat Searching Food");
    }
}


class WildCat implements cat {
    public void run() {
        System.out.println("Wild Cat Running");
    }
    public void eat() {
        System.out.println("Wild Cat Eating");
    }
    public void sleep() {
        System.out.println("Wild Cat Sleeping");
    }
    public void play() {
        System.out.println("Wild Cat Playing");
    }
}

class X {
    cat a;
    X(cat aa) {
        a = aa;
    }
}

class XX {
    WildCat a;
    XX(WildCat aa) {
        a = aa;
    }
}


public class DependencyInjection {
    public static void main(String[] args) {
        new X(new WildCat());
        new X(new StreetCat());
        new XX(new WildCat());
    }
}