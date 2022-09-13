public class Area {

    private double length;
    private double width;

    public Area(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea(){
        return length * width;
    }
}
