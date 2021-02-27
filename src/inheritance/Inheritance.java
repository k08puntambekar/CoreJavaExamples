package inheritance;

public class Inheritance {
    int a = 10;
    int b = 20;

    public void sum() {
        int c = a + b;
        System.out.println("Addition is : " + c);
    }
}

class Child extends Inheritance {

    public void multiply() {
        int c = a * b;
        System.out.println("Multiplication is : " + c);
    }

    public static void main(String[] args) {
        Child child = new Child();

        child.sum();
        child.multiply();
    }

}
