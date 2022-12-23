package p100gb;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.activity.C0194b;
import androidx.camera.camera2.internal.C0509c;
import bh0.C21060a;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.C3915c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.C3997b;
import com.google.android.exoplayer2.upstream.C4076a;
import com.google.android.exoplayer2.upstream.Loader;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p054d0.C4268a1;
import p100gb.C4956a0;
import p100gb.C4976h;
import p100gb.C4984m;
import p100gb.C4995u;
import p161la.C5653b;
import p173ma.C5737j;
import p173ma.C5749s;
import p173ma.C5750t;
import p173ma.C5754v;
import p265tb.C6654g;
import p265tb.C6657i;
import p265tb.C6658j;
import p265tb.C6669s;
import p265tb.C6670t;
import p277ub.C6774a0;
import p277ub.C6792n;
import p583jk.C17875h;

/* renamed from: gb.x */
public final class C5001x implements C4984m, C5737j, Loader.C4070a<C5002a>, Loader.C4074e, C4956a0.C4959c {

    /* renamed from: N */
    public static final Map<String, String> f16891N;

    /* renamed from: O */
    public static final Format f16892O;

    /* renamed from: A */
    public long f16893A;

    /* renamed from: B */
    public boolean f16894B;

    /* renamed from: C */
    public int f16895C;

    /* renamed from: D */
    public boolean f16896D;

    /* renamed from: E */
    public boolean f16897E;

    /* renamed from: F */
    public int f16898F;

    /* renamed from: G */
    public long f16899G;

    /* renamed from: H */
    public long f16900H;

    /* renamed from: I */
    public long f16901I;

    /* renamed from: J */
    public boolean f16902J;

    /* renamed from: K */
    public int f16903K;

    /* renamed from: L */
    public boolean f16904L;

    /* renamed from: M */
    public boolean f16905M;

    /* renamed from: b */
    public final Uri f16906b;

    /* renamed from: c */
    public final C6654g f16907c;

    /* renamed from: d */
    public final C3915c f16908d;

    /* renamed from: e */
    public final C6669s f16909e;

    /* renamed from: f */
    public final C4995u.C4996a f16910f;

    /* renamed from: g */
    public final C3912b.C3913a f16911g;

    /* renamed from: h */
    public final C5003b f16912h;

    /* renamed from: i */
    public final C6658j f16913i;

    /* renamed from: j */
    public final String f16914j;

    /* renamed from: k */
    public final long f16915k;

    /* renamed from: l */
    public final Loader f16916l = new Loader();

    /* renamed from: m */
    public final C4999w f16917m;

    /* renamed from: n */
    public final C21060a f16918n;

    /* renamed from: o */
    public final C0194b f16919o;

    /* renamed from: p */
    public final C4268a1 f16920p;

    /* renamed from: q */
    public final Handler f16921q;

    /* renamed from: r */
    public C4984m.C4985a f16922r;

    /* renamed from: s */
    public IcyHeaders f16923s;

    /* renamed from: t */
    public C4956a0[] f16924t;

    /* renamed from: u */
    public C5005d[] f16925u;

    /* renamed from: v */
    public boolean f16926v;

    /* renamed from: w */
    public boolean f16927w;

    /* renamed from: x */
    public boolean f16928x;

    /* renamed from: y */
    public C5006e f16929y;

    /* renamed from: z */
    public C5750t f16930z;

    /* renamed from: gb.x$a */
    public final class C5002a implements Loader.C4073d, C4976h.C4977a {

        /* renamed from: a */
        public final Uri f16931a;

        /* renamed from: b */
        public final C6670t f16932b;

        /* renamed from: c */
        public final C4999w f16933c;

        /* renamed from: d */
        public final C5737j f16934d;

        /* renamed from: e */
        public final C21060a f16935e;

        /* renamed from: f */
        public final C5749s f16936f = new C5749s();

        /* renamed from: g */
        public volatile boolean f16937g;

        /* renamed from: h */
        public boolean f16938h = true;

        /* renamed from: i */
        public long f16939i;

        /* renamed from: j */
        public C6657i f16940j;

        /* renamed from: k */
        public long f16941k = -1;

        /* renamed from: l */
        public C4956a0 f16942l;

        /* renamed from: m */
        public boolean f16943m;

        public C5002a(Uri uri, C6654g gVar, C4999w wVar, C5737j jVar, C21060a aVar) {
            this.f16931a = uri;
            this.f16932b = new C6670t(gVar);
            this.f16933c = wVar;
            this.f16934d = jVar;
            this.f16935e = aVar;
            C4978i.f16828b.getAndIncrement();
            this.f16940j = mo20717a(0);
        }

        /* renamed from: a */
        public final C6657i mo20717a(long j) {
            Collections.emptyMap();
            Uri uri = this.f16931a;
            String str = C5001x.this.f16914j;
            Map<String, String> map = C5001x.f16891N;
            C17875h.m44307r(uri, "The uri must be set.");
            return new C6657i(uri, 0, 1, (byte[]) null, map, j, -1, str, 6, (Object) null);
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ee */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo20718b() throws java.io.IOException {
            /*
                r18 = this;
                r1 = r18
                r0 = 0
                r2 = 0
            L_0x0004:
                if (r2 != 0) goto L_0x0145
                boolean r3 = r1.f16937g
                if (r3 != 0) goto L_0x0145
                r3 = 1
                r4 = -1
                ma.s r6 = r1.f16936f     // Catch:{ all -> 0x011e }
                long r13 = r6.f18624a     // Catch:{ all -> 0x011e }
                tb.i r6 = r1.mo20717a(r13)     // Catch:{ all -> 0x011e }
                r1.f16940j = r6     // Catch:{ all -> 0x011e }
                tb.t r7 = r1.f16932b     // Catch:{ all -> 0x011e }
                long r6 = r7.mo16699e(r6)     // Catch:{ all -> 0x011e }
                r1.f16941k = r6     // Catch:{ all -> 0x011e }
                int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r8 == 0) goto L_0x0026
                long r6 = r6 + r13
                r1.f16941k = r6     // Catch:{ all -> 0x011e }
            L_0x0026:
                gb.x r6 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                tb.t r7 = r1.f16932b     // Catch:{ all -> 0x011e }
                java.util.Map r7 = r7.mo20679b()     // Catch:{ all -> 0x011e }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = com.google.android.exoplayer2.metadata.icy.IcyHeaders.m10633b(r7)     // Catch:{ all -> 0x011e }
                r6.f16923s = r7     // Catch:{ all -> 0x011e }
                tb.t r6 = r1.f16932b     // Catch:{ all -> 0x011e }
                gb.x r7 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r7 = r7.f16923s     // Catch:{ all -> 0x011e }
                if (r7 == 0) goto L_0x005c
                int r7 = r7.f13900g     // Catch:{ all -> 0x011e }
                r8 = -1
                if (r7 == r8) goto L_0x005c
                gb.h r8 = new gb.h     // Catch:{ all -> 0x011e }
                r8.<init>(r6, r7, r1)     // Catch:{ all -> 0x011e }
                gb.x r6 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                r6.getClass()     // Catch:{ all -> 0x011e }
                gb.x$d r7 = new gb.x$d     // Catch:{ all -> 0x011e }
                r7.<init>(r0, r3)     // Catch:{ all -> 0x011e }
                gb.a0 r6 = r6.mo20704B(r7)     // Catch:{ all -> 0x011e }
                r1.f16942l = r6     // Catch:{ all -> 0x011e }
                com.google.android.exoplayer2.Format r7 = p100gb.C5001x.f16892O     // Catch:{ all -> 0x011e }
                r6.mo20632c(r7)     // Catch:{ all -> 0x011e }
                goto L_0x005d
            L_0x005c:
                r8 = r6
            L_0x005d:
                gb.w r6 = r1.f16933c     // Catch:{ all -> 0x011e }
                android.net.Uri r9 = r1.f16931a     // Catch:{ all -> 0x011e }
                tb.t r7 = r1.f16932b     // Catch:{ all -> 0x011e }
                java.util.Map r10 = r7.mo20679b()     // Catch:{ all -> 0x011e }
                long r11 = r1.f16941k     // Catch:{ all -> 0x011e }
                ma.j r15 = r1.f16934d     // Catch:{ all -> 0x011e }
                r7 = r6
                gb.b r7 = (p100gb.C4960b) r7     // Catch:{ all -> 0x011e }
                r16 = r11
                r11 = r13
                r4 = r13
                r13 = r16
                r7.mo20647b(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x011e }
                gb.x r6 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                com.google.android.exoplayer2.metadata.icy.IcyHeaders r6 = r6.f16923s     // Catch:{ all -> 0x011e }
                if (r6 == 0) goto L_0x008b
                gb.w r6 = r1.f16933c     // Catch:{ all -> 0x011e }
                gb.b r6 = (p100gb.C4960b) r6     // Catch:{ all -> 0x011e }
                ma.h r6 = r6.f16780b     // Catch:{ all -> 0x011e }
                boolean r7 = r6 instanceof p251sa.C6496d     // Catch:{ all -> 0x011e }
                if (r7 == 0) goto L_0x008b
                sa.d r6 = (p251sa.C6496d) r6     // Catch:{ all -> 0x011e }
                r6.f20275r = r3     // Catch:{ all -> 0x011e }
            L_0x008b:
                boolean r6 = r1.f16938h     // Catch:{ all -> 0x011e }
                if (r6 == 0) goto L_0x009f
                gb.w r6 = r1.f16933c     // Catch:{ all -> 0x011e }
                long r7 = r1.f16939i     // Catch:{ all -> 0x011e }
                gb.b r6 = (p100gb.C4960b) r6     // Catch:{ all -> 0x011e }
                ma.h r6 = r6.f16780b     // Catch:{ all -> 0x011e }
                r6.getClass()     // Catch:{ all -> 0x011e }
                r6.mo21592a(r4, r7)     // Catch:{ all -> 0x011e }
                r1.f16938h = r0     // Catch:{ all -> 0x011e }
            L_0x009f:
                r13 = r4
            L_0x00a0:
                if (r2 != 0) goto L_0x00f4
                boolean r4 = r1.f16937g     // Catch:{ all -> 0x011e }
                if (r4 != 0) goto L_0x00f4
                bh0.a r4 = r1.f16935e     // Catch:{ InterruptedException -> 0x00ee }
                monitor-enter(r4)     // Catch:{ InterruptedException -> 0x00ee }
            L_0x00a9:
                boolean r5 = r4.f52862b     // Catch:{ all -> 0x00eb }
                if (r5 != 0) goto L_0x00b1
                r4.wait()     // Catch:{ all -> 0x00eb }
                goto L_0x00a9
            L_0x00b1:
                monitor-exit(r4)     // Catch:{ InterruptedException -> 0x00ee }
                gb.w r4 = r1.f16933c     // Catch:{ all -> 0x011e }
                ma.s r5 = r1.f16936f     // Catch:{ all -> 0x011e }
                gb.b r4 = (p100gb.C4960b) r4     // Catch:{ all -> 0x011e }
                ma.h r6 = r4.f16780b     // Catch:{ all -> 0x011e }
                r6.getClass()     // Catch:{ all -> 0x011e }
                ma.e r4 = r4.f16781c     // Catch:{ all -> 0x011e }
                r4.getClass()     // Catch:{ all -> 0x011e }
                int r2 = r6.mo21595h(r4, r5)     // Catch:{ all -> 0x011e }
                gb.w r4 = r1.f16933c     // Catch:{ all -> 0x011e }
                gb.b r4 = (p100gb.C4960b) r4     // Catch:{ all -> 0x011e }
                long r4 = r4.mo20646a()     // Catch:{ all -> 0x011e }
                gb.x r6 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                long r6 = r6.f16915k     // Catch:{ all -> 0x011e }
                long r6 = r6 + r13
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 <= 0) goto L_0x00a0
                bh0.a r6 = r1.f16935e     // Catch:{ all -> 0x011e }
                monitor-enter(r6)     // Catch:{ all -> 0x011e }
                r6.f52862b = r0     // Catch:{ all -> 0x00e7 }
                monitor-exit(r6)     // Catch:{ all -> 0x011e }
                gb.x r6 = p100gb.C5001x.this     // Catch:{ all -> 0x011e }
                android.os.Handler r7 = r6.f16921q     // Catch:{ all -> 0x011e }
                d0.a1 r6 = r6.f16920p     // Catch:{ all -> 0x011e }
                r7.post(r6)     // Catch:{ all -> 0x011e }
                goto L_0x009f
            L_0x00e7:
                r0 = move-exception
                r4 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x011e }
                throw r4     // Catch:{ all -> 0x011e }
            L_0x00eb:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ InterruptedException -> 0x00ee }
                throw r0     // Catch:{ InterruptedException -> 0x00ee }
            L_0x00ee:
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x011e }
                r0.<init>()     // Catch:{ all -> 0x011e }
                throw r0     // Catch:{ all -> 0x011e }
            L_0x00f4:
                if (r2 != r3) goto L_0x00f8
                r2 = 0
                goto L_0x0112
            L_0x00f8:
                gb.w r3 = r1.f16933c
                gb.b r3 = (p100gb.C4960b) r3
                long r3 = r3.mo20646a()
                r5 = -1
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0112
                ma.s r3 = r1.f16936f
                gb.w r4 = r1.f16933c
                gb.b r4 = (p100gb.C4960b) r4
                long r4 = r4.mo20646a()
                r3.f18624a = r4
            L_0x0112:
                tb.t r3 = r1.f16932b
                if (r3 == 0) goto L_0x0004
                r3.close()     // Catch:{ IOException -> 0x011b }
                goto L_0x0004
            L_0x011b:
                goto L_0x0004
            L_0x011e:
                r0 = move-exception
                if (r2 == r3) goto L_0x013b
                gb.w r2 = r1.f16933c
                gb.b r2 = (p100gb.C4960b) r2
                long r2 = r2.mo20646a()
                r4 = -1
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x013b
                ma.s r2 = r1.f16936f
                gb.w r3 = r1.f16933c
                gb.b r3 = (p100gb.C4960b) r3
                long r3 = r3.mo20646a()
                r2.f18624a = r3
            L_0x013b:
                tb.t r2 = r1.f16932b
                int r3 = p277ub.C6774a0.f20959a
                if (r2 == 0) goto L_0x0144
                r2.close()     // Catch:{ IOException -> 0x0144 }
            L_0x0144:
                throw r0
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p100gb.C5001x.C5002a.mo20718b():void");
        }
    }

    /* renamed from: gb.x$b */
    public interface C5003b {
    }

    /* renamed from: gb.x$c */
    public final class C5004c implements C4961b0 {

        /* renamed from: b */
        public final int f16945b;

        public C5004c(int i) {
            this.f16945b = i;
        }

        /* renamed from: a */
        public final void mo20648a() throws IOException {
            C5001x xVar = C5001x.this;
            C4956a0 a0Var = xVar.f16924t[this.f16945b];
            DrmSession drmSession = a0Var.f16756i;
            if (drmSession == null || drmSession.getState() != 1) {
                xVar.mo20703A();
                return;
            }
            DrmSession.DrmSessionException a = a0Var.f16756i.mo15952a();
            a.getClass();
            throw a;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x00a6=Splitter:B:48:0x00a6, B:27:0x004f=Splitter:B:27:0x004f} */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo20649b(p431cy.C16525b r17, com.google.android.exoplayer2.decoder.DecoderInputBuffer r18, int r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                gb.x r3 = p100gb.C5001x.this
                int r4 = r1.f16945b
                boolean r5 = r3.mo20706D()
                r6 = -3
                if (r5 == 0) goto L_0x0013
                goto L_0x00e8
            L_0x0013:
                r3.mo20715y(r4)
                gb.a0[] r5 = r3.f16924t
                r5 = r5[r4]
                boolean r7 = r3.f16904L
                r8 = r19 & 2
                r9 = 0
                r10 = 1
                if (r8 == 0) goto L_0x0024
                r8 = 1
                goto L_0x0025
            L_0x0024:
                r8 = 0
            L_0x0025:
                gb.a0$a r11 = r5.f16749b
                monitor-enter(r5)
                r2.f13648e = r9     // Catch:{ all -> 0x00e9 }
                int r12 = r5.f16767t     // Catch:{ all -> 0x00e9 }
                int r13 = r5.f16764q     // Catch:{ all -> 0x00e9 }
                if (r12 == r13) goto L_0x0032
                r13 = 1
                goto L_0x0033
            L_0x0032:
                r13 = 0
            L_0x0033:
                r14 = -5
                r15 = 4
                if (r13 != 0) goto L_0x0053
                if (r7 != 0) goto L_0x004f
                boolean r7 = r5.f16771x     // Catch:{ all -> 0x00e9 }
                if (r7 == 0) goto L_0x003e
                goto L_0x004f
            L_0x003e:
                com.google.android.exoplayer2.Format r7 = r5.f16745A     // Catch:{ all -> 0x00e9 }
                if (r7 == 0) goto L_0x004d
                if (r8 != 0) goto L_0x0048
                com.google.android.exoplayer2.Format r8 = r5.f16755h     // Catch:{ all -> 0x00e9 }
                if (r7 == r8) goto L_0x004d
            L_0x0048:
                r5.mo20642m(r7, r0)     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
                goto L_0x00aa
            L_0x004d:
                monitor-exit(r5)
                goto L_0x0076
            L_0x004f:
                r2.f17757b = r15     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
                goto L_0x00a3
            L_0x0053:
                gb.f0<gb.a0$b> r7 = r5.f16750c     // Catch:{ all -> 0x00e9 }
                int r13 = r5.f16765r     // Catch:{ all -> 0x00e9 }
                int r13 = r13 + r12
                java.lang.Object r7 = r7.mo20678b(r13)     // Catch:{ all -> 0x00e9 }
                gb.a0$b r7 = (p100gb.C4956a0.C4958b) r7     // Catch:{ all -> 0x00e9 }
                com.google.android.exoplayer2.Format r7 = r7.f16777a     // Catch:{ all -> 0x00e9 }
                if (r8 != 0) goto L_0x00a6
                com.google.android.exoplayer2.Format r8 = r5.f16755h     // Catch:{ all -> 0x00e9 }
                if (r7 == r8) goto L_0x0067
                goto L_0x00a6
            L_0x0067:
                int r0 = r5.f16767t     // Catch:{ all -> 0x00e9 }
                int r0 = r5.mo20639j(r0)     // Catch:{ all -> 0x00e9 }
                boolean r7 = r5.mo20641l(r0)     // Catch:{ all -> 0x00e9 }
                if (r7 != 0) goto L_0x0079
                r2.f13648e = r10     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
            L_0x0076:
                r0 = -4
                r14 = -3
                goto L_0x00ab
            L_0x0079:
                int[] r7 = r5.f16761n     // Catch:{ all -> 0x00e9 }
                r7 = r7[r0]     // Catch:{ all -> 0x00e9 }
                r2.f17757b = r7     // Catch:{ all -> 0x00e9 }
                long[] r8 = r5.f16762o     // Catch:{ all -> 0x00e9 }
                r12 = r8[r0]     // Catch:{ all -> 0x00e9 }
                r2.f13649f = r12     // Catch:{ all -> 0x00e9 }
                long r9 = r5.f16768u     // Catch:{ all -> 0x00e9 }
                int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r14 >= 0) goto L_0x0090
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                r7 = r7 | r9
                r2.f17757b = r7     // Catch:{ all -> 0x00e9 }
            L_0x0090:
                int[] r7 = r5.f16760m     // Catch:{ all -> 0x00e9 }
                r7 = r7[r0]     // Catch:{ all -> 0x00e9 }
                r11.f16774a = r7     // Catch:{ all -> 0x00e9 }
                long[] r7 = r5.f16759l     // Catch:{ all -> 0x00e9 }
                r9 = r7[r0]     // Catch:{ all -> 0x00e9 }
                r11.f16775b = r9     // Catch:{ all -> 0x00e9 }
                ma.v$a[] r7 = r5.f16763p     // Catch:{ all -> 0x00e9 }
                r0 = r7[r0]     // Catch:{ all -> 0x00e9 }
                r11.f16776c = r0     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
            L_0x00a3:
                r0 = -4
                r14 = -4
                goto L_0x00ab
            L_0x00a6:
                r5.mo20642m(r7, r0)     // Catch:{ all -> 0x00e9 }
                monitor-exit(r5)
            L_0x00aa:
                r0 = -4
            L_0x00ab:
                if (r14 != r0) goto L_0x00e2
                boolean r0 = r2.mo21174d(r15)
                if (r0 != 0) goto L_0x00e2
                r0 = r19 & 1
                if (r0 == 0) goto L_0x00b9
                r9 = 1
                goto L_0x00ba
            L_0x00b9:
                r9 = 0
            L_0x00ba:
                r0 = r19 & 4
                if (r0 != 0) goto L_0x00da
                if (r9 == 0) goto L_0x00cc
                gb.z r0 = r5.f16748a
                gb.a0$a r7 = r5.f16749b
                gb.z$a r10 = r0.f16970e
                ub.r r0 = r0.f16968c
                p100gb.C5010z.m12836e(r10, r2, r7, r0)
                goto L_0x00da
            L_0x00cc:
                gb.z r0 = r5.f16748a
                gb.a0$a r7 = r5.f16749b
                gb.z$a r10 = r0.f16970e
                ub.r r11 = r0.f16968c
                gb.z$a r2 = p100gb.C5010z.m12836e(r10, r2, r7, r11)
                r0.f16970e = r2
            L_0x00da:
                if (r9 != 0) goto L_0x00e2
                int r0 = r5.f16767t
                r2 = 1
                int r0 = r0 + r2
                r5.f16767t = r0
            L_0x00e2:
                if (r14 != r6) goto L_0x00e7
                r3.mo20716z(r4)
            L_0x00e7:
                r6 = r14
            L_0x00e8:
                return r6
            L_0x00e9:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p100gb.C5001x.C5004c.mo20649b(cy.b, com.google.android.exoplayer2.decoder.DecoderInputBuffer, int):int");
        }

        /* renamed from: c */
        public final int mo20650c(long j) {
            boolean z;
            int i;
            C5001x xVar = C5001x.this;
            int i2 = this.f16945b;
            boolean z2 = false;
            if (xVar.mo20706D()) {
                return 0;
            }
            xVar.mo20715y(i2);
            C4956a0 a0Var = xVar.f16924t[i2];
            boolean z3 = xVar.f16904L;
            synchronized (a0Var) {
                int j2 = a0Var.mo20639j(a0Var.f16767t);
                int i3 = a0Var.f16767t;
                int i4 = a0Var.f16764q;
                if (i3 != i4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (j >= a0Var.f16762o[j2]) {
                        if (j <= a0Var.f16770w || !z3) {
                            i = a0Var.mo20637h(j2, i4 - i3, j, true);
                            if (i == -1) {
                                i = 0;
                            }
                        } else {
                            i = i4 - i3;
                        }
                    }
                }
                i = 0;
            }
            synchronized (a0Var) {
                if (i >= 0) {
                    if (a0Var.f16767t + i <= a0Var.f16764q) {
                        z2 = true;
                    }
                }
                C17875h.m44301k(z2);
                a0Var.f16767t += i;
            }
            if (i == 0) {
                xVar.mo20716z(i2);
            }
            return i;
        }

        public final boolean isReady() {
            C5001x xVar = C5001x.this;
            int i = this.f16945b;
            if (xVar.mo20706D() || !xVar.f16924t[i].mo20640k(xVar.f16904L)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: gb.x$d */
    public static final class C5005d {

        /* renamed from: a */
        public final int f16947a;

        /* renamed from: b */
        public final boolean f16948b;

        public C5005d(int i, boolean z) {
            this.f16947a = i;
            this.f16948b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5005d.class != obj.getClass()) {
                return false;
            }
            C5005d dVar = (C5005d) obj;
            if (this.f16947a == dVar.f16947a && this.f16948b == dVar.f16948b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16947a * 31) + (this.f16948b ? 1 : 0);
        }
    }

    /* renamed from: gb.x$e */
    public static final class C5006e {

        /* renamed from: a */
        public final TrackGroupArray f16949a;

        /* renamed from: b */
        public final boolean[] f16950b;

        /* renamed from: c */
        public final boolean[] f16951c;

        /* renamed from: d */
        public final boolean[] f16952d;

        public C5006e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f16949a = trackGroupArray;
            this.f16950b = zArr;
            int i = trackGroupArray.f14012b;
            this.f16951c = new boolean[i];
            this.f16952d = new boolean[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", DiskLruCache.VERSION_1);
        f16891N = Collections.unmodifiableMap(hashMap);
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13436a = "icy";
        bVar.f13446k = "application/x-icy";
        f16892O = bVar.mo15806a();
    }

    public C5001x(Uri uri, C6654g gVar, C4960b bVar, C3915c cVar, C3912b.C3913a aVar, C6669s sVar, C4995u.C4996a aVar2, C5003b bVar2, C6658j jVar, String str, int i) {
        this.f16906b = uri;
        this.f16907c = gVar;
        this.f16908d = cVar;
        this.f16911g = aVar;
        this.f16909e = sVar;
        this.f16910f = aVar2;
        this.f16912h = bVar2;
        this.f16913i = jVar;
        this.f16914j = str;
        this.f16915k = (long) i;
        this.f16917m = bVar;
        this.f16918n = new C21060a();
        this.f16919o = new C0194b(this, 5);
        this.f16920p = new C4268a1(this, 7);
        this.f16921q = C6774a0.m15949i((Handler.Callback) null);
        this.f16925u = new C5005d[0];
        this.f16924t = new C4956a0[0];
        this.f16901I = -9223372036854775807L;
        this.f16899G = -1;
        this.f16893A = -9223372036854775807L;
        this.f16895C = 1;
    }

    /* renamed from: A */
    public final void mo20703A() throws IOException {
        int i;
        Loader loader = this.f16916l;
        C6669s sVar = this.f16909e;
        int i2 = this.f16895C;
        ((C4076a) sVar).getClass();
        if (i2 == 7) {
            i = 6;
        } else {
            i = 3;
        }
        IOException iOException = loader.f14577c;
        if (iOException == null) {
            Loader.C4072c<? extends Loader.C4073d> cVar = loader.f14576b;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.f14580b;
                }
                IOException iOException2 = cVar.f14584f;
                if (iOException2 != null && cVar.f14585g > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: B */
    public final C4956a0 mo20704B(C5005d dVar) {
        int length = this.f16924t.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f16925u[i])) {
                return this.f16924t[i];
            }
        }
        C6658j jVar = this.f16913i;
        Looper looper = this.f16921q.getLooper();
        C3915c cVar = this.f16908d;
        C3912b.C3913a aVar = this.f16911g;
        looper.getClass();
        cVar.getClass();
        aVar.getClass();
        C4956a0 a0Var = new C4956a0(jVar, looper, cVar, aVar);
        a0Var.f16754g = this;
        int i2 = length + 1;
        C5005d[] dVarArr = (C5005d[]) Arrays.copyOf(this.f16925u, i2);
        dVarArr[length] = dVar;
        int i3 = C6774a0.f20959a;
        this.f16925u = dVarArr;
        C4956a0[] a0VarArr = (C4956a0[]) Arrays.copyOf(this.f16924t, i2);
        a0VarArr[length] = a0Var;
        this.f16924t = a0VarArr;
        return a0Var;
    }

    /* renamed from: C */
    public final void mo20705C() {
        int i;
        C5002a aVar = new C5002a(this.f16906b, this.f16907c, this.f16917m, this, this.f16918n);
        if (this.f16927w) {
            C17875h.m44304o(mo20713w());
            long j = this.f16893A;
            if (j == -9223372036854775807L || this.f16901I <= j) {
                C5750t tVar = this.f16930z;
                tVar.getClass();
                long j2 = tVar.mo21569c(this.f16901I).f18625a.f18631b;
                long j3 = this.f16901I;
                aVar.f16936f.f18624a = j2;
                aVar.f16939i = j3;
                aVar.f16938h = true;
                aVar.f16943m = false;
                for (C4956a0 a0Var : this.f16924t) {
                    a0Var.f16768u = this.f16901I;
                }
                this.f16901I = -9223372036854775807L;
            } else {
                this.f16904L = true;
                this.f16901I = -9223372036854775807L;
                return;
            }
        }
        this.f16903K = mo20711u();
        Loader loader = this.f16916l;
        C6669s sVar = this.f16909e;
        int i2 = this.f16895C;
        ((C4076a) sVar).getClass();
        if (i2 == 7) {
            i = 6;
        } else {
            i = 3;
        }
        loader.getClass();
        Looper myLooper = Looper.myLooper();
        C17875h.m44306q(myLooper);
        loader.f14577c = null;
        new Loader.C4072c(myLooper, aVar, this, i, SystemClock.elapsedRealtime()).mo16706b(0);
        C6657i iVar = aVar.f16940j;
        C4995u.C4996a aVar2 = this.f16910f;
        Uri uri = iVar.f20668a;
        aVar2.mo20702f(new C4978i(Collections.emptyMap(), 0), new C4983l(1, -1, (Format) null, 0, (Object) null, aVar2.mo20697a(aVar.f16939i), aVar2.mo20697a(this.f16893A)));
    }

    /* renamed from: D */
    public final boolean mo20706D() {
        return this.f16897E || mo20713w();
    }

    /* renamed from: a */
    public final void mo16702a(Loader.C4073d dVar, long j, long j2, boolean z) {
        C5002a aVar = (C5002a) dVar;
        C6670t tVar = aVar.f16932b;
        Uri uri = tVar.f20750c;
        C4978i iVar = new C4978i(tVar.f20751d, j2);
        this.f16909e.getClass();
        C4995u.C4996a aVar2 = this.f16910f;
        long j3 = aVar.f16939i;
        long j4 = this.f16893A;
        long a = aVar2.mo20697a(j3);
        long a2 = aVar2.mo20697a(j4);
        C4983l lVar = r8;
        C4983l lVar2 = new C4983l(1, -1, (Format) null, 0, (Object) null, a, a2);
        aVar2.mo20699c(iVar, lVar);
        if (!z) {
            if (this.f16899G == -1) {
                this.f16899G = aVar.f16941k;
            }
            for (C4956a0 n : this.f16924t) {
                n.mo20643n(false);
            }
            if (this.f16898F > 0) {
                C4984m.C4985a aVar3 = this.f16922r;
                aVar3.getClass();
                aVar3.mo20498a(this);
            }
        }
    }

    /* renamed from: b */
    public final long mo20652b() {
        if (this.f16898F == 0) {
            return Long.MIN_VALUE;
        }
        return mo20663q();
    }

    /* renamed from: c */
    public final void mo20653c(C4984m.C4985a aVar, long j) {
        this.f16922r = aVar;
        this.f16918n.mo53185a();
        mo20705C();
    }

    /* renamed from: d */
    public final long mo20654d(C3997b[] bVarArr, boolean[] zArr, C4961b0[] b0VarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        C3997b bVar;
        boolean z3;
        boolean z4;
        mo20710t();
        C5006e eVar = this.f16929y;
        TrackGroupArray trackGroupArray = eVar.f16949a;
        boolean[] zArr3 = eVar.f16951c;
        int i = this.f16898F;
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            C5004c cVar = b0VarArr[i2];
            if (cVar != null && (bVarArr[i2] == null || !zArr[i2])) {
                int i3 = cVar.f16945b;
                C17875h.m44304o(zArr3[i3]);
                this.f16898F--;
                zArr3[i3] = false;
                b0VarArr[i2] = null;
            }
        }
        if (!this.f16896D ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i4 = 0; i4 < bVarArr.length; i4++) {
            if (b0VarArr[i4] == null && (bVar = bVarArr[i4]) != null) {
                if (bVar.length() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C17875h.m44304o(z3);
                if (bVar.mo22604c(0) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                C17875h.m44304o(z4);
                TrackGroup d = bVar.mo22605d();
                int i5 = 0;
                while (true) {
                    if (i5 >= trackGroupArray.f14012b) {
                        i5 = -1;
                        break;
                    } else if (trackGroupArray.f14013c[i5] == d) {
                        break;
                    } else {
                        i5++;
                    }
                }
                C17875h.m44304o(!zArr3[i5]);
                this.f16898F++;
                zArr3[i5] = true;
                b0VarArr[i4] = new C5004c(i5);
                zArr2[i4] = true;
                if (!z) {
                    C4956a0 a0Var = this.f16924t[i5];
                    if (a0Var.mo20645p(j, true) || a0Var.f16765r + a0Var.f16767t == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (this.f16898F == 0) {
            this.f16902J = false;
            this.f16897E = false;
            if (this.f16916l.f14576b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (C4956a0 g : this.f16924t) {
                    g.mo20636g();
                }
                Loader.C4072c<? extends Loader.C4073d> cVar2 = this.f16916l.f14576b;
                C17875h.m44306q(cVar2);
                cVar2.mo16705a(false);
            } else {
                for (C4956a0 n : this.f16924t) {
                    n.mo20643n(false);
                }
            }
        } else if (z) {
            j = mo20655f(j);
            for (int i6 = 0; i6 < b0VarArr.length; i6++) {
                if (b0VarArr[i6] != null) {
                    zArr2[i6] = true;
                }
            }
        }
        this.f16896D = true;
        return j;
    }

    /* renamed from: e */
    public final void mo16703e(Loader.C4073d dVar, long j, long j2) {
        C5750t tVar;
        long j3;
        C5002a aVar = (C5002a) dVar;
        if (this.f16893A == -9223372036854775807L && (tVar = this.f16930z) != null) {
            boolean e = tVar.mo21570e();
            long v = mo20712v();
            if (v == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = v + 10000;
            }
            this.f16893A = j3;
            ((C5007y) this.f16912h).mo20722t(j3, e, this.f16894B);
        }
        C6670t tVar2 = aVar.f16932b;
        Uri uri = tVar2.f20750c;
        C4978i iVar = new C4978i(tVar2.f20751d, j2);
        this.f16909e.getClass();
        C4995u.C4996a aVar2 = this.f16910f;
        aVar2.mo20700d(iVar, new C4983l(1, -1, (Format) null, 0, (Object) null, aVar2.mo20697a(aVar.f16939i), aVar2.mo20697a(this.f16893A)));
        if (this.f16899G == -1) {
            this.f16899G = aVar.f16941k;
        }
        this.f16904L = true;
        C4984m.C4985a aVar3 = this.f16922r;
        aVar3.getClass();
        aVar3.mo20498a(this);
    }

    /* renamed from: f */
    public final long mo20655f(long j) {
        boolean z;
        mo20710t();
        boolean[] zArr = this.f16929y.f16950b;
        if (!this.f16930z.mo21570e()) {
            j = 0;
        }
        this.f16897E = false;
        this.f16900H = j;
        if (mo20713w()) {
            this.f16901I = j;
            return j;
        }
        boolean z2 = true;
        if (this.f16895C != 7) {
            int length = this.f16924t.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (this.f16924t[i].mo20645p(j, false) || (!zArr[i] && this.f16928x)) {
                    i++;
                }
            }
            z = false;
            if (z) {
                return j;
            }
        }
        this.f16902J = false;
        this.f16901I = j;
        this.f16904L = false;
        Loader loader = this.f16916l;
        if (loader.f14576b == null) {
            z2 = false;
        }
        if (z2) {
            for (C4956a0 g : this.f16924t) {
                g.mo20636g();
            }
            Loader.C4072c<? extends Loader.C4073d> cVar = this.f16916l.f14576b;
            C17875h.m44306q(cVar);
            cVar.mo16705a(false);
        } else {
            loader.f14577c = null;
            for (C4956a0 n : this.f16924t) {
                n.mo20643n(false);
            }
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        if (java.lang.Math.abs(r7 - r1) <= java.lang.Math.abs(r9 - r1)) goto L_0x0083;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo20656g(long r20, p099ga.C4862b1 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r19.mo20710t()
            ma.t r4 = r0.f16930z
            boolean r4 = r4.mo21570e()
            r5 = 0
            if (r4 != 0) goto L_0x0014
            return r5
        L_0x0014:
            ma.t r4 = r0.f16930z
            ma.t$a r4 = r4.mo21569c(r1)
            ma.u r7 = r4.f18625a
            long r7 = r7.f18630a
            ma.u r4 = r4.f18626b
            long r9 = r4.f18630a
            long r11 = r3.f16297a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            long r13 = r3.f16298b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0030
            r13 = r1
            goto L_0x0088
        L_0x0030:
            r13 = -9223372036854775808
            int r4 = p277ub.C6774a0.f20959a
            long r15 = r1 - r11
            long r11 = r11 ^ r1
            long r17 = r1 ^ r15
            long r11 = r11 & r17
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r13 = r15
        L_0x0041:
            long r3 = r3.f16298b
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r15 = r1 + r3
            long r17 = r1 ^ r15
            long r3 = r3 ^ r15
            long r3 = r3 & r17
            int r17 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r17 >= 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r11 = r15
        L_0x0055:
            r3 = 1
            r4 = 0
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0061
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x0061
            r5 = 1
            goto L_0x0062
        L_0x0061:
            r5 = 0
        L_0x0062:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L_0x006b
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            if (r5 == 0) goto L_0x0081
            if (r3 == 0) goto L_0x0081
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0087
            goto L_0x0083
        L_0x0081:
            if (r5 == 0) goto L_0x0085
        L_0x0083:
            r13 = r7
            goto L_0x0088
        L_0x0085:
            if (r3 == 0) goto L_0x0088
        L_0x0087:
            r13 = r9
        L_0x0088:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C5001x.mo20656g(long, ga.b1):long");
    }

    /* renamed from: h */
    public final boolean mo20657h() {
        boolean z;
        boolean z2;
        if (this.f16916l.f14576b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C21060a aVar = this.f16918n;
            synchronized (aVar) {
                z2 = aVar.f52862b;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final long mo20658i() {
        if (!this.f16897E) {
            return -9223372036854775807L;
        }
        if (!this.f16904L && mo20711u() <= this.f16903K) {
            return -9223372036854775807L;
        }
        this.f16897E = false;
        return this.f16900H;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b8  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.upstream.Loader.C4071b mo16704j(com.google.android.exoplayer2.upstream.Loader.C4073d r20, long r21, long r23, java.io.IOException r25, int r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r25
            r2 = r20
            gb.x$a r2 = (p100gb.C5001x.C5002a) r2
            long r3 = r0.f16899G
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0014
            long r3 = r2.f16941k
            r0.f16899G = r3
        L_0x0014:
            tb.t r3 = r2.f16932b
            gb.i r4 = new gb.i
            android.net.Uri r7 = r3.f20750c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r3 = r3.f20751d
            r7 = r23
            r4.<init>(r3, r7)
            long r7 = r2.f16939i
            p099ga.C4883f.m12377b(r7)
            long r7 = r0.f16893A
            p099ga.C4883f.m12377b(r7)
            tb.s r3 = r0.f16909e
            com.google.android.exoplayer2.upstream.a r3 = (com.google.android.exoplayer2.upstream.C4076a) r3
            r3.getClass()
            boolean r3 = r1 instanceof com.google.android.exoplayer2.ParserException
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0054
            boolean r3 = r1 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0054
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0054
            boolean r3 = r1 instanceof com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException
            if (r3 == 0) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            int r3 = r26 + -1
            int r3 = r3 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r9)
            long r9 = (long) r3
            goto L_0x0055
        L_0x0054:
            r9 = r7
        L_0x0055:
            r3 = 0
            r11 = 1
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x005e
            com.google.android.exoplayer2.upstream.Loader$b r5 = com.google.android.exoplayer2.upstream.Loader.f14574e
            goto L_0x00ba
        L_0x005e:
            int r12 = r19.mo20711u()
            int r13 = r0.f16903K
            if (r12 <= r13) goto L_0x0068
            r13 = 1
            goto L_0x0069
        L_0x0068:
            r13 = 0
        L_0x0069:
            long r14 = r0.f16899G
            int r16 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r16 != 0) goto L_0x00ad
            ma.t r5 = r0.f16930z
            if (r5 == 0) goto L_0x007c
            long r5 = r5.mo21571i()
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 == 0) goto L_0x007c
            goto L_0x00ad
        L_0x007c:
            boolean r5 = r0.f16927w
            if (r5 == 0) goto L_0x008a
            boolean r5 = r19.mo20706D()
            if (r5 != 0) goto L_0x008a
            r0.f16902J = r11
            r5 = 0
            goto L_0x00b0
        L_0x008a:
            boolean r5 = r0.f16927w
            r0.f16897E = r5
            r5 = 0
            r0.f16900H = r5
            r0.f16903K = r3
            gb.a0[] r7 = r0.f16924t
            int r8 = r7.length
            r12 = 0
        L_0x0098:
            if (r12 >= r8) goto L_0x00a2
            r14 = r7[r12]
            r14.mo20643n(r3)
            int r12 = r12 + 1
            goto L_0x0098
        L_0x00a2:
            ma.s r7 = r2.f16936f
            r7.f18624a = r5
            r2.f16939i = r5
            r2.f16938h = r11
            r2.f16943m = r3
            goto L_0x00af
        L_0x00ad:
            r0.f16903K = r12
        L_0x00af:
            r5 = 1
        L_0x00b0:
            if (r5 == 0) goto L_0x00b8
            com.google.android.exoplayer2.upstream.Loader$b r5 = new com.google.android.exoplayer2.upstream.Loader$b
            r5.<init>(r13, r9)
            goto L_0x00ba
        L_0x00b8:
            com.google.android.exoplayer2.upstream.Loader$b r5 = com.google.android.exoplayer2.upstream.Loader.f14573d
        L_0x00ba:
            int r6 = r5.f14578a
            if (r6 == 0) goto L_0x00c0
            if (r6 != r11) goto L_0x00c1
        L_0x00c0:
            r3 = 1
        L_0x00c1:
            r3 = r3 ^ r11
            gb.u$a r6 = r0.f16910f
            r8 = 1
            r9 = -1
            r10 = 0
            long r11 = r2.f16939i
            long r13 = r0.f16893A
            gb.l r2 = new gb.l
            long r15 = r6.mo20697a(r11)
            long r17 = r6.mo20697a(r13)
            r11 = 0
            r12 = 0
            r7 = r2
            r13 = r15
            r15 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            r6.mo20701e(r4, r2, r1, r3)
            if (r3 == 0) goto L_0x00e8
            tb.s r1 = r0.f16909e
            r1.getClass()
        L_0x00e8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C5001x.mo16704j(com.google.android.exoplayer2.upstream.Loader$d, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$b");
    }

    /* renamed from: k */
    public final void mo20707k(C5750t tVar) {
        this.f16921q.post(new C0509c(8, this, tVar));
    }

    /* renamed from: l */
    public final void mo20660l() throws IOException {
        mo20703A();
        if (this.f16904L && !this.f16927w) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: m */
    public final boolean mo20661m(long j) {
        boolean z;
        boolean z2 = false;
        if (!this.f16904L) {
            if (this.f16916l.f14577c != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !this.f16902J && (!this.f16927w || this.f16898F != 0)) {
                boolean a = this.f16918n.mo53185a();
                if (this.f16916l.f14576b != null) {
                    z2 = true;
                }
                if (z2) {
                    return a;
                }
                mo20705C();
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo20708n() {
        this.f16926v = true;
        this.f16921q.post(this.f16919o);
    }

    /* renamed from: o */
    public final TrackGroupArray mo20662o() {
        mo20710t();
        return this.f16929y.f16949a;
    }

    /* renamed from: p */
    public final C5754v mo20709p(int i, int i2) {
        return mo20704B(new C5005d(i, false));
    }

    /* renamed from: q */
    public final long mo20663q() {
        long j;
        boolean z;
        long j2;
        mo20710t();
        boolean[] zArr = this.f16929y.f16950b;
        if (this.f16904L) {
            return Long.MIN_VALUE;
        }
        if (mo20713w()) {
            return this.f16901I;
        }
        if (this.f16928x) {
            int length = this.f16924t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i]) {
                    C4956a0 a0Var = this.f16924t[i];
                    synchronized (a0Var) {
                        z = a0Var.f16771x;
                    }
                    if (!z) {
                        C4956a0 a0Var2 = this.f16924t[i];
                        synchronized (a0Var2) {
                            j2 = a0Var2.f16770w;
                        }
                        j = Math.min(j, j2);
                    } else {
                        continue;
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = mo20712v();
        }
        if (j == Long.MIN_VALUE) {
            return this.f16900H;
        }
        return j;
    }

    /* renamed from: r */
    public final void mo20664r(long j, boolean z) {
        long j2;
        int i;
        int i2;
        mo20710t();
        if (!mo20713w()) {
            boolean[] zArr = this.f16929y.f16951c;
            int length = this.f16924t.length;
            for (int i3 = 0; i3 < length; i3++) {
                C4956a0 a0Var = this.f16924t[i3];
                boolean z2 = zArr[i3];
                C5010z zVar = a0Var.f16748a;
                synchronized (a0Var) {
                    int i4 = a0Var.f16764q;
                    j2 = -1;
                    if (i4 != 0) {
                        long[] jArr = a0Var.f16762o;
                        int i5 = a0Var.f16766s;
                        if (j >= jArr[i5]) {
                            if (!z2 || (i2 = a0Var.f16767t) == i4) {
                                i = i4;
                            } else {
                                i = i2 + 1;
                            }
                            int h = a0Var.mo20637h(i5, i, j, z);
                            if (h != -1) {
                                j2 = a0Var.mo20635f(h);
                            }
                        }
                    }
                }
                zVar.mo20723a(j2);
            }
        }
    }

    /* renamed from: s */
    public final void mo20665s(long j) {
    }

    /* renamed from: t */
    public final void mo20710t() {
        C17875h.m44304o(this.f16927w);
        this.f16929y.getClass();
        this.f16930z.getClass();
    }

    /* renamed from: u */
    public final int mo20711u() {
        int i = 0;
        for (C4956a0 a0Var : this.f16924t) {
            i += a0Var.f16765r + a0Var.f16764q;
        }
        return i;
    }

    /* renamed from: v */
    public final long mo20712v() {
        long j;
        long j2 = Long.MIN_VALUE;
        for (C4956a0 a0Var : this.f16924t) {
            synchronized (a0Var) {
                j = a0Var.f16770w;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    /* renamed from: w */
    public final boolean mo20713w() {
        return this.f16901I != -9223372036854775807L;
    }

    /* renamed from: x */
    public final void mo20714x() {
        Format format;
        boolean z;
        Metadata metadata;
        if (!this.f16905M && !this.f16927w && this.f16926v && this.f16930z != null) {
            C4956a0[] a0VarArr = this.f16924t;
            int length = a0VarArr.length;
            int i = 0;
            while (true) {
                Format format2 = null;
                if (i < length) {
                    C4956a0 a0Var = a0VarArr[i];
                    synchronized (a0Var) {
                        if (!a0Var.f16773z) {
                            format2 = a0Var.f16745A;
                        }
                    }
                    if (format2 != null) {
                        i++;
                    } else {
                        return;
                    }
                } else {
                    C21060a aVar = this.f16918n;
                    synchronized (aVar) {
                        aVar.f52862b = false;
                    }
                    int length2 = this.f16924t.length;
                    TrackGroup[] trackGroupArr = new TrackGroup[length2];
                    boolean[] zArr = new boolean[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        C4956a0 a0Var2 = this.f16924t[i2];
                        synchronized (a0Var2) {
                            if (a0Var2.f16773z) {
                                format = null;
                            } else {
                                format = a0Var2.f16745A;
                            }
                        }
                        format.getClass();
                        String str = format.f13418m;
                        boolean h = C6792n.m15995h(str);
                        if (h || C6792n.m15997j(str)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zArr[i2] = z;
                        this.f16928x = z | this.f16928x;
                        IcyHeaders icyHeaders = this.f16923s;
                        if (icyHeaders != null) {
                            if (h || this.f16925u[i2].f16948b) {
                                Metadata metadata2 = format.f13416k;
                                if (metadata2 == null) {
                                    metadata = new Metadata(icyHeaders);
                                } else {
                                    metadata = metadata2.mo16084b(icyHeaders);
                                }
                                Format.C3872b bVar = new Format.C3872b(format);
                                bVar.f13444i = metadata;
                                format = new Format(bVar);
                            }
                            if (h && format.f13412g == -1 && format.f13413h == -1 && icyHeaders.f13895b != -1) {
                                Format.C3872b bVar2 = new Format.C3872b(format);
                                bVar2.f13441f = icyHeaders.f13895b;
                                format = new Format(bVar2);
                            }
                        }
                        Class<? extends C5653b> f = this.f16908d.mo15971f(format);
                        Format.C3872b b = format.mo15797b();
                        b.f13435D = f;
                        trackGroupArr[i2] = new TrackGroup(b.mo15806a());
                    }
                    this.f16929y = new C5006e(new TrackGroupArray(trackGroupArr), zArr);
                    this.f16927w = true;
                    C4984m.C4985a aVar2 = this.f16922r;
                    aVar2.getClass();
                    aVar2.mo20506e(this);
                    return;
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo20715y(int i) {
        mo20710t();
        C5006e eVar = this.f16929y;
        boolean[] zArr = eVar.f16952d;
        if (!zArr[i]) {
            Format format = eVar.f16949a.f14013c[i].f14009c[0];
            C4995u.C4996a aVar = this.f16910f;
            aVar.mo20698b(new C4983l(1, C6792n.m15994g(format.f13418m), format, 0, (Object) null, aVar.mo20697a(this.f16900H), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    /* renamed from: z */
    public final void mo20716z(int i) {
        mo20710t();
        boolean[] zArr = this.f16929y.f16950b;
        if (this.f16902J && zArr[i] && !this.f16924t[i].mo20640k(false)) {
            this.f16901I = 0;
            this.f16902J = false;
            this.f16897E = true;
            this.f16900H = 0;
            this.f16903K = 0;
            for (C4956a0 n : this.f16924t) {
                n.mo20643n(false);
            }
            C4984m.C4985a aVar = this.f16922r;
            aVar.getClass();
            aVar.mo20498a(this);
        }
    }
}
