public class Circle {

    private String color;
    private double radius;

    public Circle() {
        this.color = "Green";
        this.radius = 2;
    }

    //Overloaded method to allow user to control size of the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    //Allows creation of circles of any size or color
    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    //Getters for properties
    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

    //Method to get the area of the circle
    protected void getArea() {
        double area = radius * radius * Math.PI;
        System.out.println("Total area of this circle is " + area);
    }
}
