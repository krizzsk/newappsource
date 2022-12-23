package ra0;

import java.nio.FloatBuffer;
import java.util.List;
import na0.C12924c;
import na0.C12928f;
import pa0.C12998a;
import qa0.C13044b;
import ya0.C13275b;

/* renamed from: ra0.a */
public abstract class C13054a extends C12998a {

    /* renamed from: d */
    public final int f32287d;

    /* renamed from: e */
    public final int f32288e;

    /* renamed from: f */
    public final int f32289f;

    /* renamed from: g */
    public final long f32290g;

    /* renamed from: h */
    public C12924c f32291h = new C12924c(-1);

    /* renamed from: i */
    public boolean f32292i = true;

    /* renamed from: j */
    public String f32293j;

    /* renamed from: k */
    public volatile List<C13055a> f32294k;

    /* renamed from: ra0.a$a */
    public static class C13055a {

        /* renamed from: a */
        public final float f32295a;

        /* renamed from: b */
        public final float f32296b;

        /* renamed from: c */
        public final float f32297c;

        /* renamed from: d */
        public final float f32298d;

        /* renamed from: e */
        public final long f32299e;

        /* renamed from: f */
        public final FloatBuffer f32300f;

        public C13055a(float f, float f2, float f3, float f4, long j, FloatBuffer floatBuffer) {
            this.f32295a = f;
            this.f32296b = f2;
            this.f32297c = f3;
            this.f32298d = f4;
            this.f32299e = j;
            this.f32300f = floatBuffer;
        }
    }

    public C13054a(C13044b bVar, int i, int i2, int i3, String str) {
        super(bVar);
        this.f32287d = i;
        this.f32288e = i2;
        this.f32289f = i3;
        this.f32290g = ((long) i3) * C13275b.f32935b;
        this.f32293j = str;
    }

    /* renamed from: b */
    public abstract void mo39935b(C12928f fVar, boolean z);
}
