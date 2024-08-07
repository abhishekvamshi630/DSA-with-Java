public class multiLevelInheritance {
    public static void main(String[] args) {
        Dog max = new Dog();
        max.color = "Blue";
        System.out.println(max.color);
    }
}

// Base class 
class Animal{
    String color;
    
    void eat(){
        System.out.println("Can Eats");
    }
}

// derived class
class Mammal extends Animal{
    int legs;
}

// sub class
class Dog extends Mammal{
    String breed;
}
