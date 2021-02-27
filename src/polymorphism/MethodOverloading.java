package polymorphism;

public class MethodOverloading {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition of 2 values is : " + c);
    }

    public void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println("Addition of 3 values is : " + d);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.add(4,7);
        methodOverloading.add(6,9,11);
    }
}
