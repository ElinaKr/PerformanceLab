package Mission1;

public class Segments {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double l;

    public Segments(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLenght() {
        return Math.cbrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }

    public void ESegments(Segments cut) {

        if (this.getLenght() == cut.getLenght()) {
            System.out.println("отрезки равны");
        } else System.out.println("отрезки не равны");

    }


}
