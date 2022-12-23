package p289va;

import com.google.android.exoplayer2.Format;
import p125ia.C5329o;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6803r;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.q */
public final class C6920q implements C6907j {

    /* renamed from: a */
    public final C6803r f21531a;

    /* renamed from: b */
    public final C5329o.C5330a f21532b;

    /* renamed from: c */
    public final String f21533c;

    /* renamed from: d */
    public C5754v f21534d;

    /* renamed from: e */
    public String f21535e;

    /* renamed from: f */
    public int f21536f = 0;

    /* renamed from: g */
    public int f21537g;

    /* renamed from: h */
    public boolean f21538h;

    /* renamed from: i */
    public boolean f21539i;

    /* renamed from: j */
    public long f21540j;

    /* renamed from: k */
    public int f21541k;

    /* renamed from: l */
    public long f21542l;

    public C6920q(String str) {
        C6803r rVar = new C6803r(4);
        this.f21531a = rVar;
        rVar.f21038a[0] = -1;
        this.f21532b = new C5329o.C5330a();
        this.f21533c = str;
    }

    /* renamed from: b */
    public final void mo23139b(C6803r rVar) {
        boolean z;
        boolean z2;
        C17875h.m44306q(this.f21534d);
        while (true) {
            int i = rVar.f21040c;
            int i2 = rVar.f21039b;
            int i3 = i - i2;
            if (i3 > 0) {
                int i4 = this.f21536f;
                if (i4 == 0) {
                    byte[] bArr = rVar.f21038a;
                    while (true) {
                        if (i2 >= i) {
                            rVar.mo23007z(i);
                            break;
                        }
                        byte b = bArr[i2];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!this.f21539i || (b & 224) != 224) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        this.f21539i = z;
                        if (z2) {
                            rVar.mo23007z(i2 + 1);
                            this.f21539i = false;
                            this.f21531a.f21038a[1] = bArr[i2];
                            this.f21537g = 2;
                            this.f21536f = 1;
                            break;
                        }
                        i2++;
                    }
                } else if (i4 == 1) {
                    int min = Math.min(i3, 4 - this.f21537g);
                    rVar.mo22983b(this.f21537g, min, this.f21531a.f21038a);
                    int i5 = this.f21537g + min;
                    this.f21537g = i5;
                    if (i5 >= 4) {
                        this.f21531a.mo23007z(0);
                        if (!this.f21532b.mo21110a(this.f21531a.mo22984c())) {
                            this.f21537g = 0;
                            this.f21536f = 1;
                        } else {
                            C5329o.C5330a aVar = this.f21532b;
                            this.f21541k = aVar.f17561c;
                            if (!this.f21538h) {
                                int i6 = aVar.f17562d;
                                this.f21540j = (((long) aVar.f17565g) * 1000000) / ((long) i6);
                                Format.C3872b bVar = new Format.C3872b();
                                bVar.f13436a = this.f21535e;
                                bVar.f13446k = aVar.f17560b;
                                bVar.f13447l = 4096;
                                bVar.f13459x = aVar.f17563e;
                                bVar.f13460y = i6;
                                bVar.f13438c = this.f21533c;
                                this.f21534d.mo20632c(new Format(bVar));
                                this.f21538h = true;
                            }
                            this.f21531a.mo23007z(0);
                            this.f21534d.mo20631b(4, this.f21531a);
                            this.f21536f = 2;
                        }
                    }
                } else if (i4 == 2) {
                    int min2 = Math.min(i3, this.f21541k - this.f21537g);
                    this.f21534d.mo20631b(min2, rVar);
                    int i7 = this.f21537g + min2;
                    this.f21537g = i7;
                    int i8 = this.f21541k;
                    if (i7 >= i8) {
                        this.f21534d.mo20633d(this.f21542l, 1, i8, 0, (C5754v.C5755a) null);
                        this.f21542l += this.f21540j;
                        this.f21537g = 0;
                        this.f21536f = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21536f = 0;
        this.f21537g = 0;
        this.f21539i = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21542l = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21535e = dVar.f21327e;
        dVar.mo23152b();
        this.f21534d = jVar.mo20709p(dVar.f21326d, 1);
    }
}
