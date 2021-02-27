package abstraction;

abstract class AbstractClassExample {

    public abstract void animalSound();

    public void animalLegs() {
        System.out.println("All animals have 4 legs!");
    }
}

class Dog1 extends AbstractClassExample {

    @Override
    public void animalSound() {
        System.out.println("Bark Bark...");
    }
}

class Cat1 extends AbstractClassExample {

    @Override
    public void animalSound() {
        System.out.println("Meow Meow....");
    }
}

class abstractMain {
    public static void main(String[] args) {

        Dog1 dog = new Dog1();
        dog.animalSound();
        dog.animalLegs();

        Cat1 cat = new Cat1();
        cat.animalSound();
        cat.animalLegs();
    }
}
