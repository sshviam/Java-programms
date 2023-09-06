public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getwidth(){
        return width;
    }

    public void setwidth(double hight){
        this.width = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double CalculateArea(){
        return width * height;
    }

    public double CalculatePerimeter(){
        return 2 *(width + height);
    }
}

class frfef{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6.0, 9.0);

        System.out.println("Wdith :"+rectangle.getwidth());
        System.out.println("Height :"+rectangle.getHeight());
        System.out.println("Area :"+rectangle.CalculateArea());
        System.out.println("Perimeter :"+rectangle.CalculatePerimeter());
    }
}
