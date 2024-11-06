import java.util.Scanner;

public class Exercise1 {
    // [Thực hành] Lớp hình chữ nhật (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextInt();

        System.out.print("Enter height: ");
        double height = sc.nextInt();

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
