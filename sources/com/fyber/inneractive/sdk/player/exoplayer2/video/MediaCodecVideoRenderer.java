package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodec$OnFrameRenderedListener;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C3054d;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3065c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3066d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

@TargetApi(16)
public class MediaCodecVideoRenderer extends C3233b {

    /* renamed from: w0 */
    public static final int[] f12157w0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: V */
    public final C3421d f12158V;

    /* renamed from: W */
    public final VideoRendererEventListener.EventDispatcher f12159W;

    /* renamed from: X */
    public final long f12160X;

    /* renamed from: Y */
    public final int f12161Y;

    /* renamed from: Z */
    public final boolean f12162Z = m8602A();

    /* renamed from: a0 */
    public C3226i[] f12163a0;

    /* renamed from: b0 */
    public C3408a f12164b0;

    /* renamed from: c0 */
    public Surface f12165c0;

    /* renamed from: d0 */
    public int f12166d0 = 1;

    /* renamed from: e0 */
    public boolean f12167e0;

    /* renamed from: f0 */
    public long f12168f0 = -9223372036854775807L;

    /* renamed from: g0 */
    public long f12169g0;

    /* renamed from: h0 */
    public int f12170h0;

    /* renamed from: i0 */
    public int f12171i0;

    /* renamed from: j0 */
    public int f12172j0;

    /* renamed from: k0 */
    public float f12173k0 = -1.0f;

    /* renamed from: l0 */
    public int f12174l0 = -1;

    /* renamed from: m0 */
    public int f12175m0 = -1;

    /* renamed from: n0 */
    public int f12176n0;

    /* renamed from: o0 */
    public float f12177o0 = -1.0f;

    /* renamed from: p0 */
    public int f12178p0;

    /* renamed from: q0 */
    public int f12179q0;

    /* renamed from: r0 */
    public int f12180r0;

    /* renamed from: s0 */
    public float f12181s0;

    /* renamed from: t0 */
    public boolean f12182t0;

    /* renamed from: u0 */
    public int f12183u0;

    /* renamed from: v0 */
    public C3409b f12184v0;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a */
    public static final class C3408a {

        /* renamed from: a */
        public final int f12185a;

        /* renamed from: b */
        public final int f12186b;

        /* renamed from: c */
        public final int f12187c;

        public C3408a(int i, int i2, int i3) {
            this.f12185a = i;
            this.f12186b = i2;
            this.f12187c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b */
    public final class C3409b implements MediaCodec$OnFrameRenderedListener {
        public C3409b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this == mediaCodecVideoRenderer.f12184v0) {
                mediaCodecVideoRenderer.mo14588C();
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, C3235c cVar, long j, C3065c<C3066d> cVar2, boolean z, Handler handler, VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, cVar, (C3065c<C3066d>) null, z);
        this.f12160X = j;
        this.f12161Y = i;
        this.f12158V = new C3421d(context);
        this.f12159W = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        mo14595z();
    }

    /* renamed from: A */
    public static boolean m8602A() {
        return C3406u.f12148a <= 22 && "foster".equals(C3406u.f12149b) && "NVIDIA".equals(C3406u.f12150c);
    }

    /* renamed from: B */
    public final void mo14587B() {
        if (this.f12170h0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f12159W.droppedFrames(this.f12170h0, elapsedRealtime - this.f12169g0);
            this.f12170h0 = 0;
            this.f12169g0 = elapsedRealtime;
        }
    }

    /* renamed from: C */
    public void mo14588C() {
        if (!this.f12167e0) {
            this.f12167e0 = true;
            this.f12159W.renderedFirstFrame(this.f12165c0);
        }
    }

    /* renamed from: D */
    public final void mo14589D() {
        int i = this.f12174l0;
        if (i != -1 || this.f12175m0 != -1) {
            if (this.f12178p0 != i || this.f12179q0 != this.f12175m0 || this.f12180r0 != this.f12176n0 || this.f12181s0 != this.f12177o0) {
                this.f12159W.videoSizeChanged(i, this.f12175m0, this.f12176n0, this.f12177o0);
                this.f12178p0 = this.f12174l0;
                this.f12179q0 = this.f12175m0;
                this.f12180r0 = this.f12176n0;
                this.f12181s0 = this.f12177o0;
            }
        }
    }

    /* renamed from: E */
    public final void mo14590E() {
        int i = this.f12178p0;
        if (i != -1 || this.f12179q0 != -1) {
            this.f12159W.videoSizeChanged(i, this.f12179q0, this.f12180r0, this.f12181s0);
        }
    }

    /* renamed from: F */
    public final void mo14591F() {
        long j;
        if (this.f12160X > 0) {
            j = SystemClock.elapsedRealtime() + this.f12160X;
        } else {
            j = -9223372036854775807L;
        }
        this.f12168f0 = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13996a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c r18, com.fyber.inneractive.sdk.player.exoplayer2.C3226i r19) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.C3239b {
        /*
            r17 = this;
            r0 = r19
            java.lang.String r1 = r0.f11633f
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8522e(r1)
            r3 = 0
            if (r2 != 0) goto L_0x000c
            return r3
        L_0x000c:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f11636i
            if (r2 == 0) goto L_0x0023
            r4 = 0
            r5 = 0
        L_0x0012:
            int r6 = r2.f10533c
            if (r4 >= r6) goto L_0x0020
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r6 = r2.f10531a
            r6 = r6[r4]
            boolean r6 = r6.f10538e
            r5 = r5 | r6
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0020:
            r2 = r18
            goto L_0x0026
        L_0x0023:
            r2 = r18
            r5 = 0
        L_0x0026:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r1 = r2.mo14344a(r1, r5)
            r2 = 1
            if (r1 != 0) goto L_0x002e
            return r2
        L_0x002e:
            java.lang.String r4 = r0.f11630c
            r5 = 16
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == 0) goto L_0x01b2
            java.lang.String r9 = r1.f11662d
            if (r9 != 0) goto L_0x003d
            goto L_0x01b2
        L_0x003d:
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8518a(r4)
            if (r9 != 0) goto L_0x0045
            goto L_0x01b2
        L_0x0045:
            java.lang.String r10 = r1.f11662d
            boolean r10 = r10.equals(r9)
            java.lang.String r11 = ", "
            if (r10 != 0) goto L_0x006b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "codec.mime "
            r10.append(r12)
            r10.append(r4)
            r10.append(r11)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            r1.mo14334a((java.lang.String) r4)
            goto L_0x01b3
        L_0x006b:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r10 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.f11704a
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r4.split(r10)
            r12 = r10[r3]
            r12.getClass()
            r13 = -1
            int r14 = r12.hashCode()
            switch(r14) {
                case 3006243: goto L_0x00a2;
                case 3006244: goto L_0x0097;
                case 3199032: goto L_0x008c;
                case 3214780: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00ac
        L_0x0081:
            java.lang.String r14 = "hvc1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x008a
            goto L_0x00ac
        L_0x008a:
            r13 = 3
            goto L_0x00ac
        L_0x008c:
            java.lang.String r14 = "hev1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x0095
            goto L_0x00ac
        L_0x0095:
            r13 = 2
            goto L_0x00ac
        L_0x0097:
            java.lang.String r14 = "avc2"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x00a0
            goto L_0x00ac
        L_0x00a0:
            r13 = 1
            goto L_0x00ac
        L_0x00a2:
            java.lang.String r14 = "avc1"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r13 = 0
        L_0x00ac:
            r12 = 0
            switch(r13) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00b2;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x0165
        L_0x00b2:
            int r13 = r10.length
            if (r13 >= r6) goto L_0x00b7
            goto L_0x0165
        L_0x00b7:
            java.util.regex.Pattern r13 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.f11705b
            r14 = r10[r2]
            java.util.regex.Matcher r13 = r13.matcher(r14)
            boolean r14 = r13.matches()
            if (r14 != 0) goto L_0x00c7
            goto L_0x0165
        L_0x00c7:
            java.lang.String r14 = r13.group(r2)
            java.lang.String r15 = "1"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L_0x00d5
            r14 = 1
            goto L_0x00de
        L_0x00d5:
            java.lang.String r15 = "2"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0165
            r14 = 2
        L_0x00de:
            java.util.Map<java.lang.String, java.lang.Integer> r15 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.f11709f
            r10 = r10[r7]
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r10 = r15.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x00f1
            r13.group(r2)
            goto L_0x0165
        L_0x00f1:
            android.util.Pair r12 = new android.util.Pair
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r10)
            goto L_0x0165
        L_0x00fb:
            int r13 = r10.length
            if (r13 >= r8) goto L_0x00ff
            goto L_0x0165
        L_0x00ff:
            r13 = r10[r2]     // Catch:{ NumberFormatException -> 0x0164 }
            int r13 = r13.length()     // Catch:{ NumberFormatException -> 0x0164 }
            r14 = 6
            if (r13 != r14) goto L_0x0125
            r13 = r10[r2]     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.String r13 = r13.substring(r3, r8)     // Catch:{ NumberFormatException -> 0x0164 }
            int r13 = java.lang.Integer.parseInt(r13, r5)     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0164 }
            r10 = r10[r2]     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.String r10 = r10.substring(r6)     // Catch:{ NumberFormatException -> 0x0164 }
            int r10 = java.lang.Integer.parseInt(r10, r5)     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0164 }
            goto L_0x013c
        L_0x0125:
            int r13 = r10.length     // Catch:{ NumberFormatException -> 0x0164 }
            if (r13 < r7) goto L_0x0165
            r13 = r10[r2]     // Catch:{ NumberFormatException -> 0x0164 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x0164 }
            r10 = r10[r8]     // Catch:{ NumberFormatException -> 0x0164 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x0164 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0164 }
        L_0x013c:
            android.util.SparseIntArray r14 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.f11707d
            int r13 = r13.intValue()
            int r13 = r14.get(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            if (r13 != 0) goto L_0x014d
            goto L_0x0165
        L_0x014d:
            android.util.SparseIntArray r14 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.f11708e
            int r10 = r10.intValue()
            int r10 = r14.get(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            if (r10 != 0) goto L_0x015e
            goto L_0x0165
        L_0x015e:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r13, r10)
            goto L_0x0165
        L_0x0164:
        L_0x0165:
            if (r12 != 0) goto L_0x0168
            goto L_0x01b2
        L_0x0168:
            android.media.MediaCodecInfo$CodecCapabilities r10 = r1.f11663e
            if (r10 == 0) goto L_0x0170
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = r10.profileLevels
            if (r10 != 0) goto L_0x0172
        L_0x0170:
            android.media.MediaCodecInfo$CodecProfileLevel[] r10 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
        L_0x0172:
            int r13 = r10.length
            r14 = 0
        L_0x0174:
            if (r14 >= r13) goto L_0x0196
            r15 = r10[r14]
            int r2 = r15.profile
            java.lang.Object r3 = r12.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 != r3) goto L_0x0191
            int r2 = r15.level
            java.lang.Object r3 = r12.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 < r3) goto L_0x0191
            goto L_0x01b2
        L_0x0191:
            int r14 = r14 + 1
            r2 = 1
            r3 = 0
            goto L_0x0174
        L_0x0196:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r4)
            r2.append(r11)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.mo14334a((java.lang.String) r2)
            r3 = 0
            goto L_0x01b3
        L_0x01b2:
            r3 = 1
        L_0x01b3:
            if (r3 == 0) goto L_0x01db
            int r2 = r0.f11637j
            if (r2 <= 0) goto L_0x01db
            int r4 = r0.f11638k
            if (r4 <= 0) goto L_0x01db
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r9 = 21
            if (r3 < r9) goto L_0x01cb
            float r0 = r0.f11639l
            double r9 = (double) r0
            boolean r3 = r1.mo14335a(r2, r4, r9)
            goto L_0x01db
        L_0x01cb:
            int r2 = r2 * r4
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.m8216a()
            if (r2 > r0) goto L_0x01d5
            r2 = 1
            goto L_0x01d6
        L_0x01d5:
            r2 = 0
        L_0x01d6:
            if (r2 != 0) goto L_0x01da
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
        L_0x01da:
            r3 = r2
        L_0x01db:
            boolean r0 = r1.f11660b
            if (r0 == 0) goto L_0x01e1
            r6 = 8
        L_0x01e1:
            boolean r0 = r1.f11661c
            if (r0 == 0) goto L_0x01e8
            r16 = 16
            goto L_0x01ea
        L_0x01e8:
            r16 = 0
        L_0x01ea:
            if (r3 == 0) goto L_0x01ed
            goto L_0x01ee
        L_0x01ed:
            r7 = 2
        L_0x01ee:
            r0 = r6 | r16
            r0 = r0 | r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo13996a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    public boolean isReady() {
        if ((this.f12167e0 || super.mo14343x()) && super.isReady()) {
            this.f12168f0 = -9223372036854775807L;
            return true;
        } else if (this.f12168f0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f12168f0) {
                return true;
            }
            this.f12168f0 = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: p */
    public void mo13975p() {
        this.f12174l0 = -1;
        this.f12175m0 = -1;
        this.f12177o0 = -1.0f;
        this.f12173k0 = -1.0f;
        mo14595z();
        mo14594y();
        C3421d dVar = this.f12158V;
        dVar.getClass();
        dVar.f12221a.f12233b.sendEmptyMessage(2);
        this.f12184v0 = null;
        try {
            super.mo13975p();
        } finally {
            this.f11684T.ensureUpdated();
            this.f12159W.disabled(this.f11684T);
        }
    }

    /* renamed from: q */
    public void mo13976q() {
        this.f12170h0 = 0;
        this.f12169g0 = SystemClock.elapsedRealtime();
    }

    /* renamed from: r */
    public void mo13977r() {
        this.f12168f0 = -9223372036854775807L;
        mo14587B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f12165c0;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14343x() {
        /*
            r1 = this;
            boolean r0 = super.mo14343x()
            if (r0 == 0) goto L_0x0012
            android.view.Surface r0 = r1.f12165c0
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo14343x():boolean");
    }

    /* renamed from: y */
    public final void mo14594y() {
        MediaCodec mediaCodec;
        this.f12167e0 = false;
        if (C3406u.f12148a >= 23 && this.f12182t0 && (mediaCodec = this.f11694r) != null) {
            this.f12184v0 = new C3409b(mediaCodec);
        }
    }

    /* renamed from: z */
    public final void mo14595z() {
        this.f12178p0 = -1;
        this.f12179q0 = -1;
        this.f12181s0 = -1.0f;
        this.f12180r0 = -1;
    }

    /* renamed from: a */
    public void mo13962a(C3226i[] iVarArr) throws C3054d {
        this.f12163a0 = iVarArr;
    }

    /* renamed from: a */
    public void mo13959a(long j, boolean z) throws C3054d {
        super.mo13959a(j, z);
        mo14594y();
        this.f12171i0 = 0;
        if (z) {
            mo14591F();
        } else {
            this.f12168f0 = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public void mo13999a(int i, Object obj) throws C3054d {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (this.f12165c0 != surface) {
                this.f12165c0 = surface;
                int i2 = this.f10346d;
                if (i2 == 1 || i2 == 2) {
                    MediaCodec mediaCodec = this.f11694r;
                    if (C3406u.f12148a < 23 || mediaCodec == null || surface == null) {
                        mo14342v();
                        mo14340t();
                    } else {
                        mediaCodec.setOutputSurface(surface);
                    }
                }
                if (surface != null) {
                    mo14590E();
                    mo14594y();
                    if (i2 == 2) {
                        mo14591F();
                        return;
                    }
                    return;
                }
                mo14595z();
                mo14594y();
            } else if (surface != null) {
                mo14590E();
                if (this.f12167e0) {
                    this.f12159W.renderedFirstFrame(this.f12165c0);
                }
            }
        } else if (i == 4) {
            int intValue = ((Integer) obj).intValue();
            this.f12166d0 = intValue;
            MediaCodec mediaCodec2 = this.f11694r;
            if (mediaCodec2 != null) {
                mediaCodec2.setVideoScalingMode(intValue);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14002a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3232a r21, android.media.MediaCodec r22, com.fyber.inneractive.sdk.player.exoplayer2.C3226i r23, android.media.MediaCrypto r24) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.C3239b {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r0.f12163a0
            int r5 = r3.f11637j
            int r6 = r3.f11638k
            int r7 = r3.f11634g
            r8 = -1
            if (r7 == r8) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.lang.String r7 = r3.f11633f
            int r7 = m8603a((java.lang.String) r7, (int) r5, (int) r6)
        L_0x001a:
            int r9 = r4.length
            r11 = 1
            if (r9 != r11) goto L_0x0025
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a
            r1.<init>(r5, r6, r7)
            goto L_0x0133
        L_0x0025:
            int r9 = r4.length
            r13 = 0
            r14 = 0
        L_0x0028:
            if (r13 >= r9) goto L_0x0062
            r15 = r4[r13]
            boolean r10 = r1.f11660b
            boolean r10 = m8604a((boolean) r10, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r3, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r15)
            if (r10 == 0) goto L_0x005e
            int r10 = r15.f11637j
            if (r10 == r8) goto L_0x003f
            int r11 = r15.f11638k
            if (r11 != r8) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r11 = 0
            goto L_0x0040
        L_0x003f:
            r11 = 1
        L_0x0040:
            r14 = r14 | r11
            int r5 = java.lang.Math.max(r5, r10)
            int r10 = r15.f11638k
            int r6 = java.lang.Math.max(r6, r10)
            int r10 = r15.f11634g
            if (r10 == r8) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            java.lang.String r10 = r15.f11633f
            int r11 = r15.f11637j
            int r15 = r15.f11638k
            int r10 = m8603a((java.lang.String) r10, (int) r11, (int) r15)
        L_0x005a:
            int r7 = java.lang.Math.max(r7, r10)
        L_0x005e:
            int r13 = r13 + 1
            r11 = 1
            goto L_0x0028
        L_0x0062:
            if (r14 == 0) goto L_0x012e
            int r4 = r3.f11638k
            int r9 = r3.f11637j
            if (r4 <= r9) goto L_0x006c
            r10 = 1
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            if (r10 == 0) goto L_0x0071
            r11 = r4
            goto L_0x0072
        L_0x0071:
            r11 = r9
        L_0x0072:
            if (r10 == 0) goto L_0x0075
            r4 = r9
        L_0x0075:
            float r9 = (float) r4
            float r13 = (float) r11
            float r9 = r9 / r13
            int[] r13 = f12157w0
            int r14 = r13.length
            r15 = 0
        L_0x007c:
            if (r15 >= r14) goto L_0x0115
            r12 = r13[r15]
            float r8 = (float) r12
            float r8 = r8 * r9
            int r8 = (int) r8
            if (r12 <= r11) goto L_0x0115
            if (r8 > r4) goto L_0x008a
            goto L_0x0115
        L_0x008a:
            r16 = r4
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r17 = r9
            r9 = 21
            if (r4 < r9) goto L_0x00e3
            if (r10 == 0) goto L_0x0098
            r4 = r8
            goto L_0x0099
        L_0x0098:
            r4 = r12
        L_0x0099:
            if (r10 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r12 = r8
        L_0x009d:
            android.media.MediaCodecInfo$CodecCapabilities r8 = r1.f11663e
            if (r8 != 0) goto L_0x00aa
            java.lang.String r4 = "align.caps"
            r1.mo14334a((java.lang.String) r4)
        L_0x00a6:
            r18 = r11
            r11 = 0
            goto L_0x00d1
        L_0x00aa:
            android.media.MediaCodecInfo$VideoCapabilities r8 = r8.getVideoCapabilities()
            if (r8 != 0) goto L_0x00b6
            java.lang.String r4 = "align.vCaps"
            r1.mo14334a((java.lang.String) r4)
            goto L_0x00a6
        L_0x00b6:
            int r9 = r8.getWidthAlignment()
            int r8 = r8.getHeightAlignment()
            r18 = r11
            android.graphics.Point r11 = new android.graphics.Point
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r4, (int) r9)
            int r4 = r4 * r9
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r12, (int) r8)
            int r9 = r9 * r8
            r11.<init>(r4, r9)
        L_0x00d1:
            float r4 = r3.f11639l
            int r8 = r11.x
            int r9 = r11.y
            r19 = r11
            double r11 = (double) r4
            boolean r4 = r1.mo14335a(r8, r9, r11)
            if (r4 == 0) goto L_0x010a
            r11 = r19
            goto L_0x0116
        L_0x00e3:
            r18 = r11
            r4 = 16
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r12, (int) r4)
            int r9 = r9 * 16
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r8, (int) r4)
            int r8 = r8 * 16
            int r4 = r9 * r8
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.m8216a()
            if (r4 > r11) goto L_0x010a
            android.graphics.Point r11 = new android.graphics.Point
            if (r10 == 0) goto L_0x0101
            r1 = r8
            goto L_0x0102
        L_0x0101:
            r1 = r9
        L_0x0102:
            if (r10 == 0) goto L_0x0105
            goto L_0x0106
        L_0x0105:
            r9 = r8
        L_0x0106:
            r11.<init>(r1, r9)
            goto L_0x0116
        L_0x010a:
            int r15 = r15 + 1
            r4 = r16
            r9 = r17
            r11 = r18
            r8 = -1
            goto L_0x007c
        L_0x0115:
            r11 = 0
        L_0x0116:
            if (r11 == 0) goto L_0x012e
            int r1 = r11.x
            int r5 = java.lang.Math.max(r5, r1)
            int r1 = r11.y
            int r6 = java.lang.Math.max(r6, r1)
            java.lang.String r1 = r3.f11633f
            int r1 = m8603a((java.lang.String) r1, (int) r5, (int) r6)
            int r7 = java.lang.Math.max(r7, r1)
        L_0x012e:
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$a
            r1.<init>(r5, r6, r7)
        L_0x0133:
            r0.f12164b0 = r1
            boolean r4 = r0.f12162Z
            int r5 = r0.f12183u0
            android.media.MediaFormat r3 = r23.mo14322a()
            int r6 = r1.f12185a
            java.lang.String r7 = "max-width"
            r3.setInteger(r7, r6)
            int r6 = r1.f12186b
            java.lang.String r7 = "max-height"
            r3.setInteger(r7, r6)
            int r1 = r1.f12187c
            r6 = -1
            if (r1 == r6) goto L_0x0155
            java.lang.String r6 = "max-input-size"
            r3.setInteger(r6, r1)
        L_0x0155:
            if (r4 == 0) goto L_0x015e
            java.lang.String r1 = "auto-frc"
            r4 = 0
            r3.setInteger(r1, r4)
            goto L_0x015f
        L_0x015e:
            r4 = 0
        L_0x015f:
            if (r5 == 0) goto L_0x016d
            java.lang.String r1 = "tunneled-playback"
            r6 = 1
            r3.setFeatureEnabled(r1, r6)
            java.lang.String r1 = "audio-session-id"
            r3.setInteger(r1, r5)
        L_0x016d:
            android.view.Surface r1 = r0.f12165c0
            r5 = 0
            r2.configure(r3, r1, r5, r4)
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r3 = 23
            if (r1 < r3) goto L_0x0184
            boolean r1 = r0.f12182t0
            if (r1 == 0) goto L_0x0184
            com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b r1 = new com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer$b
            r1.<init>(r2)
            r0.f12184v0 = r1
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo14002a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a, android.media.MediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.i, android.media.MediaCrypto):void");
    }

    /* renamed from: a */
    public void mo14003a(String str, long j, long j2) {
        this.f12159W.decoderInitialized(str, j, j2);
    }

    /* renamed from: a */
    public void mo14001a(C3226i iVar) throws C3054d {
        super.mo14001a(iVar);
        this.f12159W.inputFormatChanged(iVar);
        float f = iVar.f11641n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.f12173k0 = f;
        int i = iVar.f11640m;
        if (i == -1) {
            i = 0;
        }
        this.f12172j0 = i;
    }

    /* renamed from: a */
    public void mo14337a(C3058b bVar) {
        if (C3406u.f12148a < 23 && this.f12182t0) {
            mo14588C();
        }
    }

    /* renamed from: a */
    public void mo14000a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f12174l0 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f12175m0 = i2;
        float f = this.f12173k0;
        this.f12177o0 = f;
        if (C3406u.f12148a >= 21) {
            int i3 = this.f12172j0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f12174l0;
                this.f12174l0 = i2;
                this.f12175m0 = i4;
                this.f12177o0 = 1.0f / f;
            }
        } else {
            this.f12176n0 = this.f12172j0;
        }
        mediaCodec.setVideoScalingMode(this.f12166d0);
    }

    /* renamed from: a */
    public void mo13961a(boolean z) throws C3054d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f11684T = decoderCounters;
        int i = this.f10344b.f11752a;
        this.f12183u0 = i;
        this.f12182t0 = i != 0;
        this.f12159W.enabled(decoderCounters);
        C3421d dVar = this.f12158V;
        dVar.f12227g = false;
        dVar.f12221a.f12233b.sendEmptyMessage(1);
    }

    /* renamed from: a */
    public boolean mo14338a(MediaCodec mediaCodec, boolean z, C3226i iVar, C3226i iVar2) {
        if (m8604a(z, iVar, iVar2)) {
            int i = iVar2.f11637j;
            C3408a aVar = this.f12164b0;
            return i <= aVar.f12185a && iVar2.f11638k <= aVar.f12186b && iVar2.f11634g <= aVar.f12187c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14004a(long r18, long r20, android.media.MediaCodec r22, java.nio.ByteBuffer r23, int r24, int r25, long r26, boolean r28) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            r2 = r24
            r3 = r26
            r5 = 0
            r6 = 1
            if (r28 == 0) goto L_0x001f
            java.lang.String r3 = "skipVideoBuffer"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r3)
            r1.releaseOutputBuffer(r2, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r1 = r0.f11684T
            int r2 = r1.skippedOutputBufferCount
            int r2 = r2 + r6
            r1.skippedOutputBufferCount = r2
            return r6
        L_0x001f:
            boolean r7 = r0.f12167e0
            r8 = 21
            if (r7 != 0) goto L_0x0035
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            if (r3 < r8) goto L_0x0031
            long r3 = java.lang.System.nanoTime()
            r0.mo14593a((android.media.MediaCodec) r1, (int) r2, (long) r3)
            goto L_0x0034
        L_0x0031:
            r0.mo14592a((android.media.MediaCodec) r1, (int) r2)
        L_0x0034:
            return r6
        L_0x0035:
            int r7 = r0.f10346d
            r9 = 2
            if (r7 == r9) goto L_0x003b
            return r5
        L_0x003b:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            long r9 = r9 - r20
            long r13 = r3 - r18
            long r13 = r13 - r9
            long r9 = java.lang.System.nanoTime()
            long r13 = r13 * r11
            long r13 = r13 + r9
            com.fyber.inneractive.sdk.player.exoplayer2.video.d r7 = r0.f12158V
            r18 = r9
            long r8 = r3 * r11
            boolean r10 = r7.f12227g
            if (r10 == 0) goto L_0x009c
            long r11 = r7.f12224d
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x006a
            long r10 = r7.f12230j
            r15 = 1
            long r10 = r10 + r15
            r7.f12230j = r10
            long r10 = r7.f12226f
            r7.f12225e = r10
        L_0x006a:
            long r10 = r7.f12230j
            r15 = 6
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0091
            long r5 = r7.f12229i
            long r5 = r8 - r5
            long r5 = r5 / r10
            long r10 = r7.f12225e
            long r10 = r10 + r5
            boolean r5 = r7.mo14618a(r10, r13)
            if (r5 == 0) goto L_0x0084
            r5 = 0
            r7.f12227g = r5
            goto L_0x009c
        L_0x0084:
            long r5 = r7.f12228h
            long r5 = r5 + r10
            r20 = r13
            long r12 = r7.f12229i
            long r5 = r5 - r12
            r13 = r10
            r10 = r5
            r5 = r20
            goto L_0x009f
        L_0x0091:
            r5 = r13
            boolean r10 = r7.mo14618a(r8, r5)
            if (r10 == 0) goto L_0x009d
            r10 = 0
            r7.f12227g = r10
            goto L_0x009d
        L_0x009c:
            r5 = r13
        L_0x009d:
            r10 = r5
            r13 = r8
        L_0x009f:
            boolean r12 = r7.f12227g
            r0 = 0
            if (r12 != 0) goto L_0x00ae
            r7.f12229i = r8
            r7.f12228h = r5
            r7.f12230j = r0
            r5 = 1
            r7.f12227g = r5
        L_0x00ae:
            r7.f12224d = r3
            r7.f12226f = r13
            com.fyber.inneractive.sdk.player.exoplayer2.video.d$a r3 = r7.f12221a
            if (r3 == 0) goto L_0x00e0
            long r3 = r3.f12232a
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00bd
            goto L_0x00e0
        L_0x00bd:
            com.fyber.inneractive.sdk.player.exoplayer2.video.d$a r0 = r7.f12221a
            long r0 = r0.f12232a
            long r3 = r7.f12222b
            long r5 = r10 - r0
            long r5 = r5 / r3
            long r5 = r5 * r3
            long r5 = r5 + r0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00d0
            long r0 = r5 - r3
            goto L_0x00d3
        L_0x00d0:
            long r3 = r3 + r5
            r0 = r5
            r5 = r3
        L_0x00d3:
            long r3 = r5 - r10
            long r10 = r10 - r0
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r5 = r0
        L_0x00dc:
            long r0 = r7.f12223c
            long r10 = r5 - r0
        L_0x00e0:
            r0 = r18
            long r0 = r10 - r0
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r3 = -30000(0xffffffffffff8ad0, double:NaN)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ef
            r3 = 1
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            if (r3 == 0) goto L_0x0126
            java.lang.String r0 = "dropVideoBuffer"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r0)
            r3 = r22
            r0 = 0
            r3.releaseOutputBuffer(r2, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()
            r4 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r4.f11684T
            int r1 = r0.droppedOutputBufferCount
            r5 = 1
            int r1 = r1 + r5
            r0.droppedOutputBufferCount = r1
            int r1 = r4.f12170h0
            int r1 = r1 + r5
            r4.f12170h0 = r1
            int r1 = r4.f12171i0
            int r1 = r1 + r5
            r4.f12171i0 = r1
            int r2 = r0.maxConsecutiveDroppedOutputBufferCount
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxConsecutiveDroppedOutputBufferCount = r1
            int r0 = r4.f12170h0
            int r1 = r4.f12161Y
            if (r0 != r1) goto L_0x0125
            r17.mo14587B()
        L_0x0125:
            return r5
        L_0x0126:
            r4 = r17
            r3 = r22
            r5 = 1
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r7 = 21
            if (r6 < r7) goto L_0x013c
            r6 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x015e
            r4.mo14593a((android.media.MediaCodec) r3, (int) r2, (long) r10)
            return r5
        L_0x013c:
            r5 = 30000(0x7530, double:1.4822E-319)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x015e
            r5 = 11000(0x2af8, double:5.4347E-320)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0159
            r5 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0152 }
            goto L_0x0159
        L_0x0152:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0159:
            r4.mo14592a((android.media.MediaCodec) r3, (int) r2)
            r0 = 1
            return r0
        L_0x015e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.mo14004a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo14592a(MediaCodec mediaCodec, int i) {
        mo14589D();
        C3404s.m8583a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C3404s.m8582a();
        this.f11684T.renderedOutputBufferCount++;
        this.f12171i0 = 0;
        mo14588C();
    }

    @TargetApi(21)
    /* renamed from: a */
    public final void mo14593a(MediaCodec mediaCodec, int i, long j) {
        mo14589D();
        C3404s.m8583a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C3404s.m8582a();
        this.f11684T.renderedOutputBufferCount++;
        this.f12171i0 = 0;
        mo14588C();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m8603a(java.lang.String r5, int r6, int r7) {
        /*
            r0 = -1
            if (r6 == r0) goto L_0x0089
            if (r7 != r0) goto L_0x0007
            goto L_0x0089
        L_0x0007:
            r5.getClass()
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x0052;
                case -1662541442: goto L_0x0046;
                case 1187890754: goto L_0x003a;
                case 1331836730: goto L_0x002e;
                case 1599127256: goto L_0x0022;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r5 = -1
            goto L_0x005d
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0020
            goto L_0x0014
        L_0x0020:
            r5 = 5
            goto L_0x005d
        L_0x0022:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x002c
            goto L_0x0014
        L_0x002c:
            r5 = 4
            goto L_0x005d
        L_0x002e:
            java.lang.String r1 = "video/avc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0038
            goto L_0x0014
        L_0x0038:
            r5 = 3
            goto L_0x005d
        L_0x003a:
            java.lang.String r1 = "video/mp4v-es"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0044
            goto L_0x0014
        L_0x0044:
            r5 = 2
            goto L_0x005d
        L_0x0046:
            java.lang.String r1 = "video/hevc"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0050
            goto L_0x0014
        L_0x0050:
            r5 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r1 = "video/3gpp"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x005c
            goto L_0x0014
        L_0x005c:
            r5 = 0
        L_0x005d:
            switch(r5) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007d;
                case 2: goto L_0x0080;
                case 3: goto L_0x0061;
                case 4: goto L_0x0080;
                case 5: goto L_0x007d;
                default: goto L_0x0060;
            }
        L_0x0060:
            return r0
        L_0x0061:
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12151d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x006c
            return r0
        L_0x006c:
            r5 = 16
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r6, (int) r5)
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8588a((int) r7, (int) r5)
            int r7 = r7 * r6
            int r7 = r7 * 16
            int r7 = r7 * 16
            goto L_0x0082
        L_0x007d:
            int r7 = r7 * r6
            goto L_0x0083
        L_0x0080:
            int r7 = r7 * r6
        L_0x0082:
            r2 = 2
        L_0x0083:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.m8603a(java.lang.String, int, int):int");
    }

    /* renamed from: a */
    public static boolean m8604a(boolean z, C3226i iVar, C3226i iVar2) {
        if (!iVar.f11633f.equals(iVar2.f11633f)) {
            return false;
        }
        int i = iVar.f11640m;
        if (i == -1) {
            i = 0;
        }
        int i2 = iVar2.f11640m;
        if (i2 == -1) {
            i2 = 0;
        }
        if (i != i2) {
            return false;
        }
        if (z || (iVar.f11637j == iVar2.f11637j && iVar.f11638k == iVar2.f11638k)) {
            return true;
        }
        return false;
    }
}
