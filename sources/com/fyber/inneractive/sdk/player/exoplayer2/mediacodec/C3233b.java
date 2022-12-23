package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3026a;
import com.fyber.inneractive.sdk.player.exoplayer2.C3054d;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3228j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3063b;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3065c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3066d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3237d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0016g;

@TargetApi(16)
/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b */
public abstract class C3233b extends C3026a {

    /* renamed from: U */
    public static final byte[] f11664U;

    /* renamed from: A */
    public boolean f11665A;

    /* renamed from: B */
    public boolean f11666B;

    /* renamed from: C */
    public boolean f11667C;

    /* renamed from: D */
    public boolean f11668D;

    /* renamed from: E */
    public ByteBuffer[] f11669E;

    /* renamed from: F */
    public ByteBuffer[] f11670F;

    /* renamed from: G */
    public long f11671G;

    /* renamed from: H */
    public int f11672H;

    /* renamed from: I */
    public int f11673I;

    /* renamed from: J */
    public boolean f11674J;

    /* renamed from: K */
    public boolean f11675K;

    /* renamed from: L */
    public int f11676L;

    /* renamed from: M */
    public int f11677M;

    /* renamed from: N */
    public boolean f11678N;

    /* renamed from: O */
    public boolean f11679O;

    /* renamed from: P */
    public boolean f11680P;

    /* renamed from: Q */
    public boolean f11681Q;

    /* renamed from: R */
    public boolean f11682R;

    /* renamed from: S */
    public boolean f11683S;

    /* renamed from: T */
    public DecoderCounters f11684T;

    /* renamed from: i */
    public final C3235c f11685i;

    /* renamed from: j */
    public final C3065c<C3066d> f11686j;

    /* renamed from: k */
    public final boolean f11687k;

    /* renamed from: l */
    public final C3058b f11688l;

    /* renamed from: m */
    public final C3058b f11689m;

    /* renamed from: n */
    public final C3228j f11690n;

    /* renamed from: o */
    public final List<Long> f11691o;

    /* renamed from: p */
    public final MediaCodec.BufferInfo f11692p;

    /* renamed from: q */
    public C3226i f11693q;

    /* renamed from: r */
    public MediaCodec f11694r;

    /* renamed from: s */
    public C3063b<C3066d> f11695s;

    /* renamed from: t */
    public C3063b<C3066d> f11696t;

    /* renamed from: u */
    public boolean f11697u;

    /* renamed from: v */
    public boolean f11698v;

    /* renamed from: w */
    public boolean f11699w;

    /* renamed from: x */
    public boolean f11700x;

    /* renamed from: y */
    public boolean f11701y;

    /* renamed from: z */
    public boolean f11702z;

    static {
        int i = C3406u.f12148a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        f11664U = bArr;
    }

    public C3233b(int i, C3235c cVar, C3065c<C3066d> cVar2, boolean z) {
        super(i);
        boolean z2;
        if (C3406u.f12148a >= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C3380a.m8507b(z2);
        this.f11685i = (C3235c) C3380a.m8503a(cVar);
        this.f11686j = cVar2;
        this.f11687k = z;
        this.f11688l = new C3058b(0);
        this.f11689m = C3058b.m7664b();
        this.f11690n = new C3228j();
        this.f11691o = new ArrayList();
        this.f11692p = new MediaCodec.BufferInfo();
        this.f11676L = 0;
        this.f11677M = 0;
    }

    /* renamed from: a */
    public abstract int mo13996a(C3235c cVar, C3226i iVar) throws C3237d.C3239b;

    /* renamed from: a */
    public C3232a mo13998a(C3235c cVar, C3226i iVar, boolean z) throws C3237d.C3239b {
        return cVar.mo14344a(iVar.f11633f, z);
    }

    /* renamed from: a */
    public abstract void mo14000a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C3054d;

    /* renamed from: a */
    public void mo14337a(C3058b bVar) {
    }

    /* renamed from: a */
    public abstract void mo14002a(C3232a aVar, MediaCodec mediaCodec, C3226i iVar, MediaCrypto mediaCrypto) throws C3237d.C3239b;

    /* renamed from: a */
    public abstract void mo14003a(String str, long j, long j2);

    /* renamed from: a */
    public abstract boolean mo14004a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C3054d;

    /* renamed from: a */
    public boolean mo14338a(MediaCodec mediaCodec, boolean z, C3226i iVar, C3226i iVar2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo14005b() {
        return this.f11681Q;
    }

    public boolean isReady() {
        boolean z;
        if (this.f11693q != null && !this.f11682R) {
            if (this.f10349g) {
                z = this.f10350h;
            } else {
                z = this.f10347e.isReady();
            }
            if (z || this.f11673I >= 0 || (this.f11671G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f11671G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void mo13975p() {
        this.f11693q = null;
        try {
            mo14342v();
            try {
                C3063b<C3066d> bVar = this.f11695s;
                if (bVar != null) {
                    this.f11686j.mo14077a(bVar);
                }
                try {
                    C3063b<C3066d> bVar2 = this.f11696t;
                    if (!(bVar2 == null || bVar2 == this.f11695s)) {
                        this.f11686j.mo14077a(bVar2);
                    }
                } finally {
                    this.f11695s = null;
                    this.f11696t = null;
                }
            } catch (Throwable th) {
                C3063b<C3066d> bVar3 = this.f11696t;
                if (!(bVar3 == null || bVar3 == this.f11695s)) {
                    this.f11686j.mo14077a(bVar3);
                }
                throw th;
            } finally {
                this.f11695s = null;
                this.f11696t = null;
            }
        } catch (Throwable th2) {
            try {
                C3063b<C3066d> bVar4 = this.f11696t;
                if (!(bVar4 == null || bVar4 == this.f11695s)) {
                    this.f11686j.mo14077a(bVar4);
                }
                throw th2;
            } finally {
                this.f11695s = null;
                this.f11696t = null;
            }
        } finally {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0139 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14339s() throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r15 = this;
            android.media.MediaCodec r0 = r15.f11694r
            r1 = 0
            if (r0 == 0) goto L_0x0208
            int r2 = r15.f11677M
            r3 = 2
            if (r2 == r3) goto L_0x0208
            boolean r2 = r15.f11680P
            if (r2 == 0) goto L_0x0010
            goto L_0x0208
        L_0x0010:
            int r2 = r15.f11672H
            if (r2 >= 0) goto L_0x002a
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r15.f11672H = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r2 = r15.f11688l
            java.nio.ByteBuffer[] r4 = r15.f11669E
            r0 = r4[r0]
            r2.f10528c = r0
            r2.mo14057a()
        L_0x002a:
            int r0 = r15.f11677M
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0048
            boolean r0 = r15.f11701y
            if (r0 == 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r15.f11679O = r4
            android.media.MediaCodec r5 = r15.f11694r
            int r6 = r15.f11672H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f11672H = r2
        L_0x0045:
            r15.f11677M = r3
            return r1
        L_0x0048:
            boolean r0 = r15.f11667C
            if (r0 == 0) goto L_0x0068
            r15.f11667C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            java.nio.ByteBuffer r0 = r0.f10528c
            byte[] r1 = f11664U
            r0.put(r1)
            android.media.MediaCodec r5 = r15.f11694r
            int r6 = r15.f11672H
            int r8 = r1.length
            r7 = 0
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f11672H = r2
            r15.f11678N = r4
            return r4
        L_0x0068:
            boolean r0 = r15.f11682R
            if (r0 == 0) goto L_0x006f
            r0 = -4
            r5 = 0
            goto L_0x00a7
        L_0x006f:
            int r0 = r15.f11676L
            if (r0 != r4) goto L_0x0094
            r0 = 0
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f11693q
            java.util.List<byte[]> r5 = r5.f11635h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0092
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f11693q
            java.util.List<byte[]> r5 = r5.f11635h
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f11688l
            java.nio.ByteBuffer r6 = r6.f10528c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0092:
            r15.f11676L = r3
        L_0x0094:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            java.nio.ByteBuffer r0 = r0.f10528c
            int r0 = r0.position()
            com.fyber.inneractive.sdk.player.exoplayer2.j r5 = r15.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f11688l
            int r5 = r15.mo13956a((com.fyber.inneractive.sdk.player.exoplayer2.C3228j) r5, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b) r6, (boolean) r1)
            r14 = r5
            r5 = r0
            r0 = r14
        L_0x00a7:
            r6 = -3
            if (r0 != r6) goto L_0x00ab
            return r1
        L_0x00ab:
            r6 = -5
            if (r0 != r6) goto L_0x00c1
            int r0 = r15.f11676L
            if (r0 != r3) goto L_0x00b9
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            r0.mo14057a()
            r15.f11676L = r4
        L_0x00b9:
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r15.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f11654a
            r15.mo14001a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0)
            return r4
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            r6 = 4
            boolean r0 = r0.mo14058b(r6)
            if (r0 == 0) goto L_0x00fd
            int r0 = r15.f11676L
            if (r0 != r3) goto L_0x00d5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            r0.mo14057a()
            r15.f11676L = r4
        L_0x00d5:
            r15.f11680P = r4
            boolean r0 = r15.f11678N
            if (r0 != 0) goto L_0x00df
            r15.mo14341u()
            return r1
        L_0x00df:
            boolean r0 = r15.f11701y     // Catch:{ CryptoException -> 0x00f5 }
            if (r0 == 0) goto L_0x00e4
            goto L_0x00f4
        L_0x00e4:
            r15.f11679O = r4     // Catch:{ CryptoException -> 0x00f5 }
            android.media.MediaCodec r5 = r15.f11694r     // Catch:{ CryptoException -> 0x00f5 }
            int r6 = r15.f11672H     // Catch:{ CryptoException -> 0x00f5 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f5 }
            r15.f11672H = r2     // Catch:{ CryptoException -> 0x00f5 }
        L_0x00f4:
            return r1
        L_0x00f5:
            r0 = move-exception
            int r1 = r15.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r0, r1)
            throw r0
        L_0x00fd:
            boolean r0 = r15.f11683S
            if (r0 == 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            boolean r0 = r0.mo14058b(r4)
            if (r0 != 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            r0.mo14057a()
            int r0 = r15.f11676L
            if (r0 != r3) goto L_0x0114
            r15.f11676L = r4
        L_0x0114:
            return r4
        L_0x0115:
            r15.f11683S = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r0.mo14058b(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r3 = r15.f11695s
            if (r3 != 0) goto L_0x0124
            goto L_0x0134
        L_0x0124:
            int r3 = r3.mo14072a()
            if (r3 == 0) goto L_0x01fb
            if (r3 == r6) goto L_0x0134
            if (r0 != 0) goto L_0x0132
            boolean r3 = r15.f11687k
            if (r3 != 0) goto L_0x0134
        L_0x0132:
            r3 = 1
            goto L_0x0135
        L_0x0134:
            r3 = 0
        L_0x0135:
            r15.f11682R = r3
            if (r3 == 0) goto L_0x013a
            return r1
        L_0x013a:
            boolean r3 = r15.f11698v
            if (r3 == 0) goto L_0x018f
            if (r0 != 0) goto L_0x018f
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f11688l
            java.nio.ByteBuffer r3 = r3.f10528c
            byte[] r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3389i.f12100a
            int r6 = r3.position()
            r7 = 0
            r8 = 0
        L_0x014c:
            int r9 = r7 + 1
            if (r9 >= r6) goto L_0x017f
            byte r10 = r3.get(r7)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 3
            if (r8 != r11) goto L_0x0176
            if (r10 != r4) goto L_0x017a
            byte r12 = r3.get(r9)
            r12 = r12 & 31
            r13 = 7
            if (r12 != r13) goto L_0x017a
            java.nio.ByteBuffer r8 = r3.duplicate()
            int r7 = r7 - r11
            r8.position(r7)
            r8.limit(r6)
            r3.position(r1)
            r3.put(r8)
            goto L_0x0182
        L_0x0176:
            if (r10 != 0) goto L_0x017a
            int r8 = r8 + 1
        L_0x017a:
            if (r10 == 0) goto L_0x017d
            r8 = 0
        L_0x017d:
            r7 = r9
            goto L_0x014c
        L_0x017f:
            r3.clear()
        L_0x0182:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f11688l
            java.nio.ByteBuffer r3 = r3.f10528c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x018d
            return r4
        L_0x018d:
            r15.f11698v = r1
        L_0x018f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f11688l     // Catch:{ CryptoException -> 0x01f3 }
            long r10 = r3.f10529d     // Catch:{ CryptoException -> 0x01f3 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r3 = r3.mo14058b(r6)     // Catch:{ CryptoException -> 0x01f3 }
            if (r3 == 0) goto L_0x01a4
            java.util.List<java.lang.Long> r3 = r15.f11691o     // Catch:{ CryptoException -> 0x01f3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01f3 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01a4:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f11688l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r3 = r3.f10528c     // Catch:{ CryptoException -> 0x01f3 }
            r3.flip()     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f11688l     // Catch:{ CryptoException -> 0x01f3 }
            r15.mo14337a((com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b) r3)     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 == 0) goto L_0x01d4
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.a r0 = r0.f10527b     // Catch:{ CryptoException -> 0x01f3 }
            android.media.MediaCodec$CryptoInfo r9 = r0.f10522g     // Catch:{ CryptoException -> 0x01f3 }
            if (r5 != 0) goto L_0x01bb
            goto L_0x01ca
        L_0x01bb:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 != 0) goto L_0x01c3
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01f3 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01c3:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01f3 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01ca:
            android.media.MediaCodec r6 = r15.f11694r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f11672H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
            goto L_0x01e5
        L_0x01d4:
            android.media.MediaCodec r6 = r15.f11694r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f11672H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f11688l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r0 = r0.f10528c     // Catch:{ CryptoException -> 0x01f3 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01f3 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01e5:
            r15.f11672H = r2     // Catch:{ CryptoException -> 0x01f3 }
            r15.f11678N = r4     // Catch:{ CryptoException -> 0x01f3 }
            r15.f11676L = r1     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r15.f11684T     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r0.inputBufferCount     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r1 + r4
            r0.inputBufferCount = r1     // Catch:{ CryptoException -> 0x01f3 }
            return r4
        L_0x01f3:
            r0 = move-exception
            int r1 = r15.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r0, r1)
            throw r0
        L_0x01fb:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r15.f11695s
            r0.mo14075c()
            int r0 = r15.f10345c
            r1 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r1, r0)
            throw r0
        L_0x0208:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b.mo14339s():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0140  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14340t() throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r12 = this;
            boolean r0 = r12.mo14343x()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f11696t
            r12.f11695s = r0
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = r12.f11693q
            java.lang.String r1 = r1.f11633f
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003d
            int r0 = r0.mo14072a()
            if (r0 == 0) goto L_0x0031
            r4 = 3
            if (r0 == r4) goto L_0x0021
            r4 = 4
            if (r0 != r4) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f11695s
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r0 = r0.mo14074b()
            r0.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f11695s
            boolean r0 = r0.mo14073a(r1)
            goto L_0x003e
        L_0x0031:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f11695s
            r0.mo14075c()
            int r0 = r12.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r2, r0)
            throw r0
        L_0x003d:
            r0 = 0
        L_0x003e:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r1 = r12.f11685i     // Catch:{ b -> 0x01f1 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f11693q     // Catch:{ b -> 0x01f1 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r1 = r12.mo13998a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c) r1, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r4, (boolean) r0)     // Catch:{ b -> 0x01f1 }
            if (r1 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r1 = r12.f11685i     // Catch:{ b -> 0x01f1 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f11693q     // Catch:{ b -> 0x01f1 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r1 = r12.mo13998a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c) r1, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r4, (boolean) r3)     // Catch:{ b -> 0x01f1 }
        L_0x0052:
            if (r1 == 0) goto L_0x01e0
            java.lang.String r10 = r1.f11659a
            boolean r4 = r1.f11660b
            r12.f11697u = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f11693q
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r6 = 21
            r11 = 1
            if (r5 >= r6) goto L_0x0075
            java.util.List<byte[]> r4 = r4.f11635h
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0075
            r4 = 1
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            r12.f11698v = r4
            r4 = 19
            r7 = 18
            if (r5 < r7) goto L_0x00af
            if (r5 != r7) goto L_0x0090
            java.lang.String r8 = "OMX.SEC.avc.dec"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x00af
            java.lang.String r8 = "OMX.SEC.avc.dec.secure"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x00af
        L_0x0090:
            if (r5 != r4) goto L_0x00ad
            java.lang.String r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12151d
            java.lang.String r9 = "SM-G800"
            boolean r8 = r8.startsWith(r9)
            if (r8 == 0) goto L_0x00ad
            java.lang.String r8 = "OMX.Exynos.avc.dec"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x00af
            java.lang.String r8 = "OMX.Exynos.avc.dec.secure"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r8 = 0
            goto L_0x00b0
        L_0x00af:
            r8 = 1
        L_0x00b0:
            r12.f11699w = r8
            r8 = 24
            if (r5 >= r8) goto L_0x00eb
            java.lang.String r8 = "OMX.Nvidia.h264.decode"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x00c6
            java.lang.String r8 = "OMX.Nvidia.h264.decode.secure"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x00eb
        L_0x00c6:
            java.lang.String r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12149b
            java.lang.String r9 = "flounder"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x00e9
            java.lang.String r9 = "flounder_lte"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x00e9
            java.lang.String r9 = "grouper"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x00e9
            java.lang.String r9 = "tilapia"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00eb
        L_0x00e9:
            r8 = 1
            goto L_0x00ec
        L_0x00eb:
            r8 = 0
        L_0x00ec:
            r12.f11700x = r8
            r8 = 17
            if (r5 > r8) goto L_0x0104
            java.lang.String r8 = "OMX.rk.video_decoder.avc"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x0102
            java.lang.String r8 = "OMX.allwinner.video.decoder.avc"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0104
        L_0x0102:
            r8 = 1
            goto L_0x0105
        L_0x0104:
            r8 = 0
        L_0x0105:
            r12.f11701y = r8
            r8 = 23
            if (r5 > r8) goto L_0x0113
            java.lang.String r8 = "OMX.google.vorbis.decoder"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L_0x012f
        L_0x0113:
            if (r5 > r4) goto L_0x0131
            java.lang.String r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12149b
            java.lang.String r8 = "hb2000"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0131
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L_0x012f
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0131
        L_0x012f:
            r4 = 1
            goto L_0x0132
        L_0x0131:
            r4 = 0
        L_0x0132:
            r12.f11702z = r4
            if (r5 != r6) goto L_0x0140
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0140
            r4 = 1
            goto L_0x0141
        L_0x0140:
            r4 = 0
        L_0x0141:
            r12.f11665A = r4
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f11693q
            if (r5 > r7) goto L_0x0154
            int r4 = r4.f11645r
            if (r4 != r11) goto L_0x0154
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x0154
            r3 = 1
        L_0x0154:
            r12.f11666B = r3
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d1 }
            r5.<init>()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = "createCodec:"
            r5.append(r6)     // Catch:{ Exception -> 0x01d1 }
            r5.append(r10)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01d1 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r5)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r5 = android.media.MediaCodec.createByCodecName(r10)     // Catch:{ Exception -> 0x01d1 }
            r12.f11694r = r5     // Catch:{ Exception -> 0x01d1 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r5 = "configureCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r5)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r5 = r12.f11694r     // Catch:{ Exception -> 0x01d1 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r6 = r12.f11693q     // Catch:{ Exception -> 0x01d1 }
            r12.mo14002a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3232a) r1, (android.media.MediaCodec) r5, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r6, (android.media.MediaCrypto) r2)     // Catch:{ Exception -> 0x01d1 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "startCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r1)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r12.f11694r     // Catch:{ Exception -> 0x01d1 }
            r1.start()     // Catch:{ Exception -> 0x01d1 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()     // Catch:{ Exception -> 0x01d1 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01d1 }
            long r8 = r6 - r3
            r4 = r12
            r5 = r10
            r4.mo14003a((java.lang.String) r5, (long) r6, (long) r8)     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r12.f11694r     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getInputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r12.f11669E = r1     // Catch:{ Exception -> 0x01d1 }
            android.media.MediaCodec r1 = r12.f11694r     // Catch:{ Exception -> 0x01d1 }
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()     // Catch:{ Exception -> 0x01d1 }
            r12.f11670F = r1     // Catch:{ Exception -> 0x01d1 }
            int r0 = r12.f10346d
            r1 = 2
            if (r0 != r1) goto L_0x01bb
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01c0
        L_0x01bb:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01c0:
            r12.f11671G = r0
            r0 = -1
            r12.f11672H = r0
            r12.f11673I = r0
            r12.f11683S = r11
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f11684T
            int r1 = r0.decoderInitCount
            int r1 = r1 + r11
            r0.decoderInitCount = r1
            return
        L_0x01d1:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f11693q
            r2.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r3, (java.lang.Throwable) r1, (boolean) r0, (java.lang.String) r10)
            int r0 = r12.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r2, r0)
            throw r0
        L_0x01e0:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f11693q
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r1.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r3, (java.lang.Throwable) r2, (boolean) r0, (int) r4)
            int r0 = r12.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r1, r0)
            throw r0
        L_0x01f1:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f11693q
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r3, (java.lang.Throwable) r1, (boolean) r0, (int) r4)
            int r0 = r12.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b.mo14340t():void");
    }

    /* renamed from: u */
    public final void mo14341u() throws C3054d {
        if (this.f11677M == 2) {
            mo14342v();
            mo14340t();
            return;
        }
        this.f11681Q = true;
        mo14009w();
    }

    /* renamed from: v */
    public void mo14342v() {
        if (this.f11694r != null) {
            this.f11671G = -9223372036854775807L;
            this.f11672H = -1;
            this.f11673I = -1;
            this.f11682R = false;
            this.f11674J = false;
            this.f11691o.clear();
            this.f11669E = null;
            this.f11670F = null;
            this.f11675K = false;
            this.f11678N = false;
            this.f11697u = false;
            this.f11698v = false;
            this.f11699w = false;
            this.f11700x = false;
            this.f11701y = false;
            this.f11702z = false;
            this.f11666B = false;
            this.f11667C = false;
            this.f11668D = false;
            this.f11679O = false;
            this.f11676L = 0;
            this.f11677M = 0;
            this.f11684T.decoderReleaseCount++;
            this.f11688l.f10528c = null;
            try {
                this.f11694r.stop();
                try {
                    this.f11694r.release();
                    this.f11694r = null;
                    C3063b<C3066d> bVar = this.f11695s;
                    if (bVar != null && this.f11696t != bVar) {
                        try {
                            this.f11686j.mo14077a(bVar);
                        } finally {
                            this.f11695s = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f11694r = null;
                    C3063b<C3066d> bVar2 = this.f11695s;
                    if (!(bVar2 == null || this.f11696t == bVar2)) {
                        this.f11686j.mo14077a(bVar2);
                    }
                    throw th;
                } finally {
                    this.f11695s = null;
                }
            } catch (Throwable th2) {
                this.f11694r = null;
                C3063b<C3066d> bVar3 = this.f11695s;
                if (!(bVar3 == null || this.f11696t == bVar3)) {
                    try {
                        this.f11686j.mo14077a(bVar3);
                    } finally {
                        this.f11695s = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: w */
    public void mo14009w() throws C3054d {
    }

    /* renamed from: x */
    public boolean mo14343x() {
        return this.f11694r == null && this.f11693q != null;
    }

    /* renamed from: a */
    public void mo13959a(long j, boolean z) throws C3054d {
        this.f11680P = false;
        this.f11681Q = false;
        if (this.f11694r != null) {
            this.f11671G = -9223372036854775807L;
            this.f11672H = -1;
            this.f11673I = -1;
            this.f11683S = true;
            this.f11682R = false;
            this.f11674J = false;
            this.f11691o.clear();
            this.f11667C = false;
            this.f11668D = false;
            if (this.f11699w || (this.f11702z && this.f11679O)) {
                mo14342v();
                mo14340t();
            } else if (this.f11677M != 0) {
                mo14342v();
                mo14340t();
            } else {
                this.f11694r.flush();
                this.f11678N = false;
            }
            if (this.f11675K && this.f11693q != null) {
                this.f11676L = 1;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a */
    public static class C3234a extends Exception {
        public C3234a(C3226i iVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + iVar, th);
            String str = iVar.f11633f;
            m8212a(i);
        }

        /* renamed from: a */
        public static String m8212a(int i) {
            StringBuilder t = C0016g.m36t("com.google.android.exoplayer.MediaCodecTrackRenderer_", i < 0 ? "neg_" : "");
            t.append(Math.abs(i));
            return t.toString();
        }

        public C3234a(C3226i iVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + iVar, th);
            String str2 = iVar.f11633f;
            if (C3406u.f12148a >= 21) {
                m8213a(th);
            }
        }

        @TargetApi(21)
        /* renamed from: a */
        public static String m8213a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0187 A[LOOP:0: B:14:0x0047->B:84:0x0187, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a A[EDGE_INSN: B:95:0x018a->B:85:0x018a ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14336a(long r18, long r20) throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r17 = this;
            r12 = r17
            boolean r0 = r12.f11681Q
            if (r0 == 0) goto L_0x000a
            r17.mo14009w()
            return
        L_0x000a:
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r12.f11693q
            r1 = -4
            r2 = -5
            r13 = 4
            r14 = 1
            if (r0 != 0) goto L_0x003a
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f11689m
            r0.mo14057a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f11689m
            int r0 = r12.mo13956a((com.fyber.inneractive.sdk.player.exoplayer2.C3228j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b) r3, (boolean) r14)
            if (r0 != r2) goto L_0x0029
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f11654a
            r12.mo14001a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0)
            goto L_0x003a
        L_0x0029:
            if (r0 != r1) goto L_0x0039
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f11689m
            boolean r0 = r0.mo14058b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r0)
            r12.f11680P = r14
            r17.mo14341u()
        L_0x0039:
            return
        L_0x003a:
            r17.mo14340t()
            android.media.MediaCodec r0 = r12.f11694r
            r15 = 0
            if (r0 == 0) goto L_0x0195
            java.lang.String r0 = "drainAndFeed"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8583a(r0)
        L_0x0047:
            int r0 = r12.f11673I
            r11 = -1
            if (r0 >= 0) goto L_0x012b
            boolean r0 = r12.f11665A
            r1 = 0
            if (r0 == 0) goto L_0x006e
            boolean r0 = r12.f11679O
            if (r0 == 0) goto L_0x006e
            android.media.MediaCodec r0 = r12.f11694r     // Catch:{ IllegalStateException -> 0x0061 }
            android.media.MediaCodec$BufferInfo r3 = r12.f11692p     // Catch:{ IllegalStateException -> 0x0061 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x0061 }
            r12.f11673I = r0     // Catch:{ IllegalStateException -> 0x0061 }
            goto L_0x0078
        L_0x0061:
            r17.mo14341u()
            boolean r0 = r12.f11681Q
            if (r0 == 0) goto L_0x0184
            r17.mo14342v()
            goto L_0x0184
        L_0x006e:
            android.media.MediaCodec r0 = r12.f11694r
            android.media.MediaCodec$BufferInfo r3 = r12.f11692p
            int r0 = r0.dequeueOutputBuffer(r3, r1)
            r12.f11673I = r0
        L_0x0078:
            int r0 = r12.f11673I
            if (r0 < 0) goto L_0x00d9
            boolean r1 = r12.f11668D
            if (r1 == 0) goto L_0x008b
            r12.f11668D = r15
            android.media.MediaCodec r1 = r12.f11694r
            r1.releaseOutputBuffer(r0, r15)
            r12.f11673I = r11
            goto L_0x0185
        L_0x008b:
            android.media.MediaCodec$BufferInfo r1 = r12.f11692p
            int r2 = r1.flags
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0099
            r17.mo14341u()
            r12.f11673I = r11
            goto L_0x0184
        L_0x0099:
            java.nio.ByteBuffer[] r2 = r12.f11670F
            r0 = r2[r0]
            if (r0 == 0) goto L_0x00ae
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r12.f11692p
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00ae:
            android.media.MediaCodec$BufferInfo r0 = r12.f11692p
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r12.f11691o
            int r2 = r2.size()
            r3 = 0
        L_0x00b9:
            if (r3 >= r2) goto L_0x00d5
            java.util.List<java.lang.Long> r4 = r12.f11691o
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00d2
            java.util.List<java.lang.Long> r0 = r12.f11691o
            r0.remove(r3)
            r0 = 1
            goto L_0x00d6
        L_0x00d2:
            int r3 = r3 + 1
            goto L_0x00b9
        L_0x00d5:
            r0 = 0
        L_0x00d6:
            r12.f11674J = r0
            goto L_0x012b
        L_0x00d9:
            r1 = -2
            if (r0 != r1) goto L_0x010d
            android.media.MediaCodec r0 = r12.f11694r
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r12.f11700x
            if (r1 == 0) goto L_0x00fd
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x00fd
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x00fd
            r12.f11668D = r14
            goto L_0x0185
        L_0x00fd:
            boolean r1 = r12.f11666B
            if (r1 == 0) goto L_0x0106
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0106:
            android.media.MediaCodec r1 = r12.f11694r
            r12.mo14000a((android.media.MediaCodec) r1, (android.media.MediaFormat) r0)
            goto L_0x0185
        L_0x010d:
            r1 = -3
            if (r0 != r1) goto L_0x011a
            android.media.MediaCodec r0 = r12.f11694r
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r12.f11670F = r0
            goto L_0x0185
        L_0x011a:
            boolean r0 = r12.f11701y
            if (r0 == 0) goto L_0x0184
            boolean r0 = r12.f11680P
            if (r0 != 0) goto L_0x0127
            int r0 = r12.f11677M
            r1 = 2
            if (r0 != r1) goto L_0x0184
        L_0x0127:
            r17.mo14341u()
            goto L_0x0184
        L_0x012b:
            boolean r0 = r12.f11665A
            if (r0 == 0) goto L_0x015f
            boolean r0 = r12.f11679O
            if (r0 == 0) goto L_0x015f
            android.media.MediaCodec r5 = r12.f11694r     // Catch:{ IllegalStateException -> 0x0153 }
            java.nio.ByteBuffer[] r0 = r12.f11670F     // Catch:{ IllegalStateException -> 0x0153 }
            int r7 = r12.f11673I     // Catch:{ IllegalStateException -> 0x0153 }
            r6 = r0[r7]     // Catch:{ IllegalStateException -> 0x0153 }
            android.media.MediaCodec$BufferInfo r0 = r12.f11692p     // Catch:{ IllegalStateException -> 0x0153 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0153 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0153 }
            boolean r3 = r12.f11674J     // Catch:{ IllegalStateException -> 0x0153 }
            r0 = r17
            r1 = r18
            r16 = r3
            r3 = r20
            r14 = -1
            r11 = r16
            boolean r0 = r0.mo14004a(r1, r3, r5, r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0153 }
            goto L_0x017a
        L_0x0153:
            r17.mo14341u()
            boolean r0 = r12.f11681Q
            if (r0 == 0) goto L_0x0184
            r17.mo14342v()
            goto L_0x0184
        L_0x015f:
            r14 = -1
            android.media.MediaCodec r5 = r12.f11694r
            java.nio.ByteBuffer[] r0 = r12.f11670F
            int r7 = r12.f11673I
            r6 = r0[r7]
            android.media.MediaCodec$BufferInfo r0 = r12.f11692p
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r12.f11674J
            r0 = r17
            r1 = r18
            r3 = r20
            boolean r0 = r0.mo14004a(r1, r3, r5, r6, r7, r8, r9, r11)
        L_0x017a:
            if (r0 == 0) goto L_0x0184
            android.media.MediaCodec$BufferInfo r0 = r12.f11692p
            long r0 = r0.presentationTimeUs
            r12.f11673I = r14
            r14 = 1
            goto L_0x0185
        L_0x0184:
            r14 = 0
        L_0x0185:
            if (r14 == 0) goto L_0x018a
            r14 = 1
            goto L_0x0047
        L_0x018a:
            boolean r0 = r17.mo14339s()
            if (r0 == 0) goto L_0x0191
            goto L_0x018a
        L_0x0191:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3404s.m8582a()
            goto L_0x01c6
        L_0x0195:
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r0 = r12.f10347e
            long r3 = r12.f10348f
            long r3 = r18 - r3
            r0.mo14160a(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f11689m
            r0.mo14057a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f11689m
            int r0 = r12.mo13956a((com.fyber.inneractive.sdk.player.exoplayer2.C3228j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b) r3, (boolean) r15)
            if (r0 != r2) goto L_0x01b5
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f11690n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f11654a
            r12.mo14001a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0)
            goto L_0x01c6
        L_0x01b5:
            if (r0 != r1) goto L_0x01c6
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f11689m
            boolean r0 = r0.mo14058b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r0)
            r0 = 1
            r12.f11680P = r0
            r17.mo14341u()
        L_0x01c6:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f11684T
            r0.ensureUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b.mo14336a(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r5.f11638k == r0.f11638k) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14001a(com.fyber.inneractive.sdk.player.exoplayer2.C3226i r5) throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r4.f11693q
            r4.f11693q = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f11636i
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f11636i
        L_0x000d:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8596a((java.lang.Object) r5, (java.lang.Object) r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f11693q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f11636i
            if (r5 == 0) goto L_0x0045
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f11686j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f11693q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = r3.f11636i
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b r5 = r5.mo14076a(r1, r3)
            r4.f11696t = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f11695s
            if (r5 != r1) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f11686j
            r1.mo14077a(r5)
            goto L_0x0047
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r5 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r5, r0)
            throw r5
        L_0x0045:
            r4.f11696t = r1
        L_0x0047:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f11696t
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f11695s
            if (r5 != r1) goto L_0x0076
            android.media.MediaCodec r5 = r4.f11694r
            if (r5 == 0) goto L_0x0076
            boolean r1 = r4.f11697u
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f11693q
            boolean r5 = r4.mo14338a((android.media.MediaCodec) r5, (boolean) r1, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r3)
            if (r5 == 0) goto L_0x0076
            r4.f11675K = r2
            r4.f11676L = r2
            boolean r5 = r4.f11700x
            if (r5 == 0) goto L_0x0072
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f11693q
            int r1 = r5.f11637j
            int r3 = r0.f11637j
            if (r1 != r3) goto L_0x0072
            int r5 = r5.f11638k
            int r0 = r0.f11638k
            if (r5 != r0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            r4.f11667C = r2
            goto L_0x0083
        L_0x0076:
            boolean r5 = r4.f11678N
            if (r5 == 0) goto L_0x007d
            r4.f11677M = r2
            goto L_0x0083
        L_0x007d:
            r4.mo14342v()
            r4.mo14340t()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b.mo14001a(com.fyber.inneractive.sdk.player.exoplayer2.i):void");
    }
}
