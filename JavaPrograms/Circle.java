public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getradius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double CalculateArea(){
        return Math.PI * radius * radius;
    }

    public double CalculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.3);

        System.out.println("Radius :"+circle.getradius());
        circle.setRadius(6.8);
        System.out.println("Updated Radius :"+circle.getradius());

        System.out.println("Area :"+circle.CalculateArea());
        System.out.println("circumference :"+circle.CalculateCircumference());
    }
}
