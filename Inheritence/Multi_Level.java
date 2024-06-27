class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal
{
    public void bark()
    {
        super.eat();
        System.out.println("Barking");
    }
}

class Cat extends Dog
{
    public void meow()
    {
        super.eat();
        System.out.println("Meowing");
    }
}

public class Multi_Level 
{
    public static void main(String[] args) 
    {
        // Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        // a.eat();
        // d.eat();
        d.bark();
        // c.eat();
        c.meow();
        
    }
}
