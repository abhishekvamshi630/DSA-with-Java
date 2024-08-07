public class abstraction {
    public static void main(String[] args) {
        Horse hs  = new Horse();
        hs.eat();
        hs.walk();

        chicken ck = new chicken();
        ck.eat();
        ck.walk();
    }
}

// Abstract class 
abstract class Animal {
    void eat() {
        System.out.println("Can eats!...");
    }

    abstract void walk();
}

// child class 
class Horse extends Animal {
    void walk(){
        System.out.println("Walks on 4 legs..");
    }
}

class chicken extends Animal {
    void walk(){
        System.out.println("Walks on 4 legs..");
    }
}

