package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3231m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c */
public final class C3038c {

    /* renamed from: A */
    public long f10382A;

    /* renamed from: B */
    public boolean f10383B;

    /* renamed from: C */
    public long f10384C;

    /* renamed from: D */
    public Method f10385D;

    /* renamed from: E */
    public int f10386E;

    /* renamed from: F */
    public long f10387F;

    /* renamed from: G */
    public long f10388G;

    /* renamed from: H */
    public int f10389H;

    /* renamed from: I */
    public long f10390I;

    /* renamed from: J */
    public long f10391J;

    /* renamed from: K */
    public int f10392K;

    /* renamed from: L */
    public int f10393L;

    /* renamed from: M */
    public long f10394M;

    /* renamed from: N */
    public long f10395N;

    /* renamed from: O */
    public long f10396O;

    /* renamed from: P */
    public float f10397P;

    /* renamed from: Q */
    public C3036b[] f10398Q;

    /* renamed from: R */
    public ByteBuffer[] f10399R;

    /* renamed from: S */
    public ByteBuffer f10400S;

    /* renamed from: T */
    public ByteBuffer f10401T;

    /* renamed from: U */
    public byte[] f10402U;

    /* renamed from: V */
    public int f10403V;

    /* renamed from: W */
    public int f10404W;

    /* renamed from: X */
    public boolean f10405X;

    /* renamed from: Y */
    public boolean f10406Y;

    /* renamed from: Z */
    public int f10407Z;

    /* renamed from: a */
    public final C3047d f10408a;

    /* renamed from: a0 */
    public boolean f10409a0;

    /* renamed from: b */
    public final C3051h f10410b;

    /* renamed from: b0 */
    public boolean f10411b0;

    /* renamed from: c */
    public final C3036b[] f10412c;

    /* renamed from: c0 */
    public long f10413c0;

    /* renamed from: d */
    public final C3044f f10414d;

    /* renamed from: e */
    public final ConditionVariable f10415e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f10416f;

    /* renamed from: g */
    public final C3040b f10417g;

    /* renamed from: h */
    public final LinkedList<C3045g> f10418h;

    /* renamed from: i */
    public AudioTrack f10419i;

    /* renamed from: j */
    public int f10420j;

    /* renamed from: k */
    public int f10421k;

    /* renamed from: l */
    public int f10422l;

    /* renamed from: m */
    public int f10423m;

    /* renamed from: n */
    public int f10424n;

    /* renamed from: o */
    public boolean f10425o;

    /* renamed from: p */
    public int f10426p;

    /* renamed from: q */
    public long f10427q;

    /* renamed from: r */
    public C3231m f10428r;

    /* renamed from: s */
    public C3231m f10429s;

    /* renamed from: t */
    public long f10430t;

    /* renamed from: u */
    public long f10431u;

    /* renamed from: v */
    public ByteBuffer f10432v;

    /* renamed from: w */
    public int f10433w;

    /* renamed from: x */
    public int f10434x;

    /* renamed from: y */
    public int f10435y;

    /* renamed from: z */
    public long f10436z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$a */
    public class C3039a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AudioTrack f10437a;

        public C3039a(AudioTrack audioTrack) {
            this.f10437a = audioTrack;
        }

        public void run() {
            try {
                this.f10437a.flush();
                this.f10437a.release();
            } finally {
                C3038c.this.f10415e.open();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b */
    public static class C3040b {

        /* renamed from: a */
        public AudioTrack f10439a;

        /* renamed from: b */
        public boolean f10440b;

        /* renamed from: c */
        public int f10441c;

        /* renamed from: d */
        public long f10442d;

        /* renamed from: e */
        public long f10443e;

        /* renamed from: f */
        public long f10444f;

        /* renamed from: g */
        public long f10445g;

        /* renamed from: h */
        public long f10446h;

        /* renamed from: i */
        public long f10447i;

        public C3040b() {
        }

        /* renamed from: a */
        public void mo14040a(AudioTrack audioTrack, boolean z) {
            this.f10439a = audioTrack;
            this.f10440b = z;
            this.f10445g = -9223372036854775807L;
            this.f10442d = 0;
            this.f10443e = 0;
            this.f10444f = 0;
            if (audioTrack != null) {
                this.f10441c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: b */
        public long mo14041b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public long mo14042c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo14043d() {
            return false;
        }

        public /* synthetic */ C3040b(C3039a aVar) {
            this();
        }

        /* renamed from: a */
        public long mo14039a() {
            if (this.f10445g != -9223372036854775807L) {
                return Math.min(this.f10447i, this.f10446h + ((((SystemClock.elapsedRealtime() * 1000) - this.f10445g) * ((long) this.f10441c)) / 1000000));
            }
            int playState = this.f10439a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = ((long) this.f10439a.getPlaybackHeadPosition()) & 4294967295L;
            if (this.f10440b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f10444f = this.f10442d;
                }
                playbackHeadPosition += this.f10444f;
            }
            if (this.f10442d > playbackHeadPosition) {
                this.f10443e++;
            }
            this.f10442d = playbackHeadPosition;
            return playbackHeadPosition + (this.f10443e << 32);
        }
    }

    @TargetApi(19)
    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$c */
    public static class C3041c extends C3040b {

        /* renamed from: j */
        public final AudioTimestamp f10448j = new AudioTimestamp();

        /* renamed from: k */
        public long f10449k;

        /* renamed from: l */
        public long f10450l;

        /* renamed from: m */
        public long f10451m;

        public C3041c() {
            super((C3039a) null);
        }

        /* renamed from: a */
        public void mo14040a(AudioTrack audioTrack, boolean z) {
            super.mo14040a(audioTrack, z);
            this.f10449k = 0;
            this.f10450l = 0;
            this.f10451m = 0;
        }

        /* renamed from: b */
        public long mo14041b() {
            return this.f10451m;
        }

        /* renamed from: c */
        public long mo14042c() {
            return this.f10448j.nanoTime;
        }

        /* renamed from: d */
        public boolean mo14043d() {
            boolean timestamp = this.f10439a.getTimestamp(this.f10448j);
            if (timestamp) {
                long j = this.f10448j.framePosition;
                if (this.f10450l > j) {
                    this.f10449k++;
                }
                this.f10450l = j;
                this.f10451m = j + (this.f10449k << 32);
            }
            return timestamp;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d */
    public static final class C3042d extends Exception {
        public C3042d(Throwable th) {
            super(th);
        }

        public C3042d(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$e */
    public static final class C3043e extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3043e(int r4, int r5, int r6, int r7) {
            /*
                r3 = this;
                java.lang.String r0 = "AudioTrack init failed: "
                java.lang.String r1 = ", Config("
                java.lang.String r2 = ", "
                java.lang.StringBuilder r4 = p001a0.C0016g.m35s(r0, r4, r1, r5, r2)
                r4.append(r6)
                r4.append(r2)
                r4.append(r7)
                java.lang.String r5 = ")"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.C3043e.<init>(int, int, int, int):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$f */
    public interface C3044f {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$g */
    public static final class C3045g {

        /* renamed from: a */
        public final C3231m f10452a;

        /* renamed from: b */
        public final long f10453b;

        /* renamed from: c */
        public final long f10454c;

        public C3045g(C3231m mVar, long j, long j2) {
            this.f10452a = mVar;
            this.f10453b = j;
            this.f10454c = j2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h */
    public static final class C3046h extends Exception {
        public C3046h(int i) {
            super(C16759e.m42349e("AudioTrack write failed: ", i));
        }
    }

    public C3038c(C3036b[] bVarArr, C3044f fVar) {
        this.f10414d = fVar;
        if (C3406u.f12148a >= 18) {
            try {
                this.f10385D = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C3406u.f12148a >= 19) {
            this.f10417g = new C3041c();
        } else {
            this.f10417g = new C3040b((C3039a) null);
        }
        C3047d dVar = new C3047d();
        this.f10408a = dVar;
        C3051h hVar = new C3051h();
        this.f10410b = hVar;
        C3036b[] bVarArr2 = new C3036b[(bVarArr.length + 3)];
        this.f10412c = bVarArr2;
        bVarArr2[0] = new C3049f();
        bVarArr2[1] = dVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 2, bVarArr.length);
        bVarArr2[bVarArr.length + 2] = hVar;
        this.f10416f = new long[10];
        this.f10397P = 1.0f;
        this.f10393L = 0;
        this.f10424n = 3;
        this.f10407Z = 0;
        this.f10429s = C3231m.f11655d;
        this.f10404W = -1;
        this.f10398Q = new C3036b[0];
        this.f10399R = new ByteBuffer[0];
        this.f10418h = new LinkedList<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14022a(java.lang.String r9, int r10, int r11, int r12, int r13, int[] r14) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.C3042d {
        /*
            r8 = this;
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r9)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            int r9 = m7595a((java.lang.String) r9)
            goto L_0x0010
        L_0x000f:
            r9 = r12
        L_0x0010:
            if (r0 != 0) goto L_0x0048
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8597b(r12, r10)
            r8.f10386E = r12
            com.fyber.inneractive.sdk.player.exoplayer2.audio.d r12 = r8.f10408a
            r12.f10457d = r14
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r12 = r8.f10412c
            int r14 = r12.length
            r2 = 0
            r3 = 0
        L_0x0021:
            if (r2 >= r14) goto L_0x0042
            r4 = r12[r2]
            boolean r5 = r4.mo14012a(r11, r10, r9)     // Catch:{ a -> 0x003b }
            r3 = r3 | r5
            boolean r5 = r4.mo14015d()
            if (r5 == 0) goto L_0x0038
            int r10 = r4.mo14017f()
            int r9 = r4.mo14016e()
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x003b:
            r9 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r10 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            r10.<init>((java.lang.Throwable) r9)
            throw r10
        L_0x0042:
            if (r3 == 0) goto L_0x0049
            r8.mo14035i()
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            r12 = 252(0xfc, float:3.53E-43)
            r14 = 12
            switch(r10) {
                case 1: goto L_0x0071;
                case 2: goto L_0x006e;
                case 3: goto L_0x006b;
                case 4: goto L_0x0068;
                case 5: goto L_0x0065;
                case 6: goto L_0x0062;
                case 7: goto L_0x005f;
                case 8: goto L_0x005c;
                default: goto L_0x0050;
            }
        L_0x0050:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r9 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            java.lang.String r11 = "Unsupported channel count: "
            java.lang.String r10 = p379.C16759e.m42349e(r11, r10)
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x005c:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3052b.f10507a
            goto L_0x0072
        L_0x005f:
            r2 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0072
        L_0x0062:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x0072
        L_0x0065:
            r2 = 220(0xdc, float:3.08E-43)
            goto L_0x0072
        L_0x0068:
            r2 = 204(0xcc, float:2.86E-43)
            goto L_0x0072
        L_0x006b:
            r2 = 28
            goto L_0x0072
        L_0x006e:
            r2 = 12
            goto L_0x0072
        L_0x0071:
            r2 = 4
        L_0x0072:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x0099
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12149b
            java.lang.String r7 = "foster"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0099
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12150c
            java.lang.String r7 = "NVIDIA"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0099
            r5 = 3
            if (r10 == r5) goto L_0x009a
            if (r10 == r6) goto L_0x009a
            r12 = 7
            if (r10 == r12) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.C3052b.f10507a
            goto L_0x009a
        L_0x0099:
            r12 = r2
        L_0x009a:
            r2 = 25
            if (r4 > r2) goto L_0x00ad
            java.lang.String r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12149b
            java.lang.String r4 = "fugu"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00ad
            if (r10 != r1) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r14 = r12
        L_0x00ae:
            if (r3 != 0) goto L_0x00c3
            boolean r12 = r8.mo14031e()
            if (r12 == 0) goto L_0x00c3
            int r12 = r8.f10422l
            if (r12 != r9) goto L_0x00c3
            int r12 = r8.f10420j
            if (r12 != r11) goto L_0x00c3
            int r12 = r8.f10421k
            if (r12 != r14) goto L_0x00c3
            return
        L_0x00c3:
            r8.mo14034h()
            r8.f10422l = r9
            r8.f10425o = r0
            r8.f10420j = r11
            r8.f10421k = r14
            r12 = 2
            if (r0 == 0) goto L_0x00d2
            goto L_0x00d3
        L_0x00d2:
            r9 = 2
        L_0x00d3:
            r8.f10423m = r9
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8597b(r12, r10)
            r8.f10389H = r9
            if (r13 == 0) goto L_0x00e0
            r8.f10426p = r13
            goto L_0x012c
        L_0x00e0:
            if (r0 == 0) goto L_0x00f5
            int r9 = r8.f10423m
            if (r9 == r6) goto L_0x00f0
            r10 = 6
            if (r9 != r10) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            r9 = 49152(0xc000, float:6.8877E-41)
            r8.f10426p = r9
            goto L_0x012c
        L_0x00f0:
            r9 = 20480(0x5000, float:2.8699E-41)
            r8.f10426p = r9
            goto L_0x012c
        L_0x00f5:
            int r9 = r8.f10423m
            int r9 = android.media.AudioTrack.getMinBufferSize(r11, r14, r9)
            r10 = -2
            if (r9 == r10) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r1 = 0
        L_0x0100:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r1)
            int r10 = r9 * 4
            r11 = 250000(0x3d090, double:1.235164E-318)
            long r11 = r8.mo14020a((long) r11)
            int r12 = (int) r11
            int r11 = r8.f10389H
            int r12 = r12 * r11
            long r13 = (long) r9
            r1 = 750000(0xb71b0, double:3.70549E-318)
            long r1 = r8.mo14020a((long) r1)
            int r9 = r8.f10389H
            long r3 = (long) r9
            long r1 = r1 * r3
            long r13 = java.lang.Math.max(r13, r1)
            int r9 = (int) r13
            if (r10 >= r12) goto L_0x0127
            r10 = r12
            goto L_0x012a
        L_0x0127:
            if (r10 <= r9) goto L_0x012a
            r10 = r9
        L_0x012a:
            r8.f10426p = r10
        L_0x012c:
            if (r0 == 0) goto L_0x0134
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x013e
        L_0x0134:
            int r9 = r8.f10426p
            int r10 = r8.f10389H
            int r9 = r9 / r10
            long r9 = (long) r9
            long r9 = r8.mo14026b(r9)
        L_0x013e:
            r8.f10427q = r9
            com.fyber.inneractive.sdk.player.exoplayer2.m r9 = r8.f10429s
            r8.mo14021a((com.fyber.inneractive.sdk.player.exoplayer2.C3231m) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.mo14022a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14027b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.C3046h {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f10401T
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8505a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.f10401T = r9
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f10402U
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f10402U = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f10402U
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f10403V = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.f10390I
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b r2 = r8.f10417g
            long r4 = r2.mo14039a()
            int r2 = r8.f10389H
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.f10426p
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.f10419i
            byte[] r2 = r8.f10402U
            int r4 = r8.f10403V
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00ef
            int r11 = r8.f10403V
            int r11 = r11 + r10
            r8.f10403V = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00ef
        L_0x0076:
            r10 = 0
            goto L_0x00ef
        L_0x0079:
            boolean r2 = r8.f10409a0
            if (r2 == 0) goto L_0x00e9
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r2)
            android.media.AudioTrack r2 = r8.f10419i
            java.nio.ByteBuffer r4 = r8.f10432v
            if (r4 != 0) goto L_0x00a7
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f10432v = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f10432v
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a7:
            int r4 = r8.f10433w
            if (r4 != 0) goto L_0x00c3
            java.nio.ByteBuffer r4 = r8.f10432v
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f10432v
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r5
            r5 = 8
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f10432v
            r10.position(r3)
            r8.f10433w = r0
        L_0x00c3:
            java.nio.ByteBuffer r10 = r8.f10432v
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00da
            java.nio.ByteBuffer r11 = r8.f10432v
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d7
            r8.f10433w = r3
            r10 = r11
            goto L_0x00ef
        L_0x00d7:
            if (r11 >= r10) goto L_0x00da
            goto L_0x0076
        L_0x00da:
            int r10 = r2.write(r9, r0, r1)
            if (r10 >= 0) goto L_0x00e3
            r8.f10433w = r3
            goto L_0x00ef
        L_0x00e3:
            int r9 = r8.f10433w
            int r9 = r9 - r10
            r8.f10433w = r9
            goto L_0x00ef
        L_0x00e9:
            android.media.AudioTrack r10 = r8.f10419i
            int r10 = r10.write(r9, r0, r1)
        L_0x00ef:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f10413c0 = r4
            if (r10 < 0) goto L_0x0112
            boolean r9 = r8.f10425o
            if (r9 != 0) goto L_0x0101
            long r4 = r8.f10390I
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f10390I = r4
        L_0x0101:
            if (r10 != r0) goto L_0x0111
            if (r9 == 0) goto L_0x010d
            long r9 = r8.f10391J
            int r11 = r8.f10392K
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f10391J = r9
        L_0x010d:
            r9 = 0
            r8.f10401T = r9
            return r1
        L_0x0111:
            return r3
        L_0x0112:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h r9 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.mo14027b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo14029c(long j) throws C3046h {
        ByteBuffer byteBuffer;
        int length = this.f10398Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f10399R[i - 1];
            } else {
                byteBuffer = this.f10400S;
                if (byteBuffer == null) {
                    byteBuffer = C3036b.f10381a;
                }
            }
            if (i == length) {
                mo14027b(byteBuffer, j);
            } else {
                C3036b bVar = this.f10398Q[i];
                bVar.mo14011a(byteBuffer);
                ByteBuffer a = bVar.mo14010a();
                this.f10399R[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean mo14030d() {
        boolean z;
        if (mo14031e()) {
            if (mo14028c() > this.f10417g.mo14039a()) {
                return true;
            }
            if (mo14032f() && this.f10419i.getPlayState() == 2 && this.f10419i.getPlaybackHeadPosition() == 0) {
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

    /* renamed from: e */
    public final boolean mo14031e() {
        return this.f10419i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f10423m;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14032f() {
        /*
            r2 = this;
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.f10423m
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.mo14032f():boolean");
    }

    /* renamed from: g */
    public void mo14033g() {
        this.f10406Y = true;
        if (mo14031e()) {
            this.f10395N = System.nanoTime() / 1000;
            this.f10419i.play();
        }
    }

    /* renamed from: h */
    public void mo14034h() {
        if (mo14031e()) {
            this.f10387F = 0;
            this.f10388G = 0;
            this.f10390I = 0;
            this.f10391J = 0;
            this.f10392K = 0;
            C3231m mVar = this.f10428r;
            if (mVar != null) {
                this.f10429s = mVar;
                this.f10428r = null;
            } else if (!this.f10418h.isEmpty()) {
                this.f10429s = this.f10418h.getLast().f10452a;
            }
            this.f10418h.clear();
            this.f10430t = 0;
            this.f10431u = 0;
            this.f10400S = null;
            this.f10401T = null;
            int i = 0;
            while (true) {
                C3036b[] bVarArr = this.f10398Q;
                if (i >= bVarArr.length) {
                    break;
                }
                C3036b bVar = bVarArr[i];
                bVar.flush();
                this.f10399R[i] = bVar.mo14010a();
                i++;
            }
            this.f10405X = false;
            this.f10404W = -1;
            this.f10432v = null;
            this.f10433w = 0;
            this.f10393L = 0;
            this.f10396O = 0;
            mo14036j();
            if (this.f10419i.getPlayState() == 3) {
                this.f10419i.pause();
            }
            AudioTrack audioTrack = this.f10419i;
            this.f10419i = null;
            this.f10417g.mo14040a((AudioTrack) null, false);
            this.f10415e.close();
            new C3039a(audioTrack).start();
        }
    }

    /* renamed from: i */
    public final void mo14035i() {
        ArrayList arrayList = new ArrayList();
        for (C3036b bVar : this.f10412c) {
            if (bVar.mo14015d()) {
                arrayList.add(bVar);
            } else {
                bVar.flush();
            }
        }
        int size = arrayList.size();
        this.f10398Q = (C3036b[]) arrayList.toArray(new C3036b[size]);
        this.f10399R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C3036b bVar2 = this.f10398Q[i];
            bVar2.flush();
            this.f10399R[i] = bVar2.mo14010a();
        }
    }

    /* renamed from: j */
    public final void mo14036j() {
        this.f10436z = 0;
        this.f10435y = 0;
        this.f10434x = 0;
        this.f10382A = 0;
        this.f10383B = false;
        this.f10384C = 0;
    }

    /* renamed from: k */
    public final void mo14037k() {
        if (mo14031e()) {
            if (C3406u.f12148a >= 21) {
                this.f10419i.setVolume(this.f10397P);
                return;
            }
            AudioTrack audioTrack = this.f10419i;
            float f = this.f10397P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: c */
    public final long mo14028c() {
        return this.f10425o ? this.f10391J : this.f10390I / ((long) this.f10389H);
    }

    /* renamed from: a */
    public boolean mo14024a(ByteBuffer byteBuffer, long j) throws C3043e, C3046h {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f10400S;
        C3380a.m8505a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo14031e()) {
            this.f10415e.block();
            if (this.f10409a0) {
                this.f10419i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f10421k).setEncoding(this.f10423m).setSampleRate(this.f10420j).build(), this.f10426p, 1, this.f10407Z);
            } else if (this.f10407Z == 0) {
                this.f10419i = new AudioTrack(this.f10424n, this.f10420j, this.f10421k, this.f10423m, this.f10426p, 1);
            } else {
                this.f10419i = new AudioTrack(this.f10424n, this.f10420j, this.f10421k, this.f10423m, this.f10426p, 1, this.f10407Z);
            }
            int state = this.f10419i.getState();
            if (state == 1) {
                int audioSessionId = this.f10419i.getAudioSessionId();
                if (this.f10407Z != audioSessionId) {
                    this.f10407Z = audioSessionId;
                    MediaCodecAudioRenderer.C3034b bVar = (MediaCodecAudioRenderer.C3034b) this.f10414d;
                    MediaCodecAudioRenderer.this.f10367V.audioSessionId(audioSessionId);
                    MediaCodecAudioRenderer.this.getClass();
                }
                this.f10417g.mo14040a(this.f10419i, mo14032f());
                mo14037k();
                this.f10411b0 = false;
                if (this.f10406Y) {
                    mo14033g();
                }
            } else {
                try {
                    this.f10419i.release();
                } catch (Exception unused) {
                } finally {
                    this.f10419i = null;
                }
                throw new C3043e(state, this.f10420j, this.f10421k, this.f10426p);
            }
        }
        if (mo14032f()) {
            if (this.f10419i.getPlayState() == 2) {
                this.f10411b0 = false;
                return false;
            } else if (this.f10419i.getPlayState() == 1 && this.f10417g.mo14039a() != 0) {
                return false;
            }
        }
        boolean z = this.f10411b0;
        boolean d = mo14030d();
        this.f10411b0 = d;
        if (z && !d && this.f10419i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f10413c0;
            MediaCodecAudioRenderer.C3034b bVar2 = (MediaCodecAudioRenderer.C3034b) this.f10414d;
            MediaCodecAudioRenderer.this.f10367V.audioTrackUnderrun(this.f10426p, C3052b.m7658b(this.f10427q), elapsedRealtime);
            MediaCodecAudioRenderer.this.getClass();
        }
        if (this.f10400S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f10425o && this.f10392K == 0) {
                int i3 = this.f10423m;
                int i4 = 6;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i4 = C3035a.f10375a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i2 = i4 * 256;
                } else {
                    throw new IllegalStateException(C16759e.m42349e("Unexpected audio encoding: ", i3));
                }
                this.f10392K = i2;
            }
            if (this.f10428r != null) {
                if (!mo14023a()) {
                    return false;
                }
                this.f10418h.add(new C3045g(this.f10428r, Math.max(0, j2), mo14026b(mo14028c())));
                this.f10428r = null;
                mo14035i();
            }
            if (this.f10393L == 0) {
                this.f10394M = Math.max(0, j2);
                this.f10393L = 1;
            } else {
                long b = mo14026b(mo14025b()) + this.f10394M;
                if (this.f10393L != 1 || Math.abs(b - j2) <= 200000) {
                    i = 2;
                } else {
                    i = 2;
                    this.f10393L = 2;
                }
                if (this.f10393L == i) {
                    this.f10394M = (j2 - b) + this.f10394M;
                    this.f10393L = 1;
                    MediaCodecAudioRenderer.C3034b bVar3 = (MediaCodecAudioRenderer.C3034b) this.f10414d;
                    MediaCodecAudioRenderer.this.getClass();
                    boolean unused2 = MediaCodecAudioRenderer.this.f10373b0 = true;
                }
            }
            if (this.f10425o) {
                this.f10388G += (long) this.f10392K;
            } else {
                this.f10387F += (long) byteBuffer.remaining();
            }
            this.f10400S = byteBuffer2;
        }
        if (this.f10425o) {
            mo14027b(this.f10400S, j2);
        } else {
            mo14029c(j2);
        }
        if (this.f10400S.hasRemaining()) {
            return false;
        }
        this.f10400S = null;
        return true;
    }

    /* renamed from: b */
    public final long mo14026b(long j) {
        return (j * 1000000) / ((long) this.f10420j);
    }

    /* renamed from: b */
    public final long mo14025b() {
        return this.f10425o ? this.f10388G : this.f10387F / ((long) this.f10386E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14023a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.C3046h {
        /*
            r9 = this;
            int r0 = r9.f10404W
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f10425o
            if (r0 == 0) goto L_0x000f
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r0 = r9.f10398Q
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f10404W = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f10404W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r5 = r9.f10398Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo14014c()
        L_0x0028:
            r9.mo14029c(r7)
            boolean r0 = r4.mo14013b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f10404W
            int r0 = r0 + r2
            r9.f10404W = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f10401T
            if (r0 == 0) goto L_0x0044
            r9.mo14027b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f10401T
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f10404W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3038c.mo14023a():boolean");
    }

    /* renamed from: a */
    public C3231m mo14021a(C3231m mVar) {
        if (this.f10425o) {
            C3231m mVar2 = C3231m.f11655d;
            this.f10429s = mVar2;
            return mVar2;
        }
        C3051h hVar = this.f10410b;
        float f = mVar.f11656a;
        hVar.getClass();
        int i = C3406u.f12148a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        hVar.f10499e = max;
        C3051h hVar2 = this.f10410b;
        float f2 = mVar.f11657b;
        hVar2.getClass();
        hVar2.f10500f = Math.max(0.1f, Math.min(f2, 8.0f));
        C3231m mVar3 = new C3231m(max, f2);
        C3231m mVar4 = this.f10428r;
        if (mVar4 == null) {
            if (!this.f10418h.isEmpty()) {
                mVar4 = this.f10418h.getLast().f10452a;
            } else {
                mVar4 = this.f10429s;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (mo14031e()) {
                this.f10428r = mVar3;
            } else {
                this.f10429s = mVar3;
            }
        }
        return this.f10429s;
    }

    /* renamed from: a */
    public final long mo14020a(long j) {
        return (j * ((long) this.f10420j)) / 1000000;
    }

    /* renamed from: a */
    public static int m7595a(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 1;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 2;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 7;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
                return 0;
        }
    }
}
