package RectanglePackage;

public class Rectangle {

    double width;
    double height;

    Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    double calculateArea(){
        return width * height;
    }

    double calculatePerimeter(){
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 4);

        System.out.println(rectangle1.calculateArea());
        System.out.println(rectangle1.calculatePerimeter());
    }

}
