import java.util.Scanner;

public class Exercise2 {
    // [Bài tập] Xây dựng lớp QuadraticEquation (Phương trình bậc hai)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);

        double d = q.getDiscriminant();

        if (d < 0) {
            System.out.println(q.getEquation() + " has no solution");
        } else if (d == 0) {
            System.out.println(q.getEquation() + " has 1 solution:");
            System.out.println("x = " + q.getRoot1());
        } else {
            System.out.println(q.getEquation() + " has 2 solution:");
            System.out.println("x1 = " + q.getRoot1() + ", x2 = " + q.getRoot2());
        }
    }
}
