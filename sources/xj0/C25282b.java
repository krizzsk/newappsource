package xj0;

import java.io.IOException;
import je0.C23715f;
import p720pe.C18918b;
import wj0.C25241a;
import xj0.C25278a;
import yj0.C25329a;

/* renamed from: xj0.b */
public final class C25282b extends C25278a {

    /* renamed from: m */
    public final C25241a f63571m;

    /* renamed from: n */
    public final C25329a f63572n;

    /* renamed from: o */
    public final C25284b f63573o;

    /* renamed from: p */
    public final C25283a f63574p = new C25283a();

    /* renamed from: q */
    public final C25283a f63575q = new C25283a();

    /* renamed from: xj0.b$a */
    public class C25283a extends C25278a.C25279a {
        public C25283a() {
        }

        /* renamed from: b */
        public final int mo61883b(int i) throws IOException {
            if (C25282b.this.f63572n.mo61911j(this.f63564a, 0) == 0) {
                return C25282b.this.f63572n.mo61912k(this.f63565b[i]) + 2;
            }
            if (C25282b.this.f63572n.mo61911j(this.f63564a, 1) == 0) {
                return C25282b.this.f63572n.mo61912k(this.f63566c[i]) + 2 + 8;
            }
            return C25282b.this.f63572n.mo61912k(this.f63567d) + 2 + 8 + 8;
        }
    }

    /* renamed from: xj0.b$b */
    public class C25284b extends C25278a.C25280b {

        /* renamed from: c */
        public final C25285a[] f63577c;

        /* renamed from: xj0.b$b$a */
        public class C25285a extends C25278a.C25280b.C25281a {
            public C25285a() {
            }
        }

        public C25284b(int i, int i2) {
            super(i, i2);
            this.f63577c = new C25285a[(1 << (i + i2))];
            int i3 = 0;
            while (true) {
                C25285a[] aVarArr = this.f63577c;
                if (i3 < aVarArr.length) {
                    aVarArr[i3] = new C25285a();
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public C25282b(C25241a aVar, C25329a aVar2, int i, int i2, int i3) {
        super(i3);
        this.f63571m = aVar;
        this.f63572n = aVar2;
        this.f63573o = new C25284b(i, i2);
        mo61880a();
    }

    /* renamed from: a */
    public final void mo61880a() {
        super.mo61880a();
        C25284b bVar = this.f63573o;
        int i = 0;
        while (true) {
            C25284b.C25285a[] aVarArr = bVar.f63577c;
            if (i < aVarArr.length) {
                C23715f.m58229b(aVarArr[i].f63570a);
                i++;
            } else {
                this.f63574p.mo61881a();
                this.f63575q.mo61881a();
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo61882b() throws IOException {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        C25241a aVar = this.f63571m;
        int i4 = aVar.f63512f;
        if (i4 > 0) {
            aVar.mo61868a(aVar.f63513g, i4);
        }
        while (true) {
            C25241a aVar2 = this.f63571m;
            int i5 = aVar2.f63509c;
            int i6 = 1;
            if (i5 < aVar2.f63511e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i7 = this.f63552a & i5;
                if (this.f63572n.mo61911j(this.f63555d[this.f63554c.f48158b], i7) == 0) {
                    C25284b bVar = this.f63573o;
                    C25241a aVar3 = C25282b.this.f63571m;
                    int i8 = aVar3.f63509c;
                    int i9 = (i8 + 0) - 1;
                    if (i8 <= 0) {
                        i9 += aVar3.f63507a.length;
                    }
                    int i11 = bVar.f63568a;
                    C25284b.C25285a aVar4 = bVar.f63577c[((aVar3.f63507a[i9] & 255) >> (8 - i11)) + ((i8 & bVar.f63569b) << i11)];
                    C25282b bVar2 = C25282b.this;
                    if (bVar2.f63554c.f48158b < 7) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        do {
                            i6 = C25282b.this.f63572n.mo61911j(aVar4.f63570a, i6) | (i6 << 1);
                        } while (i6 < 256);
                    } else {
                        C25241a aVar5 = bVar2.f63571m;
                        int i12 = bVar2.f63553b[0];
                        int i13 = aVar5.f63509c;
                        int i14 = (i13 - i12) - 1;
                        if (i12 >= i13) {
                            i14 += aVar5.f63507a.length;
                        }
                        int i15 = aVar5.f63507a[i14] & 255;
                        int i16 = 256;
                        int i17 = 1;
                        do {
                            i15 <<= 1;
                            int i18 = i15 & i16;
                            int j = C25282b.this.f63572n.mo61911j(aVar4.f63570a, i16 + i18 + i17);
                            i17 = (i17 << 1) | j;
                            i16 &= (~i18) ^ (0 - j);
                        } while (i17 < 256);
                        i6 = i17;
                    }
                    C25282b bVar3 = C25282b.this;
                    C25241a aVar6 = bVar3.f63571m;
                    byte b = (byte) i6;
                    byte[] bArr = aVar6.f63507a;
                    int i19 = aVar6.f63509c;
                    int i21 = i19 + 1;
                    aVar6.f63509c = i21;
                    bArr[i19] = b;
                    if (aVar6.f63510d < i21) {
                        aVar6.f63510d = i21;
                    }
                    bVar3.f63554c.mo51433a();
                } else {
                    int i22 = 3;
                    if (this.f63572n.mo61911j(this.f63556e, this.f63554c.f48158b) == 0) {
                        this.f63554c.mo51435d();
                        int[] iArr = this.f63553b;
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        i = this.f63574p.mo61883b(i7);
                        C25329a aVar7 = this.f63572n;
                        short[][] sArr = this.f63561j;
                        if (i < 6) {
                            i22 = i - 2;
                        }
                        int k = aVar7.mo61912k(sArr[i22]);
                        if (k < 4) {
                            this.f63553b[0] = k;
                        } else {
                            int i23 = (k >> 1) - 1;
                            int[] iArr2 = this.f63553b;
                            int i24 = (2 | (k & 1)) << i23;
                            iArr2[0] = i24;
                            if (k < 14) {
                                C25329a aVar8 = this.f63572n;
                                short[] sArr2 = this.f63562k[k - 4];
                                int i25 = 1;
                                int i26 = 0;
                                int i27 = 0;
                                while (true) {
                                    int j2 = aVar8.mo61911j(sArr2, i25);
                                    i25 = (i25 << 1) | j2;
                                    int i28 = i26 + 1;
                                    i27 |= j2 << i26;
                                    if (i25 >= sArr2.length) {
                                        break;
                                    }
                                    i26 = i28;
                                }
                                iArr2[0] = i27 | i24;
                            } else {
                                C25329a aVar9 = this.f63572n;
                                int i29 = i23 - 4;
                                int i31 = 0;
                                do {
                                    aVar9.mo61913l();
                                    int i32 = aVar9.f63631b >>> 1;
                                    aVar9.f63631b = i32;
                                    int i33 = aVar9.f63632c;
                                    int i34 = (i33 - i32) >>> 31;
                                    aVar9.f63632c = i33 - (i32 & (i34 - 1));
                                    i31 = (i31 << 1) | (1 - i34);
                                    i29--;
                                } while (i29 != 0);
                                iArr2[0] = (i31 << 4) | i24;
                                int[] iArr3 = this.f63553b;
                                int i35 = iArr3[0];
                                C25329a aVar10 = this.f63572n;
                                short[] sArr3 = this.f63563l;
                                int i36 = 1;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    int j3 = aVar10.mo61911j(sArr3, i36);
                                    i36 = (i36 << 1) | j3;
                                    int i39 = i37 + 1;
                                    i38 |= j3 << i37;
                                    if (i36 >= sArr3.length) {
                                        break;
                                    }
                                    i37 = i39;
                                }
                                iArr3[0] = i35 | i38;
                            }
                        }
                    } else {
                        if (this.f63572n.mo61911j(this.f63557f, this.f63554c.f48158b) != 0) {
                            if (this.f63572n.mo61911j(this.f63558g, this.f63554c.f48158b) == 0) {
                                i2 = this.f63553b[1];
                            } else {
                                if (this.f63572n.mo61911j(this.f63559h, this.f63554c.f48158b) == 0) {
                                    i2 = this.f63553b[2];
                                } else {
                                    int[] iArr4 = this.f63553b;
                                    int i41 = iArr4[3];
                                    iArr4[3] = iArr4[2];
                                    i2 = i41;
                                }
                                int[] iArr5 = this.f63553b;
                                iArr5[2] = iArr5[1];
                            }
                            int[] iArr6 = this.f63553b;
                            iArr6[1] = iArr6[0];
                            iArr6[0] = i2;
                        } else if (this.f63572n.mo61911j(this.f63560i[this.f63554c.f48158b], i7) == 0) {
                            C18918b bVar4 = this.f63554c;
                            if (bVar4.f48158b < 7) {
                                i3 = 9;
                            } else {
                                i3 = 11;
                            }
                            bVar4.f48158b = i3;
                            i = i6;
                        }
                        this.f63554c.mo51434b();
                        i6 = this.f63575q.mo61883b(i7);
                        i = i6;
                    }
                    this.f63571m.mo61868a(this.f63553b[0], i);
                }
            } else {
                this.f63572n.mo61913l();
                return;
            }
        }
    }
}
