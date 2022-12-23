package com.jhlabs.map.proj;

import com.jhlabs.map.AngleFormat;
import com.jhlabs.map.Point2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParsePosition;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ProjectionFactory {
    private static final double RA4 = 0.04722222222222222d;
    private static final double RA6 = 0.022156084656084655d;
    private static final double RV4 = 0.06944444444444445d;
    private static final double RV6 = 0.04243827160493827d;
    private static final double SIXTH = 0.16666666666666666d;
    private static AngleFormat format = new AngleFormat(AngleFormat.ddmmssPattern, true);
    public static Hashtable registry;

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.jhlabs.map.proj.Projection fromPROJ4Specification(java.lang.String[] r24) {
        /*
            r0 = r24
            java.util.Hashtable r1 = new java.util.Hashtable
            r1.<init>()
            r2 = 0
            r3 = 0
        L_0x0009:
            int r4 = r0.length
            if (r3 < r4) goto L_0x0316
            java.lang.String r0 = "proj"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "Unknown projection: "
            r4 = 0
            if (r0 == 0) goto L_0x0032
            com.jhlabs.map.proj.Projection r5 = getNamedPROJ4Projection(r0)
            if (r5 == 0) goto L_0x0020
            goto L_0x0033
        L_0x0020:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0032:
            r5 = r4
        L_0x0033:
            java.lang.String r0 = "init"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r6 = 0
            if (r0 == 0) goto L_0x0064
            com.jhlabs.map.proj.Projection r5 = getNamedPROJ4CoordinateSystem(r0)
            if (r5 == 0) goto L_0x0052
            double r8 = r5.getEquatorRadius()
            com.jhlabs.map.proj.Ellipsoid r0 = r5.getEllipsoid()
            double r10 = r0.getEccentricitySquared()
            goto L_0x0066
        L_0x0052:
            com.jhlabs.map.proj.ProjectionException r1 = new com.jhlabs.map.proj.ProjectionException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0064:
            r8 = r6
            r10 = r8
        L_0x0066:
            java.lang.String r0 = ""
            java.lang.String r3 = "R"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r3 == 0) goto L_0x0080
            double r2 = java.lang.Double.parseDouble(r3)
        L_0x0078:
            r20 = r0
            r16 = r2
            r18 = r10
            goto L_0x0234
        L_0x0080:
            java.lang.String r3 = "ellps"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0092
            java.lang.String r3 = "datum"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0092:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r3 == 0) goto L_0x00cb
            com.jhlabs.map.proj.Ellipsoid[] r0 = com.jhlabs.map.proj.Ellipsoid.ellipsoids
        L_0x0098:
            int r8 = r0.length
            if (r2 < r8) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            r8 = r0[r2]
            java.lang.String r8 = r8.shortName
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00c8
            r4 = r0[r2]
        L_0x00a8:
            if (r4 == 0) goto L_0x00b4
            double r8 = r4.eccentricity2
            double r10 = r4.equatorRadius
            r0 = r3
            r2 = r10
            r10 = r8
            r8 = r6
            goto L_0x0134
        L_0x00b4:
            com.jhlabs.map.proj.ProjectionException r0 = new com.jhlabs.map.proj.ProjectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown ellipsoid: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00cb:
            java.lang.String r2 = "a"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d9
            double r8 = java.lang.Double.parseDouble(r2)
        L_0x00d9:
            java.lang.String r2 = "es"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00e9
            double r10 = java.lang.Double.parseDouble(r2)
        L_0x00e7:
            r2 = r6
            goto L_0x0123
        L_0x00e9:
            java.lang.String r2 = "rf"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00fc
            double r2 = java.lang.Double.parseDouble(r2)
        L_0x00f7:
            double r10 = r14 - r2
            double r10 = r10 * r2
            goto L_0x00e7
        L_0x00fc:
            java.lang.String r2 = "f"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x010d
            double r2 = java.lang.Double.parseDouble(r2)
            double r2 = r12 / r2
            goto L_0x00f7
        L_0x010d:
            java.lang.String r2 = "b"
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00e7
            double r2 = java.lang.Double.parseDouble(r2)
            double r10 = r2 * r2
            double r16 = r8 * r8
            double r10 = r10 / r16
            double r10 = r12 - r10
        L_0x0123:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x012f
            double r2 = r12 - r10
            double r2 = java.lang.Math.sqrt(r2)
            double r2 = r2 * r8
        L_0x012f:
            r22 = r2
            r2 = r8
            r8 = r22
        L_0x0134:
            java.lang.String r4 = "R_A"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r16 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            if (r4 == 0) goto L_0x0162
            boolean r4 = java.lang.Boolean.getBoolean(r4)
            if (r4 == 0) goto L_0x0162
            r6 = 4586966260472709848(0x3fa82d82d82d82d8, double:0.04722222222222222)
            r8 = 4582043278022896385(0x3f96b015ac056b01, double:0.022156084656084655)
        L_0x0153:
            double r8 = r8 * r10
            double r8 = r8 + r6
            double r8 = r8 * r10
            double r8 = r8 + r16
            double r8 = r8 * r10
            double r6 = r12 - r8
            double r2 = r2 * r6
            goto L_0x0078
        L_0x0162:
            java.lang.String r4 = "R_V"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x017d
            boolean r4 = java.lang.Boolean.getBoolean(r4)
            if (r4 == 0) goto L_0x017d
            r6 = 4589668420249132146(0x3fb1c71c71c71c72, double:0.06944444444444445)
            r8 = 4586276820529754365(0x3fa5ba781948b0fd, double:0.04243827160493827)
            goto L_0x0153
        L_0x017d:
            java.lang.String r4 = "R_a"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r4 == 0) goto L_0x0194
            boolean r4 = java.lang.Boolean.getBoolean(r4)
            if (r4 == 0) goto L_0x0194
            double r2 = r2 + r8
            double r2 = r2 * r16
            goto L_0x0078
        L_0x0194:
            java.lang.String r4 = "R_g"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x01ac
            boolean r4 = java.lang.Boolean.getBoolean(r4)
            if (r4 == 0) goto L_0x01ac
            double r2 = r2 * r8
            double r2 = java.lang.Math.sqrt(r2)
            goto L_0x0078
        L_0x01ac:
            java.lang.String r4 = "R_h"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x01ca
            boolean r4 = java.lang.Boolean.getBoolean(r4)
            if (r4 == 0) goto L_0x01ca
            double r14 = r14 * r2
            double r14 = r14 * r8
            double r2 = r2 + r8
            double r2 = r14 / r2
        L_0x01c3:
            r20 = r0
            r16 = r2
            r18 = r6
            goto L_0x0234
        L_0x01ca:
            java.lang.String r4 = "R_lat_a"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r8 = "-11"
            r14 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            if (r4 == 0) goto L_0x0206
            double r18 = parseAngle(r4)
            double r18 = java.lang.Math.sin(r18)
            double r20 = java.lang.Math.abs(r18)
            int r4 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x0200
            double r8 = r10 * r18
            double r8 = r8 * r18
            double r8 = r12 - r8
            double r10 = r12 - r10
            double r10 = r10 + r8
            double r10 = r10 * r16
            double r14 = java.lang.Math.sqrt(r8)
            double r14 = r14 * r8
            double r10 = r10 / r14
        L_0x01fd:
            double r2 = r2 * r10
            goto L_0x01c3
        L_0x0200:
            com.jhlabs.map.proj.ProjectionException r0 = new com.jhlabs.map.proj.ProjectionException
            r0.<init>(r8)
            throw r0
        L_0x0206:
            java.lang.String r4 = "R_lat_g"
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0078
            double r16 = parseAngle(r4)
            double r16 = java.lang.Math.sin(r16)
            double r18 = java.lang.Math.abs(r16)
            int r4 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r4 > 0) goto L_0x022e
            double r8 = r10 * r16
            double r8 = r8 * r16
            double r8 = r12 - r8
            double r10 = r12 - r10
            double r10 = java.lang.Math.sqrt(r10)
            double r10 = r10 / r8
            goto L_0x01fd
        L_0x022e:
            com.jhlabs.map.proj.ProjectionException r0 = new com.jhlabs.map.proj.ProjectionException
            r0.<init>(r8)
            throw r0
        L_0x0234:
            com.jhlabs.map.proj.Ellipsoid r0 = new com.jhlabs.map.proj.Ellipsoid
            r14 = r0
            r15 = r20
            r14.<init>(r15, r16, r18, r20)
            r5.setEllipsoid(r0)
            java.lang.String r0 = "lat_0"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0250
            double r2 = parseAngle(r0)
            r5.setProjectionLatitudeDegrees(r2)
        L_0x0250:
            java.lang.String r0 = "lon_0"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0261
            double r2 = parseAngle(r0)
            r5.setProjectionLongitudeDegrees(r2)
        L_0x0261:
            java.lang.String r0 = "lat_1"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0272
            double r2 = parseAngle(r0)
            r5.setProjectionLatitude1Degrees(r2)
        L_0x0272:
            java.lang.String r0 = "lat_2"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0283
            double r2 = parseAngle(r0)
            r5.setProjectionLatitude2Degrees(r2)
        L_0x0283:
            java.lang.String r0 = "lat_ts"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0294
            double r2 = parseAngle(r0)
            r5.setTrueScaleLatitudeDegrees(r2)
        L_0x0294:
            java.lang.String r0 = "x_0"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02a5
            double r2 = java.lang.Double.parseDouble(r0)
            r5.setFalseEasting(r2)
        L_0x02a5:
            java.lang.String r0 = "y_0"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02b6
            double r2 = java.lang.Double.parseDouble(r0)
            r5.setFalseNorthing(r2)
        L_0x02b6:
            java.lang.String r0 = "k_0"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "k"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x02c8:
            if (r0 == 0) goto L_0x02d1
            double r2 = java.lang.Double.parseDouble(r0)
            r5.setScaleFactor(r2)
        L_0x02d1:
            java.lang.String r0 = "units"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02e8
            com.jhlabs.map.Unit r0 = com.jhlabs.map.Units.findUnits(r0)
            if (r0 == 0) goto L_0x02e8
            double r2 = r0.value
            double r2 = r12 / r2
            r5.setFromMetres(r2)
        L_0x02e8:
            java.lang.String r0 = "to_meter"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02fa
            double r2 = java.lang.Double.parseDouble(r0)
            double r12 = r12 / r2
            r5.setFromMetres(r12)
        L_0x02fa:
            boolean r0 = r5 instanceof com.jhlabs.map.proj.TransverseMercatorProjection
            if (r0 == 0) goto L_0x0312
            java.lang.String r0 = "zone"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0312
            r1 = r5
            com.jhlabs.map.proj.TransverseMercatorProjection r1 = (com.jhlabs.map.proj.TransverseMercatorProjection) r1
            int r0 = java.lang.Integer.parseInt(r0)
            r1.setUTMZone(r0)
        L_0x0312:
            r5.initialize()
            return r5
        L_0x0316:
            r4 = r0[r3]
            java.lang.String r5 = "+"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0337
            r5 = 61
            int r5 = r4.indexOf(r5)
            r6 = -1
            if (r5 == r6) goto L_0x0337
            r6 = 1
            java.lang.String r6 = r4.substring(r6, r5)
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            r1.put(r6, r4)
        L_0x0337:
            int r3 = r3 + 1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.ProjectionFactory.fromPROJ4Specification(java.lang.String[]):com.jhlabs.map.proj.Projection");
    }

    public static Projection getNamedPROJ4CoordinateSystem(String str) {
        String[] strArr = {"world", "nad83", "nad27", "esri", "epsg"};
        try {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                return readProjectionFile(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            for (int i = 0; i < 5; i++) {
                Projection readProjectionFile = readProjectionFile(strArr[i], str);
                if (readProjectionFile != null) {
                    return readProjectionFile;
                }
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Projection getNamedPROJ4Projection(String str) {
        if (registry == null) {
            initialize();
        }
        Class cls = (Class) registry.get(str);
        if (cls == null) {
            return null;
        }
        try {
            Projection projection = (Projection) cls.newInstance();
            if (projection != null) {
                projection.setName(str);
            }
            return projection;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void initialize() {
        registry = new Hashtable();
        register("aea", AlbersProjection.class, "Albers Equal Area");
        register("aeqd", EquidistantAzimuthalProjection.class, "Azimuthal Equidistant");
        register("airy", AiryProjection.class, "Airy");
        register("aitoff", AitoffProjection.class, "Aitoff");
        register("alsk", Projection.class, "Mod. Stereographics of Alaska");
        register("apian", Projection.class, "Apian Globular I");
        register("august", AugustProjection.class, "August Epicycloidal");
        register("bacon", Projection.class, "Bacon Globular");
        register("bipc", BipolarProjection.class, "Bipolar conic of western hemisphere");
        register("boggs", BoggsProjection.class, "Boggs Eumorphic");
        register("bonne", BonneProjection.class, "Bonne (Werner lat_1=90)");
        register("cass", CassiniProjection.class, "Cassini");
        register("cc", CentralCylindricalProjection.class, "Central Cylindrical");
        register("cea", Projection.class, "Equal Area Cylindrical");
        register("collg", CollignonProjection.class, "Collignon");
        register("crast", CrasterProjection.class, "Craster Parabolic (Putnins P4)");
        register("denoy", DenoyerProjection.class, "Denoyer Semi-Elliptical");
        register("eck1", Eckert1Projection.class, "Eckert I");
        register("eck2", Eckert2Projection.class, "Eckert II");
        register("eck4", Eckert4Projection.class, "Eckert IV");
        register("eck5", Eckert5Projection.class, "Eckert V");
        register("eqc", PlateCarreeProjection.class, "Equidistant Cylindrical (Plate Caree)");
        register("eqdc", EquidistantConicProjection.class, "Equidistant Conic");
        register("euler", EulerProjection.class, "Euler");
        register("fahey", FaheyProjection.class, "Fahey");
        register("fouc", FoucautProjection.class, "Foucaut");
        register("fouc_s", FoucautSinusoidalProjection.class, "Foucaut Sinusoidal");
        register("gall", GallProjection.class, "Gall (Gall Stereographic)");
        register("gnom", GnomonicAzimuthalProjection.class, "Gnomonic");
        register("goode", GoodeProjection.class, "Goode Homolosine");
        register("hammer", HammerProjection.class, "Hammer & Eckert-Greifendorff");
        register("hatano", HatanoProjection.class, "Hatano Asymmetrical Equal Area");
        register("kav5", KavraiskyVProjection.class, "Kavraisky V");
        register("lagrng", LagrangeProjection.class, "Lagrange");
        register("larr", LarriveeProjection.class, "Larrivee");
        register("lask", LaskowskiProjection.class, "Laskowski");
        register("latlong", NullProjection.class, "Lat/Long");
        register("lcc", LambertConformalConicProjection.class, "Lambert Conformal Conic");
        register("leac", LambertEqualAreaConicProjection.class, "Lambert Equal Area Conic");
        register("loxim", LoximuthalProjection.class, "Loximuthal");
        register("lsat", LandsatProjection.class, "Space oblique for LANDSAT");
        register("mbt_fps", MBTFPSProjection.class, "McBryde-Thomas Flat-Pole Sine (No. 2)");
        register("mbtfpp", MBTFPPProjection.class, "McBride-Thomas Flat-Polar Parabolic");
        register("mbtfpq", MBTFPQProjection.class, "McBryde-Thomas Flat-Polar Quartic");
        register("merc", MercatorProjection.class, "Mercator");
        register("mill", MillerProjection.class, "Miller Cylindrical");
        register("moll", MolleweideProjection.class, "Mollweide");
        register("murd1", Murdoch1Projection.class, "Murdoch I");
        register("murd2", Murdoch2Projection.class, "Murdoch II");
        register("murd3", Murdoch3Projection.class, "Murdoch III");
        register("nell", NellProjection.class, "Nell");
        register("nicol", NicolosiProjection.class, "Nicolosi Globular");
        register("nsper", PerspectiveProjection.class, "Near-sided perspective");
        register("omerc", ObliqueMercatorProjection.class, "Oblique Mercator");
        register("ortho", OrthographicAzimuthalProjection.class, "Orthographic");
        register("pconic", PerspectiveConicProjection.class, "Perspective Conic");
        register("poly", PolyconicProjection.class, "Polyconic (American)");
        register("putp2", PutninsP2Projection.class, "Putnins P2");
        register("putp4p", PutninsP4Projection.class, "Putnins P4'");
        register("putp5", PutninsP5Projection.class, "Putnins P5");
        register("putp5p", PutninsP5PProjection.class, "Putnins P5'");
        register("qua_aut", QuarticAuthalicProjection.class, "Quartic Authalic");
        register("robin", RobinsonProjection.class, "Robinson");
        register("rpoly", RectangularPolyconicProjection.class, "Rectangular Polyconic");
        register("sinu", SinusoidalProjection.class, "Sinusoidal (Sanson-Flamsteed)");
        register("stere", StereographicAzimuthalProjection.class, "Stereographic");
        register("tcc", TCCProjection.class, "Transverse Central Cylindrical");
        register("tcea", TCEAProjection.class, "Transverse Cylindrical Equal Area");
        register("tmerc", TransverseMercatorProjection.class, "Transverse Mercator");
        register("urmfps", URMFPSProjection.class, "Urmaev Flat-Polar Sinusoidal");
        register("utm", TransverseMercatorProjection.class, "Universal Transverse Mercator (UTM)");
        register("vandg", VanDerGrintenProjection.class, "van der Grinten (I)");
        register("vitk1", VitkovskyProjection.class, "Vitkovsky I");
        register("wag1", Wagner1Projection.class, "Wagner I (Kavraisky VI)");
        register("wag2", Wagner2Projection.class, "Wagner II");
        register("wag3", Wagner3Projection.class, "Wagner III");
        register("wag4", Wagner4Projection.class, "Wagner IV");
        register("wag5", Wagner5Projection.class, "Wagner V");
        register("wag7", Wagner7Projection.class, "Wagner VII");
        register("weren", WerenskioldProjection.class, "Werenskiold I");
        register("wintri", WinkelTripelProjection.class, "Winkel Tripel");
    }

    public static void main(String[] strArr) {
        Projection fromPROJ4Specification = fromPROJ4Specification(strArr);
        if (fromPROJ4Specification != null) {
            System.out.println(fromPROJ4Specification.getPROJ4Description());
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                if (!str.startsWith("+") && !str.startsWith("-")) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(strArr[i])));
                        Point2D.Double doubleR = new Point2D.Double();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                            String nextToken = stringTokenizer.nextToken();
                            String nextToken2 = stringTokenizer.nextToken();
                            doubleR.f36952x = format.parse(nextToken, (ParsePosition) null).doubleValue();
                            doubleR.f36953y = format.parse(nextToken2, (ParsePosition) null).doubleValue();
                            fromPROJ4Specification.transform(doubleR, doubleR);
                            PrintStream printStream = System.out;
                            printStream.println(String.valueOf(doubleR.f36952x) + " " + doubleR.f36953y);
                        }
                    } catch (IOException e) {
                        PrintStream printStream2 = System.out;
                        printStream2.println("IOException: " + strArr[i] + ": " + e.getMessage());
                    }
                }
            }
            return;
        }
        PrintStream printStream3 = System.out;
        printStream3.println("Can't find projection " + strArr[0]);
    }

    private static double parseAngle(String str) {
        return format.parse(str, (ParsePosition) null).doubleValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008b, code lost:
        r12.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0090, code lost:
        if (r12.ttype != 62) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0092, code lost:
        r12.nextToken();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0099, code lost:
        if (r1.equals(r13) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009b, code lost:
        r12 = new java.lang.String[r4.size()];
        r4.copyInto(r12);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
        return fromPROJ4Specification(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c7, code lost:
        throw new java.io.IOException(java.lang.String.valueOf(r12.lineno()) + ": '<>' expected");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.jhlabs.map.proj.Projection readProjectionFile(java.lang.String r12, java.lang.String r13) throws java.io.IOException {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.lang.Class<com.jhlabs.map.proj.ProjectionFactory> r2 = com.jhlabs.map.proj.ProjectionFactory.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "/nad/"
            r3.<init>(r4)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            java.io.InputStream r12 = r2.getResourceAsStream(r12)
            r1.<init>(r12)
            r0.<init>(r1)
            java.io.StreamTokenizer r12 = new java.io.StreamTokenizer
            r12.<init>(r0)
            r1 = 35
            r12.commentChar(r1)
            r1 = 48
            r2 = 57
            r12.ordinaryChars(r1, r2)
            r3 = 46
            r12.ordinaryChars(r3, r3)
            r4 = 45
            r12.ordinaryChars(r4, r4)
            r5 = 43
            r12.ordinaryChars(r5, r5)
            r12.wordChars(r1, r2)
            r1 = 39
            r12.wordChars(r1, r1)
            r1 = 34
            r12.wordChars(r1, r1)
            r1 = 95
            r12.wordChars(r1, r1)
            r12.wordChars(r3, r3)
            r12.wordChars(r4, r4)
            r12.wordChars(r5, r5)
            r1 = 44
            r12.wordChars(r1, r1)
            r12.nextToken()
        L_0x0061:
            int r1 = r12.ttype
            r2 = 60
            if (r1 == r2) goto L_0x006c
            r0.close()
            r12 = 0
            return r12
        L_0x006c:
            r12.nextToken()
            int r1 = r12.ttype
            r3 = -3
            if (r1 != r3) goto L_0x0150
            java.lang.String r1 = r12.sval
            r12.nextToken()
            int r4 = r12.ttype
            r6 = 62
            if (r4 != r6) goto L_0x0134
            r12.nextToken()
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
        L_0x0087:
            int r7 = r12.ttype
            if (r7 != r2) goto L_0x00c8
            r12.nextToken()
            int r2 = r12.ttype
            if (r2 != r6) goto L_0x00ac
            r12.nextToken()
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0061
            int r12 = r4.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            r4.copyInto(r12)
            r0.close()
            com.jhlabs.map.proj.Projection r12 = fromPROJ4Specification(r12)
            return r12
        L_0x00ac:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r12 = r12.lineno()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.<init>(r12)
            java.lang.String r12 = ": '<>' expected"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x00c8:
            if (r7 != r5) goto L_0x00cd
            r12.nextToken()
        L_0x00cd:
            int r7 = r12.ttype
            if (r7 != r3) goto L_0x0118
            java.lang.String r7 = r12.sval
            r12.nextToken()
            int r8 = r12.ttype
            r9 = 61
            if (r8 != r9) goto L_0x0087
            r12.nextToken()
            java.lang.String r8 = r12.sval
            r12.nextToken()
            java.lang.String r9 = "+"
            boolean r10 = r7.startsWith(r9)
            java.lang.String r11 = "="
            if (r10 == 0) goto L_0x0101
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r7)
            r9.append(r11)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r4.add(r7)
            goto L_0x0087
        L_0x0101:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r7)
            r10.append(r11)
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            r4.add(r7)
            goto L_0x0087
        L_0x0118:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r12 = r12.lineno()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.<init>(r12)
            java.lang.String r12 = ": Word expected after '+'"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x0134:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r12 = r12.lineno()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.<init>(r12)
            java.lang.String r12 = ": '>' expected"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L_0x0150:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r12 = r12.lineno()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.<init>(r12)
            java.lang.String r12 = ": Word expected after '<'"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jhlabs.map.proj.ProjectionFactory.readProjectionFile(java.lang.String, java.lang.String):com.jhlabs.map.proj.Projection");
    }

    public static void register(String str, Class cls, String str2) {
        registry.put(str, cls);
    }
}
