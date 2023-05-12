package JavaPrograms;

abstract class shape{
    public abstract double calculateParimeter();
}
class Rectangle extends shape{
    private double length;
    private double width;
     public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
     }
     public double calculateParimeter(){
        return 2 * (length+width);
     }
}
class Main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 2.0);
        double perimeter = rectangle.calculateParimeter();
        System.out.println("perimeter:"+perimeter);
    }
}