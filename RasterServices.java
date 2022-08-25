public class RasterServices {

    public static double distance (SimpleRasterElement a, SimpleRasterElement b) {
        double resultDistance;

        resultDistance = Math.sqrt(Math.pow((b.x - a.x),2) + Math.pow((b.y - a.y), 2));

        return resultDistance;
    }    
}