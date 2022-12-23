package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3119i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3386f;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d */
public final class C3130d implements C3080f {

    /* renamed from: Z */
    public static final byte[] f10833Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f10834a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final UUID f10835b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    public long f10836A = -9223372036854775807L;

    /* renamed from: B */
    public C3386f f10837B;

    /* renamed from: C */
    public C3386f f10838C;

    /* renamed from: D */
    public boolean f10839D;

    /* renamed from: E */
    public int f10840E;

    /* renamed from: F */
    public long f10841F;

    /* renamed from: G */
    public long f10842G;

    /* renamed from: H */
    public int f10843H;

    /* renamed from: I */
    public int f10844I;

    /* renamed from: J */
    public int[] f10845J;

    /* renamed from: K */
    public int f10846K;

    /* renamed from: L */
    public int f10847L;

    /* renamed from: M */
    public int f10848M;

    /* renamed from: N */
    public int f10849N;

    /* renamed from: O */
    public boolean f10850O;

    /* renamed from: P */
    public boolean f10851P;

    /* renamed from: Q */
    public boolean f10852Q;

    /* renamed from: R */
    public boolean f10853R;

    /* renamed from: S */
    public byte f10854S;

    /* renamed from: T */
    public int f10855T;

    /* renamed from: U */
    public int f10856U;

    /* renamed from: V */
    public int f10857V;

    /* renamed from: W */
    public boolean f10858W;

    /* renamed from: X */
    public boolean f10859X;

    /* renamed from: Y */
    public C3088h f10860Y;

    /* renamed from: a */
    public final C3128b f10861a;

    /* renamed from: b */
    public final C3135f f10862b;

    /* renamed from: c */
    public final SparseArray<C3133c> f10863c;

    /* renamed from: d */
    public final boolean f10864d;

    /* renamed from: e */
    public final C3393k f10865e;

    /* renamed from: f */
    public final C3393k f10866f;

    /* renamed from: g */
    public final C3393k f10867g;

    /* renamed from: h */
    public final C3393k f10868h;

    /* renamed from: i */
    public final C3393k f10869i;

    /* renamed from: j */
    public final C3393k f10870j;

    /* renamed from: k */
    public final C3393k f10871k;

    /* renamed from: l */
    public final C3393k f10872l;

    /* renamed from: m */
    public final C3393k f10873m;

    /* renamed from: n */
    public ByteBuffer f10874n;

    /* renamed from: o */
    public long f10875o;

    /* renamed from: p */
    public long f10876p = -1;

    /* renamed from: q */
    public long f10877q = -9223372036854775807L;

    /* renamed from: r */
    public long f10878r = -9223372036854775807L;

    /* renamed from: s */
    public long f10879s = -9223372036854775807L;

    /* renamed from: t */
    public C3133c f10880t;

    /* renamed from: u */
    public boolean f10881u;

    /* renamed from: v */
    public int f10882v;

    /* renamed from: w */
    public long f10883w;

    /* renamed from: x */
    public boolean f10884x;

    /* renamed from: y */
    public long f10885y = -1;

    /* renamed from: z */
    public long f10886z = -1;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$a */
    public class C3131a implements C3119i {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$b */
    public final class C3132b implements C3129c {
        public C3132b() {
        }

        /* renamed from: a */
        public boolean mo14203a(int i) {
            C3130d.this.getClass();
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        public /* synthetic */ C3132b(C3130d dVar, C3131a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo14201a(int i, long j, long j2) throws C3230l {
            C3130d dVar = C3130d.this;
            dVar.getClass();
            if (i == 160) {
                dVar.f10859X = false;
            } else if (i == 174) {
                dVar.f10880t = new C3133c();
            } else if (i == 187) {
                dVar.f10839D = false;
            } else if (i == 19899) {
                dVar.f10882v = -1;
                dVar.f10883w = -1;
            } else if (i == 20533) {
                dVar.f10880t.f10908e = true;
            } else if (i == 21968) {
                dVar.f10880t.f10920q = true;
            } else if (i == 408125543) {
                long j3 = dVar.f10876p;
                if (j3 == -1 || j3 == j) {
                    dVar.f10876p = j;
                    dVar.f10875o = j2;
                    return;
                }
                throw new C3230l("Multiple Segment elements not supported");
            } else if (i == 475249515) {
                dVar.f10837B = new C3386f(32);
                dVar.f10838C = new C3386f(32);
            } else if (i != 524531317 || dVar.f10881u) {
            } else {
                if (!dVar.f10864d || dVar.f10885y == -1) {
                    dVar.f10860Y.mo14123a(new C3124m.C3125a(dVar.f10879s));
                    dVar.f10881u = true;
                    return;
                }
                dVar.f10884x = true;
            }
        }

        /* renamed from: a */
        public void mo14200a(int i, long j) throws C3230l {
            C3130d dVar = C3130d.this;
            dVar.getClass();
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            dVar.f10880t.f10906c = (int) j;
                            return;
                        case 136:
                            C3133c cVar = dVar.f10880t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar.f10899L = z;
                            return;
                        case 155:
                            dVar.f10842G = dVar.mo14193a(j);
                            return;
                        case 159:
                            dVar.f10880t.f10894G = (int) j;
                            return;
                        case 176:
                            dVar.f10880t.f10913j = (int) j;
                            return;
                        case 179:
                            dVar.f10837B.mo14531a(dVar.mo14193a(j));
                            return;
                        case 186:
                            dVar.f10880t.f10914k = (int) j;
                            return;
                        case 215:
                            dVar.f10880t.f10905b = (int) j;
                            return;
                        case 231:
                            dVar.f10836A = dVar.mo14193a(j);
                            return;
                        case 241:
                            if (!dVar.f10839D) {
                                dVar.f10838C.mo14531a(j);
                                dVar.f10839D = true;
                                return;
                            }
                            return;
                        case 251:
                            dVar.f10859X = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                throw new C3230l(C16530d.m42012e("ContentCompAlgo ", j, " not supported"));
                            }
                            return;
                        case 17029:
                            if (j < 1 || j > 2) {
                                throw new C3230l(C16530d.m42012e("DocTypeReadVersion ", j, " not supported"));
                            }
                            return;
                        case 17143:
                            if (j != 1) {
                                throw new C3230l(C16530d.m42012e("EBMLReadVersion ", j, " not supported"));
                            }
                            return;
                        case 18401:
                            if (j != 5) {
                                throw new C3230l(C16530d.m42012e("ContentEncAlgo ", j, " not supported"));
                            }
                            return;
                        case 18408:
                            if (j != 1) {
                                throw new C3230l(C16530d.m42012e("AESSettingsCipherMode ", j, " not supported"));
                            }
                            return;
                        case 21420:
                            dVar.f10883w = j + dVar.f10876p;
                            return;
                        case 21432:
                            int i2 = (int) j;
                            if (i2 == 0) {
                                dVar.f10880t.f10919p = 0;
                                return;
                            } else if (i2 == 1) {
                                dVar.f10880t.f10919p = 2;
                                return;
                            } else if (i2 == 3) {
                                dVar.f10880t.f10919p = 1;
                                return;
                            } else if (i2 == 15) {
                                dVar.f10880t.f10919p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            dVar.f10880t.f10915l = (int) j;
                            return;
                        case 21682:
                            dVar.f10880t.f10917n = (int) j;
                            return;
                        case 21690:
                            dVar.f10880t.f10916m = (int) j;
                            return;
                        case 21930:
                            C3133c cVar2 = dVar.f10880t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar2.f10900M = z;
                            return;
                        case 22186:
                            dVar.f10880t.f10897J = j;
                            return;
                        case 22203:
                            dVar.f10880t.f10898K = j;
                            return;
                        case 25188:
                            dVar.f10880t.f10895H = (int) j;
                            return;
                        case 2352003:
                            dVar.f10880t.f10907d = (int) j;
                            return;
                        case 2807729:
                            dVar.f10877q = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i3 = (int) j;
                                    if (i3 == 1) {
                                        dVar.f10880t.f10923t = 2;
                                        return;
                                    } else if (i3 == 2) {
                                        dVar.f10880t.f10923t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i4 = (int) j;
                                    if (i4 != 1) {
                                        if (i4 == 16) {
                                            dVar.f10880t.f10922s = 6;
                                            return;
                                        } else if (i4 == 18) {
                                            dVar.f10880t.f10922s = 7;
                                            return;
                                        } else if (!(i4 == 6 || i4 == 7)) {
                                            return;
                                        }
                                    }
                                    dVar.f10880t.f10922s = 3;
                                    return;
                                case 21947:
                                    C3133c cVar3 = dVar.f10880t;
                                    cVar3.f10920q = true;
                                    int i5 = (int) j;
                                    if (i5 == 1) {
                                        cVar3.f10921r = 1;
                                        return;
                                    } else if (i5 == 9) {
                                        cVar3.f10921r = 6;
                                        return;
                                    } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                        cVar3.f10921r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    dVar.f10880t.f10924u = (int) j;
                                    return;
                                case 21949:
                                    dVar.f10880t.f10925v = (int) j;
                                    return;
                                default:
                                    return;
                            }
                    }
                } else if (j != 1) {
                    throw new C3230l(C16530d.m42012e("ContentEncodingScope ", j, " not supported"));
                }
            } else if (j != 0) {
                throw new C3230l(C16530d.m42012e("ContentEncodingOrder ", j, " not supported"));
            }
        }

        /* renamed from: a */
        public void mo14198a(int i, double d) throws C3230l {
            C3130d dVar = C3130d.this;
            dVar.getClass();
            if (i == 181) {
                dVar.f10880t.f10896I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        dVar.f10880t.f10926w = (float) d;
                        return;
                    case 21970:
                        dVar.f10880t.f10927x = (float) d;
                        return;
                    case 21971:
                        dVar.f10880t.f10928y = (float) d;
                        return;
                    case 21972:
                        dVar.f10880t.f10929z = (float) d;
                        return;
                    case 21973:
                        dVar.f10880t.f10888A = (float) d;
                        return;
                    case 21974:
                        dVar.f10880t.f10889B = (float) d;
                        return;
                    case 21975:
                        dVar.f10880t.f10890C = (float) d;
                        return;
                    case 21976:
                        dVar.f10880t.f10891D = (float) d;
                        return;
                    case 21977:
                        dVar.f10880t.f10892E = (float) d;
                        return;
                    case 21978:
                        dVar.f10880t.f10893F = (float) d;
                        return;
                    default:
                        return;
                }
            } else {
                dVar.f10878r = (long) d;
            }
        }

        /* renamed from: a */
        public void mo14202a(int i, String str) throws C3230l {
            C3130d dVar = C3130d.this;
            dVar.getClass();
            if (i == 134) {
                dVar.f10880t.f10904a = str;
            } else if (i != 17026) {
                if (i == 2274716) {
                    dVar.f10880t.f10901N = str;
                }
            } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw new C3230l(C13437d.m33706k("DocType ", str, " not supported"));
            }
        }

        /* renamed from: a */
        public void mo14199a(int i, int i2, C3087g gVar) throws IOException, InterruptedException {
            int i3;
            byte b;
            int i4;
            int i5 = i;
            int i6 = i2;
            C3087g gVar2 = gVar;
            C3130d dVar = C3130d.this;
            dVar.getClass();
            int i7 = 0;
            if (i5 == 161 || i5 == 163) {
                int i8 = 8;
                int i9 = 1;
                if (dVar.f10840E == 0) {
                    dVar.f10846K = (int) dVar.f10862b.mo14205a(gVar2, false, true, 8);
                    dVar.f10847L = dVar.f10862b.f10935c;
                    dVar.f10842G = -9223372036854775807L;
                    dVar.f10840E = 1;
                    dVar.f10867g.mo14563r();
                }
                C3133c cVar = dVar.f10863c.get(dVar.f10846K);
                if (cVar == null) {
                    ((C3072b) gVar2).mo14088c(i6 - dVar.f10847L);
                    dVar.f10840E = 0;
                    return;
                }
                if (dVar.f10840E == 1) {
                    dVar.mo14195a(gVar2, 3);
                    int i11 = (dVar.f10867g.f12121a[2] & 6) >> 1;
                    byte b2 = 255;
                    if (i11 == 0) {
                        dVar.f10844I = 1;
                        int[] a = C3130d.m7859a(dVar.f10845J, 1);
                        dVar.f10845J = a;
                        a[0] = (i6 - dVar.f10847L) - 3;
                    } else if (i5 == 163) {
                        int i12 = 4;
                        dVar.mo14195a(gVar2, 4);
                        int i13 = (dVar.f10867g.f12121a[3] & 255) + 1;
                        dVar.f10844I = i13;
                        int[] a2 = C3130d.m7859a(dVar.f10845J, i13);
                        dVar.f10845J = a2;
                        if (i11 == 2) {
                            int i14 = dVar.f10844I;
                            Arrays.fill(a2, 0, i14, ((i6 - dVar.f10847L) - 4) / i14);
                        } else if (i11 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i3 = dVar.f10844I - 1;
                                if (i15 >= i3) {
                                    break;
                                }
                                dVar.f10845J[i15] = 0;
                                do {
                                    i12++;
                                    dVar.mo14195a(gVar2, i12);
                                    b = dVar.f10867g.f12121a[i12 - 1] & 255;
                                    int[] iArr = dVar.f10845J;
                                    i4 = iArr[i15] + b;
                                    iArr[i15] = i4;
                                } while (b == 255);
                                i16 += i4;
                                i15++;
                            }
                            dVar.f10845J[i3] = ((i6 - dVar.f10847L) - i12) - i16;
                        } else if (i11 == 3) {
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                int i19 = dVar.f10844I - i9;
                                if (i17 >= i19) {
                                    dVar.f10845J[i19] = ((i6 - dVar.f10847L) - i12) - i18;
                                    break;
                                }
                                dVar.f10845J[i17] = i7;
                                i12++;
                                dVar.mo14195a(gVar2, i12);
                                int i21 = i12 - 1;
                                if (dVar.f10867g.f12121a[i21] != 0) {
                                    long j = 0;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= i8) {
                                            break;
                                        }
                                        int i23 = i9 << (7 - i22);
                                        if ((dVar.f10867g.f12121a[i21] & i23) != 0) {
                                            i12 += i22;
                                            dVar.mo14195a(gVar2, i12);
                                            int i24 = i21 + 1;
                                            long j2 = (long) ((~i23) & dVar.f10867g.f12121a[i21] & b2);
                                            while (i24 < i12) {
                                                j2 = (j2 << 8) | ((long) (dVar.f10867g.f12121a[i24] & b2));
                                                i24++;
                                                b2 = 255;
                                            }
                                            j = i17 > 0 ? j2 - ((1 << ((i22 * 7) + 6)) - 1) : j2;
                                        } else {
                                            i22++;
                                            i8 = 8;
                                            i9 = 1;
                                            b2 = 255;
                                        }
                                    }
                                    if (j >= -2147483648L && j <= 2147483647L) {
                                        int i25 = (int) j;
                                        int[] iArr2 = dVar.f10845J;
                                        if (i17 != 0) {
                                            i25 += iArr2[i17 - 1];
                                        }
                                        iArr2[i17] = i25;
                                        i18 += i25;
                                        i17++;
                                        i7 = 0;
                                        i8 = 8;
                                        i9 = 1;
                                        b2 = 255;
                                    }
                                } else {
                                    throw new C3230l("No valid varint length mask found");
                                }
                            }
                            throw new C3230l("EBML lacing sample size out of range.");
                        } else {
                            throw new C3230l(C16759e.m42349e("Unexpected lacing value: ", i11));
                        }
                    } else {
                        throw new C3230l("Lacing only supported in SimpleBlocks.");
                    }
                    byte[] bArr = dVar.f10867g.f12121a;
                    dVar.f10841F = dVar.mo14193a((long) ((bArr[1] & 255) | (bArr[0] << 8))) + dVar.f10836A;
                    byte b3 = dVar.f10867g.f12121a[2];
                    dVar.f10848M = ((cVar.f10906c == 2 || (i5 == 163 && (b3 & 128) == 128)) ? 1 : 0) | ((b3 & 8) == 8 ? Integer.MIN_VALUE : 0);
                    dVar.f10840E = 2;
                    dVar.f10843H = 0;
                }
                if (i5 == 163) {
                    while (true) {
                        int i26 = dVar.f10843H;
                        if (i26 < dVar.f10844I) {
                            dVar.mo14196a(gVar2, cVar, dVar.f10845J[i26]);
                            dVar.mo14197a(cVar, dVar.f10841F + ((long) ((dVar.f10843H * cVar.f10907d) / 1000)));
                            dVar.f10843H++;
                        } else {
                            dVar.f10840E = 0;
                            return;
                        }
                    }
                } else {
                    dVar.mo14196a(gVar2, cVar, dVar.f10845J[0]);
                }
            } else if (i5 == 16981) {
                C3133c cVar2 = dVar.f10880t;
                byte[] bArr2 = new byte[i6];
                cVar2.f10909f = bArr2;
                ((C3072b) gVar2).mo14087b(bArr2, 0, i6, false);
            } else if (i5 == 18402) {
                C3133c cVar3 = dVar.f10880t;
                byte[] bArr3 = new byte[i6];
                cVar3.f10910g = bArr3;
                ((C3072b) gVar2).mo14087b(bArr3, 0, i6, false);
            } else if (i5 == 21419) {
                Arrays.fill(dVar.f10869i.f12121a, (byte) 0);
                ((C3072b) gVar2).mo14087b(dVar.f10869i.f12121a, 4 - i6, i6, false);
                dVar.f10869i.mo14549e(0);
                dVar.f10882v = (int) dVar.f10869i.mo14558m();
            } else if (i5 == 25506) {
                C3133c cVar4 = dVar.f10880t;
                byte[] bArr4 = new byte[i6];
                cVar4.f10911h = bArr4;
                ((C3072b) gVar2).mo14087b(bArr4, 0, i6, false);
            } else if (i5 == 30322) {
                C3133c cVar5 = dVar.f10880t;
                byte[] bArr5 = new byte[i6];
                cVar5.f10918o = bArr5;
                ((C3072b) gVar2).mo14087b(bArr5, 0, i6, false);
            } else {
                throw new C3230l(C16759e.m42349e("Unexpected id: ", i5));
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d$c */
    public static final class C3133c {

        /* renamed from: A */
        public float f10888A = -1.0f;

        /* renamed from: B */
        public float f10889B = -1.0f;

        /* renamed from: C */
        public float f10890C = -1.0f;

        /* renamed from: D */
        public float f10891D = -1.0f;

        /* renamed from: E */
        public float f10892E = -1.0f;

        /* renamed from: F */
        public float f10893F = -1.0f;

        /* renamed from: G */
        public int f10894G = 1;

        /* renamed from: H */
        public int f10895H = -1;

        /* renamed from: I */
        public int f10896I = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* renamed from: J */
        public long f10897J = 0;

        /* renamed from: K */
        public long f10898K = 0;

        /* renamed from: L */
        public boolean f10899L;

        /* renamed from: M */
        public boolean f10900M = true;

        /* renamed from: N */
        public String f10901N = "eng";

        /* renamed from: O */
        public C3161n f10902O;

        /* renamed from: P */
        public int f10903P;

        /* renamed from: a */
        public String f10904a;

        /* renamed from: b */
        public int f10905b;

        /* renamed from: c */
        public int f10906c;

        /* renamed from: d */
        public int f10907d;

        /* renamed from: e */
        public boolean f10908e;

        /* renamed from: f */
        public byte[] f10909f;

        /* renamed from: g */
        public byte[] f10910g;

        /* renamed from: h */
        public byte[] f10911h;

        /* renamed from: i */
        public C3059a f10912i;

        /* renamed from: j */
        public int f10913j = -1;

        /* renamed from: k */
        public int f10914k = -1;

        /* renamed from: l */
        public int f10915l = -1;

        /* renamed from: m */
        public int f10916m = -1;

        /* renamed from: n */
        public int f10917n = 0;

        /* renamed from: o */
        public byte[] f10918o = null;

        /* renamed from: p */
        public int f10919p = -1;

        /* renamed from: q */
        public boolean f10920q = false;

        /* renamed from: r */
        public int f10921r = -1;

        /* renamed from: s */
        public int f10922s = -1;

        /* renamed from: t */
        public int f10923t = -1;

        /* renamed from: u */
        public int f10924u = 1000;

        /* renamed from: v */
        public int f10925v = 200;

        /* renamed from: w */
        public float f10926w = -1.0f;

        /* renamed from: x */
        public float f10927x = -1.0f;

        /* renamed from: y */
        public float f10928y = -1.0f;

        /* renamed from: z */
        public float f10929z = -1.0f;
    }

    public C3130d(C3128b bVar, int i) {
        this.f10861a = bVar;
        ((C3126a) bVar).mo14188a((C3129c) new C3132b(this, (C3131a) null));
        this.f10864d = (i & 1) != 0 ? false : true;
        this.f10862b = new C3135f();
        this.f10863c = new SparseArray<>();
        this.f10867g = new C3393k(4);
        this.f10868h = new C3393k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10869i = new C3393k(4);
        this.f10865e = new C3393k(C3389i.f12100a);
        this.f10866f = new C3393k(4);
        this.f10870j = new C3393k();
        this.f10871k = new C3393k();
        this.f10872l = new C3393k(8);
        this.f10873m = new C3393k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r3 = r1.mo14204a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14115a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r17 = this;
            r0 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e
            r1.<init>()
            r2 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            long r3 = r2.f10547b
            r5 = 1024(0x400, double:5.06E-321)
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x001a
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r5 = r3
        L_0x001a:
            int r6 = (int) r5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r1.f10930a
            byte[] r5 = r5.f12121a
            r7 = 0
            r8 = 4
            r2.mo14085a(r5, r7, r8, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r1.f10930a
            long r10 = r5.mo14558m()
            r1.f10931b = r8
        L_0x002c:
            r12 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r5 = 1
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 == 0) goto L_0x0054
            int r8 = r1.f10931b
            int r8 = r8 + r5
            r1.f10931b = r8
            if (r8 != r6) goto L_0x003c
            goto L_0x009f
        L_0x003c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r1.f10930a
            byte[] r8 = r8.f12121a
            r2.mo14085a(r8, r7, r5, r7)
            r5 = 8
            long r10 = r10 << r5
            r12 = -256(0xffffffffffffff00, double:NaN)
            long r10 = r10 & r12
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r1.f10930a
            byte[] r5 = r5.f12121a
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r12 = (long) r5
            long r10 = r10 | r12
            goto L_0x002c
        L_0x0054:
            long r10 = r1.mo14204a(r0)
            int r6 = r1.f10931b
            long r12 = (long) r6
            r14 = -9223372036854775808
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x009f
            if (r9 == 0) goto L_0x006a
            long r8 = r12 + r10
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x006a
            goto L_0x009f
        L_0x006a:
            int r3 = r1.f10931b
            long r3 = (long) r3
            long r8 = r12 + r10
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x009c
            long r3 = r1.mo14204a(r0)
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x007c
            goto L_0x009f
        L_0x007c:
            long r3 = r1.mo14204a(r0)
            r8 = 0
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x009f
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r16 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            if (r6 == 0) goto L_0x006a
            int r6 = (int) r3
            r2.mo14084a(r6, r7)
            int r6 = r1.f10931b
            long r8 = (long) r6
            long r8 = r8 + r3
            int r3 = (int) r8
            r1.f10931b = r3
            goto L_0x006a
        L_0x009c:
            if (r6 != 0) goto L_0x009f
            r7 = 1
        L_0x009f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.mo14115a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f10860Y = hVar;
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f10836A = -9223372036854775807L;
        this.f10840E = 0;
        C3126a aVar = (C3126a) this.f10861a;
        aVar.f10828e = 0;
        aVar.f10825b.clear();
        C3135f fVar = aVar.f10826c;
        fVar.f10934b = 0;
        fVar.f10935c = 0;
        C3135f fVar2 = this.f10862b;
        fVar2.f10934b = 0;
        fVar2.f10935c = 0;
        mo14194a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r9, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f10858W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003d
            boolean r3 = r8.f10858W
            if (r3 != 0) goto L_0x003d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b r2 = r8.f10861a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3126a) r2
            boolean r2 = r2.mo14189a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r9)
            if (r2 == 0) goto L_0x0005
            r3 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r3
            long r3 = r3.f10548c
            boolean r5 = r8.f10884x
            if (r5 == 0) goto L_0x0028
            r8.f10886z = r3
            long r3 = r8.f10885y
            r10.f10822a = r3
            r8.f10884x = r0
        L_0x0026:
            r3 = 1
            goto L_0x003a
        L_0x0028:
            boolean r3 = r8.f10881u
            if (r3 == 0) goto L_0x0039
            long r3 = r8.f10886z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            r10.f10822a = r3
            r8.f10886z = r5
            goto L_0x0026
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C3130d.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo14197a(C3133c cVar, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(cVar.f10904a)) {
            byte[] bArr2 = this.f10871k.f12121a;
            long j2 = this.f10842G;
            if (j2 == -9223372036854775807L) {
                bArr = f10834a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))});
                int i4 = C3406u.f12148a;
                bArr = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            C3161n nVar = cVar.f10902O;
            C3393k kVar = this.f10871k;
            nVar.mo14099a(kVar, kVar.f12123c);
            this.f10857V += this.f10871k.f12123c;
        }
        cVar.f10902O.mo14096a(j, this.f10848M, this.f10857V, 0, cVar.f10910g);
        this.f10858W = true;
        mo14194a();
    }

    /* renamed from: a */
    public final void mo14194a() {
        this.f10849N = 0;
        this.f10857V = 0;
        this.f10856U = 0;
        this.f10850O = false;
        this.f10851P = false;
        this.f10853R = false;
        this.f10855T = 0;
        this.f10854S = 0;
        this.f10852Q = false;
        this.f10870j.mo14563r();
    }

    /* renamed from: a */
    public final void mo14195a(C3087g gVar, int i) throws IOException, InterruptedException {
        C3393k kVar = this.f10867g;
        if (kVar.f12123c < i) {
            if (kVar.mo14542b() < i) {
                C3393k kVar2 = this.f10867g;
                byte[] bArr = kVar2.f12121a;
                kVar2.mo14540a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f10867g.f12123c);
            }
            C3393k kVar3 = this.f10867g;
            byte[] bArr2 = kVar3.f12121a;
            int i2 = kVar3.f12123c;
            ((C3072b) gVar).mo14087b(bArr2, i2, i - i2, false);
            this.f10867g.mo14547d(i);
        }
    }

    /* renamed from: a */
    public final void mo14196a(C3087g gVar, C3133c cVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f10904a)) {
            byte[] bArr = f10833Z;
            int length = bArr.length + i;
            if (this.f10871k.mo14542b() < length) {
                this.f10871k.f12121a = Arrays.copyOf(bArr, length + i);
            }
            ((C3072b) gVar).mo14087b(this.f10871k.f12121a, bArr.length, i, false);
            this.f10871k.mo14549e(0);
            this.f10871k.mo14547d(length);
            return;
        }
        C3161n nVar = cVar.f10902O;
        if (!this.f10850O) {
            if (cVar.f10908e) {
                this.f10848M &= -1073741825;
                boolean z = this.f10851P;
                int i3 = RecyclerView.C1119a0.FLAG_IGNORE;
                if (!z) {
                    ((C3072b) gVar).mo14087b(this.f10867g.f12121a, 0, 1, false);
                    this.f10849N++;
                    byte b = this.f10867g.f12121a[0];
                    if ((b & 128) != 128) {
                        this.f10854S = b;
                        this.f10851P = true;
                    } else {
                        throw new C3230l("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.f10854S;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.f10848M |= 1073741824;
                    if (!this.f10852Q) {
                        ((C3072b) gVar).mo14087b(this.f10872l.f12121a, 0, 8, false);
                        this.f10849N += 8;
                        this.f10852Q = true;
                        C3393k kVar = this.f10867g;
                        byte[] bArr2 = kVar.f12121a;
                        if (!z2) {
                            i3 = 0;
                        }
                        bArr2[0] = (byte) (i3 | 8);
                        kVar.mo14549e(0);
                        nVar.mo14099a(this.f10867g, 1);
                        this.f10857V++;
                        this.f10872l.mo14549e(0);
                        nVar.mo14099a(this.f10872l, 8);
                        this.f10857V += 8;
                    }
                    if (z2) {
                        if (!this.f10853R) {
                            ((C3072b) gVar).mo14087b(this.f10867g.f12121a, 0, 1, false);
                            this.f10849N++;
                            this.f10867g.mo14549e(0);
                            this.f10855T = this.f10867g.mo14557l();
                            this.f10853R = true;
                        }
                        int i4 = this.f10855T * 4;
                        this.f10867g.mo14545c(i4);
                        ((C3072b) gVar).mo14087b(this.f10867g.f12121a, 0, i4, false);
                        this.f10849N += i4;
                        short s = (short) ((this.f10855T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f10874n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f10874n = ByteBuffer.allocate(i5);
                        }
                        this.f10874n.position(0);
                        this.f10874n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f10855T;
                            if (i6 >= i2) {
                                break;
                            }
                            int o = this.f10867g.mo14560o();
                            if (i6 % 2 == 0) {
                                this.f10874n.putShort((short) (o - i7));
                            } else {
                                this.f10874n.putInt(o - i7);
                            }
                            i6++;
                            i7 = o;
                        }
                        int i8 = (i - this.f10849N) - i7;
                        if (i2 % 2 == 1) {
                            this.f10874n.putInt(i8);
                        } else {
                            this.f10874n.putShort((short) i8);
                            this.f10874n.putInt(0);
                        }
                        this.f10873m.mo14540a(this.f10874n.array(), i5);
                        nVar.mo14099a(this.f10873m, i5);
                        this.f10857V += i5;
                    }
                }
            } else {
                byte[] bArr3 = cVar.f10909f;
                if (bArr3 != null) {
                    C3393k kVar2 = this.f10870j;
                    int length2 = bArr3.length;
                    kVar2.f12121a = bArr3;
                    kVar2.f12123c = length2;
                    kVar2.f12122b = 0;
                }
            }
            this.f10850O = true;
        }
        int i9 = i + this.f10870j.f12123c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f10904a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f10904a)) {
            while (true) {
                int i11 = this.f10849N;
                if (i11 >= i9) {
                    break;
                }
                mo14192a(gVar, nVar, i9 - i11);
            }
        } else {
            byte[] bArr4 = this.f10866f.f12121a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i12 = cVar.f10903P;
            int i13 = 4 - i12;
            while (this.f10849N < i9) {
                int i14 = this.f10856U;
                if (i14 == 0) {
                    int min = Math.min(i12, this.f10870j.mo14537a());
                    ((C3072b) gVar).mo14087b(bArr4, i13 + min, i12 - min, false);
                    if (min > 0) {
                        C3393k kVar3 = this.f10870j;
                        System.arraycopy(kVar3.f12121a, kVar3.f12122b, bArr4, i13, min);
                        kVar3.f12122b += min;
                    }
                    this.f10849N += i12;
                    this.f10866f.mo14549e(0);
                    this.f10856U = this.f10866f.mo14560o();
                    this.f10865e.mo14549e(0);
                    nVar.mo14099a(this.f10865e, 4);
                    this.f10857V += 4;
                } else {
                    this.f10856U = i14 - mo14192a(gVar, nVar, i14);
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f10904a)) {
            this.f10868h.mo14549e(0);
            nVar.mo14099a(this.f10868h, 4);
            this.f10857V += 4;
        }
    }

    /* renamed from: a */
    public final int mo14192a(C3087g gVar, C3161n nVar, int i) throws IOException, InterruptedException {
        int i2;
        int a = this.f10870j.mo14537a();
        if (a > 0) {
            i2 = Math.min(i, a);
            nVar.mo14099a(this.f10870j, i2);
        } else {
            i2 = nVar.mo14092a(gVar, i, false);
        }
        this.f10849N += i2;
        this.f10857V += i2;
        return i2;
    }

    /* renamed from: a */
    public final long mo14193a(long j) throws C3230l {
        long j2 = this.f10877q;
        if (j2 != -9223372036854775807L) {
            return C3406u.m8591a(j, j2, 1000);
        }
        throw new C3230l("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    public static int[] m7859a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }
}
