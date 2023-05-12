package JavaPrograms;

abstract class shape{
    abstract double getVolume();
}
class Cube extends shape{
    private double sideLength;

    public Cube(double sideLength){
        this.sideLength = sideLength;
    }
    double getVolume(){
        return Math.pow(sideLength,3);
    }
}
class circleA{
    public static void main(String[] args) {
        Cube cube = new Cube(5);
        double volume = cube.getVolume();
        System.out.println("Volume of cube: "+volume);
        }
} 