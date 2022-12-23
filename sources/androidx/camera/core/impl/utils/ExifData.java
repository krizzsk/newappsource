package androidx.camera.core.impl.utils;

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import mf0.C24361g;
import p054d0.C4289j0;
import p078f0.C4639e;
import p078f0.C4640f;

public final class ExifData {

    /* renamed from: c */
    public static final C4640f[] f2038c = {new C4640f("SubIFDPointer", 330, 4), new C4640f("ExifIFDPointer", 34665, 4), new C4640f("GPSInfoIFDPointer", 34853, 4), new C4640f("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: d */
    public static final C4640f[][] f2039d;

    /* renamed from: e */
    public static final HashSet<String> f2040e = new HashSet<>(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));

    /* renamed from: a */
    public final List<Map<String, C4639e>> f2041a;

    /* renamed from: b */
    public final ByteOrder f2042b;

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$a */
    public static /* synthetic */ class C0598a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2043a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2044b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode[] r0 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2044b = r0
                r1 = 1
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r2 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2044b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.utils.ExifData$WhiteBalanceMode r3 = androidx.camera.core.impl.utils.ExifData.WhiteBalanceMode.MANUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState[] r2 = androidx.camera.core.impl.CameraCaptureMetaData$FlashState.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f2043a = r2
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r3 = androidx.camera.core.impl.CameraCaptureMetaData$FlashState.READY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f2043a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r2 = androidx.camera.core.impl.CameraCaptureMetaData$FlashState.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f2043a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.camera.core.impl.CameraCaptureMetaData$FlashState r1 = androidx.camera.core.impl.CameraCaptureMetaData$FlashState.FIRED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C0598a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.impl.utils.ExifData$b */
    public static final class C0599b {

        /* renamed from: c */
        public static final Pattern f2045c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        public static final Pattern f2046d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: e */
        public static final Pattern f2047e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: f */
        public static final ArrayList f2048f = Collections.list(new C0600a());

        /* renamed from: a */
        public final ArrayList f2049a = Collections.list(new C0601b());

        /* renamed from: b */
        public final ByteOrder f2050b;

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$a */
        public class C0600a implements Enumeration<HashMap<String, C4640f>> {

            /* renamed from: a */
            public int f2051a = 0;

            public final boolean hasMoreElements() {
                int i = this.f2051a;
                C4640f[] fVarArr = ExifData.f2038c;
                return i < 4;
            }

            public final Object nextElement() {
                HashMap hashMap = new HashMap();
                for (C4640f fVar : ExifData.f2039d[this.f2051a]) {
                    hashMap.put(fVar.f15867b, fVar);
                }
                this.f2051a++;
                return hashMap;
            }
        }

        /* renamed from: androidx.camera.core.impl.utils.ExifData$b$b */
        public class C0601b implements Enumeration<Map<String, C4639e>> {

            /* renamed from: a */
            public int f2052a = 0;

            public final boolean hasMoreElements() {
                int i = this.f2052a;
                C4640f[] fVarArr = ExifData.f2038c;
                return i < 4;
            }

            public final Object nextElement() {
                this.f2052a++;
                return new HashMap();
            }
        }

        public C0599b(ByteOrder byteOrder) {
            this.f2050b = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.util.Pair<java.lang.Integer, java.lang.Integer> m1734a(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = m1734a(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = m1734a(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = -1
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = -1
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = 10
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 < 0) goto L_0x00f5
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r4 = 5
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x00eb
                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r1)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                r2 = 4
                int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r3 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r3 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C0599b.m1734a(java.lang.String):android.util.Pair");
        }

        /* renamed from: b */
        public final void mo2509b(String str, String str2, ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            mo2510c(str, str2, arrayList);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:109:0x035d, code lost:
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0256, code lost:
            r17 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ee, code lost:
            r8 = 1;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2510c(java.lang.String r17, java.lang.String r18, java.util.ArrayList r19) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                java.lang.String r4 = "DateTime"
                boolean r4 = r4.equals(r1)
                java.lang.String r5 = "ExifData"
                if (r4 != 0) goto L_0x0022
                java.lang.String r4 = "DateTimeOriginal"
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L_0x0022
                java.lang.String r4 = "DateTimeDigitized"
                boolean r4 = r4.equals(r1)
                if (r4 == 0) goto L_0x0054
            L_0x0022:
                if (r2 == 0) goto L_0x0054
                java.util.regex.Pattern r4 = f2046d
                java.util.regex.Matcher r4 = r4.matcher(r2)
                boolean r4 = r4.find()
                java.util.regex.Pattern r6 = f2047e
                java.util.regex.Matcher r6 = r6.matcher(r2)
                boolean r6 = r6.find()
                int r7 = r18.length()
                r8 = 19
                if (r7 != r8) goto L_0x0050
                if (r4 != 0) goto L_0x0045
                if (r6 != 0) goto L_0x0045
                goto L_0x0050
            L_0x0045:
                if (r6 == 0) goto L_0x0054
                java.lang.String r4 = "-"
                java.lang.String r6 = ":"
                java.lang.String r2 = r2.replaceAll(r4, r6)
                goto L_0x0054
            L_0x0050:
                p054d0.C4289j0.m11435b(r5)
                return
            L_0x0054:
                java.lang.String r4 = "ISOSpeedRatings"
                boolean r4 = r4.equals(r1)
                if (r4 == 0) goto L_0x005e
                java.lang.String r1 = "PhotographicSensitivity"
            L_0x005e:
                java.lang.String r4 = "/"
                r6 = 2
                r7 = 3
                r8 = 1
                if (r2 == 0) goto L_0x00eb
                java.util.HashSet<java.lang.String> r9 = androidx.camera.core.impl.utils.ExifData.f2040e
                boolean r9 = r9.contains(r1)
                if (r9 == 0) goto L_0x00eb
                java.lang.String r9 = "GPSTimeStamp"
                boolean r9 = r1.equals(r9)
                if (r9 == 0) goto L_0x00c6
                java.util.regex.Pattern r9 = f2045c
                java.util.regex.Matcher r2 = r9.matcher(r2)
                boolean r9 = r2.find()
                if (r9 != 0) goto L_0x0085
                p054d0.C4289j0.m11435b(r5)
                return
            L_0x0085:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r9 = r2.group(r8)
                r9.getClass()
                int r9 = java.lang.Integer.parseInt(r9)
                r5.append(r9)
                java.lang.String r9 = "/1,"
                r5.append(r9)
                java.lang.String r10 = r2.group(r6)
                r10.getClass()
                int r10 = java.lang.Integer.parseInt(r10)
                r5.append(r10)
                r5.append(r9)
                java.lang.String r2 = r2.group(r7)
                r2.getClass()
                int r2 = java.lang.Integer.parseInt(r2)
                r5.append(r2)
                java.lang.String r2 = "/1"
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                goto L_0x00eb
            L_0x00c6:
                double r9 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x00e7 }
                r11 = 4666723172467343360(0x40c3880000000000, double:10000.0)
                double r9 = r9 * r11
                long r9 = (long) r9     // Catch:{ NumberFormatException -> 0x00e7 }
                r11 = 10000(0x2710, double:4.9407E-320)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00e7 }
                r2.<init>()     // Catch:{ NumberFormatException -> 0x00e7 }
                r2.append(r9)     // Catch:{ NumberFormatException -> 0x00e7 }
                r2.append(r4)     // Catch:{ NumberFormatException -> 0x00e7 }
                r2.append(r11)     // Catch:{ NumberFormatException -> 0x00e7 }
                java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x00e7 }
                goto L_0x00eb
            L_0x00e7:
                p054d0.C4289j0.m11435b(r5)
                return
            L_0x00eb:
                r5 = 0
                r7 = 0
            L_0x00ed:
                f0.f[] r9 = androidx.camera.core.impl.utils.ExifData.f2038c
                r9 = 4
                if (r7 >= r9) goto L_0x03ae
                java.util.ArrayList r9 = f2048f
                java.lang.Object r9 = r9.get(r7)
                java.util.HashMap r9 = (java.util.HashMap) r9
                java.lang.Object r9 = r9.get(r1)
                f0.f r9 = (p078f0.C4640f) r9
                if (r9 == 0) goto L_0x03a2
                if (r2 != 0) goto L_0x010f
                java.lang.Object r5 = r3.get(r7)
                java.util.Map r5 = (java.util.Map) r5
                r5.remove(r1)
                goto L_0x03a2
            L_0x010f:
                android.util.Pair r10 = m1734a(r2)
                int r11 = r9.f15868c
                java.lang.Object r12 = r10.first
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r13 = -1
                if (r11 == r12) goto L_0x0155
                int r11 = r9.f15868c
                java.lang.Object r12 = r10.second
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                if (r11 != r12) goto L_0x012d
                goto L_0x0155
            L_0x012d:
                int r11 = r9.f15869d
                if (r11 == r13) goto L_0x014a
                java.lang.Object r12 = r10.first
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                if (r11 == r12) goto L_0x0147
                int r11 = r9.f15869d
                java.lang.Object r10 = r10.second
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                if (r11 != r10) goto L_0x014a
            L_0x0147:
                int r6 = r9.f15869d
                goto L_0x0157
            L_0x014a:
                int r9 = r9.f15868c
                if (r9 == r8) goto L_0x0153
                r10 = 7
                if (r9 == r10) goto L_0x0153
                if (r9 != r6) goto L_0x03a2
            L_0x0153:
                r6 = r9
                goto L_0x0157
            L_0x0155:
                int r6 = r9.f15868c
            L_0x0157:
                java.lang.String r9 = ","
                switch(r6) {
                    case 1: goto L_0x035f;
                    case 2: goto L_0x033d;
                    case 3: goto L_0x02f1;
                    case 4: goto L_0x02c6;
                    case 5: goto L_0x025a;
                    case 6: goto L_0x015c;
                    case 7: goto L_0x033d;
                    case 8: goto L_0x015c;
                    case 9: goto L_0x020f;
                    case 10: goto L_0x01a6;
                    case 11: goto L_0x015c;
                    case 12: goto L_0x015e;
                    default: goto L_0x015c;
                }
            L_0x015c:
                goto L_0x03a2
            L_0x015e:
                java.lang.String[] r5 = r2.split(r9, r13)
                int r6 = r5.length
                double[] r9 = new double[r6]
                r10 = 0
            L_0x0166:
                int r11 = r5.length
                if (r10 >= r11) goto L_0x0174
                r11 = r5[r10]
                double r11 = java.lang.Double.parseDouble(r11)
                r9[r10] = r11
                int r10 = r10 + 1
                goto L_0x0166
            L_0x0174:
                java.lang.Object r5 = r3.get(r7)
                java.util.Map r5 = (java.util.Map) r5
                java.nio.ByteOrder r10 = r0.f2050b
                int[] r11 = p078f0.C4639e.f15862f
                r12 = 12
                r11 = r11[r12]
                int r11 = r11 * r6
                byte[] r11 = new byte[r11]
                java.nio.ByteBuffer r11 = java.nio.ByteBuffer.wrap(r11)
                r11.order(r10)
                r10 = 0
            L_0x018e:
                if (r10 >= r6) goto L_0x0198
                r13 = r9[r10]
                r11.putDouble(r13)
                int r10 = r10 + 1
                goto L_0x018e
            L_0x0198:
                f0.e r9 = new f0.e
                byte[] r10 = r11.array()
                r9.<init>(r12, r6, r10)
                r5.put(r1, r9)
                goto L_0x03a2
            L_0x01a6:
                java.lang.String[] r6 = r2.split(r9, r13)
                int r9 = r6.length
                f0.g[] r10 = new p078f0.C4641g[r9]
                r11 = 0
            L_0x01ae:
                int r12 = r6.length
                if (r11 >= r12) goto L_0x01d5
                r12 = r6[r11]
                java.lang.String[] r12 = r12.split(r4, r13)
                f0.g r13 = new f0.g
                r5 = r12[r5]
                double r14 = java.lang.Double.parseDouble(r5)
                long r14 = (long) r14
                r5 = r12[r8]
                r17 = r6
                double r5 = java.lang.Double.parseDouble(r5)
                long r5 = (long) r5
                r13.<init>(r14, r5)
                r10[r11] = r13
                int r11 = r11 + 1
                r5 = 0
                r13 = -1
                r6 = r17
                goto L_0x01ae
            L_0x01d5:
                java.lang.Object r5 = r3.get(r7)
                java.util.Map r5 = (java.util.Map) r5
                java.nio.ByteOrder r6 = r0.f2050b
                int[] r8 = p078f0.C4639e.f15862f
                r11 = 10
                r8 = r8[r11]
                int r8 = r8 * r9
                byte[] r8 = new byte[r8]
                java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r8)
                r8.order(r6)
                r6 = 0
            L_0x01ef:
                if (r6 >= r9) goto L_0x0202
                r12 = r10[r6]
                long r13 = r12.f15870a
                int r14 = (int) r13
                r8.putInt(r14)
                long r12 = r12.f15871b
                int r13 = (int) r12
                r8.putInt(r13)
                int r6 = r6 + 1
                goto L_0x01ef
            L_0x0202:
                f0.e r6 = new f0.e
                byte[] r8 = r8.array()
                r6.<init>(r11, r9, r8)
                r5.put(r1, r6)
                goto L_0x0256
            L_0x020f:
                r5 = -1
                java.lang.String[] r5 = r2.split(r9, r5)
                int r6 = r5.length
                int[] r8 = new int[r6]
                r9 = 0
            L_0x0218:
                int r10 = r5.length
                if (r9 >= r10) goto L_0x0226
                r10 = r5[r9]
                int r10 = java.lang.Integer.parseInt(r10)
                r8[r9] = r10
                int r9 = r9 + 1
                goto L_0x0218
            L_0x0226:
                java.lang.Object r5 = r3.get(r7)
                java.util.Map r5 = (java.util.Map) r5
                java.nio.ByteOrder r9 = r0.f2050b
                int[] r10 = p078f0.C4639e.f15862f
                r11 = 9
                r10 = r10[r11]
                int r10 = r10 * r6
                byte[] r10 = new byte[r10]
                java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
                r10.order(r9)
                r9 = 0
            L_0x0240:
                if (r9 >= r6) goto L_0x024a
                r12 = r8[r9]
                r10.putInt(r12)
                int r9 = r9 + 1
                goto L_0x0240
            L_0x024a:
                f0.e r8 = new f0.e
                byte[] r9 = r10.array()
                r8.<init>(r11, r6, r9)
                r5.put(r1, r8)
            L_0x0256:
                r17 = r4
                goto L_0x02ee
            L_0x025a:
                r5 = -1
                java.lang.String[] r6 = r2.split(r9, r5)
                int r9 = r6.length
                f0.g[] r10 = new p078f0.C4641g[r9]
                r11 = 0
            L_0x0263:
                int r12 = r6.length
                if (r11 >= r12) goto L_0x028b
                r12 = r6[r11]
                java.lang.String[] r5 = r12.split(r4, r5)
                f0.g r12 = new f0.g
                r13 = 0
                r13 = r5[r13]
                double r13 = java.lang.Double.parseDouble(r13)
                long r13 = (long) r13
                r5 = r5[r8]
                r17 = r4
                double r4 = java.lang.Double.parseDouble(r5)
                long r4 = (long) r4
                r12.<init>(r13, r4)
                r10[r11] = r12
                int r11 = r11 + 1
                r5 = -1
                r8 = 1
                r4 = r17
                goto L_0x0263
            L_0x028b:
                r17 = r4
                java.lang.Object r4 = r3.get(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r5 = r0.f2050b
                int[] r6 = p078f0.C4639e.f15862f
                r8 = 5
                r6 = r6[r8]
                int r6 = r6 * r9
                byte[] r6 = new byte[r6]
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
                r6.order(r5)
                r5 = 0
            L_0x02a6:
                if (r5 >= r9) goto L_0x02b9
                r11 = r10[r5]
                long r12 = r11.f15870a
                int r13 = (int) r12
                r6.putInt(r13)
                long r11 = r11.f15871b
                int r12 = (int) r11
                r6.putInt(r12)
                int r5 = r5 + 1
                goto L_0x02a6
            L_0x02b9:
                f0.e r5 = new f0.e
                byte[] r6 = r6.array()
                r5.<init>(r8, r9, r6)
                r4.put(r1, r5)
                goto L_0x02ee
            L_0x02c6:
                r17 = r4
                r4 = -1
                java.lang.String[] r4 = r2.split(r9, r4)
                int r5 = r4.length
                long[] r5 = new long[r5]
                r6 = 0
            L_0x02d1:
                int r8 = r4.length
                if (r6 >= r8) goto L_0x02df
                r8 = r4[r6]
                long r8 = java.lang.Long.parseLong(r8)
                r5[r6] = r8
                int r6 = r6 + 1
                goto L_0x02d1
            L_0x02df:
                java.lang.Object r4 = r3.get(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r6 = r0.f2050b
                f0.e r5 = p078f0.C4639e.m11957b(r5, r6)
                r4.put(r1, r5)
            L_0x02ee:
                r8 = 1
                goto L_0x03a4
            L_0x02f1:
                r17 = r4
                r4 = -1
                java.lang.String[] r4 = r2.split(r9, r4)
                int r5 = r4.length
                int[] r6 = new int[r5]
                r8 = 0
            L_0x02fc:
                int r9 = r4.length
                if (r8 >= r9) goto L_0x030a
                r9 = r4[r8]
                int r9 = java.lang.Integer.parseInt(r9)
                r6[r8] = r9
                int r8 = r8 + 1
                goto L_0x02fc
            L_0x030a:
                java.lang.Object r4 = r3.get(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.ByteOrder r8 = r0.f2050b
                int[] r9 = p078f0.C4639e.f15862f
                r10 = 3
                r9 = r9[r10]
                int r9 = r9 * r5
                byte[] r9 = new byte[r9]
                java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
                r9.order(r8)
                r8 = 0
            L_0x0323:
                if (r8 >= r5) goto L_0x032e
                r10 = r6[r8]
                short r10 = (short) r10
                r9.putShort(r10)
                int r8 = r8 + 1
                goto L_0x0323
            L_0x032e:
                f0.e r6 = new f0.e
                byte[] r8 = r9.array()
                r9 = 3
                r6.<init>(r9, r5, r8)
                r4.put(r1, r6)
                r4 = 1
                goto L_0x03a5
            L_0x033d:
                r17 = r4
                java.lang.Object r4 = r3.get(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.charset.Charset r5 = p078f0.C4639e.f15860d
                r5 = 0
                java.lang.String r5 = p001a0.C0016g.m28k(r2, r5)
                java.nio.charset.Charset r6 = p078f0.C4639e.f15860d
                byte[] r5 = r5.getBytes(r6)
                f0.e r6 = new f0.e
                int r8 = r5.length
                r9 = 2
                r6.<init>(r9, r8, r5)
                r4.put(r1, r6)
                r4 = 1
            L_0x035d:
                r8 = 1
                goto L_0x03a6
            L_0x035f:
                r17 = r4
                java.lang.Object r4 = r3.get(r7)
                java.util.Map r4 = (java.util.Map) r4
                java.nio.charset.Charset r5 = p078f0.C4639e.f15860d
                int r5 = r2.length()
                r6 = 1
                if (r5 != r6) goto L_0x0391
                r5 = 0
                char r8 = r2.charAt(r5)
                r9 = 48
                if (r8 < r9) goto L_0x0391
                char r8 = r2.charAt(r5)
                r10 = 49
                if (r8 > r10) goto L_0x0391
                byte[] r8 = new byte[r6]
                char r10 = r2.charAt(r5)
                int r10 = r10 - r9
                byte r9 = (byte) r10
                r8[r5] = r9
                f0.e r5 = new f0.e
                r5.<init>(r6, r6, r8)
                goto L_0x039e
            L_0x0391:
                java.nio.charset.Charset r5 = p078f0.C4639e.f15860d
                byte[] r5 = r2.getBytes(r5)
                f0.e r8 = new f0.e
                int r9 = r5.length
                r8.<init>(r6, r9, r5)
                r5 = r8
            L_0x039e:
                r4.put(r1, r5)
                goto L_0x035d
            L_0x03a2:
                r17 = r4
            L_0x03a4:
                r4 = r8
            L_0x03a5:
                r8 = r4
            L_0x03a6:
                int r7 = r7 + 1
                r5 = 0
                r6 = 2
                r4 = r17
                goto L_0x00ed
            L_0x03ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.C0599b.mo2510c(java.lang.String, java.lang.String, java.util.ArrayList):void");
        }

        /* renamed from: d */
        public final void mo2511d(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                C4289j0.m11435b("ExifData");
                i2 = 0;
            } else {
                i2 = 8;
            }
            mo2510c("Orientation", String.valueOf(i2), this.f2049a);
        }
    }

    static {
        C4640f[] fVarArr = {new C4640f("ImageWidth", 256, 3, 4), new C4640f("ImageLength", 257, 3, 4), new C4640f("Make", 271, 2), new C4640f("Model", 272, 2), new C4640f("Orientation", 274, 3), new C4640f("XResolution", 282, 5), new C4640f("YResolution", 283, 5), new C4640f("ResolutionUnit", 296, 3), new C4640f("Software", 305, 2), new C4640f("DateTime", 306, 2), new C4640f("YCbCrPositioning", 531, 3), new C4640f("SubIFDPointer", 330, 4), new C4640f("ExifIFDPointer", 34665, 4), new C4640f("GPSInfoIFDPointer", 34853, 4)};
        C4640f[] fVarArr2 = {new C4640f("ExposureTime", 33434, 5), new C4640f("FNumber", 33437, 5), new C4640f("ExposureProgram", 34850, 3), new C4640f("PhotographicSensitivity", 34855, 3), new C4640f("SensitivityType", 34864, 3), new C4640f("ExifVersion", 36864, 2), new C4640f("DateTimeOriginal", 36867, 2), new C4640f("DateTimeDigitized", 36868, 2), new C4640f("ComponentsConfiguration", 37121, 7), new C4640f("ShutterSpeedValue", 37377, 10), new C4640f("ApertureValue", 37378, 5), new C4640f("BrightnessValue", 37379, 10), new C4640f("ExposureBiasValue", 37380, 10), new C4640f("MaxApertureValue", 37381, 5), new C4640f("MeteringMode", 37383, 3), new C4640f("LightSource", 37384, 3), new C4640f("Flash", 37385, 3), new C4640f("FocalLength", 37386, 5), new C4640f("SubSecTime", 37520, 2), new C4640f("SubSecTimeOriginal", 37521, 2), new C4640f("SubSecTimeDigitized", 37522, 2), new C4640f("FlashpixVersion", 40960, 7), new C4640f("ColorSpace", 40961, 3), new C4640f("PixelXDimension", 40962, 3, 4), new C4640f("PixelYDimension", 40963, 3, 4), new C4640f("InteroperabilityIFDPointer", 40965, 4), new C4640f("FocalPlaneResolutionUnit", 41488, 3), new C4640f("SensingMethod", 41495, 3), new C4640f("FileSource", 41728, 7), new C4640f("SceneType", 41729, 7), new C4640f("CustomRendered", 41985, 3), new C4640f("ExposureMode", 41986, 3), new C4640f("WhiteBalance", 41987, 3), new C4640f("SceneCaptureType", 41990, 3), new C4640f("Contrast", 41992, 3), new C4640f("Saturation", 41993, 3), new C4640f("Sharpness", 41994, 3)};
        C4640f[] fVarArr3 = {new C4640f("GPSVersionID", 0, 1), new C4640f("GPSLatitudeRef", 1, 2), new C4640f("GPSLatitude", 2, 5, 10), new C4640f("GPSLongitudeRef", 3, 2), new C4640f("GPSLongitude", 4, 5, 10), new C4640f("GPSAltitudeRef", 5, 1), new C4640f("GPSAltitude", 6, 5), new C4640f("GPSTimeStamp", 7, 5), new C4640f("GPSSpeedRef", 12, 2), new C4640f("GPSTrackRef", 14, 2), new C4640f("GPSImgDirectionRef", 16, 2), new C4640f("GPSDestBearingRef", 23, 2), new C4640f("GPSDestDistanceRef", 25, 2)};
        f2039d = new C4640f[][]{fVarArr, fVarArr2, fVarArr3, new C4640f[]{new C4640f("InteroperabilityIndex", 1, 2)}};
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        boolean z;
        if (arrayList.size() == 4) {
            z = true;
        } else {
            z = false;
        }
        C24361g.m61193w("Malformed attributes list. Number of IFDs mismatch.", z);
        this.f2042b = byteOrder;
        this.f2041a = arrayList;
    }

    /* renamed from: a */
    public final Map<String, C4639e> mo2508a(int i) {
        C24361g.m61179p(i, 0, C25541a.m63878h("Invalid IFD index: ", i, ". Index should be between [0, EXIF_TAGS.length] "), 4);
        return this.f2041a.get(i);
    }
}
