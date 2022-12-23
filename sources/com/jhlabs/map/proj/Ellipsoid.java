package com.jhlabs.map.proj;

public class Ellipsoid implements Cloneable {
    public static final Ellipsoid AIRY;
    public static final Ellipsoid AUSTRALIAN = new Ellipsoid("australian", 6378160.0d, 6356774.7d, 298.25d, "Australian");
    public static final Ellipsoid BESSEL;
    public static final Ellipsoid CLARKE_1866;
    public static final Ellipsoid CLARKE_1880;
    public static final Ellipsoid EVEREST;
    public static final Ellipsoid GRS_1980;
    public static final Ellipsoid INTERNATIONAL_1967;
    public static final Ellipsoid KRASOVSKY;
    public static final Ellipsoid SPHERE;
    public static final Ellipsoid WGS_1960;
    public static final Ellipsoid WGS_1966;
    public static final Ellipsoid WGS_1972;
    public static final Ellipsoid WGS_1984;
    public static final Ellipsoid[] ellipsoids;
    public double eccentricity;
    public double eccentricity2;
    public double equatorRadius;
    public String name;
    public double poleRadius;
    public String shortName;

    static {
        Ellipsoid ellipsoid = new Ellipsoid("sphere", 6371008.7714d, 6371008.7714d, 0.0d, "Sphere");
        SPHERE = ellipsoid;
        Ellipsoid ellipsoid2 = new Ellipsoid("bessel", 6377397.155d, 0.0d, 299.1528128d, "Bessel 1841");
        BESSEL = ellipsoid2;
        Ellipsoid ellipsoid3 = new Ellipsoid("clrk66", 6378206.4d, 6356583.8d, 0.0d, "Clarke 1866");
        CLARKE_1866 = ellipsoid3;
        Ellipsoid ellipsoid4 = new Ellipsoid("clrk80", 6378249.145d, 0.0d, 293.4663d, "Clarke 1880 mod.");
        CLARKE_1880 = ellipsoid4;
        Ellipsoid ellipsoid5 = new Ellipsoid("airy", 6377563.396d, 6356256.91d, 0.0d, "Airy 1830");
        AIRY = ellipsoid5;
        Ellipsoid ellipsoid6 = new Ellipsoid("WGS60", 6378165.0d, 0.0d, 298.3d, "WGS 60");
        WGS_1960 = ellipsoid6;
        Ellipsoid ellipsoid7 = new Ellipsoid("WGS66", 6378145.0d, 0.0d, 298.25d, "WGS 66");
        WGS_1966 = ellipsoid7;
        Ellipsoid ellipsoid8 = new Ellipsoid("WGS72", 6378135.0d, 0.0d, 298.26d, "WGS 72");
        WGS_1972 = ellipsoid8;
        Ellipsoid ellipsoid9 = new Ellipsoid("WGS84", 6378137.0d, 0.0d, 298.257223563d, "WGS 84");
        WGS_1984 = ellipsoid9;
        Ellipsoid ellipsoid10 = new Ellipsoid("krass", 6378245.0d, 298.3d, 0.0d, "Krassovsky, 1942");
        KRASOVSKY = ellipsoid10;
        Ellipsoid ellipsoid11 = new Ellipsoid("evrst30", 6377276.345d, 0.0d, 300.8017d, "Everest 1830");
        EVEREST = ellipsoid11;
        Ellipsoid ellipsoid12 = new Ellipsoid("new_intl", 6378157.5d, 6356772.2d, 0.0d, "New International 1967");
        INTERNATIONAL_1967 = ellipsoid12;
        Ellipsoid ellipsoid13 = new Ellipsoid("GRS80", 6378137.0d, 0.0d, 298.257222101d, "GRS 1980 (IUGG, 1980)");
        GRS_1980 = ellipsoid13;
        ellipsoids = new Ellipsoid[]{ellipsoid, new Ellipsoid("MERIT", 6378137.0d, 0.0d, 298.257d, "MERIT 1983"), new Ellipsoid("SGS85", 6378136.0d, 0.0d, 298.257d, "Soviet Geodetic System 85"), ellipsoid13, new Ellipsoid("IAU76", 6378140.0d, 0.0d, 298.257d, "IAU 1976"), ellipsoid5, new Ellipsoid("APL4.9", 6378137.0d, 0.0d, 298.25d, "Appl. Physics. 1965"), new Ellipsoid("NWL9D", 6378145.0d, 298.25d, 0.0d, "Naval Weapons Lab., 1965"), new Ellipsoid("mod_airy", 6377340.189d, 6356034.446d, 0.0d, "Modified Airy"), new Ellipsoid("andrae", 6377104.43d, 300.0d, 0.0d, "Andrae 1876 (Den., Iclnd.)"), new Ellipsoid("aust_SA", 6378160.0d, 0.0d, 298.25d, "Australian Natl & S. Amer. 1969"), new Ellipsoid("GRS67", 6378160.0d, 0.0d, 298.247167427d, "GRS 67 (IUGG 1967)"), ellipsoid2, new Ellipsoid("bess_nam", 6377483.865d, 0.0d, 299.1528128d, "Bessel 1841 (Namibia)"), ellipsoid3, ellipsoid4, new Ellipsoid("CPM", 6375738.7d, 0.0d, 334.29d, "Comm. des Poids et Mesures 1799"), new Ellipsoid("delmbr", 6376428.0d, 0.0d, 311.5d, "Delambre 1810 (Belgium)"), new Ellipsoid("engelis", 6378136.05d, 0.0d, 298.2566d, "Engelis 1985"), ellipsoid11, new Ellipsoid("evrst48", 6377304.063d, 0.0d, 300.8017d, "Everest 1948"), new Ellipsoid("evrst56", 6377301.243d, 0.0d, 300.8017d, "Everest 1956"), new Ellipsoid("evrst69", 6377295.664d, 0.0d, 300.8017d, "Everest 1969"), new Ellipsoid("evrstSS", 6377298.556d, 0.0d, 300.8017d, "Everest (Sabah & Sarawak)"), new Ellipsoid("fschr60", 6378166.0d, 0.0d, 298.3d, "Fischer (Mercury Datum) 1960"), new Ellipsoid("fschr60m", 6378155.0d, 0.0d, 298.3d, "Modified Fischer 1960"), new Ellipsoid("fschr68", 6378150.0d, 0.0d, 298.3d, "Fischer 1968"), new Ellipsoid("helmert", 6378200.0d, 0.0d, 298.3d, "Helmert 1906"), new Ellipsoid("hough", 6378270.0d, 0.0d, 297.0d, "Hough"), new Ellipsoid("intl", 6378388.0d, 0.0d, 297.0d, "International 1909 (Hayford)"), ellipsoid10, new Ellipsoid("kaula", 6378163.0d, 0.0d, 298.24d, "Kaula 1961"), new Ellipsoid("lerch", 6378139.0d, 0.0d, 298.257d, "Lerch 1979"), new Ellipsoid("mprts", 6397300.0d, 0.0d, 191.0d, "Maupertius 1738"), ellipsoid12, new Ellipsoid("plessis", 6376523.0d, 6355863.0d, 0.0d, "Plessis 1817 France)"), new Ellipsoid("SEasia", 6378155.0d, 6356773.3205d, 0.0d, "Southeast Asia"), new Ellipsoid("walbeck", 6376896.0d, 6355834.8467d, 0.0d, "Walbeck"), ellipsoid6, ellipsoid7, ellipsoid8, ellipsoid9, new Ellipsoid("NAD27", 6378249.145d, 0.0d, 293.4663d, "NAD27: Clarke 1880 mod."), new Ellipsoid("NAD83", 6378137.0d, 0.0d, 298.257222101d, "NAD83: GRS 1980 (IUGG, 1980)")};
    }

    public Ellipsoid() {
        this.equatorRadius = 1.0d;
        this.poleRadius = 1.0d;
        this.eccentricity = 1.0d;
        this.eccentricity2 = 1.0d;
    }

    public Object clone() {
        try {
            return (Ellipsoid) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public double getEccentricitySquared() {
        return this.eccentricity2;
    }

    public double getEquatorRadius() {
        return this.equatorRadius;
    }

    public String getName() {
        return this.name;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setEccentricitySquared(double d) {
        this.eccentricity2 = d;
        this.poleRadius = Math.sqrt(1.0d - d) * this.equatorRadius;
        this.eccentricity = Math.sqrt(d);
    }

    public void setEquatorRadius(double d) {
        this.equatorRadius = d;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setShortName(String str) {
        this.shortName = str;
    }

    public String toString() {
        return this.name;
    }

    public Ellipsoid(String str, double d, double d2, double d3, String str2) {
        this.eccentricity = 1.0d;
        this.eccentricity2 = 1.0d;
        this.shortName = str;
        this.name = str2;
        this.equatorRadius = d;
        this.poleRadius = d2;
        if (d3 != 0.0d) {
            double d4 = 1.0d / d3;
            double d5 = (2.0d * d4) - (d4 * d4);
            this.eccentricity2 = d5;
            Math.sqrt(1.0d - d5);
        } else {
            this.eccentricity2 = 1.0d - ((d2 * d2) / (d * d));
        }
        this.eccentricity = Math.sqrt(this.eccentricity2);
    }

    public Ellipsoid(String str, double d, double d2, String str2) {
        this.poleRadius = 1.0d;
        this.eccentricity = 1.0d;
        this.eccentricity2 = 1.0d;
        this.shortName = str;
        this.name = str2;
        this.equatorRadius = d;
        setEccentricitySquared(d2);
    }
}
