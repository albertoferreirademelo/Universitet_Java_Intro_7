public class RasterElement {
    private final int id;
    private final double x;
    private final double y;
    private final double h;

    public RasterElement (int id_nr, double valX, double valY, double height) {

        id = id_nr;
        x = valX;
        y = valY;
        h = height;

        // id = id_nr; Fler tilldelningar
    }

    public int getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getHeight() {
        return h;
    }

    public double distance (RasterElement re) {
        double resultDistance;

        resultDistance = Math.sqrt(Math.pow((re.x - this.x),2) + Math.pow((re.y - this.y), 2));

        return resultDistance;        
    }
}
