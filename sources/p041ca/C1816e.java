package p041ca;

/* renamed from: ca.e */
public abstract class C1816e {

    /* renamed from: a */
    public static final C1808a f6319a;

    static {
        String str;
        Long l = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l2 = 604800000L;
        Integer num3 = 81920;
        if (l == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = C25541a.m63881k(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = C25541a.m63881k(str, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            str = C25541a.m63881k(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = C25541a.m63881k(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f6319a = new C1808a(l.longValue(), num.intValue(), num2.intValue(), l2.longValue(), num3.intValue());
            return;
        }
        throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str));
    }

    /* renamed from: a */
    public abstract int mo6622a();

    /* renamed from: b */
    public abstract long mo6623b();

    /* renamed from: c */
    public abstract int mo6624c();

    /* renamed from: d */
    public abstract int mo6625d();

    /* renamed from: e */
    public abstract long mo6626e();
}
