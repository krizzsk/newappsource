package p290vb;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C3937b;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.C3942d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import h60.C17327j1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p054d0.C4280f0;
import p054d0.C4314v;
import p066e0.C4419c0;
import p099ga.C4865c1;
import p099ga.C4954z0;
import p137ja.C5413d;
import p137ja.C5414e;
import p161la.C5653b;
import p161la.C5654c;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6792n;
import p290vb.C6942h;
import p290vb.C6953n;
import p304x.C7041e;
import p304x.C7109v;
import p314xa.C7191i;
import p316y.C7218m;
import p316y.C7219n;
import p431cy.C16525b;
import p583jk.C17875h;
import p583jk.C17884p;

/* renamed from: vb.d */
public final class C6936d extends MediaCodecRenderer {

    /* renamed from: E1 */
    public static final int[] f21621E1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: F1 */
    public static boolean f21622F1;

    /* renamed from: G1 */
    public static boolean f21623G1;

    /* renamed from: A1 */
    public boolean f21624A1;

    /* renamed from: B1 */
    public int f21625B1;

    /* renamed from: C1 */
    public C6938b f21626C1;

    /* renamed from: D1 */
    public C6941g f21627D1;

    /* renamed from: V0 */
    public final Context f21628V0;

    /* renamed from: W0 */
    public final C6942h f21629W0;

    /* renamed from: X0 */
    public final C6953n.C6954a f21630X0;

    /* renamed from: Y0 */
    public final long f21631Y0 = InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS;

    /* renamed from: Z0 */
    public final int f21632Z0 = 50;

    /* renamed from: a1 */
    public final boolean f21633a1;

    /* renamed from: b1 */
    public C6937a f21634b1;

    /* renamed from: c1 */
    public boolean f21635c1;

    /* renamed from: d1 */
    public boolean f21636d1;

    /* renamed from: e1 */
    public Surface f21637e1;

    /* renamed from: f1 */
    public DummySurface f21638f1;

    /* renamed from: g1 */
    public boolean f21639g1;

    /* renamed from: h1 */
    public int f21640h1;

    /* renamed from: i1 */
    public boolean f21641i1;

    /* renamed from: j1 */
    public boolean f21642j1;

    /* renamed from: k1 */
    public boolean f21643k1;

    /* renamed from: l1 */
    public long f21644l1;

    /* renamed from: m1 */
    public long f21645m1;

    /* renamed from: n1 */
    public long f21646n1;

    /* renamed from: o1 */
    public int f21647o1;

    /* renamed from: p1 */
    public int f21648p1;

    /* renamed from: q1 */
    public int f21649q1;

    /* renamed from: r1 */
    public long f21650r1;

    /* renamed from: s1 */
    public long f21651s1;

    /* renamed from: t1 */
    public long f21652t1;

    /* renamed from: u1 */
    public int f21653u1;

    /* renamed from: v1 */
    public int f21654v1;

    /* renamed from: w1 */
    public int f21655w1;

    /* renamed from: x1 */
    public int f21656x1;

    /* renamed from: y1 */
    public float f21657y1;

    /* renamed from: z1 */
    public C6955o f21658z1;

    /* renamed from: vb.d$a */
    public static final class C6937a {

        /* renamed from: a */
        public final int f21659a;

        /* renamed from: b */
        public final int f21660b;

        /* renamed from: c */
        public final int f21661c;

        public C6937a(int i, int i2, int i3) {
            this.f21659a = i;
            this.f21660b = i2;
            this.f21661c = i3;
        }
    }

    /* renamed from: vb.d$b */
    public final class C6938b implements C3937b.C3940c, Handler.Callback {

        /* renamed from: b */
        public final Handler f21662b;

        public C6938b(C3937b bVar) {
            Handler i = C6774a0.m15949i(this);
            this.f21662b = i;
            bVar.mo16062c(this, i);
        }

        /* renamed from: a */
        public final void mo23184a(long j) {
            C6936d dVar = C6936d.this;
            if (this == dVar.f21626C1) {
                if (j == Long.MAX_VALUE) {
                    dVar.f13780L0 = true;
                    return;
                }
                try {
                    dVar.mo16052s0(j);
                    dVar.mo23175B0();
                    dVar.f13790Q0.getClass();
                    dVar.mo23174A0();
                    dVar.mo16041c0(j);
                } catch (ExoPlaybackException e) {
                    C6936d.this.f13788P0 = e;
                }
            }
        }

        /* renamed from: b */
        public final void mo23185b(long j) {
            if (C6774a0.f20959a < 30) {
                this.f21662b.sendMessageAtFrontOfQueue(Message.obtain(this.f21662b, 0, (int) (j >> 32), (int) j));
                return;
            }
            mo23184a(j);
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = C6774a0.f20959a;
            mo23184a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
            return true;
        }
    }

    public C6936d(Context context, Handler handler, C4865c1.C4867b bVar) {
        super(2, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f21628V0 = applicationContext;
        this.f21629W0 = new C6942h(applicationContext);
        this.f21630X0 = new C6953n.C6954a(handler, bVar);
        this.f21633a1 = "NVIDIA".equals(C6774a0.f20961c);
        this.f21645m1 = -9223372036854775807L;
        this.f21654v1 = -1;
        this.f21655w1 = -1;
        this.f21657y1 = -1.0f;
        this.f21640h1 = 1;
        this.f21625B1 = 0;
        this.f21658z1 = null;
    }

    /* renamed from: u0 */
    public static boolean m16358u0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C6936d.class) {
            if (!f21622F1) {
                f21623G1 = m16359v0();
                f21622F1 = true;
            }
        }
        return f21623G1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07d4, code lost:
        if (r0.equals("NX573J") == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0836, code lost:
        if (r0.equals("AFTN") == false) goto L_0x082e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0852, code lost:
        return true;
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m16359v0() {
        /*
            int r0 = p277ub.C6774a0.f20959a
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 28
            r6 = 2
            r7 = -1
            r8 = 0
            r9 = 1
            if (r0 > r5) goto L_0x006d
            java.lang.String r10 = p277ub.C6774a0.f20960b
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x005e;
                case -1220081023: goto L_0x0053;
                case -1220066608: goto L_0x0048;
                case -1012436106: goto L_0x003d;
                case -64886864: goto L_0x0032;
                case 3415681: goto L_0x0027;
                case 825323514: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            r10 = -1
            goto L_0x0068
        L_0x001c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0025
            goto L_0x001a
        L_0x0025:
            r10 = 6
            goto L_0x0068
        L_0x0027:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0030
            goto L_0x001a
        L_0x0030:
            r10 = 5
            goto L_0x0068
        L_0x0032:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x003b
            goto L_0x001a
        L_0x003b:
            r10 = 4
            goto L_0x0068
        L_0x003d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            r10 = 3
            goto L_0x0068
        L_0x0048:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0051
            goto L_0x001a
        L_0x0051:
            r10 = 2
            goto L_0x0068
        L_0x0053:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x005c
            goto L_0x001a
        L_0x005c:
            r10 = 1
            goto L_0x0068
        L_0x005e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0067
            goto L_0x001a
        L_0x0067:
            r10 = 0
        L_0x0068:
            switch(r10) {
                case 0: goto L_0x006c;
                case 1: goto L_0x006c;
                case 2: goto L_0x006c;
                case 3: goto L_0x006c;
                case 4: goto L_0x006c;
                case 5: goto L_0x006c;
                case 6: goto L_0x006c;
                default: goto L_0x006b;
            }
        L_0x006b:
            goto L_0x006d
        L_0x006c:
            return r9
        L_0x006d:
            r10 = 27
            if (r0 > r10) goto L_0x007c
            java.lang.String r11 = p277ub.C6774a0.f20960b
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x007c
            return r9
        L_0x007c:
            r11 = 26
            if (r0 > r11) goto L_0x0853
            java.lang.String r0 = p277ub.C6774a0.f20960b
            r0.getClass()
            int r12 = r0.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x0814;
                case -2144781185: goto L_0x0808;
                case -2144781160: goto L_0x07fc;
                case -2097309513: goto L_0x07f0;
                case -2022874474: goto L_0x07e4;
                case -1978993182: goto L_0x07d8;
                case -1978990237: goto L_0x07ce;
                case -1936688988: goto L_0x07c2;
                case -1936688066: goto L_0x07b5;
                case -1936688065: goto L_0x07a7;
                case -1931988508: goto L_0x0799;
                case -1885099851: goto L_0x078b;
                case -1696512866: goto L_0x077d;
                case -1680025915: goto L_0x076f;
                case -1615810839: goto L_0x0761;
                case -1600724499: goto L_0x0753;
                case -1554255044: goto L_0x0744;
                case -1481772737: goto L_0x0736;
                case -1481772730: goto L_0x0728;
                case -1481772729: goto L_0x071a;
                case -1320080169: goto L_0x070c;
                case -1217592143: goto L_0x06fe;
                case -1180384755: goto L_0x06f0;
                case -1139198265: goto L_0x06e2;
                case -1052835013: goto L_0x06d4;
                case -993250464: goto L_0x06c6;
                case -993250458: goto L_0x06b8;
                case -965403638: goto L_0x06aa;
                case -958336948: goto L_0x069c;
                case -879245230: goto L_0x068e;
                case -842500323: goto L_0x0680;
                case -821392978: goto L_0x0672;
                case -797483286: goto L_0x0664;
                case -794946968: goto L_0x0655;
                case -788334647: goto L_0x0646;
                case -782144577: goto L_0x0638;
                case -575125681: goto L_0x062a;
                case -521118391: goto L_0x061c;
                case -430914369: goto L_0x060e;
                case -290434366: goto L_0x0600;
                case -282781963: goto L_0x05f2;
                case -277133239: goto L_0x05e4;
                case -173639913: goto L_0x05d6;
                case -56598463: goto L_0x05c7;
                case 2126: goto L_0x05b9;
                case 2564: goto L_0x05ab;
                case 2715: goto L_0x059d;
                case 2719: goto L_0x058f;
                case 3091: goto L_0x0581;
                case 3483: goto L_0x0573;
                case 73405: goto L_0x0565;
                case 75537: goto L_0x0557;
                case 75739: goto L_0x0549;
                case 76779: goto L_0x053b;
                case 78669: goto L_0x052d;
                case 79305: goto L_0x051f;
                case 80618: goto L_0x0511;
                case 88274: goto L_0x0503;
                case 98846: goto L_0x04f5;
                case 98848: goto L_0x04e7;
                case 99329: goto L_0x04d9;
                case 101481: goto L_0x04cb;
                case 1513190: goto L_0x04bd;
                case 1514184: goto L_0x04af;
                case 1514185: goto L_0x04a1;
                case 2133089: goto L_0x0493;
                case 2133091: goto L_0x0485;
                case 2133120: goto L_0x0477;
                case 2133151: goto L_0x0469;
                case 2133182: goto L_0x045b;
                case 2133184: goto L_0x044d;
                case 2436959: goto L_0x043f;
                case 2463773: goto L_0x0431;
                case 2464648: goto L_0x0423;
                case 2689555: goto L_0x0415;
                case 3154429: goto L_0x0407;
                case 3284551: goto L_0x03f9;
                case 3351335: goto L_0x03eb;
                case 3386211: goto L_0x03dd;
                case 41325051: goto L_0x03cf;
                case 51349633: goto L_0x03c1;
                case 51350594: goto L_0x03b3;
                case 55178625: goto L_0x03a5;
                case 61542055: goto L_0x0397;
                case 65355429: goto L_0x0389;
                case 66214468: goto L_0x037b;
                case 66214470: goto L_0x036d;
                case 66214473: goto L_0x035f;
                case 66215429: goto L_0x0351;
                case 66215431: goto L_0x0343;
                case 66215433: goto L_0x0335;
                case 66216390: goto L_0x0327;
                case 76402249: goto L_0x0319;
                case 76404105: goto L_0x030b;
                case 76404911: goto L_0x02fd;
                case 80963634: goto L_0x02ef;
                case 82882791: goto L_0x02e1;
                case 98715550: goto L_0x02d3;
                case 101370885: goto L_0x02c5;
                case 102844228: goto L_0x02b7;
                case 165221241: goto L_0x02a9;
                case 182191441: goto L_0x029b;
                case 245388979: goto L_0x028d;
                case 287431619: goto L_0x027f;
                case 307593612: goto L_0x0271;
                case 308517133: goto L_0x0263;
                case 316215098: goto L_0x0255;
                case 316215116: goto L_0x0247;
                case 316246811: goto L_0x0239;
                case 316246818: goto L_0x022b;
                case 407160593: goto L_0x021d;
                case 507412548: goto L_0x020f;
                case 793982701: goto L_0x0201;
                case 794038622: goto L_0x01f3;
                case 794040393: goto L_0x01e5;
                case 835649806: goto L_0x01d7;
                case 917340916: goto L_0x01c9;
                case 958008161: goto L_0x01bb;
                case 1060579533: goto L_0x01ad;
                case 1150207623: goto L_0x019f;
                case 1176899427: goto L_0x0191;
                case 1280332038: goto L_0x0183;
                case 1306947716: goto L_0x0175;
                case 1349174697: goto L_0x0167;
                case 1522194893: goto L_0x0158;
                case 1691543273: goto L_0x014a;
                case 1691544261: goto L_0x013c;
                case 1709443163: goto L_0x012e;
                case 1865889110: goto L_0x0120;
                case 1906253259: goto L_0x0112;
                case 1977196784: goto L_0x0104;
                case 2006372676: goto L_0x00f7;
                case 2019281702: goto L_0x00ea;
                case 2029784656: goto L_0x00dd;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c3;
                case 2047190025: goto L_0x00b6;
                case 2047252157: goto L_0x00a9;
                case 2048319463: goto L_0x009c;
                case 2048855701: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r1 = -1
            goto L_0x081f
        L_0x008f:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x008c
        L_0x0098:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x081f
        L_0x009c:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x008c
        L_0x00a5:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x081f
        L_0x00a9:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x008c
        L_0x00b2:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x081f
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x008c
        L_0x00bf:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x081f
        L_0x00c3:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x081f
        L_0x00d0:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x008c
        L_0x00d9:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x081f
        L_0x00dd:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x008c
        L_0x00e6:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x081f
        L_0x00ea:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x008c
        L_0x00f3:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x081f
        L_0x00f7:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x008c
        L_0x0100:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x081f
        L_0x0104:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010e
            goto L_0x008c
        L_0x010e:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x081f
        L_0x0112:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011c
            goto L_0x008c
        L_0x011c:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x081f
        L_0x0120:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x012a
            goto L_0x008c
        L_0x012a:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x081f
        L_0x012e:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0138
            goto L_0x008c
        L_0x0138:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x081f
        L_0x013c:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0146
            goto L_0x008c
        L_0x0146:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x081f
        L_0x014a:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x008c
        L_0x0154:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x081f
        L_0x0158:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0163
            goto L_0x008c
        L_0x0163:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x081f
        L_0x0167:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0171
            goto L_0x008c
        L_0x0171:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x081f
        L_0x0175:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017f
            goto L_0x008c
        L_0x017f:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x081f
        L_0x0183:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018d
            goto L_0x008c
        L_0x018d:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x081f
        L_0x0191:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x019b
            goto L_0x008c
        L_0x019b:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x081f
        L_0x019f:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a9
            goto L_0x008c
        L_0x01a9:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x081f
        L_0x01ad:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b7
            goto L_0x008c
        L_0x01b7:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x081f
        L_0x01bb:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c5
            goto L_0x008c
        L_0x01c5:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x081f
        L_0x01c9:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d3
            goto L_0x008c
        L_0x01d3:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x081f
        L_0x01d7:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01e1
            goto L_0x008c
        L_0x01e1:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x081f
        L_0x01e5:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ef
            goto L_0x008c
        L_0x01ef:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x081f
        L_0x01f3:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fd
            goto L_0x008c
        L_0x01fd:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x081f
        L_0x0201:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x020b
            goto L_0x008c
        L_0x020b:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x081f
        L_0x020f:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0219
            goto L_0x008c
        L_0x0219:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x081f
        L_0x021d:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0227
            goto L_0x008c
        L_0x0227:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x081f
        L_0x022b:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0235
            goto L_0x008c
        L_0x0235:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x081f
        L_0x0239:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0243
            goto L_0x008c
        L_0x0243:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x081f
        L_0x0247:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0251
            goto L_0x008c
        L_0x0251:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x081f
        L_0x0255:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025f
            goto L_0x008c
        L_0x025f:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x081f
        L_0x0263:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026d
            goto L_0x008c
        L_0x026d:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x081f
        L_0x0271:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x027b
            goto L_0x008c
        L_0x027b:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x081f
        L_0x027f:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0289
            goto L_0x008c
        L_0x0289:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x081f
        L_0x028d:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0297
            goto L_0x008c
        L_0x0297:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x081f
        L_0x029b:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a5
            goto L_0x008c
        L_0x02a5:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x081f
        L_0x02a9:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b3
            goto L_0x008c
        L_0x02b3:
            r1 = 100
            goto L_0x081f
        L_0x02b7:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02c1
            goto L_0x008c
        L_0x02c1:
            r1 = 99
            goto L_0x081f
        L_0x02c5:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cf
            goto L_0x008c
        L_0x02cf:
            r1 = 98
            goto L_0x081f
        L_0x02d3:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02dd
            goto L_0x008c
        L_0x02dd:
            r1 = 97
            goto L_0x081f
        L_0x02e1:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02eb
            goto L_0x008c
        L_0x02eb:
            r1 = 96
            goto L_0x081f
        L_0x02ef:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f9
            goto L_0x008c
        L_0x02f9:
            r1 = 95
            goto L_0x081f
        L_0x02fd:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0307
            goto L_0x008c
        L_0x0307:
            r1 = 94
            goto L_0x081f
        L_0x030b:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0315
            goto L_0x008c
        L_0x0315:
            r1 = 93
            goto L_0x081f
        L_0x0319:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0323
            goto L_0x008c
        L_0x0323:
            r1 = 92
            goto L_0x081f
        L_0x0327:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0331
            goto L_0x008c
        L_0x0331:
            r1 = 91
            goto L_0x081f
        L_0x0335:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033f
            goto L_0x008c
        L_0x033f:
            r1 = 90
            goto L_0x081f
        L_0x0343:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034d
            goto L_0x008c
        L_0x034d:
            r1 = 89
            goto L_0x081f
        L_0x0351:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x035b
            goto L_0x008c
        L_0x035b:
            r1 = 88
            goto L_0x081f
        L_0x035f:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0369
            goto L_0x008c
        L_0x0369:
            r1 = 87
            goto L_0x081f
        L_0x036d:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0377
            goto L_0x008c
        L_0x0377:
            r1 = 86
            goto L_0x081f
        L_0x037b:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0385
            goto L_0x008c
        L_0x0385:
            r1 = 85
            goto L_0x081f
        L_0x0389:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0393
            goto L_0x008c
        L_0x0393:
            r1 = 84
            goto L_0x081f
        L_0x0397:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03a1
            goto L_0x008c
        L_0x03a1:
            r1 = 83
            goto L_0x081f
        L_0x03a5:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03af
            goto L_0x008c
        L_0x03af:
            r1 = 82
            goto L_0x081f
        L_0x03b3:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bd
            goto L_0x008c
        L_0x03bd:
            r1 = 81
            goto L_0x081f
        L_0x03c1:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03cb
            goto L_0x008c
        L_0x03cb:
            r1 = 80
            goto L_0x081f
        L_0x03cf:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d9
            goto L_0x008c
        L_0x03d9:
            r1 = 79
            goto L_0x081f
        L_0x03dd:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e7
            goto L_0x008c
        L_0x03e7:
            r1 = 78
            goto L_0x081f
        L_0x03eb:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f5
            goto L_0x008c
        L_0x03f5:
            r1 = 77
            goto L_0x081f
        L_0x03f9:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0403
            goto L_0x008c
        L_0x0403:
            r1 = 76
            goto L_0x081f
        L_0x0407:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0411
            goto L_0x008c
        L_0x0411:
            r1 = 75
            goto L_0x081f
        L_0x0415:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041f
            goto L_0x008c
        L_0x041f:
            r1 = 74
            goto L_0x081f
        L_0x0423:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042d
            goto L_0x008c
        L_0x042d:
            r1 = 73
            goto L_0x081f
        L_0x0431:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x043b
            goto L_0x008c
        L_0x043b:
            r1 = 72
            goto L_0x081f
        L_0x043f:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0449
            goto L_0x008c
        L_0x0449:
            r1 = 71
            goto L_0x081f
        L_0x044d:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0457
            goto L_0x008c
        L_0x0457:
            r1 = 70
            goto L_0x081f
        L_0x045b:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0465
            goto L_0x008c
        L_0x0465:
            r1 = 69
            goto L_0x081f
        L_0x0469:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0473
            goto L_0x008c
        L_0x0473:
            r1 = 68
            goto L_0x081f
        L_0x0477:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0481
            goto L_0x008c
        L_0x0481:
            r1 = 67
            goto L_0x081f
        L_0x0485:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048f
            goto L_0x008c
        L_0x048f:
            r1 = 66
            goto L_0x081f
        L_0x0493:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049d
            goto L_0x008c
        L_0x049d:
            r1 = 65
            goto L_0x081f
        L_0x04a1:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ab
            goto L_0x008c
        L_0x04ab:
            r1 = 64
            goto L_0x081f
        L_0x04af:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b9
            goto L_0x008c
        L_0x04b9:
            r1 = 63
            goto L_0x081f
        L_0x04bd:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c7
            goto L_0x008c
        L_0x04c7:
            r1 = 62
            goto L_0x081f
        L_0x04cb:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d5
            goto L_0x008c
        L_0x04d5:
            r1 = 61
            goto L_0x081f
        L_0x04d9:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e3
            goto L_0x008c
        L_0x04e3:
            r1 = 60
            goto L_0x081f
        L_0x04e7:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04f1
            goto L_0x008c
        L_0x04f1:
            r1 = 59
            goto L_0x081f
        L_0x04f5:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ff
            goto L_0x008c
        L_0x04ff:
            r1 = 58
            goto L_0x081f
        L_0x0503:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050d
            goto L_0x008c
        L_0x050d:
            r1 = 57
            goto L_0x081f
        L_0x0511:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x051b
            goto L_0x008c
        L_0x051b:
            r1 = 56
            goto L_0x081f
        L_0x051f:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0529
            goto L_0x008c
        L_0x0529:
            r1 = 55
            goto L_0x081f
        L_0x052d:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0537
            goto L_0x008c
        L_0x0537:
            r1 = 54
            goto L_0x081f
        L_0x053b:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0545
            goto L_0x008c
        L_0x0545:
            r1 = 53
            goto L_0x081f
        L_0x0549:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0553
            goto L_0x008c
        L_0x0553:
            r1 = 52
            goto L_0x081f
        L_0x0557:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0561
            goto L_0x008c
        L_0x0561:
            r1 = 51
            goto L_0x081f
        L_0x0565:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056f
            goto L_0x008c
        L_0x056f:
            r1 = 50
            goto L_0x081f
        L_0x0573:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057d
            goto L_0x008c
        L_0x057d:
            r1 = 49
            goto L_0x081f
        L_0x0581:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x058b
            goto L_0x008c
        L_0x058b:
            r1 = 48
            goto L_0x081f
        L_0x058f:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0599
            goto L_0x008c
        L_0x0599:
            r1 = 47
            goto L_0x081f
        L_0x059d:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a7
            goto L_0x008c
        L_0x05a7:
            r1 = 46
            goto L_0x081f
        L_0x05ab:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b5
            goto L_0x008c
        L_0x05b5:
            r1 = 45
            goto L_0x081f
        L_0x05b9:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c3
            goto L_0x008c
        L_0x05c3:
            r1 = 44
            goto L_0x081f
        L_0x05c7:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05d2
            goto L_0x008c
        L_0x05d2:
            r1 = 43
            goto L_0x081f
        L_0x05d6:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05e0
            goto L_0x008c
        L_0x05e0:
            r1 = 42
            goto L_0x081f
        L_0x05e4:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05ee
            goto L_0x008c
        L_0x05ee:
            r1 = 41
            goto L_0x081f
        L_0x05f2:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05fc
            goto L_0x008c
        L_0x05fc:
            r1 = 40
            goto L_0x081f
        L_0x0600:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x060a
            goto L_0x008c
        L_0x060a:
            r1 = 39
            goto L_0x081f
        L_0x060e:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0618
            goto L_0x008c
        L_0x0618:
            r1 = 38
            goto L_0x081f
        L_0x061c:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0626
            goto L_0x008c
        L_0x0626:
            r1 = 37
            goto L_0x081f
        L_0x062a:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0634
            goto L_0x008c
        L_0x0634:
            r1 = 36
            goto L_0x081f
        L_0x0638:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0642
            goto L_0x008c
        L_0x0642:
            r1 = 35
            goto L_0x081f
        L_0x0646:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0651
            goto L_0x008c
        L_0x0651:
            r1 = 34
            goto L_0x081f
        L_0x0655:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0660
            goto L_0x008c
        L_0x0660:
            r1 = 33
            goto L_0x081f
        L_0x0664:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x066e
            goto L_0x008c
        L_0x066e:
            r1 = 32
            goto L_0x081f
        L_0x0672:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x067c
            goto L_0x008c
        L_0x067c:
            r1 = 31
            goto L_0x081f
        L_0x0680:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x068a
            goto L_0x008c
        L_0x068a:
            r1 = 30
            goto L_0x081f
        L_0x068e:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0698
            goto L_0x008c
        L_0x0698:
            r1 = 29
            goto L_0x081f
        L_0x069c:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a6
            goto L_0x008c
        L_0x06a6:
            r1 = 28
            goto L_0x081f
        L_0x06aa:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06b4
            goto L_0x008c
        L_0x06b4:
            r1 = 27
            goto L_0x081f
        L_0x06b8:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06c2
            goto L_0x008c
        L_0x06c2:
            r1 = 26
            goto L_0x081f
        L_0x06c6:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06d0
            goto L_0x008c
        L_0x06d0:
            r1 = 25
            goto L_0x081f
        L_0x06d4:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06de
            goto L_0x008c
        L_0x06de:
            r1 = 24
            goto L_0x081f
        L_0x06e2:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06ec
            goto L_0x008c
        L_0x06ec:
            r1 = 23
            goto L_0x081f
        L_0x06f0:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06fa
            goto L_0x008c
        L_0x06fa:
            r1 = 22
            goto L_0x081f
        L_0x06fe:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0708
            goto L_0x008c
        L_0x0708:
            r1 = 21
            goto L_0x081f
        L_0x070c:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0716
            goto L_0x008c
        L_0x0716:
            r1 = 20
            goto L_0x081f
        L_0x071a:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0724
            goto L_0x008c
        L_0x0724:
            r1 = 19
            goto L_0x081f
        L_0x0728:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0732
            goto L_0x008c
        L_0x0732:
            r1 = 18
            goto L_0x081f
        L_0x0736:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0740
            goto L_0x008c
        L_0x0740:
            r1 = 17
            goto L_0x081f
        L_0x0744:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x074f
            goto L_0x008c
        L_0x074f:
            r1 = 16
            goto L_0x081f
        L_0x0753:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x075d
            goto L_0x008c
        L_0x075d:
            r1 = 15
            goto L_0x081f
        L_0x0761:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x076b
            goto L_0x008c
        L_0x076b:
            r1 = 14
            goto L_0x081f
        L_0x076f:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0779
            goto L_0x008c
        L_0x0779:
            r1 = 13
            goto L_0x081f
        L_0x077d:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0787
            goto L_0x008c
        L_0x0787:
            r1 = 12
            goto L_0x081f
        L_0x078b:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0795
            goto L_0x008c
        L_0x0795:
            r1 = 11
            goto L_0x081f
        L_0x0799:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07a3
            goto L_0x008c
        L_0x07a3:
            r1 = 10
            goto L_0x081f
        L_0x07a7:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07b1
            goto L_0x008c
        L_0x07b1:
            r1 = 9
            goto L_0x081f
        L_0x07b5:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07bf
            goto L_0x008c
        L_0x07bf:
            r1 = 8
            goto L_0x081f
        L_0x07c2:
            java.lang.String r1 = "PGN528"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07cc
            goto L_0x008c
        L_0x07cc:
            r1 = 7
            goto L_0x081f
        L_0x07ce:
            java.lang.String r2 = "NX573J"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x081f
            goto L_0x008c
        L_0x07d8:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07e2
            goto L_0x008c
        L_0x07e2:
            r1 = 5
            goto L_0x081f
        L_0x07e4:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ee
            goto L_0x008c
        L_0x07ee:
            r1 = 4
            goto L_0x081f
        L_0x07f0:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07fa
            goto L_0x008c
        L_0x07fa:
            r1 = 3
            goto L_0x081f
        L_0x07fc:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0806
            goto L_0x008c
        L_0x0806:
            r1 = 2
            goto L_0x081f
        L_0x0808:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0812
            goto L_0x008c
        L_0x0812:
            r1 = 1
            goto L_0x081f
        L_0x0814:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x081e
            goto L_0x008c
        L_0x081e:
            r1 = 0
        L_0x081f:
            switch(r1) {
                case 0: goto L_0x0852;
                case 1: goto L_0x0852;
                case 2: goto L_0x0852;
                case 3: goto L_0x0852;
                case 4: goto L_0x0852;
                case 5: goto L_0x0852;
                case 6: goto L_0x0852;
                case 7: goto L_0x0852;
                case 8: goto L_0x0852;
                case 9: goto L_0x0852;
                case 10: goto L_0x0852;
                case 11: goto L_0x0852;
                case 12: goto L_0x0852;
                case 13: goto L_0x0852;
                case 14: goto L_0x0852;
                case 15: goto L_0x0852;
                case 16: goto L_0x0852;
                case 17: goto L_0x0852;
                case 18: goto L_0x0852;
                case 19: goto L_0x0852;
                case 20: goto L_0x0852;
                case 21: goto L_0x0852;
                case 22: goto L_0x0852;
                case 23: goto L_0x0852;
                case 24: goto L_0x0852;
                case 25: goto L_0x0852;
                case 26: goto L_0x0852;
                case 27: goto L_0x0852;
                case 28: goto L_0x0852;
                case 29: goto L_0x0852;
                case 30: goto L_0x0852;
                case 31: goto L_0x0852;
                case 32: goto L_0x0852;
                case 33: goto L_0x0852;
                case 34: goto L_0x0852;
                case 35: goto L_0x0852;
                case 36: goto L_0x0852;
                case 37: goto L_0x0852;
                case 38: goto L_0x0852;
                case 39: goto L_0x0852;
                case 40: goto L_0x0852;
                case 41: goto L_0x0852;
                case 42: goto L_0x0852;
                case 43: goto L_0x0852;
                case 44: goto L_0x0852;
                case 45: goto L_0x0852;
                case 46: goto L_0x0852;
                case 47: goto L_0x0852;
                case 48: goto L_0x0852;
                case 49: goto L_0x0852;
                case 50: goto L_0x0852;
                case 51: goto L_0x0852;
                case 52: goto L_0x0852;
                case 53: goto L_0x0852;
                case 54: goto L_0x0852;
                case 55: goto L_0x0852;
                case 56: goto L_0x0852;
                case 57: goto L_0x0852;
                case 58: goto L_0x0852;
                case 59: goto L_0x0852;
                case 60: goto L_0x0852;
                case 61: goto L_0x0852;
                case 62: goto L_0x0852;
                case 63: goto L_0x0852;
                case 64: goto L_0x0852;
                case 65: goto L_0x0852;
                case 66: goto L_0x0852;
                case 67: goto L_0x0852;
                case 68: goto L_0x0852;
                case 69: goto L_0x0852;
                case 70: goto L_0x0852;
                case 71: goto L_0x0852;
                case 72: goto L_0x0852;
                case 73: goto L_0x0852;
                case 74: goto L_0x0852;
                case 75: goto L_0x0852;
                case 76: goto L_0x0852;
                case 77: goto L_0x0852;
                case 78: goto L_0x0852;
                case 79: goto L_0x0852;
                case 80: goto L_0x0852;
                case 81: goto L_0x0852;
                case 82: goto L_0x0852;
                case 83: goto L_0x0852;
                case 84: goto L_0x0852;
                case 85: goto L_0x0852;
                case 86: goto L_0x0852;
                case 87: goto L_0x0852;
                case 88: goto L_0x0852;
                case 89: goto L_0x0852;
                case 90: goto L_0x0852;
                case 91: goto L_0x0852;
                case 92: goto L_0x0852;
                case 93: goto L_0x0852;
                case 94: goto L_0x0852;
                case 95: goto L_0x0852;
                case 96: goto L_0x0852;
                case 97: goto L_0x0852;
                case 98: goto L_0x0852;
                case 99: goto L_0x0852;
                case 100: goto L_0x0852;
                case 101: goto L_0x0852;
                case 102: goto L_0x0852;
                case 103: goto L_0x0852;
                case 104: goto L_0x0852;
                case 105: goto L_0x0852;
                case 106: goto L_0x0852;
                case 107: goto L_0x0852;
                case 108: goto L_0x0852;
                case 109: goto L_0x0852;
                case 110: goto L_0x0852;
                case 111: goto L_0x0852;
                case 112: goto L_0x0852;
                case 113: goto L_0x0852;
                case 114: goto L_0x0852;
                case 115: goto L_0x0852;
                case 116: goto L_0x0852;
                case 117: goto L_0x0852;
                case 118: goto L_0x0852;
                case 119: goto L_0x0852;
                case 120: goto L_0x0852;
                case 121: goto L_0x0852;
                case 122: goto L_0x0852;
                case 123: goto L_0x0852;
                case 124: goto L_0x0852;
                case 125: goto L_0x0852;
                case 126: goto L_0x0852;
                case 127: goto L_0x0852;
                case 128: goto L_0x0852;
                case 129: goto L_0x0852;
                case 130: goto L_0x0852;
                case 131: goto L_0x0852;
                case 132: goto L_0x0852;
                case 133: goto L_0x0852;
                case 134: goto L_0x0852;
                case 135: goto L_0x0852;
                case 136: goto L_0x0852;
                case 137: goto L_0x0852;
                case 138: goto L_0x0852;
                case 139: goto L_0x0852;
                default: goto L_0x0822;
            }
        L_0x0822:
            java.lang.String r0 = p277ub.C6774a0.f20962d
            r0.getClass()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x0844;
                case 2006354: goto L_0x0839;
                case 2006367: goto L_0x0830;
                default: goto L_0x082e;
            }
        L_0x082e:
            r6 = -1
            goto L_0x084e
        L_0x0830:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x084e
            goto L_0x082e
        L_0x0839:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0842
            goto L_0x082e
        L_0x0842:
            r6 = 1
            goto L_0x084e
        L_0x0844:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x084d
            goto L_0x082e
        L_0x084d:
            r6 = 0
        L_0x084e:
            switch(r6) {
                case 0: goto L_0x0852;
                case 1: goto L_0x0852;
                case 2: goto L_0x0852;
                default: goto L_0x0851;
            }
        L_0x0851:
            goto L_0x0853
        L_0x0852:
            return r9
        L_0x0853:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6936d.m16359v0():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        return (r7 * 3) / (r2 * 2);
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m16360w0(com.google.android.exoplayer2.mediacodec.C3941c r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00b4
            if (r8 != r0) goto L_0x0007
            goto L_0x00b4
        L_0x0007:
            r6.getClass()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1851077871: goto L_0x005e;
                case -1664118616: goto L_0x0052;
                case -1662541442: goto L_0x0046;
                case 1187890754: goto L_0x003a;
                case 1331836730: goto L_0x002e;
                case 1599127256: goto L_0x0022;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = -1
            goto L_0x0069
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            r6 = 6
            goto L_0x0069
        L_0x0022:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            r6 = 5
            goto L_0x0069
        L_0x002e:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0038
            goto L_0x0014
        L_0x0038:
            r6 = 4
            goto L_0x0069
        L_0x003a:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0044
            goto L_0x0014
        L_0x0044:
            r6 = 3
            goto L_0x0069
        L_0x0046:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0050
            goto L_0x0014
        L_0x0050:
            r6 = 2
            goto L_0x0069
        L_0x0052:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x005c
            goto L_0x0014
        L_0x005c:
            r6 = 1
            goto L_0x0069
        L_0x005e:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0068
            goto L_0x0014
        L_0x0068:
            r6 = 0
        L_0x0069:
            switch(r6) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0070;
                case 2: goto L_0x006d;
                case 3: goto L_0x0070;
                case 4: goto L_0x0074;
                case 5: goto L_0x0070;
                case 6: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            return r0
        L_0x006d:
            int r7 = r7 * r8
            goto L_0x00ae
        L_0x0070:
            int r7 = r7 * r8
        L_0x0072:
            r2 = 2
            goto L_0x00ae
        L_0x0074:
            java.lang.String r6 = p277ub.C6774a0.f20962d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00b4
            java.lang.String r1 = p277ub.C6774a0.f20961c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00b4
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x009d
            boolean r5 = r5.f13858f
            if (r5 == 0) goto L_0x009d
            goto L_0x00b4
        L_0x009d:
            int r7 = r7 + 16
            int r7 = r7 + r0
            int r7 = r7 / 16
            int r8 = r8 + 16
            int r8 = r8 + r0
            int r8 = r8 / 16
            int r8 = r8 * r7
            int r8 = r8 * 16
            int r7 = r8 * 16
            goto L_0x0072
        L_0x00ae:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6936d.m16360w0(com.google.android.exoplayer2.mediacodec.c, java.lang.String, int, int):int");
    }

    /* renamed from: x0 */
    public static List<C3941c> m16361x0(C3942d dVar, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> c;
        String str = format.f13418m;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C3941c> a = dVar.mo17a(str, z, z2);
        Pattern pattern = MediaCodecUtil.f13830a;
        ArrayList arrayList = new ArrayList(a);
        Collections.sort(arrayList, new C7191i(new C17327j1(format, 5), 0));
        if ("video/dolby-vision".equals(str) && (c = MediaCodecUtil.m10533c(format)) != null) {
            int intValue = ((Integer) c.first).intValue();
            if (intValue == 16 || intValue == 256) {
                arrayList.addAll(dVar.mo17a("video/hevc", z, z2));
            } else if (intValue == 512) {
                arrayList.addAll(dVar.mo17a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: y0 */
    public static int m16362y0(Format format, C3941c cVar) {
        if (format.f13419n == -1) {
            return m16360w0(cVar, format.f13418m, format.f13423r, format.f13424s);
        }
        int size = format.f13420o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.f13420o.get(i2).length;
        }
        return format.f13419n + i;
    }

    @TargetApi(17)
    /* renamed from: A */
    public final void mo15808A() {
        try {
            mo16028I();
            mo16044i0();
            DrmSession drmSession = this.f13763D;
            if (drmSession != null) {
                drmSession.mo15954c((C3912b.C3913a) null);
            }
            this.f13763D = null;
            DummySurface dummySurface = this.f21638f1;
            if (dummySurface != null) {
                if (this.f21637e1 == dummySurface) {
                    this.f21637e1 = null;
                }
                dummySurface.release();
                this.f21638f1 = null;
            }
        } catch (Throwable th) {
            DummySurface dummySurface2 = this.f21638f1;
            if (dummySurface2 != null) {
                if (this.f21637e1 == dummySurface2) {
                    this.f21637e1 = null;
                }
                dummySurface2.release();
                this.f21638f1 = null;
            }
            throw th;
        }
    }

    /* renamed from: A0 */
    public final void mo23174A0() {
        this.f21643k1 = true;
        if (!this.f21641i1) {
            this.f21641i1 = true;
            C6953n.C6954a aVar = this.f21630X0;
            Surface surface = this.f21637e1;
            if (aVar.f21702a != null) {
                aVar.f21702a.post(new C6950k(aVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            this.f21639g1 = true;
        }
    }

    /* renamed from: B */
    public final void mo15809B() {
        this.f21647o1 = 0;
        this.f21646n1 = SystemClock.elapsedRealtime();
        this.f21651s1 = SystemClock.elapsedRealtime() * 1000;
        this.f21652t1 = 0;
        this.f21653u1 = 0;
        C6942h hVar = this.f21629W0;
        hVar.f21667d = true;
        hVar.f21675l = 0;
        hVar.f21678o = -1;
        hVar.f21676m = -1;
        hVar.mo23188b(false);
    }

    /* renamed from: B0 */
    public final void mo23175B0() {
        int i = this.f21654v1;
        if (i != -1 || this.f21655w1 != -1) {
            C6955o oVar = this.f21658z1;
            if (oVar == null || oVar.f21704a != i || oVar.f21705b != this.f21655w1 || oVar.f21706c != this.f21656x1 || oVar.f21707d != this.f21657y1) {
                C6955o oVar2 = new C6955o(i, this.f21655w1, this.f21656x1, this.f21657y1);
                this.f21658z1 = oVar2;
                C6953n.C6954a aVar = this.f21630X0;
                Handler handler = aVar.f21702a;
                if (handler != null) {
                    handler.post(new C4280f0(3, aVar, oVar2));
                }
            }
        }
    }

    /* renamed from: C */
    public final void mo15810C() {
        Surface surface;
        this.f21645m1 = -9223372036854775807L;
        mo23183z0();
        int i = this.f21653u1;
        if (i != 0) {
            C6953n.C6954a aVar = this.f21630X0;
            long j = this.f21652t1;
            Handler handler = aVar.f21702a;
            if (handler != null) {
                handler.post(new C6949j(i, j, aVar));
            }
            this.f21652t1 = 0;
            this.f21653u1 = 0;
        }
        C6942h hVar = this.f21629W0;
        hVar.f21667d = false;
        if (C6774a0.f20959a >= 30 && (surface = hVar.f21668e) != null && hVar.f21671h != BitmapDescriptorFactory.HUE_RED) {
            hVar.f21671h = BitmapDescriptorFactory.HUE_RED;
            try {
                surface.setFrameRate(BitmapDescriptorFactory.HUE_RED, 0);
            } catch (IllegalStateException e) {
                C6776b0.m15968a("Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* renamed from: C0 */
    public final void mo23176C0(C3937b bVar, int i) {
        mo23175B0();
        C17884p.m44368g("releaseOutputBuffer");
        bVar.mo16072l(i, true);
        C17884p.m44382v();
        this.f21651s1 = SystemClock.elapsedRealtime() * 1000;
        this.f13790Q0.getClass();
        this.f21648p1 = 0;
        mo23174A0();
    }

    /* renamed from: D0 */
    public final void mo23177D0(C3937b bVar, int i, long j) {
        mo23175B0();
        C17884p.m44368g("releaseOutputBuffer");
        bVar.mo16068h(i, j);
        C17884p.m44382v();
        this.f21651s1 = SystemClock.elapsedRealtime() * 1000;
        this.f13790Q0.getClass();
        this.f21648p1 = 0;
        mo23174A0();
    }

    /* renamed from: E0 */
    public final boolean mo23178E0(C3941c cVar) {
        boolean z;
        if (C6774a0.f20959a >= 23 && !this.f21624A1 && !m16358u0(cVar.f13853a)) {
            if (!cVar.f13858f) {
                return true;
            }
            Context context = this.f21628V0;
            int i = DummySurface.f14620e;
            synchronized (DummySurface.class) {
                if (!DummySurface.f14621f) {
                    DummySurface.f14620e = DummySurface.m10942b(context);
                    DummySurface.f14621f = true;
                }
                if (DummySurface.f14620e != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F0 */
    public final void mo23179F0(C3937b bVar, int i) {
        C17884p.m44368g("skipVideoBuffer");
        bVar.mo16072l(i, false);
        C17884p.m44382v();
        this.f13790Q0.getClass();
    }

    /* renamed from: G */
    public final C5414e mo15921G(C3941c cVar, Format format, Format format2) {
        int i;
        C5414e b = cVar.mo16078b(format, format2);
        int i2 = b.f17776e;
        int i3 = format2.f13423r;
        C6937a aVar = this.f21634b1;
        if (i3 > aVar.f21659a || format2.f13424s > aVar.f21660b) {
            i2 |= 256;
        }
        if (m16362y0(format2, cVar) > this.f21634b1.f21661c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = cVar.f13853a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = b.f17775d;
        }
        return new C5414e(str, format, format2, i, i4);
    }

    /* renamed from: G0 */
    public final void mo23180G0(int i) {
        C5413d dVar = this.f13790Q0;
        dVar.getClass();
        this.f21647o1 += i;
        int i2 = this.f21648p1 + i;
        this.f21648p1 = i2;
        dVar.f17771b = Math.max(i2, dVar.f17771b);
        int i3 = this.f21632Z0;
        if (i3 > 0 && this.f21647o1 >= i3) {
            mo23183z0();
        }
    }

    /* renamed from: H */
    public final MediaCodecDecoderException mo16027H(IllegalStateException illegalStateException, C3941c cVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, cVar, this.f21637e1);
    }

    /* renamed from: H0 */
    public final void mo23181H0(long j) {
        this.f13790Q0.getClass();
        this.f21652t1 += j;
        this.f21653u1++;
    }

    /* renamed from: O */
    public final boolean mo16034O() {
        return this.f21624A1 && C6774a0.f20959a < 23;
    }

    /* renamed from: P */
    public final float mo15922P(float f, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format : formatArr) {
            float f3 = format.f13425t;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* renamed from: Q */
    public final List<C3941c> mo15923Q(C3942d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return m16361x0(dVar, format, z, this.f21624A1);
    }

    @TargetApi(17)
    /* renamed from: S */
    public final C3937b.C3938a mo15924S(C3941c cVar, Format format, MediaCrypto mediaCrypto, float f) {
        C6937a aVar;
        int i;
        boolean z;
        Pair<Integer, Integer> c;
        boolean z2;
        int i2;
        Point point;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z3;
        int w0;
        C3941c cVar2 = cVar;
        Format format2 = format;
        float f2 = f;
        DummySurface dummySurface = this.f21638f1;
        if (!(dummySurface == null || dummySurface.f14622b == cVar2.f13858f)) {
            dummySurface.release();
            this.f21638f1 = null;
        }
        String str = cVar2.f13855c;
        Format[] formatArr = this.f13468h;
        formatArr.getClass();
        int i6 = format2.f13423r;
        int i7 = format2.f13424s;
        int y0 = m16362y0(format2, cVar2);
        if (formatArr.length == 1) {
            if (!(y0 == -1 || (w0 = m16360w0(cVar2, format2.f13418m, format2.f13423r, format2.f13424s)) == -1)) {
                y0 = Math.min((int) (((float) y0) * 1.5f), w0);
            }
            aVar = new C6937a(i6, i7, y0);
        } else {
            int length = formatArr.length;
            boolean z4 = false;
            for (int i8 = 0; i8 < length; i8++) {
                Format format3 = formatArr[i8];
                if (format2.f13430y != null && format3.f13430y == null) {
                    Format.C3872b bVar = new Format.C3872b(format3);
                    bVar.f13458w = format2.f13430y;
                    format3 = new Format(bVar);
                }
                if (cVar2.mo16078b(format2, format3).f17775d != 0) {
                    int i9 = format3.f13423r;
                    if (i9 == -1 || format3.f13424s == -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 |= z3;
                    i6 = Math.max(i6, i9);
                    i7 = Math.max(i7, format3.f13424s);
                    y0 = Math.max(y0, m16362y0(format3, cVar2));
                }
            }
            if (z4) {
                int i11 = format2.f13424s;
                int i12 = format2.f13423r;
                if (i11 > i12) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = i11;
                } else {
                    i2 = i12;
                }
                if (z2) {
                    i11 = i12;
                }
                float f3 = ((float) i11) / ((float) i2);
                int[] iArr2 = f21621E1;
                int i13 = 0;
                while (true) {
                    if (i13 >= 9) {
                        break;
                    }
                    int i14 = iArr2[i13];
                    int i15 = (int) (((float) i14) * f3);
                    if (i14 <= i2 || i15 <= i11) {
                        break;
                    }
                    int i16 = i11;
                    float f4 = f3;
                    if (C6774a0.f20959a >= 21) {
                        if (z2) {
                            i5 = i15;
                        } else {
                            i5 = i14;
                        }
                        if (!z2) {
                            i14 = i15;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = cVar2.f13856d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            i3 = i2;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i3 = i2;
                            point2 = new Point((((i5 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i14 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        iArr = iArr2;
                        if (cVar2.mo16081e(point2.x, point2.y, (double) format2.f13425t)) {
                            point = point3;
                            break;
                        }
                    } else {
                        i3 = i2;
                        iArr = iArr2;
                        try {
                            int i17 = (((i14 + 16) - 1) / 16) * 16;
                            int i18 = (((i15 + 16) - 1) / 16) * 16;
                            if (i17 * i18 <= MediaCodecUtil.m10538h()) {
                                if (z2) {
                                    i4 = i18;
                                } else {
                                    i4 = i17;
                                }
                                if (!z2) {
                                    i17 = i18;
                                }
                                point = new Point(i4, i17);
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                    i13++;
                    i11 = i16;
                    f3 = f4;
                    i2 = i3;
                    iArr2 = iArr;
                }
                point = null;
                if (point != null) {
                    i6 = Math.max(i6, point.x);
                    i7 = Math.max(i7, point.y);
                    y0 = Math.max(y0, m16360w0(cVar2, format2.f13418m, i6, i7));
                }
            }
            aVar = new C6937a(i6, i7, y0);
        }
        this.f21634b1 = aVar;
        boolean z5 = this.f21633a1;
        if (this.f21624A1) {
            i = this.f21625B1;
        } else {
            i = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format2.f13423r);
        mediaFormat.setInteger("height", format2.f13424s);
        C14226d.m35338E0(mediaFormat, format2.f13420o);
        float f5 = format2.f13425t;
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        C14226d.m35336C0(mediaFormat, "rotation-degrees", format2.f13426u);
        ColorInfo colorInfo = format2.f13430y;
        if (colorInfo != null) {
            C14226d.m35336C0(mediaFormat, "color-transfer", colorInfo.f14617d);
            C14226d.m35336C0(mediaFormat, "color-standard", colorInfo.f14615b);
            C14226d.m35336C0(mediaFormat, "color-range", colorInfo.f14616c);
            byte[] bArr = colorInfo.f14618e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format2.f13418m) && (c = MediaCodecUtil.m10533c(format)) != null) {
            C14226d.m35336C0(mediaFormat, Scopes.PROFILE, ((Integer) c.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f21659a);
        mediaFormat.setInteger("max-height", aVar.f21660b);
        C14226d.m35336C0(mediaFormat, "max-input-size", aVar.f21661c);
        if (C6774a0.f20959a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z5) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (this.f21637e1 == null) {
            if (mo23178E0(cVar)) {
                if (this.f21638f1 == null) {
                    this.f21638f1 = DummySurface.m10943c(this.f21628V0, cVar2.f13858f);
                }
                this.f21637e1 = this.f21638f1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new C3937b.C3938a(cVar2, mediaFormat, this.f21637e1, mediaCrypto);
    }

    @TargetApi(29)
    /* renamed from: T */
    public final void mo16036T(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f21636d1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f13650g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    C3937b bVar = this.f13775J;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    bVar.mo16067g(bundle);
                }
            }
        }
    }

    /* renamed from: X */
    public final void mo15925X(IllegalStateException illegalStateException) {
        C6776b0.m15968a("Video codec error", illegalStateException);
        C6953n.C6954a aVar = this.f21630X0;
        Handler handler = aVar.f21702a;
        if (handler != null) {
            handler.post(new C7041e(12, aVar, illegalStateException));
        }
    }

    /* renamed from: Y */
    public final void mo15926Y(long j, String str, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C6953n.C6954a aVar = this.f21630X0;
        Handler handler = aVar.f21702a;
        if (handler != null) {
            handler.post(new C6952m(aVar, str, j, j2));
        }
        this.f21635c1 = m16358u0(str);
        C3941c cVar = this.f13789Q;
        cVar.getClass();
        boolean z = false;
        if (C6774a0.f20959a >= 29 && "video/x-vnd.on2.vp9".equals(cVar.f13854b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f13856d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f21636d1 = z;
        if (C6774a0.f20959a >= 23 && this.f21624A1) {
            C3937b bVar = this.f13775J;
            bVar.getClass();
            this.f21626C1 = new C6938b(bVar);
        }
    }

    /* renamed from: Z */
    public final void mo15927Z(String str) {
        C6953n.C6954a aVar = this.f21630X0;
        Handler handler = aVar.f21702a;
        if (handler != null) {
            handler.post(new C7109v(8, aVar, str));
        }
    }

    /* renamed from: a0 */
    public final C5414e mo15929a0(C16525b bVar) throws ExoPlaybackException {
        C5414e a0 = super.mo15929a0(bVar);
        C6953n.C6954a aVar = this.f21630X0;
        Format format = (Format) bVar.f43144b;
        Handler handler = aVar.f21702a;
        if (handler != null) {
            handler.post(new C4419c0(3, aVar, format, a0));
        }
        return a0;
    }

    /* renamed from: b0 */
    public final void mo15931b0(Format format, MediaFormat mediaFormat) {
        boolean z;
        int i;
        int i2;
        C3937b bVar = this.f13775J;
        if (bVar != null) {
            bVar.mo16063d(this.f21640h1);
        }
        if (this.f21624A1) {
            this.f21654v1 = format.f13423r;
            this.f21655w1 = format.f13424s;
        } else {
            mediaFormat.getClass();
            if (!mediaFormat.containsKey("crop-right") || !mediaFormat.containsKey("crop-left") || !mediaFormat.containsKey("crop-bottom") || !mediaFormat.containsKey("crop-top")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f21654v1 = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f21655w1 = i2;
        }
        float f = format.f13427v;
        this.f21657y1 = f;
        if (C6774a0.f20959a >= 21) {
            int i3 = format.f13426u;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f21654v1;
                this.f21654v1 = this.f21655w1;
                this.f21655w1 = i4;
                this.f21657y1 = 1.0f / f;
            }
        } else {
            this.f21656x1 = format.f13426u;
        }
        C6942h hVar = this.f21629W0;
        hVar.f21669f = format.f13425t;
        C6933b bVar2 = hVar.f21664a;
        bVar2.f21605a.mo23173c();
        bVar2.f21606b.mo23173c();
        bVar2.f21607c = false;
        bVar2.f21608d = -9223372036854775807L;
        bVar2.f21609e = 0;
        hVar.mo23187a();
    }

    /* renamed from: c0 */
    public final void mo16041c0(long j) {
        super.mo16041c0(j);
        if (!this.f21624A1) {
            this.f21649q1--;
        }
    }

    /* renamed from: d0 */
    public final void mo15933d0() {
        mo23182t0();
    }

    /* renamed from: e0 */
    public final void mo15934e0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f21624A1;
        if (!z) {
            this.f21649q1++;
        }
        if (C6774a0.f20959a < 23 && z) {
            long j = decoderInputBuffer.f13649f;
            mo16052s0(j);
            mo23175B0();
            this.f13790Q0.getClass();
            mo23174A0();
            mo16041c0(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r11 != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0136, code lost:
        if ((((r5 > -30000 ? 1 : (r5 == -30000 ? 0 : -1)) < 0) && r12 > 100000) != false) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0164  */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15935g0(long r29, long r31, com.google.android.exoplayer2.mediacodec.C3937b r33, java.nio.ByteBuffer r34, int r35, int r36, int r37, long r38, boolean r40, boolean r41, com.google.android.exoplayer2.Format r42) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r3 = r33
            r4 = r35
            r5 = r38
            r33.getClass()
            long r7 = r0.f21644l1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x001a
            r0.f21644l1 = r1
        L_0x001a:
            long r7 = r0.f21650r1
            r13 = -1
            r15 = 1000(0x3e8, double:4.94E-321)
            r11 = 0
            int r17 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r17 == 0) goto L_0x00b9
            vb.h r7 = r0.f21629W0
            long r9 = r7.f21676m
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x0033
            r7.f21678o = r9
            long r8 = r7.f21677n
            r7.f21679p = r8
        L_0x0033:
            long r8 = r7.f21675l
            r19 = 1
            long r8 = r8 + r19
            r7.f21675l = r8
            vb.b r8 = r7.f21664a
            long r9 = r5 * r15
            vb.b$a r13 = r8.f21605a
            r13.mo23172b(r9)
            vb.b$a r13 = r8.f21605a
            boolean r13 = r13.mo23171a()
            if (r13 == 0) goto L_0x004f
            r8.f21607c = r11
            goto L_0x008b
        L_0x004f:
            long r13 = r8.f21608d
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r21 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r21 == 0) goto L_0x008b
            boolean r13 = r8.f21607c
            if (r13 == 0) goto L_0x0077
            vb.b$a r13 = r8.f21606b
            long r11 = r13.f21613d
            r21 = 0
            int r23 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x006a
            r11 = 0
            goto L_0x0075
        L_0x006a:
            boolean[] r13 = r13.f21616g
            long r11 = r11 - r19
            r19 = 15
            long r11 = r11 % r19
            int r12 = (int) r11
            boolean r11 = r13[r12]
        L_0x0075:
            if (r11 == 0) goto L_0x0083
        L_0x0077:
            vb.b$a r11 = r8.f21606b
            r11.mo23173c()
            vb.b$a r11 = r8.f21606b
            long r12 = r8.f21608d
            r11.mo23172b(r12)
        L_0x0083:
            r11 = 1
            r8.f21607c = r11
            vb.b$a r11 = r8.f21606b
            r11.mo23172b(r9)
        L_0x008b:
            boolean r11 = r8.f21607c
            if (r11 == 0) goto L_0x00a2
            vb.b$a r11 = r8.f21606b
            boolean r11 = r11.mo23171a()
            if (r11 == 0) goto L_0x00a2
            vb.b$a r11 = r8.f21605a
            vb.b$a r12 = r8.f21606b
            r8.f21605a = r12
            r8.f21606b = r11
            r11 = 0
            r8.f21607c = r11
        L_0x00a2:
            r8.f21608d = r9
            vb.b$a r9 = r8.f21605a
            boolean r9 = r9.mo23171a()
            if (r9 == 0) goto L_0x00ae
            r9 = 0
            goto L_0x00b2
        L_0x00ae:
            int r9 = r8.f21609e
            r10 = 1
            int r9 = r9 + r10
        L_0x00b2:
            r8.f21609e = r9
            r7.mo23187a()
            r0.f21650r1 = r5
        L_0x00b9:
            long r7 = r0.f13794S0
            long r22 = r5 - r7
            if (r40 == 0) goto L_0x00c6
            if (r41 != 0) goto L_0x00c6
            r0.mo23179F0(r3, r4)
            r1 = 1
            return r1
        L_0x00c6:
            float r9 = r0.f13771H
            double r9 = (double) r9
            int r11 = r0.f13466f
            r12 = 2
            if (r11 != r12) goto L_0x00d0
            r11 = 1
            goto L_0x00d1
        L_0x00d0:
            r11 = 0
        L_0x00d1:
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r12 = r12 * r15
            long r5 = r5 - r1
            double r5 = (double) r5
            double r5 = r5 / r9
            long r5 = (long) r5
            if (r11 == 0) goto L_0x00e0
            long r9 = r12 - r31
            long r5 = r5 - r9
        L_0x00e0:
            android.view.Surface r9 = r0.f21637e1
            com.google.android.exoplayer2.video.DummySurface r10 = r0.f21638f1
            r19 = -30000(0xffffffffffff8ad0, double:NaN)
            if (r9 != r10) goto L_0x00fb
            int r1 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ee
            r1 = 1
            goto L_0x00ef
        L_0x00ee:
            r1 = 0
        L_0x00ef:
            if (r1 == 0) goto L_0x00f9
            r0.mo23179F0(r3, r4)
            r0.mo23181H0(r5)
            r1 = 1
            return r1
        L_0x00f9:
            r1 = 0
            return r1
        L_0x00fb:
            long r9 = r0.f21651s1
            long r12 = r12 - r9
            boolean r9 = r0.f21643k1
            if (r9 != 0) goto L_0x0109
            if (r11 != 0) goto L_0x010d
            boolean r9 = r0.f21642j1
            if (r9 == 0) goto L_0x010f
            goto L_0x010d
        L_0x0109:
            boolean r9 = r0.f21641i1
            if (r9 != 0) goto L_0x010f
        L_0x010d:
            r9 = 1
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            long r14 = r0.f21645m1
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r21 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r21 != 0) goto L_0x013a
            int r14 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r14 < 0) goto L_0x013a
            if (r9 != 0) goto L_0x0138
            if (r11 == 0) goto L_0x013a
            int r7 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x0129
            r7 = 1
            goto L_0x012a
        L_0x0129:
            r7 = 0
        L_0x012a:
            if (r7 == 0) goto L_0x0135
            r7 = 100000(0x186a0, double:4.94066E-319)
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0135
            r7 = 1
            goto L_0x0136
        L_0x0135:
            r7 = 0
        L_0x0136:
            if (r7 == 0) goto L_0x013a
        L_0x0138:
            r7 = 1
            goto L_0x013b
        L_0x013a:
            r7 = 0
        L_0x013b:
            r8 = 21
            if (r7 == 0) goto L_0x0164
            long r1 = java.lang.System.nanoTime()
            vb.g r7 = r0.f21627D1
            if (r7 == 0) goto L_0x0154
            android.media.MediaFormat r9 = r0.f13779L
            r21 = r7
            r24 = r1
            r26 = r42
            r27 = r9
            r21.mo20428a(r22, r24, r26, r27)
        L_0x0154:
            int r7 = p277ub.C6774a0.f20959a
            if (r7 < r8) goto L_0x015c
            r0.mo23177D0(r3, r4, r1)
            goto L_0x015f
        L_0x015c:
            r0.mo23176C0(r3, r4)
        L_0x015f:
            r0.mo23181H0(r5)
            r1 = 1
            return r1
        L_0x0164:
            if (r11 == 0) goto L_0x0304
            long r9 = r0.f21644l1
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x016e
            goto L_0x0304
        L_0x016e:
            long r9 = java.lang.System.nanoTime()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r11
            long r5 = r5 + r9
            vb.h r7 = r0.f21629W0
            long r11 = r7.f21678o
            r15 = -1
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x01d7
            vb.b r11 = r7.f21664a
            boolean r11 = r11.mo23170a()
            if (r11 == 0) goto L_0x01d7
            vb.b r11 = r7.f21664a
            boolean r12 = r11.mo23170a()
            if (r12 == 0) goto L_0x01a2
            vb.b$a r11 = r11.f21605a
            long r12 = r11.f21614e
            r15 = 0
            int r21 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r21 != 0) goto L_0x019e
            r14 = 0
            goto L_0x01a7
        L_0x019e:
            long r14 = r11.f21615f
            long r14 = r14 / r12
            goto L_0x01a7
        L_0x01a2:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01a7:
            long r11 = r7.f21679p
            r38 = r9
            long r8 = r7.f21675l
            long r3 = r7.f21678o
            long r8 = r8 - r3
            long r8 = r8 * r14
            float r3 = (float) r8
            float r4 = r7.f21672i
            float r3 = r3 / r4
            long r3 = (long) r3
            long r11 = r11 + r3
            long r3 = r5 - r11
            long r3 = java.lang.Math.abs(r3)
            r8 = 20000000(0x1312d00, double:9.881313E-317)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x01c7
            r3 = 1
            goto L_0x01c8
        L_0x01c7:
            r3 = 0
        L_0x01c8:
            if (r3 == 0) goto L_0x01cc
            r5 = r11
            goto L_0x01d9
        L_0x01cc:
            r3 = 0
            r7.f21675l = r3
            r3 = -1
            r7.f21678o = r3
            r7.f21676m = r3
            goto L_0x01d9
        L_0x01d7:
            r38 = r9
        L_0x01d9:
            long r3 = r7.f21675l
            r7.f21676m = r3
            r7.f21677n = r5
            vb.h$d r3 = r7.f21666c
            if (r3 == 0) goto L_0x0218
            long r8 = r7.f21673j
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x01ef
            goto L_0x0218
        L_0x01ef:
            long r3 = r3.f21684b
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x01f6
            goto L_0x0218
        L_0x01f6:
            long r8 = r7.f21673j
            long r10 = r5 - r3
            long r10 = r10 / r8
            long r10 = r10 * r8
            long r10 = r10 + r3
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x0205
            long r3 = r10 - r8
            goto L_0x0208
        L_0x0205:
            long r8 = r8 + r10
            r3 = r10
            r10 = r8
        L_0x0208:
            long r8 = r10 - r5
            long r5 = r5 - r3
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0210
            goto L_0x0211
        L_0x0210:
            r10 = r3
        L_0x0211:
            long r3 = r7.f21674k
            long r10 = r10 - r3
            r3 = r38
            r5 = r10
            goto L_0x021a
        L_0x0218:
            r3 = r38
        L_0x021a:
            long r3 = r5 - r3
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r7
            long r7 = r0.f21645m1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x022c
            r7 = 1
            goto L_0x022d
        L_0x022c:
            r7 = 0
        L_0x022d:
            r8 = -500000(0xfffffffffff85ee0, double:NaN)
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x0236
            r8 = 1
            goto L_0x0237
        L_0x0236:
            r8 = 0
        L_0x0237:
            if (r8 == 0) goto L_0x023d
            if (r41 != 0) goto L_0x023d
            r8 = 1
            goto L_0x023e
        L_0x023d:
            r8 = 0
        L_0x023e:
            if (r8 == 0) goto L_0x026c
            gb.b0 r8 = r0.f13467g
            r8.getClass()
            long r9 = r0.f13469i
            long r1 = r1 - r9
            int r1 = r8.mo20650c(r1)
            if (r1 != 0) goto L_0x0250
            r1 = 0
            goto L_0x0268
        L_0x0250:
            ja.d r2 = r0.f13790Q0
            r2.getClass()
            int r2 = r0.f21649q1
            int r2 = r2 + r1
            if (r7 == 0) goto L_0x025b
            goto L_0x025e
        L_0x025b:
            r0.mo23180G0(r2)
        L_0x025e:
            boolean r1 = r28.mo16032M()
            if (r1 == 0) goto L_0x0267
            r28.mo16038V()
        L_0x0267:
            r1 = 1
        L_0x0268:
            if (r1 == 0) goto L_0x026c
            r1 = 0
            return r1
        L_0x026c:
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x0272
            r1 = 1
            goto L_0x0273
        L_0x0272:
            r1 = 0
        L_0x0273:
            if (r1 == 0) goto L_0x0279
            if (r41 != 0) goto L_0x0279
            r1 = 1
            goto L_0x027a
        L_0x0279:
            r1 = 0
        L_0x027a:
            if (r1 == 0) goto L_0x029f
            if (r7 == 0) goto L_0x0287
            r1 = r33
            r2 = r35
            r0.mo23179F0(r1, r2)
            r1 = 1
            goto L_0x029b
        L_0x0287:
            r1 = r33
            r2 = r35
            java.lang.String r5 = "dropVideoBuffer"
            p583jk.C17884p.m44368g(r5)
            r5 = 0
            r1.mo16072l(r2, r5)
            p583jk.C17884p.m44382v()
            r1 = 1
            r0.mo23180G0(r1)
        L_0x029b:
            r0.mo23181H0(r3)
            return r1
        L_0x029f:
            r1 = r33
            r2 = r35
            int r7 = p277ub.C6774a0.f20959a
            r8 = 21
            if (r7 < r8) goto L_0x02c9
            r7 = 50000(0xc350, double:2.47033E-319)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0302
            vb.g r7 = r0.f21627D1
            if (r7 == 0) goto L_0x02c1
            android.media.MediaFormat r8 = r0.f13779L
            r21 = r7
            r24 = r5
            r26 = r42
            r27 = r8
            r21.mo20428a(r22, r24, r26, r27)
        L_0x02c1:
            r0.mo23177D0(r1, r2, r5)
            r0.mo23181H0(r3)
            r1 = 1
            return r1
        L_0x02c9:
            r7 = 30000(0x7530, double:1.4822E-319)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0302
            r7 = 11000(0x2af8, double:5.4347E-320)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x02e9
            r7 = 10000(0x2710, double:4.9407E-320)
            long r7 = r3 - r7
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x02e0 }
            goto L_0x02e9
        L_0x02e0:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L_0x02e9:
            vb.g r7 = r0.f21627D1
            if (r7 == 0) goto L_0x02fa
            android.media.MediaFormat r8 = r0.f13779L
            r21 = r7
            r24 = r5
            r26 = r42
            r27 = r8
            r21.mo20428a(r22, r24, r26, r27)
        L_0x02fa:
            r0.mo23176C0(r1, r2)
            r0.mo23181H0(r3)
            r1 = 1
            return r1
        L_0x0302:
            r1 = 0
            return r1
        L_0x0304:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6936d.mo15935g0(long, long, com.google.android.exoplayer2.mediacodec.b, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.f21641i1 || (((dummySurface = this.f21638f1) != null && this.f21637e1 == dummySurface) || this.f13775J == null || this.f21624A1))) {
            this.f21645m1 = -9223372036854775807L;
            return true;
        } else if (this.f21645m1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f21645m1) {
                return true;
            }
            this.f21645m1 = -9223372036854775807L;
            return false;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15819j(int r9, java.lang.Object r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r0) goto L_0x003b
            r0 = 4
            if (r9 == r0) goto L_0x002a
            r0 = 6
            if (r9 == r0) goto L_0x0024
            r0 = 102(0x66, float:1.43E-43)
            if (r9 == r0) goto L_0x000f
            goto L_0x0128
        L_0x000f:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            int r10 = r8.f21625B1
            if (r10 == r9) goto L_0x0128
            r8.f21625B1 = r9
            boolean r9 = r8.f21624A1
            if (r9 == 0) goto L_0x0128
            r8.mo16044i0()
            goto L_0x0128
        L_0x0024:
            vb.g r10 = (p290vb.C6941g) r10
            r8.f21627D1 = r10
            goto L_0x0128
        L_0x002a:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.f21640h1 = r9
            com.google.android.exoplayer2.mediacodec.b r10 = r8.f13775J
            if (r10 == 0) goto L_0x0128
            r10.mo16063d(r9)
            goto L_0x0128
        L_0x003b:
            boolean r9 = r10 instanceof android.view.Surface
            r1 = 0
            if (r9 == 0) goto L_0x0043
            android.view.Surface r10 = (android.view.Surface) r10
            goto L_0x0044
        L_0x0043:
            r10 = r1
        L_0x0044:
            if (r10 != 0) goto L_0x0060
            com.google.android.exoplayer2.video.DummySurface r9 = r8.f21638f1
            if (r9 == 0) goto L_0x004c
            r10 = r9
            goto L_0x0060
        L_0x004c:
            com.google.android.exoplayer2.mediacodec.c r9 = r8.f13789Q
            if (r9 == 0) goto L_0x0060
            boolean r2 = r8.mo23178E0(r9)
            if (r2 == 0) goto L_0x0060
            android.content.Context r10 = r8.f21628V0
            boolean r9 = r9.f13858f
            com.google.android.exoplayer2.video.DummySurface r10 = com.google.android.exoplayer2.video.DummySurface.m10943c(r10, r9)
            r8.f21638f1 = r10
        L_0x0060:
            android.view.Surface r9 = r8.f21637e1
            r2 = 3
            if (r9 == r10) goto L_0x00f4
            r8.f21637e1 = r10
            vb.h r9 = r8.f21629W0
            r9.getClass()
            boolean r3 = r10 instanceof com.google.android.exoplayer2.video.DummySurface
            if (r3 == 0) goto L_0x0072
            r3 = r1
            goto L_0x0073
        L_0x0072:
            r3 = r10
        L_0x0073:
            android.view.Surface r4 = r9.f21668e
            r5 = 0
            if (r4 != r3) goto L_0x0079
            goto L_0x009a
        L_0x0079:
            int r6 = p277ub.C6774a0.f20959a
            r7 = 30
            if (r6 < r7) goto L_0x0095
            if (r4 == 0) goto L_0x0095
            float r6 = r9.f21671h
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            r9.f21671h = r7
            r4.setFrameRate(r7, r5)     // Catch:{ IllegalStateException -> 0x008f }
            goto L_0x0095
        L_0x008f:
            r4 = move-exception
            java.lang.String r6 = "Failed to call Surface.setFrameRate"
            p277ub.C6776b0.m15968a(r6, r4)
        L_0x0095:
            r9.f21668e = r3
            r9.mo23188b(r0)
        L_0x009a:
            r8.f21639g1 = r5
            int r9 = r8.f13466f
            com.google.android.exoplayer2.mediacodec.b r0 = r8.f13775J
            if (r0 == 0) goto L_0x00b8
            int r3 = p277ub.C6774a0.f20959a
            r4 = 23
            if (r3 < r4) goto L_0x00b2
            if (r10 == 0) goto L_0x00b2
            boolean r3 = r8.f21635c1
            if (r3 != 0) goto L_0x00b2
            r0.mo16065f(r10)
            goto L_0x00b8
        L_0x00b2:
            r8.mo16044i0()
            r8.mo16038V()
        L_0x00b8:
            if (r10 == 0) goto L_0x00ee
            com.google.android.exoplayer2.video.DummySurface r0 = r8.f21638f1
            if (r10 == r0) goto L_0x00ee
            vb.o r10 = r8.f21658z1
            if (r10 == 0) goto L_0x00d0
            vb.n$a r0 = r8.f21630X0
            android.os.Handler r1 = r0.f21702a
            if (r1 == 0) goto L_0x00d0
            d0.f0 r3 = new d0.f0
            r3.<init>(r2, r0, r10)
            r1.post(r3)
        L_0x00d0:
            r8.mo23182t0()
            r10 = 2
            if (r9 != r10) goto L_0x0128
            long r9 = r8.f21631Y0
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.f21631Y0
            long r9 = r9 + r0
            goto L_0x00eb
        L_0x00e6:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00eb:
            r8.f21645m1 = r9
            goto L_0x0128
        L_0x00ee:
            r8.f21658z1 = r1
            r8.mo23182t0()
            goto L_0x0128
        L_0x00f4:
            if (r10 == 0) goto L_0x0128
            com.google.android.exoplayer2.video.DummySurface r9 = r8.f21638f1
            if (r10 == r9) goto L_0x0128
            vb.o r9 = r8.f21658z1
            if (r9 == 0) goto L_0x010c
            vb.n$a r10 = r8.f21630X0
            android.os.Handler r0 = r10.f21702a
            if (r0 == 0) goto L_0x010c
            d0.f0 r1 = new d0.f0
            r1.<init>(r2, r10, r9)
            r0.post(r1)
        L_0x010c:
            boolean r9 = r8.f21639g1
            if (r9 == 0) goto L_0x0128
            vb.n$a r1 = r8.f21630X0
            android.view.Surface r2 = r8.f21637e1
            android.os.Handler r9 = r1.f21702a
            if (r9 == 0) goto L_0x0128
            long r3 = android.os.SystemClock.elapsedRealtime()
            android.os.Handler r9 = r1.f21702a
            vb.k r10 = new vb.k
            r5 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r5)
            r9.post(r10)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6936d.mo15819j(int, java.lang.Object):void");
    }

    /* renamed from: k0 */
    public final void mo16045k0() {
        super.mo16045k0();
        this.f21649q1 = 0;
    }

    /* renamed from: n0 */
    public final boolean mo16048n0(C3941c cVar) {
        return this.f21637e1 != null || mo23178E0(cVar);
    }

    /* renamed from: o */
    public final void mo15823o(float f, float f2) throws ExoPlaybackException {
        super.mo15823o(f, f2);
        C6942h hVar = this.f21629W0;
        hVar.f21672i = f;
        hVar.f21675l = 0;
        hVar.f21678o = -1;
        hVar.f21676m = -1;
        hVar.mo23188b(false);
    }

    /* renamed from: p0 */
    public final int mo15941p0(C3942d dVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 0;
        if (!C6792n.m15997j(format.f13418m)) {
            return 0;
        }
        if (format.f13421p != null) {
            z = true;
        } else {
            z = false;
        }
        List<C3941c> x0 = m16361x0(dVar, format, z, false);
        if (z && x0.isEmpty()) {
            x0 = m16361x0(dVar, format, false, false);
        }
        if (x0.isEmpty()) {
            return 1;
        }
        Class<? extends C5653b> cls = format.f13405F;
        if (cls == null || C5654c.class.equals(cls)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return 2;
        }
        C3941c cVar = x0.get(0);
        boolean c = cVar.mo16079c(format);
        if (cVar.mo16080d(format)) {
            i = 16;
        } else {
            i = 8;
        }
        if (c) {
            List<C3941c> x02 = m16361x0(dVar, format, z, true);
            if (!x02.isEmpty()) {
                C3941c cVar2 = x02.get(0);
                if (cVar2.mo16079c(format) && cVar2.mo16080d(format)) {
                    i3 = 32;
                }
            }
        }
        if (c) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        return i2 | i | i3;
    }

    /* renamed from: t0 */
    public final void mo23182t0() {
        C3937b bVar;
        this.f21641i1 = false;
        if (C6774a0.f20959a >= 23 && this.f21624A1 && (bVar = this.f13775J) != null) {
            this.f21626C1 = new C6938b(bVar);
        }
    }

    /* renamed from: x */
    public final void mo15835x() {
        this.f21658z1 = null;
        mo23182t0();
        this.f21639g1 = false;
        C6942h hVar = this.f21629W0;
        C6942h.C6943a aVar = hVar.f21665b;
        if (aVar != null) {
            aVar.mo23189a();
            C6942h.C6947d dVar = hVar.f21666c;
            dVar.getClass();
            dVar.f21685c.sendEmptyMessage(2);
        }
        this.f21626C1 = null;
        try {
            super.mo15835x();
            C6953n.C6954a aVar2 = this.f21630X0;
            C5413d dVar2 = this.f13790Q0;
            aVar2.getClass();
            synchronized (dVar2) {
            }
            Handler handler = aVar2.f21702a;
            if (handler != null) {
                handler.post(new C7218m(7, aVar2, dVar2));
            }
        } catch (Throwable th) {
            C6953n.C6954a aVar3 = this.f21630X0;
            C5413d dVar3 = this.f13790Q0;
            aVar3.getClass();
            synchronized (dVar3) {
                Handler handler2 = aVar3.f21702a;
                if (handler2 != null) {
                    handler2.post(new C7218m(7, aVar3, dVar3));
                }
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final void mo15836y(boolean z, boolean z2) throws ExoPlaybackException {
        boolean z3;
        this.f13790Q0 = new C5413d();
        C4954z0 z0Var = this.f13464d;
        z0Var.getClass();
        boolean z4 = z0Var.f16738a;
        if (!z4 || this.f21625B1 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17875h.m44304o(z3);
        if (this.f21624A1 != z4) {
            this.f21624A1 = z4;
            mo16044i0();
        }
        C6953n.C6954a aVar = this.f21630X0;
        C5413d dVar = this.f13790Q0;
        Handler handler = aVar.f21702a;
        if (handler != null) {
            handler.post(new C7219n(8, aVar, dVar));
        }
        C6942h hVar = this.f21629W0;
        if (hVar.f21665b != null) {
            C6942h.C6947d dVar2 = hVar.f21666c;
            dVar2.getClass();
            dVar2.f21685c.sendEmptyMessage(1);
            hVar.f21665b.mo23190b(new C4314v(hVar, 5));
        }
        this.f21642j1 = z2;
        this.f21643k1 = false;
    }

    /* renamed from: z */
    public final void mo15837z(long j, boolean z) throws ExoPlaybackException {
        super.mo15837z(j, z);
        mo23182t0();
        C6942h hVar = this.f21629W0;
        hVar.f21675l = 0;
        hVar.f21678o = -1;
        hVar.f21676m = -1;
        long j2 = -9223372036854775807L;
        this.f21650r1 = -9223372036854775807L;
        this.f21644l1 = -9223372036854775807L;
        this.f21648p1 = 0;
        if (z) {
            if (this.f21631Y0 > 0) {
                j2 = SystemClock.elapsedRealtime() + this.f21631Y0;
            }
            this.f21645m1 = j2;
            return;
        }
        this.f21645m1 = -9223372036854775807L;
    }

    /* renamed from: z0 */
    public final void mo23183z0() {
        if (this.f21647o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f21646n1;
            C6953n.C6954a aVar = this.f21630X0;
            int i = this.f21647o1;
            Handler handler = aVar.f21702a;
            if (handler != null) {
                handler.post(new C6951l(i, j, aVar));
            }
            this.f21647o1 = 0;
            this.f21646n1 = elapsedRealtime;
        }
    }
}
