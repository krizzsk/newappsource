package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.net.Uri;
import android.os.Build;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.u */
public final class C3406u {

    /* renamed from: a */
    public static final int f12148a;

    /* renamed from: b */
    public static final String f12149b;

    /* renamed from: c */
    public static final String f12150c;

    /* renamed from: d */
    public static final String f12151d;

    /* renamed from: e */
    public static final String f12152e;

    /* renamed from: f */
    public static final Pattern f12153f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: g */
    public static final Pattern f12154g = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: h */
    public static final int[] f12155h = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.u$a */
    public class C3407a implements ThreadFactory {

        /* renamed from: a */
        public final /* synthetic */ String f12156a;

        public C3407a(String str) {
            this.f12156a = str;
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.f12156a);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f12148a = i;
        String str = Build.DEVICE;
        f12149b = str;
        String str2 = Build.MANUFACTURER;
        f12150c = str2;
        String str3 = Build.MODEL;
        f12151d = str3;
        StringBuilder h = C16759e.m42352h(str, ", ", str3, ", ", str2);
        h.append(", ");
        h.append(i);
        f12152e = h.toString();
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    }

    /* renamed from: a */
    public static int m8587a(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static boolean m8596a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8599b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8599b(long[], long, boolean, boolean):int");
    }

    /* renamed from: b */
    public static boolean m8600b(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: c */
    public static ExecutorService m8601c(String str) {
        return Executors.newSingleThreadExecutor(new C3407a(str));
    }

    /* renamed from: a */
    public static void m8593a(C3353g gVar) {
        if (gVar != null) {
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m8594a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static int m8588a(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: b */
    public static int m8597b(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 * 4;
        }
        if (i == 2) {
            return i2 * 2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8590a(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8590a(long[], long, boolean, boolean):int");
    }

    /* renamed from: b */
    public static int m8598b(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.endsWith(".mpd")) {
            return 0;
        }
        if (lowerCase.endsWith(".m3u8")) {
            return 2;
        }
        return (lowerCase.endsWith(".ism") || lowerCase.endsWith(".isml") || lowerCase.endsWith(".ism/manifest") || lowerCase.endsWith(".isml/manifest")) ? 1 : 3;
    }

    /* renamed from: a */
    public static long m8591a(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: a */
    public static void m8595a(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: a */
    public static C3357j m8592a(C3357j jVar, int i) {
        if (i == 0) {
            return jVar;
        }
        long j = jVar.f12008e;
        long j2 = -1;
        if (j != -1) {
            j2 = j - ((long) i);
        }
        Uri uri = jVar.f12004a;
        long j3 = jVar.f12007d + ((long) i);
        return new C3357j(uri, j3, j3, j2, jVar.f12009f, jVar.f12010g);
    }

    /* renamed from: a */
    public static int m8589a(String str) {
        int length = str.length();
        C3380a.m8505a(length <= 4);
        char c = 0;
        for (int i = 0; i < length; i++) {
            c = (c << 8) | str.charAt(i);
        }
        return c;
    }
}
