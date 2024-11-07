public class Exercise4 {
    // [Bài tập] Xây dựng lớp Fan
    public static void main(String[] args) {
        Fan fan1 = new Fan(Fan.SPEED.HIGH, true, 5, "blue");
        Fan fan2 = new Fan(Fan.SPEED.LOW, false, 3, "red");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
