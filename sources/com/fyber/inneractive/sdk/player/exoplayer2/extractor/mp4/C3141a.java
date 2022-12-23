package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a */
public abstract class C3141a {

    /* renamed from: A */
    public static final int f10963A = C3406u.m8589a("trun");

    /* renamed from: A0 */
    public static final int f10964A0 = C3406u.m8589a("udta");

    /* renamed from: B */
    public static final int f10965B = C3406u.m8589a("sidx");

    /* renamed from: B0 */
    public static final int f10966B0 = C3406u.m8589a("meta");

    /* renamed from: C */
    public static final int f10967C = C3406u.m8589a("moov");

    /* renamed from: C0 */
    public static final int f10968C0 = C3406u.m8589a("ilst");

    /* renamed from: D */
    public static final int f10969D = C3406u.m8589a("mvhd");

    /* renamed from: D0 */
    public static final int f10970D0 = C3406u.m8589a("mean");

    /* renamed from: E */
    public static final int f10971E = C3406u.m8589a("trak");

    /* renamed from: E0 */
    public static final int f10972E0 = C3406u.m8589a("name");

    /* renamed from: F */
    public static final int f10973F = C3406u.m8589a("mdia");

    /* renamed from: F0 */
    public static final int f10974F0 = C3406u.m8589a("data");

    /* renamed from: G */
    public static final int f10975G = C3406u.m8589a("minf");

    /* renamed from: G0 */
    public static final int f10976G0 = C3406u.m8589a("emsg");

    /* renamed from: H */
    public static final int f10977H = C3406u.m8589a("stbl");

    /* renamed from: H0 */
    public static final int f10978H0 = C3406u.m8589a("st3d");

    /* renamed from: I */
    public static final int f10979I = C3406u.m8589a("avcC");

    /* renamed from: I0 */
    public static final int f10980I0 = C3406u.m8589a("sv3d");

    /* renamed from: J */
    public static final int f10981J = C3406u.m8589a("hvcC");

    /* renamed from: J0 */
    public static final int f10982J0 = C3406u.m8589a("proj");

    /* renamed from: K */
    public static final int f10983K = C3406u.m8589a("esds");

    /* renamed from: K0 */
    public static final int f10984K0 = C3406u.m8589a("vp08");

    /* renamed from: L */
    public static final int f10985L = C3406u.m8589a("moof");

    /* renamed from: L0 */
    public static final int f10986L0 = C3406u.m8589a("vp09");

    /* renamed from: M */
    public static final int f10987M = C3406u.m8589a("traf");

    /* renamed from: M0 */
    public static final int f10988M0 = C3406u.m8589a("vpcC");

    /* renamed from: N */
    public static final int f10989N = C3406u.m8589a("mvex");

    /* renamed from: N0 */
    public static final int f10990N0 = C3406u.m8589a("camm");

    /* renamed from: O */
    public static final int f10991O = C3406u.m8589a("mehd");

    /* renamed from: O0 */
    public static final int f10992O0 = C3406u.m8589a("alac");

    /* renamed from: P */
    public static final int f10993P = C3406u.m8589a("tkhd");

    /* renamed from: Q */
    public static final int f10994Q = C3406u.m8589a("edts");

    /* renamed from: R */
    public static final int f10995R = C3406u.m8589a("elst");

    /* renamed from: S */
    public static final int f10996S = C3406u.m8589a("mdhd");

    /* renamed from: T */
    public static final int f10997T = C3406u.m8589a("hdlr");

    /* renamed from: U */
    public static final int f10998U = C3406u.m8589a("stsd");

    /* renamed from: V */
    public static final int f10999V = C3406u.m8589a("pssh");

    /* renamed from: W */
    public static final int f11000W = C3406u.m8589a("sinf");

    /* renamed from: X */
    public static final int f11001X = C3406u.m8589a("schm");

    /* renamed from: Y */
    public static final int f11002Y = C3406u.m8589a("schi");

    /* renamed from: Z */
    public static final int f11003Z = C3406u.m8589a("tenc");

    /* renamed from: a0 */
    public static final int f11004a0 = C3406u.m8589a("encv");

    /* renamed from: b */
    public static final int f11005b = C3406u.m8589a("ftyp");

    /* renamed from: b0 */
    public static final int f11006b0 = C3406u.m8589a("enca");

    /* renamed from: c */
    public static final int f11007c = C3406u.m8589a("avc1");

    /* renamed from: c0 */
    public static final int f11008c0 = C3406u.m8589a("frma");

    /* renamed from: d */
    public static final int f11009d = C3406u.m8589a("avc3");

    /* renamed from: d0 */
    public static final int f11010d0 = C3406u.m8589a("saiz");

    /* renamed from: e */
    public static final int f11011e = C3406u.m8589a("hvc1");

    /* renamed from: e0 */
    public static final int f11012e0 = C3406u.m8589a("saio");

    /* renamed from: f */
    public static final int f11013f = C3406u.m8589a("hev1");

    /* renamed from: f0 */
    public static final int f11014f0 = C3406u.m8589a("sbgp");

    /* renamed from: g */
    public static final int f11015g = C3406u.m8589a("s263");

    /* renamed from: g0 */
    public static final int f11016g0 = C3406u.m8589a("sgpd");

    /* renamed from: h */
    public static final int f11017h = C3406u.m8589a("d263");

    /* renamed from: h0 */
    public static final int f11018h0 = C3406u.m8589a("uuid");

    /* renamed from: i */
    public static final int f11019i = C3406u.m8589a("mdat");

    /* renamed from: i0 */
    public static final int f11020i0 = C3406u.m8589a("senc");

    /* renamed from: j */
    public static final int f11021j = C3406u.m8589a("mp4a");

    /* renamed from: j0 */
    public static final int f11022j0 = C3406u.m8589a("pasp");

    /* renamed from: k */
    public static final int f11023k = C3406u.m8589a(".mp3");

    /* renamed from: k0 */
    public static final int f11024k0 = C3406u.m8589a("TTML");

    /* renamed from: l */
    public static final int f11025l = C3406u.m8589a("wave");

    /* renamed from: l0 */
    public static final int f11026l0 = C3406u.m8589a("mp4v");

    /* renamed from: m */
    public static final int f11027m = C3406u.m8589a("lpcm");

    /* renamed from: m0 */
    public static final int f11028m0 = C3406u.m8589a("stts");

    /* renamed from: n */
    public static final int f11029n = C3406u.m8589a("sowt");

    /* renamed from: n0 */
    public static final int f11030n0 = C3406u.m8589a("stss");

    /* renamed from: o */
    public static final int f11031o = C3406u.m8589a("ac-3");

    /* renamed from: o0 */
    public static final int f11032o0 = C3406u.m8589a("ctts");

    /* renamed from: p */
    public static final int f11033p = C3406u.m8589a("dac3");

    /* renamed from: p0 */
    public static final int f11034p0 = C3406u.m8589a("stsc");

    /* renamed from: q */
    public static final int f11035q = C3406u.m8589a("ec-3");

    /* renamed from: q0 */
    public static final int f11036q0 = C3406u.m8589a("stsz");

    /* renamed from: r */
    public static final int f11037r = C3406u.m8589a("dec3");

    /* renamed from: r0 */
    public static final int f11038r0 = C3406u.m8589a("stz2");

    /* renamed from: s */
    public static final int f11039s = C3406u.m8589a("dtsc");

    /* renamed from: s0 */
    public static final int f11040s0 = C3406u.m8589a("stco");

    /* renamed from: t */
    public static final int f11041t = C3406u.m8589a("dtsh");

    /* renamed from: t0 */
    public static final int f11042t0 = C3406u.m8589a("co64");

    /* renamed from: u */
    public static final int f11043u = C3406u.m8589a("dtsl");

    /* renamed from: u0 */
    public static final int f11044u0 = C3406u.m8589a("tx3g");

    /* renamed from: v */
    public static final int f11045v = C3406u.m8589a("dtse");

    /* renamed from: v0 */
    public static final int f11046v0 = C3406u.m8589a("wvtt");

    /* renamed from: w */
    public static final int f11047w = C3406u.m8589a("ddts");

    /* renamed from: w0 */
    public static final int f11048w0 = C3406u.m8589a("stpp");

    /* renamed from: x */
    public static final int f11049x = C3406u.m8589a("tfdt");

    /* renamed from: x0 */
    public static final int f11050x0 = C3406u.m8589a("c608");

    /* renamed from: y */
    public static final int f11051y = C3406u.m8589a("tfhd");

    /* renamed from: y0 */
    public static final int f11052y0 = C3406u.m8589a("samr");

    /* renamed from: z */
    public static final int f11053z = C3406u.m8589a("trex");

    /* renamed from: z0 */
    public static final int f11054z0 = C3406u.m8589a("sawb");

    /* renamed from: a */
    public final int f11055a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a */
    public static final class C3142a extends C3141a {

        /* renamed from: P0 */
        public final long f11056P0;

        /* renamed from: Q0 */
        public final List<C3143b> f11057Q0 = new ArrayList();

        /* renamed from: R0 */
        public final List<C3142a> f11058R0 = new ArrayList();

        public C3142a(int i, long j) {
            super(i);
            this.f11056P0 = j;
        }

        /* renamed from: c */
        public C3142a mo14210c(int i) {
            int size = this.f11058R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3142a aVar = this.f11058R0.get(i2);
                if (aVar.f11055a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public C3143b mo14211d(int i) {
            int size = this.f11057Q0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3143b bVar = this.f11057Q0.get(i2);
                if (bVar.f11055a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public String toString() {
            return C3141a.m7902a(this.f11055a) + " leaves: " + Arrays.toString(this.f11057Q0.toArray()) + " containers: " + Arrays.toString(this.f11058R0.toArray());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b */
    public static final class C3143b extends C3141a {

        /* renamed from: P0 */
        public final C3393k f11059P0;

        public C3143b(int i, C3393k kVar) {
            super(i);
            this.f11059P0 = kVar;
        }
    }

    static {
        C3406u.m8589a("vmhd");
    }

    public C3141a(int i) {
        this.f11055a = i;
    }

    /* renamed from: a */
    public static String m7902a(int i) {
        StringBuilder k = C13555b.m33972k("");
        k.append((char) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        k.append((char) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        k.append((char) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        k.append((char) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        return k.toString();
    }

    /* renamed from: b */
    public static int m7903b(int i) {
        return (i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    public String toString() {
        return m7902a(this.f11055a);
    }
}
