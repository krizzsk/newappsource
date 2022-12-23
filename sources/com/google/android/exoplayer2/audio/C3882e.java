package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$Builder;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C3876a;
import com.google.android.exoplayer2.audio.C3878b;
import com.google.android.exoplayer2.audio.C3893g;
import com.google.android.gms.internal.ads.C25587f;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p099ga.C4932s0;
import p099ga.C4949x0;
import p125ia.C5316d;
import p125ia.C5317e;
import p125ia.C5323j;
import p125ia.C5324k;
import p125ia.C5326l;
import p125ia.C5327m;
import p125ia.C5331p;
import p277ub.C6774a0;
import p277ub.C6776b0;
import p277ub.C6792n;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.audio.e */
public final class C3882e implements AudioSink {

    /* renamed from: A */
    public long f13522A;

    /* renamed from: B */
    public long f13523B;

    /* renamed from: C */
    public long f13524C;

    /* renamed from: D */
    public int f13525D;

    /* renamed from: E */
    public boolean f13526E;

    /* renamed from: F */
    public boolean f13527F;

    /* renamed from: G */
    public long f13528G;

    /* renamed from: H */
    public float f13529H;

    /* renamed from: I */
    public AudioProcessor[] f13530I;

    /* renamed from: J */
    public ByteBuffer[] f13531J;

    /* renamed from: K */
    public ByteBuffer f13532K;

    /* renamed from: L */
    public int f13533L;

    /* renamed from: M */
    public ByteBuffer f13534M;

    /* renamed from: N */
    public byte[] f13535N;

    /* renamed from: O */
    public int f13536O;

    /* renamed from: P */
    public int f13537P;

    /* renamed from: Q */
    public boolean f13538Q;

    /* renamed from: R */
    public boolean f13539R;

    /* renamed from: S */
    public boolean f13540S;

    /* renamed from: T */
    public boolean f13541T;

    /* renamed from: U */
    public int f13542U;

    /* renamed from: V */
    public C5326l f13543V;

    /* renamed from: W */
    public boolean f13544W;

    /* renamed from: X */
    public long f13545X;

    /* renamed from: Y */
    public boolean f13546Y;

    /* renamed from: Z */
    public boolean f13547Z;

    /* renamed from: a */
    public final C5317e f13548a;

    /* renamed from: b */
    public final C3884b f13549b;

    /* renamed from: c */
    public final boolean f13550c = false;

    /* renamed from: d */
    public final C3881d f13551d;

    /* renamed from: e */
    public final C3898k f13552e;

    /* renamed from: f */
    public final AudioProcessor[] f13553f;

    /* renamed from: g */
    public final AudioProcessor[] f13554g;

    /* renamed from: h */
    public final ConditionVariable f13555h = new ConditionVariable(true);

    /* renamed from: i */
    public final C3878b f13556i = new C3878b(new C3889g());

    /* renamed from: j */
    public final ArrayDeque<C3887e> f13557j;

    /* renamed from: k */
    public final boolean f13558k = false;

    /* renamed from: l */
    public final int f13559l = 0;

    /* renamed from: m */
    public C3890h f13560m;

    /* renamed from: n */
    public final C3888f<AudioSink.InitializationException> f13561n;

    /* renamed from: o */
    public final C3888f<AudioSink.WriteException> f13562o;

    /* renamed from: p */
    public AudioSink.C3875a f13563p;

    /* renamed from: q */
    public C3885c f13564q;

    /* renamed from: r */
    public C3885c f13565r;

    /* renamed from: s */
    public AudioTrack f13566s;

    /* renamed from: t */
    public C5316d f13567t;

    /* renamed from: u */
    public C3887e f13568u;

    /* renamed from: v */
    public C3887e f13569v;

    /* renamed from: w */
    public C4932s0 f13570w;

    /* renamed from: x */
    public ByteBuffer f13571x;

    /* renamed from: y */
    public int f13572y;

    /* renamed from: z */
    public long f13573z;

    /* renamed from: com.google.android.exoplayer2.audio.e$a */
    public class C3883a extends Thread {

        /* renamed from: b */
        public final /* synthetic */ AudioTrack f13574b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3883a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f13574b = audioTrack;
        }

        public final void run() {
            try {
                this.f13574b.flush();
                this.f13574b.release();
            } finally {
                C3882e.this.f13555h.open();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$b */
    public interface C3884b {
        /* renamed from: a */
        long mo15911a(long j);

        /* renamed from: b */
        C4932s0 mo15912b(C4932s0 s0Var);

        /* renamed from: c */
        long mo15913c();

        /* renamed from: d */
        boolean mo15914d(boolean z);
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$c */
    public static final class C3885c {

        /* renamed from: a */
        public final Format f13576a;

        /* renamed from: b */
        public final int f13577b;

        /* renamed from: c */
        public final int f13578c;

        /* renamed from: d */
        public final int f13579d;

        /* renamed from: e */
        public final int f13580e;

        /* renamed from: f */
        public final int f13581f;

        /* renamed from: g */
        public final int f13582g;

        /* renamed from: h */
        public final int f13583h;

        /* renamed from: i */
        public final AudioProcessor[] f13584i;

        public C3885c(Format format, int i, int i2, int i3, int i4, int i5, int i6, boolean z, AudioProcessor[] audioProcessorArr) {
            int i7;
            float f;
            this.f13576a = format;
            this.f13577b = i;
            this.f13578c = i2;
            this.f13579d = i3;
            this.f13580e = i4;
            this.f13581f = i5;
            this.f13582g = i6;
            this.f13584i = audioProcessorArr;
            boolean z2 = true;
            if (i2 == 0) {
                if (z) {
                    f = 8.0f;
                } else {
                    f = 1.0f;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
                C17875h.m44304o(minBufferSize == -2 ? false : z2);
                i7 = C6774a0.m15947g(minBufferSize * 4, ((int) ((250000 * ((long) i4)) / 1000000)) * i3, Math.max(minBufferSize, ((int) ((750000 * ((long) i4)) / 1000000)) * i3));
                if (f != 1.0f) {
                    i7 = Math.round(((float) i7) * f);
                }
            } else if (i2 == 1) {
                i7 = mo15917d(50000000);
            } else if (i2 == 2) {
                i7 = mo15917d(250000);
            } else {
                throw new IllegalStateException();
            }
            this.f13583h = i7;
        }

        /* renamed from: c */
        public static AudioAttributes m10310c(C5316d dVar, boolean z) {
            if (z) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return dVar.mo21095a();
        }

        /* renamed from: a */
        public final AudioTrack mo15915a(boolean z, C5316d dVar, int i) throws AudioSink.InitializationException {
            boolean z2;
            boolean z3;
            try {
                AudioTrack b = mo15916b(z, dVar, i);
                int state = b.getState();
                if (state == 1) {
                    return b;
                }
                try {
                    b.release();
                } catch (Exception unused) {
                }
                int i2 = this.f13580e;
                int i3 = this.f13581f;
                int i4 = this.f13583h;
                Format format = this.f13576a;
                if (this.f13578c == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                throw new AudioSink.InitializationException(state, i2, i3, i4, format, z3, (RuntimeException) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                RuntimeException runtimeException = e;
                int i5 = this.f13580e;
                int i6 = this.f13581f;
                int i7 = this.f13583h;
                Format format2 = this.f13576a;
                if (this.f13578c == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                throw new AudioSink.InitializationException(0, i5, i6, i7, format2, z2, runtimeException);
            }
        }

        /* renamed from: b */
        public final AudioTrack mo15916b(boolean z, C5316d dVar, int i) {
            int i2 = C6774a0.f20959a;
            if (i2 >= 29) {
                AudioFormat u = C3882e.m10270u(this.f13580e, this.f13581f, this.f13582g);
                AudioAttributes c = m10310c(dVar, z);
                boolean z2 = true;
                AudioTrack$Builder sessionId = new AudioTrack$Builder().setAudioAttributes(c).setAudioFormat(u).setTransferMode(1).setBufferSizeInBytes(this.f13583h).setSessionId(i);
                if (this.f13578c != 1) {
                    z2 = false;
                }
                return sessionId.setOffloadedPlayback(z2).build();
            } else if (i2 >= 21) {
                return new AudioTrack(m10310c(dVar, z), C3882e.m10270u(this.f13580e, this.f13581f, this.f13582g), this.f13583h, 1, i);
            } else {
                int q = C6774a0.m15957q(dVar.f17514c);
                if (i == 0) {
                    return new AudioTrack(q, this.f13580e, this.f13581f, this.f13582g, this.f13583h, 1);
                }
                return new AudioTrack(q, this.f13580e, this.f13581f, this.f13582g, this.f13583h, 1, i);
            }
        }

        /* renamed from: d */
        public final int mo15917d(long j) {
            int i;
            int i2 = this.f13582g;
            switch (i2) {
                case 5:
                    i = 80000;
                    break;
                case 6:
                case 18:
                    i = 768000;
                    break;
                case 7:
                    i = 192000;
                    break;
                case 8:
                    i = 2250000;
                    break;
                case 9:
                    i = 40000;
                    break;
                case 10:
                    i = 100000;
                    break;
                case 11:
                    i = 16000;
                    break;
                case 12:
                    i = 7000;
                    break;
                case 14:
                    i = 3062500;
                    break;
                case 15:
                    i = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
                    break;
                case 16:
                    i = 256000;
                    break;
                case 17:
                    i = 336000;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (i2 == 5) {
                i *= 2;
            }
            return (int) ((j * ((long) i)) / 1000000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$d */
    public static class C3886d implements C3884b {

        /* renamed from: a */
        public final AudioProcessor[] f13585a;

        /* renamed from: b */
        public final C3896i f13586b;

        /* renamed from: c */
        public final C3897j f13587c;

        public C3886d(AudioProcessor... audioProcessorArr) {
            C3896i iVar = new C3896i();
            C3897j jVar = new C3897j();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.f13585a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f13586b = iVar;
            this.f13587c = jVar;
            audioProcessorArr2[audioProcessorArr.length] = iVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = jVar;
        }

        /* renamed from: a */
        public final long mo15911a(long j) {
            C3897j jVar = this.f13587c;
            if (jVar.f13637o < 1024) {
                return (long) (((double) jVar.f13625c) * ((double) j));
            }
            long j2 = jVar.f13636n;
            C5331p pVar = jVar.f13632j;
            pVar.getClass();
            long j3 = j2 - ((long) ((pVar.f17576k * pVar.f17567b) * 2));
            int i = jVar.f13630h.f13475a;
            int i2 = jVar.f13629g.f13475a;
            if (i == i2) {
                return C6774a0.m15939A(j, j3, jVar.f13637o);
            }
            return C6774a0.m15939A(j, j3 * ((long) i), jVar.f13637o * ((long) i2));
        }

        /* renamed from: b */
        public final C4932s0 mo15912b(C4932s0 s0Var) {
            C3897j jVar = this.f13587c;
            float f = s0Var.f16696a;
            if (jVar.f13625c != f) {
                jVar.f13625c = f;
                jVar.f13631i = true;
            }
            float f2 = s0Var.f16697b;
            if (jVar.f13626d != f2) {
                jVar.f13626d = f2;
                jVar.f13631i = true;
            }
            return s0Var;
        }

        /* renamed from: c */
        public final long mo15913c() {
            return this.f13586b.f13623t;
        }

        /* renamed from: d */
        public final boolean mo15914d(boolean z) {
            this.f13586b.f13616m = z;
            return z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$e */
    public static final class C3887e {

        /* renamed from: a */
        public final C4932s0 f13588a;

        /* renamed from: b */
        public final boolean f13589b;

        /* renamed from: c */
        public final long f13590c;

        /* renamed from: d */
        public final long f13591d;

        public C3887e(C4932s0 s0Var, boolean z, long j, long j2) {
            this.f13588a = s0Var;
            this.f13589b = z;
            this.f13590c = j;
            this.f13591d = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$f */
    public static final class C3888f<T extends Exception> {

        /* renamed from: a */
        public T f13592a;

        /* renamed from: b */
        public long f13593b;

        /* renamed from: a */
        public final void mo15918a(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f13592a == null) {
                this.f13592a = t;
                this.f13593b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f13593b) {
                T t2 = this.f13592a;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.f13592a;
                this.f13592a = null;
                throw t3;
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$g */
    public final class C3889g implements C3878b.C3879a {
        public C3889g() {
        }

        /* renamed from: a */
        public final void mo15884a(int i, long j) {
            if (C3882e.this.f13563p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C3882e eVar = C3882e.this;
                long j2 = elapsedRealtime - eVar.f13545X;
                C3876a.C3877a aVar = C3893g.this.f13601W0;
                Handler handler = aVar.f13479a;
                if (handler != null) {
                    handler.post(new C5323j(aVar, i, j, j2));
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = ((com.google.android.exoplayer2.audio.C3893g.C3894a) r0).f13611a.f13601W0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo15885b(long r4) {
            /*
                r3 = this;
                com.google.android.exoplayer2.audio.e r0 = com.google.android.exoplayer2.audio.C3882e.this
                com.google.android.exoplayer2.audio.AudioSink$a r0 = r0.f13563p
                if (r0 == 0) goto L_0x0018
                com.google.android.exoplayer2.audio.g$a r0 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r0
                com.google.android.exoplayer2.audio.g r0 = com.google.android.exoplayer2.audio.C3893g.this
                com.google.android.exoplayer2.audio.a$a r0 = r0.f13601W0
                android.os.Handler r1 = r0.f13479a
                if (r1 == 0) goto L_0x0018
                ia.g r2 = new ia.g
                r2.<init>(r0, r4)
                r1.post(r2)
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.C3889g.mo15885b(long):void");
        }

        /* renamed from: c */
        public final void mo15886c(long j, long j2, long j3, long j4) {
            C3882e.this.mo15907x();
            C3882e.this.mo15908y();
        }

        /* renamed from: d */
        public final void mo15887d(long j, long j2, long j3, long j4) {
            C3882e.this.mo15907x();
            C3882e.this.mo15908y();
        }

        /* renamed from: e */
        public final void mo15888e() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.e$h */
    public final class C3890h {

        /* renamed from: a */
        public final Handler f13595a = new Handler();

        /* renamed from: b */
        public final C3891a f13596b = new C3891a();

        /* renamed from: com.google.android.exoplayer2.audio.e$h$a */
        public class C3891a extends AudioTrack$StreamEventCallback {
            public C3891a() {
            }

            public final void onDataRequest(AudioTrack audioTrack, int i) {
                boolean z;
                C4949x0.C4950a aVar;
                if (audioTrack == C3882e.this.f13566s) {
                    z = true;
                } else {
                    z = false;
                }
                C17875h.m44304o(z);
                C3882e eVar = C3882e.this;
                AudioSink.C3875a aVar2 = eVar.f13563p;
                if (aVar2 != null && eVar.f13540S && (aVar = C3893g.this.f13610f1) != null) {
                    aVar.mo20474a();
                }
            }

            public final void onTearDown(AudioTrack audioTrack) {
                boolean z;
                C4949x0.C4950a aVar;
                if (audioTrack == C3882e.this.f13566s) {
                    z = true;
                } else {
                    z = false;
                }
                C17875h.m44304o(z);
                C3882e eVar = C3882e.this;
                AudioSink.C3875a aVar2 = eVar.f13563p;
                if (aVar2 != null && eVar.f13540S && (aVar = C3893g.this.f13610f1) != null) {
                    aVar.mo20474a();
                }
            }
        }

        public C3890h() {
        }
    }

    public C3882e(C5317e eVar, C3886d dVar) {
        this.f13548a = eVar;
        this.f13549b = dVar;
        int i = C6774a0.f20959a;
        C3881d dVar2 = new C3881d();
        this.f13551d = dVar2;
        C3898k kVar = new C3898k();
        this.f13552e = kVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C3880c[]{new C3895h(), dVar2, kVar});
        Collections.addAll(arrayList, dVar.f13585a);
        this.f13553f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f13554g = new AudioProcessor[]{new C3892f()};
        this.f13529H = 1.0f;
        this.f13567t = C5316d.f17511f;
        this.f13542U = 0;
        this.f13543V = new C5326l();
        C4932s0 s0Var = C4932s0.f16695d;
        this.f13569v = new C3887e(s0Var, false, 0, 0);
        this.f13570w = s0Var;
        this.f13537P = -1;
        this.f13530I = new AudioProcessor[0];
        this.f13531J = new ByteBuffer[0];
        this.f13557j = new ArrayDeque<>();
        this.f13561n = new C3888f<>();
        this.f13562o = new C3888f<>();
    }

    /* renamed from: B */
    public static boolean m10269B(AudioTrack audioTrack) {
        return C6774a0.f20959a >= 29 && C25587f.m63982h(audioTrack);
    }

    /* renamed from: u */
    public static AudioFormat m10270u(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00db  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m10271v(com.google.android.exoplayer2.Format r13, p125ia.C5317e r14) {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r13.f13418m
            r1.getClass()
            java.lang.String r2 = r13.f13415j
            int r1 = p277ub.C6792n.m15989b(r1, r2)
            r2 = 5
            r3 = 18
            r4 = 7
            r5 = 8
            r6 = 6
            r7 = 1
            r8 = 0
            if (r1 == r2) goto L_0x002d
            if (r1 == r6) goto L_0x002d
            if (r1 == r3) goto L_0x002d
            r9 = 17
            if (r1 == r9) goto L_0x002d
            if (r1 == r4) goto L_0x002d
            if (r1 == r5) goto L_0x002d
            r9 = 14
            if (r1 != r9) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r9 = 0
            goto L_0x002e
        L_0x002d:
            r9 = 1
        L_0x002e:
            if (r9 != 0) goto L_0x0031
            return r0
        L_0x0031:
            if (r1 != r3) goto L_0x0042
            int[] r9 = r14.f17520a
            int r9 = java.util.Arrays.binarySearch(r9, r3)
            if (r9 < 0) goto L_0x003d
            r9 = 1
            goto L_0x003e
        L_0x003d:
            r9 = 0
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r1 = 6
            goto L_0x0052
        L_0x0042:
            if (r1 != r5) goto L_0x0052
            int[] r9 = r14.f17520a
            int r9 = java.util.Arrays.binarySearch(r9, r5)
            if (r9 < 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 != 0) goto L_0x0052
            r1 = 7
        L_0x0052:
            int[] r9 = r14.f17520a
            int r9 = java.util.Arrays.binarySearch(r9, r1)
            if (r9 < 0) goto L_0x005c
            r9 = 1
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            if (r9 != 0) goto L_0x0060
            return r0
        L_0x0060:
            r9 = 3
            if (r1 != r3) goto L_0x00a9
            int r14 = p277ub.C6774a0.f20959a
            r10 = 29
            if (r14 < r10) goto L_0x00a7
            int r13 = r13.f13400A
            android.media.AudioAttributes$Builder r14 = new android.media.AudioAttributes$Builder
            r14.<init>()
            android.media.AudioAttributes$Builder r14 = r14.setUsage(r7)
            android.media.AudioAttributes$Builder r14 = r14.setContentType(r9)
            android.media.AudioAttributes r14 = r14.build()
            r10 = 8
        L_0x007e:
            if (r10 <= 0) goto L_0x00a4
            android.media.AudioFormat$Builder r11 = new android.media.AudioFormat$Builder
            r11.<init>()
            android.media.AudioFormat$Builder r11 = r11.setEncoding(r3)
            android.media.AudioFormat$Builder r11 = r11.setSampleRate(r13)
            int r12 = p277ub.C6774a0.m15952l(r10)
            android.media.AudioFormat$Builder r11 = r11.setChannelMask(r12)
            android.media.AudioFormat r11 = r11.build()
            boolean r11 = android.media.AudioTrack.isDirectPlaybackSupported(r11, r14)
            if (r11 == 0) goto L_0x00a1
            r8 = r10
            goto L_0x00a4
        L_0x00a1:
            int r10 = r10 + -1
            goto L_0x007e
        L_0x00a4:
            if (r8 != 0) goto L_0x00b0
            return r0
        L_0x00a7:
            r8 = 6
            goto L_0x00b0
        L_0x00a9:
            int r8 = r13.f13431z
            int r13 = r14.f17521b
            if (r8 <= r13) goto L_0x00b0
            return r0
        L_0x00b0:
            int r13 = p277ub.C6774a0.f20959a
            r14 = 28
            if (r13 > r14) goto L_0x00c2
            if (r8 != r4) goto L_0x00b9
            goto L_0x00c3
        L_0x00b9:
            if (r8 == r9) goto L_0x00c0
            r14 = 4
            if (r8 == r14) goto L_0x00c0
            if (r8 != r2) goto L_0x00c2
        L_0x00c0:
            r5 = 6
            goto L_0x00c3
        L_0x00c2:
            r5 = r8
        L_0x00c3:
            r14 = 26
            if (r13 > r14) goto L_0x00d4
            java.lang.String r13 = p277ub.C6774a0.f20960b
            java.lang.String r14 = "fugu"
            boolean r13 = r14.equals(r13)
            if (r13 == 0) goto L_0x00d4
            if (r5 != r7) goto L_0x00d4
            r5 = 2
        L_0x00d4:
            int r13 = p277ub.C6774a0.m15952l(r5)
            if (r13 != 0) goto L_0x00db
            return r0
        L_0x00db:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.util.Pair r13 = android.util.Pair.create(r14, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.m10271v(com.google.android.exoplayer2.Format, ia.e):android.util.Pair");
    }

    /* renamed from: A */
    public final boolean mo15894A() {
        return this.f13566s != null;
    }

    /* renamed from: C */
    public final void mo15895C() {
        if (!this.f13539R) {
            this.f13539R = true;
            C3878b bVar = this.f13556i;
            long y = mo15908y();
            bVar.f13512z = bVar.mo15881a();
            bVar.f13510x = SystemClock.elapsedRealtime() * 1000;
            bVar.f13481A = y;
            this.f13566s.stop();
            this.f13572y = 0;
        }
    }

    /* renamed from: D */
    public final void mo15896D(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.f13530I.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f13531J[i - 1];
            } else {
                byteBuffer = this.f13532K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f13473a;
                }
            }
            if (i == length) {
                mo15903K(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f13530I[i];
                if (i > this.f13537P) {
                    audioProcessor.mo15840f(byteBuffer);
                }
                ByteBuffer e = audioProcessor.mo15839e();
                this.f13531J[i] = e;
                if (e.hasRemaining()) {
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

    /* renamed from: E */
    public final void mo15897E() {
        this.f13573z = 0;
        this.f13522A = 0;
        this.f13523B = 0;
        this.f13524C = 0;
        int i = 0;
        this.f13547Z = false;
        this.f13525D = 0;
        this.f13569v = new C3887e(mo15906w().f13588a, mo15906w().f13589b, 0, 0);
        this.f13528G = 0;
        this.f13568u = null;
        this.f13557j.clear();
        this.f13532K = null;
        this.f13533L = 0;
        this.f13534M = null;
        this.f13539R = false;
        this.f13538Q = false;
        this.f13537P = -1;
        this.f13571x = null;
        this.f13572y = 0;
        this.f13552e.f13645o = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f13530I;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.flush();
                this.f13531J[i] = audioProcessor.mo15839e();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    public final void mo15898F(C4932s0 s0Var, boolean z) {
        C3887e w = mo15906w();
        if (!s0Var.equals(w.f13588a) || z != w.f13589b) {
            C3887e eVar = new C3887e(s0Var, z, -9223372036854775807L, -9223372036854775807L);
            if (mo15894A()) {
                this.f13568u = eVar;
            } else {
                this.f13569v = eVar;
            }
        }
    }

    /* renamed from: G */
    public final void mo15899G(C4932s0 s0Var) {
        if (mo15894A()) {
            try {
                this.f13566s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(s0Var.f16696a).setPitch(s0Var.f16697b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C6776b0.m15968a("Failed to set playback params", e);
            }
            s0Var = new C4932s0(this.f13566s.getPlaybackParams().getSpeed(), this.f13566s.getPlaybackParams().getPitch());
            C3878b bVar = this.f13556i;
            bVar.f13496j = s0Var.f16696a;
            C5324k kVar = bVar.f13492f;
            if (kVar != null) {
                kVar.mo21105a();
            }
        }
        this.f13570w = s0Var;
    }

    /* renamed from: H */
    public final void mo15900H() {
        if (mo15894A()) {
            if (C6774a0.f20959a >= 21) {
                this.f13566s.setVolume(this.f13529H);
                return;
            }
            AudioTrack audioTrack = this.f13566s;
            float f = this.f13529H;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15901I() {
        /*
            r4 = this;
            boolean r0 = r4.f13544W
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0037
            com.google.android.exoplayer2.audio.e$c r0 = r4.f13565r
            com.google.android.exoplayer2.Format r0 = r0.f13576a
            java.lang.String r0 = r0.f13418m
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0037
            com.google.android.exoplayer2.audio.e$c r0 = r4.f13565r
            com.google.android.exoplayer2.Format r0 = r0.f13576a
            int r0 = r0.f13401B
            boolean r3 = r4.f13550c
            if (r3 == 0) goto L_0x0033
            int r3 = p277ub.C6774a0.f20959a
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r3) goto L_0x002e
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r3) goto L_0x002e
            r3 = 4
            if (r0 != r3) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15901I():boolean");
    }

    /* renamed from: J */
    public final boolean mo15902J(Format format, C5316d dVar) {
        int l;
        boolean z;
        boolean z2;
        boolean z3;
        int i = C6774a0.f20959a;
        if (i < 29 || this.f13559l == 0) {
            return false;
        }
        String str = format.f13418m;
        str.getClass();
        int b = C6792n.m15989b(str, format.f13415j);
        if (b == 0 || (l = C6774a0.m15952l(format.f13431z)) == 0 || !AudioManager.isOffloadedPlaybackSupported(m10270u(format.f13400A, l, b), dVar.mo21095a())) {
            return false;
        }
        if (format.f13402C == 0 && format.f13403D == 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.f13559l == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if (i < 30 || !C6774a0.f20962d.startsWith("Pixel")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00df, code lost:
        if (r14 < r13) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0139  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15903K(java.nio.ByteBuffer r12, long r13) throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r11 = this;
            boolean r0 = r12.hasRemaining()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.nio.ByteBuffer r0 = r11.f13534M
            r1 = 21
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r12) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            p583jk.C17875h.m44301k(r0)
            goto L_0x003b
        L_0x0018:
            r11.f13534M = r12
            int r0 = p277ub.C6774a0.f20959a
            if (r0 >= r1) goto L_0x003b
            int r0 = r12.remaining()
            byte[] r4 = r11.f13535N
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r11.f13535N = r4
        L_0x002d:
            int r4 = r12.position()
            byte[] r5 = r11.f13535N
            r12.get(r5, r3, r0)
            r12.position(r4)
            r11.f13536O = r3
        L_0x003b:
            int r0 = r12.remaining()
            int r4 = p277ub.C6774a0.f20959a
            if (r4 >= r1) goto L_0x0076
            com.google.android.exoplayer2.audio.b r13 = r11.f13556i
            long r5 = r11.f13523B
            long r7 = r13.mo15881a()
            int r14 = r13.f13490d
            long r9 = (long) r14
            long r7 = r7 * r9
            long r5 = r5 - r7
            int r14 = (int) r5
            int r13 = r13.f13491e
            int r13 = r13 - r14
            if (r13 <= 0) goto L_0x00e1
            int r13 = java.lang.Math.min(r0, r13)
            android.media.AudioTrack r14 = r11.f13566s
            byte[] r1 = r11.f13535N
            int r5 = r11.f13536O
            int r13 = r14.write(r1, r5, r13)
            if (r13 <= 0) goto L_0x00f8
            int r14 = r11.f13536O
            int r14 = r14 + r13
            r11.f13536O = r14
            int r14 = r12.position()
            int r14 = r14 + r13
            r12.position(r14)
            goto L_0x00f8
        L_0x0076:
            boolean r1 = r11.f13544W
            if (r1 == 0) goto L_0x00f2
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0085
            r1 = 1
            goto L_0x0086
        L_0x0085:
            r1 = 0
        L_0x0086:
            p583jk.C17875h.m44304o(r1)
            android.media.AudioTrack r1 = r11.f13566s
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 26
            if (r4 < r7) goto L_0x0098
            long r13 = r13 * r5
            int r13 = r1.write(r12, r0, 1, r13)
            goto L_0x00f8
        L_0x0098:
            java.nio.ByteBuffer r7 = r11.f13571x
            if (r7 != 0) goto L_0x00b1
            r7 = 16
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r11.f13571x = r7
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN
            r7.order(r8)
            java.nio.ByteBuffer r7 = r11.f13571x
            r8 = 1431633921(0x55550001, float:1.46372496E13)
            r7.putInt(r8)
        L_0x00b1:
            int r7 = r11.f13572y
            if (r7 != 0) goto L_0x00cb
            java.nio.ByteBuffer r7 = r11.f13571x
            r8 = 4
            r7.putInt(r8, r0)
            java.nio.ByteBuffer r7 = r11.f13571x
            r8 = 8
            long r13 = r13 * r5
            r7.putLong(r8, r13)
            java.nio.ByteBuffer r13 = r11.f13571x
            r13.position(r3)
            r11.f13572y = r0
        L_0x00cb:
            java.nio.ByteBuffer r13 = r11.f13571x
            int r13 = r13.remaining()
            if (r13 <= 0) goto L_0x00e3
            java.nio.ByteBuffer r14 = r11.f13571x
            int r14 = r1.write(r14, r13, r2)
            if (r14 >= 0) goto L_0x00df
            r11.f13572y = r3
            r13 = r14
            goto L_0x00f8
        L_0x00df:
            if (r14 >= r13) goto L_0x00e3
        L_0x00e1:
            r13 = 0
            goto L_0x00f8
        L_0x00e3:
            int r13 = r1.write(r12, r0, r2)
            if (r13 >= 0) goto L_0x00ec
            r11.f13572y = r3
            goto L_0x00f8
        L_0x00ec:
            int r14 = r11.f13572y
            int r14 = r14 - r13
            r11.f13572y = r14
            goto L_0x00f8
        L_0x00f2:
            android.media.AudioTrack r13 = r11.f13566s
            int r13 = r13.write(r12, r0, r2)
        L_0x00f8:
            long r5 = android.os.SystemClock.elapsedRealtime()
            r11.f13545X = r5
            if (r13 >= 0) goto L_0x0139
            r12 = 24
            if (r4 < r12) goto L_0x0107
            r12 = -6
            if (r13 == r12) goto L_0x010b
        L_0x0107:
            r12 = -32
            if (r13 != r12) goto L_0x010d
        L_0x010b:
            r12 = 1
            goto L_0x010e
        L_0x010d:
            r12 = 0
        L_0x010e:
            if (r12 == 0) goto L_0x011c
            com.google.android.exoplayer2.audio.e$c r14 = r11.f13565r
            int r14 = r14.f13578c
            if (r14 != r2) goto L_0x0117
            r3 = 1
        L_0x0117:
            if (r3 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r11.f13546Y = r2
        L_0x011c:
            com.google.android.exoplayer2.audio.AudioSink$WriteException r14 = new com.google.android.exoplayer2.audio.AudioSink$WriteException
            com.google.android.exoplayer2.audio.e$c r0 = r11.f13565r
            com.google.android.exoplayer2.Format r0 = r0.f13576a
            r14.<init>(r13, r0, r12)
            com.google.android.exoplayer2.audio.AudioSink$a r12 = r11.f13563p
            if (r12 == 0) goto L_0x012e
            com.google.android.exoplayer2.audio.g$a r12 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r12
            r12.mo15944a(r14)
        L_0x012e:
            boolean r12 = r14.isRecoverable
            if (r12 != 0) goto L_0x0138
            com.google.android.exoplayer2.audio.e$f<com.google.android.exoplayer2.audio.AudioSink$WriteException> r12 = r11.f13562o
            r12.mo15918a(r14)
            return
        L_0x0138:
            throw r14
        L_0x0139:
            com.google.android.exoplayer2.audio.e$f<com.google.android.exoplayer2.audio.AudioSink$WriteException> r14 = r11.f13562o
            r1 = 0
            r14.f13592a = r1
            android.media.AudioTrack r14 = r11.f13566s
            boolean r14 = m10269B(r14)
            if (r14 == 0) goto L_0x017f
            long r4 = r11.f13524C
            r6 = 0
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x0150
            r11.f13547Z = r3
        L_0x0150:
            boolean r14 = r11.f13540S
            if (r14 == 0) goto L_0x017f
            com.google.android.exoplayer2.audio.AudioSink$a r14 = r11.f13563p
            if (r14 == 0) goto L_0x017f
            if (r13 >= r0) goto L_0x017f
            boolean r14 = r11.f13547Z
            if (r14 != 0) goto L_0x017f
            com.google.android.exoplayer2.audio.b r14 = r11.f13556i
            long r6 = r14.mo15881a()
            long r4 = r4 - r6
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r14 = r14.f13493g
            long r6 = (long) r14
            long r4 = r4 / r6
            long r4 = p099ga.C4883f.m12377b(r4)
            com.google.android.exoplayer2.audio.AudioSink$a r14 = r11.f13563p
            com.google.android.exoplayer2.audio.g$a r14 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r14
            com.google.android.exoplayer2.audio.g r14 = com.google.android.exoplayer2.audio.C3893g.this
            ga.x0$a r14 = r14.f13610f1
            if (r14 == 0) goto L_0x017f
            r14.mo20475b(r4)
        L_0x017f:
            com.google.android.exoplayer2.audio.e$c r14 = r11.f13565r
            int r14 = r14.f13578c
            if (r14 != 0) goto L_0x018b
            long r4 = r11.f13523B
            long r6 = (long) r13
            long r4 = r4 + r6
            r11.f13523B = r4
        L_0x018b:
            if (r13 != r0) goto L_0x01a6
            if (r14 == 0) goto L_0x01a4
            java.nio.ByteBuffer r13 = r11.f13532K
            if (r12 != r13) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            p583jk.C17875h.m44304o(r2)
            long r12 = r11.f13524C
            int r14 = r11.f13525D
            int r0 = r11.f13533L
            int r14 = r14 * r0
            long r2 = (long) r14
            long r12 = r12 + r2
            r11.f13524C = r12
        L_0x01a4:
            r11.f13534M = r1
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15903K(java.nio.ByteBuffer, long):void");
    }

    /* renamed from: a */
    public final void mo15847a(C4932s0 s0Var) {
        C4932s0 s0Var2 = new C4932s0(C6774a0.m15946f(s0Var.f16696a, 0.1f, 8.0f), C6774a0.m15946f(s0Var.f16697b, 0.1f, 8.0f));
        if (!this.f13558k || C6774a0.f20959a < 23) {
            mo15898F(s0Var2, mo15906w().f13589b);
        } else {
            mo15899G(s0Var2);
        }
    }

    /* renamed from: b */
    public final C4932s0 mo15848b() {
        if (this.f13558k) {
            return this.f13570w;
        }
        return mo15906w().f13588a;
    }

    /* renamed from: c */
    public final boolean mo15849c(Format format) {
        return mo15858k(format) != 0;
    }

    /* renamed from: d */
    public final boolean mo15850d() {
        return !mo15894A() || (this.f13538Q && !mo15851e());
    }

    /* renamed from: e */
    public final boolean mo15851e() {
        if (!mo15894A() || !this.f13556i.mo15882b(mo15908y())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo15852f(C5326l lVar) {
        if (!this.f13543V.equals(lVar)) {
            int i = lVar.f17546a;
            float f = lVar.f17547b;
            AudioTrack audioTrack = this.f13566s;
            if (audioTrack != null) {
                if (this.f13543V.f17546a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f13566s.setAuxEffectSendLevel(f);
                }
            }
            this.f13543V = lVar;
        }
    }

    public final void flush() {
        boolean z;
        if (mo15894A()) {
            mo15897E();
            AudioTrack audioTrack = this.f13556i.f13489c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f13566s.pause();
            }
            if (m10269B(this.f13566s)) {
                C3890h hVar = this.f13560m;
                hVar.getClass();
                this.f13566s.unregisterStreamEventCallback(hVar.f13596b);
                hVar.f13595a.removeCallbacksAndMessages((Object) null);
            }
            AudioTrack audioTrack2 = this.f13566s;
            this.f13566s = null;
            if (C6774a0.f20959a < 21 && !this.f13541T) {
                this.f13542U = 0;
            }
            C3885c cVar = this.f13564q;
            if (cVar != null) {
                this.f13565r = cVar;
                this.f13564q = null;
            }
            C3878b bVar = this.f13556i;
            bVar.f13498l = 0;
            bVar.f13509w = 0;
            bVar.f13508v = 0;
            bVar.f13499m = 0;
            bVar.f13483C = 0;
            bVar.f13486F = 0;
            bVar.f13497k = false;
            bVar.f13489c = null;
            bVar.f13492f = null;
            this.f13555h.close();
            new C3883a(audioTrack2).start();
        }
        this.f13562o.f13592a = null;
        this.f13561n.f13592a = null;
    }

    /* renamed from: g */
    public final void mo15854g(int i) {
        boolean z;
        if (this.f13542U != i) {
            this.f13542U = i;
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f13541T = z;
            flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1 != false) goto L_0x0037;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15855h(com.google.android.exoplayer2.Format r13, int[] r14) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
        /*
            r12 = this;
            java.lang.String r0 = r13.f13418m
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r0)
            r1 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x00a3
            int r0 = r13.f13401B
            boolean r0 = p277ub.C6774a0.m15963w(r0)
            p583jk.C17875h.m44301k(r0)
            int r0 = r13.f13401B
            int r1 = r13.f13431z
            int r0 = p277ub.C6774a0.m15956p(r0, r1)
            int r1 = r13.f13401B
            boolean r5 = r12.f13550c
            if (r5 == 0) goto L_0x0036
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r5) goto L_0x0032
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r5) goto L_0x0032
            r5 = 4
            if (r1 != r5) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r1 = 0
            goto L_0x0033
        L_0x0032:
            r1 = 1
        L_0x0033:
            if (r1 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x003c
            com.google.android.exoplayer2.audio.AudioProcessor[] r1 = r12.f13554g
            goto L_0x003e
        L_0x003c:
            com.google.android.exoplayer2.audio.AudioProcessor[] r1 = r12.f13553f
        L_0x003e:
            com.google.android.exoplayer2.audio.k r3 = r12.f13552e
            int r5 = r13.f13402C
            int r6 = r13.f13403D
            r3.f13639i = r5
            r3.f13640j = r6
            int r3 = p277ub.C6774a0.f20959a
            r5 = 21
            if (r3 >= r5) goto L_0x0061
            int r3 = r13.f13431z
            r5 = 8
            if (r3 != r5) goto L_0x0061
            if (r14 != 0) goto L_0x0061
            r3 = 6
            int[] r5 = new int[r3]
            r6 = 0
        L_0x005a:
            if (r6 >= r3) goto L_0x0062
            r5[r6] = r6
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0061:
            r5 = r14
        L_0x0062:
            com.google.android.exoplayer2.audio.d r3 = r12.f13551d
            r3.f13520i = r5
            com.google.android.exoplayer2.audio.AudioProcessor$a r3 = new com.google.android.exoplayer2.audio.AudioProcessor$a
            int r5 = r13.f13400A
            int r6 = r13.f13431z
            int r7 = r13.f13401B
            r3.<init>(r5, r6, r7)
            int r5 = r1.length
            r6 = 0
        L_0x0073:
            if (r6 >= r5) goto L_0x008c
            r7 = r1[r6]
            com.google.android.exoplayer2.audio.AudioProcessor$a r8 = r7.mo15842g(r3)     // Catch:{ UnhandledAudioFormatException -> 0x0085 }
            boolean r7 = r7.isActive()     // Catch:{ UnhandledAudioFormatException -> 0x0085 }
            if (r7 == 0) goto L_0x0082
            r3 = r8
        L_0x0082:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0085:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r1 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            r1.<init>((com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException) r0, (com.google.android.exoplayer2.Format) r13)
            throw r1
        L_0x008c:
            int r5 = r3.f13477c
            int r6 = r3.f13475a
            int r7 = r3.f13476b
            int r7 = p277ub.C6774a0.m15952l(r7)
            int r3 = r3.f13476b
            int r3 = p277ub.C6774a0.m15956p(r5, r3)
            r10 = r1
            r8 = r5
            r5 = r3
            r3 = r0
            r0 = r7
            r7 = 0
            goto L_0x00e6
        L_0x00a3:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r4]
            int r5 = r13.f13400A
            ia.d r6 = r12.f13567t
            boolean r6 = r12.mo15902J(r13, r6)
            if (r6 == 0) goto L_0x00c8
            java.lang.String r6 = r13.f13418m
            r6.getClass()
            java.lang.String r7 = r13.f13415j
            int r6 = p277ub.C6792n.m15989b(r6, r7)
            int r7 = r13.f13431z
            int r7 = p277ub.C6774a0.m15952l(r7)
            r10 = r0
            r8 = r6
            r0 = r7
            r3 = -1
            r7 = 1
        L_0x00c5:
            r6 = r5
            r5 = -1
            goto L_0x00e6
        L_0x00c8:
            ia.e r3 = r12.f13548a
            android.util.Pair r3 = m10271v(r13, r3)
            if (r3 == 0) goto L_0x0153
            java.lang.Object r6 = r3.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r7 = 2
            r10 = r0
            r0 = r3
            r8 = r6
            r3 = -1
            goto L_0x00c5
        L_0x00e6:
            java.lang.String r1 = ") for: "
            if (r8 == 0) goto L_0x012c
            if (r0 == 0) goto L_0x0105
            r12.f13546Y = r4
            com.google.android.exoplayer2.audio.e$c r11 = new com.google.android.exoplayer2.audio.e$c
            boolean r9 = r12.f13558k
            r1 = r11
            r2 = r13
            r4 = r7
            r7 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = r12.mo15894A()
            if (r0 == 0) goto L_0x0102
            r12.f13564q = r11
            goto L_0x0104
        L_0x0102:
            r12.f13565r = r11
        L_0x0104:
            return
        L_0x0105:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r3 = java.lang.String.valueOf(r13)
            int r4 = r3.length()
            int r4 = r4 + 54
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Invalid output channel config (mode="
            r5.append(r4)
            r5.append(r7)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r0.<init>((java.lang.String) r1, (com.google.android.exoplayer2.Format) r13)
            throw r0
        L_0x012c:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r3 = java.lang.String.valueOf(r13)
            int r4 = r3.length()
            int r4 = r4 + 48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Invalid output encoding (mode="
            r5.append(r4)
            r5.append(r7)
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            r0.<init>((java.lang.String) r1, (com.google.android.exoplayer2.Format) r13)
            throw r0
        L_0x0153:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r1 = java.lang.String.valueOf(r13)
            int r3 = r1.length()
            int r3 = r3 + 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unable to configure passthrough for: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>((java.lang.String) r1, (com.google.android.exoplayer2.Format) r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15855h(com.google.android.exoplayer2.Format, int[]):void");
    }

    /* renamed from: i */
    public final void mo15856i() {
        if (this.f13544W) {
            this.f13544W = false;
            flush();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0286, code lost:
        r8 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        if (r5.mo15881a() == 0) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0107 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0108  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15857j(java.nio.ByteBuffer r18, long r19, int r21) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r4 = r21
            java.nio.ByteBuffer r5 = r1.f13532K
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0013
            if (r0 != r5) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r5 = 0
            goto L_0x0014
        L_0x0013:
            r5 = 1
        L_0x0014:
            p583jk.C17875h.m44301k(r5)
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13564q
            r8 = 0
            if (r5 == 0) goto L_0x0080
            boolean r5 = r17.mo15905t()
            if (r5 != 0) goto L_0x0023
            return r6
        L_0x0023:
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13564q
            com.google.android.exoplayer2.audio.e$c r9 = r1.f13565r
            r5.getClass()
            int r10 = r9.f13578c
            int r11 = r5.f13578c
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f13582g
            int r11 = r5.f13582g
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f13580e
            int r11 = r5.f13580e
            if (r10 != r11) goto L_0x004a
            int r10 = r9.f13581f
            int r11 = r5.f13581f
            if (r10 != r11) goto L_0x004a
            int r9 = r9.f13579d
            int r5 = r5.f13579d
            if (r9 != r5) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 != 0) goto L_0x005b
            r17.mo15895C()
            boolean r5 = r17.mo15851e()
            if (r5 == 0) goto L_0x0057
            return r6
        L_0x0057:
            r17.flush()
            goto L_0x007d
        L_0x005b:
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13564q
            r1.f13565r = r5
            r1.f13564q = r8
            android.media.AudioTrack r5 = r1.f13566s
            boolean r5 = m10269B(r5)
            if (r5 == 0) goto L_0x007d
            android.media.AudioTrack r5 = r1.f13566s
            r5.setOffloadEndOfStream()
            android.media.AudioTrack r5 = r1.f13566s
            com.google.android.exoplayer2.audio.e$c r9 = r1.f13565r
            com.google.android.exoplayer2.Format r9 = r9.f13576a
            int r10 = r9.f13402C
            int r9 = r9.f13403D
            r5.setOffloadDelayPadding(r10, r9)
            r1.f13547Z = r7
        L_0x007d:
            r1.mo15904s(r2)
        L_0x0080:
            boolean r5 = r17.mo15894A()
            if (r5 != 0) goto L_0x0097
            r17.mo15909z()     // Catch:{ InitializationException -> 0x008a }
            goto L_0x0097
        L_0x008a:
            r0 = move-exception
            r2 = r0
            boolean r0 = r2.isRecoverable
            if (r0 != 0) goto L_0x0096
            com.google.android.exoplayer2.audio.e$f<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r0 = r1.f13561n
            r0.mo15918a(r2)
            return r6
        L_0x0096:
            throw r2
        L_0x0097:
            com.google.android.exoplayer2.audio.e$f<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r5 = r1.f13561n
            r5.f13592a = r8
            boolean r5 = r1.f13527F
            r8 = 0
            if (r5 == 0) goto L_0x00c4
            long r10 = java.lang.Math.max(r8, r2)
            r1.f13528G = r10
            r1.f13526E = r6
            r1.f13527F = r6
            boolean r5 = r1.f13558k
            if (r5 == 0) goto L_0x00ba
            int r5 = p277ub.C6774a0.f20959a
            r10 = 23
            if (r5 < r10) goto L_0x00ba
            ga.s0 r5 = r1.f13570w
            r1.mo15899G(r5)
        L_0x00ba:
            r1.mo15904s(r2)
            boolean r5 = r1.f13540S
            if (r5 == 0) goto L_0x00c4
            r17.mo15863p()
        L_0x00c4:
            com.google.android.exoplayer2.audio.b r5 = r1.f13556i
            long r10 = r17.mo15908y()
            android.media.AudioTrack r12 = r5.f13489c
            r12.getClass()
            int r12 = r12.getPlayState()
            boolean r13 = r5.f13494h
            r14 = 2
            if (r13 == 0) goto L_0x00e9
            if (r12 != r14) goto L_0x00dd
            r5.f13502p = r6
            goto L_0x00e7
        L_0x00dd:
            if (r12 != r7) goto L_0x00e9
            long r15 = r5.mo15881a()
            int r13 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r13 != 0) goto L_0x00e9
        L_0x00e7:
            r5 = 0
            goto L_0x0105
        L_0x00e9:
            boolean r8 = r5.f13502p
            boolean r9 = r5.mo15882b(r10)
            r5.f13502p = r9
            if (r8 == 0) goto L_0x0104
            if (r9 != 0) goto L_0x0104
            if (r12 == r7) goto L_0x0104
            com.google.android.exoplayer2.audio.b$a r8 = r5.f13487a
            int r9 = r5.f13491e
            long r10 = r5.f13495i
            long r10 = p099ga.C4883f.m12377b(r10)
            r8.mo15884a(r9, r10)
        L_0x0104:
            r5 = 1
        L_0x0105:
            if (r5 != 0) goto L_0x0108
            return r6
        L_0x0108:
            java.nio.ByteBuffer r5 = r1.f13532K
            if (r5 != 0) goto L_0x031e
            java.nio.ByteOrder r5 = r18.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r8) goto L_0x0116
            r5 = 1
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            p583jk.C17875h.m44301k(r5)
            boolean r5 = r18.hasRemaining()
            if (r5 != 0) goto L_0x0121
            return r7
        L_0x0121:
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13565r
            int r8 = r5.f13578c
            if (r8 == 0) goto L_0x028f
            int r8 = r1.f13525D
            if (r8 != 0) goto L_0x028f
            int r5 = r5.f13582g
            r8 = 1024(0x400, float:1.435E-42)
            r9 = -2
            r10 = 16
            r11 = -1
            switch(r5) {
                case 5: goto L_0x024a;
                case 6: goto L_0x024a;
                case 7: goto L_0x01ef;
                case 8: goto L_0x01ef;
                case 9: goto L_0x01ca;
                case 10: goto L_0x028a;
                case 11: goto L_0x01c6;
                case 12: goto L_0x01c6;
                case 13: goto L_0x0136;
                case 14: goto L_0x0161;
                case 15: goto L_0x015d;
                case 16: goto L_0x028a;
                case 17: goto L_0x0144;
                case 18: goto L_0x024a;
                default: goto L_0x0136;
            }
        L_0x0136:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = 38
            java.lang.String r3 = "Unexpected audio encoding: "
            java.lang.String r2 = p379.C13715c.m34241g(r2, r3, r5)
            r0.<init>(r2)
            throw r0
        L_0x0144:
            byte[] r5 = new byte[r10]
            int r8 = r18.position()
            r0.get(r5)
            r0.position(r8)
            ub.q r8 = new ub.q
            r8.<init>(r5, r10)
            ia.c$a r5 = p125ia.C5314c.m13355b(r8)
            int r8 = r5.f17510c
            goto L_0x028a
        L_0x015d:
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x028a
        L_0x0161:
            int r5 = r18.position()
            int r8 = r18.limit()
            int r8 = r8 + -10
            r9 = r5
        L_0x016c:
            if (r9 > r8) goto L_0x018f
            int r10 = r9 + 4
            int r12 = p277ub.C6774a0.f20959a
            int r10 = r0.getInt(r10)
            java.nio.ByteOrder r12 = r18.order()
            java.nio.ByteOrder r13 = java.nio.ByteOrder.BIG_ENDIAN
            if (r12 != r13) goto L_0x017f
            goto L_0x0183
        L_0x017f:
            int r10 = java.lang.Integer.reverseBytes(r10)
        L_0x0183:
            r10 = r10 & -2
            r12 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r10 != r12) goto L_0x018c
            int r9 = r9 - r5
            goto L_0x0190
        L_0x018c:
            int r9 = r9 + 1
            goto L_0x016c
        L_0x018f:
            r9 = -1
        L_0x0190:
            if (r9 != r11) goto L_0x0195
            r8 = 0
            goto L_0x028a
        L_0x0195:
            int r5 = r18.position()
            int r5 = r5 + r9
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r8 = 187(0xbb, float:2.62E-43)
            if (r5 != r8) goto L_0x01a8
            r5 = 1
            goto L_0x01a9
        L_0x01a8:
            r5 = 0
        L_0x01a9:
            r8 = 40
            int r10 = r18.position()
            int r10 = r10 + r9
            if (r5 == 0) goto L_0x01b5
            r5 = 9
            goto L_0x01b7
        L_0x01b5:
            r5 = 8
        L_0x01b7:
            int r10 = r10 + r5
            byte r5 = r0.get(r10)
            int r5 = r5 >> 4
            r5 = r5 & 7
            int r5 = r8 << r5
            int r5 = r5 * 16
            goto L_0x0286
        L_0x01c6:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x028a
        L_0x01ca:
            int r5 = r18.position()
            int r8 = p277ub.C6774a0.f20959a
            int r5 = r0.getInt(r5)
            java.nio.ByteOrder r8 = r18.order()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            if (r8 != r9) goto L_0x01dd
            goto L_0x01e1
        L_0x01dd:
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x01e1:
            int r8 = p125ia.C5329o.m13363b(r5)
            if (r8 == r11) goto L_0x01e9
            goto L_0x028a
        L_0x01e9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x01ef:
            int r5 = r18.position()
            byte r8 = r0.get(r5)
            if (r8 == r9) goto L_0x0233
            if (r8 == r11) goto L_0x0220
            r9 = 31
            if (r8 == r9) goto L_0x020f
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & r7
            int r8 = r8 << 6
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            goto L_0x0242
        L_0x020f:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 6
            byte r5 = r0.get(r5)
            goto L_0x0230
        L_0x0220:
            int r8 = r5 + 4
            byte r8 = r0.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
        L_0x0230:
            r5 = r5 & 60
            goto L_0x0244
        L_0x0233:
            int r8 = r5 + 5
            byte r8 = r0.get(r8)
            r8 = r8 & r7
            int r8 = r8 << 6
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
        L_0x0242:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x0244:
            int r5 = r5 >> r14
            r5 = r5 | r8
            int r5 = r5 + r7
            int r8 = r5 * 32
            goto L_0x028a
        L_0x024a:
            int r5 = r18.position()
            int r5 = r5 + 5
            byte r5 = r0.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            r8 = 3
            int r5 = r5 >> r8
            r9 = 10
            if (r5 <= r9) goto L_0x025e
            r5 = 1
            goto L_0x025f
        L_0x025e:
            r5 = 0
        L_0x025f:
            if (r5 == 0) goto L_0x0288
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> 6
            if (r5 != r8) goto L_0x0272
            goto L_0x0280
        L_0x0272:
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 48
            int r8 = r5 >> 4
        L_0x0280:
            int[] r5 = p125ia.C5313b.f17501a
            r5 = r5[r8]
            int r5 = r5 * 256
        L_0x0286:
            r8 = r5
            goto L_0x028a
        L_0x0288:
            r8 = 1536(0x600, float:2.152E-42)
        L_0x028a:
            r1.f13525D = r8
            if (r8 != 0) goto L_0x028f
            return r7
        L_0x028f:
            com.google.android.exoplayer2.audio.e$e r5 = r1.f13568u
            if (r5 == 0) goto L_0x02a0
            boolean r5 = r17.mo15905t()
            if (r5 != 0) goto L_0x029a
            return r6
        L_0x029a:
            r1.mo15904s(r2)
            r5 = 0
            r1.f13568u = r5
        L_0x02a0:
            long r8 = r1.f13528G
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13565r
            long r10 = r17.mo15907x()
            com.google.android.exoplayer2.audio.k r12 = r1.f13552e
            long r12 = r12.f13645o
            long r10 = r10 - r12
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r10 * r12
            com.google.android.exoplayer2.Format r5 = r5.f13576a
            int r5 = r5.f13400A
            long r12 = (long) r5
            long r10 = r10 / r12
            long r10 = r10 + r8
            boolean r5 = r1.f13526E
            if (r5 != 0) goto L_0x02d8
            long r8 = r10 - r2
            long r8 = java.lang.Math.abs(r8)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r5 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d8
            com.google.android.exoplayer2.audio.AudioSink$a r5 = r1.f13563p
            com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException r8 = new com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException
            r8.<init>(r2, r10)
            com.google.android.exoplayer2.audio.g$a r5 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r5
            r5.mo15944a(r8)
            r1.f13526E = r7
        L_0x02d8:
            boolean r5 = r1.f13526E
            if (r5 == 0) goto L_0x02ff
            boolean r5 = r17.mo15905t()
            if (r5 != 0) goto L_0x02e3
            return r6
        L_0x02e3:
            long r8 = r2 - r10
            long r10 = r1.f13528G
            long r10 = r10 + r8
            r1.f13528G = r10
            r1.f13526E = r6
            r1.mo15904s(r2)
            com.google.android.exoplayer2.audio.AudioSink$a r5 = r1.f13563p
            if (r5 == 0) goto L_0x02ff
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x02ff
            com.google.android.exoplayer2.audio.g$a r5 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r5
            com.google.android.exoplayer2.audio.g r5 = com.google.android.exoplayer2.audio.C3893g.this
            r5.f13608d1 = r7
        L_0x02ff:
            com.google.android.exoplayer2.audio.e$c r5 = r1.f13565r
            int r5 = r5.f13578c
            if (r5 != 0) goto L_0x0310
            long r8 = r1.f13573z
            int r5 = r18.remaining()
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f13573z = r8
            goto L_0x031a
        L_0x0310:
            long r8 = r1.f13522A
            int r5 = r1.f13525D
            int r5 = r5 * r4
            long r10 = (long) r5
            long r8 = r8 + r10
            r1.f13522A = r8
        L_0x031a:
            r1.f13532K = r0
            r1.f13533L = r4
        L_0x031e:
            r1.mo15896D(r2)
            java.nio.ByteBuffer r0 = r1.f13532K
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x032f
            r0 = 0
            r1.f13532K = r0
            r1.f13533L = r6
            return r7
        L_0x032f:
            com.google.android.exoplayer2.audio.b r0 = r1.f13556i
            long r2 = r17.mo15908y()
            long r4 = r0.f13511y
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0355
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0355
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.f13511y
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0355
            r0 = 1
            goto L_0x0356
        L_0x0355:
            r0 = 0
        L_0x0356:
            if (r0 == 0) goto L_0x035c
            r17.flush()
            return r7
        L_0x035c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15857j(java.nio.ByteBuffer, long, int):boolean");
    }

    /* renamed from: k */
    public final int mo15858k(Format format) {
        boolean z = true;
        if ("audio/raw".equals(format.f13418m)) {
            if (!C6774a0.m15963w(format.f13401B)) {
                return 0;
            }
            int i = format.f13401B;
            if (i == 2 || (this.f13550c && i == 4)) {
                return 2;
            }
            return 1;
        } else if (!this.f13546Y && mo15902J(format, this.f13567t)) {
            return 2;
        } else {
            if (m10271v(format, this.f13548a) == null) {
                z = false;
            }
            if (z) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: l */
    public final void mo15859l() throws AudioSink.WriteException {
        if (!this.f13538Q && mo15894A() && mo15905t()) {
            mo15895C();
            this.f13538Q = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ae A[Catch:{ Exception -> 0x01b8 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15860m(boolean r29) {
        /*
            r28 = this;
            r0 = r28
            boolean r1 = r28.mo15894A()
            if (r1 == 0) goto L_0x0308
            boolean r1 = r0.f13527F
            if (r1 == 0) goto L_0x000e
            goto L_0x0308
        L_0x000e:
            com.google.android.exoplayer2.audio.b r1 = r0.f13556i
            android.media.AudioTrack r2 = r1.f13489c
            r2.getClass()
            int r2 = r2.getPlayState()
            r3 = 2
            r4 = 3
            r9 = 1
            r11 = 0
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r2 != r4) goto L_0x01bd
            long r17 = r1.mo15881a()
            long r17 = r17 * r13
            int r2 = r1.f13493g
            long r5 = (long) r2
            long r26 = r17 / r5
            int r2 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0036
            goto L_0x01bd
        L_0x0036:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 / r15
            long r7 = r1.f13499m
            long r7 = r5 - r7
            r19 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            long[] r2 = r1.f13488b
            int r7 = r1.f13508v
            long r19 = r26 - r5
            r2[r7] = r19
            int r7 = r7 + r9
            r2 = 10
            int r7 = r7 % r2
            r1.f13508v = r7
            int r7 = r1.f13509w
            if (r7 >= r2) goto L_0x005a
            int r7 = r7 + r9
            r1.f13509w = r7
        L_0x005a:
            r1.f13499m = r5
            r1.f13498l = r11
            r2 = 0
        L_0x005f:
            int r7 = r1.f13509w
            if (r2 >= r7) goto L_0x0075
            long r11 = r1.f13498l
            long[] r8 = r1.f13488b
            r19 = r8[r2]
            long r7 = (long) r7
            long r19 = r19 / r7
            long r7 = r19 + r11
            r1.f13498l = r7
            int r2 = r2 + 1
            r11 = 0
            goto L_0x005f
        L_0x0075:
            boolean r2 = r1.f13494h
            if (r2 == 0) goto L_0x007b
            goto L_0x01bd
        L_0x007b:
            ia.k r2 = r1.f13492f
            r2.getClass()
            ia.k$a r7 = r2.f17535a
            r8 = 4
            if (r7 == 0) goto L_0x0113
            long r13 = r2.f17539e
            long r13 = r5 - r13
            long r10 = r2.f17538d
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0091
            goto L_0x0113
        L_0x0091:
            r2.f17539e = r5
            android.media.AudioTrack r10 = r7.f17541a
            android.media.AudioTimestamp r11 = r7.f17542b
            boolean r10 = r10.getTimestamp(r11)
            if (r10 == 0) goto L_0x00ba
            android.media.AudioTimestamp r11 = r7.f17542b
            long r11 = r11.framePosition
            long r13 = r7.f17544d
            int r19 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r19 <= 0) goto L_0x00af
            long r13 = r7.f17543c
            r19 = 1
            long r13 = r13 + r19
            r7.f17543c = r13
        L_0x00af:
            r7.f17544d = r11
            long r13 = r7.f17543c
            r19 = 32
            long r13 = r13 << r19
            long r11 = r11 + r13
            r7.f17545e = r11
        L_0x00ba:
            int r7 = r2.f17536b
            if (r7 == 0) goto L_0x00ed
            if (r7 == r9) goto L_0x00d9
            if (r7 == r3) goto L_0x00d3
            if (r7 == r4) goto L_0x00cd
            if (r7 != r8) goto L_0x00c7
            goto L_0x0114
        L_0x00c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00cd:
            if (r10 == 0) goto L_0x0114
            r2.mo21105a()
            goto L_0x0114
        L_0x00d3:
            if (r10 != 0) goto L_0x0114
            r2.mo21105a()
            goto L_0x0114
        L_0x00d9:
            if (r10 == 0) goto L_0x00e9
            ia.k$a r4 = r2.f17535a
            long r11 = r4.f17545e
            long r13 = r2.f17540f
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0114
            r2.mo21106b(r3)
            goto L_0x0114
        L_0x00e9:
            r2.mo21105a()
            goto L_0x0114
        L_0x00ed:
            if (r10 == 0) goto L_0x0104
            ia.k$a r4 = r2.f17535a
            android.media.AudioTimestamp r7 = r4.f17542b
            long r11 = r7.nanoTime
            long r11 = r11 / r15
            long r13 = r2.f17537c
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x0113
            long r11 = r4.f17545e
            r2.f17540f = r11
            r2.mo21106b(r9)
            goto L_0x0114
        L_0x0104:
            long r11 = r2.f17537c
            long r11 = r5 - r11
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x0114
            r2.mo21106b(r4)
            goto L_0x0114
        L_0x0113:
            r10 = 0
        L_0x0114:
            r11 = 5000000(0x4c4b40, double:2.470328E-317)
            if (r10 != 0) goto L_0x011a
            goto L_0x0173
        L_0x011a:
            ia.k$a r4 = r2.f17535a
            if (r4 == 0) goto L_0x0126
            android.media.AudioTimestamp r7 = r4.f17542b
            long r13 = r7.nanoTime
            long r13 = r13 / r15
            r22 = r13
            goto L_0x012b
        L_0x0126:
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x012b:
            if (r4 == 0) goto L_0x0132
            long r13 = r4.f17545e
            r20 = r13
            goto L_0x0134
        L_0x0132:
            r20 = -1
        L_0x0134:
            long r13 = r22 - r5
            long r13 = java.lang.Math.abs(r13)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x014b
            com.google.android.exoplayer2.audio.b$a r4 = r1.f13487a
            r19 = r4
            r24 = r5
            r19.mo15887d(r20, r22, r24, r26)
            r2.mo21106b(r8)
            goto L_0x0173
        L_0x014b:
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r20 * r13
            int r4 = r1.f13493g
            long r13 = (long) r4
            long r24 = r24 / r13
            long r24 = r24 - r26
            long r13 = java.lang.Math.abs(r24)
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x016c
            com.google.android.exoplayer2.audio.b$a r4 = r1.f13487a
            r19 = r4
            r24 = r5
            r19.mo15886c(r20, r22, r24, r26)
            r2.mo21106b(r8)
            goto L_0x0173
        L_0x016c:
            int r4 = r2.f17536b
            if (r4 != r8) goto L_0x0173
            r2.mo21105a()
        L_0x0173:
            boolean r2 = r1.f13503q
            if (r2 == 0) goto L_0x01bd
            java.lang.reflect.Method r2 = r1.f13500n
            if (r2 == 0) goto L_0x01bd
            long r7 = r1.f13504r
            long r7 = r5 - r7
            r13 = 500000(0x7a120, double:2.47033E-318)
            int r4 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x01bd
            android.media.AudioTrack r4 = r1.f13489c     // Catch:{ Exception -> 0x01b8 }
            r4.getClass()     // Catch:{ Exception -> 0x01b8 }
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x01b8 }
            java.lang.Object r2 = r2.invoke(r4, r8)     // Catch:{ Exception -> 0x01b8 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x01b8 }
            int r4 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x01b8 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x01b8 }
            long r13 = (long) r2     // Catch:{ Exception -> 0x01b8 }
            long r13 = r13 * r15
            long r7 = r1.f13495i     // Catch:{ Exception -> 0x01b8 }
            long r13 = r13 - r7
            r1.f13501o = r13     // Catch:{ Exception -> 0x01b8 }
            r7 = 0
            long r13 = java.lang.Math.max(r13, r7)     // Catch:{ Exception -> 0x01b8 }
            r1.f13501o = r13     // Catch:{ Exception -> 0x01b8 }
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x01bb
            com.google.android.exoplayer2.audio.b$a r2 = r1.f13487a     // Catch:{ Exception -> 0x01b8 }
            r2.mo15888e()     // Catch:{ Exception -> 0x01b8 }
            r7 = 0
            r1.f13501o = r7     // Catch:{ Exception -> 0x01b8 }
            goto L_0x01bb
        L_0x01b8:
            r2 = 0
            r1.f13500n = r2
        L_0x01bb:
            r1.f13504r = r5
        L_0x01bd:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 / r15
            ia.k r2 = r1.f13492f
            r2.getClass()
            int r6 = r2.f17536b
            if (r6 != r3) goto L_0x01cd
            r10 = 1
            goto L_0x01ce
        L_0x01cd:
            r10 = 0
        L_0x01ce:
            if (r10 == 0) goto L_0x01f9
            ia.k$a r2 = r2.f17535a
            if (r2 == 0) goto L_0x01d7
            long r7 = r2.f17545e
            goto L_0x01d9
        L_0x01d7:
            r7 = -1
        L_0x01d9:
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r11
            int r3 = r1.f13493g
            long r11 = (long) r3
            long r7 = r7 / r11
            if (r2 == 0) goto L_0x01ea
            android.media.AudioTimestamp r2 = r2.f17542b
            long r2 = r2.nanoTime
            long r2 = r2 / r15
            goto L_0x01ef
        L_0x01ea:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01ef:
            long r2 = r4 - r2
            float r6 = r1.f13496j
            long r2 = p277ub.C6774a0.m15954n(r2, r6)
            long r2 = r2 + r7
            goto L_0x0219
        L_0x01f9:
            int r2 = r1.f13509w
            if (r2 != 0) goto L_0x020b
            long r2 = r1.mo15881a()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r6
            int r6 = r1.f13493g
            long r6 = (long) r6
            long r2 = r2 / r6
            goto L_0x020e
        L_0x020b:
            long r2 = r1.f13498l
            long r2 = r2 + r4
        L_0x020e:
            if (r29 != 0) goto L_0x0219
            long r6 = r1.f13501o
            long r2 = r2 - r6
            r6 = 0
            long r2 = java.lang.Math.max(r6, r2)
        L_0x0219:
            boolean r6 = r1.f13484D
            if (r6 == r10) goto L_0x0225
            long r6 = r1.f13483C
            r1.f13486F = r6
            long r6 = r1.f13482B
            r1.f13485E = r6
        L_0x0225:
            long r6 = r1.f13486F
            long r6 = r4 - r6
            r11 = 1000000(0xf4240, double:4.940656E-318)
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0246
            long r13 = r1.f13485E
            float r8 = r1.f13496j
            long r17 = p277ub.C6774a0.m15954n(r6, r8)
            long r17 = r17 + r13
            long r6 = r6 * r15
            long r6 = r6 / r11
            long r2 = r2 * r6
            long r6 = r15 - r6
            long r6 = r6 * r17
            long r6 = r6 + r2
            long r2 = r6 / r15
        L_0x0246:
            boolean r6 = r1.f13497k
            if (r6 != 0) goto L_0x0278
            long r6 = r1.f13482B
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0278
            r1.f13497k = r9
            long r6 = r2 - r6
            long r6 = p099ga.C4883f.m12377b(r6)
            float r8 = r1.f13496j
            int r9 = p277ub.C6774a0.f20959a
            r9 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0263
            goto L_0x026a
        L_0x0263:
            double r6 = (double) r6
            double r8 = (double) r8
            double r6 = r6 / r8
            long r6 = java.lang.Math.round(r6)
        L_0x026a:
            long r8 = java.lang.System.currentTimeMillis()
            long r6 = p099ga.C4883f.m12377b(r6)
            long r8 = r8 - r6
            com.google.android.exoplayer2.audio.b$a r6 = r1.f13487a
            r6.mo15885b(r8)
        L_0x0278:
            r1.f13483C = r4
            r1.f13482B = r2
            r1.f13484D = r10
            com.google.android.exoplayer2.audio.e$c r1 = r0.f13565r
            long r4 = r28.mo15908y()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r1 = r1.f13580e
            long r6 = (long) r1
            long r4 = r4 / r6
            long r1 = java.lang.Math.min(r2, r4)
        L_0x0291:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r3 = r0.f13557j
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02b2
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r3 = r0.f13557j
            java.lang.Object r3 = r3.getFirst()
            com.google.android.exoplayer2.audio.e$e r3 = (com.google.android.exoplayer2.audio.C3882e.C3887e) r3
            long r3 = r3.f13591d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x02b2
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r3 = r0.f13557j
            java.lang.Object r3 = r3.remove()
            com.google.android.exoplayer2.audio.e$e r3 = (com.google.android.exoplayer2.audio.C3882e.C3887e) r3
            r0.f13569v = r3
            goto L_0x0291
        L_0x02b2:
            com.google.android.exoplayer2.audio.e$e r3 = r0.f13569v
            long r4 = r3.f13591d
            long r4 = r1 - r4
            ga.s0 r3 = r3.f13588a
            ga.s0 r6 = p099ga.C4932s0.f16695d
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x02c8
            com.google.android.exoplayer2.audio.e$e r1 = r0.f13569v
            long r1 = r1.f13590c
            long r1 = r1 + r4
            goto L_0x02f5
        L_0x02c8:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r3 = r0.f13557j
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x02dc
            com.google.android.exoplayer2.audio.e$b r1 = r0.f13549b
            long r1 = r1.mo15911a(r4)
            com.google.android.exoplayer2.audio.e$e r3 = r0.f13569v
            long r3 = r3.f13590c
            long r1 = r1 + r3
            goto L_0x02f5
        L_0x02dc:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r3 = r0.f13557j
            java.lang.Object r3 = r3.getFirst()
            com.google.android.exoplayer2.audio.e$e r3 = (com.google.android.exoplayer2.audio.C3882e.C3887e) r3
            long r4 = r3.f13591d
            long r4 = r4 - r1
            com.google.android.exoplayer2.audio.e$e r1 = r0.f13569v
            ga.s0 r1 = r1.f13588a
            float r1 = r1.f16696a
            long r1 = p277ub.C6774a0.m15954n(r4, r1)
            long r3 = r3.f13590c
            long r1 = r3 - r1
        L_0x02f5:
            com.google.android.exoplayer2.audio.e$c r3 = r0.f13565r
            com.google.android.exoplayer2.audio.e$b r4 = r0.f13549b
            long r4 = r4.mo15913c()
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            int r3 = r3.f13580e
            long r6 = (long) r3
            long r4 = r4 / r6
            long r4 = r4 + r1
            return r4
        L_0x0308:
            r1 = -9223372036854775808
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15860m(boolean):long");
    }

    /* renamed from: n */
    public final void mo15861n() {
        this.f13526E = true;
    }

    /* renamed from: o */
    public final void mo15862o() {
        boolean z;
        if (C6774a0.f20959a >= 21) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        C17875h.m44304o(this.f13541T);
        if (!this.f13544W) {
            this.f13544W = true;
            flush();
        }
    }

    /* renamed from: p */
    public final void mo15863p() {
        this.f13540S = true;
        if (mo15894A()) {
            C5324k kVar = this.f13556i.f13492f;
            kVar.getClass();
            kVar.mo21105a();
            this.f13566s.play();
        }
    }

    public final void pause() {
        boolean z = false;
        this.f13540S = false;
        if (mo15894A()) {
            C3878b bVar = this.f13556i;
            bVar.f13498l = 0;
            bVar.f13509w = 0;
            bVar.f13508v = 0;
            bVar.f13499m = 0;
            bVar.f13483C = 0;
            bVar.f13486F = 0;
            bVar.f13497k = false;
            if (bVar.f13510x == -9223372036854775807L) {
                C5324k kVar = bVar.f13492f;
                kVar.getClass();
                kVar.mo21105a();
                z = true;
            }
            if (z) {
                this.f13566s.pause();
            }
        }
    }

    /* renamed from: q */
    public final void mo15865q(boolean z) {
        mo15898F(mo15906w().f13588a, z);
    }

    /* renamed from: r */
    public final void mo15866r(C5316d dVar) {
        if (!this.f13567t.equals(dVar)) {
            this.f13567t = dVar;
            if (!this.f13544W) {
                flush();
            }
        }
    }

    public final void reset() {
        flush();
        for (AudioProcessor reset : this.f13553f) {
            reset.reset();
        }
        for (AudioProcessor reset2 : this.f13554g) {
            reset2.reset();
        }
        this.f13540S = false;
        this.f13546Y = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        r14 = ((com.google.android.exoplayer2.audio.C3893g.C3894a) r14).f13611a.f13601W0;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15904s(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.mo15901I()
            if (r0 == 0) goto L_0x0013
            com.google.android.exoplayer2.audio.e$b r0 = r13.f13549b
            com.google.android.exoplayer2.audio.e$e r1 = r13.mo15906w()
            ga.s0 r1 = r1.f13588a
            ga.s0 r0 = r0.mo15912b(r1)
            goto L_0x0015
        L_0x0013:
            ga.s0 r0 = p099ga.C4932s0.f16695d
        L_0x0015:
            r2 = r0
            boolean r0 = r13.mo15901I()
            r8 = 0
            if (r0 == 0) goto L_0x002a
            com.google.android.exoplayer2.audio.e$b r0 = r13.f13549b
            com.google.android.exoplayer2.audio.e$e r1 = r13.mo15906w()
            boolean r1 = r1.f13589b
            boolean r0 = r0.mo15914d(r1)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.util.ArrayDeque<com.google.android.exoplayer2.audio.e$e> r9 = r13.f13557j
            com.google.android.exoplayer2.audio.e$e r10 = new com.google.android.exoplayer2.audio.e$e
            r3 = 0
            long r4 = java.lang.Math.max(r3, r14)
            com.google.android.exoplayer2.audio.e$c r14 = r13.f13565r
            long r6 = r13.mo15908y()
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r11
            int r14 = r14.f13580e
            long r14 = (long) r14
            long r6 = r6 / r14
            r1 = r10
            r3 = r0
            r1.<init>(r2, r3, r4, r6)
            r9.add(r10)
            com.google.android.exoplayer2.audio.e$c r14 = r13.f13565r
            com.google.android.exoplayer2.audio.AudioProcessor[] r14 = r14.f13584i
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r1 = r14.length
            r2 = 0
        L_0x0057:
            if (r2 >= r1) goto L_0x006b
            r3 = r14[r2]
            boolean r4 = r3.isActive()
            if (r4 == 0) goto L_0x0065
            r15.add(r3)
            goto L_0x0068
        L_0x0065:
            r3.flush()
        L_0x0068:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x006b:
            int r14 = r15.size()
            com.google.android.exoplayer2.audio.AudioProcessor[] r1 = new com.google.android.exoplayer2.audio.AudioProcessor[r14]
            java.lang.Object[] r15 = r15.toArray(r1)
            com.google.android.exoplayer2.audio.AudioProcessor[] r15 = (com.google.android.exoplayer2.audio.AudioProcessor[]) r15
            r13.f13530I = r15
            java.nio.ByteBuffer[] r14 = new java.nio.ByteBuffer[r14]
            r13.f13531J = r14
            r14 = 0
        L_0x007e:
            com.google.android.exoplayer2.audio.AudioProcessor[] r15 = r13.f13530I
            int r1 = r15.length
            if (r14 >= r1) goto L_0x0093
            r15 = r15[r14]
            r15.flush()
            java.nio.ByteBuffer[] r1 = r13.f13531J
            java.nio.ByteBuffer r15 = r15.mo15839e()
            r1[r14] = r15
            int r14 = r14 + 1
            goto L_0x007e
        L_0x0093:
            com.google.android.exoplayer2.audio.AudioSink$a r14 = r13.f13563p
            if (r14 == 0) goto L_0x00a9
            com.google.android.exoplayer2.audio.g$a r14 = (com.google.android.exoplayer2.audio.C3893g.C3894a) r14
            com.google.android.exoplayer2.audio.g r14 = com.google.android.exoplayer2.audio.C3893g.this
            com.google.android.exoplayer2.audio.a$a r14 = r14.f13601W0
            android.os.Handler r15 = r14.f13479a
            if (r15 == 0) goto L_0x00a9
            ia.i r1 = new ia.i
            r1.<init>(r8, r14, r0)
            r15.post(r1)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15904s(long):void");
    }

    public final void setVolume(float f) {
        if (this.f13529H != f) {
            this.f13529H = f;
            mo15900H();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15905t() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.f13537P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f13537P = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f13537P
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f13530I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo15843h()
        L_0x001f:
            r9.mo15896D(r7)
            boolean r0 = r4.mo15838d()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f13537P
            int r0 = r0 + r2
            r9.f13537P = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f13534M
            if (r0 == 0) goto L_0x003b
            r9.mo15903K(r0, r7)
            java.nio.ByteBuffer r0 = r9.f13534M
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f13537P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3882e.mo15905t():boolean");
    }

    /* renamed from: w */
    public final C3887e mo15906w() {
        C3887e eVar = this.f13568u;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f13557j.isEmpty()) {
            return this.f13557j.getLast();
        }
        return this.f13569v;
    }

    /* renamed from: x */
    public final long mo15907x() {
        C3885c cVar = this.f13565r;
        if (cVar.f13578c == 0) {
            return this.f13573z / ((long) cVar.f13577b);
        }
        return this.f13522A;
    }

    /* renamed from: y */
    public final long mo15908y() {
        C3885c cVar = this.f13565r;
        if (cVar.f13578c == 0) {
            return this.f13523B / ((long) cVar.f13579d);
        }
        return this.f13524C;
    }

    /* renamed from: z */
    public final void mo15909z() throws AudioSink.InitializationException {
        boolean z;
        this.f13555h.block();
        boolean z2 = false;
        try {
            C3885c cVar = this.f13565r;
            cVar.getClass();
            AudioTrack a = cVar.mo15915a(this.f13544W, this.f13567t, this.f13542U);
            this.f13566s = a;
            if (m10269B(a)) {
                AudioTrack audioTrack = this.f13566s;
                if (this.f13560m == null) {
                    this.f13560m = new C3890h();
                }
                C3890h hVar = this.f13560m;
                Handler handler = hVar.f13595a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new C5327m(handler), hVar.f13596b);
                AudioTrack audioTrack2 = this.f13566s;
                Format format = this.f13565r.f13576a;
                audioTrack2.setOffloadDelayPadding(format.f13402C, format.f13403D);
            }
            this.f13542U = this.f13566s.getAudioSessionId();
            C3878b bVar = this.f13556i;
            AudioTrack audioTrack3 = this.f13566s;
            C3885c cVar2 = this.f13565r;
            if (cVar2.f13578c == 2) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo15883c(audioTrack3, z, cVar2.f13582g, cVar2.f13579d, cVar2.f13583h);
            mo15900H();
            int i = this.f13543V.f17546a;
            if (i != 0) {
                this.f13566s.attachAuxEffect(i);
                this.f13566s.setAuxEffectSendLevel(this.f13543V.f17547b);
            }
            this.f13527F = true;
        } catch (AudioSink.InitializationException e) {
            if (this.f13565r.f13578c == 1) {
                z2 = true;
            }
            if (z2) {
                this.f13546Y = true;
            }
            AudioSink.C3875a aVar = this.f13563p;
            if (aVar != null) {
                ((C3893g.C3894a) aVar).mo15944a(e);
            }
            throw e;
        }
    }
}
