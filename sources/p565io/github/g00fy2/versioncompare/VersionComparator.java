package p565io.github.g00fy2.versioncompare;

/* renamed from: io.github.g00fy2.versioncompare.VersionComparator */
public final class VersionComparator {

    /* renamed from: io.github.g00fy2.versioncompare.VersionComparator$ReleaseType */
    public enum ReleaseType {
        SNAPSHOT,
        PRE_ALPHA,
        ALPHA,
        BETA,
        RC,
        STABLE
    }

    /* renamed from: io.github.g00fy2.versioncompare.VersionComparator$a */
    public static /* synthetic */ class C23694a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59874a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.github.g00fy2.versioncompare.VersionComparator$ReleaseType[] r0 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f59874a = r0
                io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r1 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.RC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f59874a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r1 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.BETA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f59874a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r1 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.ALPHA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f59874a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r1 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.PRE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p565io.github.g00fy2.versioncompare.VersionComparator.C23694a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static long m58182a(String str) {
        if (str.length() > 19) {
            str = str.substring(0, 19);
        }
        return Long.parseLong(str);
    }
}
