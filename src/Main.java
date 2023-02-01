public class Main {
    public static void main(String[] args) {
        Circle circ1 = new Circle();
        Circle circ2 = new Circle(2);
        Circle circ3 = new Circle("Chartreuse", 13);

        System.out.println(circ1.getColor());
        System.out.println(circ2.getArea());
        System.out.println(circ3.toString());
    }
}