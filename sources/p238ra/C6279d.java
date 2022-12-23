package p238ra;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6774a0;
import p277ub.C6790l;
import p277ub.C6795o;
import p277ub.C6803r;
import p583jk.C17875h;

/* renamed from: ra.d */
public final class C6279d implements C5735h {

    /* renamed from: b0 */
    public static final byte[] f19752b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0 */
    public static final byte[] f19753c0 = C6774a0.m15961u("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    public static final byte[] f19754d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0 */
    public static final UUID f19755e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0 */
    public static final Map<String, Integer> f19756f0;

    /* renamed from: A */
    public long f19757A = -1;

    /* renamed from: B */
    public long f19758B = -9223372036854775807L;

    /* renamed from: C */
    public C6790l f19759C;

    /* renamed from: D */
    public C6790l f19760D;

    /* renamed from: E */
    public boolean f19761E;

    /* renamed from: F */
    public boolean f19762F;

    /* renamed from: G */
    public int f19763G;

    /* renamed from: H */
    public long f19764H;

    /* renamed from: I */
    public long f19765I;

    /* renamed from: J */
    public int f19766J;

    /* renamed from: K */
    public int f19767K;

    /* renamed from: L */
    public int[] f19768L;

    /* renamed from: M */
    public int f19769M;

    /* renamed from: N */
    public int f19770N;

    /* renamed from: O */
    public int f19771O;

    /* renamed from: P */
    public int f19772P;

    /* renamed from: Q */
    public boolean f19773Q;

    /* renamed from: R */
    public int f19774R;

    /* renamed from: S */
    public int f19775S;

    /* renamed from: T */
    public int f19776T;

    /* renamed from: U */
    public boolean f19777U;

    /* renamed from: V */
    public boolean f19778V;

    /* renamed from: W */
    public boolean f19779W;

    /* renamed from: X */
    public int f19780X;

    /* renamed from: Y */
    public byte f19781Y;

    /* renamed from: Z */
    public boolean f19782Z;

    /* renamed from: a */
    public final C6278c f19783a;

    /* renamed from: a0 */
    public C5737j f19784a0;

    /* renamed from: b */
    public final C6284f f19785b;

    /* renamed from: c */
    public final SparseArray<C6281b> f19786c;

    /* renamed from: d */
    public final boolean f19787d;

    /* renamed from: e */
    public final C6803r f19788e;

    /* renamed from: f */
    public final C6803r f19789f;

    /* renamed from: g */
    public final C6803r f19790g;

    /* renamed from: h */
    public final C6803r f19791h;

    /* renamed from: i */
    public final C6803r f19792i;

    /* renamed from: j */
    public final C6803r f19793j;

    /* renamed from: k */
    public final C6803r f19794k;

    /* renamed from: l */
    public final C6803r f19795l;

    /* renamed from: m */
    public final C6803r f19796m;

    /* renamed from: n */
    public final C6803r f19797n;

    /* renamed from: o */
    public ByteBuffer f19798o;

    /* renamed from: p */
    public long f19799p;

    /* renamed from: q */
    public long f19800q = -1;

    /* renamed from: r */
    public long f19801r = -9223372036854775807L;

    /* renamed from: s */
    public long f19802s = -9223372036854775807L;

    /* renamed from: t */
    public long f19803t = -9223372036854775807L;

    /* renamed from: u */
    public C6281b f19804u;

    /* renamed from: v */
    public boolean f19805v;

    /* renamed from: w */
    public int f19806w;

    /* renamed from: x */
    public long f19807x;

    /* renamed from: y */
    public boolean f19808y;

    /* renamed from: z */
    public long f19809z = -1;

    /* renamed from: ra.d$a */
    public final class C6280a implements C6277b {
        public C6280a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r3v37, types: [byte[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: type inference failed for: r0v105, types: [byte[], java.io.Serializable] */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:281:0x0532, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x058e, code lost:
            if (r0 == 0) goto L_0x05ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x05a7, code lost:
            r3 = null;
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:300:0x05ab, code lost:
            r3 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:309:0x05eb, code lost:
            r0 = r3;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x0616, code lost:
            r15 = r0;
            r6 = r4;
            r0 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:313:0x0619, code lost:
            r4 = r3;
            r9 = r6;
            r6 = r15;
            r3 = -1;
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:315:0x0634, code lost:
            r3 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:347:0x06e2, code lost:
            r4 = r0;
            r0 = r3;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:348:0x06e5, code lost:
            r6 = r4;
            r4 = r3;
            r3 = r0;
            r0 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:354:0x06f7, code lost:
            r3 = r0;
            r0 = 4096;
            r6 = r3;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:389:0x078e, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:390:0x078f, code lost:
            r7 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:402:0x07c8, code lost:
            if (r0.mo22991j() == r3.getLeastSignificantBits()) goto L_0x07ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:419:0x07fb, code lost:
            r3 = r0;
            r6 = r4;
            r0 = -1;
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:420:0x07ff, code lost:
            r9 = r6;
            r6 = r4;
            r4 = r3;
            r3 = r0;
            r0 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:421:0x0804, code lost:
            r11 = r8.f19824N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:422:0x0806, code lost:
            if (r11 == null) goto L_0x0818;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:423:0x0808, code lost:
            r11 = p019b0.C1425b.m3809e(new p277ub.C6803r(r11));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:424:0x0811, code lost:
            if (r11 == null) goto L_0x0818;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:425:0x0813, code lost:
            r6 = r11.f5271b;
            r9 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:426:0x0818, code lost:
            r11 = r8.f19832V | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:427:0x081e, code lost:
            if (r8.f19831U == false) goto L_0x0822;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:428:0x0820, code lost:
            r12 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:429:0x0822, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:430:0x0823, code lost:
            r11 = r11 | r12;
            r12 = new com.google.android.exoplayer2.Format.C3872b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:431:0x082d, code lost:
            if (p277ub.C6792n.m15995h(r9) == false) goto L_0x083b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:432:0x082f, code lost:
            r12.f13459x = r8.f19825O;
            r12.f13460y = r8.f19827Q;
            r12.f13461z = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:434:0x083f, code lost:
            if (p277ub.C6792n.m15997j(r9) == false) goto L_0x09c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:436:0x0843, code lost:
            if (r8.f19852q != 0) goto L_0x0857;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:437:0x0845, code lost:
            r0 = r8.f19850o;
            r1 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:438:0x0848, code lost:
            if (r0 != -1) goto L_0x084c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:439:0x084a, code lost:
            r0 = r8.f19848m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:440:0x084c, code lost:
            r8.f19850o = r0;
            r0 = r8.f19851p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:441:0x0850, code lost:
            if (r0 != -1) goto L_0x0854;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:442:0x0852, code lost:
            r0 = r8.f19849n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:443:0x0854, code lost:
            r8.f19851p = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:444:0x0857, code lost:
            r1 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:445:0x0858, code lost:
            r0 = -1.0f;
            r2 = r8.f19850o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:446:0x085c, code lost:
            if (r2 == r1) goto L_0x086d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:447:0x085e, code lost:
            r7 = r8.f19851p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:448:0x0860, code lost:
            if (r7 == r1) goto L_0x086d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:449:0x0862, code lost:
            r0 = ((float) (r8.f19849n * r2)) / ((float) (r8.f19848m * r7));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:451:0x086f, code lost:
            if (r8.f19859x == false) goto L_0x0942;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:453:0x0877, code lost:
            if (r8.f19814D == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:455:0x087d, code lost:
            if (r8.f19815E == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:457:0x0883, code lost:
            if (r8.f19816F == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:459:0x0889, code lost:
            if (r8.f19817G == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:461:0x088f, code lost:
            if (r8.f19818H == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:463:0x0895, code lost:
            if (r8.f19819I == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:465:0x089b, code lost:
            if (r8.f19820J == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:467:0x08a1, code lost:
            if (r8.f19821K == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:469:0x08a7, code lost:
            if (r8.f19822L == -1.0f) goto L_0x0935;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:471:0x08ad, code lost:
            if (r8.f19823M != -1.0f) goto L_0x08b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:472:0x08b1, code lost:
            r2 = new byte[25];
            r7 = java.nio.ByteBuffer.wrap(r2).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            r7.put((byte) 0);
            r7.putShort((short) ((int) ((r8.f19814D * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19815E * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19816F * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19817G * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19818H * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19819I * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19820J * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) ((r8.f19821K * 50000.0f) + 0.5f)));
            r7.putShort((short) ((int) (r8.f19822L + 0.5f)));
            r7.putShort((short) ((int) (r8.f19823M + 0.5f)));
            r7.putShort((short) r8.f19812B);
            r7.putShort((short) r8.f19813C);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:473:0x0935, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:474:0x0936, code lost:
            r7 = new com.google.android.exoplayer2.video.ColorInfo(r8.f19860y, r8.f19811A, r8.f19861z, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:475:0x0942, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:476:0x0943, code lost:
            r2 = r8.f19836a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:477:0x0945, code lost:
            if (r2 == null) goto L_0x095b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:478:0x0947, code lost:
            r10 = p238ra.C6279d.f19756f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:479:0x094d, code lost:
            if (r10.containsKey(r2) == false) goto L_0x095b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:480:0x094f, code lost:
            r1 = r10.get(r8.f19836a).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:482:0x095d, code lost:
            if (r8.f19853r != 0) goto L_0x09ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:484:0x0966, code lost:
            if (java.lang.Float.compare(r8.f19854s, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x09ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:486:0x096e, code lost:
            if (java.lang.Float.compare(r8.f19855t, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x09ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:488:0x0976, code lost:
            if (java.lang.Float.compare(r8.f19856u, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) != 0) goto L_0x097a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:489:0x0978, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:491:0x0982, code lost:
            if (java.lang.Float.compare(r8.f19855t, 90.0f) != 0) goto L_0x0987;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:492:0x0984, code lost:
            r1 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:494:0x098f, code lost:
            if (java.lang.Float.compare(r8.f19855t, -180.0f) == 0) goto L_0x09a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:496:0x0999, code lost:
            if (java.lang.Float.compare(r8.f19855t, 180.0f) != 0) goto L_0x099c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:498:0x09a4, code lost:
            if (java.lang.Float.compare(r8.f19855t, -90.0f) != 0) goto L_0x09ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:499:0x09a6, code lost:
            r1 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:500:0x09a9, code lost:
            r1 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:501:0x09ab, code lost:
            r12.f13451p = r8.f19848m;
            r12.f13452q = r8.f19849n;
            r12.f13455t = r0;
            r12.f13454s = r1;
            r12.f13456u = r8.f19857v;
            r12.f13457v = r8.f19858w;
            r12.f13458w = r7;
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:503:0x09c7, code lost:
            if ("application/x-subrip".equals(r9) != false) goto L_0x09f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:505:0x09cd, code lost:
            if ("text/x-ssa".equals(r9) != false) goto L_0x09f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:507:0x09d5, code lost:
            if ("application/vobsub".equals(r9) != false) goto L_0x09f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:509:0x09dd, code lost:
            if ("application/pgs".equals(r9) != false) goto L_0x09f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:511:0x09e5, code lost:
            if ("application/dvbsubs".equals(r9) == false) goto L_0x09e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:513:0x09ef, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:514:0x09f0, code lost:
            r7 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:515:0x09f1, code lost:
            r0 = r8.f19836a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:516:0x09f3, code lost:
            if (r0 == null) goto L_0x0a01;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:518:0x09fb, code lost:
            if (p238ra.C6279d.f19756f0.containsKey(r0) != false) goto L_0x0a01;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:519:0x09fd, code lost:
            r12.f13437b = r8.f19836a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:520:0x0a01, code lost:
            r12.mo15807b(r5);
            r12.f13446k = r9;
            r12.f13447l = r3;
            r12.f13438c = r8.f19833W;
            r12.f13439d = r11;
            r12.f13448m = r4;
            r12.f13443h = r6;
            r12.f13449n = r8.f19847l;
            r0 = new com.google.android.exoplayer2.Format(r12);
            r1 = r24.mo20709p(r8.f19838c, r7);
            r8.f19834X = r1;
            r1.mo20632c(r0);
            r0 = r19;
            r0.f19786c.put(r8.f19838c, r8);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:406:0x07cf  */
        /* JADX WARNING: Removed duplicated region for block: B:409:0x07dd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo22270a(int r28) throws com.google.android.exoplayer2.ParserException {
            /*
                r27 = this;
                r0 = r27
                r1 = r28
                ra.d r8 = p238ra.C6279d.this
                ma.j r2 = r8.f19784a0
                p583jk.C17875h.m44306q(r2)
                r2 = 160(0xa0, float:2.24E-43)
                r9 = 0
                if (r1 == r2) goto L_0x0a40
                r2 = 174(0xae, float:2.44E-43)
                r4 = -1
                if (r1 == r2) goto L_0x0166
                r2 = 19899(0x4dbb, float:2.7884E-41)
                r3 = 475249515(0x1c53bb6b, float:7.0056276E-22)
                if (r1 == r2) goto L_0x014c
                r2 = 25152(0x6240, float:3.5245E-41)
                if (r1 == r2) goto L_0x011c
                r2 = 28032(0x6d80, float:3.9281E-41)
                if (r1 == r2) goto L_0x0105
                r2 = 357149030(0x1549a966, float:4.072526E-26)
                r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r1 == r2) goto L_0x00ec
                r2 = 374648427(0x1654ae6b, float:1.718026E-25)
                if (r1 == r2) goto L_0x00d5
                if (r1 == r3) goto L_0x0037
                goto L_0x0a93
            L_0x0037:
                boolean r1 = r8.f19805v
                if (r1 != 0) goto L_0x00ce
                ma.j r1 = r8.f19784a0
                ub.l r2 = r8.f19759C
                ub.l r3 = r8.f19760D
                long r12 = r8.f19800q
                r14 = -1
                int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r7 == 0) goto L_0x00c1
                long r12 = r8.f19803t
                int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00c1
                if (r2 == 0) goto L_0x00c1
                int r7 = r2.f21001a
                if (r7 == 0) goto L_0x00c1
                if (r3 == 0) goto L_0x00c1
                int r10 = r3.f21001a
                if (r10 == r7) goto L_0x005c
                goto L_0x00c1
            L_0x005c:
                int[] r10 = new int[r7]
                long[] r11 = new long[r7]
                long[] r12 = new long[r7]
                long[] r13 = new long[r7]
                r14 = 0
            L_0x0065:
                if (r14 >= r7) goto L_0x007a
                long r15 = r2.mo22964b(r14)
                r13[r14] = r15
                long r5 = r8.f19800q
                long r17 = r3.mo22964b(r14)
                long r17 = r17 + r5
                r11[r14] = r17
                int r14 = r14 + 1
                goto L_0x0065
            L_0x007a:
                int r2 = r7 + -1
                if (r9 >= r2) goto L_0x0093
                int r2 = r9 + 1
                r5 = r11[r2]
                r17 = r11[r9]
                long r5 = r5 - r17
                int r3 = (int) r5
                r10[r9] = r3
                r5 = r13[r2]
                r17 = r13[r9]
                long r5 = r5 - r17
                r12[r9] = r5
                r9 = r2
                goto L_0x007a
            L_0x0093:
                long r3 = r8.f19800q
                long r5 = r8.f19799p
                long r3 = r3 + r5
                r5 = r11[r2]
                long r3 = r3 - r5
                int r4 = (int) r3
                r10[r2] = r4
                long r3 = r8.f19803t
                r5 = r13[r2]
                long r3 = r3 - r5
                r12[r2] = r3
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x00bb
                int[] r10 = java.util.Arrays.copyOf(r10, r2)
                long[] r11 = java.util.Arrays.copyOf(r11, r2)
                long[] r12 = java.util.Arrays.copyOf(r12, r2)
                long[] r13 = java.util.Arrays.copyOf(r13, r2)
            L_0x00bb:
                ma.c r2 = new ma.c
                r2.<init>(r10, r11, r12, r13)
                goto L_0x00c8
            L_0x00c1:
                ma.t$b r2 = new ma.t$b
                long r3 = r8.f19803t
                r2.<init>(r3)
            L_0x00c8:
                r1.mo20707k(r2)
                r1 = 1
                r8.f19805v = r1
            L_0x00ce:
                r1 = 0
                r8.f19759C = r1
                r8.f19760D = r1
                goto L_0x0a93
            L_0x00d5:
                android.util.SparseArray<ra.d$b> r1 = r8.f19786c
                int r1 = r1.size()
                if (r1 == 0) goto L_0x00e4
                ma.j r1 = r8.f19784a0
                r1.mo20708n()
                goto L_0x0a93
            L_0x00e4:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "No valid tracks were found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x00ec:
                long r1 = r8.f19801r
                int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r3 != 0) goto L_0x00f7
                r1 = 1000000(0xf4240, double:4.940656E-318)
                r8.f19801r = r1
            L_0x00f7:
                long r1 = r8.f19802s
                int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r3 == 0) goto L_0x0a93
                long r1 = r8.mo22267k(r1)
                r8.f19803t = r1
                goto L_0x0a93
            L_0x0105:
                r8.mo22263d(r1)
                ra.d$b r1 = r8.f19804u
                boolean r2 = r1.f19843h
                if (r2 == 0) goto L_0x0a93
                byte[] r1 = r1.f19844i
                if (r1 != 0) goto L_0x0114
                goto L_0x0a93
            L_0x0114:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Combining encryption and compression is not supported"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x011c:
                r8.mo22263d(r1)
                ra.d$b r1 = r8.f19804u
                boolean r2 = r1.f19843h
                if (r2 == 0) goto L_0x0a93
                ma.v$a r2 = r1.f19845j
                if (r2 == 0) goto L_0x0144
                com.google.android.exoplayer2.drm.DrmInitData r3 = new com.google.android.exoplayer2.drm.DrmInitData
                r4 = 1
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r4]
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData r6 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
                java.util.UUID r7 = p099ga.C4883f.f16441a
                byte[] r2 = r2.f18633b
                java.lang.String r8 = "video/webm"
                r10 = 0
                r6.<init>(r7, r10, r8, r2)
                r5[r9] = r6
                r3.<init>(r10, r4, r5)
                r1.f19847l = r3
                goto L_0x0a93
            L_0x0144:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x014c:
                int r1 = r8.f19806w
                if (r1 == r4) goto L_0x015e
                long r4 = r8.f19807x
                r6 = -1
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 == 0) goto L_0x015e
                if (r1 != r3) goto L_0x0a93
                r8.f19809z = r4
                goto L_0x0a93
            L_0x015e:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0166:
                ra.d$b r1 = r8.f19804u
                p583jk.C17875h.m44306q(r1)
                java.lang.String r2 = r1.f19837b
                if (r2 == 0) goto L_0x0a38
                int r5 = r2.hashCode()
                java.lang.String r6 = "A_MS/ACM"
                java.lang.String r7 = "V_MPEG4/ISO/SP"
                java.lang.String r10 = "V_MPEG4/ISO/AP"
                java.lang.String r11 = "V_MS/VFW/FOURCC"
                java.lang.String r12 = "A_MPEG/L3"
                java.lang.String r13 = "A_MPEG/L2"
                java.lang.String r14 = "A_VORBIS"
                java.lang.String r15 = "A_TRUEHD"
                java.lang.String r4 = "A_DTS/LOSSLESS"
                java.lang.String r9 = "S_VOBSUB"
                java.lang.String r3 = "V_MPEG4/ISO/AVC"
                java.lang.String r0 = "V_MPEG4/ISO/ASP"
                r19 = r1
                java.lang.String r1 = "S_DVBSUB"
                r20 = r8
                r21 = 19
                r22 = 18
                r23 = 17
                switch(r5) {
                    case -2095576542: goto L_0x031f;
                    case -2095575984: goto L_0x0316;
                    case -1985379776: goto L_0x030d;
                    case -1784763192: goto L_0x0304;
                    case -1730367663: goto L_0x02fb;
                    case -1482641358: goto L_0x02f2;
                    case -1482641357: goto L_0x02e9;
                    case -1373388978: goto L_0x02e0;
                    case -933872740: goto L_0x02d6;
                    case -538363189: goto L_0x02ca;
                    case -538363109: goto L_0x02be;
                    case -425012669: goto L_0x02b2;
                    case -356037306: goto L_0x02a6;
                    case 62923557: goto L_0x0298;
                    case 62923603: goto L_0x028a;
                    case 62927045: goto L_0x027c;
                    case 82318131: goto L_0x026e;
                    case 82338133: goto L_0x0260;
                    case 82338134: goto L_0x0252;
                    case 99146302: goto L_0x0244;
                    case 444813526: goto L_0x0236;
                    case 542569478: goto L_0x0228;
                    case 635596514: goto L_0x021a;
                    case 725948237: goto L_0x020c;
                    case 725957860: goto L_0x01fe;
                    case 738597099: goto L_0x01f0;
                    case 855502857: goto L_0x01e2;
                    case 1422270023: goto L_0x01d4;
                    case 1809237540: goto L_0x01c6;
                    case 1950749482: goto L_0x01b8;
                    case 1950789798: goto L_0x01aa;
                    case 1951062397: goto L_0x019c;
                    default: goto L_0x019a;
                }
            L_0x019a:
                goto L_0x0328
            L_0x019c:
                java.lang.String r5 = "A_OPUS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01a6
                goto L_0x0328
            L_0x01a6:
                r2 = 31
                goto L_0x0329
            L_0x01aa:
                java.lang.String r5 = "A_FLAC"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01b4
                goto L_0x0328
            L_0x01b4:
                r2 = 30
                goto L_0x0329
            L_0x01b8:
                java.lang.String r5 = "A_EAC3"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01c2
                goto L_0x0328
            L_0x01c2:
                r2 = 29
                goto L_0x0329
            L_0x01c6:
                java.lang.String r5 = "V_MPEG2"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01d0
                goto L_0x0328
            L_0x01d0:
                r2 = 28
                goto L_0x0329
            L_0x01d4:
                java.lang.String r5 = "S_TEXT/UTF8"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01de
                goto L_0x0328
            L_0x01de:
                r2 = 27
                goto L_0x0329
            L_0x01e2:
                java.lang.String r5 = "V_MPEGH/ISO/HEVC"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01ec
                goto L_0x0328
            L_0x01ec:
                r2 = 26
                goto L_0x0329
            L_0x01f0:
                java.lang.String r5 = "S_TEXT/ASS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01fa
                goto L_0x0328
            L_0x01fa:
                r2 = 25
                goto L_0x0329
            L_0x01fe:
                java.lang.String r5 = "A_PCM/INT/LIT"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0208
                goto L_0x0328
            L_0x0208:
                r2 = 24
                goto L_0x0329
            L_0x020c:
                java.lang.String r5 = "A_PCM/INT/BIG"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0216
                goto L_0x0328
            L_0x0216:
                r2 = 23
                goto L_0x0329
            L_0x021a:
                java.lang.String r5 = "A_PCM/FLOAT/IEEE"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0224
                goto L_0x0328
            L_0x0224:
                r2 = 22
                goto L_0x0329
            L_0x0228:
                java.lang.String r5 = "A_DTS/EXPRESS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0232
                goto L_0x0328
            L_0x0232:
                r2 = 21
                goto L_0x0329
            L_0x0236:
                java.lang.String r5 = "V_THEORA"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0240
                goto L_0x0328
            L_0x0240:
                r2 = 20
                goto L_0x0329
            L_0x0244:
                java.lang.String r5 = "S_HDMV/PGS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x024e
                goto L_0x0328
            L_0x024e:
                r2 = 19
                goto L_0x0329
            L_0x0252:
                java.lang.String r5 = "V_VP9"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x025c
                goto L_0x0328
            L_0x025c:
                r2 = 18
                goto L_0x0329
            L_0x0260:
                java.lang.String r5 = "V_VP8"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x026a
                goto L_0x0328
            L_0x026a:
                r2 = 17
                goto L_0x0329
            L_0x026e:
                java.lang.String r5 = "V_AV1"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0278
                goto L_0x0328
            L_0x0278:
                r2 = 16
                goto L_0x0329
            L_0x027c:
                java.lang.String r5 = "A_DTS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0286
                goto L_0x0328
            L_0x0286:
                r2 = 15
                goto L_0x0329
            L_0x028a:
                java.lang.String r5 = "A_AC3"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0294
                goto L_0x0328
            L_0x0294:
                r2 = 14
                goto L_0x0329
            L_0x0298:
                java.lang.String r5 = "A_AAC"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x02a2
                goto L_0x0328
            L_0x02a2:
                r2 = 13
                goto L_0x0329
            L_0x02a6:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x02ae
                goto L_0x0328
            L_0x02ae:
                r2 = 12
                goto L_0x0329
            L_0x02b2:
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x02ba
                goto L_0x0328
            L_0x02ba:
                r2 = 11
                goto L_0x0329
            L_0x02be:
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02c6
                goto L_0x0328
            L_0x02c6:
                r2 = 10
                goto L_0x0329
            L_0x02ca:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x02d2
                goto L_0x0328
            L_0x02d2:
                r2 = 9
                goto L_0x0329
            L_0x02d6:
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x02dd
                goto L_0x0328
            L_0x02dd:
                r2 = 8
                goto L_0x0329
            L_0x02e0:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x02e7
                goto L_0x0328
            L_0x02e7:
                r2 = 7
                goto L_0x0329
            L_0x02e9:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x02f0
                goto L_0x0328
            L_0x02f0:
                r2 = 6
                goto L_0x0329
            L_0x02f2:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x02f9
                goto L_0x0328
            L_0x02f9:
                r2 = 5
                goto L_0x0329
            L_0x02fb:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x0302
                goto L_0x0328
            L_0x0302:
                r2 = 4
                goto L_0x0329
            L_0x0304:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x030b
                goto L_0x0328
            L_0x030b:
                r2 = 3
                goto L_0x0329
            L_0x030d:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0314
                goto L_0x0328
            L_0x0314:
                r2 = 2
                goto L_0x0329
            L_0x0316:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x031d
                goto L_0x0328
            L_0x031d:
                r2 = 1
                goto L_0x0329
            L_0x031f:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0326
                goto L_0x0328
            L_0x0326:
                r2 = 0
                goto L_0x0329
            L_0x0328:
                r2 = -1
            L_0x0329:
                switch(r2) {
                    case 0: goto L_0x032e;
                    case 1: goto L_0x032e;
                    case 2: goto L_0x032e;
                    case 3: goto L_0x032e;
                    case 4: goto L_0x032e;
                    case 5: goto L_0x032e;
                    case 6: goto L_0x032e;
                    case 7: goto L_0x032e;
                    case 8: goto L_0x032e;
                    case 9: goto L_0x032e;
                    case 10: goto L_0x032e;
                    case 11: goto L_0x032e;
                    case 12: goto L_0x032e;
                    case 13: goto L_0x032e;
                    case 14: goto L_0x032e;
                    case 15: goto L_0x032e;
                    case 16: goto L_0x032e;
                    case 17: goto L_0x032e;
                    case 18: goto L_0x032e;
                    case 19: goto L_0x032e;
                    case 20: goto L_0x032e;
                    case 21: goto L_0x032e;
                    case 22: goto L_0x032e;
                    case 23: goto L_0x032e;
                    case 24: goto L_0x032e;
                    case 25: goto L_0x032e;
                    case 26: goto L_0x032e;
                    case 27: goto L_0x032e;
                    case 28: goto L_0x032e;
                    case 29: goto L_0x032e;
                    case 30: goto L_0x032e;
                    case 31: goto L_0x032e;
                    default: goto L_0x032c;
                }
            L_0x032c:
                r2 = 0
                goto L_0x032f
            L_0x032e:
                r2 = 1
            L_0x032f:
                if (r2 == 0) goto L_0x0a32
                r5 = r20
                ma.j r2 = r5.f19784a0
                r8 = r19
                r19 = r5
                int r5 = r8.f19838c
                r24 = r2
                java.lang.String r2 = r8.f19837b
                r2.getClass()
                int r25 = r2.hashCode()
                switch(r25) {
                    case -2095576542: goto L_0x04ce;
                    case -2095575984: goto L_0x04c5;
                    case -1985379776: goto L_0x04bc;
                    case -1784763192: goto L_0x04b3;
                    case -1730367663: goto L_0x04aa;
                    case -1482641358: goto L_0x04a1;
                    case -1482641357: goto L_0x0498;
                    case -1373388978: goto L_0x048f;
                    case -933872740: goto L_0x0485;
                    case -538363189: goto L_0x0479;
                    case -538363109: goto L_0x046d;
                    case -425012669: goto L_0x0461;
                    case -356037306: goto L_0x0455;
                    case 62923557: goto L_0x0447;
                    case 62923603: goto L_0x0439;
                    case 62927045: goto L_0x042b;
                    case 82318131: goto L_0x041d;
                    case 82338133: goto L_0x040f;
                    case 82338134: goto L_0x0401;
                    case 99146302: goto L_0x03f3;
                    case 444813526: goto L_0x03e5;
                    case 542569478: goto L_0x03d7;
                    case 635596514: goto L_0x03c9;
                    case 725948237: goto L_0x03bb;
                    case 725957860: goto L_0x03ad;
                    case 738597099: goto L_0x039f;
                    case 855502857: goto L_0x0391;
                    case 1422270023: goto L_0x0383;
                    case 1809237540: goto L_0x0375;
                    case 1950749482: goto L_0x0367;
                    case 1950789798: goto L_0x0359;
                    case 1951062397: goto L_0x034b;
                    default: goto L_0x0349;
                }
            L_0x0349:
                goto L_0x04d7
            L_0x034b:
                java.lang.String r0 = "A_OPUS"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0355
                goto L_0x04d7
            L_0x0355:
                r0 = 31
                goto L_0x04d8
            L_0x0359:
                java.lang.String r0 = "A_FLAC"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0363
                goto L_0x04d7
            L_0x0363:
                r0 = 30
                goto L_0x04d8
            L_0x0367:
                java.lang.String r0 = "A_EAC3"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0371
                goto L_0x04d7
            L_0x0371:
                r0 = 29
                goto L_0x04d8
            L_0x0375:
                java.lang.String r0 = "V_MPEG2"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x037f
                goto L_0x04d7
            L_0x037f:
                r0 = 28
                goto L_0x04d8
            L_0x0383:
                java.lang.String r0 = "S_TEXT/UTF8"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x038d
                goto L_0x04d7
            L_0x038d:
                r0 = 27
                goto L_0x04d8
            L_0x0391:
                java.lang.String r0 = "V_MPEGH/ISO/HEVC"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x039b
                goto L_0x04d7
            L_0x039b:
                r0 = 26
                goto L_0x04d8
            L_0x039f:
                java.lang.String r0 = "S_TEXT/ASS"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03a9
                goto L_0x04d7
            L_0x03a9:
                r0 = 25
                goto L_0x04d8
            L_0x03ad:
                java.lang.String r0 = "A_PCM/INT/LIT"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03b7
                goto L_0x04d7
            L_0x03b7:
                r0 = 24
                goto L_0x04d8
            L_0x03bb:
                java.lang.String r0 = "A_PCM/INT/BIG"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03c5
                goto L_0x04d7
            L_0x03c5:
                r0 = 23
                goto L_0x04d8
            L_0x03c9:
                java.lang.String r0 = "A_PCM/FLOAT/IEEE"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03d3
                goto L_0x04d7
            L_0x03d3:
                r0 = 22
                goto L_0x04d8
            L_0x03d7:
                java.lang.String r0 = "A_DTS/EXPRESS"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03e1
                goto L_0x04d7
            L_0x03e1:
                r0 = 21
                goto L_0x04d8
            L_0x03e5:
                java.lang.String r0 = "V_THEORA"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03ef
                goto L_0x04d7
            L_0x03ef:
                r0 = 20
                goto L_0x04d8
            L_0x03f3:
                java.lang.String r0 = "S_HDMV/PGS"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x03fd
                goto L_0x04d7
            L_0x03fd:
                r0 = 19
                goto L_0x04d8
            L_0x0401:
                java.lang.String r0 = "V_VP9"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x040b
                goto L_0x04d7
            L_0x040b:
                r0 = 18
                goto L_0x04d8
            L_0x040f:
                java.lang.String r0 = "V_VP8"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0419
                goto L_0x04d7
            L_0x0419:
                r0 = 17
                goto L_0x04d8
            L_0x041d:
                java.lang.String r0 = "V_AV1"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0427
                goto L_0x04d7
            L_0x0427:
                r0 = 16
                goto L_0x04d8
            L_0x042b:
                java.lang.String r0 = "A_DTS"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0435
                goto L_0x04d7
            L_0x0435:
                r0 = 15
                goto L_0x04d8
            L_0x0439:
                java.lang.String r0 = "A_AC3"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0443
                goto L_0x04d7
            L_0x0443:
                r0 = 14
                goto L_0x04d8
            L_0x0447:
                java.lang.String r0 = "A_AAC"
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0451
                goto L_0x04d7
            L_0x0451:
                r0 = 13
                goto L_0x04d8
            L_0x0455:
                boolean r0 = r2.equals(r4)
                if (r0 != 0) goto L_0x045d
                goto L_0x04d7
            L_0x045d:
                r0 = 12
                goto L_0x04d8
            L_0x0461:
                boolean r0 = r2.equals(r9)
                if (r0 != 0) goto L_0x0469
                goto L_0x04d7
            L_0x0469:
                r0 = 11
                goto L_0x04d8
            L_0x046d:
                boolean r0 = r2.equals(r3)
                if (r0 != 0) goto L_0x0475
                goto L_0x04d7
            L_0x0475:
                r0 = 10
                goto L_0x04d8
            L_0x0479:
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L_0x0481
                goto L_0x04d7
            L_0x0481:
                r0 = 9
                goto L_0x04d8
            L_0x0485:
                boolean r0 = r2.equals(r1)
                if (r0 != 0) goto L_0x048c
                goto L_0x04d7
            L_0x048c:
                r0 = 8
                goto L_0x04d8
            L_0x048f:
                boolean r0 = r2.equals(r11)
                if (r0 != 0) goto L_0x0496
                goto L_0x04d7
            L_0x0496:
                r0 = 7
                goto L_0x04d8
            L_0x0498:
                boolean r0 = r2.equals(r12)
                if (r0 != 0) goto L_0x049f
                goto L_0x04d7
            L_0x049f:
                r0 = 6
                goto L_0x04d8
            L_0x04a1:
                boolean r0 = r2.equals(r13)
                if (r0 != 0) goto L_0x04a8
                goto L_0x04d7
            L_0x04a8:
                r0 = 5
                goto L_0x04d8
            L_0x04aa:
                boolean r0 = r2.equals(r14)
                if (r0 != 0) goto L_0x04b1
                goto L_0x04d7
            L_0x04b1:
                r0 = 4
                goto L_0x04d8
            L_0x04b3:
                boolean r0 = r2.equals(r15)
                if (r0 != 0) goto L_0x04ba
                goto L_0x04d7
            L_0x04ba:
                r0 = 3
                goto L_0x04d8
            L_0x04bc:
                boolean r0 = r2.equals(r6)
                if (r0 != 0) goto L_0x04c3
                goto L_0x04d7
            L_0x04c3:
                r0 = 2
                goto L_0x04d8
            L_0x04c5:
                boolean r0 = r2.equals(r7)
                if (r0 != 0) goto L_0x04cc
                goto L_0x04d7
            L_0x04cc:
                r0 = 1
                goto L_0x04d8
            L_0x04ce:
                boolean r0 = r2.equals(r10)
                if (r0 != 0) goto L_0x04d5
                goto L_0x04d7
            L_0x04d5:
                r0 = 0
                goto L_0x04d8
            L_0x04d7:
                r0 = -1
            L_0x04d8:
                java.lang.String r1 = "text/x-ssa"
                java.lang.String r2 = "application/x-subrip"
                java.lang.String r3 = "video/x-unknown"
                java.lang.String r4 = "audio/x-unknown"
                java.lang.String r6 = "audio/raw"
                switch(r0) {
                    case 0: goto L_0x07ec;
                    case 1: goto L_0x07ec;
                    case 2: goto L_0x0792;
                    case 3: goto L_0x0781;
                    case 4: goto L_0x0701;
                    case 5: goto L_0x06f5;
                    case 6: goto L_0x06f2;
                    case 7: goto L_0x0637;
                    case 8: goto L_0x0621;
                    case 9: goto L_0x07ec;
                    case 10: goto L_0x05fc;
                    case 11: goto L_0x05ef;
                    case 12: goto L_0x05e9;
                    case 13: goto L_0x05c2;
                    case 14: goto L_0x05bf;
                    case 15: goto L_0x05bc;
                    case 16: goto L_0x05b8;
                    case 17: goto L_0x05b4;
                    case 18: goto L_0x05b0;
                    case 19: goto L_0x05ad;
                    case 20: goto L_0x05eb;
                    case 21: goto L_0x05bc;
                    case 22: goto L_0x05a0;
                    case 23: goto L_0x0591;
                    case 24: goto L_0x0588;
                    case 25: goto L_0x056b;
                    case 26: goto L_0x054f;
                    case 27: goto L_0x054c;
                    case 28: goto L_0x0547;
                    case 29: goto L_0x0543;
                    case 30: goto L_0x0535;
                    case 31: goto L_0x04ef;
                    default: goto L_0x04e7;
                }
            L_0x04e7:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Unrecognized codec identifier."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x04ef:
                java.util.ArrayList r15 = new java.util.ArrayList
                r0 = 3
                r15.<init>(r0)
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                r15.add(r0)
                r0 = 8
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r6 = r8.f19828R
                java.nio.ByteBuffer r3 = r3.putLong(r6)
                byte[] r3 = r3.array()
                r15.add(r3)
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
                java.nio.ByteBuffer r0 = r0.order(r4)
                long r3 = r8.f19829S
                java.nio.ByteBuffer r0 = r0.putLong(r3)
                byte[] r0 = r0.array()
                r15.add(r0)
                r0 = 5760(0x1680, float:8.071E-42)
                java.lang.String r3 = "audio/opus"
                r6 = r3
                r3 = r15
            L_0x0532:
                r4 = 0
                goto L_0x06fe
            L_0x0535:
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                java.util.List r15 = java.util.Collections.singletonList(r0)
                java.lang.String r0 = "audio/flac"
                goto L_0x0634
            L_0x0543:
                java.lang.String r3 = "audio/eac3"
                goto L_0x05eb
            L_0x0547:
                java.lang.String r3 = "video/mpeg2"
                goto L_0x05eb
            L_0x054c:
                r3 = r2
                goto L_0x05eb
            L_0x054f:
                ub.r r0 = new ub.r
                java.lang.String r3 = r8.f19837b
                byte[] r3 = r8.mo22271a(r3)
                r0.<init>((byte[]) r3)
                vb.c r0 = p290vb.C6935c.m16357a(r0)
                java.util.List<byte[]> r3 = r0.f21618a
                int r4 = r0.f21619b
                r8.f19835Y = r4
                java.lang.String r0 = r0.f21620c
                java.lang.String r4 = "video/hevc"
                goto L_0x0616
            L_0x056b:
                byte[] r0 = p238ra.C6279d.f19753c0
                java.lang.String r3 = r8.f19837b
                byte[] r3 = r8.mo22271a(r3)
                int r4 = com.google.common.collect.ImmutableList.f36196c
                r4 = 2
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r0
                r0 = 1
                r6[r0] = r3
                ce0.C21100e.m49350l(r6)
                com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.m35690x(r4, r6)
                r0 = r1
                goto L_0x0634
            L_0x0588:
                int r0 = r8.f19826P
                int r0 = p277ub.C6774a0.m15955o(r0)
                if (r0 != 0) goto L_0x05a7
                goto L_0x05ab
            L_0x0591:
                int r0 = r8.f19826P
                r3 = 8
                if (r0 != r3) goto L_0x0599
                r0 = 3
                goto L_0x05a7
            L_0x0599:
                r3 = 16
                if (r0 != r3) goto L_0x05ab
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x05a7
            L_0x05a0:
                int r0 = r8.f19826P
                r3 = 32
                if (r0 != r3) goto L_0x05ab
                r0 = 4
            L_0x05a7:
                r3 = 0
                r15 = 0
                goto L_0x0619
            L_0x05ab:
                r3 = r4
                goto L_0x05eb
            L_0x05ad:
                java.lang.String r3 = "application/pgs"
                goto L_0x05eb
            L_0x05b0:
                java.lang.String r3 = "video/x-vnd.on2.vp9"
                goto L_0x05eb
            L_0x05b4:
                java.lang.String r3 = "video/x-vnd.on2.vp8"
                goto L_0x05eb
            L_0x05b8:
                java.lang.String r3 = "video/av01"
                goto L_0x05eb
            L_0x05bc:
                java.lang.String r3 = "audio/vnd.dts"
                goto L_0x05eb
            L_0x05bf:
                java.lang.String r3 = "audio/ac3"
                goto L_0x05eb
            L_0x05c2:
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                byte[] r3 = r8.f19846k
                ub.q r4 = new ub.q
                int r6 = r3.length
                r4.<init>(r3, r6)
                r3 = 0
                ia.a$a r4 = p125ia.C5311a.m13352c(r4, r3)
                int r3 = r4.f17498a
                r8.f19827Q = r3
                int r3 = r4.f17499b
                r8.f19825O = r3
                java.lang.String r15 = r4.f17500c
                java.lang.String r3 = "audio/mp4a-latm"
                r4 = r3
                r3 = r15
                goto L_0x06e5
            L_0x05e9:
                java.lang.String r3 = "audio/vnd.dts.hd"
            L_0x05eb:
                r0 = r3
                r3 = 0
                goto L_0x06e2
            L_0x05ef:
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.m35688E(r0)
                java.lang.String r0 = "application/vobsub"
                goto L_0x0634
            L_0x05fc:
                ub.r r0 = new ub.r
                java.lang.String r3 = r8.f19837b
                byte[] r3 = r8.mo22271a(r3)
                r0.<init>((byte[]) r3)
                vb.a r0 = p290vb.C6932a.m16352a(r0)
                java.util.List<byte[]> r3 = r0.f21599a
                int r4 = r0.f21600b
                r8.f19835Y = r4
                java.lang.String r0 = r0.f21604f
                java.lang.String r4 = "video/avc"
            L_0x0616:
                r15 = r0
                r6 = r4
                r0 = -1
            L_0x0619:
                r4 = r3
                r9 = r6
                r6 = r15
                r3 = -1
                r7 = 1
                r10 = 3
                goto L_0x0804
            L_0x0621:
                r0 = 4
                byte[] r3 = new byte[r0]
                java.lang.String r4 = r8.f19837b
                byte[] r4 = r8.mo22271a(r4)
                r6 = 0
                java.lang.System.arraycopy(r4, r6, r3, r6, r0)
                com.google.common.collect.ImmutableList r15 = com.google.common.collect.ImmutableList.m35688E(r3)
                java.lang.String r0 = "application/dvbsubs"
            L_0x0634:
                r3 = r15
                goto L_0x06e2
            L_0x0637:
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                int r4 = r0.length
                r6 = 16
                if (r6 > r4) goto L_0x0644
                r4 = 1
                goto L_0x0645
            L_0x0644:
                r4 = 0
            L_0x0645:
                p583jk.C17875h.m44301k(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                byte r4 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r6 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                r9 = 255(0xff, double:1.26E-321)
                long r6 = r6 & r9
                byte r4 = r0[r23]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r11 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r11 = r11 & r9
                r4 = 8
                long r11 = r11 << r4
                long r6 = r6 | r11
                byte r4 = r0[r22]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r11 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r11 = r11 & r9
                r4 = 16
                long r11 = r11 << r4
                long r6 = r6 | r11
                byte r4 = r0[r21]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r11 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                long r9 = r9 & r11
                r4 = 24
                long r9 = r9 << r4
                long r6 = r6 | r9
                r9 = 1482049860(0x58564944, double:7.322299212E-315)
                int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r4 != 0) goto L_0x0677
                android.util.Pair r0 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                java.lang.String r3 = "video/divx"
                r4 = 0
                r0.<init>(r3, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                goto L_0x06d5
            L_0x0677:
                r9 = 859189832(0x33363248, double:4.244961792E-315)
                int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r4 != 0) goto L_0x0688
                android.util.Pair r0 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                java.lang.String r3 = "video/3gpp"
                r4 = 0
                r0.<init>(r3, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                goto L_0x06d5
            L_0x0688:
                r9 = 826496599(0x31435657, double:4.08343576E-315)
                int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r4 != 0) goto L_0x06cf
                r3 = 40
            L_0x0691:
                int r4 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                int r4 = r4 + -4
                if (r3 >= r4) goto L_0x06c7
                byte r4 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                if (r4 != 0) goto L_0x06c2
                int r4 = r3 + 1
                byte r4 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                if (r4 != 0) goto L_0x06c2
                int r4 = r3 + 2
                byte r4 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                r6 = 1
                if (r4 != r6) goto L_0x06c2
                int r4 = r3 + 3
                byte r4 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                r6 = 15
                if (r4 != r6) goto L_0x06c4
                int r4 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                byte[] r0 = java.util.Arrays.copyOfRange(r0, r3, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                android.util.Pair r3 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                java.lang.String r4 = "video/wvc1"
                java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                r3.<init>(r4, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                r0 = r3
                goto L_0x06d5
            L_0x06c2:
                r6 = 15
            L_0x06c4:
                int r3 = r3 + 1
                goto L_0x0691
            L_0x06c7:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
                r0.<init>((java.lang.String) r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06ea }
            L_0x06cf:
                android.util.Pair r0 = new android.util.Pair
                r4 = 0
                r0.<init>(r3, r4)
            L_0x06d5:
                java.lang.Object r3 = r0.first
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r0 = r0.second
                java.util.List r0 = (java.util.List) r0
                r26 = r3
                r3 = r0
                r0 = r26
            L_0x06e2:
                r4 = r0
                r0 = r3
                r3 = 0
            L_0x06e5:
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = -1
                goto L_0x06fe
            L_0x06ea:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Error parsing FourCC private data"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x06f2:
                java.lang.String r0 = "audio/mpeg"
                goto L_0x06f7
            L_0x06f5:
                java.lang.String r0 = "audio/mpeg-L2"
            L_0x06f7:
                r3 = r0
                r0 = 4096(0x1000, float:5.74E-42)
                r6 = r3
                r3 = 0
                goto L_0x0532
            L_0x06fe:
                r10 = 3
                goto L_0x078f
            L_0x0701:
                java.lang.String r0 = r8.f19837b
                byte[] r0 = r8.mo22271a(r0)
                java.lang.String r3 = "Error parsing vorbis codec private"
                r4 = 0
                byte r6 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r4 = 2
                if (r6 != r4) goto L_0x0775
                r4 = 1
                r6 = 0
            L_0x0711:
                byte r7 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r9 = 255(0xff, float:3.57E-43)
                r7 = r7 & r9
                if (r7 != r9) goto L_0x071d
                int r6 = r6 + 255
                int r4 = r4 + 1
                goto L_0x0711
            L_0x071d:
                r10 = 1
                int r4 = r4 + r10
                int r6 = r6 + r7
                r7 = 0
            L_0x0721:
                byte r10 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r10 = r10 & r9
                if (r10 != r9) goto L_0x072b
                int r7 = r7 + 255
                int r4 = r4 + 1
                goto L_0x0721
            L_0x072b:
                r11 = 1
                int r4 = r4 + r11
                int r7 = r7 + r10
                byte r9 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                if (r9 != r11) goto L_0x076f
                byte[] r9 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r10 = 0
                java.lang.System.arraycopy(r0, r4, r9, r10, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                int r4 = r4 + r6
                byte r6 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r10 = 3
                if (r6 != r10) goto L_0x0769
                int r4 = r4 + r7
                byte r6 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r7 = 5
                if (r6 != r7) goto L_0x0763
                int r6 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                int r6 = r6 - r4
                byte[] r6 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                int r7 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                int r7 = r7 - r4
                r11 = 0
                java.lang.System.arraycopy(r0, r4, r6, r11, r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r4 = 2
                r0.<init>(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.add(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.add(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r3 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r4 = "audio/vorbis"
                r3 = r0
                r6 = r4
                r0 = 8192(0x2000, float:1.14794E-41)
                goto L_0x078e
            L_0x0763:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.<init>((java.lang.String) r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
            L_0x0769:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.<init>((java.lang.String) r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
            L_0x076f:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.<init>((java.lang.String) r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
            L_0x0775:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                r0.<init>((java.lang.String) r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x077b }
            L_0x077b:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                r0.<init>((java.lang.String) r3)
                throw r0
            L_0x0781:
                r10 = 3
                ra.d$c r0 = new ra.d$c
                r0.<init>()
                r8.f19830T = r0
                java.lang.String r0 = "audio/true-hd"
                r6 = r0
                r0 = -1
                r3 = 0
            L_0x078e:
                r4 = 0
            L_0x078f:
                r7 = 1
                goto L_0x07ff
            L_0x0792:
                r10 = 3
                ub.r r0 = new ub.r
                java.lang.String r3 = r8.f19837b
                byte[] r3 = r8.mo22271a(r3)
                r0.<init>((byte[]) r3)
                int r3 = r0.mo22990i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                r7 = 1
                if (r3 != r7) goto L_0x07a6
                goto L_0x07ca
            L_0x07a6:
                r9 = 65534(0xfffe, float:9.1833E-41)
                if (r3 != r9) goto L_0x07cc
                r3 = 24
                r0.mo23007z(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                long r11 = r0.mo22991j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                java.util.UUID r3 = p238ra.C6279d.f19755e0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                long r13 = r3.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r9 != 0) goto L_0x07cc
                long r11 = r0.mo22991j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                long r13 = r3.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07e4 }
                int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r0 != 0) goto L_0x07cc
            L_0x07ca:
                r0 = 1
                goto L_0x07cd
            L_0x07cc:
                r0 = 0
            L_0x07cd:
                if (r0 == 0) goto L_0x07dd
                int r0 = r8.f19826P
                int r0 = p277ub.C6774a0.m15955o(r0)
                if (r0 != 0) goto L_0x07d8
                goto L_0x07e2
            L_0x07d8:
                r9 = r6
                r3 = -1
                r4 = 0
                r6 = 0
                goto L_0x0804
            L_0x07dd:
                java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r0.concat(r4)
            L_0x07e2:
                r0 = 0
                goto L_0x07fb
            L_0x07e4:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Error parsing MS/ACM codec private"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x07ec:
                r7 = 1
                r10 = 3
                byte[] r0 = r8.f19846k
                if (r0 != 0) goto L_0x07f4
                r0 = 0
                goto L_0x07f8
            L_0x07f4:
                java.util.List r0 = java.util.Collections.singletonList(r0)
            L_0x07f8:
                java.lang.String r4 = "video/mp4v-es"
            L_0x07fb:
                r3 = r0
                r6 = r4
                r0 = -1
                r4 = 0
            L_0x07ff:
                r9 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = -1
            L_0x0804:
                byte[] r11 = r8.f19824N
                if (r11 == 0) goto L_0x0818
                ub.r r12 = new ub.r
                r12.<init>((byte[]) r11)
                b0.b r11 = p019b0.C1425b.m3809e(r12)
                if (r11 == 0) goto L_0x0818
                java.lang.String r6 = r11.f5271b
                java.lang.String r9 = "video/dolby-vision"
            L_0x0818:
                boolean r11 = r8.f19832V
                r12 = 0
                r11 = r11 | r12
                boolean r12 = r8.f19831U
                if (r12 == 0) goto L_0x0822
                r12 = 2
                goto L_0x0823
            L_0x0822:
                r12 = 0
            L_0x0823:
                r11 = r11 | r12
                com.google.android.exoplayer2.Format$b r12 = new com.google.android.exoplayer2.Format$b
                r12.<init>()
                boolean r13 = p277ub.C6792n.m15995h(r9)
                if (r13 == 0) goto L_0x083b
                int r1 = r8.f19825O
                r12.f13459x = r1
                int r1 = r8.f19827Q
                r12.f13460y = r1
                r12.f13461z = r0
                goto L_0x09f1
            L_0x083b:
                boolean r0 = p277ub.C6792n.m15997j(r9)
                if (r0 == 0) goto L_0x09c3
                int r0 = r8.f19852q
                if (r0 != 0) goto L_0x0857
                int r0 = r8.f19850o
                r1 = -1
                if (r0 != r1) goto L_0x084c
                int r0 = r8.f19848m
            L_0x084c:
                r8.f19850o = r0
                int r0 = r8.f19851p
                if (r0 != r1) goto L_0x0854
                int r0 = r8.f19849n
            L_0x0854:
                r8.f19851p = r0
                goto L_0x0858
            L_0x0857:
                r1 = -1
            L_0x0858:
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = r8.f19850o
                if (r2 == r1) goto L_0x086d
                int r7 = r8.f19851p
                if (r7 == r1) goto L_0x086d
                int r0 = r8.f19849n
                int r0 = r0 * r2
                float r0 = (float) r0
                int r2 = r8.f19848m
                int r2 = r2 * r7
                float r2 = (float) r2
                float r0 = r0 / r2
            L_0x086d:
                boolean r2 = r8.f19859x
                if (r2 == 0) goto L_0x0942
                float r2 = r8.f19814D
                r7 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19815E
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19816F
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19817G
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19818H
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19819I
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19820J
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19821K
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19822L
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 == 0) goto L_0x0935
                float r2 = r8.f19823M
                int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r2 != 0) goto L_0x08b1
                goto L_0x0935
            L_0x08b1:
                r2 = 25
                byte[] r2 = new byte[r2]
                java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r2)
                java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r7 = r7.order(r10)
                r10 = 0
                r7.put(r10)
                float r10 = r8.f19814D
                r13 = 1195593728(0x47435000, float:50000.0)
                float r10 = r10 * r13
                r14 = 1056964608(0x3f000000, float:0.5)
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19815E
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19816F
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19817G
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19818H
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19819I
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19820J
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19821K
                float r10 = r10 * r13
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19822L
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                float r10 = r8.f19823M
                float r10 = r10 + r14
                int r10 = (int) r10
                short r10 = (short) r10
                r7.putShort(r10)
                int r10 = r8.f19812B
                short r10 = (short) r10
                r7.putShort(r10)
                int r10 = r8.f19813C
                short r10 = (short) r10
                r7.putShort(r10)
                goto L_0x0936
            L_0x0935:
                r2 = 0
            L_0x0936:
                com.google.android.exoplayer2.video.ColorInfo r7 = new com.google.android.exoplayer2.video.ColorInfo
                int r10 = r8.f19860y
                int r13 = r8.f19811A
                int r14 = r8.f19861z
                r7.<init>(r10, r13, r14, r2)
                goto L_0x0943
            L_0x0942:
                r7 = 0
            L_0x0943:
                java.lang.String r2 = r8.f19836a
                if (r2 == 0) goto L_0x095b
                java.util.Map<java.lang.String, java.lang.Integer> r10 = p238ra.C6279d.f19756f0
                boolean r2 = r10.containsKey(r2)
                if (r2 == 0) goto L_0x095b
                java.lang.String r1 = r8.f19836a
                java.lang.Object r1 = r10.get(r1)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
            L_0x095b:
                int r2 = r8.f19853r
                if (r2 != 0) goto L_0x09ab
                float r2 = r8.f19854s
                r10 = 0
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x09ab
                float r2 = r8.f19855t
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x09ab
                float r2 = r8.f19856u
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x097a
                r1 = 0
                goto L_0x09ab
            L_0x097a:
                float r2 = r8.f19855t
                r10 = 1119092736(0x42b40000, float:90.0)
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x0987
                r1 = 90
                goto L_0x09ab
            L_0x0987:
                float r2 = r8.f19855t
                r10 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 == 0) goto L_0x09a9
                float r2 = r8.f19855t
                r10 = 1127481344(0x43340000, float:180.0)
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x099c
                goto L_0x09a9
            L_0x099c:
                float r2 = r8.f19855t
                r10 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r2 = java.lang.Float.compare(r2, r10)
                if (r2 != 0) goto L_0x09ab
                r1 = 270(0x10e, float:3.78E-43)
                goto L_0x09ab
            L_0x09a9:
                r1 = 180(0xb4, float:2.52E-43)
            L_0x09ab:
                int r2 = r8.f19848m
                r12.f13451p = r2
                int r2 = r8.f19849n
                r12.f13452q = r2
                r12.f13455t = r0
                r12.f13454s = r1
                byte[] r0 = r8.f19857v
                r12.f13456u = r0
                int r0 = r8.f19858w
                r12.f13457v = r0
                r12.f13458w = r7
                r7 = 2
                goto L_0x09f1
            L_0x09c3:
                boolean r0 = r2.equals(r9)
                if (r0 != 0) goto L_0x09f0
                boolean r0 = r1.equals(r9)
                if (r0 != 0) goto L_0x09f0
                java.lang.String r0 = "application/vobsub"
                boolean r0 = r0.equals(r9)
                if (r0 != 0) goto L_0x09f0
                java.lang.String r0 = "application/pgs"
                boolean r0 = r0.equals(r9)
                if (r0 != 0) goto L_0x09f0
                java.lang.String r0 = "application/dvbsubs"
                boolean r0 = r0.equals(r9)
                if (r0 == 0) goto L_0x09e8
                goto L_0x09f0
            L_0x09e8:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Unexpected MIME type."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x09f0:
                r7 = 3
            L_0x09f1:
                java.lang.String r0 = r8.f19836a
                if (r0 == 0) goto L_0x0a01
                java.util.Map<java.lang.String, java.lang.Integer> r1 = p238ra.C6279d.f19756f0
                boolean r0 = r1.containsKey(r0)
                if (r0 != 0) goto L_0x0a01
                java.lang.String r0 = r8.f19836a
                r12.f13437b = r0
            L_0x0a01:
                r12.mo15807b(r5)
                r12.f13446k = r9
                r12.f13447l = r3
                java.lang.String r0 = r8.f19833W
                r12.f13438c = r0
                r12.f13439d = r11
                r12.f13448m = r4
                r12.f13443h = r6
                com.google.android.exoplayer2.drm.DrmInitData r0 = r8.f19847l
                r12.f13449n = r0
                com.google.android.exoplayer2.Format r0 = new com.google.android.exoplayer2.Format
                r0.<init>((com.google.android.exoplayer2.Format.C3872b) r12)
                int r1 = r8.f19838c
                r2 = r24
                ma.v r1 = r2.mo20709p(r1, r7)
                r8.f19834X = r1
                r1.mo20632c(r0)
                r0 = r19
                android.util.SparseArray<ra.d$b> r1 = r0.f19786c
                int r2 = r8.f19838c
                r1.put(r2, r8)
                goto L_0x0a34
            L_0x0a32:
                r0 = r20
            L_0x0a34:
                r1 = 0
                r0.f19804u = r1
                goto L_0x0a93
            L_0x0a38:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "CodecId is missing in TrackEntry element"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0a40:
                r0 = r8
                int r1 = r0.f19763G
                r2 = 2
                if (r1 == r2) goto L_0x0a47
                goto L_0x0a93
            L_0x0a47:
                r1 = 0
                r7 = 0
            L_0x0a49:
                int r2 = r0.f19767K
                if (r7 >= r2) goto L_0x0a55
                int[] r2 = r0.f19768L
                r2 = r2[r7]
                int r1 = r1 + r2
                int r7 = r7 + 1
                goto L_0x0a49
            L_0x0a55:
                android.util.SparseArray<ra.d$b> r2 = r0.f19786c
                int r3 = r0.f19769M
                java.lang.Object r2 = r2.get(r3)
                r8 = r2
                ra.d$b r8 = (p238ra.C6279d.C6281b) r8
                ma.v r2 = r8.f19834X
                r2.getClass()
                r9 = 0
            L_0x0a66:
                int r2 = r0.f19767K
                if (r9 >= r2) goto L_0x0a90
                long r2 = r0.f19764H
                int r4 = r8.f19840e
                int r4 = r4 * r9
                int r4 = r4 / 1000
                long r4 = (long) r4
                long r3 = r4 + r2
                int r2 = r0.f19771O
                if (r9 != 0) goto L_0x0a7f
                boolean r5 = r0.f19773Q
                if (r5 != 0) goto L_0x0a7f
                r2 = r2 | 1
            L_0x0a7f:
                r5 = r2
                int[] r2 = r0.f19768L
                r6 = r2[r9]
                int r10 = r1 - r6
                r1 = r0
                r2 = r8
                r7 = r10
                r1.mo22264e(r2, r3, r5, r6, r7)
                int r9 = r9 + 1
                r1 = r10
                goto L_0x0a66
            L_0x0a90:
                r1 = 0
                r0.f19763G = r1
            L_0x0a93:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p238ra.C6279d.C6280a.mo22270a(int):void");
        }
    }

    /* renamed from: ra.d$b */
    public static final class C6281b {

        /* renamed from: A */
        public int f19811A = -1;

        /* renamed from: B */
        public int f19812B = 1000;

        /* renamed from: C */
        public int f19813C = 200;

        /* renamed from: D */
        public float f19814D = -1.0f;

        /* renamed from: E */
        public float f19815E = -1.0f;

        /* renamed from: F */
        public float f19816F = -1.0f;

        /* renamed from: G */
        public float f19817G = -1.0f;

        /* renamed from: H */
        public float f19818H = -1.0f;

        /* renamed from: I */
        public float f19819I = -1.0f;

        /* renamed from: J */
        public float f19820J = -1.0f;

        /* renamed from: K */
        public float f19821K = -1.0f;

        /* renamed from: L */
        public float f19822L = -1.0f;

        /* renamed from: M */
        public float f19823M = -1.0f;

        /* renamed from: N */
        public byte[] f19824N;

        /* renamed from: O */
        public int f19825O = 1;

        /* renamed from: P */
        public int f19826P = -1;

        /* renamed from: Q */
        public int f19827Q = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;

        /* renamed from: R */
        public long f19828R = 0;

        /* renamed from: S */
        public long f19829S = 0;

        /* renamed from: T */
        public C6282c f19830T;

        /* renamed from: U */
        public boolean f19831U;

        /* renamed from: V */
        public boolean f19832V = true;

        /* renamed from: W */
        public String f19833W = "eng";

        /* renamed from: X */
        public C5754v f19834X;

        /* renamed from: Y */
        public int f19835Y;

        /* renamed from: a */
        public String f19836a;

        /* renamed from: b */
        public String f19837b;

        /* renamed from: c */
        public int f19838c;

        /* renamed from: d */
        public int f19839d;

        /* renamed from: e */
        public int f19840e;

        /* renamed from: f */
        public int f19841f;

        /* renamed from: g */
        public int f19842g;

        /* renamed from: h */
        public boolean f19843h;

        /* renamed from: i */
        public byte[] f19844i;

        /* renamed from: j */
        public C5754v.C5755a f19845j;

        /* renamed from: k */
        public byte[] f19846k;

        /* renamed from: l */
        public DrmInitData f19847l;

        /* renamed from: m */
        public int f19848m = -1;

        /* renamed from: n */
        public int f19849n = -1;

        /* renamed from: o */
        public int f19850o = -1;

        /* renamed from: p */
        public int f19851p = -1;

        /* renamed from: q */
        public int f19852q = 0;

        /* renamed from: r */
        public int f19853r = -1;

        /* renamed from: s */
        public float f19854s = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: t */
        public float f19855t = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: u */
        public float f19856u = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: v */
        public byte[] f19857v = null;

        /* renamed from: w */
        public int f19858w = -1;

        /* renamed from: x */
        public boolean f19859x = false;

        /* renamed from: y */
        public int f19860y = -1;

        /* renamed from: z */
        public int f19861z = -1;

        /* renamed from: a */
        public final byte[] mo22271a(String str) throws ParserException {
            String str2;
            byte[] bArr = this.f19846k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Missing CodecPrivate for codec ".concat(valueOf);
            } else {
                str2 = new String("Missing CodecPrivate for codec ");
            }
            throw new ParserException(str2);
        }
    }

    /* renamed from: ra.d$c */
    public static final class C6282c {

        /* renamed from: a */
        public final byte[] f19862a = new byte[10];

        /* renamed from: b */
        public boolean f19863b;

        /* renamed from: c */
        public int f19864c;

        /* renamed from: d */
        public long f19865d;

        /* renamed from: e */
        public int f19866e;

        /* renamed from: f */
        public int f19867f;

        /* renamed from: g */
        public int f19868g;
    }

    static {
        HashMap hashMap = new HashMap();
        C13715c.m34248n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f19756f0 = Collections.unmodifiableMap(hashMap);
    }

    public C6279d() {
        C6275a aVar = new C6275a();
        this.f19783a = aVar;
        aVar.f19746d = new C6280a();
        this.f19787d = true;
        this.f19785b = new C6284f();
        this.f19786c = new SparseArray<>();
        this.f19790g = new C6803r(4);
        this.f19791h = new C6803r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f19792i = new C6803r(4);
        this.f19788e = new C6803r(C6795o.f21007a);
        this.f19789f = new C6803r(4);
        this.f19793j = new C6803r();
        this.f19794k = new C6803r();
        this.f19795l = new C6803r(8);
        this.f19796m = new C6803r();
        this.f19797n = new C6803r();
        this.f19768L = new int[1];
    }

    /* renamed from: f */
    public static byte[] m14865f(long j, String str, long j2) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        int i4 = (int) ((j4 - (((long) i3) * 1000000)) / j2);
        return C6774a0.m15961u(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f19758B = -9223372036854775807L;
        this.f19763G = 0;
        C6275a aVar = (C6275a) this.f19783a;
        aVar.f19747e = 0;
        aVar.f19744b.clear();
        C6284f fVar = aVar.f19745c;
        fVar.f19873b = 0;
        fVar.f19874c = 0;
        C6284f fVar2 = this.f19785b;
        fVar2.f19873b = 0;
        fVar2.f19874c = 0;
        mo22266j();
        for (int i = 0; i < this.f19786c.size(); i++) {
            C6282c cVar = this.f19786c.valueAt(i).f19830T;
            if (cVar != null) {
                cVar.f19863b = false;
                cVar.f19864c = 0;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        long a;
        int i;
        C6283e eVar = new C6283e();
        C5732e eVar2 = (C5732e) iVar;
        long j = eVar2.f18590c;
        long j2 = 1024;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        eVar2.mo21583j(0, 4, eVar.f19869a.f21038a, false);
        eVar.f19870b = 4;
        for (long q = eVar.f19869a.mo22998q(); q != 440786851; q = ((q << 8) & -256) | ((long) (eVar.f19869a.f21038a[0] & 255))) {
            int i4 = eVar.f19870b + 1;
            eVar.f19870b = i4;
            if (i4 == i3) {
                return false;
            }
            eVar2.mo21583j(0, 1, eVar.f19869a.f21038a, false);
        }
        long a2 = eVar.mo22272a(eVar2);
        long j3 = (long) eVar.f19870b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + a2 >= j) {
            return false;
        }
        while (true) {
            int i5 = (((long) eVar.f19870b) > (j3 + a2) ? 1 : (((long) eVar.f19870b) == (j3 + a2) ? 0 : -1));
            if (i5 < 0) {
                if (eVar.mo22272a(eVar2) == Long.MIN_VALUE || a < 0 || a > 2147483647L) {
                    return false;
                }
                if (i != 0) {
                    int a3 = (int) (a = eVar.mo22272a(eVar2));
                    eVar2.mo21584k(a3, false);
                    eVar.f19870b += a3;
                }
            } else if (i5 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: c */
    public final void mo22262c(int i) throws ParserException {
        if (this.f19759C == null || this.f19760D == null) {
            throw new ParserException(C13715c.m34242h(37, "Element ", i, " must be in a Cues"));
        }
    }

    /* renamed from: d */
    public final void mo22263d(int i) throws ParserException {
        if (this.f19804u == null) {
            throw new ParserException(C13715c.m34242h(43, "Element ", i, " must be in a TrackEntry"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22264e(p238ra.C6279d.C6281b r16, long r17, int r19, int r20, int r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r19
            ra.d$c r3 = r1.f19830T
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0042
            boolean r6 = r3.f19863b
            if (r6 != 0) goto L_0x0011
            goto L_0x00ec
        L_0x0011:
            int r6 = r3.f19864c
            int r7 = r6 + 1
            r3.f19864c = r7
            if (r6 != 0) goto L_0x0021
            r9 = r17
            r3.f19865d = r9
            r3.f19866e = r2
            r3.f19867f = r4
        L_0x0021:
            int r2 = r3.f19867f
            int r12 = r2 + r20
            r3.f19867f = r12
            r6 = r21
            r3.f19868g = r6
            r2 = 16
            if (r7 < r2) goto L_0x00ec
            if (r7 <= 0) goto L_0x00ec
            ma.v r8 = r1.f19834X
            long r9 = r3.f19865d
            int r11 = r3.f19866e
            ma.v$a r14 = r1.f19845j
            r13 = r21
            r8.mo20633d(r9, r11, r12, r13, r14)
            r3.f19864c = r4
            goto L_0x00ec
        L_0x0042:
            r9 = r17
            r6 = r21
            java.lang.String r3 = r1.f19837b
            java.lang.String r7 = "S_TEXT/UTF8"
            boolean r3 = r7.equals(r3)
            java.lang.String r8 = "S_TEXT/ASS"
            if (r3 != 0) goto L_0x005a
            java.lang.String r3 = r1.f19837b
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x006a
        L_0x005a:
            int r3 = r0.f19767K
            if (r3 <= r5) goto L_0x005f
            goto L_0x006a
        L_0x005f:
            long r11 = r0.f19765I
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
        L_0x006a:
            r3 = r20
            goto L_0x00c7
        L_0x006d:
            java.lang.String r3 = r1.f19837b
            ub.r r13 = r0.f19794k
            byte[] r13 = r13.f21038a
            r3.getClass()
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x0093
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x008d
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = m14865f(r11, r3, r7)
            r7 = 19
            goto L_0x009d
        L_0x008d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0093:
            r7 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            byte[] r3 = m14865f(r11, r3, r7)
            r7 = 21
        L_0x009d:
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r4, r13, r7, r8)
            ub.r r3 = r0.f19794k
            int r3 = r3.f21039b
        L_0x00a5:
            ub.r r4 = r0.f19794k
            int r7 = r4.f21040c
            if (r3 >= r7) goto L_0x00b8
            byte[] r7 = r4.f21038a
            byte r7 = r7[r3]
            if (r7 != 0) goto L_0x00b5
            r4.mo23006y(r3)
            goto L_0x00b8
        L_0x00b5:
            int r3 = r3 + 1
            goto L_0x00a5
        L_0x00b8:
            ma.v r3 = r1.f19834X
            ub.r r4 = r0.f19794k
            int r7 = r4.f21040c
            r3.mo20631b(r7, r4)
            ub.r r3 = r0.f19794k
            int r3 = r3.f21040c
            int r3 = r20 + r3
        L_0x00c7:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x00df
            int r4 = r0.f19767K
            if (r4 <= r5) goto L_0x00d5
            r4 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r2 = r2 & r4
            goto L_0x00df
        L_0x00d5:
            ub.r r4 = r0.f19797n
            int r7 = r4.f21040c
            ma.v r8 = r1.f19834X
            r8.mo20634e(r4, r7)
            int r3 = r3 + r7
        L_0x00df:
            r11 = r2
            r12 = r3
            ma.v r8 = r1.f19834X
            ma.v$a r14 = r1.f19845j
            r9 = r17
            r13 = r21
            r8.mo20633d(r9, r11, r12, r13, r14)
        L_0x00ec:
            r0.f19762F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238ra.C6279d.mo22264e(ra.d$b, long, int, int, int):void");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f19784a0 = jVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [int, byte, boolean] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r2v90 */
    /* JADX WARNING: type inference failed for: r2v94 */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a9, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x088a, code lost:
        if (r3 != 7) goto L_0x08d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x0a30, code lost:
        if (r4 != false) goto L_0x0a67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0a32, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0a39, code lost:
        if (r0 >= r2.f19786c.size()) goto L_0x0a65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0a3b, code lost:
        r1 = r2.f19786c.valueAt(r0);
        r1.f19834X.getClass();
        r3 = r1.f19830T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0a4a, code lost:
        if (r3 == null) goto L_0x0a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0a4e, code lost:
        if (r3.f19864c <= 0) goto L_0x0a62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0a50, code lost:
        r1.f19834X.mo20633d(r3.f19865d, r3.f19866e, r3.f19867f, r3.f19868g, r1.f19845j);
        r3.f19864c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0a62, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0a65, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0a67, code lost:
        return 0;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0a0c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0a12 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r27, p173ma.C5749s r28) throws java.io.IOException {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            r2 = 0
            r0.f19762F = r2
            r3 = 1
            r4 = 1
        L_0x0009:
            r5 = -1
            if (r4 == 0) goto L_0x0a2f
            boolean r6 = r0.f19762F
            if (r6 != 0) goto L_0x0a2f
            ra.c r4 = r0.f19783a
            r6 = r4
            ra.a r6 = (p238ra.C6275a) r6
            ra.b r4 = r6.f19746d
            p583jk.C17875h.m44306q(r4)
        L_0x001a:
            java.util.ArrayDeque<ra.a$a> r4 = r6.f19744b
            java.lang.Object r4 = r4.peek()
            ra.a$a r4 = (p238ra.C6275a.C6276a) r4
            if (r4 == 0) goto L_0x0043
            r7 = r27
            ma.e r7 = (p173ma.C5732e) r7
            long r7 = r7.f18591d
            long r9 = r4.f19751b
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L_0x0043
            ra.b r2 = r6.f19746d
            java.util.ArrayDeque<ra.a$a> r3 = r6.f19744b
            java.lang.Object r3 = r3.pop()
            ra.a$a r3 = (p238ra.C6275a.C6276a) r3
            int r3 = r3.f19750a
            ra.d$a r2 = (p238ra.C6279d.C6280a) r2
            r2.mo22270a(r3)
            goto L_0x09d9
        L_0x0043:
            int r4 = r6.f19747e
            r7 = 0
            r9 = 8
            r10 = 4
            if (r4 != 0) goto L_0x00c6
            ra.f r4 = r6.f19745c
            r11 = r27
            ma.e r11 = (p173ma.C5732e) r11
            long r12 = r4.mo22273b(r11, r3, r2, r10)
            r14 = -2
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00b7
            r11.f18593f = r2
        L_0x005e:
            byte[] r4 = r6.f19743a
            r11.mo21583j(r2, r10, r4, r2)
            byte[] r4 = r6.f19743a
            byte r4 = r4[r2]
            r12 = 0
        L_0x0068:
            long[] r13 = p238ra.C6284f.f19871d
            if (r12 >= r9) goto L_0x007b
            r14 = r13[r12]
            long r9 = (long) r4
            long r9 = r9 & r14
            int r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            int r12 = r12 + 1
            if (r13 == 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r9 = 8
            r10 = 4
            goto L_0x0068
        L_0x007b:
            r12 = -1
        L_0x007c:
            if (r12 == r5) goto L_0x00b0
            r4 = 4
            if (r12 > r4) goto L_0x00b0
            byte[] r4 = r6.f19743a
            long r9 = p238ra.C6284f.m14881a(r4, r12, r2)
            int r4 = (int) r9
            ra.b r9 = r6.f19746d
            ra.d$a r9 = (p238ra.C6279d.C6280a) r9
            ra.d r9 = p238ra.C6279d.this
            r9.getClass()
            r9 = 357149030(0x1549a966, float:4.072526E-26)
            if (r4 == r9) goto L_0x00a8
            r9 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r4 == r9) goto L_0x00a8
            r9 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r4 == r9) goto L_0x00a8
            r9 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r4 != r9) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r9 = 0
            goto L_0x00a9
        L_0x00a8:
            r9 = 1
        L_0x00a9:
            if (r9 == 0) goto L_0x00b0
            r11.mo21582i(r12)
            long r12 = (long) r4
            goto L_0x00b7
        L_0x00b0:
            r11.mo21582i(r3)
            r9 = 8
            r10 = 4
            goto L_0x005e
        L_0x00b7:
            r4 = -1
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00c1
            r2 = 0
            r4 = 0
            goto L_0x09db
        L_0x00c1:
            int r4 = (int) r12
            r6.f19748f = r4
            r6.f19747e = r3
        L_0x00c6:
            int r4 = r6.f19747e
            r5 = 2
            if (r4 != r3) goto L_0x00dc
            ra.f r4 = r6.f19745c
            r7 = r27
            ma.e r7 = (p173ma.C5732e) r7
            r8 = 8
            long r9 = r4.mo22273b(r7, r2, r3, r8)
            r6.f19749g = r9
            r6.f19747e = r5
            goto L_0x00de
        L_0x00dc:
            r8 = 8
        L_0x00de:
            ra.b r4 = r6.f19746d
            int r7 = r6.f19748f
            ra.d$a r4 = (p238ra.C6279d.C6280a) r4
            ra.d r4 = p238ra.C6279d.this
            r4.getClass()
            r4 = 5
            r9 = 3
            switch(r7) {
                case 131: goto L_0x00f8;
                case 134: goto L_0x00f6;
                case 136: goto L_0x00f8;
                case 155: goto L_0x00f8;
                case 159: goto L_0x00f8;
                case 160: goto L_0x00f4;
                case 161: goto L_0x00f2;
                case 163: goto L_0x00f2;
                case 165: goto L_0x00f2;
                case 166: goto L_0x00f4;
                case 174: goto L_0x00f4;
                case 176: goto L_0x00f8;
                case 179: goto L_0x00f8;
                case 181: goto L_0x00f0;
                case 183: goto L_0x00f4;
                case 186: goto L_0x00f8;
                case 187: goto L_0x00f4;
                case 215: goto L_0x00f8;
                case 224: goto L_0x00f4;
                case 225: goto L_0x00f4;
                case 231: goto L_0x00f8;
                case 238: goto L_0x00f8;
                case 241: goto L_0x00f8;
                case 251: goto L_0x00f8;
                case 16868: goto L_0x00f4;
                case 16871: goto L_0x00f8;
                case 16877: goto L_0x00f2;
                case 16980: goto L_0x00f8;
                case 16981: goto L_0x00f2;
                case 17026: goto L_0x00f6;
                case 17029: goto L_0x00f8;
                case 17143: goto L_0x00f8;
                case 17545: goto L_0x00f0;
                case 18401: goto L_0x00f8;
                case 18402: goto L_0x00f2;
                case 18407: goto L_0x00f4;
                case 18408: goto L_0x00f8;
                case 19899: goto L_0x00f4;
                case 20529: goto L_0x00f8;
                case 20530: goto L_0x00f8;
                case 20532: goto L_0x00f4;
                case 20533: goto L_0x00f4;
                case 21358: goto L_0x00f6;
                case 21419: goto L_0x00f2;
                case 21420: goto L_0x00f8;
                case 21432: goto L_0x00f8;
                case 21680: goto L_0x00f8;
                case 21682: goto L_0x00f8;
                case 21690: goto L_0x00f8;
                case 21930: goto L_0x00f8;
                case 21936: goto L_0x00f4;
                case 21945: goto L_0x00f8;
                case 21946: goto L_0x00f8;
                case 21947: goto L_0x00f8;
                case 21948: goto L_0x00f8;
                case 21949: goto L_0x00f8;
                case 21968: goto L_0x00f4;
                case 21969: goto L_0x00f0;
                case 21970: goto L_0x00f0;
                case 21971: goto L_0x00f0;
                case 21972: goto L_0x00f0;
                case 21973: goto L_0x00f0;
                case 21974: goto L_0x00f0;
                case 21975: goto L_0x00f0;
                case 21976: goto L_0x00f0;
                case 21977: goto L_0x00f0;
                case 21978: goto L_0x00f0;
                case 21998: goto L_0x00f8;
                case 22186: goto L_0x00f8;
                case 22203: goto L_0x00f8;
                case 25152: goto L_0x00f4;
                case 25188: goto L_0x00f8;
                case 25506: goto L_0x00f2;
                case 28032: goto L_0x00f4;
                case 30113: goto L_0x00f4;
                case 30320: goto L_0x00f4;
                case 30321: goto L_0x00f8;
                case 30322: goto L_0x00f2;
                case 30323: goto L_0x00f0;
                case 30324: goto L_0x00f0;
                case 30325: goto L_0x00f0;
                case 2274716: goto L_0x00f6;
                case 2352003: goto L_0x00f8;
                case 2807729: goto L_0x00f8;
                case 290298740: goto L_0x00f4;
                case 357149030: goto L_0x00f4;
                case 374648427: goto L_0x00f4;
                case 408125543: goto L_0x00f4;
                case 440786851: goto L_0x00f4;
                case 475249515: goto L_0x00f4;
                case 524531317: goto L_0x00f4;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r7 = 0
            goto L_0x00f9
        L_0x00f0:
            r7 = 5
            goto L_0x00f9
        L_0x00f2:
            r7 = 4
            goto L_0x00f9
        L_0x00f4:
            r7 = 1
            goto L_0x00f9
        L_0x00f6:
            r7 = 3
            goto L_0x00f9
        L_0x00f8:
            r7 = 2
        L_0x00f9:
            if (r7 == 0) goto L_0x0a19
            if (r7 == r3) goto L_0x0913
            java.lang.String r10 = " not supported"
            r11 = 8
            r15 = 255(0xff, float:3.57E-43)
            if (r7 == r5) goto L_0x05fc
            r17 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r7 == r9) goto L_0x055d
            r8 = 4
            if (r7 == r8) goto L_0x0216
            if (r7 != r4) goto L_0x0208
            long r3 = r6.f19749g
            r7 = 4
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0137
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x011c
            goto L_0x0137
        L_0x011c:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            long r2 = r6.f19749g
            r4 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Invalid float size: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0137:
            ra.b r5 = r6.f19746d
            int r7 = r6.f19748f
            int r4 = (int) r3
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            byte[] r8 = r6.f19743a
            r3.mo21581h(r2, r4, r8, r2)
            r3 = 0
            r8 = 0
        L_0x0148:
            r16 = 8
            if (r3 >= r4) goto L_0x015a
            long r8 = r8 << r16
            byte[] r10 = r6.f19743a
            byte r10 = r10[r3]
            r10 = r10 & r15
            long r10 = (long) r10
            long r8 = r8 | r10
            int r3 = r3 + 1
            r15 = 255(0xff, float:3.57E-43)
            goto L_0x0148
        L_0x015a:
            r3 = 4
            if (r4 != r3) goto L_0x0164
            int r3 = (int) r8
            float r3 = java.lang.Float.intBitsToFloat(r3)
            double r3 = (double) r3
            goto L_0x0168
        L_0x0164:
            double r3 = java.lang.Double.longBitsToDouble(r8)
        L_0x0168:
            ra.d$a r5 = (p238ra.C6279d.C6280a) r5
            ra.d r5 = p238ra.C6279d.this
            r8 = 181(0xb5, float:2.54E-43)
            if (r7 == r8) goto L_0x01fc
            r8 = 17545(0x4489, float:2.4586E-41)
            if (r7 == r8) goto L_0x01f8
            switch(r7) {
                case 21969: goto L_0x01d0;
                case 21970: goto L_0x01c7;
                case 21971: goto L_0x01be;
                case 21972: goto L_0x01b5;
                case 21973: goto L_0x01ac;
                case 21974: goto L_0x01a3;
                case 21975: goto L_0x019a;
                case 21976: goto L_0x0190;
                case 21977: goto L_0x0186;
                case 21978: goto L_0x017c;
                default: goto L_0x0177;
            }
        L_0x0177:
            switch(r7) {
                case 30323: goto L_0x01eb;
                case 30324: goto L_0x01e2;
                case 30325: goto L_0x01d9;
                default: goto L_0x017a;
            }
        L_0x017a:
            goto L_0x01f4
        L_0x017c:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19823M = r3
            goto L_0x0204
        L_0x0186:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19822L = r3
            goto L_0x0204
        L_0x0190:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19821K = r3
            goto L_0x0204
        L_0x019a:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19820J = r3
            goto L_0x0204
        L_0x01a3:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19819I = r3
            goto L_0x0204
        L_0x01ac:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19818H = r3
            goto L_0x0204
        L_0x01b5:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19817G = r3
            goto L_0x0204
        L_0x01be:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19816F = r3
            goto L_0x0204
        L_0x01c7:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19815E = r3
            goto L_0x0204
        L_0x01d0:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19814D = r3
            goto L_0x0204
        L_0x01d9:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19856u = r3
            goto L_0x0204
        L_0x01e2:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19855t = r3
            goto L_0x0204
        L_0x01eb:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            float r3 = (float) r3
            r5.f19854s = r3
            goto L_0x0204
        L_0x01f4:
            r5.getClass()
            goto L_0x0204
        L_0x01f8:
            long r3 = (long) r3
            r5.f19802s = r3
            goto L_0x0204
        L_0x01fc:
            r5.mo22263d(r7)
            ra.d$b r5 = r5.f19804u
            int r3 = (int) r3
            r5.f19827Q = r3
        L_0x0204:
            r6.f19747e = r2
            goto L_0x09d9
        L_0x0208:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 32
            java.lang.String r3 = "Invalid element type "
            java.lang.String r2 = p379.C13715c.m34241g(r2, r3, r7)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0216:
            ra.b r4 = r6.f19746d
            int r7 = r6.f19748f
            long r10 = r6.f19749g
            int r8 = (int) r10
            ra.d$a r4 = (p238ra.C6279d.C6280a) r4
            ra.d r4 = p238ra.C6279d.this
            r4.getClass()
            r10 = 161(0xa1, float:2.26E-43)
            r11 = 163(0xa3, float:2.28E-43)
            if (r7 == r10) goto L_0x0329
            if (r7 == r11) goto L_0x0329
            r9 = 165(0xa5, float:2.31E-43)
            if (r7 == r9) goto L_0x02ef
            r5 = 16877(0x41ed, float:2.365E-41)
            if (r7 == r5) goto L_0x02c7
            r5 = 16981(0x4255, float:2.3795E-41)
            if (r7 == r5) goto L_0x02b5
            r5 = 18402(0x47e2, float:2.5787E-41)
            if (r7 == r5) goto L_0x029e
            r3 = 21419(0x53ab, float:3.0014E-41)
            if (r7 == r3) goto L_0x027a
            r3 = 25506(0x63a2, float:3.5742E-41)
            if (r7 == r3) goto L_0x0268
            r3 = 30322(0x7672, float:4.249E-41)
            if (r7 != r3) goto L_0x025a
            r4.mo22263d(r7)
            ra.d$b r3 = r4.f19804u
            byte[] r4 = new byte[r8]
            r3.f19857v = r4
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21581h(r2, r8, r4, r2)
            goto L_0x0558
        L_0x025a:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 26
            java.lang.String r3 = "Unexpected id: "
            java.lang.String r2 = p379.C13715c.m34241g(r2, r3, r7)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0268:
            r4.mo22263d(r7)
            ra.d$b r3 = r4.f19804u
            byte[] r4 = new byte[r8]
            r3.f19846k = r4
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21581h(r2, r8, r4, r2)
            goto L_0x0558
        L_0x027a:
            ub.r r3 = r4.f19792i
            byte[] r3 = r3.f21038a
            java.util.Arrays.fill(r3, r2)
            ub.r r3 = r4.f19792i
            byte[] r3 = r3.f21038a
            int r5 = 4 - r8
            r7 = r27
            ma.e r7 = (p173ma.C5732e) r7
            r7.mo21581h(r5, r8, r3, r2)
            ub.r r3 = r4.f19792i
            r3.mo23007z(r2)
            ub.r r2 = r4.f19792i
            long r2 = r2.mo22998q()
            int r3 = (int) r2
            r4.f19806w = r3
            goto L_0x0558
        L_0x029e:
            byte[] r5 = new byte[r8]
            r9 = r27
            ma.e r9 = (p173ma.C5732e) r9
            r9.mo21581h(r2, r8, r5, r2)
            r4.mo22263d(r7)
            ra.d$b r4 = r4.f19804u
            ma.v$a r7 = new ma.v$a
            r7.<init>(r3, r5, r2, r2)
            r4.f19845j = r7
            goto L_0x0558
        L_0x02b5:
            r4.mo22263d(r7)
            ra.d$b r3 = r4.f19804u
            byte[] r4 = new byte[r8]
            r3.f19844i = r4
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21581h(r2, r8, r4, r2)
            goto L_0x0558
        L_0x02c7:
            r4.mo22263d(r7)
            ra.d$b r3 = r4.f19804u
            int r4 = r3.f19842g
            r5 = 1685485123(0x64767643, float:1.8185683E22)
            if (r4 == r5) goto L_0x02e2
            r5 = 1685480259(0x64766343, float:1.8180206E22)
            if (r4 != r5) goto L_0x02d9
            goto L_0x02e2
        L_0x02d9:
            r2 = r27
            ma.e r2 = (p173ma.C5732e) r2
            r2.mo21582i(r8)
            goto L_0x0558
        L_0x02e2:
            byte[] r4 = new byte[r8]
            r3.f19824N = r4
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21581h(r2, r8, r4, r2)
            goto L_0x0558
        L_0x02ef:
            int r3 = r4.f19763G
            if (r3 == r5) goto L_0x02f5
            goto L_0x0558
        L_0x02f5:
            android.util.SparseArray<ra.d$b> r3 = r4.f19786c
            int r5 = r4.f19769M
            java.lang.Object r3 = r3.get(r5)
            ra.d$b r3 = (p238ra.C6279d.C6281b) r3
            int r5 = r4.f19772P
            r7 = 4
            if (r5 != r7) goto L_0x0320
            java.lang.String r3 = r3.f19837b
            java.lang.String r5 = "V_VP9"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0320
            ub.r r3 = r4.f19797n
            r3.mo23004w(r8)
            ub.r r3 = r4.f19797n
            byte[] r3 = r3.f21038a
            r4 = r27
            ma.e r4 = (p173ma.C5732e) r4
            r4.mo21581h(r2, r8, r3, r2)
            goto L_0x0558
        L_0x0320:
            r2 = r27
            ma.e r2 = (p173ma.C5732e) r2
            r2.mo21582i(r8)
            goto L_0x0558
        L_0x0329:
            int r10 = r4.f19763G
            if (r10 != 0) goto L_0x0350
            ra.f r10 = r4.f19785b
            r11 = r27
            ma.e r11 = (p173ma.C5732e) r11
            r12 = 8
            long r10 = r10.mo22273b(r11, r2, r3, r12)
            int r11 = (int) r10
            r4.f19769M = r11
            ra.f r10 = r4.f19785b
            int r10 = r10.f19874c
            r4.f19770N = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f19765I = r10
            r4.f19763G = r3
            ub.r r10 = r4.f19790g
            r10.mo23004w(r2)
        L_0x0350:
            android.util.SparseArray<ra.d$b> r10 = r4.f19786c
            int r11 = r4.f19769M
            java.lang.Object r10 = r10.get(r11)
            ra.d$b r10 = (p238ra.C6279d.C6281b) r10
            if (r10 != 0) goto L_0x036a
            int r3 = r4.f19770N
            int r8 = r8 - r3
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            r3.mo21582i(r8)
            r4.f19763G = r2
            goto L_0x0558
        L_0x036a:
            ma.v r11 = r10.f19834X
            r11.getClass()
            int r11 = r4.f19763G
            if (r11 != r3) goto L_0x0502
            r11 = r27
            ma.e r11 = (p173ma.C5732e) r11
            r4.mo22265i(r11, r9)
            ub.r r12 = r4.f19790g
            byte[] r12 = r12.f21038a
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r3
            if (r12 != 0) goto L_0x03a5
            r4.f19767K = r3
            int[] r5 = r4.f19768L
            if (r5 != 0) goto L_0x038e
            int[] r5 = new int[r3]
            goto L_0x039b
        L_0x038e:
            int r11 = r5.length
            if (r11 < r3) goto L_0x0392
            goto L_0x039b
        L_0x0392:
            int r5 = r5.length
            int r5 = r5 * 2
            int r3 = java.lang.Math.max(r5, r3)
            int[] r5 = new int[r3]
        L_0x039b:
            r4.f19768L = r5
            int r3 = r4.f19770N
            int r8 = r8 - r3
            int r8 = r8 - r9
            r5[r2] = r8
            goto L_0x04bb
        L_0x03a5:
            r15 = 4
            r4.mo22265i(r11, r15)
            ub.r r15 = r4.f19790g
            byte[] r15 = r15.f21038a
            byte r15 = r15[r9]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r3
            r4.f19767K = r15
            int[] r13 = r4.f19768L
            if (r13 != 0) goto L_0x03bb
            int[] r13 = new int[r15]
            goto L_0x03c8
        L_0x03bb:
            int r14 = r13.length
            if (r14 < r15) goto L_0x03bf
            goto L_0x03c8
        L_0x03bf:
            int r13 = r13.length
            int r13 = r13 * 2
            int r13 = java.lang.Math.max(r13, r15)
            int[] r13 = new int[r13]
        L_0x03c8:
            r4.f19768L = r13
            if (r12 != r5) goto L_0x03d9
            int r3 = r4.f19770N
            int r8 = r8 - r3
            r5 = 4
            int r8 = r8 - r5
            int r3 = r4.f19767K
            int r8 = r8 / r3
            java.util.Arrays.fill(r13, r2, r3, r8)
            goto L_0x04bb
        L_0x03d9:
            r5 = 4
            if (r12 != r3) goto L_0x0411
            r9 = 0
            r12 = 0
        L_0x03de:
            int r13 = r4.f19767K
            int r13 = r13 + -1
            if (r9 >= r13) goto L_0x0406
            int[] r13 = r4.f19768L
            r13[r9] = r2
        L_0x03e8:
            int r5 = r5 + r3
            r4.mo22265i(r11, r5)
            ub.r r13 = r4.f19790g
            byte[] r13 = r13.f21038a
            int r14 = r5 + -1
            byte r13 = r13[r14]
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            int[] r15 = r4.f19768L
            r16 = r15[r9]
            int r16 = r16 + r13
            r15[r9] = r16
            if (r13 == r14) goto L_0x03e8
            int r12 = r12 + r16
            int r9 = r9 + 1
            goto L_0x03de
        L_0x0406:
            int[] r2 = r4.f19768L
            int r3 = r4.f19770N
            int r8 = r8 - r3
            int r8 = r8 - r5
            int r8 = r8 - r12
            r2[r13] = r8
            goto L_0x04bb
        L_0x0411:
            if (r12 != r9) goto L_0x04f4
            r9 = 0
            r12 = 0
        L_0x0415:
            int r13 = r4.f19767K
            int r13 = r13 + -1
            if (r9 >= r13) goto L_0x04b2
            int[] r13 = r4.f19768L
            r13[r9] = r2
            int r5 = r5 + 1
            r4.mo22265i(r11, r5)
            ub.r r2 = r4.f19790g
            byte[] r2 = r2.f21038a
            int r13 = r5 + -1
            byte r2 = r2[r13]
            if (r2 == 0) goto L_0x04aa
            r2 = 0
        L_0x042f:
            r14 = 8
            if (r2 >= r14) goto L_0x047d
            int r14 = 7 - r2
            int r3 = r3 << r14
            ub.r r14 = r4.f19790g
            byte[] r14 = r14.f21038a
            byte r14 = r14[r13]
            r14 = r14 & r3
            if (r14 == 0) goto L_0x0475
            int r5 = r5 + r2
            r4.mo22265i(r11, r5)
            ub.r r14 = r4.f19790g
            byte[] r14 = r14.f21038a
            int r15 = r13 + 1
            byte r13 = r14[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r3 = ~r3
            r3 = r3 & r13
            long r13 = (long) r3
        L_0x0450:
            if (r15 >= r5) goto L_0x0468
            r3 = 8
            long r13 = r13 << r3
            ub.r r3 = r4.f19790g
            byte[] r3 = r3.f21038a
            int r16 = r15 + 1
            byte r3 = r3[r15]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r0 = (long) r3
            long r13 = r13 | r0
            r0 = r26
            r1 = r28
            r15 = r16
            goto L_0x0450
        L_0x0468:
            if (r9 <= 0) goto L_0x047f
            int r2 = r2 * 7
            int r2 = r2 + 6
            r0 = 1
            long r2 = r0 << r2
            long r2 = r2 - r0
            long r13 = r13 - r2
            goto L_0x047f
        L_0x0475:
            int r2 = r2 + 1
            r3 = 1
            r0 = r26
            r1 = r28
            goto L_0x042f
        L_0x047d:
            r13 = 0
        L_0x047f:
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x04a2
            int r0 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x04a2
            int r0 = (int) r13
            int[] r1 = r4.f19768L
            if (r9 != 0) goto L_0x0490
            goto L_0x0495
        L_0x0490:
            int r2 = r9 + -1
            r2 = r1[r2]
            int r0 = r0 + r2
        L_0x0495:
            r1[r9] = r0
            int r12 = r12 + r0
            int r9 = r9 + 1
            r2 = 0
            r3 = 1
            r0 = r26
            r1 = r28
            goto L_0x0415
        L_0x04a2:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "EBML lacing sample size out of range."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04aa:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "No valid varint length mask found"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04b2:
            int[] r0 = r4.f19768L
            int r1 = r4.f19770N
            int r8 = r8 - r1
            int r8 = r8 - r5
            int r8 = r8 - r12
            r0[r13] = r8
        L_0x04bb:
            ub.r r0 = r4.f19790g
            byte[] r0 = r0.f21038a
            r1 = 0
            byte r1 = r0[r1]
            int r1 = r1 << 8
            r2 = 1
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            long r1 = r4.f19758B
            long r8 = (long) r0
            long r8 = r4.mo22267k(r8)
            long r8 = r8 + r1
            r4.f19764H = r8
            int r0 = r10.f19839d
            r1 = 2
            if (r0 == r1) goto L_0x04eb
            r0 = 163(0xa3, float:2.28E-43)
            if (r7 != r0) goto L_0x04e9
            ub.r r0 = r4.f19790g
            byte[] r0 = r0.f21038a
            byte r0 = r0[r1]
            r2 = 128(0x80, float:1.794E-43)
            r0 = r0 & r2
            if (r0 != r2) goto L_0x04e9
            goto L_0x04eb
        L_0x04e9:
            r0 = 0
            goto L_0x04ec
        L_0x04eb:
            r0 = 1
        L_0x04ec:
            r4.f19771O = r0
            r4.f19763G = r1
            r0 = 0
            r4.f19766J = r0
            goto L_0x0502
        L_0x04f4:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 36
            java.lang.String r2 = "Unexpected lacing value: "
            java.lang.String r1 = p379.C13715c.m34241g(r1, r2, r12)
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0502:
            r0 = 163(0xa3, float:2.28E-43)
            if (r7 != r0) goto L_0x053d
        L_0x0506:
            int r0 = r4.f19766J
            int r1 = r4.f19767K
            if (r0 >= r1) goto L_0x0539
            int[] r1 = r4.f19768L
            r0 = r1[r0]
            r1 = r27
            ma.e r1 = (p173ma.C5732e) r1
            int r24 = r4.mo22268l(r0, r1, r10)
            long r0 = r4.f19764H
            int r2 = r4.f19766J
            int r3 = r10.f19840e
            int r2 = r2 * r3
            int r2 = r2 / 1000
            long r2 = (long) r2
            long r21 = r2 + r0
            int r0 = r4.f19771O
            r25 = 0
            r19 = r4
            r20 = r10
            r23 = r0
            r19.mo22264e(r20, r21, r23, r24, r25)
            int r0 = r4.f19766J
            int r0 = r0 + 1
            r4.f19766J = r0
            goto L_0x0506
        L_0x0539:
            r0 = 0
            r4.f19763G = r0
            goto L_0x0558
        L_0x053d:
            int r0 = r4.f19766J
            int r1 = r4.f19767K
            if (r0 >= r1) goto L_0x0558
            int[] r1 = r4.f19768L
            r2 = r1[r0]
            r3 = r27
            ma.e r3 = (p173ma.C5732e) r3
            int r2 = r4.mo22268l(r2, r3, r10)
            r1[r0] = r2
            int r0 = r4.f19766J
            int r0 = r0 + 1
            r4.f19766J = r0
            goto L_0x053d
        L_0x0558:
            r0 = 0
            r6.f19747e = r0
            goto L_0x09d9
        L_0x055d:
            long r0 = r6.f19749g
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x05e1
            ra.b r2 = r6.f19746d
            int r3 = r6.f19748f
            int r1 = (int) r0
            if (r1 != 0) goto L_0x056d
            java.lang.String r0 = ""
            goto L_0x0588
        L_0x056d:
            byte[] r0 = new byte[r1]
            r4 = r27
            ma.e r4 = (p173ma.C5732e) r4
            r5 = 0
            r4.mo21581h(r5, r1, r0, r5)
        L_0x0577:
            if (r1 <= 0) goto L_0x0581
            int r4 = r1 + -1
            byte r5 = r0[r4]
            if (r5 != 0) goto L_0x0581
            r1 = r4
            goto L_0x0577
        L_0x0581:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r0, r5, r1)
            r0 = r4
        L_0x0588:
            ra.d$a r2 = (p238ra.C6279d.C6280a) r2
            ra.d r1 = p238ra.C6279d.this
            r1.getClass()
            r2 = 134(0x86, float:1.88E-43)
            if (r3 == r2) goto L_0x05d5
            r2 = 17026(0x4282, float:2.3859E-41)
            if (r3 == r2) goto L_0x05b1
            r2 = 21358(0x536e, float:2.9929E-41)
            if (r3 == r2) goto L_0x05a9
            r2 = 2274716(0x22b59c, float:3.187556E-39)
            if (r3 == r2) goto L_0x05a1
            goto L_0x05dc
        L_0x05a1:
            r1.mo22263d(r3)
            ra.d$b r1 = r1.f19804u
            r1.f19833W = r0
            goto L_0x05dc
        L_0x05a9:
            r1.mo22263d(r3)
            ra.d$b r1 = r1.f19804u
            r1.f19836a = r0
            goto L_0x05dc
        L_0x05b1:
            java.lang.String r1 = "webm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x05dc
            java.lang.String r1 = "matroska"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x05c3
            goto L_0x05dc
        L_0x05c3:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r2 = r0.length()
            int r2 = r2 + 22
            java.lang.String r3 = "DocType "
            java.lang.String r0 = p379.C25541a.m63875e(r2, r3, r0, r10)
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x05d5:
            r1.mo22263d(r3)
            ra.d$b r1 = r1.f19804u
            r1.f19837b = r0
        L_0x05dc:
            r0 = 0
            r6.f19747e = r0
            goto L_0x09d9
        L_0x05e1:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            long r1 = r6.f19749g
            r3 = 41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "String element size: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05fc:
            long r0 = r6.f19749g
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x08f8
            ra.b r2 = r6.f19746d
            int r3 = r6.f19748f
            int r1 = (int) r0
            r0 = r27
            ma.e r0 = (p173ma.C5732e) r0
            byte[] r5 = r6.f19743a
            r7 = 0
            r0.mo21581h(r7, r1, r5, r7)
            r0 = 0
            r7 = 0
        L_0x0614:
            if (r0 >= r1) goto L_0x0624
            r5 = 8
            long r7 = r7 << r5
            byte[] r5 = r6.f19743a
            byte r5 = r5[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            long r11 = (long) r5
            long r7 = r7 | r11
            int r0 = r0 + 1
            goto L_0x0614
        L_0x0624:
            ra.d$a r2 = (p238ra.C6279d.C6280a) r2
            ra.d r0 = p238ra.C6279d.this
            r0.getClass()
            r1 = 20529(0x5031, float:2.8767E-41)
            r2 = 55
            if (r3 == r1) goto L_0x08d3
            r1 = 20530(0x5032, float:2.8769E-41)
            if (r3 == r1) goto L_0x08b2
            r1 = 50
            switch(r3) {
                case 131: goto L_0x0832;
                case 136: goto L_0x0820;
                case 155: goto L_0x0818;
                case 159: goto L_0x080e;
                case 176: goto L_0x0804;
                case 179: goto L_0x07f6;
                case 186: goto L_0x07ec;
                case 215: goto L_0x07e2;
                case 231: goto L_0x07da;
                case 238: goto L_0x07d5;
                case 241: goto L_0x07c4;
                case 251: goto L_0x07bf;
                case 16871: goto L_0x07b5;
                case 16980: goto L_0x0793;
                case 17029: goto L_0x0769;
                case 17143: goto L_0x0747;
                case 18401: goto L_0x0723;
                case 18408: goto L_0x06ff;
                case 21420: goto L_0x06f8;
                case 21432: goto L_0x06cd;
                case 21680: goto L_0x06c3;
                case 21682: goto L_0x06b9;
                case 21690: goto L_0x06af;
                case 21930: goto L_0x069d;
                case 21998: goto L_0x0693;
                case 22186: goto L_0x068a;
                case 22203: goto L_0x0681;
                case 25188: goto L_0x0677;
                case 30321: goto L_0x064e;
                case 2352003: goto L_0x0644;
                case 2807729: goto L_0x0640;
                default: goto L_0x063a;
            }
        L_0x063a:
            r1 = 7
            switch(r3) {
                case 21945: goto L_0x089c;
                case 21946: goto L_0x0878;
                case 21947: goto L_0x0850;
                case 21948: goto L_0x0846;
                case 21949: goto L_0x083c;
                default: goto L_0x063e;
            }
        L_0x063e:
            goto L_0x08d9
        L_0x0640:
            r0.f19801r = r7
            goto L_0x08d9
        L_0x0644:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19840e = r1
            goto L_0x08d9
        L_0x064e:
            r0.mo22263d(r3)
            int r1 = (int) r7
            if (r1 == 0) goto L_0x0670
            r2 = 1
            if (r1 == r2) goto L_0x066a
            r2 = 2
            if (r1 == r2) goto L_0x0664
            if (r1 == r9) goto L_0x065e
            goto L_0x08d9
        L_0x065e:
            ra.d$b r0 = r0.f19804u
            r0.f19853r = r9
            goto L_0x08d9
        L_0x0664:
            ra.d$b r0 = r0.f19804u
            r0.f19853r = r2
            goto L_0x08d9
        L_0x066a:
            ra.d$b r0 = r0.f19804u
            r0.f19853r = r2
            goto L_0x08d9
        L_0x0670:
            ra.d$b r0 = r0.f19804u
            r1 = 0
            r0.f19853r = r1
            goto L_0x08d9
        L_0x0677:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19826P = r1
            goto L_0x08d9
        L_0x0681:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            r0.f19829S = r7
            goto L_0x08d9
        L_0x068a:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            r0.f19828R = r7
            goto L_0x08d9
        L_0x0693:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19841f = r1
            goto L_0x08d9
        L_0x069d:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            r1 = 1
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x06aa
            r1 = 1
            goto L_0x06ab
        L_0x06aa:
            r1 = 0
        L_0x06ab:
            r0.f19831U = r1
            goto L_0x08d9
        L_0x06af:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19851p = r1
            goto L_0x08d9
        L_0x06b9:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19852q = r1
            goto L_0x08d9
        L_0x06c3:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19850o = r1
            goto L_0x08d9
        L_0x06cd:
            int r1 = (int) r7
            r0.mo22263d(r3)
            if (r1 == 0) goto L_0x06f1
            r2 = 1
            if (r1 == r2) goto L_0x06ea
            if (r1 == r9) goto L_0x06e4
            r2 = 15
            if (r1 == r2) goto L_0x06de
            goto L_0x08d9
        L_0x06de:
            ra.d$b r0 = r0.f19804u
            r0.f19858w = r9
            goto L_0x08d9
        L_0x06e4:
            ra.d$b r0 = r0.f19804u
            r0.f19858w = r2
            goto L_0x08d9
        L_0x06ea:
            ra.d$b r0 = r0.f19804u
            r1 = 2
            r0.f19858w = r1
            goto L_0x08d9
        L_0x06f1:
            ra.d$b r0 = r0.f19804u
            r1 = 0
            r0.f19858w = r1
            goto L_0x08d9
        L_0x06f8:
            long r1 = r0.f19800q
            long r7 = r7 + r1
            r0.f19807x = r7
            goto L_0x08d9
        L_0x06ff:
            r0 = 1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0707
            goto L_0x08d9
        L_0x0707:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "AESSettingsCipherMode "
            r2.append(r1)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0723:
            r0 = 5
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x072b
            goto L_0x08d9
        L_0x072b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "ContentEncAlgo "
            r2.append(r1)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0747:
            r2 = 1
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x074f
            goto L_0x08d9
        L_0x074f:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "EBMLReadVersion "
            r2.append(r1)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0769:
            r0 = 1
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0777
            r0 = 2
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0777
            goto L_0x08d9
        L_0x0777:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "DocTypeReadVersion "
            r2.append(r1)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0793:
            r2 = 3
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x079b
            goto L_0x08d9
        L_0x079b:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "ContentCompAlgo "
            r2.append(r1)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x07b5:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19842g = r1
            goto L_0x08d9
        L_0x07bf:
            r1 = 1
            r0.f19773Q = r1
            goto L_0x08d9
        L_0x07c4:
            r1 = 1
            boolean r2 = r0.f19761E
            if (r2 != 0) goto L_0x08d9
            r0.mo22262c(r3)
            ub.l r2 = r0.f19760D
            r2.mo22963a(r7)
            r0.f19761E = r1
            goto L_0x08d9
        L_0x07d5:
            int r1 = (int) r7
            r0.f19772P = r1
            goto L_0x08d9
        L_0x07da:
            long r1 = r0.mo22267k(r7)
            r0.f19758B = r1
            goto L_0x08d9
        L_0x07e2:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19838c = r1
            goto L_0x08d9
        L_0x07ec:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19849n = r1
            goto L_0x08d9
        L_0x07f6:
            r0.mo22262c(r3)
            ub.l r1 = r0.f19759C
            long r2 = r0.mo22267k(r7)
            r1.mo22963a(r2)
            goto L_0x08d9
        L_0x0804:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19848m = r1
            goto L_0x08d9
        L_0x080e:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19825O = r1
            goto L_0x08d9
        L_0x0818:
            long r1 = r0.mo22267k(r7)
            r0.f19765I = r1
            goto L_0x08d9
        L_0x0820:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            r1 = 1
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x082d
            r1 = 1
            goto L_0x082e
        L_0x082d:
            r1 = 0
        L_0x082e:
            r0.f19832V = r1
            goto L_0x08d9
        L_0x0832:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19839d = r1
            goto L_0x08d9
        L_0x083c:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19813C = r1
            goto L_0x08d9
        L_0x0846:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            int r1 = (int) r7
            r0.f19812B = r1
            goto L_0x08d9
        L_0x0850:
            r0.mo22263d(r3)
            ra.d$b r0 = r0.f19804u
            r2 = 1
            r0.f19859x = r2
            int r3 = (int) r7
            if (r3 == r2) goto L_0x0875
            r2 = 9
            if (r3 == r2) goto L_0x0870
            r2 = 4
            if (r3 == r2) goto L_0x086b
            if (r3 == r4) goto L_0x086b
            r2 = 6
            if (r3 == r2) goto L_0x086b
            if (r3 == r1) goto L_0x086b
            goto L_0x08d9
        L_0x086b:
            r1 = 2
            r0.f19860y = r1
            goto L_0x08d9
        L_0x0870:
            r1 = 6
            r0.f19860y = r1
            goto L_0x08d9
        L_0x0875:
            r0.f19860y = r2
            goto L_0x08d9
        L_0x0878:
            r2 = 6
            r4 = 1
            r0.mo22263d(r3)
            int r3 = (int) r7
            if (r3 == r4) goto L_0x0897
            r4 = 16
            if (r3 == r4) goto L_0x0892
            r4 = 18
            if (r3 == r4) goto L_0x088d
            if (r3 == r2) goto L_0x0897
            if (r3 == r1) goto L_0x0897
            goto L_0x08d9
        L_0x088d:
            ra.d$b r0 = r0.f19804u
            r0.f19861z = r1
            goto L_0x08d9
        L_0x0892:
            ra.d$b r0 = r0.f19804u
            r0.f19861z = r2
            goto L_0x08d9
        L_0x0897:
            ra.d$b r0 = r0.f19804u
            r0.f19861z = r9
            goto L_0x08d9
        L_0x089c:
            r0.mo22263d(r3)
            int r1 = (int) r7
            r2 = 1
            if (r1 == r2) goto L_0x08ac
            r3 = 2
            if (r1 == r3) goto L_0x08a7
            goto L_0x08d9
        L_0x08a7:
            ra.d$b r0 = r0.f19804u
            r0.f19811A = r2
            goto L_0x08d9
        L_0x08ac:
            r1 = 2
            ra.d$b r0 = r0.f19804u
            r0.f19811A = r1
            goto L_0x08d9
        L_0x08b2:
            r0 = 1
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x08b9
            goto L_0x08d9
        L_0x08b9:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = "ContentEncodingScope "
            r1.append(r2)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x08d3:
            r0 = 0
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x08de
        L_0x08d9:
            r0 = 0
            r6.f19747e = r0
            goto L_0x09d9
        L_0x08de:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = "ContentEncodingOrder "
            r1.append(r2)
            r1.append(r7)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x08f8:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            long r1 = r6.f19749g
            r3 = 42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid integer size: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0913:
            r0 = r27
            ma.e r0 = (p173ma.C5732e) r0
            long r0 = r0.f18591d
            long r2 = r6.f19749g
            long r2 = r2 + r0
            java.util.ArrayDeque<ra.a$a> r4 = r6.f19744b
            ra.a$a r5 = new ra.a$a
            int r7 = r6.f19748f
            r5.<init>(r7, r2)
            r4.push(r5)
            ra.b r2 = r6.f19746d
            int r3 = r6.f19748f
            long r4 = r6.f19749g
            ra.d$a r2 = (p238ra.C6279d.C6280a) r2
            ra.d r2 = p238ra.C6279d.this
            ma.j r7 = r2.f19784a0
            p583jk.C17875h.m44306q(r7)
            r7 = 160(0xa0, float:2.24E-43)
            if (r3 == r7) goto L_0x09d4
            r7 = 174(0xae, float:2.44E-43)
            if (r3 == r7) goto L_0x09cb
            r7 = 187(0xbb, float:2.62E-43)
            if (r3 == r7) goto L_0x09c7
            r7 = 19899(0x4dbb, float:2.7884E-41)
            if (r3 == r7) goto L_0x09be
            r7 = 20533(0x5035, float:2.8773E-41)
            if (r3 == r7) goto L_0x09b5
            r7 = 21968(0x55d0, float:3.0784E-41)
            if (r3 == r7) goto L_0x09ac
            r7 = 408125543(0x18538067, float:2.7335937E-24)
            if (r3 == r7) goto L_0x0992
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r3 == r0) goto L_0x0983
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r3 == r0) goto L_0x095f
            goto L_0x09c5
        L_0x095f:
            boolean r0 = r2.f19805v
            if (r0 != 0) goto L_0x09c5
            boolean r0 = r2.f19787d
            if (r0 == 0) goto L_0x0973
            long r0 = r2.f19809z
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0973
            r0 = 1
            r2.f19808y = r0
            goto L_0x09c5
        L_0x0973:
            r0 = 1
            ma.j r1 = r2.f19784a0
            ma.t$b r3 = new ma.t$b
            long r4 = r2.f19803t
            r3.<init>(r4)
            r1.mo20707k(r3)
            r2.f19805v = r0
            goto L_0x09c5
        L_0x0983:
            ub.l r0 = new ub.l
            r0.<init>()
            r2.f19759C = r0
            ub.l r0 = new ub.l
            r0.<init>()
            r2.f19760D = r0
            goto L_0x09c5
        L_0x0992:
            long r7 = r2.f19800q
            r9 = -1
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x09a7
            int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x099f
            goto L_0x09a7
        L_0x099f:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Multiple Segment elements not supported"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x09a7:
            r2.f19800q = r0
            r2.f19799p = r4
            goto L_0x09c5
        L_0x09ac:
            r2.mo22263d(r3)
            ra.d$b r0 = r2.f19804u
            r1 = 1
            r0.f19859x = r1
            goto L_0x09c5
        L_0x09b5:
            r0 = 1
            r2.mo22263d(r3)
            ra.d$b r1 = r2.f19804u
            r1.f19843h = r0
            goto L_0x09c5
        L_0x09be:
            r0 = -1
            r2.f19806w = r0
            r0 = -1
            r2.f19807x = r0
        L_0x09c5:
            r0 = 0
            goto L_0x09d7
        L_0x09c7:
            r0 = 0
            r2.f19761E = r0
            goto L_0x09d7
        L_0x09cb:
            r0 = 0
            ra.d$b r1 = new ra.d$b
            r1.<init>()
            r2.f19804u = r1
            goto L_0x09d7
        L_0x09d4:
            r0 = 0
            r2.f19773Q = r0
        L_0x09d7:
            r6.f19747e = r0
        L_0x09d9:
            r0 = 1
            r4 = 1
        L_0x09db:
            if (r4 == 0) goto L_0x0a0e
            r0 = r27
            ma.e r0 = (p173ma.C5732e) r0
            long r0 = r0.f18591d
            r2 = r26
            boolean r3 = r2.f19808y
            if (r3 == 0) goto L_0x09f5
            r2.f19757A = r0
            long r0 = r2.f19809z
            r5 = r28
            r5.f18624a = r0
            r0 = 0
            r2.f19808y = r0
            goto L_0x0a07
        L_0x09f5:
            r5 = r28
            boolean r0 = r2.f19805v
            if (r0 == 0) goto L_0x0a09
            long r0 = r2.f19757A
            r6 = -1
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0a09
            r5.f18624a = r0
            r2.f19757A = r6
        L_0x0a07:
            r0 = 1
            goto L_0x0a0a
        L_0x0a09:
            r0 = 0
        L_0x0a0a:
            if (r0 == 0) goto L_0x0a12
            r0 = 1
            return r0
        L_0x0a0e:
            r2 = r26
            r5 = r28
        L_0x0a12:
            r3 = 1
            r0 = 0
            r0 = r2
            r1 = r5
            r2 = 0
            goto L_0x0009
        L_0x0a19:
            r2 = r0
            r5 = r1
            long r0 = r6.f19749g
            int r1 = (int) r0
            r0 = r27
            ma.e r0 = (p173ma.C5732e) r0
            r0.mo21582i(r1)
            r0 = 0
            r6.f19747e = r0
            r1 = -1
            r0 = r2
            r1 = r5
            r2 = 0
            r5 = -1
            goto L_0x001a
        L_0x0a2f:
            r2 = r0
            if (r4 != 0) goto L_0x0a67
            r0 = 0
        L_0x0a33:
            android.util.SparseArray<ra.d$b> r1 = r2.f19786c
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0a65
            android.util.SparseArray<ra.d$b> r1 = r2.f19786c
            java.lang.Object r1 = r1.valueAt(r0)
            ra.d$b r1 = (p238ra.C6279d.C6281b) r1
            ma.v r3 = r1.f19834X
            r3.getClass()
            ra.d$c r3 = r1.f19830T
            if (r3 == 0) goto L_0x0a62
            int r4 = r3.f19864c
            if (r4 <= 0) goto L_0x0a62
            ma.v r5 = r1.f19834X
            long r6 = r3.f19865d
            int r8 = r3.f19866e
            int r9 = r3.f19867f
            int r10 = r3.f19868g
            ma.v$a r11 = r1.f19845j
            r5.mo20633d(r6, r8, r9, r10, r11)
            r1 = 0
            r3.f19864c = r1
        L_0x0a62:
            int r0 = r0 + 1
            goto L_0x0a33
        L_0x0a65:
            r0 = -1
            return r0
        L_0x0a67:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p238ra.C6279d.mo21595h(ma.i, ma.s):int");
    }

    /* renamed from: i */
    public final void mo22265i(C5732e eVar, int i) throws IOException {
        C6803r rVar = this.f19790g;
        if (rVar.f21040c < i) {
            byte[] bArr = rVar.f21038a;
            if (bArr.length < i) {
                rVar.mo22982a(Math.max(bArr.length * 2, i));
            }
            C6803r rVar2 = this.f19790g;
            byte[] bArr2 = rVar2.f21038a;
            int i2 = rVar2.f21040c;
            eVar.mo21581h(i2, i - i2, bArr2, false);
            this.f19790g.mo23006y(i);
        }
    }

    /* renamed from: j */
    public final void mo22266j() {
        this.f19774R = 0;
        this.f19775S = 0;
        this.f19776T = 0;
        this.f19777U = false;
        this.f19778V = false;
        this.f19779W = false;
        this.f19780X = 0;
        this.f19781Y = 0;
        this.f19782Z = false;
        this.f19793j.mo23004w(0);
    }

    /* renamed from: k */
    public final long mo22267k(long j) throws ParserException {
        long j2 = this.f19801r;
        if (j2 != -9223372036854775807L) {
            return C6774a0.m15939A(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0224  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo22268l(int r12, p173ma.C5732e r13, p238ra.C6279d.C6281b r14) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = r14.f19837b
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            byte[] r14 = f19752b0
            r11.mo22269m(r13, r14, r12)
            int r12 = r11.f19775S
            r11.mo22266j()
            return r12
        L_0x0015:
            java.lang.String r0 = r14.f19837b
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            byte[] r14 = f19754d0
            r11.mo22269m(r13, r14, r12)
            int r12 = r11.f19775S
            r11.mo22266j()
            return r12
        L_0x002a:
            ma.v r0 = r14.f19834X
            boolean r1 = r11.f19777U
            r2 = 2
            r3 = 8
            r4 = 4
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x01b0
            boolean r1 = r14.f19843h
            if (r1 == 0) goto L_0x0168
            int r1 = r11.f19771O
            r7 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r7
            r11.f19771O = r1
            boolean r1 = r11.f19778V
            r7 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x006b
            ub.r r1 = r11.f19790g
            byte[] r1 = r1.f21038a
            r13.mo21581h(r6, r5, r1, r6)
            int r1 = r11.f19774R
            int r1 = r1 + r5
            r11.f19774R = r1
            ub.r r1 = r11.f19790g
            byte[] r1 = r1.f21038a
            byte r1 = r1[r6]
            r8 = r1 & 128(0x80, float:1.794E-43)
            if (r8 == r7) goto L_0x0063
            r11.f19781Y = r1
            r11.f19778V = r5
            goto L_0x006b
        L_0x0063:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r13 = "Extension bit is set in signal byte"
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x006b:
            byte r1 = r11.f19781Y
            r8 = r1 & 1
            if (r8 != r5) goto L_0x0073
            r8 = 1
            goto L_0x0074
        L_0x0073:
            r8 = 0
        L_0x0074:
            if (r8 == 0) goto L_0x0172
            r1 = r1 & r2
            if (r1 != r2) goto L_0x007b
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r8 = r11.f19771O
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r9
            r11.f19771O = r8
            boolean r8 = r11.f19782Z
            if (r8 != 0) goto L_0x00bd
            ub.r r8 = r11.f19795l
            byte[] r8 = r8.f21038a
            r13.mo21581h(r6, r3, r8, r6)
            int r8 = r11.f19774R
            int r8 = r8 + r3
            r11.f19774R = r8
            r11.f19782Z = r5
            ub.r r8 = r11.f19790g
            byte[] r9 = r8.f21038a
            if (r1 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r7 = 0
        L_0x009d:
            r7 = r7 | r3
            byte r7 = (byte) r7
            r9[r6] = r7
            r8.mo23007z(r6)
            ub.r r7 = r11.f19790g
            r0.mo20634e(r7, r5)
            int r7 = r11.f19775S
            int r7 = r7 + r5
            r11.f19775S = r7
            ub.r r7 = r11.f19795l
            r7.mo23007z(r6)
            ub.r r7 = r11.f19795l
            r0.mo20634e(r7, r3)
            int r7 = r11.f19775S
            int r7 = r7 + r3
            r11.f19775S = r7
        L_0x00bd:
            if (r1 == 0) goto L_0x0172
            boolean r1 = r11.f19779W
            if (r1 != 0) goto L_0x00de
            ub.r r1 = r11.f19790g
            byte[] r1 = r1.f21038a
            r13.mo21581h(r6, r5, r1, r6)
            int r1 = r11.f19774R
            int r1 = r1 + r5
            r11.f19774R = r1
            ub.r r1 = r11.f19790g
            r1.mo23007z(r6)
            ub.r r1 = r11.f19790g
            int r1 = r1.mo22997p()
            r11.f19780X = r1
            r11.f19779W = r5
        L_0x00de:
            int r1 = r11.f19780X
            int r1 = r1 * 4
            ub.r r7 = r11.f19790g
            r7.mo23004w(r1)
            ub.r r7 = r11.f19790g
            byte[] r7 = r7.f21038a
            r13.mo21581h(r6, r1, r7, r6)
            int r7 = r11.f19774R
            int r7 = r7 + r1
            r11.f19774R = r7
            int r1 = r11.f19780X
            int r1 = r1 / r2
            int r1 = r1 + r5
            short r1 = (short) r1
            int r7 = r1 * 6
            int r7 = r7 + r2
            java.nio.ByteBuffer r8 = r11.f19798o
            if (r8 == 0) goto L_0x0105
            int r8 = r8.capacity()
            if (r8 >= r7) goto L_0x010b
        L_0x0105:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r11.f19798o = r8
        L_0x010b:
            java.nio.ByteBuffer r8 = r11.f19798o
            r8.position(r6)
            java.nio.ByteBuffer r8 = r11.f19798o
            r8.putShort(r1)
            r1 = 0
            r8 = 0
        L_0x0117:
            int r9 = r11.f19780X
            if (r1 >= r9) goto L_0x0139
            ub.r r9 = r11.f19790g
            int r9 = r9.mo23000s()
            int r10 = r1 % 2
            if (r10 != 0) goto L_0x012e
            java.nio.ByteBuffer r10 = r11.f19798o
            int r8 = r9 - r8
            short r8 = (short) r8
            r10.putShort(r8)
            goto L_0x0135
        L_0x012e:
            java.nio.ByteBuffer r10 = r11.f19798o
            int r8 = r9 - r8
            r10.putInt(r8)
        L_0x0135:
            int r1 = r1 + 1
            r8 = r9
            goto L_0x0117
        L_0x0139:
            int r1 = r11.f19774R
            int r1 = r12 - r1
            int r1 = r1 - r8
            int r9 = r9 % r2
            if (r9 != r5) goto L_0x0147
            java.nio.ByteBuffer r8 = r11.f19798o
            r8.putInt(r1)
            goto L_0x0152
        L_0x0147:
            java.nio.ByteBuffer r8 = r11.f19798o
            short r1 = (short) r1
            r8.putShort(r1)
            java.nio.ByteBuffer r1 = r11.f19798o
            r1.putInt(r6)
        L_0x0152:
            ub.r r1 = r11.f19796m
            java.nio.ByteBuffer r8 = r11.f19798o
            byte[] r8 = r8.array()
            r1.mo23005x(r7, r8)
            ub.r r1 = r11.f19796m
            r0.mo20634e(r1, r7)
            int r1 = r11.f19775S
            int r1 = r1 + r7
            r11.f19775S = r1
            goto L_0x0172
        L_0x0168:
            byte[] r1 = r14.f19844i
            if (r1 == 0) goto L_0x0172
            ub.r r7 = r11.f19793j
            int r8 = r1.length
            r7.mo23005x(r8, r1)
        L_0x0172:
            int r1 = r14.f19841f
            if (r1 <= 0) goto L_0x01ae
            int r1 = r11.f19771O
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r7
            r11.f19771O = r1
            ub.r r1 = r11.f19797n
            r1.mo23004w(r6)
            ub.r r1 = r11.f19790g
            r1.mo23004w(r4)
            ub.r r1 = r11.f19790g
            byte[] r7 = r1.f21038a
            int r8 = r12 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r6] = r8
            int r8 = r12 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r5] = r8
            int r8 = r12 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r2] = r8
            r8 = 3
            r9 = r12 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r7[r8] = r9
            r0.mo20634e(r1, r4)
            int r1 = r11.f19775S
            int r1 = r1 + r4
            r11.f19775S = r1
        L_0x01ae:
            r11.f19777U = r5
        L_0x01b0:
            ub.r r1 = r11.f19793j
            int r1 = r1.f21040c
            int r12 = r12 + r1
            java.lang.String r1 = r14.f19837b
            java.lang.String r7 = "V_MPEG4/ISO/AVC"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x024e
            java.lang.String r1 = r14.f19837b
            java.lang.String r7 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x01cb
            goto L_0x024e
        L_0x01cb:
            ra.d$c r1 = r14.f19830T
            if (r1 == 0) goto L_0x0226
            ub.r r1 = r11.f19793j
            int r1 = r1.f21040c
            if (r1 != 0) goto L_0x01d7
            r1 = 1
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            p583jk.C17875h.m44304o(r1)
            ra.d$c r1 = r14.f19830T
            boolean r2 = r1.f19863b
            if (r2 == 0) goto L_0x01e2
            goto L_0x0226
        L_0x01e2:
            byte[] r2 = r1.f19862a
            r7 = 10
            r13.mo21583j(r6, r7, r2, r6)
            r13.f18593f = r6
            byte[] r2 = r1.f19862a
            byte r7 = r2[r4]
            r8 = -8
            if (r7 != r8) goto L_0x0220
            r7 = 5
            byte r7 = r2[r7]
            r8 = 114(0x72, float:1.6E-43)
            if (r7 != r8) goto L_0x0220
            r7 = 6
            byte r7 = r2[r7]
            r8 = 111(0x6f, float:1.56E-43)
            if (r7 != r8) goto L_0x0220
            r7 = 7
            byte r8 = r2[r7]
            r9 = r8 & 254(0xfe, float:3.56E-43)
            r10 = 186(0xba, float:2.6E-43)
            if (r9 == r10) goto L_0x020a
            goto L_0x0220
        L_0x020a:
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r8 != r9) goto L_0x0212
            r8 = 1
            goto L_0x0213
        L_0x0212:
            r8 = 0
        L_0x0213:
            r9 = 40
            if (r8 == 0) goto L_0x0219
            r3 = 9
        L_0x0219:
            byte r2 = r2[r3]
            int r2 = r2 >> r4
            r2 = r2 & r7
            int r2 = r9 << r2
            goto L_0x0221
        L_0x0220:
            r2 = 0
        L_0x0221:
            if (r2 != 0) goto L_0x0224
            goto L_0x0226
        L_0x0224:
            r1.f19863b = r5
        L_0x0226:
            int r1 = r11.f19774R
            if (r1 >= r12) goto L_0x02c6
            int r1 = r12 - r1
            ub.r r2 = r11.f19793j
            int r3 = r2.f21040c
            int r2 = r2.f21039b
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x023f
            int r1 = java.lang.Math.min(r1, r3)
            ub.r r2 = r11.f19793j
            r0.mo20631b(r1, r2)
            goto L_0x0243
        L_0x023f:
            int r1 = r0.mo20630a(r13, r1, r6)
        L_0x0243:
            int r2 = r11.f19774R
            int r2 = r2 + r1
            r11.f19774R = r2
            int r2 = r11.f19775S
            int r2 = r2 + r1
            r11.f19775S = r2
            goto L_0x0226
        L_0x024e:
            ub.r r1 = r11.f19789f
            byte[] r1 = r1.f21038a
            r1[r6] = r6
            r1[r5] = r6
            r1[r2] = r6
            int r2 = r14.f19835Y
            int r3 = 4 - r2
        L_0x025c:
            int r5 = r11.f19774R
            if (r5 >= r12) goto L_0x02c6
            int r5 = r11.f19776T
            if (r5 != 0) goto L_0x029f
            ub.r r5 = r11.f19793j
            int r7 = r5.f21040c
            int r5 = r5.f21039b
            int r7 = r7 - r5
            int r5 = java.lang.Math.min(r2, r7)
            int r7 = r3 + r5
            int r8 = r2 - r5
            r13.mo21581h(r7, r8, r1, r6)
            if (r5 <= 0) goto L_0x027d
            ub.r r7 = r11.f19793j
            r7.mo22983b(r3, r5, r1)
        L_0x027d:
            int r5 = r11.f19774R
            int r5 = r5 + r2
            r11.f19774R = r5
            ub.r r5 = r11.f19789f
            r5.mo23007z(r6)
            ub.r r5 = r11.f19789f
            int r5 = r5.mo23000s()
            r11.f19776T = r5
            ub.r r5 = r11.f19788e
            r5.mo23007z(r6)
            ub.r r5 = r11.f19788e
            r0.mo20631b(r4, r5)
            int r5 = r11.f19775S
            int r5 = r5 + r4
            r11.f19775S = r5
            goto L_0x025c
        L_0x029f:
            ub.r r7 = r11.f19793j
            int r8 = r7.f21040c
            int r7 = r7.f21039b
            int r8 = r8 - r7
            if (r8 <= 0) goto L_0x02b2
            int r5 = java.lang.Math.min(r5, r8)
            ub.r r7 = r11.f19793j
            r0.mo20631b(r5, r7)
            goto L_0x02b6
        L_0x02b2:
            int r5 = r0.mo20630a(r13, r5, r6)
        L_0x02b6:
            int r7 = r11.f19774R
            int r7 = r7 + r5
            r11.f19774R = r7
            int r7 = r11.f19775S
            int r7 = r7 + r5
            r11.f19775S = r7
            int r7 = r11.f19776T
            int r7 = r7 - r5
            r11.f19776T = r7
            goto L_0x025c
        L_0x02c6:
            java.lang.String r12 = r14.f19837b
            java.lang.String r13 = "A_VORBIS"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x02df
            ub.r r12 = r11.f19791h
            r12.mo23007z(r6)
            ub.r r12 = r11.f19791h
            r0.mo20631b(r4, r12)
            int r12 = r11.f19775S
            int r12 = r12 + r4
            r11.f19775S = r12
        L_0x02df:
            int r12 = r11.f19775S
            r11.mo22266j()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p238ra.C6279d.mo22268l(int, ma.e, ra.d$b):int");
    }

    /* renamed from: m */
    public final void mo22269m(C5732e eVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        C6803r rVar = this.f19794k;
        byte[] bArr2 = rVar.f21038a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            rVar.mo23005x(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        eVar.mo21581h(bArr.length, i, this.f19794k.f21038a, false);
        this.f19794k.mo23007z(0);
        this.f19794k.mo23006y(length);
    }

    public final void release() {
    }
}
