package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.appsflyer.internal.referrer.Payload;
import com.fyber.inneractive.sdk.player.exoplayer2.C3054d;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3231m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3065c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3066d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3232a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3387g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@TargetApi(16)
public class MediaCodecAudioRenderer extends C3233b implements C3387g {

    /* renamed from: V */
    public final AudioRendererEventListener.EventDispatcher f10367V;

    /* renamed from: W */
    public final C3038c f10368W;

    /* renamed from: X */
    public boolean f10369X;

    /* renamed from: Y */
    public int f10370Y;

    /* renamed from: Z */
    public int f10371Z;

    /* renamed from: a0 */
    public long f10372a0;

    /* renamed from: b0 */
    public boolean f10373b0;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer$b */
    public final class C3034b implements C3038c.C3044f {
        public C3034b() {
        }
    }

    public MediaCodecAudioRenderer(C3235c cVar, C3065c<C3066d> cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(cVar, cVar2, z, (Handler) null, (AudioRendererEventListener) null, new C3036b[0]);
    }

    /* renamed from: b */
    public boolean mo14005b() {
        boolean z;
        if (this.f11681Q) {
            C3038c cVar = this.f10368W;
            if (!cVar.mo14031e() || (cVar.f10405X && !cVar.mo14030d())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public C3231m mo14006i() {
        return this.f10368W.f10429s;
    }

    public boolean isReady() {
        return this.f10368W.mo14030d() || super.isReady();
    }

    /* renamed from: j */
    public C3387g mo13970j() {
        return this;
    }

    /* renamed from: o */
    public long mo14008o() {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        C3038c cVar = this.f10368W;
        boolean b = mo14005b();
        if (!cVar.mo14031e() || cVar.f10393L == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            j2 = Long.MIN_VALUE;
            j = Long.MIN_VALUE;
        } else {
            if (cVar.f10419i.getPlayState() == 3) {
                C3038c.C3040b bVar = cVar.f10417g;
                long a = (bVar.mo14039a() * 1000000) / ((long) bVar.f10441c);
                if (a != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - cVar.f10382A >= 30000) {
                        long[] jArr = cVar.f10416f;
                        int i = cVar.f10434x;
                        jArr[i] = a - nanoTime;
                        cVar.f10434x = (i + 1) % 10;
                        int i2 = cVar.f10435y;
                        if (i2 < 10) {
                            cVar.f10435y = i2 + 1;
                        }
                        cVar.f10382A = nanoTime;
                        cVar.f10436z = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = cVar.f10435y;
                            if (i3 >= i4) {
                                break;
                            }
                            cVar.f10436z = (cVar.f10416f[i3] / ((long) i4)) + cVar.f10436z;
                            i3++;
                        }
                    }
                    if (!cVar.mo14032f() && nanoTime - cVar.f10384C >= 500000) {
                        boolean d = cVar.f10417g.mo14043d();
                        cVar.f10383B = d;
                        if (d) {
                            long c = cVar.f10417g.mo14042c() / 1000;
                            long b2 = cVar.f10417g.mo14041b();
                            if (c < cVar.f10395N) {
                                cVar.f10383B = false;
                            } else if (Math.abs(c - nanoTime) > 5000000) {
                                cVar.mo14025b();
                                cVar.mo14028c();
                                cVar.f10383B = false;
                            } else if (Math.abs(cVar.mo14026b(b2) - a) > 5000000) {
                                cVar.mo14025b();
                                cVar.mo14028c();
                                cVar.f10383B = false;
                            }
                        }
                        Method method = cVar.f10385D;
                        if (method != null && !cVar.f10425o) {
                            try {
                                long intValue = (((long) ((Integer) method.invoke(cVar.f10419i, (Object[]) null)).intValue()) * 1000) - cVar.f10427q;
                                cVar.f10396O = intValue;
                                long max = Math.max(intValue, 0);
                                cVar.f10396O = max;
                                if (max > 5000000) {
                                    cVar.f10396O = 0;
                                }
                            } catch (Exception unused) {
                                cVar.f10385D = null;
                            }
                        }
                        cVar.f10384C = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (cVar.f10383B) {
                j3 = cVar.mo14026b(cVar.f10417g.mo14041b() + cVar.mo14020a(nanoTime2 - (cVar.f10417g.mo14042c() / 1000)));
            } else {
                if (cVar.f10435y == 0) {
                    C3038c.C3040b bVar2 = cVar.f10417g;
                    j5 = (bVar2.mo14039a() * 1000000) / ((long) bVar2.f10441c);
                } else {
                    j5 = nanoTime2 + cVar.f10436z;
                }
                if (!b) {
                    j3 = j5 - cVar.f10396O;
                } else {
                    j3 = j5;
                }
            }
            long j6 = cVar.f10394M;
            while (!cVar.f10418h.isEmpty() && j3 >= cVar.f10418h.getFirst().f10454c) {
                C3038c.C3045g remove = cVar.f10418h.remove();
                cVar.f10429s = remove.f10452a;
                cVar.f10431u = remove.f10454c;
                cVar.f10430t = remove.f10453b - cVar.f10394M;
            }
            if (cVar.f10429s.f11656a == 1.0f) {
                j4 = (j3 + cVar.f10430t) - cVar.f10431u;
            } else {
                if (cVar.f10418h.isEmpty()) {
                    C3051h hVar = cVar.f10410b;
                    long j7 = hVar.f10505k;
                    if (j7 >= 1024) {
                        j4 = cVar.f10430t + C3406u.m8591a(j3 - cVar.f10431u, hVar.f10504j, j7);
                    }
                }
                j4 = cVar.f10430t + ((long) (((double) cVar.f10429s.f11656a) * ((double) (j3 - cVar.f10431u))));
            }
            j = j6 + j4;
            j2 = Long.MIN_VALUE;
        }
        if (j != j2) {
            if (!this.f10373b0) {
                j = Math.max(this.f10372a0, j);
            }
            this.f10372a0 = j;
            this.f10373b0 = false;
        }
        return this.f10372a0;
    }

    /* renamed from: p */
    public void mo13975p() {
        try {
            C3038c cVar = this.f10368W;
            cVar.mo14034h();
            for (C3036b g : cVar.f10412c) {
                g.mo14019g();
            }
            cVar.f10407Z = 0;
            cVar.f10406Y = false;
            try {
                super.mo13975p();
            } finally {
                this.f11684T.ensureUpdated();
                this.f10367V.disabled(this.f11684T);
            }
        } catch (Throwable th) {
            super.mo13975p();
            throw th;
        } finally {
            this.f11684T.ensureUpdated();
            this.f10367V.disabled(this.f11684T);
        }
    }

    /* renamed from: q */
    public void mo13976q() {
        this.f10368W.mo14033g();
    }

    /* renamed from: r */
    public void mo13977r() {
        C3038c cVar = this.f10368W;
        cVar.f10406Y = false;
        if (cVar.mo14031e()) {
            cVar.mo14036j();
            C3038c.C3040b bVar = cVar.f10417g;
            if (bVar.f10445g == -9223372036854775807L) {
                bVar.f10439a.pause();
            }
        }
    }

    /* renamed from: w */
    public void mo14009w() throws C3054d {
        try {
            C3038c cVar = this.f10368W;
            if (cVar.f10405X) {
                return;
            }
            if (cVar.mo14031e()) {
                if (cVar.mo14023a()) {
                    C3038c.C3040b bVar = cVar.f10417g;
                    long c = cVar.mo14028c();
                    bVar.f10446h = bVar.mo14039a();
                    bVar.f10445g = SystemClock.elapsedRealtime() * 1000;
                    bVar.f10447i = c;
                    bVar.f10439a.stop();
                    cVar.f10433w = 0;
                    cVar.f10405X = true;
                }
            }
        } catch (C3038c.C3046h e) {
            throw C3054d.m7662a(e, this.f10345c);
        }
    }

    public MediaCodecAudioRenderer(C3235c cVar, C3065c cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, C3036b... bVarArr) {
        super(1, cVar, cVar2, z);
        this.f10368W = new C3038c(bVarArr, new C3034b());
        this.f10367V = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r4 == false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0113, code lost:
        if (r10 == false) goto L_0x0116;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13996a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c r10, com.fyber.inneractive.sdk.player.exoplayer2.C3226i r11) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d.C3239b {
        /*
            r9 = this;
            java.lang.String r0 = r11.f11633f
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h.m8521d(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r3 = 16
            r4 = 21
            if (r1 < r4) goto L_0x0015
            r5 = 16
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c r6 = r9.f10368W
            r6.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r10 = r10.mo14344a(r0, r2)
            r0 = 1
            if (r10 != 0) goto L_0x0023
            return r0
        L_0x0023:
            if (r1 < r4) goto L_0x0115
            int r4 = r11.f11646s
            r6 = -1
            if (r4 == r6) goto L_0x005f
            android.media.MediaCodecInfo$CodecCapabilities r7 = r10.f11663e
            if (r7 != 0) goto L_0x0035
            java.lang.String r4 = "sampleRate.caps"
            r10.mo14334a((java.lang.String) r4)
        L_0x0033:
            r4 = 0
            goto L_0x005d
        L_0x0035:
            android.media.MediaCodecInfo$AudioCapabilities r7 = r7.getAudioCapabilities()
            if (r7 != 0) goto L_0x0041
            java.lang.String r4 = "sampleRate.aCaps"
            r10.mo14334a((java.lang.String) r4)
            goto L_0x0033
        L_0x0041:
            boolean r7 = r7.isSampleRateSupported(r4)
            if (r7 != 0) goto L_0x005c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "sampleRate.support, "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r10.mo14334a((java.lang.String) r4)
            goto L_0x0033
        L_0x005c:
            r4 = 1
        L_0x005d:
            if (r4 == 0) goto L_0x0116
        L_0x005f:
            int r11 = r11.f11645r
            if (r11 == r6) goto L_0x0115
            android.media.MediaCodecInfo$CodecCapabilities r4 = r10.f11663e
            if (r4 != 0) goto L_0x006f
            java.lang.String r11 = "channelCount.caps"
            r10.mo14334a((java.lang.String) r11)
        L_0x006c:
            r10 = 0
            goto L_0x0113
        L_0x006f:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x007b
            java.lang.String r11 = "channelCount.aCaps"
            r10.mo14334a((java.lang.String) r11)
            goto L_0x006c
        L_0x007b:
            java.lang.String r6 = r10.f11662d
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r0) goto L_0x00fa
            r7 = 26
            if (r1 < r7) goto L_0x008b
            if (r4 <= 0) goto L_0x008b
            goto L_0x00fa
        L_0x008b:
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/3gpp"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/amr-wb"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/vorbis"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/flac"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r1 = "audio/gsm"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            goto L_0x00fa
        L_0x00e4:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00ee
            r3 = 6
            goto L_0x00f9
        L_0x00ee:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00f7
            goto L_0x00f9
        L_0x00f7:
            r3 = 30
        L_0x00f9:
            r4 = r3
        L_0x00fa:
            if (r4 >= r11) goto L_0x0112
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "channelCount.support, "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.mo14334a((java.lang.String) r11)
            goto L_0x006c
        L_0x0112:
            r10 = 1
        L_0x0113:
            if (r10 == 0) goto L_0x0116
        L_0x0115:
            r2 = 1
        L_0x0116:
            if (r2 == 0) goto L_0x011a
            r10 = 3
            goto L_0x011b
        L_0x011a:
            r10 = 2
        L_0x011b:
            r11 = r5 | 4
            r10 = r10 | r11
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.mo13996a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    /* renamed from: a */
    public C3232a mo13998a(C3235c cVar, C3226i iVar, boolean z) throws C3237d.C3239b {
        String str = iVar.f11633f;
        this.f10368W.getClass();
        return cVar.mo14344a(iVar.f11633f, z);
    }

    /* renamed from: a */
    public void mo14002a(C3232a aVar, MediaCodec mediaCodec, C3226i iVar, MediaCrypto mediaCrypto) {
        boolean z;
        String str = aVar.f11659a;
        if (C3406u.f12148a < 24 && "OMX.SEC.aac.dec".equals(str) && Payload.SOURCE_SAMSUNG.equals(C3406u.f12150c)) {
            String str2 = C3406u.f12149b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.f10369X = z;
                mediaCodec.configure(iVar.mo14322a(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z = false;
        this.f10369X = z;
        mediaCodec.configure(iVar.mo14322a(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: a */
    public void mo14003a(String str, long j, long j2) {
        this.f10367V.decoderInitialized(str, j, j2);
    }

    /* renamed from: a */
    public void mo14001a(C3226i iVar) throws C3054d {
        super.mo14001a(iVar);
        this.f10367V.inputFormatChanged(iVar);
        this.f10370Y = "audio/raw".equals(iVar.f11633f) ? iVar.f11647t : 2;
        this.f10371Z = iVar.f11645r;
    }

    /* renamed from: a */
    public void mo14000a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C3054d {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f10369X || integer != 6 || (i = this.f10371Z) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f10371Z; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.f10368W.mo14022a("audio/raw", integer, integer2, this.f10370Y, 0, iArr);
        } catch (C3038c.C3042d e) {
            throw C3054d.m7662a(e, this.f10345c);
        }
    }

    /* renamed from: a */
    public void mo13959a(long j, boolean z) throws C3054d {
        super.mo13959a(j, z);
        this.f10368W.mo14034h();
        this.f10372a0 = j;
        this.f10373b0 = true;
    }

    /* renamed from: a */
    public C3231m mo13997a(C3231m mVar) {
        return this.f10368W.mo14021a(mVar);
    }

    /* renamed from: a */
    public boolean mo14004a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3054d {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f11684T.skippedOutputBufferCount++;
            C3038c cVar = this.f10368W;
            if (cVar.f10393L == 1) {
                cVar.f10393L = 2;
            }
            return true;
        }
        try {
            if (!this.f10368W.mo14024a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f11684T.renderedOutputBufferCount++;
            return true;
        } catch (C3038c.C3043e | C3038c.C3046h e) {
            throw C3054d.m7662a(e, this.f10345c);
        }
    }

    /* renamed from: a */
    public void mo13961a(boolean z) throws C3054d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f11684T = decoderCounters;
        this.f10367V.enabled(decoderCounters);
        int i = this.f10344b.f11752a;
        boolean z2 = false;
        if (i != 0) {
            C3038c cVar = this.f10368W;
            cVar.getClass();
            if (C3406u.f12148a >= 21) {
                z2 = true;
            }
            C3380a.m8507b(z2);
            if (!cVar.f10409a0 || cVar.f10407Z != i) {
                cVar.f10409a0 = true;
                cVar.f10407Z = i;
                cVar.mo14034h();
                return;
            }
            return;
        }
        C3038c cVar2 = this.f10368W;
        if (cVar2.f10409a0) {
            cVar2.f10409a0 = false;
            cVar2.f10407Z = 0;
            cVar2.mo14034h();
        }
    }

    /* renamed from: a */
    public void mo13999a(int i, Object obj) throws C3054d {
        if (i == 2) {
            C3038c cVar = this.f10368W;
            float floatValue = ((Float) obj).floatValue();
            if (cVar.f10397P != floatValue) {
                cVar.f10397P = floatValue;
                cVar.mo14037k();
            }
        } else if (i == 3) {
            int intValue = ((Integer) obj).intValue();
            C3038c cVar2 = this.f10368W;
            if (cVar2.f10424n != intValue) {
                cVar2.f10424n = intValue;
                if (!cVar2.f10409a0) {
                    cVar2.mo14034h();
                    cVar2.f10407Z = 0;
                }
            }
        }
    }
}
