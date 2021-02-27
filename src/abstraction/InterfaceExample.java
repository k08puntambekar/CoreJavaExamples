package abstraction;

interface InterfaceExample {

    public void animalSound();
    public void animalLegs();

}

class Dog implements InterfaceExample {

    @Override
    public void animalSound() {
        System.out.println("Bark Bark....");
    }

    @Override
    public void animalLegs() {
        System.out.println("Dog has 4 legs!");
    }
}

class Cat implements InterfaceExample {

    @Override
    public void animalSound() {
        System.out.println("Meow Meow.....");
    }

    @Override
    public void animalLegs() {
        System.out.println("Cat has 4 Legs!");
    }
}

class Spider implements InterfaceExample {

    @Override
    public void animalSound() {
        System.out.println("Purr Purr....");
    }

    @Override
    public void animalLegs() {
        System.out.println("Spider has 8 Legs!");
    }
}

class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.animalLegs();
        dog.animalSound();

        Cat cat = new Cat();
        cat.animalLegs();
        cat.animalSound();

        Spider spider = new Spider();
        spider.animalLegs();
        spider.animalSound();
    }
}


