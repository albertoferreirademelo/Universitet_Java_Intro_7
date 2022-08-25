public class SimpleRasterElementTest {
    public static void main (String[] args) {
        SimpleRasterElement a;

        a = new SimpleRasterElement();

        a.id = 1;
        a.x = 2;
        a.y = -6;
        a.height = 3;

        SimpleRasterElement b;
        b = new SimpleRasterElement();

        b.id = 2;
        b.x = 7;
        b.y = 3;
        b.height = 3;

        //RasterServices distanceAB = new RasterServices();

        double distanceAB = RasterServices.distance(a, b);

        System.out.println("ID: " + a.id);
        System.out.println("Value x: " + a.x);
        System.out.println("Value y: " + a.y);
        System.out.println("Height: " + a.height);
        System.out.println("Distance between points (2,-6) and (7,3): " + distanceAB);
    }
}
