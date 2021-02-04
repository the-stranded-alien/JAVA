
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



public class InterfaceExample {
    public static void main(String[] args) {
        DomesticCat cat1 = new DomesticCat();
        cat1.run();
        cat1.eat();
        cat1.sleep();
        cat1.play();
    
        WildCat cat2 = new WildCat();
        cat2.run();
        cat2.eat();
        cat2.sleep();
        cat2.play();

        // cat cat3 = new cat(); // Error
        cat cat4 = new StreetCat();
        StreetCat cat5 = new StreetCat();
        cat cat6 = new WildCat(); 

        // cat4.searchFood(); // Error 

        cat4.sleep();
    }
}