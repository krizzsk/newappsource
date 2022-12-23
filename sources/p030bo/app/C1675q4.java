package p030bo.app;

/* renamed from: bo.app.q4 */
public final class C1675q4 {
    /* renamed from: a */
    public static double m4657a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double radians3 = Math.toRadians(d);
        double radians4 = Math.toRadians(d3);
        return Math.asin(Math.sqrt((Math.cos(radians4) * Math.cos(radians3) * Math.pow(Math.sin(radians2 / 2.0d), 2.0d)) + Math.pow(Math.sin(radians / 2.0d), 2.0d))) * 2.0d * 6371000.0d;
    }
}
