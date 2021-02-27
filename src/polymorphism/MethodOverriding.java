package polymorphism;

public class MethodOverriding {

    public void display() {
        System.out.println("From Parent class");
    }

}

class Override extends MethodOverriding {

    public void display() {
        System.out.println("From Child class");
    }

    public static void main(String[] args) {
        Override override = new Override();
        override.display();
    }

}
