package p988j$.time;

/* renamed from: j$.time.e */
abstract /* synthetic */ class C25794e {

    /* renamed from: a */
    static final /* synthetic */ int[] f64334a;

    /* renamed from: b */
    static final /* synthetic */ int[] f64335b;

    /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
    static {
        /*
            j$.time.temporal.b[] r0 = p988j$.time.temporal.C25831b.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            f64335b = r0
            r1 = 1
            j$.time.temporal.b r2 = p988j$.time.temporal.C25831b.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            r0 = 2
            int[] r2 = f64335b     // Catch:{ NoSuchFieldError -> 0x001d }
            j$.time.temporal.b r3 = p988j$.time.temporal.C25831b.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            r2 = 3
            int[] r3 = f64335b     // Catch:{ NoSuchFieldError -> 0x0028 }
            j$.time.temporal.b r4 = p988j$.time.temporal.C25831b.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            r3 = 4
            int[] r4 = f64335b     // Catch:{ NoSuchFieldError -> 0x0033 }
            j$.time.temporal.b r5 = p988j$.time.temporal.C25831b.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r4 = f64335b     // Catch:{ NoSuchFieldError -> 0x003e }
            j$.time.temporal.b r5 = p988j$.time.temporal.C25831b.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r6 = 5
            r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r4 = f64335b     // Catch:{ NoSuchFieldError -> 0x0049 }
            j$.time.temporal.b r5 = p988j$.time.temporal.C25831b.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r6 = 6
            r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r4 = f64335b     // Catch:{ NoSuchFieldError -> 0x0054 }
            j$.time.temporal.b r5 = p988j$.time.temporal.C25831b.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r6 = 7
            r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            int[] r4 = f64335b     // Catch:{ NoSuchFieldError -> 0x0060 }
            j$.time.temporal.b r5 = p988j$.time.temporal.C25831b.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r6 = 8
            r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            j$.time.temporal.a[] r4 = p988j$.time.temporal.C25830a.values()
            int r4 = r4.length
            int[] r4 = new int[r4]
            f64334a = r4
            j$.time.temporal.a r5 = p988j$.time.temporal.C25830a.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
            r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            int[] r1 = f64334a     // Catch:{ NoSuchFieldError -> 0x007b }
            j$.time.temporal.a r4 = p988j$.time.temporal.C25830a.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
            r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            int[] r0 = f64334a     // Catch:{ NoSuchFieldError -> 0x0085 }
            j$.time.temporal.a r1 = p988j$.time.temporal.C25830a.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
        L_0x0085:
            int[] r0 = f64334a     // Catch:{ NoSuchFieldError -> 0x008f }
            j$.time.temporal.a r1 = p988j$.time.temporal.C25830a.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
            r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.time.C25794e.<clinit>():void");
    }
}
