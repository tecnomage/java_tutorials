package module2;

// Define a base class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Define a derived class
class Dog extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

// Define another derived class
class Cat extends Animal {
    // Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// this code shows how Inheritance and Polymorphism work
public class Inheritance {
    public static void main(String[] args) {
        // Create objects of the derived classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the overridden methods
        myDog.makeSound();
        myCat.makeSound();
    }
}