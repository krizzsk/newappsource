package p289va;

import com.google.android.exoplayer2.ParserException;
import p173ma.C5737j;
import p277ub.C6802q;
import p277ub.C6803r;
import p277ub.C6812y;
import p289va.C6896d0;
import p583jk.C17875h;

/* renamed from: va.t */
public final class C6923t implements C6896d0 {

    /* renamed from: a */
    public final C6907j f21551a;

    /* renamed from: b */
    public final C6802q f21552b = new C6802q(new byte[10], 10);

    /* renamed from: c */
    public int f21553c = 0;

    /* renamed from: d */
    public int f21554d;

    /* renamed from: e */
    public C6812y f21555e;

    /* renamed from: f */
    public boolean f21556f;

    /* renamed from: g */
    public boolean f21557g;

    /* renamed from: h */
    public boolean f21558h;

    /* renamed from: i */
    public int f21559i;

    /* renamed from: j */
    public int f21560j;

    /* renamed from: k */
    public boolean f21561k;

    /* renamed from: l */
    public long f21562l;

    public C6923t(C6907j jVar) {
        this.f21551a = jVar;
    }

    /* renamed from: a */
    public final void mo23147a(C6812y yVar, C5737j jVar, C6896d0.C6900d dVar) {
        this.f21555e = yVar;
        this.f21551a.mo23143f(jVar, dVar);
    }

    /* renamed from: b */
    public final void mo23148b(int i, C6803r rVar) throws ParserException {
        boolean z;
        int i2;
        int i3;
        C6803r rVar2 = rVar;
        C17875h.m44306q(this.f21555e);
        int i4 = 0;
        int i5 = 3;
        if ((i & 1) != 0) {
            int i6 = this.f21553c;
            if (!(i6 == 0 || i6 == 1 || i6 == 2)) {
                if (i6 == 3) {
                    this.f21551a.mo23141d();
                } else {
                    throw new IllegalStateException();
                }
            }
            this.f21553c = 1;
            this.f21554d = 0;
        }
        int i7 = i;
        while (true) {
            int i8 = rVar2.f21040c;
            int i9 = rVar2.f21039b;
            int i11 = i8 - i9;
            if (i11 > 0) {
                int i12 = this.f21553c;
                if (i12 == 0) {
                    rVar2.mo22981A(i11);
                } else if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == i5) {
                            int i13 = this.f21560j;
                            if (i13 == -1) {
                                i3 = 0;
                            } else {
                                i3 = i11 - i13;
                            }
                            if (i3 > 0) {
                                i11 -= i3;
                                rVar2.mo23006y(i9 + i11);
                            }
                            this.f21551a.mo23139b(rVar2);
                            int i14 = this.f21560j;
                            if (i14 != -1) {
                                int i15 = i14 - i11;
                                this.f21560j = i15;
                                if (i15 == 0) {
                                    this.f21551a.mo23141d();
                                    this.f21553c = 1;
                                    this.f21554d = i4;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (mo23167d(Math.min(10, this.f21559i), rVar2, this.f21552b.f21034a) && mo23167d(this.f21559i, rVar2, (byte[]) null)) {
                        this.f21552b.mo22977j(i4);
                        this.f21562l = -9223372036854775807L;
                        int i16 = 4;
                        if (this.f21556f) {
                            this.f21552b.mo22979l(4);
                            this.f21552b.mo22979l(1);
                            this.f21552b.mo22979l(1);
                            long f = (((long) this.f21552b.mo22973f(i5)) << 30) | ((long) (this.f21552b.mo22973f(15) << 15)) | ((long) this.f21552b.mo22973f(15));
                            this.f21552b.mo22979l(1);
                            if (!this.f21558h && this.f21557g) {
                                this.f21552b.mo22979l(4);
                                this.f21552b.mo22979l(1);
                                long f2 = (long) (this.f21552b.mo22973f(15) << 15);
                                this.f21552b.mo22979l(1);
                                this.f21552b.mo22979l(1);
                                this.f21555e.mo23033b(f2 | (((long) this.f21552b.mo22973f(i5)) << 30) | ((long) this.f21552b.mo22973f(15)));
                                this.f21558h = true;
                            }
                            this.f21562l = this.f21555e.mo23033b(f);
                        }
                        if (!this.f21561k) {
                            i16 = 0;
                        }
                        i7 |= i16;
                        this.f21551a.mo23142e(i7, this.f21562l);
                        this.f21553c = 3;
                        this.f21554d = 0;
                    }
                } else if (mo23167d(9, rVar2, this.f21552b.f21034a)) {
                    this.f21552b.mo22977j(0);
                    if (this.f21552b.mo22973f(24) != 1) {
                        this.f21560j = -1;
                        z = false;
                    } else {
                        this.f21552b.mo22979l(8);
                        int f3 = this.f21552b.mo22973f(16);
                        this.f21552b.mo22979l(5);
                        this.f21561k = this.f21552b.mo22972e();
                        this.f21552b.mo22979l(2);
                        this.f21556f = this.f21552b.mo22972e();
                        this.f21557g = this.f21552b.mo22972e();
                        this.f21552b.mo22979l(6);
                        int f4 = this.f21552b.mo22973f(8);
                        this.f21559i = f4;
                        if (f3 == 0) {
                            this.f21560j = -1;
                        } else {
                            int i17 = ((f3 + 6) - 9) - f4;
                            this.f21560j = i17;
                            if (i17 < 0) {
                                this.f21560j = -1;
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    this.f21553c = i2;
                    this.f21554d = 0;
                }
                i4 = 0;
                i5 = 3;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo23149c() {
        this.f21553c = 0;
        this.f21554d = 0;
        this.f21558h = false;
        this.f21551a.mo23140c();
    }

    /* renamed from: d */
    public final boolean mo23167d(int i, C6803r rVar, byte[] bArr) {
        int min = Math.min(rVar.f21040c - rVar.f21039b, i - this.f21554d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.mo22981A(min);
        } else {
            rVar.mo22983b(this.f21554d, min, bArr);
        }
        int i2 = this.f21554d + min;
        this.f21554d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
