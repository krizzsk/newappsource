package p148k8;

/* renamed from: k8.a */
public final class C5521a {

    /* renamed from: a */
    public int[] f18086a;

    /* renamed from: b */
    public int f18087b;

    /* renamed from: c */
    public float[] f18088c;

    /* renamed from: k8.a$a */
    public static final class C5522a {
        /* renamed from: a */
        public static final int m13729a(int[] iArr) {
            boolean z;
            int i = 1;
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = iArr[0];
                int length = iArr.length - 1;
                if (1 <= length) {
                    while (true) {
                        i2 *= iArr[i];
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                return i2;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }

    static {
        new C5522a();
    }

    public C5521a(int[] iArr) {
        this.f18086a = iArr;
        int a = C5522a.m13729a(iArr);
        this.f18087b = a;
        this.f18088c = new float[a];
    }
}
