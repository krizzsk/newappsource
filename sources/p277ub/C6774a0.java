package p277ub;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display$Mode;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.ValidationUtils;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p001a0.C0016g;
import p001a0.C0017h;
import p583jk.C17875h;
import p624ld.C18187b;

/* renamed from: ub.a0 */
public final class C6774a0 {

    /* renamed from: a */
    public static final int f20959a;

    /* renamed from: b */
    public static final String f20960b;

    /* renamed from: c */
    public static final String f20961c;

    /* renamed from: d */
    public static final String f20962d;

    /* renamed from: e */
    public static final String f20963e;

    /* renamed from: f */
    public static final byte[] f20964f = new byte[0];

    /* renamed from: g */
    public static HashMap<String, String> f20965g;

    /* renamed from: h */
    public static final String[] f20966h = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: i */
    public static final String[] f20967i = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: j */
    public static final int[] f20968j = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: k */
    public static final int[] f20969k = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, ValidationUtils.APPBOY_STRING_MAX_LENGTH, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, RecyclerView.C1119a0.FLAG_IGNORE, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else if ("R".equals(str)) {
            i = 30;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        f20959a = i;
        String str2 = Build.DEVICE;
        f20960b = str2;
        String str3 = Build.MANUFACTURER;
        f20961c = str3;
        String str4 = Build.MODEL;
        f20962d = str4;
        StringBuilder O = C0017h.m58O(C0016g.m25h(str3, C0016g.m25h(str4, C0016g.m25h(str2, 17))), str2, ", ", str4, ", ");
        O.append(str3);
        O.append(", ");
        O.append(i);
        f20963e = O.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    }

    /* renamed from: A */
    public static long m15939A(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* renamed from: B */
    public static void m15940B(long[] jArr, long j) {
        int i = 0;
        int i2 = (j > 1000000 ? 1 : (j == 1000000 ? 0 : -1));
        if (i2 >= 0 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (i2 >= 0 || 1000000 % j != 0) {
            double d = ((double) 1000000) / ((double) j);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }

    /* renamed from: a */
    public static boolean m15941a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15942b(long[] r4, long r5, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
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
            int r4 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r4 = r0
        L_0x001a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p277ub.C6774a0.m15942b(long[], long, boolean):int");
    }

    /* renamed from: c */
    public static int m15943c(C6790l lVar, long j) {
        int i = lVar.f21001a - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            if (lVar.mo22964b(i3) < j) {
                i2 = i3 + 1;
            } else {
                i = i3 - 1;
            }
        }
        int i4 = i + 1;
        if (i4 < lVar.f21001a && lVar.mo22964b(i4) == j) {
            return i4;
        }
        if (i == -1) {
            return 0;
        }
        return i;
    }

    /* renamed from: d */
    public static int m15944d(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0 || iArr[binarySearch] != i) {
            }
            binarySearch--;
            break;
        } while (iArr[binarySearch] != i);
        return binarySearch;
    }

    /* renamed from: e */
    public static int m15945e(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        if (z) {
            return Math.max(0, i);
        }
        return i;
    }

    /* renamed from: f */
    public static float m15946f(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: g */
    public static int m15947g(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: h */
    public static long m15948h(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: i */
    public static Handler m15949i(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        C17875h.m44306q(myLooper);
        return new Handler(myLooper, callback);
    }

    /* renamed from: j */
    public static String m15950j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: k */
    public static String m15951k(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, C18187b.f46429c);
    }

    /* renamed from: l */
    public static int m15952l(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f20959a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    public static Point m15953m(Context context) {
        Display display;
        boolean z;
        String str;
        DisplayManager displayManager;
        int i = f20959a;
        if (i < 17 || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            display = null;
        } else {
            display = displayManager.getDisplay(0);
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (i <= 29 && display.getDisplayId() == 0) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if ("Sony".equals(f20961c) && f20962d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                    return new Point(3840, 2160);
                }
                if (i < 28) {
                    str = m15960t("sys.display-size");
                } else {
                    str = m15960t("vendor.display-size");
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        String[] split = str.trim().split("x", -1);
                        if (split.length == 2) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            if (parseInt > 0 && parseInt2 > 0) {
                                return new Point(parseInt, parseInt2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        "Invalid display size: ".concat(valueOf);
                    }
                }
            }
        }
        Point point = new Point();
        int i2 = f20959a;
        if (i2 >= 23) {
            Display$Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            display.getRealSize(point);
            return point;
        } else {
            display.getSize(point);
            return point;
        }
    }

    /* renamed from: n */
    public static long m15954n(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: o */
    public static int m15955o(int i) {
        if (i == 8) {
            return 3;
        }
        if (i != 16) {
            return i != 24 ? i != 32 ? 0 : 805306368 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        }
        return 2;
    }

    /* renamed from: p */
    public static int m15956p(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* renamed from: q */
    public static int m15957q(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: r */
    public static String m15958r(StringBuilder sb, Formatter formatter, long j) {
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        if (j < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j3), Long.valueOf(j2)}).toString();
    }

    /* renamed from: s */
    public static String[] m15959s() {
        String[] strArr;
        String str;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i = f20959a;
        if (i >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, -1);
        } else {
            String[] strArr2 = new String[1];
            Locale locale = configuration.locale;
            if (i >= 21) {
                str = locale.toLanguageTag();
            } else {
                str = locale.toString();
            }
            strArr2[0] = str;
            strArr = strArr2;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr[i2] = m15964x(strArr[i2]);
        }
        return strArr;
    }

    /* renamed from: t */
    public static String m15960t(String str) {
        String str2;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            if (str.length() != 0) {
                str2 = "Failed to read system property ".concat(str);
            } else {
                str2 = new String("Failed to read system property ");
            }
            C6776b0.m15968a(str2, e);
            return null;
        }
    }

    /* renamed from: u */
    public static byte[] m15961u(String str) {
        return str.getBytes(C18187b.f46429c);
    }

    /* renamed from: v */
    public static boolean m15962v(C6803r rVar, C6803r rVar2, Inflater inflater) {
        int i = rVar.f21040c - rVar.f21039b;
        if (i <= 0) {
            return false;
        }
        if (rVar2.f21038a.length < i) {
            rVar2.mo22982a(i * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        byte[] bArr = rVar.f21038a;
        int i2 = rVar.f21039b;
        inflater.setInput(bArr, i2, rVar.f21040c - i2);
        int i3 = 0;
        while (true) {
            try {
                byte[] bArr2 = rVar2.f21038a;
                i3 += inflater.inflate(bArr2, i3, bArr2.length - i3);
                if (inflater.finished()) {
                    rVar2.mo23006y(i3);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else {
                    byte[] bArr3 = rVar2.f21038a;
                    if (i3 == bArr3.length) {
                        rVar2.mo22982a(bArr3.length * 2);
                    }
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m15963w(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: x */
    public static String m15964x(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String H0 = C14226d.m35341H0(str);
        int i = 0;
        String str2 = H0.split("-", 2)[0];
        if (f20965g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f20966h.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f20966h;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            f20965g = hashMap;
        }
        String str4 = f20965g.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(H0.substring(str2.length()));
            if (valueOf.length() != 0) {
                H0 = str4.concat(valueOf);
            } else {
                H0 = new String(str4);
            }
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return H0;
        }
        while (true) {
            String[] strArr2 = f20967i;
            if (i >= strArr2.length) {
                return H0;
            }
            if (H0.startsWith(strArr2[i])) {
                String valueOf2 = String.valueOf(strArr2[i + 1]);
                String valueOf3 = String.valueOf(H0.substring(strArr2[i].length()));
                if (valueOf3.length() != 0) {
                    return valueOf2.concat(valueOf3);
                }
                return new String(valueOf2);
            }
            i += 2;
        }
    }

    /* renamed from: y */
    public static Object[] m15965y(int i, Object[] objArr) {
        boolean z;
        if (i <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: z */
    public static void m15966z(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }
}
