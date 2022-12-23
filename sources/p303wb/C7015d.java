package p303wb;

import p583jk.C17875h;

/* renamed from: wb.d */
public final class C7015d {

    /* renamed from: a */
    public final C7016a f21828a;

    /* renamed from: b */
    public final C7016a f21829b;

    /* renamed from: c */
    public final int f21830c;

    /* renamed from: d */
    public final boolean f21831d;

    /* renamed from: wb.d$a */
    public static final class C7016a {

        /* renamed from: a */
        public final C7017b[] f21832a;

        public C7016a(C7017b... bVarArr) {
            this.f21832a = bVarArr;
        }
    }

    /* renamed from: wb.d$b */
    public static final class C7017b {

        /* renamed from: a */
        public final int f21833a;

        /* renamed from: b */
        public final int f21834b;

        /* renamed from: c */
        public final float[] f21835c;

        /* renamed from: d */
        public final float[] f21836d;

        public C7017b(int i, float[] fArr, float[] fArr2, int i2) {
            boolean z;
            this.f21833a = i;
            if (((long) fArr.length) * 2 == ((long) fArr2.length) * 3) {
                z = true;
            } else {
                z = false;
            }
            C17875h.m44301k(z);
            this.f21835c = fArr;
            this.f21836d = fArr2;
            this.f21834b = i2;
        }
    }

    public C7015d() {
        throw null;
    }

    public C7015d(C7016a aVar, C7016a aVar2, int i) {
        this.f21828a = aVar;
        this.f21829b = aVar2;
        this.f21830c = i;
        this.f21831d = aVar == aVar2;
    }
}
