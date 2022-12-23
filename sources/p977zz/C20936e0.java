package p977zz;

/* renamed from: zz.e0 */
public final class C20936e0 {

    /* renamed from: a */
    public static final double f52681a = Math.log(2.0d);

    /* renamed from: b */
    public static final double f52682b;

    /* renamed from: c */
    public static final double f52683c;

    /* renamed from: d */
    public static final /* synthetic */ int f52684d = 0;

    static {
        Math.sqrt(5.0d);
        double sqrt = Math.sqrt(2.0d);
        f52682b = sqrt;
        f52683c = sqrt / 2.0d;
    }

    /* renamed from: a */
    public static int m49035a(int i, int i2) {
        if (i < 0) {
            return -m49037c(-i, i2);
        }
        return (i2 - (i % i2)) + i;
    }

    /* renamed from: b */
    public static int m49036b(int i, int i2, int i3) {
        return Math.max(i, Math.min(i2, i3));
    }

    /* renamed from: c */
    public static int m49037c(int i, int i2) {
        if (i < 0) {
            return -m49035a(-i, i2);
        }
        return i - (i % i2);
    }
}
