package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.Constants;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzwx extends zzqj {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC = -1;
    private int zzD = -1;
    private int zzE;
    private float zzF = -1.0f;
    private zzcv zzG = null;
    private int zzH = 0;
    private zzwy zzI;
    private final Context zze;
    private final zzxf zzf;
    private final zzxq zzg;
    private final boolean zzh = "NVIDIA".equals(zzeg.zzc);
    private zzww zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzws zzm;
    private boolean zzn;
    private int zzo = 1;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt = -9223372036854775807L;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwx(Context context, zzqd zzqd, zzql zzql, long j, boolean z, Handler handler, zzxr zzxr, int i, float f) {
        super(2, zzqd, zzql, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzxf(applicationContext);
        Handler handler2 = handler;
        zzxr zzxr2 = zzxr;
        this.zzg = new zzxq(handler, zzxr);
    }

    public static int zzT(zzqg zzqg, zzad zzad) {
        if (zzad.zzn == -1) {
            return zzaB(zzqg, zzad);
        }
        int size = zzad.zzo.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzad.zzo.get(i2)).length;
        }
        return zzad.zzn + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x05f6, code lost:
        if (r1.equals("A10-70F") != false) goto L_0x071e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0758, code lost:
        if (r8 != 2) goto L_0x075a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzaA(java.lang.String r14) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r14 = r14.startsWith(r0)
            r0 = 0
            if (r14 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.gms.internal.ads.zzwx> r14 = com.google.android.gms.internal.ads.zzwx.class
            monitor-enter(r14)
            boolean r1 = zzc     // Catch:{ all -> 0x0762 }
            if (r1 != 0) goto L_0x075e
            int r1 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x0762 }
            r2 = 5
            r3 = 6
            r4 = 4
            r5 = 7
            r6 = 3
            r7 = 28
            r8 = -1
            r9 = 2
            r10 = 1
            if (r1 > r7) goto L_0x0081
            java.lang.String r11 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0762 }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0762 }
            switch(r12) {
                case -1339091551: goto L_0x006f;
                case -1220081023: goto L_0x0065;
                case -1220066608: goto L_0x005b;
                case -1012436106: goto L_0x0051;
                case -760312546: goto L_0x0047;
                case -64886864: goto L_0x003d;
                case 3415681: goto L_0x0033;
                case 825323514: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0079
        L_0x0029:
            java.lang.String r12 = "machuca"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 5
            goto L_0x007a
        L_0x0033:
            java.lang.String r12 = "once"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 6
            goto L_0x007a
        L_0x003d:
            java.lang.String r12 = "magnolia"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 4
            goto L_0x007a
        L_0x0047:
            java.lang.String r12 = "aquaman"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 0
            goto L_0x007a
        L_0x0051:
            java.lang.String r12 = "oneday"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 7
            goto L_0x007a
        L_0x005b:
            java.lang.String r12 = "dangalUHD"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r12 = "dangalFHD"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 3
            goto L_0x007a
        L_0x006f:
            java.lang.String r12 = "dangal"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0079
            r11 = 1
            goto L_0x007a
        L_0x0079:
            r11 = -1
        L_0x007a:
            switch(r11) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0081
        L_0x007e:
            r0 = 1
            goto L_0x075a
        L_0x0081:
            r11 = 27
            if (r1 > r11) goto L_0x0090
            java.lang.String r12 = "HWEML"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0762 }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0762 }
            if (r12 == 0) goto L_0x0090
            goto L_0x007e
        L_0x0090:
            r12 = 26
            if (r1 > r12) goto L_0x075a
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzb     // Catch:{ all -> 0x0762 }
            int r13 = r1.hashCode()     // Catch:{ all -> 0x0762 }
            switch(r13) {
                case -2144781245: goto L_0x0712;
                case -2144781185: goto L_0x0707;
                case -2144781160: goto L_0x06fc;
                case -2097309513: goto L_0x06f1;
                case -2022874474: goto L_0x06e6;
                case -1978993182: goto L_0x06db;
                case -1978990237: goto L_0x06d0;
                case -1936688988: goto L_0x06c5;
                case -1936688066: goto L_0x06ba;
                case -1936688065: goto L_0x06ae;
                case -1931988508: goto L_0x06a2;
                case -1885099851: goto L_0x0696;
                case -1696512866: goto L_0x068a;
                case -1680025915: goto L_0x067e;
                case -1615810839: goto L_0x0672;
                case -1600724499: goto L_0x0666;
                case -1554255044: goto L_0x065a;
                case -1481772737: goto L_0x064e;
                case -1481772730: goto L_0x0642;
                case -1481772729: goto L_0x0636;
                case -1320080169: goto L_0x062a;
                case -1217592143: goto L_0x061e;
                case -1180384755: goto L_0x0612;
                case -1139198265: goto L_0x0606;
                case -1052835013: goto L_0x05fa;
                case -993250464: goto L_0x05f0;
                case -993250458: goto L_0x05e5;
                case -965403638: goto L_0x05d9;
                case -958336948: goto L_0x05cd;
                case -879245230: goto L_0x05c1;
                case -842500323: goto L_0x05b5;
                case -821392978: goto L_0x05a9;
                case -797483286: goto L_0x059d;
                case -794946968: goto L_0x0591;
                case -788334647: goto L_0x0585;
                case -782144577: goto L_0x0579;
                case -575125681: goto L_0x056d;
                case -521118391: goto L_0x0561;
                case -430914369: goto L_0x0555;
                case -290434366: goto L_0x0549;
                case -282781963: goto L_0x053d;
                case -277133239: goto L_0x0531;
                case -173639913: goto L_0x0525;
                case -56598463: goto L_0x0519;
                case 2126: goto L_0x050d;
                case 2564: goto L_0x0501;
                case 2715: goto L_0x04f5;
                case 2719: goto L_0x04e9;
                case 3091: goto L_0x04dd;
                case 3483: goto L_0x04d1;
                case 73405: goto L_0x04c5;
                case 75537: goto L_0x04b9;
                case 75739: goto L_0x04ad;
                case 76779: goto L_0x04a1;
                case 78669: goto L_0x0495;
                case 79305: goto L_0x0489;
                case 80618: goto L_0x047d;
                case 88274: goto L_0x0471;
                case 98846: goto L_0x0465;
                case 98848: goto L_0x0459;
                case 99329: goto L_0x044d;
                case 101481: goto L_0x0441;
                case 1513190: goto L_0x0436;
                case 1514184: goto L_0x042b;
                case 1514185: goto L_0x0420;
                case 2133089: goto L_0x0414;
                case 2133091: goto L_0x0408;
                case 2133120: goto L_0x03fc;
                case 2133151: goto L_0x03f0;
                case 2133182: goto L_0x03e4;
                case 2133184: goto L_0x03d8;
                case 2436959: goto L_0x03cc;
                case 2463773: goto L_0x03c0;
                case 2464648: goto L_0x03b4;
                case 2689555: goto L_0x03a8;
                case 3154429: goto L_0x039c;
                case 3284551: goto L_0x0390;
                case 3351335: goto L_0x0384;
                case 3386211: goto L_0x0378;
                case 41325051: goto L_0x036c;
                case 51349633: goto L_0x0361;
                case 51350594: goto L_0x0356;
                case 55178625: goto L_0x034a;
                case 61542055: goto L_0x033f;
                case 65355429: goto L_0x0333;
                case 66214468: goto L_0x0327;
                case 66214470: goto L_0x031b;
                case 66214473: goto L_0x030f;
                case 66215429: goto L_0x0303;
                case 66215431: goto L_0x02f7;
                case 66215433: goto L_0x02eb;
                case 66216390: goto L_0x02df;
                case 76402249: goto L_0x02d3;
                case 76404105: goto L_0x02c7;
                case 76404911: goto L_0x02bb;
                case 80963634: goto L_0x02af;
                case 82882791: goto L_0x02a3;
                case 98715550: goto L_0x0297;
                case 101370885: goto L_0x028b;
                case 102844228: goto L_0x027f;
                case 165221241: goto L_0x0273;
                case 182191441: goto L_0x0267;
                case 245388979: goto L_0x025b;
                case 287431619: goto L_0x024f;
                case 307593612: goto L_0x0243;
                case 308517133: goto L_0x0237;
                case 316215098: goto L_0x022b;
                case 316215116: goto L_0x021f;
                case 316246811: goto L_0x0213;
                case 316246818: goto L_0x0207;
                case 407160593: goto L_0x01fb;
                case 507412548: goto L_0x01ef;
                case 793982701: goto L_0x01e3;
                case 794038622: goto L_0x01d7;
                case 794040393: goto L_0x01cb;
                case 835649806: goto L_0x01bf;
                case 917340916: goto L_0x01b3;
                case 958008161: goto L_0x01a7;
                case 1060579533: goto L_0x019b;
                case 1150207623: goto L_0x018f;
                case 1176899427: goto L_0x0183;
                case 1280332038: goto L_0x0177;
                case 1306947716: goto L_0x016b;
                case 1349174697: goto L_0x015f;
                case 1522194893: goto L_0x0153;
                case 1691543273: goto L_0x0147;
                case 1691544261: goto L_0x013b;
                case 1709443163: goto L_0x012f;
                case 1865889110: goto L_0x0123;
                case 1906253259: goto L_0x0117;
                case 1977196784: goto L_0x010b;
                case 2006372676: goto L_0x00ff;
                case 2019281702: goto L_0x00f3;
                case 2029784656: goto L_0x00e7;
                case 2030379515: goto L_0x00db;
                case 2033393791: goto L_0x00cf;
                case 2047190025: goto L_0x00c3;
                case 2047252157: goto L_0x00b7;
                case 2048319463: goto L_0x00ab;
                case 2048855701: goto L_0x009f;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x071d
        L_0x009f:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 66
            goto L_0x071e
        L_0x00ab:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 65
            goto L_0x071e
        L_0x00b7:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 33
            goto L_0x071e
        L_0x00c3:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 32
            goto L_0x071e
        L_0x00cf:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 14
            goto L_0x071e
        L_0x00db:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 64
            goto L_0x071e
        L_0x00e7:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 63
            goto L_0x071e
        L_0x00f3:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 29
            goto L_0x071e
        L_0x00ff:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 19
            goto L_0x071e
        L_0x010b:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 69
            goto L_0x071e
        L_0x0117:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 100
            goto L_0x071e
        L_0x0123:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x071e
        L_0x012f:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 68
            goto L_0x071e
        L_0x013b:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 24
            goto L_0x071e
        L_0x0147:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 23
            goto L_0x071e
        L_0x0153:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x071e
        L_0x015f:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 61
            goto L_0x071e
        L_0x016b:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 35
            goto L_0x071e
        L_0x0177:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 62
            goto L_0x071e
        L_0x0183:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 71
            goto L_0x071e
        L_0x018f:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 78
            goto L_0x071e
        L_0x019b:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 96
            goto L_0x071e
        L_0x01a7:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 72
            goto L_0x071e
        L_0x01b3:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 10
            goto L_0x071e
        L_0x01bf:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 81
            goto L_0x071e
        L_0x01cb:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 59
            goto L_0x071e
        L_0x01d7:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 58
            goto L_0x071e
        L_0x01e3:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 57
            goto L_0x071e
        L_0x01ef:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x071e
        L_0x01fb:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x071e
        L_0x0207:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x071e
        L_0x0213:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x071e
        L_0x021f:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x071e
        L_0x022b:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x071e
        L_0x0237:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 12
            goto L_0x071e
        L_0x0243:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 11
            goto L_0x071e
        L_0x024f:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 60
            goto L_0x071e
        L_0x025b:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 82
            goto L_0x071e
        L_0x0267:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 25
            goto L_0x071e
        L_0x0273:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 8
            goto L_0x071e
        L_0x027f:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 77
            goto L_0x071e
        L_0x028b:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 76
            goto L_0x071e
        L_0x0297:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 67
            goto L_0x071e
        L_0x02a3:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x071e
        L_0x02af:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x071e
        L_0x02bb:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x071e
        L_0x02c7:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x071e
        L_0x02d3:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x071e
        L_0x02df:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 48
            goto L_0x071e
        L_0x02eb:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 47
            goto L_0x071e
        L_0x02f7:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 46
            goto L_0x071e
        L_0x0303:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 45
            goto L_0x071e
        L_0x030f:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 44
            goto L_0x071e
        L_0x031b:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 43
            goto L_0x071e
        L_0x0327:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 42
            goto L_0x071e
        L_0x0333:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 30
            goto L_0x071e
        L_0x033f:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 7
            goto L_0x071e
        L_0x034a:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 15
            goto L_0x071e
        L_0x0356:
            java.lang.String r2 = "602LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 4
            goto L_0x071e
        L_0x0361:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 3
            goto L_0x071e
        L_0x036c:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 83
            goto L_0x071e
        L_0x0378:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 92
            goto L_0x071e
        L_0x0384:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 85
            goto L_0x071e
        L_0x0390:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 75
            goto L_0x071e
        L_0x039c:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 50
            goto L_0x071e
        L_0x03a8:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x071e
        L_0x03b4:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x071e
        L_0x03c0:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x071e
        L_0x03cc:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 93
            goto L_0x071e
        L_0x03d8:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 41
            goto L_0x071e
        L_0x03e4:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 40
            goto L_0x071e
        L_0x03f0:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 39
            goto L_0x071e
        L_0x03fc:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 38
            goto L_0x071e
        L_0x0408:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 37
            goto L_0x071e
        L_0x0414:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 36
            goto L_0x071e
        L_0x0420:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 2
            goto L_0x071e
        L_0x042b:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 1
            goto L_0x071e
        L_0x0436:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 0
            goto L_0x071e
        L_0x0441:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 49
            goto L_0x071e
        L_0x044d:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 28
            goto L_0x071e
        L_0x0459:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 27
            goto L_0x071e
        L_0x0465:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 26
            goto L_0x071e
        L_0x0471:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x071e
        L_0x047d:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x071e
        L_0x0489:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x071e
        L_0x0495:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 94
            goto L_0x071e
        L_0x04a1:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 86
            goto L_0x071e
        L_0x04ad:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 80
            goto L_0x071e
        L_0x04b9:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 79
            goto L_0x071e
        L_0x04c5:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 73
            goto L_0x071e
        L_0x04d1:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 84
            goto L_0x071e
        L_0x04dd:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 16
            goto L_0x071e
        L_0x04e9:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x071e
        L_0x04f5:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x071e
        L_0x0501:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x071e
        L_0x050d:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 20
            goto L_0x071e
        L_0x0519:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x071e
        L_0x0525:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 31
            goto L_0x071e
        L_0x0531:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x071e
        L_0x053d:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 17
            goto L_0x071e
        L_0x0549:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x071e
        L_0x0555:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x071e
        L_0x0561:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 53
            goto L_0x071e
        L_0x056d:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 51
            goto L_0x071e
        L_0x0579:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 91
            goto L_0x071e
        L_0x0585:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x071e
        L_0x0591:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x071e
        L_0x059d:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x071e
        L_0x05a9:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 9
            goto L_0x071e
        L_0x05b5:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 88
            goto L_0x071e
        L_0x05c1:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x071e
        L_0x05cd:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 34
            goto L_0x071e
        L_0x05d9:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x071e
        L_0x05e5:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 6
            goto L_0x071e
        L_0x05f0:
            java.lang.String r3 = "A10-70F"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x071d
            goto L_0x071e
        L_0x05fa:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 87
            goto L_0x071e
        L_0x0606:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x071e
        L_0x0612:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 70
            goto L_0x071e
        L_0x061e:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 18
            goto L_0x071e
        L_0x062a:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 52
            goto L_0x071e
        L_0x0636:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 99
            goto L_0x071e
        L_0x0642:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 98
            goto L_0x071e
        L_0x064e:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 97
            goto L_0x071e
        L_0x065a:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x071e
        L_0x0666:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 95
            goto L_0x071e
        L_0x0672:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x071e
        L_0x067e:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 21
            goto L_0x071e
        L_0x068a:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x071e
        L_0x0696:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x071e
        L_0x06a2:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 13
            goto L_0x071e
        L_0x06ae:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x071e
        L_0x06ba:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x071e
        L_0x06c5:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x071e
        L_0x06d0:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 90
            goto L_0x071e
        L_0x06db:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 89
            goto L_0x071e
        L_0x06e6:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 22
            goto L_0x071e
        L_0x06f1:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 74
            goto L_0x071e
        L_0x06fc:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 56
            goto L_0x071e
        L_0x0707:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 55
            goto L_0x071e
        L_0x0712:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x071d
            r2 = 54
            goto L_0x071e
        L_0x071d:
            r2 = -1
        L_0x071e:
            switch(r2) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                case 8: goto L_0x007e;
                case 9: goto L_0x007e;
                case 10: goto L_0x007e;
                case 11: goto L_0x007e;
                case 12: goto L_0x007e;
                case 13: goto L_0x007e;
                case 14: goto L_0x007e;
                case 15: goto L_0x007e;
                case 16: goto L_0x007e;
                case 17: goto L_0x007e;
                case 18: goto L_0x007e;
                case 19: goto L_0x007e;
                case 20: goto L_0x007e;
                case 21: goto L_0x007e;
                case 22: goto L_0x007e;
                case 23: goto L_0x007e;
                case 24: goto L_0x007e;
                case 25: goto L_0x007e;
                case 26: goto L_0x007e;
                case 27: goto L_0x007e;
                case 28: goto L_0x007e;
                case 29: goto L_0x007e;
                case 30: goto L_0x007e;
                case 31: goto L_0x007e;
                case 32: goto L_0x007e;
                case 33: goto L_0x007e;
                case 34: goto L_0x007e;
                case 35: goto L_0x007e;
                case 36: goto L_0x007e;
                case 37: goto L_0x007e;
                case 38: goto L_0x007e;
                case 39: goto L_0x007e;
                case 40: goto L_0x007e;
                case 41: goto L_0x007e;
                case 42: goto L_0x007e;
                case 43: goto L_0x007e;
                case 44: goto L_0x007e;
                case 45: goto L_0x007e;
                case 46: goto L_0x007e;
                case 47: goto L_0x007e;
                case 48: goto L_0x007e;
                case 49: goto L_0x007e;
                case 50: goto L_0x007e;
                case 51: goto L_0x007e;
                case 52: goto L_0x007e;
                case 53: goto L_0x007e;
                case 54: goto L_0x007e;
                case 55: goto L_0x007e;
                case 56: goto L_0x007e;
                case 57: goto L_0x007e;
                case 58: goto L_0x007e;
                case 59: goto L_0x007e;
                case 60: goto L_0x007e;
                case 61: goto L_0x007e;
                case 62: goto L_0x007e;
                case 63: goto L_0x007e;
                case 64: goto L_0x007e;
                case 65: goto L_0x007e;
                case 66: goto L_0x007e;
                case 67: goto L_0x007e;
                case 68: goto L_0x007e;
                case 69: goto L_0x007e;
                case 70: goto L_0x007e;
                case 71: goto L_0x007e;
                case 72: goto L_0x007e;
                case 73: goto L_0x007e;
                case 74: goto L_0x007e;
                case 75: goto L_0x007e;
                case 76: goto L_0x007e;
                case 77: goto L_0x007e;
                case 78: goto L_0x007e;
                case 79: goto L_0x007e;
                case 80: goto L_0x007e;
                case 81: goto L_0x007e;
                case 82: goto L_0x007e;
                case 83: goto L_0x007e;
                case 84: goto L_0x007e;
                case 85: goto L_0x007e;
                case 86: goto L_0x007e;
                case 87: goto L_0x007e;
                case 88: goto L_0x007e;
                case 89: goto L_0x007e;
                case 90: goto L_0x007e;
                case 91: goto L_0x007e;
                case 92: goto L_0x007e;
                case 93: goto L_0x007e;
                case 94: goto L_0x007e;
                case 95: goto L_0x007e;
                case 96: goto L_0x007e;
                case 97: goto L_0x007e;
                case 98: goto L_0x007e;
                case 99: goto L_0x007e;
                case 100: goto L_0x007e;
                case 101: goto L_0x007e;
                case 102: goto L_0x007e;
                case 103: goto L_0x007e;
                case 104: goto L_0x007e;
                case 105: goto L_0x007e;
                case 106: goto L_0x007e;
                case 107: goto L_0x007e;
                case 108: goto L_0x007e;
                case 109: goto L_0x007e;
                case 110: goto L_0x007e;
                case 111: goto L_0x007e;
                case 112: goto L_0x007e;
                case 113: goto L_0x007e;
                case 114: goto L_0x007e;
                case 115: goto L_0x007e;
                case 116: goto L_0x007e;
                case 117: goto L_0x007e;
                case 118: goto L_0x007e;
                case 119: goto L_0x007e;
                case 120: goto L_0x007e;
                case 121: goto L_0x007e;
                case 122: goto L_0x007e;
                case 123: goto L_0x007e;
                case 124: goto L_0x007e;
                case 125: goto L_0x007e;
                case 126: goto L_0x007e;
                case 127: goto L_0x007e;
                case 128: goto L_0x007e;
                case 129: goto L_0x007e;
                case 130: goto L_0x007e;
                case 131: goto L_0x007e;
                case 132: goto L_0x007e;
                case 133: goto L_0x007e;
                case 134: goto L_0x007e;
                case 135: goto L_0x007e;
                case 136: goto L_0x007e;
                case 137: goto L_0x007e;
                case 138: goto L_0x007e;
                case 139: goto L_0x007e;
                default: goto L_0x0721;
            }
        L_0x0721:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzeg.zzd     // Catch:{ all -> 0x0762 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0762 }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r3) goto L_0x074b
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r3) goto L_0x0741
            r3 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r3) goto L_0x0737
            goto L_0x0754
        L_0x0737:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0754
            r8 = 1
            goto L_0x0754
        L_0x0741:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0754
            r8 = 0
            goto L_0x0754
        L_0x074b:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0754
            r8 = 2
        L_0x0754:
            if (r8 == 0) goto L_0x007e
            if (r8 == r10) goto L_0x007e
            if (r8 == r9) goto L_0x007e
        L_0x075a:
            zzd = r0     // Catch:{ all -> 0x0762 }
            zzc = r10     // Catch:{ all -> 0x0762 }
        L_0x075e:
            monitor-exit(r14)     // Catch:{ all -> 0x0762 }
            boolean r14 = zzd
            return r14
        L_0x0762:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0762 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaA(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzaB(com.google.android.gms.internal.ads.zzqg r11, com.google.android.gms.internal.ads.zzad r12) {
        /*
            int r0 = r12.zzr
            int r1 = r12.zzs
            r2 = -1
            if (r0 == r2) goto L_0x00c8
            if (r1 != r2) goto L_0x000b
            goto L_0x00c8
        L_0x000b:
            java.lang.String r3 = r12.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.google.android.gms.internal.ads.zzqy.zzb(r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 5
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 3
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = 2
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = -1
        L_0x0078:
            if (r12 == 0) goto L_0x00c1
            if (r12 == r7) goto L_0x00c1
            if (r12 == r8) goto L_0x0089
            if (r12 == r10) goto L_0x00c1
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            r8 = 4
            goto L_0x00c3
        L_0x0089:
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b1
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b1
            boolean r11 = r11.zzf
            if (r11 != 0) goto L_0x00c0
        L_0x00b1:
            r11 = 16
            int r12 = com.google.android.gms.internal.ads.zzeg.zze(r0, r11)
            int r11 = com.google.android.gms.internal.ads.zzeg.zze(r1, r11)
            int r11 = r11 * r12
            int r0 = r11 * 256
            goto L_0x00c3
        L_0x00c0:
            return r2
        L_0x00c1:
            int r0 = r0 * r1
        L_0x00c3:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaB(com.google.android.gms.internal.ads.zzqg, com.google.android.gms.internal.ads.zzad):int");
    }

    private static List zzaC(zzql zzql, zzad zzad, boolean z, boolean z2) throws zzqs {
        String str = zzad.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        List zzf2 = zzqy.zzf(str, z, z2);
        String zze2 = zzqy.zze(zzad);
        if (zze2 == null) {
            return zzfrh.zzm(zzf2);
        }
        List zzf3 = zzqy.zzf(zze2, z, z2);
        zzfre zzi2 = zzfrh.zzi();
        zzi2.zzf(zzf2);
        zzi2.zzf(zzf3);
        return zzi2.zzg();
    }

    private final void zzaD() {
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD != -1) {
                i = -1;
            } else {
                return;
            }
        }
        zzcv zzcv = this.zzG;
        if (zzcv == null || zzcv.zzc != i || zzcv.zzd != this.zzD || zzcv.zze != this.zzE || zzcv.zzf != this.zzF) {
            zzcv zzcv2 = new zzcv(i, this.zzD, this.zzE, this.zzF);
            this.zzG = zzcv2;
            this.zzg.zzt(zzcv2);
        }
    }

    private final void zzaE() {
        zzcv zzcv = this.zzG;
        if (zzcv != null) {
            this.zzg.zzt(zzcv);
        }
    }

    private final void zzaF() {
        Surface surface = this.zzl;
        zzws zzws = this.zzm;
        if (surface == zzws) {
            this.zzl = null;
        }
        zzws.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j) {
        return j < -30000;
    }

    private final boolean zzaH(zzqg zzqg) {
        if (zzeg.zza < 23 || zzaA(zzqg.zza) || (zzqg.zzf && !zzws.zzb(this.zze))) {
            return false;
        }
        return true;
    }

    public final void zzD(float f, float f2) throws zzgu {
        super.zzD(f, f2);
        this.zzf.zze(f);
    }

    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    public final boolean zzN() {
        zzws zzws;
        if (super.zzN() && (this.zzp || (((zzws = this.zzm) != null && this.zzl == zzws) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    public final float zzP(float f, zzad zzad, zzad[] zzadArr) {
        float f2 = -1.0f;
        for (zzad zzad2 : zzadArr) {
            float f3 = zzad2.zzt;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public final int zzQ(zzql zzql, zzad zzad) throws zzqs {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean zzh2 = zzbo.zzh(zzad.zzm);
        int i4 = RecyclerView.C1119a0.FLAG_IGNORE;
        if (!zzh2) {
            return RecyclerView.C1119a0.FLAG_IGNORE;
        }
        int i5 = 0;
        if (zzad.zzp != null) {
            z = true;
        } else {
            z = false;
        }
        List zzaC = zzaC(zzql, zzad, z, false);
        if (z && zzaC.isEmpty()) {
            zzaC = zzaC(zzql, zzad, false, false);
        }
        if (zzaC.isEmpty()) {
            return 129;
        }
        if (!zzqj.zzav(zzad)) {
            return 130;
        }
        zzqg zzqg = (zzqg) zzaC.get(0);
        boolean zzd2 = zzqg.zzd(zzad);
        if (!zzd2) {
            int i6 = 1;
            while (true) {
                if (i6 >= zzaC.size()) {
                    break;
                }
                zzqg zzqg2 = (zzqg) zzaC.get(i6);
                if (zzqg2.zzd(zzad)) {
                    zzqg = zzqg2;
                    z2 = false;
                    zzd2 = true;
                    break;
                }
                i6++;
            }
        }
        z2 = true;
        if (true != zzd2) {
            i = 3;
        } else {
            i = 4;
        }
        if (true != zzqg.zze(zzad)) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        if (true != zzqg.zzg) {
            i3 = 0;
        } else {
            i3 = 64;
        }
        if (true != z2) {
            i4 = 0;
        }
        if (zzd2) {
            List zzaC2 = zzaC(zzql, zzad, z, true);
            if (!zzaC2.isEmpty()) {
                zzqg zzqg3 = (zzqg) zzqy.zzg(zzaC2, zzad).get(0);
                if (zzqg3.zzd(zzad) && zzqg3.zze(zzad)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    public final zzgn zzR(zzqg zzqg, zzad zzad, zzad zzad2) {
        int i;
        int i2;
        zzgn zzb2 = zzqg.zzb(zzad, zzad2);
        int i3 = zzb2.zze;
        int i4 = zzad2.zzr;
        zzww zzww = this.zzi;
        if (i4 > zzww.zza || zzad2.zzs > zzww.zzb) {
            i3 |= 256;
        }
        if (zzT(zzqg, zzad2) > this.zzi.zzc) {
            i3 |= 64;
        }
        String str = zzqg.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i = 0;
        }
        return new zzgn(str, zzad, zzad2, i2, i);
    }

    public final zzgn zzS(zzja zzja) throws zzgu {
        zzgn zzS = super.zzS(zzja);
        this.zzg.zzf(zzja.zza, zzS);
        return zzS;
    }

    public final void zzU() {
        this.zzr = true;
        if (!this.zzp) {
            this.zzp = true;
            this.zzg.zzq(this.zzl);
            this.zzn = true;
        }
    }

    @TargetApi(17)
    public final zzqc zzV(zzqg zzqg, zzad zzad, MediaCrypto mediaCrypto, float f) {
        zzww zzww;
        Pair zzb2;
        int i;
        int i2;
        Point point;
        int i3;
        int i4;
        boolean z;
        int zzaB;
        zzqg zzqg2 = zzqg;
        zzad zzad2 = zzad;
        float f2 = f;
        zzws zzws = this.zzm;
        if (!(zzws == null || zzws.zza == zzqg2.zzf)) {
            zzaF();
        }
        String str = zzqg2.zzc;
        zzad[] zzJ = zzJ();
        int i5 = zzad2.zzr;
        int i6 = zzad2.zzs;
        int zzT = zzT(zzqg, zzad);
        int length = zzJ.length;
        if (length == 1) {
            if (!(zzT == -1 || (zzaB = zzaB(zzqg, zzad)) == -1)) {
                zzT = Math.min((int) (((float) zzT) * 1.5f), zzaB);
            }
            zzww = new zzww(i5, i6, zzT);
        } else {
            boolean z2 = false;
            for (int i7 = 0; i7 < length; i7++) {
                zzad zzad3 = zzJ[i7];
                if (zzad2.zzy != null && zzad3.zzy == null) {
                    zzab zzb3 = zzad3.zzb();
                    zzb3.zzy(zzad2.zzy);
                    zzad3 = zzb3.zzY();
                }
                if (zzqg2.zzb(zzad2, zzad3).zzd != 0) {
                    int i8 = zzad3.zzr;
                    if (i8 == -1 || zzad3.zzs == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 |= z;
                    i5 = Math.max(i5, i8);
                    i6 = Math.max(i6, zzad3.zzs);
                    zzT = Math.max(zzT, zzT(zzqg2, zzad3));
                }
            }
            if (z2) {
                int i9 = zzad2.zzs;
                int i11 = zzad2.zzr;
                if (i9 > i11) {
                    i = i9;
                } else {
                    i = i11;
                }
                if (i9 <= i11) {
                    i2 = i9;
                } else {
                    i2 = i11;
                }
                float f3 = ((float) i2) / ((float) i);
                int[] iArr = zzb;
                int i12 = 0;
                while (true) {
                    if (i12 >= 9) {
                        break;
                    }
                    int i13 = iArr[i12];
                    int[] iArr2 = iArr;
                    int i14 = (int) (((float) i13) * f3);
                    if (i13 <= i || i14 <= i2) {
                        break;
                    }
                    int i15 = i;
                    int i16 = i2;
                    if (zzeg.zza >= 21) {
                        if (i9 <= i11) {
                            i4 = i13;
                        } else {
                            i4 = i14;
                        }
                        if (i9 <= i11) {
                            i13 = i14;
                        }
                        Point zza = zzqg2.zza(i4, i13);
                        Point point2 = zza;
                        if (zzqg2.zzf(zza.x, zza.y, (double) zzad2.zzt)) {
                            point = point2;
                            break;
                        }
                    } else {
                        try {
                            int zze2 = zzeg.zze(i13, 16) * 16;
                            int zze3 = zzeg.zze(i14, 16) * 16;
                            if (zze2 * zze3 <= zzqy.zza()) {
                                if (i9 <= i11) {
                                    i3 = zze2;
                                } else {
                                    i3 = zze3;
                                }
                                if (i9 <= i11) {
                                    zze2 = zze3;
                                }
                                point = new Point(i3, zze2);
                            }
                        } catch (zzqs unused) {
                        }
                    }
                    i12++;
                    iArr = iArr2;
                    i = i15;
                    i2 = i16;
                }
                point = null;
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i6 = Math.max(i6, point.y);
                    zzab zzb4 = zzad.zzb();
                    zzb4.zzX(i5);
                    zzb4.zzF(i6);
                    zzT = Math.max(zzT, zzaB(zzqg2, zzb4.zzY()));
                }
            }
            zzww = new zzww(i5, i6, zzT);
        }
        this.zzi = zzww;
        boolean z3 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzad2.zzr);
        mediaFormat.setInteger("height", zzad2.zzs);
        zzdp.zzb(mediaFormat, zzad2.zzo);
        float f4 = zzad2.zzt;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        zzdp.zza(mediaFormat, "rotation-degrees", zzad2.zzu);
        zzo zzo2 = zzad2.zzy;
        if (zzo2 != null) {
            zzdp.zza(mediaFormat, "color-transfer", zzo2.zzd);
            zzdp.zza(mediaFormat, "color-standard", zzo2.zzb);
            zzdp.zza(mediaFormat, "color-range", zzo2.zzc);
            byte[] bArr = zzo2.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzad2.zzm) && (zzb2 = zzqy.zzb(zzad)) != null) {
            zzdp.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzww.zza);
        mediaFormat.setInteger("max-height", zzww.zzb);
        zzdp.zza(mediaFormat, "max-input-size", zzww.zzc);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (zzaH(zzqg)) {
                if (this.zzm == null) {
                    this.zzm = zzws.zza(this.zze, zzqg2.zzf);
                }
                this.zzl = this.zzm;
            } else {
                throw new IllegalStateException();
            }
        }
        return zzqc.zzb(zzqg2, mediaFormat, zzad2, this.zzl, (MediaCrypto) null);
    }

    public final List zzW(zzql zzql, zzad zzad, boolean z) throws zzqs {
        return zzqy.zzg(zzaC(zzql, zzad, false, false), zzad);
    }

    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    public final void zzY(String str, zzqc zzqc, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzj = zzaA(str);
        zzqg zzal = zzal();
        zzal.getClass();
        boolean z = false;
        if (zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzg2 = zzal.zzg();
            int length = zzg2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (zzg2[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.zzk = z;
    }

    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    public final void zzaa(zzad zzad, MediaFormat mediaFormat) {
        int i;
        int i2;
        zzqe zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        mediaFormat.getClass();
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.zzC = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.zzD = i2;
        float f = zzad.zzv;
        this.zzF = f;
        if (zzeg.zza >= 21) {
            int i3 = zzad.zzu;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.zzC;
                this.zzC = i2;
                this.zzD = i4;
                this.zzF = 1.0f / f;
            }
        } else {
            this.zzE = zzad.zzu;
        }
        this.zzf.zzc(zzad.zzt);
    }

    public final void zzab(zzqe zzqe, int i, long j) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqe.zzn(i, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzU();
    }

    public final void zzac() {
        this.zzp = false;
        int i = zzeg.zza;
    }

    public final void zzad(zzgc zzgc) throws zzgu {
        this.zzx++;
        int i = zzeg.zza;
    }

    public final boolean zzaf(long j, long j2, zzqe zzqe, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzad) throws zzgu {
        boolean z3;
        int zzd2;
        long j4 = j;
        zzqe zzqe2 = zzqe;
        int i4 = i;
        long j5 = j3;
        zzqe.getClass();
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j4;
        }
        if (j5 != this.zzy) {
            this.zzf.zzd(j5);
            this.zzy = j5;
        }
        long zzai = zzai();
        long j6 = j5 - zzai;
        if (!z || z2) {
            float zzah = zzah();
            int zzbe = zzbe();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j7 = (long) (((double) (j5 - j4)) / ((double) zzah));
            if (zzbe == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.zzl != this.zzm) {
                long j8 = elapsedRealtime - this.zzz;
                boolean z4 = this.zzr ? !this.zzp : !(zzbe != 2 && !this.zzq);
                if (this.zzt == -9223372036854775807L && j4 >= zzai && (z4 || (zzbe == 2 && zzaG(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    if (zzeg.zza >= 21) {
                        zzaw(zzqe, i, j6, nanoTime);
                    } else {
                        zzab(zzqe2, i4, j6);
                    }
                    zzaz(j7);
                    return true;
                } else if (zzbe != 2 || j4 == this.zzs) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long zza = this.zzf.zza((j7 * 1000) + nanoTime2);
                    long j9 = (zza - nanoTime2) / 1000;
                    long j10 = this.zzt;
                    if (j9 < -500000 && !z2 && (zzd2 = zzd(j)) != 0) {
                        if (j10 != -9223372036854775807L) {
                            zzgm zzgm = this.zza;
                            zzgm.zzd += zzd2;
                            zzgm.zzf += this.zzx;
                        } else {
                            this.zza.zzj++;
                            zzay(zzd2, this.zzx);
                        }
                        zzas();
                        return false;
                    } else if (zzaG(j9) && !z2) {
                        if (j10 != -9223372036854775807L) {
                            zzax(zzqe2, i4, j6);
                            z3 = true;
                        } else {
                            int i5 = zzeg.zza;
                            Trace.beginSection("dropVideoBuffer");
                            zzqe2.zzn(i4, false);
                            Trace.endSection();
                            z3 = true;
                            zzay(0, 1);
                        }
                        zzaz(j9);
                        return z3;
                    } else if (zzeg.zza >= 21) {
                        if (j9 >= Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES) {
                            return false;
                        }
                        zzaw(zzqe, i, j6, zza);
                        zzaz(j9);
                        return true;
                    } else if (j9 >= 30000) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((-10000 + j9) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        zzab(zzqe2, i4, j6);
                        zzaz(j9);
                        return true;
                    }
                }
            } else if (!zzaG(j7)) {
                return false;
            } else {
                zzax(zzqe2, i4, j6);
                zzaz(j7);
                return true;
            }
        } else {
            zzax(zzqe2, i4, j6);
            return true;
        }
    }

    public final zzqf zzak(Throwable th, zzqg zzqg) {
        return new zzwv(th, zzqg, this.zzl);
    }

    @TargetApi(29)
    public final void zzam(zzgc zzgc) throws zzgu {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgc.zze;
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
                    zzqe zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    public final void zzao(long j) {
        super.zzao(j);
        this.zzx--;
    }

    public final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    public final boolean zzau(zzqg zzqg) {
        return this.zzl != null || zzaH(zzqg);
    }

    public final void zzaw(zzqe zzqe, int i, long j, long j2) {
        zzaD();
        int i2 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqe.zzm(i, j2);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzU();
    }

    public final void zzax(zzqe zzqe, int i, long j) {
        int i2 = zzeg.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqe.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    public final void zzay(int i, int i2) {
        zzgm zzgm = this.zza;
        zzgm.zzh += i;
        int i3 = i + i2;
        zzgm.zzg += i3;
        this.zzv += i3;
        int i4 = this.zzw + i3;
        this.zzw = i4;
        zzgm.zzi = Math.max(i4, zzgm.zzi);
    }

    public final void zzaz(long j) {
        zzgm zzgm = this.zza;
        zzgm.zzk += j;
        zzgm.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0042
            r0 = 7
            if (r6 == r0) goto L_0x003d
            r0 = 10
            if (r6 == r0) goto L_0x0030
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            com.google.android.gms.internal.ads.zzxf r6 = r5.zzf
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.zzj(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.zzo = r6
            com.google.android.gms.internal.ads.zzqe r7 = r5.zzaj()
            if (r7 == 0) goto L_0x00ca
            r7.zzq(r6)
            return
        L_0x0030:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.zzH
            if (r7 == r6) goto L_0x00ca
            r5.zzH = r6
            return
        L_0x003d:
            com.google.android.gms.internal.ads.zzwy r7 = (com.google.android.gms.internal.ads.zzwy) r7
            r5.zzI = r7
            return
        L_0x0042:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004a
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            if (r7 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzws r6 = r5.zzm
            if (r6 == 0) goto L_0x0053
            r7 = r6
            goto L_0x0069
        L_0x0053:
            com.google.android.gms.internal.ads.zzqg r6 = r5.zzal()
            if (r6 == 0) goto L_0x0069
            boolean r1 = r5.zzaH(r6)
            if (r1 == 0) goto L_0x0069
            android.content.Context r7 = r5.zze
            boolean r6 = r6.zzf
            com.google.android.gms.internal.ads.zzws r7 = com.google.android.gms.internal.ads.zzws.zza(r7, r6)
            r5.zzm = r7
        L_0x0069:
            android.view.Surface r6 = r5.zzl
            if (r6 == r7) goto L_0x00b6
            r5.zzl = r7
            com.google.android.gms.internal.ads.zzxf r6 = r5.zzf
            r6.zzi(r7)
            r6 = 0
            r5.zzn = r6
            int r1 = r5.zzbe()
            com.google.android.gms.internal.ads.zzqe r2 = r5.zzaj()
            if (r2 == 0) goto L_0x0097
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = 23
            if (r3 < r4) goto L_0x0091
            if (r7 == 0) goto L_0x0091
            boolean r3 = r5.zzj
            if (r3 != 0) goto L_0x0091
            r2.zzo(r7)
            goto L_0x0097
        L_0x0091:
            r5.zzap()
            r5.zzan()
        L_0x0097:
            if (r7 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzws r2 = r5.zzm
            if (r7 == r2) goto L_0x00af
            r5.zzaE()
            r5.zzp = r6
            int r6 = com.google.android.gms.internal.ads.zzeg.zza
            r6 = 2
            if (r1 != r6) goto L_0x00ca
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.zzt = r6
            return
        L_0x00af:
            r5.zzG = r0
            r5.zzp = r6
            int r6 = com.google.android.gms.internal.ads.zzeg.zza
            return
        L_0x00b6:
            if (r7 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzws r6 = r5.zzm
            if (r7 == r6) goto L_0x00ca
            r5.zzaE()
            boolean r6 = r5.zzn
            if (r6 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzxq r6 = r5.zzg
            android.view.Surface r7 = r5.zzl
            r6.zzq(r7)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzp(int, java.lang.Object):void");
    }

    public final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i = zzeg.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(this.zza);
        }
    }

    public final void zzt(boolean z, boolean z2) throws zzgu {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(this.zza);
        this.zzq = z2;
        this.zzr = false;
    }

    public final void zzu(long j, boolean z) throws zzgu {
        super.zzu(j, z);
        this.zzp = false;
        int i = zzeg.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @TargetApi(17)
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    public final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0;
        this.zzB = 0;
        this.zzf.zzg();
    }

    public final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }
}
