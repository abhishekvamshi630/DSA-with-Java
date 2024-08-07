public class interfaceInJava {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();;
        b.eats();
    }
}

// creating interface
interface Herbivore {
    void eat();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public void eat(){
        System.out.println("Eats only Grass...");
    }

    public void eats() {
        System.out.println("Eats only animals");
    }
}
