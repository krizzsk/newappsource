package p199oa;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p042cb.C1843a;
import p115i0.C5227c;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5740l;
import p173ma.C5742m;
import p173ma.C5743n;
import p173ma.C5744o;
import p173ma.C5749s;
import p173ma.C5750t;
import p173ma.C5754v;
import p173ma.C5757x;
import p277ub.C6774a0;
import p277ub.C6802q;
import p277ub.C6803r;
import p624ld.C18187b;

/* renamed from: oa.b */
public final class C6016b implements C5735h {

    /* renamed from: a */
    public final byte[] f19218a = new byte[42];

    /* renamed from: b */
    public final C6803r f19219b = new C6803r(new byte[32768], 0);

    /* renamed from: c */
    public final boolean f19220c = false;

    /* renamed from: d */
    public final C5740l.C5741a f19221d = new C5740l.C5741a();

    /* renamed from: e */
    public C5737j f19222e;

    /* renamed from: f */
    public C5754v f19223f;

    /* renamed from: g */
    public int f19224g = 0;

    /* renamed from: h */
    public Metadata f19225h;

    /* renamed from: i */
    public C5744o f19226i;

    /* renamed from: j */
    public int f19227j;

    /* renamed from: k */
    public int f19228k;

    /* renamed from: l */
    public C6014a f19229l;

    /* renamed from: m */
    public int f19230m;

    /* renamed from: n */
    public long f19231n;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f19224g = 0;
        } else {
            C6014a aVar = this.f19229l;
            if (aVar != null) {
                aVar.mo21568c(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f19231n = j3;
        this.f19230m = 0;
        this.f19219b.mo23004w(0);
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        C5732e eVar = (C5732e) iVar;
        Metadata metadata = null;
        C5227c cVar = C1843a.f6364c;
        C6803r rVar = new C6803r(10);
        int i = 0;
        while (true) {
            try {
                eVar.mo21583j(0, 10, rVar.f21038a, false);
                rVar.mo23007z(0);
                if (rVar.mo22999r() != 4801587) {
                    break;
                }
                rVar.mo22981A(3);
                int o = rVar.mo22996o();
                int i2 = o + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(rVar.f21038a, 0, bArr, 0, 10);
                    eVar.mo21583j(10, o, bArr, false);
                    metadata = new C1843a(cVar).mo6662p(i2, bArr);
                } else {
                    eVar.mo21584k(o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        eVar.f18593f = 0;
        eVar.mo21584k(i, false);
        if (metadata != null) {
            int length = metadata.f13864b.length;
        }
        byte[] bArr2 = new byte[4];
        eVar.mo21583j(0, 4, bArr2, false);
        if ((((((long) bArr2[0]) & 255) << 24) | ((((long) bArr2[1]) & 255) << 16) | ((((long) bArr2[2]) & 255) << 8) | (((long) bArr2[3]) & 255)) == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f19222e = jVar;
        this.f19223f = jVar.mo20709p(0, 1);
        jVar.mo20708n();
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        C5227c cVar;
        boolean z;
        C5744o oVar;
        Metadata metadata;
        Metadata metadata2;
        C5750t tVar;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.f19224g;
        boolean z5 = true;
        boolean z6 = false;
        if (i == 0) {
            boolean z7 = !this.f19220c;
            C5732e eVar = (C5732e) iVar;
            eVar.f18593f = 0;
            long f = eVar.mo21577f();
            Metadata metadata3 = null;
            if (z7) {
                cVar = null;
            } else {
                cVar = C1843a.f6364c;
            }
            C6803r rVar = new C6803r(10);
            Metadata metadata4 = null;
            int i2 = 0;
            while (true) {
                try {
                    z = false;
                    try {
                        eVar.mo21583j(0, 10, rVar.f21038a, false);
                        rVar.mo23007z(0);
                        if (rVar.mo22999r() != 4801587) {
                            break;
                        }
                        rVar.mo22981A(3);
                        int o = rVar.mo22996o();
                        int i3 = o + 10;
                        if (metadata4 == null) {
                            byte[] bArr = new byte[i3];
                            System.arraycopy(rVar.f21038a, 0, bArr, 0, 10);
                            eVar.mo21583j(10, o, bArr, false);
                            metadata4 = new C1843a(cVar).mo6662p(i3, bArr);
                        } else {
                            eVar.mo21584k(o, false);
                        }
                        i2 += i3;
                    } catch (EOFException unused) {
                    }
                } catch (EOFException unused2) {
                    z = false;
                }
            }
            z = false;
            eVar.f18593f = z ? 1 : 0;
            eVar.mo21584k(i2, z);
            if (!(metadata4 == null || metadata4.f13864b.length == 0)) {
                metadata3 = metadata4;
            }
            eVar.mo21582i((int) (eVar.mo21577f() - f));
            this.f19225h = metadata3;
            this.f19224g = 1;
            return 0;
        } else if (i != 1) {
            int i4 = 24;
            int i5 = 4;
            if (i != 2) {
                int i6 = 6;
                int i7 = 7;
                if (i != 3) {
                    long j2 = 0;
                    if (i == 4) {
                        C5732e eVar2 = (C5732e) iVar;
                        eVar2.f18593f = 0;
                        byte[] bArr2 = new byte[2];
                        eVar2.mo21583j(0, 2, bArr2, false);
                        byte b = (bArr2[1] & 255) | ((bArr2[0] & 255) << 8);
                        if ((b >> 2) == 16382) {
                            eVar2.f18593f = 0;
                            this.f19228k = b;
                            C5737j jVar = this.f19222e;
                            int i8 = C6774a0.f20959a;
                            long j3 = eVar2.f18591d;
                            long j4 = eVar2.f18590c;
                            this.f19226i.getClass();
                            C5744o oVar2 = this.f19226i;
                            if (oVar2.f18612k != null) {
                                tVar = new C5743n(oVar2, j3);
                            } else if (j4 == -1 || oVar2.f18611j <= 0) {
                                tVar = new C5750t.C5752b(oVar2.mo21597c());
                            } else {
                                C6014a aVar = new C6014a(oVar2, this.f19228k, j3, j4);
                                this.f19229l = aVar;
                                tVar = aVar.f18553a;
                            }
                            jVar.mo20707k(tVar);
                            this.f19224g = 5;
                            return 0;
                        }
                        eVar2.f18593f = 0;
                        throw new ParserException("First frame does not start with sync code.");
                    } else if (i == 5) {
                        this.f19223f.getClass();
                        this.f19226i.getClass();
                        C6014a aVar2 = this.f19229l;
                        if (aVar2 != null) {
                            if (aVar2.f18555c != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return aVar2.mo21567a((C5732e) iVar, sVar);
                            }
                        }
                        if (this.f19231n == -1) {
                            C5744o oVar3 = this.f19226i;
                            C5732e eVar3 = (C5732e) iVar;
                            eVar3.f18593f = 0;
                            eVar3.mo21584k(1, false);
                            byte[] bArr3 = new byte[1];
                            eVar3.mo21583j(0, 1, bArr3, false);
                            if ((bArr3[0] & 1) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            eVar3.mo21584k(2, false);
                            if (z3) {
                                i6 = 7;
                            }
                            C6803r rVar2 = new C6803r(i6);
                            byte[] bArr4 = rVar2.f21038a;
                            int i9 = 0;
                            while (i9 < i6) {
                                int m = eVar3.mo21586m(0 + i9, i6 - i9, bArr4);
                                if (m == -1) {
                                    break;
                                }
                                i9 += m;
                            }
                            rVar2.mo23006y(i9);
                            eVar3.f18593f = 0;
                            try {
                                long v = rVar2.mo23003v();
                                if (!z3) {
                                    v *= (long) oVar3.f18603b;
                                }
                                j2 = v;
                            } catch (NumberFormatException unused3) {
                                z5 = false;
                            }
                            if (z5) {
                                this.f19231n = j2;
                                return 0;
                            }
                            throw new ParserException();
                        }
                        C6803r rVar3 = this.f19219b;
                        int i11 = rVar3.f21040c;
                        if (i11 < 32768) {
                            int read = ((C5732e) iVar).read(rVar3.f21038a, i11, 32768 - i11);
                            if (read != -1) {
                                z5 = false;
                            }
                            if (!z5) {
                                this.f19219b.mo23006y(i11 + read);
                            } else {
                                C6803r rVar4 = this.f19219b;
                                if (rVar4.f21040c - rVar4.f21039b == 0) {
                                    C5744o oVar4 = this.f19226i;
                                    int i12 = C6774a0.f20959a;
                                    this.f19223f.mo20633d((this.f19231n * 1000000) / ((long) oVar4.f18606e), 1, this.f19230m, 0, (C5754v.C5755a) null);
                                    return -1;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        C6803r rVar5 = this.f19219b;
                        int i13 = rVar5.f21039b;
                        int i14 = this.f19230m;
                        int i15 = this.f19227j;
                        if (i14 < i15) {
                            rVar5.mo22981A(Math.min(i15 - i14, rVar5.f21040c - i13));
                        }
                        C6803r rVar6 = this.f19219b;
                        this.f19226i.getClass();
                        int i16 = rVar6.f21039b;
                        while (true) {
                            if (i16 <= rVar6.f21040c - 16) {
                                rVar6.mo23007z(i16);
                                if (C5740l.m14135a(rVar6, this.f19226i, this.f19228k, this.f19221d)) {
                                    rVar6.mo23007z(i16);
                                    j = this.f19221d.f18599a;
                                    break;
                                }
                                i16++;
                            } else {
                                if (z5) {
                                    while (true) {
                                        int i17 = rVar6.f21040c;
                                        if (i16 > i17 - this.f19227j) {
                                            rVar6.mo23007z(i17);
                                            break;
                                        }
                                        rVar6.mo23007z(i16);
                                        try {
                                            z2 = C5740l.m14135a(rVar6, this.f19226i, this.f19228k, this.f19221d);
                                        } catch (IndexOutOfBoundsException unused4) {
                                            z2 = false;
                                        }
                                        if (rVar6.f21039b > rVar6.f21040c) {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            rVar6.mo23007z(i16);
                                            j = this.f19221d.f18599a;
                                            break;
                                        }
                                        i16++;
                                    }
                                } else {
                                    rVar6.mo23007z(i16);
                                }
                                j = -1;
                            }
                        }
                        C6803r rVar7 = this.f19219b;
                        int i18 = rVar7.f21039b - i13;
                        rVar7.mo23007z(i13);
                        this.f19223f.mo20631b(i18, this.f19219b);
                        int i19 = this.f19230m + i18;
                        this.f19230m = i19;
                        if (j != -1) {
                            C5744o oVar5 = this.f19226i;
                            int i21 = C6774a0.f20959a;
                            this.f19223f.mo20633d((this.f19231n * 1000000) / ((long) oVar5.f18606e), 1, i19, 0, (C5754v.C5755a) null);
                            this.f19230m = 0;
                            this.f19231n = j;
                        }
                        C6803r rVar8 = this.f19219b;
                        int i22 = rVar8.f21040c;
                        int i23 = rVar8.f21039b;
                        int i24 = i22 - i23;
                        if (i24 >= 16) {
                            return 0;
                        }
                        byte[] bArr5 = rVar8.f21038a;
                        System.arraycopy(bArr5, i23, bArr5, 0, i24);
                        this.f19219b.mo23007z(0);
                        this.f19219b.mo23006y(i24);
                        return 0;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    C5744o oVar6 = this.f19226i;
                    boolean z8 = false;
                    while (!z8) {
                        C5732e eVar4 = (C5732e) iVar;
                        eVar4.f18593f = z6 ? 1 : 0;
                        C6802q qVar = new C6802q(new byte[i5], i5);
                        eVar4.mo21583j(z6, i5, qVar.f21034a, z6);
                        boolean e = qVar.mo22972e();
                        int f2 = qVar.mo22973f(i7);
                        int f3 = qVar.mo22973f(i4) + i5;
                        if (f2 == 0) {
                            byte[] bArr6 = new byte[38];
                            eVar4.mo21581h(z6, 38, bArr6, z6);
                            oVar6 = new C5744o(bArr6, i5);
                        } else if (oVar6 != null) {
                            if (f2 == 3) {
                                C6803r rVar9 = new C6803r(f3);
                                eVar4.mo21581h(z6, f3, rVar9.f21038a, z6);
                                C5744o.C5745a a = C5742m.m14137a(rVar9);
                                int i25 = oVar6.f18602a;
                                int i26 = oVar6.f18603b;
                                int i27 = oVar6.f18604c;
                                int i28 = oVar6.f18605d;
                                oVar = new C5744o(i25, i26, i27, i28, oVar6.f18606e, oVar6.f18608g, oVar6.f18609h, oVar6.f18611j, a, oVar6.f18613l);
                            } else if (f2 == 4) {
                                C6803r rVar10 = new C6803r(f3);
                                eVar4.mo21581h(z6, f3, rVar10.f21038a, z6);
                                rVar10.mo22981A(4);
                                Metadata a2 = C5744o.m14141a(Arrays.asList(C5757x.m14168a(rVar10, z6, z6).f18640a), Collections.emptyList());
                                Metadata metadata5 = oVar6.f18613l;
                                if (metadata5 != null) {
                                    if (a2 == null) {
                                        metadata2 = metadata5;
                                        oVar = new C5744o(oVar6.f18602a, oVar6.f18603b, oVar6.f18604c, oVar6.f18605d, oVar6.f18606e, oVar6.f18608g, oVar6.f18609h, oVar6.f18611j, oVar6.f18612k, metadata2);
                                    } else {
                                        a2 = metadata5.mo16084b(a2.f13864b);
                                    }
                                }
                                metadata2 = a2;
                                oVar = new C5744o(oVar6.f18602a, oVar6.f18603b, oVar6.f18604c, oVar6.f18605d, oVar6.f18606e, oVar6.f18608g, oVar6.f18609h, oVar6.f18611j, oVar6.f18612k, metadata2);
                            } else if (f2 == i6) {
                                C6803r rVar11 = new C6803r(f3);
                                eVar4.mo21581h(0, f3, rVar11.f21038a, false);
                                rVar11.mo22981A(4);
                                int c = rVar11.mo22984c();
                                String n = rVar11.mo22995n(rVar11.mo22984c(), C18187b.f46427a);
                                String m2 = rVar11.mo22994m(rVar11.mo22984c());
                                int c2 = rVar11.mo22984c();
                                int c3 = rVar11.mo22984c();
                                int c4 = rVar11.mo22984c();
                                int c5 = rVar11.mo22984c();
                                int c6 = rVar11.mo22984c();
                                byte[] bArr7 = new byte[c6];
                                rVar11.mo22983b(0, c6, bArr7);
                                Metadata a3 = C5744o.m14141a(Collections.emptyList(), Collections.singletonList(new PictureFrame(c, n, m2, c2, c3, c4, c5, bArr7)));
                                Metadata metadata6 = oVar6.f18613l;
                                if (metadata6 != null) {
                                    if (a3 == null) {
                                        metadata = metadata6;
                                        oVar = new C5744o(oVar6.f18602a, oVar6.f18603b, oVar6.f18604c, oVar6.f18605d, oVar6.f18606e, oVar6.f18608g, oVar6.f18609h, oVar6.f18611j, oVar6.f18612k, metadata);
                                    } else {
                                        a3 = metadata6.mo16084b(a3.f13864b);
                                    }
                                }
                                metadata = a3;
                                oVar = new C5744o(oVar6.f18602a, oVar6.f18603b, oVar6.f18604c, oVar6.f18605d, oVar6.f18606e, oVar6.f18608g, oVar6.f18609h, oVar6.f18611j, oVar6.f18612k, metadata);
                            } else {
                                eVar4.mo21582i(f3);
                            }
                            oVar6 = oVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i29 = C6774a0.f20959a;
                        this.f19226i = oVar6;
                        z8 = e;
                        z6 = false;
                        i4 = 24;
                        i5 = 4;
                        i6 = 6;
                        i7 = 7;
                    }
                    this.f19226i.getClass();
                    this.f19227j = Math.max(this.f19226i.f18604c, 6);
                    C5754v vVar = this.f19223f;
                    int i31 = C6774a0.f20959a;
                    vVar.mo20632c(this.f19226i.mo21598d(this.f19218a, this.f19225h));
                    this.f19224g = 4;
                    return 0;
                }
            } else {
                byte[] bArr8 = new byte[4];
                ((C5732e) iVar).mo21581h(0, 4, bArr8, false);
                if ((((((long) bArr8[1]) & 255) << 16) | ((((long) bArr8[0]) & 255) << 24) | ((((long) bArr8[2]) & 255) << 8) | (((long) bArr8[3]) & 255)) == 1716281667) {
                    this.f19224g = 3;
                    return 0;
                }
                throw new ParserException("Failed to read FLAC stream marker.");
            }
        } else {
            byte[] bArr9 = this.f19218a;
            C5732e eVar5 = (C5732e) iVar;
            eVar5.mo21583j(0, bArr9.length, bArr9, false);
            eVar5.f18593f = 0;
            this.f19224g = 2;
            return 0;
        }
    }

    public final void release() {
    }
}
