class Animal{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
    void eat() {
        System.out.println("Dog is eating");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    
    }
}
/*In this example, Dog is a subclass of Animal. 
The Dog class inherits the eat method from the Animal class and provides its own implementation by overriding the method.
 The Dog class also has an additional method bark.
 In this example, Dog is a subclass of Animal.
  The Dog class inherits the eat method from the Animal 
  class and provides its own implementation by overriding the method. 
 The Dog class also has an additional method bark.*/