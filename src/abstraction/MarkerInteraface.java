package abstraction;

interface MyInterface {
}

public class MarkerInteraface implements MyInterface{

    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args) {
        MarkerInteraface markerInteraface = new MarkerInteraface();
        if(markerInteraface instanceof MyInterface) {
            markerInteraface.show();
        }
    }

}
