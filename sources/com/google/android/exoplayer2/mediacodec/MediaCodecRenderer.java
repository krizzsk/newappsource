package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C3937b;
import com.google.android.exoplayer2.mediacodec.C3943e;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import p100gb.C4961b0;
import p125ia.C5329o;
import p137ja.C5410b;
import p137ja.C5413d;
import p137ja.C5414e;
import p161la.C5653b;
import p161la.C5654c;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6795o;
import p277ub.C6811x;
import p314xa.C7189g;
import p314xa.C7190h;
import p431cy.C16525b;
import p583jk.C17875h;

public abstract class MediaCodecRenderer extends C3873a {

    /* renamed from: U0 */
    public static final byte[] f13756U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    public Format f13757A;

    /* renamed from: A0 */
    public int f13758A0;

    /* renamed from: B */
    public Format f13759B;

    /* renamed from: B0 */
    public int f13760B0;

    /* renamed from: C */
    public DrmSession f13761C;

    /* renamed from: C0 */
    public int f13762C0;

    /* renamed from: D */
    public DrmSession f13763D;

    /* renamed from: D0 */
    public boolean f13764D0;

    /* renamed from: E */
    public MediaCrypto f13765E;

    /* renamed from: E0 */
    public boolean f13766E0;

    /* renamed from: F */
    public boolean f13767F;

    /* renamed from: F0 */
    public boolean f13768F0;

    /* renamed from: G */
    public long f13769G;

    /* renamed from: G0 */
    public long f13770G0;

    /* renamed from: H */
    public float f13771H;

    /* renamed from: H0 */
    public long f13772H0;

    /* renamed from: I */
    public float f13773I;

    /* renamed from: I0 */
    public boolean f13774I0;

    /* renamed from: J */
    public C3937b f13775J;

    /* renamed from: J0 */
    public boolean f13776J0;

    /* renamed from: K */
    public Format f13777K;

    /* renamed from: K0 */
    public boolean f13778K0;

    /* renamed from: L */
    public MediaFormat f13779L;

    /* renamed from: L0 */
    public boolean f13780L0;

    /* renamed from: M */
    public boolean f13781M;

    /* renamed from: M0 */
    public boolean f13782M0;

    /* renamed from: N */
    public float f13783N;

    /* renamed from: N0 */
    public boolean f13784N0;

    /* renamed from: O */
    public ArrayDeque<C3941c> f13785O;

    /* renamed from: O0 */
    public boolean f13786O0;

    /* renamed from: P */
    public DecoderInitializationException f13787P;

    /* renamed from: P0 */
    public ExoPlaybackException f13788P0;

    /* renamed from: Q */
    public C3941c f13789Q;

    /* renamed from: Q0 */
    public C5413d f13790Q0;

    /* renamed from: R */
    public int f13791R;

    /* renamed from: R0 */
    public long f13792R0;

    /* renamed from: S */
    public boolean f13793S;

    /* renamed from: S0 */
    public long f13794S0;

    /* renamed from: T */
    public boolean f13795T;

    /* renamed from: T0 */
    public int f13796T0;

    /* renamed from: U */
    public boolean f13797U;

    /* renamed from: X */
    public boolean f13798X;

    /* renamed from: Y */
    public boolean f13799Y;

    /* renamed from: Z */
    public boolean f13800Z;

    /* renamed from: l0 */
    public boolean f13801l0;

    /* renamed from: m */
    public final C3937b.C3939b f13802m;

    /* renamed from: m0 */
    public boolean f13803m0;

    /* renamed from: n */
    public final C3942d f13804n;

    /* renamed from: n0 */
    public boolean f13805n0;

    /* renamed from: o */
    public final boolean f13806o = false;

    /* renamed from: o0 */
    public boolean f13807o0;

    /* renamed from: p */
    public final float f13808p;

    /* renamed from: p0 */
    public C7190h f13809p0;

    /* renamed from: q */
    public final DecoderInputBuffer f13810q;

    /* renamed from: q0 */
    public long f13811q0;

    /* renamed from: r */
    public final DecoderInputBuffer f13812r;

    /* renamed from: r0 */
    public int f13813r0;

    /* renamed from: s */
    public final DecoderInputBuffer f13814s;

    /* renamed from: s0 */
    public int f13815s0;

    /* renamed from: t */
    public final C7189g f13816t;

    /* renamed from: t0 */
    public ByteBuffer f13817t0;

    /* renamed from: u */
    public final C6811x f13818u;

    /* renamed from: u0 */
    public boolean f13819u0;

    /* renamed from: v */
    public final ArrayList<Long> f13820v;

    /* renamed from: v0 */
    public boolean f13821v0;

    /* renamed from: w */
    public final MediaCodec.BufferInfo f13822w;

    /* renamed from: w0 */
    public boolean f13823w0;

    /* renamed from: x */
    public final long[] f13824x;

    /* renamed from: x0 */
    public boolean f13825x0;

    /* renamed from: y */
    public final long[] f13826y;

    /* renamed from: y0 */
    public boolean f13827y0;

    /* renamed from: z */
    public final long[] f13828z;

    /* renamed from: z0 */
    public boolean f13829z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i, float f) {
        super(i);
        C3943e.C3944a aVar = C3937b.C3939b.f13852a;
        C0017h hVar = C3942d.f13860b0;
        this.f13802m = aVar;
        this.f13804n = hVar;
        this.f13808p = f;
        this.f13810q = new DecoderInputBuffer(0);
        this.f13812r = new DecoderInputBuffer(0);
        this.f13814s = new DecoderInputBuffer(2);
        C7189g gVar = new C7189g();
        this.f13816t = gVar;
        this.f13818u = new C6811x();
        this.f13820v = new ArrayList<>();
        this.f13822w = new MediaCodec.BufferInfo();
        this.f13771H = 1.0f;
        this.f13773I = 1.0f;
        this.f13769G = -9223372036854775807L;
        this.f13824x = new long[10];
        this.f13826y = new long[10];
        this.f13828z = new long[10];
        this.f13792R0 = -9223372036854775807L;
        this.f13794S0 = -9223372036854775807L;
        gVar.mo15950j(0);
        gVar.f13647d.order(ByteOrder.nativeOrder());
        this.f13783N = -1.0f;
        this.f13791R = 0;
        this.f13758A0 = 0;
        this.f13813r0 = -1;
        this.f13815s0 = -1;
        this.f13811q0 = -9223372036854775807L;
        this.f13770G0 = -9223372036854775807L;
        this.f13772H0 = -9223372036854775807L;
        this.f13760B0 = 0;
        this.f13762C0 = 0;
    }

    /* renamed from: D */
    public final void mo15811D(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.f13794S0 == -9223372036854775807L) {
            if (this.f13792R0 != -9223372036854775807L) {
                z = false;
            }
            C17875h.m44304o(z);
            this.f13792R0 = j;
            this.f13794S0 = j2;
            return;
        }
        int i = this.f13796T0;
        long[] jArr = this.f13826y;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
        } else {
            this.f13796T0 = i + 1;
        }
        long[] jArr2 = this.f13824x;
        int i2 = this.f13796T0;
        int i3 = i2 - 1;
        jArr2[i3] = j;
        jArr[i3] = j2;
        this.f13828z[i2 - 1] = this.f13770G0;
    }

    /* renamed from: F */
    public final boolean mo16026F(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C17875h.m44304o(!this.f13776J0);
        C7189g gVar = this.f13816t;
        int i = gVar.f22313k;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!mo15935g0(j, j2, (C3937b) null, gVar.f13647d, this.f13815s0, 0, i, gVar.f13649f, gVar.mo21175g(), this.f13816t.mo21174d(4), this.f13759B)) {
                return false;
            }
            mo16041c0(this.f13816t.f22312j);
            this.f13816t.mo15948h();
        }
        if (this.f13774I0) {
            this.f13776J0 = true;
            return false;
        }
        if (this.f13825x0) {
            C17875h.m44304o(this.f13816t.mo23495l(this.f13814s));
            this.f13825x0 = false;
        }
        if (this.f13827y0) {
            if (this.f13816t.f22313k > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
            mo16028I();
            this.f13827y0 = false;
            mo16038V();
            if (!this.f13823w0) {
                return false;
            }
        }
        C17875h.m44304o(!this.f13774I0);
        C16525b bVar = this.f13463c;
        bVar.f43143a = null;
        bVar.f43144b = null;
        this.f13814s.mo15948h();
        while (true) {
            this.f13814s.mo15948h();
            int E = mo15812E(bVar, this.f13814s, 0);
            if (E != -5) {
                if (E == -4) {
                    if (!this.f13814s.mo21174d(4)) {
                        if (this.f13778K0) {
                            Format format = this.f13757A;
                            format.getClass();
                            this.f13759B = format;
                            mo15931b0(format, (MediaFormat) null);
                            this.f13778K0 = false;
                        }
                        this.f13814s.mo15951k();
                        if (!this.f13816t.mo23495l(this.f13814s)) {
                            this.f13825x0 = true;
                            break;
                        }
                    } else {
                        this.f13774I0 = true;
                        break;
                    }
                } else if (E != -3) {
                    throw new IllegalStateException();
                }
            } else {
                mo15929a0(bVar);
                break;
            }
        }
        C7189g gVar2 = this.f13816t;
        if (gVar2.f22313k > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            gVar2.mo15951k();
        }
        if (this.f13816t.f22313k > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f13774I0 || this.f13827y0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public abstract C5414e mo15921G(C3941c cVar, Format format, Format format2);

    /* renamed from: H */
    public MediaCodecDecoderException mo16027H(IllegalStateException illegalStateException, C3941c cVar) {
        return new MediaCodecDecoderException(illegalStateException, cVar);
    }

    /* renamed from: I */
    public final void mo16028I() {
        this.f13827y0 = false;
        this.f13816t.mo15948h();
        this.f13814s.mo15948h();
        this.f13825x0 = false;
        this.f13823w0 = false;
    }

    @TargetApi(23)
    /* renamed from: J */
    public final boolean mo16029J() throws ExoPlaybackException {
        if (this.f13764D0) {
            this.f13760B0 = 1;
            if (this.f13795T || this.f13798X) {
                this.f13762C0 = 3;
                return false;
            }
            this.f13762C0 = 2;
        } else {
            mo16051r0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x014e  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16030K(long r20, long r22) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            int r0 = r15.f13815s0
            r14 = 1
            r13 = 0
            if (r0 < 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x0110
            boolean r0 = r15.f13799Y
            if (r0 == 0) goto L_0x002a
            boolean r0 = r15.f13766E0
            if (r0 == 0) goto L_0x002a
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f13775J     // Catch:{ IllegalStateException -> 0x001e }
            android.media.MediaCodec$BufferInfo r1 = r15.f13822w     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.mo16070j(r1)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x0032
        L_0x001e:
            r19.mo16042f0()
            boolean r0 = r15.f13776J0
            if (r0 == 0) goto L_0x0029
            r19.mo16044i0()
        L_0x0029:
            return r13
        L_0x002a:
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f13775J
            android.media.MediaCodec$BufferInfo r1 = r15.f13822w
            int r0 = r0.mo16070j(r1)
        L_0x0032:
            if (r0 >= 0) goto L_0x0078
            r1 = -2
            if (r0 != r1) goto L_0x0067
            r15.f13768F0 = r14
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f13775J
            android.media.MediaFormat r0 = r0.mo16060a()
            int r1 = r15.f13791R
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0059
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0059
            r15.f13805n0 = r14
            goto L_0x0066
        L_0x0059:
            boolean r1 = r15.f13801l0
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0062:
            r15.f13779L = r0
            r15.f13781M = r14
        L_0x0066:
            return r14
        L_0x0067:
            boolean r0 = r15.f13807o0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r15.f13774I0
            if (r0 != 0) goto L_0x0074
            int r0 = r15.f13760B0
            r1 = 2
            if (r0 != r1) goto L_0x0077
        L_0x0074:
            r19.mo16042f0()
        L_0x0077:
            return r13
        L_0x0078:
            boolean r1 = r15.f13805n0
            if (r1 == 0) goto L_0x0084
            r15.f13805n0 = r13
            com.google.android.exoplayer2.mediacodec.b r1 = r15.f13775J
            r1.mo16072l(r0, r13)
            return r14
        L_0x0084:
            android.media.MediaCodec$BufferInfo r1 = r15.f13822w
            int r2 = r1.size
            if (r2 != 0) goto L_0x0094
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0094
            r19.mo16042f0()
            return r13
        L_0x0094:
            r15.f13815s0 = r0
            com.google.android.exoplayer2.mediacodec.b r1 = r15.f13775J
            java.nio.ByteBuffer r0 = r1.mo16073m(r0)
            r15.f13817t0 = r0
            if (r0 == 0) goto L_0x00b3
            android.media.MediaCodec$BufferInfo r1 = r15.f13822w
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f13817t0
            android.media.MediaCodec$BufferInfo r1 = r15.f13822w
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00b3:
            boolean r0 = r15.f13800Z
            if (r0 == 0) goto L_0x00d4
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00d4
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00d4
            long r1 = r15.f13770G0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d4
            r0.presentationTimeUs = r1
        L_0x00d4:
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r15.f13820v
            int r2 = r2.size()
            r3 = 0
        L_0x00df:
            if (r3 >= r2) goto L_0x00fb
            java.util.ArrayList<java.lang.Long> r4 = r15.f13820v
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00f8
            java.util.ArrayList<java.lang.Long> r0 = r15.f13820v
            r0.remove(r3)
            r0 = 1
            goto L_0x00fc
        L_0x00f8:
            int r3 = r3 + 1
            goto L_0x00df
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            r15.f13819u0 = r0
            long r0 = r15.f13772H0
            android.media.MediaCodec$BufferInfo r2 = r15.f13822w
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x010a
            r0 = 1
            goto L_0x010b
        L_0x010a:
            r0 = 0
        L_0x010b:
            r15.f13821v0 = r0
            r15.mo16052s0(r2)
        L_0x0110:
            boolean r0 = r15.f13799Y
            if (r0 == 0) goto L_0x0152
            boolean r0 = r15.f13766E0
            if (r0 == 0) goto L_0x0152
            com.google.android.exoplayer2.mediacodec.b r5 = r15.f13775J     // Catch:{ IllegalStateException -> 0x0144 }
            java.nio.ByteBuffer r6 = r15.f13817t0     // Catch:{ IllegalStateException -> 0x0144 }
            int r7 = r15.f13815s0     // Catch:{ IllegalStateException -> 0x0144 }
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w     // Catch:{ IllegalStateException -> 0x0144 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0144 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0144 }
            boolean r12 = r15.f13819u0     // Catch:{ IllegalStateException -> 0x0144 }
            boolean r3 = r15.f13821v0     // Catch:{ IllegalStateException -> 0x0144 }
            com.google.android.exoplayer2.Format r4 = r15.f13759B     // Catch:{ IllegalStateException -> 0x0144 }
            r0 = r19
            r1 = r20
            r16 = r3
            r17 = r4
            r3 = r22
            r18 = 0
            r13 = r16
            r16 = 1
            r14 = r17
            boolean r0 = r0.mo15935g0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0142 }
            goto L_0x0173
        L_0x0142:
            goto L_0x0147
        L_0x0144:
            r18 = 0
            goto L_0x0142
        L_0x0147:
            r19.mo16042f0()
            boolean r0 = r15.f13776J0
            if (r0 == 0) goto L_0x0151
            r19.mo16044i0()
        L_0x0151:
            return r18
        L_0x0152:
            r16 = 1
            r18 = 0
            com.google.android.exoplayer2.mediacodec.b r5 = r15.f13775J
            java.nio.ByteBuffer r6 = r15.f13817t0
            int r7 = r15.f13815s0
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f13819u0
            boolean r13 = r15.f13821v0
            com.google.android.exoplayer2.Format r14 = r15.f13759B
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo15935g0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0173:
            if (r0 == 0) goto L_0x0193
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w
            long r0 = r0.presentationTimeUs
            r15.mo16041c0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f13822w
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0186
            r14 = 1
            goto L_0x0187
        L_0x0186:
            r14 = 0
        L_0x0187:
            r0 = -1
            r15.f13815s0 = r0
            r0 = 0
            r15.f13817t0 = r0
            if (r14 != 0) goto L_0x0190
            return r16
        L_0x0190:
            r19.mo16042f0()
        L_0x0193:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo16030K(long, long):boolean");
    }

    /* renamed from: L */
    public final boolean mo16031L() throws ExoPlaybackException {
        long j;
        C3937b bVar = this.f13775J;
        if (bVar == null || this.f13760B0 == 2 || this.f13774I0) {
            return false;
        }
        if (this.f13813r0 < 0) {
            int i = bVar.mo16069i();
            this.f13813r0 = i;
            if (i < 0) {
                return false;
            }
            this.f13812r.f13647d = this.f13775J.mo16064e(i);
            this.f13812r.mo15948h();
        }
        if (this.f13760B0 == 1) {
            if (!this.f13807o0) {
                this.f13766E0 = true;
                this.f13775J.mo16071k(this.f13813r0, 0, 4, 0);
                this.f13813r0 = -1;
                this.f13812r.f13647d = null;
            }
            this.f13760B0 = 2;
            return false;
        } else if (this.f13803m0) {
            this.f13803m0 = false;
            this.f13812r.f13647d.put(f13756U0);
            this.f13775J.mo16071k(this.f13813r0, 38, 0, 0);
            this.f13813r0 = -1;
            this.f13812r.f13647d = null;
            this.f13764D0 = true;
            return true;
        } else {
            if (this.f13758A0 == 1) {
                for (int i2 = 0; i2 < this.f13777K.f13420o.size(); i2++) {
                    this.f13812r.f13647d.put(this.f13777K.f13420o.get(i2));
                }
                this.f13758A0 = 2;
            }
            int position = this.f13812r.f13647d.position();
            C16525b bVar2 = this.f13463c;
            bVar2.f43143a = null;
            bVar2.f43144b = null;
            try {
                int E = mo15812E(bVar2, this.f13812r, 0);
                if (mo15817h()) {
                    this.f13772H0 = this.f13770G0;
                }
                if (E == -3) {
                    return false;
                }
                if (E == -5) {
                    if (this.f13758A0 == 2) {
                        this.f13812r.mo15948h();
                        this.f13758A0 = 1;
                    }
                    mo15929a0(bVar2);
                    return true;
                } else if (this.f13812r.mo21174d(4)) {
                    if (this.f13758A0 == 2) {
                        this.f13812r.mo15948h();
                        this.f13758A0 = 1;
                    }
                    this.f13774I0 = true;
                    if (!this.f13764D0) {
                        mo16042f0();
                        return false;
                    }
                    try {
                        if (!this.f13807o0) {
                            this.f13766E0 = true;
                            this.f13775J.mo16071k(this.f13813r0, 0, 4, 0);
                            this.f13813r0 = -1;
                            this.f13812r.f13647d = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo15834w(e, this.f13757A, false);
                    }
                } else if (this.f13764D0 || this.f13812r.mo21174d(1)) {
                    boolean d = this.f13812r.mo21174d(1073741824);
                    if (d) {
                        C5410b bVar3 = this.f13812r.f13646c;
                        if (position == 0) {
                            bVar3.getClass();
                        } else {
                            if (bVar3.f17761d == null) {
                                int[] iArr = new int[1];
                                bVar3.f17761d = iArr;
                                bVar3.f17766i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = bVar3.f17761d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f13793S && !d) {
                        ByteBuffer byteBuffer = this.f13812r.f13647d;
                        byte[] bArr = C6795o.f21007a;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i4++;
                            }
                            if (b != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        if (this.f13812r.f13647d.position() == 0) {
                            return true;
                        }
                        this.f13793S = false;
                    }
                    DecoderInputBuffer decoderInputBuffer = this.f13812r;
                    long j2 = decoderInputBuffer.f13649f;
                    C7190h hVar = this.f13809p0;
                    if (hVar != null) {
                        Format format = this.f13757A;
                        if (!hVar.f22317c) {
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f13647d;
                            byteBuffer2.getClass();
                            byte b2 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                b2 = (b2 << 8) | (byteBuffer2.get(i6) & 255);
                            }
                            int b3 = C5329o.m13363b(b2);
                            if (b3 == -1) {
                                hVar.f22317c = true;
                                j = decoderInputBuffer.f13649f;
                            } else {
                                long j3 = hVar.f22315a;
                                if (j3 == 0) {
                                    j2 = decoderInputBuffer.f13649f;
                                    hVar.f22316b = j2;
                                    hVar.f22315a = ((long) b3) - 529;
                                } else {
                                    long j4 = (1000000 * j3) / ((long) format.f13400A);
                                    hVar.f22315a = j3 + ((long) b3);
                                    j = hVar.f22316b + j4;
                                }
                            }
                            j2 = j;
                        }
                    }
                    if (this.f13812r.mo21175g()) {
                        this.f13820v.add(Long.valueOf(j2));
                    }
                    if (this.f13778K0) {
                        this.f13818u.mo23024a(j2, this.f13757A);
                        this.f13778K0 = false;
                    }
                    if (this.f13809p0 != null) {
                        this.f13770G0 = Math.max(this.f13770G0, this.f13812r.f13649f);
                    } else {
                        this.f13770G0 = Math.max(this.f13770G0, j2);
                    }
                    this.f13812r.mo15951k();
                    if (this.f13812r.mo21174d(268435456)) {
                        mo16036T(this.f13812r);
                    }
                    mo15934e0(this.f13812r);
                    if (d) {
                        try {
                            this.f13775J.mo16061b(this.f13813r0, this.f13812r.f13646c, j2);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo15834w(e2, this.f13757A, false);
                        }
                    } else {
                        this.f13775J.mo16071k(this.f13813r0, this.f13812r.f13647d.limit(), 0, j2);
                    }
                    this.f13813r0 = -1;
                    this.f13812r.f13647d = null;
                    this.f13764D0 = true;
                    this.f13758A0 = 0;
                    this.f13790Q0.getClass();
                    return true;
                } else {
                    this.f13812r.mo15948h();
                    if (this.f13758A0 == 2) {
                        this.f13758A0 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
                mo15925X(e3);
                throw mo15834w(mo16027H(e3, this.f13789Q), this.f13757A, false);
            }
        }
    }

    /* renamed from: M */
    public final boolean mo16032M() {
        C3937b bVar = this.f13775J;
        if (bVar == null) {
            return false;
        }
        if (this.f13762C0 == 3 || this.f13795T || ((this.f13797U && !this.f13768F0) || (this.f13798X && this.f13766E0))) {
            mo16044i0();
            return true;
        }
        try {
            bVar.flush();
            return false;
        } finally {
            mo16045k0();
        }
    }

    /* renamed from: N */
    public final List<C3941c> mo16033N(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<C3941c> Q = mo15923Q(this.f13804n, this.f13757A, z);
        if (Q.isEmpty() && z) {
            Q = mo15923Q(this.f13804n, this.f13757A, false);
            if (!Q.isEmpty()) {
                String str = this.f13757A.f13418m;
                String valueOf = String.valueOf(Q);
                new StringBuilder(valueOf.length() + C0016g.m25h(str, 99));
            }
        }
        return Q;
    }

    /* renamed from: O */
    public boolean mo16034O() {
        return false;
    }

    /* renamed from: P */
    public abstract float mo15922P(float f, Format[] formatArr);

    /* renamed from: Q */
    public abstract List<C3941c> mo15923Q(C3942d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* renamed from: R */
    public final C5654c mo16035R(DrmSession drmSession) throws ExoPlaybackException {
        C5653b f = drmSession.mo15957f();
        if (f == null || (f instanceof C5654c)) {
            return (C5654c) f;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(valueOf);
        throw mo15834w(new IllegalArgumentException(sb.toString()), this.f13757A, false);
    }

    /* renamed from: S */
    public abstract C3937b.C3938a mo15924S(C3941c cVar, Format format, MediaCrypto mediaCrypto, float f);

    /* renamed from: T */
    public void mo16036T(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0161, code lost:
        if ("stvm8".equals(r4) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0171, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r3) == false) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0184  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16037U(com.google.android.exoplayer2.mediacodec.C3941c r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            java.lang.String r3 = r0.f13853a
            int r1 = p277ub.C6774a0.f20959a
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 23
            if (r1 >= r4) goto L_0x0011
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001c
        L_0x0011:
            float r5 = r6.f13773I
            com.google.android.exoplayer2.Format[] r7 = r6.f13468h
            r7.getClass()
            float r5 = r6.mo15922P(r5, r7)
        L_0x001c:
            float r7 = r6.f13808p
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r5
        L_0x0024:
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r5 = "createCodec:"
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r10 = r9.length()
            if (r10 == 0) goto L_0x0039
            java.lang.String r5 = r5.concat(r9)
            goto L_0x003f
        L_0x0039:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r5)
            r5 = r9
        L_0x003f:
            p583jk.C17884p.m44368g(r5)
            com.google.android.exoplayer2.Format r5 = r6.f13757A
            r9 = r18
            com.google.android.exoplayer2.mediacodec.b$a r5 = r6.mo15924S(r0, r5, r9, r2)
            boolean r9 = r6.f13782M0
            if (r9 == 0) goto L_0x0060
            if (r1 < r4) goto L_0x0060
            com.google.android.exoplayer2.mediacodec.a$a r9 = new com.google.android.exoplayer2.mediacodec.a$a
            int r10 = r6.f13462b
            boolean r11 = r6.f13784N0
            boolean r12 = r6.f13786O0
            r9.<init>(r10, r11, r12)
            com.google.android.exoplayer2.mediacodec.a r5 = r9.mo16076a(r5)
            goto L_0x0066
        L_0x0060:
            com.google.android.exoplayer2.mediacodec.b$b r9 = r6.f13802m
            com.google.android.exoplayer2.mediacodec.b r5 = r9.mo16076a(r5)
        L_0x0066:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r6.f13775J = r5
            r6.f13789Q = r0
            r6.f13783N = r2
            com.google.android.exoplayer2.Format r2 = r6.f13757A
            r6.f13777K = r2
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 1
            if (r1 > r11) goto L_0x00a5
            boolean r14 = r2.equals(r3)
            if (r14 == 0) goto L_0x00a5
            java.lang.String r14 = p277ub.C6774a0.f20962d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x00a5
        L_0x00a3:
            r14 = 2
            goto L_0x00df
        L_0x00a5:
            r14 = 24
            if (r1 >= r14) goto L_0x00de
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L_0x00b9
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x00de
        L_0x00b9:
            java.lang.String r14 = p277ub.C6774a0.f20960b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00dc
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00dc
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00dc
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x00de
        L_0x00dc:
            r14 = 1
            goto L_0x00df
        L_0x00de:
            r14 = 0
        L_0x00df:
            r6.f13791R = r14
            com.google.android.exoplayer2.Format r14 = r6.f13777K
            r15 = 21
            if (r1 >= r15) goto L_0x00f9
            java.util.List<byte[]> r14 = r14.f13420o
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00f9
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x00f9
            r14 = 1
            goto L_0x00fa
        L_0x00f9:
            r14 = 0
        L_0x00fa:
            r6.f13793S = r14
            r14 = 19
            r12 = 18
            if (r1 < r12) goto L_0x0131
            if (r1 != r12) goto L_0x0114
            java.lang.String r5 = "OMX.SEC.avc.dec"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0131
            java.lang.String r5 = "OMX.SEC.avc.dec.secure"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0131
        L_0x0114:
            if (r1 != r14) goto L_0x012f
            java.lang.String r5 = p277ub.C6774a0.f20962d
            java.lang.String r11 = "SM-G800"
            boolean r5 = r5.startsWith(r11)
            if (r5 == 0) goto L_0x012f
            java.lang.String r5 = "OMX.Exynos.avc.dec"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0131
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r2 = 0
            goto L_0x0132
        L_0x0131:
            r2 = 1
        L_0x0132:
            r6.f13795T = r2
            r2 = 29
            if (r1 != r2) goto L_0x0142
            java.lang.String r5 = "c2.android.aac.decoder"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0142
            r5 = 1
            goto L_0x0143
        L_0x0142:
            r5 = 0
        L_0x0143:
            r6.f13797U = r5
            if (r1 > r4) goto L_0x014f
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0173
        L_0x014f:
            if (r1 > r14) goto L_0x0175
            java.lang.String r4 = p277ub.C6774a0.f20960b
            java.lang.String r5 = "hb2000"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0163
            java.lang.String r5 = "stvm8"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0175
        L_0x0163:
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0173
            java.lang.String r4 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0175
        L_0x0173:
            r4 = 1
            goto L_0x0176
        L_0x0175:
            r4 = 0
        L_0x0176:
            r6.f13798X = r4
            if (r1 != r15) goto L_0x0184
            java.lang.String r4 = "OMX.google.aac.decoder"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0184
            r4 = 1
            goto L_0x0185
        L_0x0184:
            r4 = 0
        L_0x0185:
            r6.f13799Y = r4
            if (r1 >= r15) goto L_0x01cf
            java.lang.String r4 = "OMX.SEC.mp3.dec"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x01cf
            java.lang.String r4 = p277ub.C6774a0.f20961c
            java.lang.String r5 = "samsung"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cf
            java.lang.String r4 = p277ub.C6774a0.f20960b
            java.lang.String r5 = "baffin"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x01cd
            java.lang.String r5 = "grand"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x01cd
            java.lang.String r5 = "fortuna"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x01cd
            java.lang.String r5 = "gprimelte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x01cd
            java.lang.String r5 = "j2y18lte"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x01cd
            java.lang.String r5 = "ms01"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L_0x01cf
        L_0x01cd:
            r4 = 1
            goto L_0x01d0
        L_0x01cf:
            r4 = 0
        L_0x01d0:
            r6.f13800Z = r4
            com.google.android.exoplayer2.Format r4 = r6.f13777K
            if (r1 > r12) goto L_0x01e4
            int r4 = r4.f13431z
            if (r4 != r13) goto L_0x01e4
            java.lang.String r4 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x01e4
            r4 = 1
            goto L_0x01e5
        L_0x01e4:
            r4 = 0
        L_0x01e5:
            r6.f13801l0 = r4
            java.lang.String r4 = r0.f13853a
            r5 = 25
            if (r1 > r5) goto L_0x01f5
            java.lang.String r5 = "OMX.rk.video_decoder.avc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x022b
        L_0x01f5:
            r5 = 17
            if (r1 > r5) goto L_0x0201
            java.lang.String r5 = "OMX.allwinner.video.decoder.avc"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x022b
        L_0x0201:
            if (r1 > r2) goto L_0x0213
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x022b
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x022b
        L_0x0213:
            java.lang.String r1 = p277ub.C6774a0.f20961c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x022d
            java.lang.String r1 = p277ub.C6774a0.f20962d
            java.lang.String r2 = "AFTS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x022d
            boolean r1 = r0.f13858f
            if (r1 == 0) goto L_0x022d
        L_0x022b:
            r1 = 1
            goto L_0x022e
        L_0x022d:
            r1 = 0
        L_0x022e:
            if (r1 != 0) goto L_0x0239
            boolean r1 = r16.mo16034O()
            if (r1 == 0) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r12 = 0
            goto L_0x023a
        L_0x0239:
            r12 = 1
        L_0x023a:
            r6.f13807o0 = r12
            java.lang.String r0 = r0.f13853a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            xa.h r0 = new xa.h
            r0.<init>()
            r6.f13809p0 = r0
        L_0x024d:
            int r0 = r6.f13466f
            r1 = 2
            if (r0 != r1) goto L_0x025b
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r4
            r6.f13811q0 = r0
        L_0x025b:
            ja.d r0 = r6.f13790Q0
            r0.getClass()
            long r4 = r9 - r7
            r0 = r16
            r1 = r9
            r0.mo15926Y(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo16037U(com.google.android.exoplayer2.mediacodec.c, android.media.MediaCrypto):void");
    }

    /* renamed from: V */
    public final void mo16038V() throws ExoPlaybackException {
        Format format;
        boolean z;
        if (this.f13775J == null && !this.f13823w0 && (format = this.f13757A) != null) {
            if (this.f13763D != null || !mo15940o0(format)) {
                mo16047m0(this.f13763D);
                String str = this.f13757A.f13418m;
                DrmSession drmSession = this.f13761C;
                if (drmSession != null) {
                    if (this.f13765E == null) {
                        C5654c R = mo16035R(drmSession);
                        if (R != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(R.f18412a, R.f18413b);
                                this.f13765E = mediaCrypto;
                                if (R.f18414c || !mediaCrypto.requiresSecureDecoderComponent(str)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                this.f13767F = z;
                            } catch (MediaCryptoException e) {
                                throw mo15834w(e, this.f13757A, false);
                            }
                        } else if (this.f13761C.mo15952a() == null) {
                            return;
                        }
                    }
                    if (C5654c.f18411d) {
                        int state = this.f13761C.getState();
                        if (state == 1) {
                            throw mo15834w(this.f13761C.mo15952a(), this.f13757A, false);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    mo16039W(this.f13765E, this.f13767F);
                } catch (DecoderInitializationException e2) {
                    throw mo15834w(e2, this.f13757A, false);
                }
            } else {
                Format format2 = this.f13757A;
                mo16028I();
                String str2 = format2.f13418m;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    C7189g gVar = this.f13816t;
                    gVar.getClass();
                    gVar.f22314l = 32;
                } else {
                    C7189g gVar2 = this.f13816t;
                    gVar2.getClass();
                    gVar2.f22314l = 1;
                }
                this.f13823w0 = true;
            }
        }
    }

    /* renamed from: W */
    public final void mo16039W(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        String str;
        boolean z2 = z;
        if (this.f13785O == null) {
            try {
                List<C3941c> N = mo16033N(z2);
                ArrayDeque<C3941c> arrayDeque = new ArrayDeque<>();
                this.f13785O = arrayDeque;
                if (this.f13806o) {
                    arrayDeque.addAll(N);
                } else if (!N.isEmpty()) {
                    this.f13785O.add(N.get(0));
                }
                this.f13787P = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f13757A, e, z2, -49998);
            }
        }
        if (!this.f13785O.isEmpty()) {
            while (this.f13775J == null) {
                C3941c peekFirst = this.f13785O.peekFirst();
                if (mo16048n0(peekFirst)) {
                    try {
                        mo16037U(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        Exception exc = e2;
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                        sb.append("Failed to initialize decoder: ");
                        sb.append(valueOf);
                        C6776b0.m15968a(sb.toString(), exc);
                        this.f13785O.removeFirst();
                        Format format = this.f13757A;
                        String str2 = peekFirst.f13853a;
                        String valueOf2 = String.valueOf(format);
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + C0016g.m25h(str2, 23));
                        sb2.append("Decoder init failed: ");
                        sb2.append(str2);
                        sb2.append(", ");
                        sb2.append(valueOf2);
                        String sb3 = sb2.toString();
                        String str3 = format.f13418m;
                        if (C6774a0.f20959a < 21 || !(exc instanceof MediaCodec.CodecException)) {
                            str = null;
                        } else {
                            str = ((MediaCodec.CodecException) exc).getDiagnosticInfo();
                        }
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(sb3, exc, str3, z, peekFirst, str, (DecoderInitializationException) null);
                        DecoderInitializationException decoderInitializationException2 = this.f13787P;
                        if (decoderInitializationException2 == null) {
                            this.f13787P = decoderInitializationException;
                        } else {
                            this.f13787P = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.mimeType, decoderInitializationException2.secureDecoderRequired, decoderInitializationException2.codecInfo, decoderInitializationException2.diagnosticInfo, decoderInitializationException);
                        }
                        if (this.f13785O.isEmpty()) {
                            throw this.f13787P;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f13785O = null;
            return;
        }
        throw new DecoderInitializationException(this.f13757A, (MediaCodecUtil.DecoderQueryException) null, z2, -49999);
    }

    /* renamed from: X */
    public abstract void mo15925X(IllegalStateException illegalStateException);

    /* renamed from: Y */
    public abstract void mo15926Y(long j, String str, long j2);

    /* renamed from: Z */
    public abstract void mo15927Z(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0146, code lost:
        if (r0 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0148, code lost:
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0090, code lost:
        if (r12 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e8, code lost:
        if (mo16029J() == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x011a, code lost:
        if (mo16029J() == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x012e, code lost:
        if (mo16029J() == false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0171 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* renamed from: a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p137ja.C5414e mo15929a0(p431cy.C16525b r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.f13778K0 = r0
            java.lang.Object r1 = r12.f43144b
            r5 = r1
            com.google.android.exoplayer2.Format r5 = (com.google.android.exoplayer2.Format) r5
            r5.getClass()
            java.lang.String r1 = r5.f13418m
            r2 = 0
            if (r1 == 0) goto L_0x0172
            java.lang.Object r12 = r12.f43143a
            com.google.android.exoplayer2.drm.DrmSession r12 = (com.google.android.exoplayer2.drm.DrmSession) r12
            com.google.android.exoplayer2.drm.DrmSession r1 = r11.f13763D
            r3 = 0
            if (r1 != r12) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            if (r12 == 0) goto L_0x001f
            r12.mo15953b(r3)
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            r1.mo15954c(r3)
        L_0x0024:
            r11.f13763D = r12
            r11.f13757A = r5
            boolean r1 = r11.f13823w0
            if (r1 == 0) goto L_0x002f
            r11.f13827y0 = r0
            return r3
        L_0x002f:
            com.google.android.exoplayer2.mediacodec.b r1 = r11.f13775J
            if (r1 != 0) goto L_0x0039
            r11.f13785O = r3
            r11.mo16038V()
            return r3
        L_0x0039:
            com.google.android.exoplayer2.mediacodec.c r3 = r11.f13789Q
            com.google.android.exoplayer2.Format r4 = r11.f13777K
            com.google.android.exoplayer2.drm.DrmSession r6 = r11.f13761C
            r7 = 23
            if (r6 != r12) goto L_0x0044
            goto L_0x0093
        L_0x0044:
            if (r12 == 0) goto L_0x0095
            if (r6 != 0) goto L_0x0049
            goto L_0x0095
        L_0x0049:
            int r8 = p277ub.C6774a0.f20959a
            if (r8 >= r7) goto L_0x004e
            goto L_0x0095
        L_0x004e:
            java.util.UUID r8 = p099ga.C4883f.f16445e
            java.util.UUID r6 = r6.mo15955d()
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x0095
            java.util.UUID r6 = r12.mo15955d()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0065
            goto L_0x0095
        L_0x0065:
            la.c r12 = r11.mo16035R(r12)
            if (r12 != 0) goto L_0x006c
            goto L_0x0095
        L_0x006c:
            boolean r6 = r3.f13858f
            if (r6 != 0) goto L_0x0093
            boolean r6 = r12.f18414c
            if (r6 == 0) goto L_0x0076
            r12 = 0
            goto L_0x0090
        L_0x0076:
            android.media.MediaCrypto r6 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x008e }
            java.util.UUID r8 = r12.f18412a     // Catch:{ MediaCryptoException -> 0x008e }
            byte[] r12 = r12.f18413b     // Catch:{ MediaCryptoException -> 0x008e }
            r6.<init>(r8, r12)     // Catch:{ MediaCryptoException -> 0x008e }
            java.lang.String r12 = r5.f13418m     // Catch:{ all -> 0x0089 }
            boolean r12 = r6.requiresSecureDecoderComponent(r12)     // Catch:{ all -> 0x0089 }
            r6.release()
            goto L_0x0090
        L_0x0089:
            r12 = move-exception
            r6.release()
            throw r12
        L_0x008e:
            r12 = 1
        L_0x0090:
            if (r12 == 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r12 = 0
            goto L_0x0096
        L_0x0095:
            r12 = 1
        L_0x0096:
            r6 = 3
            if (r12 == 0) goto L_0x00b4
            boolean r12 = r11.f13764D0
            if (r12 == 0) goto L_0x00a2
            r11.f13760B0 = r0
            r11.f13762C0 = r6
            goto L_0x00a8
        L_0x00a2:
            r11.mo16044i0()
            r11.mo16038V()
        L_0x00a8:
            ja.e r12 = new ja.e
            java.lang.String r3 = r3.f13853a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00b4:
            com.google.android.exoplayer2.drm.DrmSession r12 = r11.f13763D
            com.google.android.exoplayer2.drm.DrmSession r8 = r11.f13761C
            if (r12 == r8) goto L_0x00bc
            r12 = 1
            goto L_0x00bd
        L_0x00bc:
            r12 = 0
        L_0x00bd:
            if (r12 == 0) goto L_0x00c6
            int r8 = p277ub.C6774a0.f20959a
            if (r8 < r7) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r7 = 0
            goto L_0x00c7
        L_0x00c6:
            r7 = 1
        L_0x00c7:
            p583jk.C17875h.m44304o(r7)
            ja.e r7 = r11.mo15921G(r3, r4, r5)
            int r8 = r7.f17775d
            r9 = 2
            if (r8 == 0) goto L_0x014a
            if (r8 == r0) goto L_0x011d
            if (r8 == r9) goto L_0x00f1
            if (r8 != r6) goto L_0x00eb
            boolean r0 = r11.mo16050q0(r5)
            if (r0 != 0) goto L_0x00e0
            goto L_0x0123
        L_0x00e0:
            r11.f13777K = r5
            if (r12 == 0) goto L_0x0159
            boolean r12 = r11.mo16029J()
            if (r12 != 0) goto L_0x0159
            goto L_0x0148
        L_0x00eb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00f1:
            boolean r8 = r11.mo16050q0(r5)
            if (r8 != 0) goto L_0x00f8
            goto L_0x0123
        L_0x00f8:
            r11.f13829z0 = r0
            r11.f13758A0 = r0
            int r8 = r11.f13791R
            if (r8 == r9) goto L_0x0110
            if (r8 != r0) goto L_0x010f
            int r8 = r5.f13423r
            int r10 = r4.f13423r
            if (r8 != r10) goto L_0x010f
            int r8 = r5.f13424s
            int r10 = r4.f13424s
            if (r8 != r10) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            r11.f13803m0 = r0
            r11.f13777K = r5
            if (r12 == 0) goto L_0x0159
            boolean r12 = r11.mo16029J()
            if (r12 != 0) goto L_0x0159
            goto L_0x0148
        L_0x011d:
            boolean r8 = r11.mo16050q0(r5)
            if (r8 != 0) goto L_0x0126
        L_0x0123:
            r12 = 16
            goto L_0x015a
        L_0x0126:
            r11.f13777K = r5
            if (r12 == 0) goto L_0x0131
            boolean r12 = r11.mo16029J()
            if (r12 != 0) goto L_0x0159
            goto L_0x0148
        L_0x0131:
            boolean r12 = r11.f13764D0
            if (r12 == 0) goto L_0x0146
            r11.f13760B0 = r0
            boolean r12 = r11.f13795T
            if (r12 != 0) goto L_0x0143
            boolean r12 = r11.f13798X
            if (r12 == 0) goto L_0x0140
            goto L_0x0143
        L_0x0140:
            r11.f13762C0 = r0
            goto L_0x0146
        L_0x0143:
            r11.f13762C0 = r6
            r0 = 0
        L_0x0146:
            if (r0 != 0) goto L_0x0159
        L_0x0148:
            r12 = 2
            goto L_0x015a
        L_0x014a:
            boolean r12 = r11.f13764D0
            if (r12 == 0) goto L_0x0153
            r11.f13760B0 = r0
            r11.f13762C0 = r6
            goto L_0x0159
        L_0x0153:
            r11.mo16044i0()
            r11.mo16038V()
        L_0x0159:
            r12 = 0
        L_0x015a:
            int r0 = r7.f17775d
            if (r0 == 0) goto L_0x0171
            com.google.android.exoplayer2.mediacodec.b r0 = r11.f13775J
            if (r0 != r1) goto L_0x0166
            int r0 = r11.f13762C0
            if (r0 != r6) goto L_0x0171
        L_0x0166:
            ja.e r0 = new ja.e
            java.lang.String r3 = r3.f13853a
            r6 = 0
            r2 = r0
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0171:
            return r7
        L_0x0172:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.mo15834w(r12, r5, r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo15929a0(cy.b):ja.e");
    }

    /* renamed from: b0 */
    public abstract void mo15931b0(Format format, MediaFormat mediaFormat) throws ExoPlaybackException;

    /* renamed from: c */
    public final int mo16040c(Format format) throws ExoPlaybackException {
        try {
            return mo15941p0(this.f13804n, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw mo15834w(e, format, false);
        }
    }

    /* renamed from: c0 */
    public void mo16041c0(long j) {
        while (true) {
            int i = this.f13796T0;
            if (i != 0 && j >= this.f13828z[0]) {
                long[] jArr = this.f13824x;
                this.f13792R0 = jArr[0];
                this.f13794S0 = this.f13826y[0];
                int i2 = i - 1;
                this.f13796T0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f13826y;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f13796T0);
                long[] jArr3 = this.f13828z;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f13796T0);
                mo15933d0();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean mo15932d() {
        return this.f13776J0;
    }

    /* renamed from: d0 */
    public abstract void mo15933d0();

    /* renamed from: e0 */
    public abstract void mo15934e0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* JADX INFO: finally extract failed */
    @TargetApi(23)
    /* renamed from: f0 */
    public final void mo16042f0() throws ExoPlaybackException {
        int i = this.f13762C0;
        if (i == 1) {
            try {
                this.f13775J.flush();
            } finally {
                mo16045k0();
            }
        } else if (i == 2) {
            try {
                this.f13775J.flush();
                mo16045k0();
                mo16051r0();
            } catch (Throwable th) {
                mo16045k0();
                throw th;
            }
        } else if (i != 3) {
            this.f13776J0 = true;
            mo15938j0();
        } else {
            mo16044i0();
            mo16038V();
        }
    }

    /* renamed from: g0 */
    public abstract boolean mo15935g0(long j, long j2, C3937b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* renamed from: h0 */
    public final boolean mo16043h0(int i) throws ExoPlaybackException {
        C16525b bVar = this.f13463c;
        bVar.f43143a = null;
        bVar.f43144b = null;
        this.f13810q.mo15948h();
        int E = mo15812E(bVar, this.f13810q, i | 4);
        if (E == -5) {
            mo15929a0(bVar);
            return true;
        } else if (E != -4 || !this.f13810q.mo21174d(4)) {
            return false;
        } else {
            this.f13774I0 = true;
            mo16042f0();
            return false;
        }
    }

    /* renamed from: i0 */
    public final void mo16044i0() {
        try {
            C3937b bVar = this.f13775J;
            if (bVar != null) {
                bVar.release();
                this.f13790Q0.getClass();
                mo15927Z(this.f13789Q.f13853a);
            }
            this.f13775J = null;
            try {
                MediaCrypto mediaCrypto = this.f13765E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f13765E = null;
                mo16047m0((DrmSession) null);
                mo16046l0();
            }
        } catch (Throwable th) {
            this.f13775J = null;
            MediaCrypto mediaCrypto2 = this.f13765E;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f13765E = null;
            mo16047m0((DrmSession) null);
            mo16046l0();
        }
    }

    public boolean isReady() {
        boolean z;
        boolean z2;
        if (this.f13757A != null) {
            if (mo15817h()) {
                z = this.f13471k;
            } else {
                C4961b0 b0Var = this.f13467g;
                b0Var.getClass();
                z = b0Var.isReady();
            }
            if (z) {
                return true;
            }
            if (this.f13815s0 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            if (this.f13811q0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f13811q0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public void mo15938j0() throws ExoPlaybackException {
    }

    /* renamed from: k0 */
    public void mo16045k0() {
        this.f13813r0 = -1;
        this.f13812r.f13647d = null;
        this.f13815s0 = -1;
        this.f13817t0 = null;
        this.f13811q0 = -9223372036854775807L;
        this.f13766E0 = false;
        this.f13764D0 = false;
        this.f13803m0 = false;
        this.f13805n0 = false;
        this.f13819u0 = false;
        this.f13821v0 = false;
        this.f13820v.clear();
        this.f13770G0 = -9223372036854775807L;
        this.f13772H0 = -9223372036854775807L;
        C7190h hVar = this.f13809p0;
        if (hVar != null) {
            hVar.f22315a = 0;
            hVar.f22316b = 0;
            hVar.f22317c = false;
        }
        this.f13760B0 = 0;
        this.f13762C0 = 0;
        this.f13758A0 = this.f13829z0 ? 1 : 0;
    }

    /* renamed from: l0 */
    public final void mo16046l0() {
        mo16045k0();
        this.f13788P0 = null;
        this.f13809p0 = null;
        this.f13785O = null;
        this.f13789Q = null;
        this.f13777K = null;
        this.f13779L = null;
        this.f13781M = false;
        this.f13768F0 = false;
        this.f13783N = -1.0f;
        this.f13791R = 0;
        this.f13793S = false;
        this.f13795T = false;
        this.f13797U = false;
        this.f13798X = false;
        this.f13799Y = false;
        this.f13800Z = false;
        this.f13801l0 = false;
        this.f13807o0 = false;
        this.f13829z0 = false;
        this.f13758A0 = 0;
        this.f13767F = false;
    }

    /* renamed from: m0 */
    public final void mo16047m0(DrmSession drmSession) {
        DrmSession drmSession2 = this.f13761C;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.mo15953b((C3912b.C3913a) null);
            }
            if (drmSession2 != null) {
                drmSession2.mo15954c((C3912b.C3913a) null);
            }
        }
        this.f13761C = drmSession;
    }

    /* renamed from: n0 */
    public boolean mo16048n0(C3941c cVar) {
        return true;
    }

    /* renamed from: o */
    public void mo15823o(float f, float f2) throws ExoPlaybackException {
        this.f13771H = f;
        this.f13773I = f2;
        mo16050q0(this.f13777K);
    }

    /* renamed from: o0 */
    public boolean mo15940o0(Format format) {
        return false;
    }

    /* renamed from: p */
    public final int mo15824p() {
        return 8;
    }

    /* renamed from: p0 */
    public abstract int mo15941p0(C3942d dVar, Format format) throws MediaCodecUtil.DecoderQueryException;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069 A[Catch:{ IllegalStateException -> 0x00a4 }, LOOP:1: B:26:0x0047->B:36:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087 A[Catch:{ IllegalStateException -> 0x00a4 }, LOOP:2: B:37:0x006a->B:47:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x006a A[EDGE_INSN: B:83:0x006a->B:86:0x006a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0088 A[EDGE_INSN: B:84:0x0088->B:48:0x0088 ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16049q(long r12, long r14) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            boolean r0 = r11.f13780L0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.f13780L0 = r1
            r11.mo16042f0()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.f13788P0
            if (r0 != 0) goto L_0x00f2
            r0 = 1
            boolean r2 = r11.f13776J0     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 == 0) goto L_0x0017
            r11.mo15938j0()     // Catch:{ IllegalStateException -> 0x00a4 }
            return
        L_0x0017:
            com.google.android.exoplayer2.Format r2 = r11.f13757A     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 != 0) goto L_0x0023
            r2 = 2
            boolean r2 = r11.mo16043h0(r2)     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            r11.mo16038V()     // Catch:{ IllegalStateException -> 0x00a4 }
            boolean r2 = r11.f13823w0     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "bypassRender"
            p583jk.C17884p.m44368g(r2)     // Catch:{ IllegalStateException -> 0x00a4 }
        L_0x002f:
            boolean r2 = r11.mo16026F(r12, r14)     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 == 0) goto L_0x0036
            goto L_0x002f
        L_0x0036:
            p583jk.C17884p.m44382v()     // Catch:{ IllegalStateException -> 0x00a4 }
            goto L_0x009f
        L_0x003a:
            com.google.android.exoplayer2.mediacodec.b r2 = r11.f13775J     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r2 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00a4 }
            java.lang.String r4 = "drainAndFeed"
            p583jk.C17884p.m44368g(r4)     // Catch:{ IllegalStateException -> 0x00a4 }
        L_0x0047:
            boolean r4 = r11.mo16030K(r12, r14)     // Catch:{ IllegalStateException -> 0x00a4 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x006a
            long r7 = r11.f13769G     // Catch:{ IllegalStateException -> 0x00a4 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0066
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00a4 }
            long r7 = r7 - r2
            long r9 = r11.f13769G     // Catch:{ IllegalStateException -> 0x00a4 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r4 = 0
            goto L_0x0067
        L_0x0066:
            r4 = 1
        L_0x0067:
            if (r4 == 0) goto L_0x006a
            goto L_0x0047
        L_0x006a:
            boolean r12 = r11.mo16031L()     // Catch:{ IllegalStateException -> 0x00a4 }
            if (r12 == 0) goto L_0x0088
            long r12 = r11.f13769G     // Catch:{ IllegalStateException -> 0x00a4 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0084
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x00a4 }
            long r12 = r12 - r2
            long r14 = r11.f13769G     // Catch:{ IllegalStateException -> 0x00a4 }
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r12 = 0
            goto L_0x0085
        L_0x0084:
            r12 = 1
        L_0x0085:
            if (r12 == 0) goto L_0x0088
            goto L_0x006a
        L_0x0088:
            p583jk.C17884p.m44382v()     // Catch:{ IllegalStateException -> 0x00a4 }
            goto L_0x009f
        L_0x008c:
            ja.d r14 = r11.f13790Q0     // Catch:{ IllegalStateException -> 0x00a4 }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x00a4 }
            gb.b0 r14 = r11.f13467g     // Catch:{ IllegalStateException -> 0x00a4 }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x00a4 }
            long r2 = r11.f13469i     // Catch:{ IllegalStateException -> 0x00a4 }
            long r12 = r12 - r2
            r14.mo20650c(r12)     // Catch:{ IllegalStateException -> 0x00a4 }
            r11.mo16043h0(r0)     // Catch:{ IllegalStateException -> 0x00a4 }
        L_0x009f:
            ja.d r12 = r11.f13790Q0     // Catch:{ IllegalStateException -> 0x00a4 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x00a4 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x00a4 }
            return
        L_0x00a4:
            r12 = move-exception
            int r13 = p277ub.C6774a0.f20959a
            r14 = 21
            if (r13 < r14) goto L_0x00b0
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00b0
            goto L_0x00c5
        L_0x00b0:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x00c7
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00c7
        L_0x00c5:
            r15 = 1
            goto L_0x00c8
        L_0x00c7:
            r15 = 0
        L_0x00c8:
            if (r15 == 0) goto L_0x00f1
            r11.mo15925X(r12)
            if (r13 < r14) goto L_0x00df
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00db
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00dc
        L_0x00db:
            r13 = 0
        L_0x00dc:
            if (r13 == 0) goto L_0x00df
            r1 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x00e4
            r11.mo16044i0()
        L_0x00e4:
            com.google.android.exoplayer2.mediacodec.c r13 = r11.f13789Q
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r12 = r11.mo16027H(r12, r13)
            com.google.android.exoplayer2.Format r13 = r11.f13757A
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.mo15834w(r12, r13, r1)
            throw r12
        L_0x00f1:
            throw r12
        L_0x00f2:
            r12 = 0
            r11.f13788P0 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo16049q(long, long):void");
    }

    /* renamed from: q0 */
    public final boolean mo16050q0(Format format) throws ExoPlaybackException {
        if (!(C6774a0.f20959a < 23 || this.f13775J == null || this.f13762C0 == 3 || this.f13466f == 0)) {
            float f = this.f13773I;
            Format[] formatArr = this.f13468h;
            formatArr.getClass();
            float P = mo15922P(f, formatArr);
            float f2 = this.f13783N;
            if (f2 == P) {
                return true;
            }
            if (P == -1.0f) {
                if (this.f13764D0) {
                    this.f13760B0 = 1;
                    this.f13762C0 = 3;
                    return false;
                }
                mo16044i0();
                mo16038V();
                return false;
            } else if (f2 == -1.0f && P <= this.f13808p) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", P);
                this.f13775J.mo16067g(bundle);
                this.f13783N = P;
            }
        }
        return true;
    }

    /* renamed from: r0 */
    public final void mo16051r0() throws ExoPlaybackException {
        try {
            this.f13765E.setMediaDrmSession(mo16035R(this.f13763D).f18413b);
            mo16047m0(this.f13763D);
            this.f13760B0 = 0;
            this.f13762C0 = 0;
        } catch (MediaCryptoException e) {
            throw mo15834w(e, this.f13757A, false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.google.android.exoplayer2.Format} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.exoplayer2.Format} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.google.android.exoplayer2.Format} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16052s0(long r3) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r2 = this;
            ub.x r0 = r2.f13818u
            monitor-enter(r0)
            r1 = 1
            java.lang.Object r3 = r0.mo23029f(r3, r1)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)
            com.google.android.exoplayer2.Format r3 = (com.google.android.exoplayer2.Format) r3
            if (r3 != 0) goto L_0x0026
            boolean r4 = r2.f13781M
            if (r4 == 0) goto L_0x0026
            ub.x r3 = r2.f13818u
            monitor-enter(r3)
            int r4 = r3.f21066b     // Catch:{ all -> 0x0023 }
            if (r4 != 0) goto L_0x001a
            r4 = 0
            goto L_0x001e
        L_0x001a:
            java.lang.Object r4 = r3.mo23030g()     // Catch:{ all -> 0x0023 }
        L_0x001e:
            monitor-exit(r3)
            r3 = r4
            com.google.android.exoplayer2.Format r3 = (com.google.android.exoplayer2.Format) r3
            goto L_0x0026
        L_0x0023:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x0026:
            r4 = 0
            if (r3 == 0) goto L_0x002c
            r2.f13759B = r3
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 != 0) goto L_0x0037
            boolean r3 = r2.f13781M
            if (r3 == 0) goto L_0x0040
            com.google.android.exoplayer2.Format r3 = r2.f13759B
            if (r3 == 0) goto L_0x0040
        L_0x0037:
            com.google.android.exoplayer2.Format r3 = r2.f13759B
            android.media.MediaFormat r0 = r2.f13779L
            r2.mo15931b0(r3, r0)
            r2.f13781M = r4
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo16052s0(long):void");
    }

    /* renamed from: x */
    public void mo15835x() {
        this.f13757A = null;
        this.f13792R0 = -9223372036854775807L;
        this.f13794S0 = -9223372036854775807L;
        this.f13796T0 = 0;
        mo16032M();
    }

    /* renamed from: z */
    public void mo15837z(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f13774I0 = false;
        this.f13776J0 = false;
        this.f13780L0 = false;
        if (this.f13823w0) {
            this.f13816t.mo15948h();
            this.f13814s.mo15948h();
            this.f13825x0 = false;
        } else if (mo16032M()) {
            mo16038V();
        }
        C6811x xVar = this.f13818u;
        synchronized (xVar) {
            i = xVar.f21066b;
        }
        if (i > 0) {
            this.f13778K0 = true;
        }
        this.f13818u.mo23025b();
        int i2 = this.f13796T0;
        if (i2 != 0) {
            this.f13794S0 = this.f13826y[i2 - 1];
            this.f13792R0 = this.f13824x[i2 - 1];
            this.f13796T0 = 0;
        }
    }

    public static class DecoderInitializationException extends Exception {
        public final C3941c codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f13418m
                if (r15 >= 0) goto L_0x002a
                java.lang.String r12 = "neg_"
                goto L_0x002c
            L_0x002a:
                java.lang.String r12 = ""
            L_0x002c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException, boolean, int):void");
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, C3941c cVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = cVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
