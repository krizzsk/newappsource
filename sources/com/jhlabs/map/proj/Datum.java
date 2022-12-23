package com.jhlabs.map.proj;

public class Datum {
    public static Datum[] datums;
    public double deltaX;
    public double deltaY;
    public double deltaZ;
    public Ellipsoid ellipsoid;
    public String name;

    static {
        Ellipsoid ellipsoid2 = Ellipsoid.CLARKE_1880;
        Ellipsoid ellipsoid3 = ellipsoid2;
        Ellipsoid ellipsoid4 = Ellipsoid.AUSTRALIAN;
        Ellipsoid ellipsoid5 = Ellipsoid.INTERNATIONAL_1967;
        Ellipsoid ellipsoid6 = ellipsoid5;
        Ellipsoid ellipsoid7 = Ellipsoid.CLARKE_1866;
        datums = new Datum[]{new Datum("ADINDAN", ellipsoid3, -162.0d, -12.0d, -206.0d), new Datum("ARC1950", ellipsoid3, -143.0d, -90.0d, -294.0d), new Datum("ARC1960", ellipsoid3, -160.0d, -8.0d, -300.0d), new Datum("Australian Geodetic 1966", ellipsoid4, -133.0d, -48.0d, 148.0d), new Datum("Australian Geodetic 984", ellipsoid4, -134.0d, -48.0d, 149.0d), new Datum("CAMP_AREA_ASTRO", ellipsoid5, -104.0d, -129.0d, 239.0d), new Datum("Cape", ellipsoid2, -136.0d, -108.0d, -292.0d), new Datum("European Datum 1950", ellipsoid6, -87.0d, -98.0d, -121.0d), new Datum("European Datum 1979", ellipsoid6, -86.0d, -98.0d, -119.0d), new Datum("Geodetic Datum 1949", ellipsoid6, 84.0d, -22.0d, 209.0d), new Datum("Hong Kong 1963", ellipsoid6, -156.0d, -271.0d, -189.0d), new Datum("Hu Tzu Shan", ellipsoid6, -634.0d, -549.0d, -201.0d), new Datum("NAD27", ellipsoid7, -8.0d, 160.0d, 176.0d), new Datum("NAD83", Ellipsoid.GRS_1980, 0.0d, 0.0d, 0.0d), new Datum("Old Hawaiian mean", ellipsoid7, 89.0d, -279.0d, -183.0d), new Datum("OMAN", ellipsoid2, -346.0d, -1.0d, 224.0d), new Datum("Ordnance Survey 1936", Ellipsoid.AIRY, 375.0d, -111.0d, 431.0d), new Datum("Puerto Rico", ellipsoid7, 11.0d, 72.0d, -101.0d), new Datum("Pulkovo 1942", Ellipsoid.KRASOVSKY, 27.0d, -135.0d, -89.0d), new Datum("PROVISIONAL_S_AMERICAN_1956", ellipsoid5, -288.0d, 175.0d, -376.0d), new Datum("Tokyo", Ellipsoid.BESSEL, -128.0d, 481.0d, 664.0d), new Datum("WGS72", Ellipsoid.WGS_1972, 0.0d, 0.0d, -4.5d), new Datum("WGS84", Ellipsoid.WGS_1984, 0.0d, 0.0d, 0.0d)};
    }

    public Datum(String str, Ellipsoid ellipsoid2, double d, double d2, double d3) {
        this.name = str;
        this.ellipsoid = ellipsoid2;
        this.deltaX = d;
        this.deltaY = d2;
        this.deltaZ = d3;
    }
}
