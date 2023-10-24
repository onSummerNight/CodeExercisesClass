public class Floor {
    private double length ;
    private double width;

    public Floor(double height, double width) {
        if (height < 0 ) {
            this.length  = 0;
        }
        if (width < 0 ) {
            this.width = 0;
        }
        this.length  = height;
        this.width = width;
    }

    public double getArea() {
        return this.length  * this.width;
    }
}
