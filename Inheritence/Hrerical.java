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

class Cat extends Animal
{
    public void meow()
    {
        super.eat();
        System.out.println("Meowing");
    }
}

public class Hrerical 
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        Cat c = new Cat();
        // d.eat();
        // d.bark();
        c.meow();

    }
}
