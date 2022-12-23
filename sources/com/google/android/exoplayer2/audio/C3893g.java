package com.google.android.exoplayer2.audio;

import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C3937b;
import com.google.android.exoplayer2.mediacodec.C3941c;
import com.google.android.exoplayer2.mediacodec.C3942d;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import h60.C17327j1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p039c7.C1801d;
import p099ga.C4865c1;
import p099ga.C4932s0;
import p099ga.C4949x0;
import p099ga.C4954z0;
import p125ia.C5316d;
import p125ia.C5321h;
import p125ia.C5326l;
import p137ja.C5413d;
import p137ja.C5414e;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6791m;
import p304x.C7041e;
import p304x.C7103t;
import p314xa.C7191i;
import p316y.C7218m;
import p316y.C7219n;
import p431cy.C16525b;

/* renamed from: com.google.android.exoplayer2.audio.g */
public final class C3893g extends MediaCodecRenderer implements C6791m {

    /* renamed from: V0 */
    public final Context f13600V0;

    /* renamed from: W0 */
    public final C3876a.C3877a f13601W0;

    /* renamed from: X0 */
    public final AudioSink f13602X0;

    /* renamed from: Y0 */
    public int f13603Y0;

    /* renamed from: Z0 */
    public boolean f13604Z0;

    /* renamed from: a1 */
    public Format f13605a1;

    /* renamed from: b1 */
    public long f13606b1;

    /* renamed from: c1 */
    public boolean f13607c1;

    /* renamed from: d1 */
    public boolean f13608d1;

    /* renamed from: e1 */
    public boolean f13609e1;

    /* renamed from: f1 */
    public C4949x0.C4950a f13610f1;

    /* renamed from: com.google.android.exoplayer2.audio.g$a */
    public final class C3894a implements AudioSink.C3875a {
        public C3894a() {
        }

        /* renamed from: a */
        public final void mo15944a(Exception exc) {
            C6776b0.m15968a("Audio sink error", exc);
            C3876a.C3877a aVar = C3893g.this.f13601W0;
            Handler handler = aVar.f13479a;
            if (handler != null) {
                handler.post(new C7218m(5, aVar, exc));
            }
        }
    }

    public C3893g(Context context, Handler handler, C4865c1.C4867b bVar, C3882e eVar) {
        super(1, 44100.0f);
        this.f13600V0 = context.getApplicationContext();
        this.f13602X0 = eVar;
        this.f13601W0 = new C3876a.C3877a(handler, bVar);
        eVar.f13563p = new C3894a();
    }

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
            if (this.f13609e1) {
                this.f13609e1 = false;
                this.f13602X0.reset();
            }
        } catch (Throwable th) {
            if (this.f13609e1) {
                this.f13609e1 = false;
                this.f13602X0.reset();
            }
            throw th;
        }
    }

    /* renamed from: B */
    public final void mo15809B() {
        this.f13602X0.mo15863p();
    }

    /* renamed from: C */
    public final void mo15810C() {
        mo15943u0();
        this.f13602X0.pause();
    }

    /* renamed from: G */
    public final C5414e mo15921G(C3941c cVar, Format format, Format format2) {
        int i;
        C5414e b = cVar.mo16078b(format, format2);
        int i2 = b.f17776e;
        if (mo15942t0(format2, cVar) > this.f13603Y0) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = cVar.f13853a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = b.f17775d;
        }
        return new C5414e(str, format, format2, i, i3);
    }

    /* renamed from: P */
    public final float mo15922P(float f, Format[] formatArr) {
        int i = -1;
        for (Format format : formatArr) {
            int i2 = format.f13400A;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* renamed from: Q */
    public final List<C3941c> mo15923Q(C3942d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        C3941c cVar;
        String str = format.f13418m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f13602X0.mo15849c(format)) {
            List<C3941c> d = MediaCodecUtil.m10534d("audio/raw", false, false);
            if (d.isEmpty()) {
                cVar = null;
            } else {
                cVar = d.get(0);
            }
            if (cVar != null) {
                return Collections.singletonList(cVar);
            }
        }
        List<C3941c> a = dVar.mo17a(str, z, false);
        Pattern pattern = MediaCodecUtil.f13830a;
        ArrayList arrayList = new ArrayList(a);
        Collections.sort(arrayList, new C7191i(new C17327j1(format, 5), 0));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(dVar.mo17a("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.mediacodec.C3937b.C3938a mo15924S(com.google.android.exoplayer2.mediacodec.C3941c r9, com.google.android.exoplayer2.Format r10, android.media.MediaCrypto r11, float r12) {
        /*
            r8 = this;
            com.google.android.exoplayer2.Format[] r0 = r8.f13468h
            r0.getClass()
            int r1 = r8.mo15942t0(r10, r9)
            int r2 = r0.length
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x000f
            goto L_0x0028
        L_0x000f:
            int r2 = r0.length
            r5 = 0
        L_0x0011:
            if (r5 >= r2) goto L_0x0028
            r6 = r0[r5]
            ja.e r7 = r9.mo16078b(r10, r6)
            int r7 = r7.f17775d
            if (r7 == 0) goto L_0x0025
            int r6 = r8.mo15942t0(r6, r9)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0028:
            r8.f13603Y0 = r1
            java.lang.String r0 = r9.f13853a
            int r1 = p277ub.C6774a0.f20959a
            r2 = 24
            if (r1 >= r2) goto L_0x0061
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = p277ub.C6774a0.f20961c
            java.lang.String r5 = "samsung"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = p277ub.C6774a0.f20960b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005f
            java.lang.String r5 = "herolte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005f
            java.lang.String r5 = "heroqlte"
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x0061
        L_0x005f:
            r0 = 1
            goto L_0x0062
        L_0x0061:
            r0 = 0
        L_0x0062:
            r8.f13604Z0 = r0
            java.lang.String r0 = r9.f13855c
            int r5 = r8.f13603Y0
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r0)
            int r0 = r10.f13431z
            java.lang.String r7 = "channel-count"
            r6.setInteger(r7, r0)
            int r0 = r10.f13400A
            java.lang.String r7 = "sample-rate"
            r6.setInteger(r7, r0)
            java.util.List<byte[]> r0 = r10.f13420o
            com.google.android.play.core.appupdate.C14226d.m35338E0(r6, r0)
            java.lang.String r0 = "max-input-size"
            com.google.android.play.core.appupdate.C14226d.m35336C0(r6, r0, r5)
            r0 = 23
            if (r1 < r0) goto L_0x00b7
            java.lang.String r5 = "priority"
            r6.setInteger(r5, r3)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00b7
            if (r1 != r0) goto L_0x00af
            java.lang.String r0 = p277ub.C6774a0.f20962d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00ad
            java.lang.String r5 = "AXON 7 mini"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00af
        L_0x00ad:
            r0 = 1
            goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = "operating-rate"
            r6.setFloat(r0, r12)
        L_0x00b7:
            r12 = 28
            if (r1 > r12) goto L_0x00ca
            java.lang.String r12 = r10.f13418m
            java.lang.String r0 = "audio/ac4"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00ca
            java.lang.String r12 = "ac4-is-sync"
            r6.setInteger(r12, r4)
        L_0x00ca:
            java.lang.String r12 = "audio/raw"
            if (r1 < r2) goto L_0x00f2
            com.google.android.exoplayer2.audio.AudioSink r0 = r8.f13602X0
            int r1 = r10.f13431z
            int r2 = r10.f13400A
            r5 = 4
            com.google.android.exoplayer2.Format$b r7 = new com.google.android.exoplayer2.Format$b
            r7.<init>()
            r7.f13446k = r12
            r7.f13459x = r1
            r7.f13460y = r2
            r7.f13461z = r5
            com.google.android.exoplayer2.Format r1 = r7.mo15806a()
            int r0 = r0.mo15858k(r1)
            r1 = 2
            if (r0 != r1) goto L_0x00f2
            java.lang.String r0 = "pcm-encoding"
            r6.setInteger(r0, r5)
        L_0x00f2:
            java.lang.String r0 = r9.f13854b
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = r10.f13418m
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0103
            r3 = 1
        L_0x0103:
            r12 = 0
            if (r3 == 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r10 = r12
        L_0x0108:
            r8.f13605a1 = r10
            com.google.android.exoplayer2.mediacodec.b$a r10 = new com.google.android.exoplayer2.mediacodec.b$a
            r10.<init>(r9, r6, r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3893g.mo15924S(com.google.android.exoplayer2.mediacodec.c, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.b$a");
    }

    /* renamed from: X */
    public final void mo15925X(IllegalStateException illegalStateException) {
        C6776b0.m15968a("Audio codec error", illegalStateException);
        C3876a.C3877a aVar = this.f13601W0;
        Handler handler = aVar.f13479a;
        if (handler != null) {
            handler.post(new C7219n(6, aVar, illegalStateException));
        }
    }

    /* renamed from: Y */
    public final void mo15926Y(long j, String str, long j2) {
        C3876a.C3877a aVar = this.f13601W0;
        Handler handler = aVar.f13479a;
        if (handler != null) {
            handler.post(new C5321h(aVar, str, j, j2));
        }
    }

    /* renamed from: Z */
    public final void mo15927Z(String str) {
        C3876a.C3877a aVar = this.f13601W0;
        Handler handler = aVar.f13479a;
        if (handler != null) {
            handler.post(new C7041e(10, aVar, str));
        }
    }

    /* renamed from: a */
    public final void mo15928a(C4932s0 s0Var) {
        this.f13602X0.mo15847a(s0Var);
    }

    /* renamed from: a0 */
    public final C5414e mo15929a0(C16525b bVar) throws ExoPlaybackException {
        C5414e a0 = super.mo15929a0(bVar);
        C3876a.C3877a aVar = this.f13601W0;
        Format format = (Format) bVar.f43144b;
        Handler handler = aVar.f13479a;
        if (handler != null) {
            handler.post(new C1801d(2, aVar, format, a0));
        }
        return a0;
    }

    /* renamed from: b */
    public final C4932s0 mo15930b() {
        return this.f13602X0.mo15848b();
    }

    /* renamed from: b0 */
    public final void mo15931b0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        int i2;
        Format format2 = this.f13605a1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f13775J != null) {
            if ("audio/raw".equals(format.f13418m)) {
                i = format.f13401B;
            } else if (C6774a0.f20959a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = C6774a0.m15955o(mediaFormat.getInteger("v-bits-per-sample"));
            } else if ("audio/raw".equals(format.f13418m)) {
                i = format.f13401B;
            } else {
                i = 2;
            }
            Format.C3872b bVar = new Format.C3872b();
            bVar.f13446k = "audio/raw";
            bVar.f13461z = i;
            bVar.f13432A = format.f13402C;
            bVar.f13433B = format.f13403D;
            bVar.f13459x = mediaFormat.getInteger("channel-count");
            bVar.f13460y = mediaFormat.getInteger("sample-rate");
            Format format3 = new Format(bVar);
            if (this.f13604Z0 && format3.f13431z == 6 && (i2 = format.f13431z) < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < format.f13431z; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            }
            format = format3;
        }
        try {
            this.f13602X0.mo15855h(format, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw mo15834w(e, e.format, false);
        }
    }

    /* renamed from: d */
    public final boolean mo15932d() {
        if (!this.f13776J0 || !this.f13602X0.mo15850d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d0 */
    public final void mo15933d0() {
        this.f13602X0.mo15861n();
    }

    /* renamed from: e0 */
    public final void mo15934e0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f13607c1 && !decoderInputBuffer.mo21175g()) {
            if (Math.abs(decoderInputBuffer.f13649f - this.f13606b1) > 500000) {
                this.f13606b1 = decoderInputBuffer.f13649f;
            }
            this.f13607c1 = false;
        }
    }

    /* renamed from: g0 */
    public final boolean mo15935g0(long j, long j2, C3937b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f13605a1 != null && (i2 & 2) != 0) {
            bVar.getClass();
            bVar.mo16072l(i, false);
            return true;
        } else if (z) {
            if (bVar != null) {
                bVar.mo16072l(i, false);
            }
            this.f13790Q0.getClass();
            this.f13602X0.mo15861n();
            return true;
        } else {
            try {
                if (!this.f13602X0.mo15857j(byteBuffer, j3, i3)) {
                    return false;
                }
                if (bVar != null) {
                    bVar.mo16072l(i, false);
                }
                this.f13790Q0.getClass();
                return true;
            } catch (AudioSink.InitializationException e) {
                throw mo15834w(e, e.format, e.isRecoverable);
            } catch (AudioSink.WriteException e2) {
                throw mo15834w(e2, format, e2.isRecoverable);
            }
        }
    }

    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean isReady() {
        return this.f13602X0.mo15851e() || super.isReady();
    }

    /* renamed from: j */
    public final void mo15819j(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f13602X0.setVolume(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f13602X0.mo15866r((C5316d) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f13602X0.mo15865q(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f13602X0.mo15854g(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f13610f1 = (C4949x0.C4950a) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f13602X0.mo15852f((C5326l) obj);
        }
    }

    /* renamed from: j0 */
    public final void mo15938j0() throws ExoPlaybackException {
        try {
            this.f13602X0.mo15859l();
        } catch (AudioSink.WriteException e) {
            throw mo15834w(e, e.format, e.isRecoverable);
        }
    }

    /* renamed from: n */
    public final long mo15939n() {
        if (this.f13466f == 2) {
            mo15943u0();
        }
        return this.f13606b1;
    }

    /* renamed from: o0 */
    public final boolean mo15940o0(Format format) {
        return this.f13602X0.mo15849c(format);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r4 != null) goto L_0x004c;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo15941p0(com.google.android.exoplayer2.mediacodec.C3942d r11, com.google.android.exoplayer2.Format r12) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r10 = this;
            java.lang.String r0 = r12.f13418m
            boolean r0 = p277ub.C6792n.m15995h(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = p277ub.C6774a0.f20959a
            r2 = 21
            if (r0 < r2) goto L_0x0013
            r0 = 32
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            java.lang.Class<? extends la.b> r2 = r12.f13405F
            r3 = 1
            if (r2 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0029
            java.lang.Class<la.c> r5 = p161la.C5654c.class
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            java.lang.String r5 = "audio/raw"
            if (r2 == 0) goto L_0x004f
            com.google.android.exoplayer2.audio.AudioSink r6 = r10.f13602X0
            boolean r6 = r6.mo15849c(r12)
            if (r6 == 0) goto L_0x004f
            if (r4 == 0) goto L_0x004c
            java.util.List r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10534d(r5, r1, r1)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0044
            r4 = 0
            goto L_0x004a
        L_0x0044:
            java.lang.Object r4 = r4.get(r1)
            com.google.android.exoplayer2.mediacodec.c r4 = (com.google.android.exoplayer2.mediacodec.C3941c) r4
        L_0x004a:
            if (r4 == 0) goto L_0x004f
        L_0x004c:
            r11 = r0 | 12
            return r11
        L_0x004f:
            java.lang.String r4 = r12.f13418m
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0060
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.f13602X0
            boolean r4 = r4.mo15849c(r12)
            if (r4 != 0) goto L_0x0060
            return r3
        L_0x0060:
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.f13602X0
            int r6 = r12.f13431z
            int r7 = r12.f13400A
            r8 = 2
            com.google.android.exoplayer2.Format$b r9 = new com.google.android.exoplayer2.Format$b
            r9.<init>()
            r9.f13446k = r5
            r9.f13459x = r6
            r9.f13460y = r7
            r9.f13461z = r8
            com.google.android.exoplayer2.Format r5 = r9.mo15806a()
            boolean r4 = r4.mo15849c(r5)
            if (r4 != 0) goto L_0x007f
            return r3
        L_0x007f:
            java.util.List r11 = r10.mo15923Q(r11, r12, r1)
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L_0x008a
            return r3
        L_0x008a:
            if (r2 != 0) goto L_0x008d
            return r8
        L_0x008d:
            java.lang.Object r11 = r11.get(r1)
            com.google.android.exoplayer2.mediacodec.c r11 = (com.google.android.exoplayer2.mediacodec.C3941c) r11
            boolean r1 = r11.mo16079c(r12)
            if (r1 == 0) goto L_0x00a2
            boolean r11 = r11.mo16080d(r12)
            if (r11 == 0) goto L_0x00a2
            r11 = 16
            goto L_0x00a4
        L_0x00a2:
            r11 = 8
        L_0x00a4:
            if (r1 == 0) goto L_0x00a8
            r12 = 4
            goto L_0x00a9
        L_0x00a8:
            r12 = 3
        L_0x00a9:
            r11 = r11 | r12
            r11 = r11 | r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3893g.mo15941p0(com.google.android.exoplayer2.mediacodec.d, com.google.android.exoplayer2.Format):int");
    }

    /* renamed from: t0 */
    public final int mo15942t0(Format format, C3941c cVar) {
        int i;
        boolean z;
        if ("OMX.google.raw.decoder".equals(cVar.f13853a) && (i = C6774a0.f20959a) < 24) {
            if (i != 23) {
                return -1;
            }
            UiModeManager uiModeManager = (UiModeManager) this.f13600V0.getApplicationContext().getSystemService("uimode");
            if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return -1;
            }
        }
        return format.f13419n;
    }

    /* renamed from: u0 */
    public final void mo15943u0() {
        long m = this.f13602X0.mo15860m(mo15932d());
        if (m != Long.MIN_VALUE) {
            if (!this.f13608d1) {
                m = Math.max(this.f13606b1, m);
            }
            this.f13606b1 = m;
            this.f13608d1 = false;
        }
    }

    /* renamed from: v */
    public final C6791m mo15833v() {
        return this;
    }

    /* renamed from: x */
    public final void mo15835x() {
        this.f13609e1 = true;
        try {
            this.f13602X0.flush();
            try {
                super.mo15835x();
            } finally {
                this.f13601W0.mo15880a(this.f13790Q0);
            }
        } catch (Throwable th) {
            super.mo15835x();
            throw th;
        } finally {
            this.f13601W0.mo15880a(this.f13790Q0);
        }
    }

    /* renamed from: y */
    public final void mo15836y(boolean z, boolean z2) throws ExoPlaybackException {
        C5413d dVar = new C5413d();
        this.f13790Q0 = dVar;
        C3876a.C3877a aVar = this.f13601W0;
        Handler handler = aVar.f13479a;
        if (handler != null) {
            handler.post(new C7103t(7, aVar, dVar));
        }
        C4954z0 z0Var = this.f13464d;
        z0Var.getClass();
        if (z0Var.f16738a) {
            this.f13602X0.mo15862o();
        } else {
            this.f13602X0.mo15856i();
        }
    }

    /* renamed from: z */
    public final void mo15837z(long j, boolean z) throws ExoPlaybackException {
        super.mo15837z(j, z);
        this.f13602X0.flush();
        this.f13606b1 = j;
        this.f13607c1 = true;
        this.f13608d1 = true;
    }
}
