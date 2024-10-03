// Superclass
class Animal {
    String name;

    public void eat() {
        System.out.println("This animal is eating.");
    }
    public void A() {
        System.out.println("This animal is eating.");
    }
}

// Subclass
class Dog extends Animal {

    // Subclass-specific method
    public void bark() {
        System.out.println("The dog is barking.");
    }
    public void eat() {
        System.out.println("This animal.");
    }
}

public class Main {
    public static void main(String[] args) {
            Animal myDog =  new Dog();
            Dog dog= new Dog();
        myDog.name = "Buddy";
        //myDog.eat();  // Outputs: This animal is eating.
        dog.bark();
        dog.eat();
        myDog.A();// Outputs: The dog is barking.
    }
}
