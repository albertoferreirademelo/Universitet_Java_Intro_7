public class RasterElementTest {
    public static void main (String[] args) {
        RasterElement re_a;
        RasterElement re_b;

        re_a = new RasterElement(1, 6.0, 8.0, 10.5);

        re_b = new RasterElement(1, 9.0, 12.0, 15.5);

        System.out.print("ID: " + re_a.getId() + ", ");
        System.out.print("Value x: " + re_a.getX() + ", ");
        System.out.print("Value y: " + re_a.getY() + ", ");
        System.out.print("Height: " + re_a.getHeight());

        System.out.println();

        System.out.print("ID: " + re_b.getId() + ", ");
        System.out.print("Value x: " + re_b.getX() + ", ");
        System.out.print("Value y: " + re_b.getY() + ", ");
        System.out.print("Height: " + re_b.getHeight());

        System.out.println();

        double d = re_a.distance(re_b);
        System.out.println(d);
    }
}
