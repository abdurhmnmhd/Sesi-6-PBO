package Shape;
public class Square implements Shape, Printable{
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter(){
        return 4* side;
    }

    public void print() {
        System.out.println("Persegi");
    }

    public void setPaper() {
        System.out.println("kertas A4");
    }

    public void getInfo() {
        System.out.println("Luas: " + area());
        System.out.println("keliling:" + perimeter());
    }

    
}
