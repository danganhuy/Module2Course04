public class Fan {
    public enum SPEED {
        LOW(1), MEDIUM(2), HIGH(3);
        private final int speed;
        public int getSpeed(){
            return speed;
        }
        private SPEED(int speed){
            this.speed = speed;
        }
    }
    private int speed;
    private boolean isOn;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan() {
        speed = SPEED.LOW.getSpeed();
        isOn = false;
        radius = 0;
        color = "";
    }
    public Fan(SPEED speed, boolean isOn, double radius, String color) {
        this.speed = speed.getSpeed();
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }
    public String toString(){
        if (isOn){
            return "Fan is on: speed: " + speed + ", radius: " + radius + ", color: " + color;
        } else {
            return "Fan is off: radius: " + radius + ", color: " + color;
        }
    }
}