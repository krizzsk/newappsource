package p260t6;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import p025b6.C1487b;
import p025b6.C1489d;
import p025b6.C1492e;
import p060d6.C4385f;
import p146k6.C5499e;
import p146k6.C5502h;
import p146k6.C5503i;
import p146k6.C5509n;
import p260t6.C6595a;
import p298w6.C6999c;
import p311x6.C7163b;
import p311x6.C7176l;
import p584jl.C17885a;
import p988j$.util.Spliterator;

/* renamed from: t6.a */
public abstract class C6595a<T extends C6595a<T>> implements Cloneable {

    /* renamed from: A */
    public boolean f20416A;

    /* renamed from: b */
    public int f20417b;

    /* renamed from: c */
    public float f20418c = 1.0f;

    /* renamed from: d */
    public C4385f f20419d = C4385f.f15424e;

    /* renamed from: e */
    public Priority f20420e = Priority.NORMAL;

    /* renamed from: f */
    public Drawable f20421f;

    /* renamed from: g */
    public int f20422g;

    /* renamed from: h */
    public Drawable f20423h;

    /* renamed from: i */
    public int f20424i;

    /* renamed from: j */
    public boolean f20425j = true;

    /* renamed from: k */
    public int f20426k = -1;

    /* renamed from: l */
    public int f20427l = -1;

    /* renamed from: m */
    public C1487b f20428m = C6999c.f21776b;

    /* renamed from: n */
    public boolean f20429n;

    /* renamed from: o */
    public boolean f20430o = true;

    /* renamed from: p */
    public Drawable f20431p;

    /* renamed from: q */
    public int f20432q;

    /* renamed from: r */
    public C1492e f20433r = new C1492e();

    /* renamed from: s */
    public C7163b f20434s = new C7163b();

    /* renamed from: t */
    public Class<?> f20435t = Object.class;

    /* renamed from: u */
    public boolean f20436u;

    /* renamed from: v */
    public Resources.Theme f20437v;

    /* renamed from: w */
    public boolean f20438w;

    /* renamed from: x */
    public boolean f20439x;

    /* renamed from: y */
    public boolean f20440y;

    /* renamed from: z */
    public boolean f20441z = true;

    /* renamed from: o */
    public static boolean m15550o(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final void mo22711A() {
        if (this.f20436u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b6.d, java.lang.Object, b6.d<Y>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo22712B(p025b6.C1489d<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f20438w
            if (r0 == 0) goto L_0x000d
            t6.a r0 = r1.clone()
            t6.a r2 = r0.mo22712B(r2, r3)
            return r2
        L_0x000d:
            p584jl.C17885a.m44458r(r2)
            p584jl.C17885a.m44458r(r3)
            b6.e r0 = r1.f20433r
            x6.b r0 = r0.f5396b
            r0.put(r2, r3)
            r1.mo22711A()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C6595a.mo22712B(b6.d, java.lang.Object):t6.a");
    }

    /* renamed from: D */
    public T mo22713D(C1487b bVar) {
        if (this.f20438w) {
            return clone().mo22713D(bVar);
        }
        this.f20428m = bVar;
        this.f20417b |= 1024;
        mo22711A();
        return this;
    }

    /* renamed from: E */
    public T mo22714E(float f) {
        if (this.f20438w) {
            return clone().mo22714E(f);
        }
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f20418c = f;
        this.f20417b |= 2;
        mo22711A();
        return this;
    }

    /* renamed from: F */
    public T mo22715F(boolean z) {
        if (this.f20438w) {
            return clone().mo22715F(true);
        }
        this.f20425j = !z;
        this.f20417b |= 256;
        mo22711A();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [b6.h, b6.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo22716G(p025b6.C1495h<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            t6.a r2 = r1.mo22717H(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C6595a.mo22716G(b6.h):t6.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [b6.h, b6.h<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo22717H(p025b6.C1495h<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f20438w
            if (r0 == 0) goto L_0x000d
            t6.a r0 = r2.clone()
            t6.a r3 = r0.mo22717H(r3, r4)
            return r3
        L_0x000d:
            k6.l r0 = new k6.l
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo22719J(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo22719J(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.mo22719J(r1, r0, r4)
            java.lang.Class<o6.c> r0 = p195o6.C5998c.class
            o6.e r1 = new o6.e
            r1.<init>(r3)
            r2.mo22719J(r0, r1, r4)
            r2.mo22711A()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C6595a.mo22717H(b6.h, boolean):t6.a");
    }

    /* renamed from: I */
    public final C6595a mo22718I(DownsampleStrategy downsampleStrategy, C5499e eVar) {
        if (this.f20438w) {
            return clone().mo22718I(downsampleStrategy, eVar);
        }
        mo22728k(downsampleStrategy);
        return mo22716G(eVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [b6.h, java.lang.Object, b6.h<Y>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <Y> T mo22719J(java.lang.Class<Y> r2, p025b6.C1495h<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f20438w
            if (r0 == 0) goto L_0x000d
            t6.a r0 = r1.clone()
            t6.a r2 = r0.mo22719J(r2, r3, r4)
            return r2
        L_0x000d:
            p584jl.C17885a.m44458r(r3)
            x6.b r0 = r1.f20434s
            r0.put(r2, r3)
            int r2 = r1.f20417b
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f20430o = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f20417b = r2
            r0 = 0
            r1.f20441z = r0
            if (r4 == 0) goto L_0x002d
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f20417b = r2
            r1.f20429n = r3
        L_0x002d:
            r1.mo22711A()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p260t6.C6595a.mo22719J(java.lang.Class, b6.h, boolean):t6.a");
    }

    /* renamed from: K */
    public C6595a mo22720K() {
        if (this.f20438w) {
            return clone().mo22720K();
        }
        this.f20416A = true;
        this.f20417b |= 1048576;
        mo22711A();
        return this;
    }

    /* renamed from: L */
    public C6595a mo22721L() {
        if (this.f20438w) {
            return clone().mo22721L();
        }
        this.f20439x = true;
        this.f20417b |= SQLiteDatabase.OPEN_PRIVATECACHE;
        mo22711A();
        return this;
    }

    /* renamed from: a */
    public T mo10857a(C6595a<?> aVar) {
        if (this.f20438w) {
            return clone().mo10857a(aVar);
        }
        if (m15550o(aVar.f20417b, 2)) {
            this.f20418c = aVar.f20418c;
        }
        if (m15550o(aVar.f20417b, SQLiteDatabase.OPEN_PRIVATECACHE)) {
            this.f20439x = aVar.f20439x;
        }
        if (m15550o(aVar.f20417b, 1048576)) {
            this.f20416A = aVar.f20416A;
        }
        if (m15550o(aVar.f20417b, 4)) {
            this.f20419d = aVar.f20419d;
        }
        if (m15550o(aVar.f20417b, 8)) {
            this.f20420e = aVar.f20420e;
        }
        if (m15550o(aVar.f20417b, 16)) {
            this.f20421f = aVar.f20421f;
            this.f20422g = 0;
            this.f20417b &= -33;
        }
        if (m15550o(aVar.f20417b, 32)) {
            this.f20422g = aVar.f20422g;
            this.f20421f = null;
            this.f20417b &= -17;
        }
        if (m15550o(aVar.f20417b, 64)) {
            this.f20423h = aVar.f20423h;
            this.f20424i = 0;
            this.f20417b &= -129;
        }
        if (m15550o(aVar.f20417b, RecyclerView.C1119a0.FLAG_IGNORE)) {
            this.f20424i = aVar.f20424i;
            this.f20423h = null;
            this.f20417b &= -65;
        }
        if (m15550o(aVar.f20417b, 256)) {
            this.f20425j = aVar.f20425j;
        }
        if (m15550o(aVar.f20417b, 512)) {
            this.f20427l = aVar.f20427l;
            this.f20426k = aVar.f20426k;
        }
        if (m15550o(aVar.f20417b, 1024)) {
            this.f20428m = aVar.f20428m;
        }
        if (m15550o(aVar.f20417b, 4096)) {
            this.f20435t = aVar.f20435t;
        }
        if (m15550o(aVar.f20417b, 8192)) {
            this.f20431p = aVar.f20431p;
            this.f20432q = 0;
            this.f20417b &= -16385;
        }
        if (m15550o(aVar.f20417b, Spliterator.SUBSIZED)) {
            this.f20432q = aVar.f20432q;
            this.f20431p = null;
            this.f20417b &= -8193;
        }
        if (m15550o(aVar.f20417b, 32768)) {
            this.f20437v = aVar.f20437v;
        }
        if (m15550o(aVar.f20417b, SQLiteDatabase.OPEN_FULLMUTEX)) {
            this.f20430o = aVar.f20430o;
        }
        if (m15550o(aVar.f20417b, SQLiteDatabase.OPEN_SHAREDCACHE)) {
            this.f20429n = aVar.f20429n;
        }
        if (m15550o(aVar.f20417b, 2048)) {
            this.f20434s.putAll(aVar.f20434s);
            this.f20441z = aVar.f20441z;
        }
        if (m15550o(aVar.f20417b, 524288)) {
            this.f20440y = aVar.f20440y;
        }
        if (!this.f20430o) {
            this.f20434s.clear();
            this.f20429n = false;
            this.f20417b = this.f20417b & -2049 & -131073;
            this.f20441z = true;
        }
        this.f20417b |= aVar.f20417b;
        this.f20433r.f5396b.mo22418i(aVar.f20433r.f5396b);
        mo22711A();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6595a) {
            C6595a aVar = (C6595a) obj;
            if (Float.compare(aVar.f20418c, this.f20418c) == 0 && this.f20422g == aVar.f20422g && C7176l.m16782b(this.f20421f, aVar.f20421f) && this.f20424i == aVar.f20424i && C7176l.m16782b(this.f20423h, aVar.f20423h) && this.f20432q == aVar.f20432q && C7176l.m16782b(this.f20431p, aVar.f20431p) && this.f20425j == aVar.f20425j && this.f20426k == aVar.f20426k && this.f20427l == aVar.f20427l && this.f20429n == aVar.f20429n && this.f20430o == aVar.f20430o && this.f20439x == aVar.f20439x && this.f20440y == aVar.f20440y && this.f20419d.equals(aVar.f20419d) && this.f20420e == aVar.f20420e && this.f20433r.equals(aVar.f20433r) && this.f20434s.equals(aVar.f20434s) && this.f20435t.equals(aVar.f20435t) && C7176l.m16782b(this.f20428m, aVar.f20428m) && C7176l.m16782b(this.f20437v, aVar.f20437v)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public T mo22723f() {
        if (!this.f20436u || this.f20438w) {
            this.f20438w = true;
            return mo22731p();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: g */
    public T clone() {
        try {
            T t = (C6595a) super.clone();
            C1492e eVar = new C1492e();
            t.f20433r = eVar;
            eVar.f5396b.mo22418i(this.f20433r.f5396b);
            C7163b bVar = new C7163b();
            t.f20434s = bVar;
            bVar.putAll(this.f20434s);
            t.f20436u = false;
            t.f20438w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public T mo22724h(Class<?> cls) {
        if (this.f20438w) {
            return clone().mo22724h(cls);
        }
        this.f20435t = cls;
        this.f20417b |= 4096;
        mo22711A();
        return this;
    }

    public final int hashCode() {
        float f = this.f20418c;
        char[] cArr = C7176l.f22265a;
        return C7176l.m16787g(C7176l.m16787g(C7176l.m16787g(C7176l.m16787g(C7176l.m16787g(C7176l.m16787g(C7176l.m16787g((((((((((((((C7176l.m16787g((C7176l.m16787g((C7176l.m16787g(((Float.floatToIntBits(f) + 527) * 31) + this.f20422g, this.f20421f) * 31) + this.f20424i, this.f20423h) * 31) + this.f20432q, this.f20431p) * 31) + (this.f20425j ? 1 : 0)) * 31) + this.f20426k) * 31) + this.f20427l) * 31) + (this.f20429n ? 1 : 0)) * 31) + (this.f20430o ? 1 : 0)) * 31) + (this.f20439x ? 1 : 0)) * 31) + (this.f20440y ? 1 : 0), this.f20419d), this.f20420e), this.f20433r), this.f20434s), this.f20435t), this.f20428m), this.f20437v);
    }

    /* renamed from: i */
    public T mo22726i(C4385f fVar) {
        if (this.f20438w) {
            return clone().mo22726i(fVar);
        }
        C17885a.m44458r(fVar);
        this.f20419d = fVar;
        this.f20417b |= 4;
        mo22711A();
        return this;
    }

    /* renamed from: j */
    public T mo22727j() {
        if (this.f20438w) {
            return clone().mo22727j();
        }
        this.f20434s.clear();
        this.f20429n = false;
        this.f20430o = false;
        this.f20417b = (this.f20417b & -2049 & -131073) | SQLiteDatabase.OPEN_FULLMUTEX;
        this.f20441z = true;
        mo22711A();
        return this;
    }

    /* renamed from: k */
    public T mo22728k(DownsampleStrategy downsampleStrategy) {
        C1489d dVar = DownsampleStrategy.f7153f;
        C17885a.m44458r(downsampleStrategy);
        return mo22712B(dVar, downsampleStrategy);
    }

    /* renamed from: l */
    public C6595a mo22729l() {
        if (this.f20438w) {
            return clone().mo22729l();
        }
        this.f20421f = null;
        this.f20422g = 0;
        this.f20417b = (this.f20417b | 16) & -33;
        mo22711A();
        return this;
    }

    /* renamed from: m */
    public T mo22730m(int i) {
        if (this.f20438w) {
            return clone().mo22730m(i);
        }
        this.f20422g = i;
        this.f20421f = null;
        this.f20417b = (this.f20417b | 32) & -17;
        mo22711A();
        return this;
    }

    /* renamed from: p */
    public T mo22731p() {
        this.f20436u = true;
        return this;
    }

    /* renamed from: q */
    public T mo22732q(boolean z) {
        if (this.f20438w) {
            return clone().mo22732q(z);
        }
        this.f20440y = z;
        this.f20417b |= 524288;
        mo22711A();
        return this;
    }

    /* renamed from: r */
    public T mo22733r() {
        return mo22736u(DownsampleStrategy.f7150c, new C5502h());
    }

    /* renamed from: s */
    public T mo22734s() {
        return mo22741z(DownsampleStrategy.f7149b, new C5503i(), false);
    }

    /* renamed from: t */
    public T mo22735t() {
        return mo22741z(DownsampleStrategy.f7148a, new C5509n(), false);
    }

    /* renamed from: u */
    public final C6595a mo22736u(DownsampleStrategy downsampleStrategy, C5499e eVar) {
        if (this.f20438w) {
            return clone().mo22736u(downsampleStrategy, eVar);
        }
        mo22728k(downsampleStrategy);
        return mo22717H(eVar, false);
    }

    /* renamed from: v */
    public T mo22737v(int i, int i2) {
        if (this.f20438w) {
            return clone().mo22737v(i, i2);
        }
        this.f20427l = i;
        this.f20426k = i2;
        this.f20417b |= 512;
        mo22711A();
        return this;
    }

    /* renamed from: w */
    public T mo22738w(int i) {
        if (this.f20438w) {
            return clone().mo22738w(i);
        }
        this.f20424i = i;
        int i2 = this.f20417b | RecyclerView.C1119a0.FLAG_IGNORE;
        this.f20423h = null;
        this.f20417b = i2 & -65;
        mo22711A();
        return this;
    }

    /* renamed from: x */
    public C6595a mo22739x(ColorDrawable colorDrawable) {
        if (this.f20438w) {
            return clone().mo22739x(colorDrawable);
        }
        this.f20423h = colorDrawable;
        this.f20424i = 0;
        this.f20417b = (this.f20417b | 64) & -129;
        mo22711A();
        return this;
    }

    /* renamed from: y */
    public T mo22740y(Priority priority) {
        if (this.f20438w) {
            return clone().mo22740y(priority);
        }
        C17885a.m44458r(priority);
        this.f20420e = priority;
        this.f20417b |= 8;
        mo22711A();
        return this;
    }

    /* renamed from: z */
    public final C6595a mo22741z(DownsampleStrategy downsampleStrategy, C5499e eVar, boolean z) {
        C6595a aVar;
        if (z) {
            aVar = mo22718I(downsampleStrategy, eVar);
        } else {
            aVar = mo22736u(downsampleStrategy, eVar);
        }
        aVar.f20441z = true;
        return aVar;
    }
}
