package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.webkit.MimeTypeMap;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.player.cache.C2954b;
import com.fyber.inneractive.sdk.player.cache.C2956c;
import com.fyber.inneractive.sdk.player.cache.C2964d;
import com.fyber.inneractive.sdk.util.C3684f;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3719o0;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.player.cache.h */
public class C2971h implements C3719o0 {

    /* renamed from: a */
    public String f10169a;

    /* renamed from: b */
    public C2956c f10170b;

    /* renamed from: c */
    public C2956c.C2963f f10171c;

    /* renamed from: d */
    public C2954b f10172d;

    /* renamed from: e */
    public final String f10173e;

    /* renamed from: f */
    public C2953a f10174f;

    /* renamed from: g */
    public C2979h f10175g;

    /* renamed from: h */
    public C2976e f10176h;

    /* renamed from: i */
    public HandlerThread f10177i;

    /* renamed from: j */
    public Handler f10178j;

    /* renamed from: k */
    public final Object f10179k = new Object();

    /* renamed from: l */
    public String f10180l;

    /* renamed from: m */
    public volatile boolean f10181m = false;

    /* renamed from: n */
    public boolean f10182n = false;

    /* renamed from: o */
    public boolean f10183o = false;

    /* renamed from: p */
    public String f10184p = null;

    /* renamed from: q */
    public C2978g f10185q;

    /* renamed from: r */
    public final C2666s f10186r;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$a */
    public class C2972a implements Runnable {
        public C2972a() {
        }

        public void run() {
            C2971h hVar = C2971h.this;
            C2979h hVar2 = hVar.f10175g;
            if (hVar2 != null) {
                ((C2964d.C2965a) hVar2).mo13784a(hVar, hVar.f10174f, (Exception) null);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$b */
    public class C2973b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Exception f10188a;

        public C2973b(Exception exc) {
            this.f10188a = exc;
        }

        public void run() {
            C2971h hVar = C2971h.this;
            C2979h hVar2 = hVar.f10175g;
            if (hVar2 != null) {
                ((C2964d.C2965a) hVar2).mo13784a(hVar, hVar.f10174f, this.f10188a);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$c */
    public class C2974c implements Runnable {
        public C2974c() {
        }

        public void run() {
            C2971h.this.mo13791a(false);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$d */
    public static class C2975d extends Exception {
        public C2975d(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$e */
    public class C2976e extends Thread {

        /* renamed from: a */
        public AtomicBoolean f10191a = new AtomicBoolean(false);

        /* renamed from: b */
        public InputStream f10192b;

        /* renamed from: c */
        public boolean f10193c = false;

        /* renamed from: d */
        public boolean f10194d = false;

        /* renamed from: e */
        public long f10195e = -1;

        /* renamed from: f */
        public long f10196f = 0;

        /* renamed from: g */
        public C2956c.C2959c f10197g;

        /* renamed from: h */
        public int f10198h;

        /* renamed from: i */
        public int f10199i;

        /* renamed from: j */
        public int f10200j;

        /* renamed from: k */
        public int f10201k;

        /* renamed from: l */
        public final /* synthetic */ C2971h f10202l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2976e(C2971h hVar, String str, int i) {
            super(str);
            int i2;
            int i3;
            int i4;
            Class cls = C2649j.class;
            this.f10202l = hVar;
            this.f10198h = i;
            if (hVar.f10186r != null) {
                i2 = ((C2649j) hVar.f10186r.mo13264a(cls)).mo13247d();
            } else {
                i2 = 10;
            }
            this.f10199i = i2;
            if (hVar.f10186r != null) {
                i3 = ((C2649j) hVar.f10186r.mo13264a(cls)).mo13248e();
            } else {
                i3 = 500;
            }
            this.f10200j = i3;
            if (hVar.f10186r != null) {
                i4 = ((C2649j) hVar.f10186r.mo13264a(cls)).mo13252i();
            } else {
                i4 = 25;
            }
            this.f10201k = i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01fa A[EDGE_INSN: B:81:0x01fa->B:78:0x01fa ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.net.HttpURLConnection mo13796a(java.io.OutputStream r25, java.net.URL r26, java.nio.ByteBuffer r27, long r28, int r30) throws java.io.IOException, com.fyber.inneractive.sdk.player.cache.C2971h.C2975d {
            /*
                r24 = this;
                r0 = r24
                java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r1 = com.fyber.inneractive.sdk.config.global.features.C2649j.class
                java.net.URLConnection r2 = r26.openConnection()
                java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)
                java.net.URLConnection r2 = (java.net.URLConnection) r2
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
                r3 = 0
                r5 = 0
                r6 = 1
                int r7 = (r28 > r3 ? 1 : (r28 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x002b
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.Long r9 = java.lang.Long.valueOf(r28)
                r8[r5] = r9
                java.lang.String r9 = "bytes=%d-"
                java.lang.String r8 = java.lang.String.format(r9, r8)
                java.lang.String r9 = "Range"
                r2.addRequestProperty(r9, r8)
            L_0x002b:
                com.fyber.inneractive.sdk.player.cache.h r8 = r0.f10202l
                com.fyber.inneractive.sdk.config.global.s r8 = r8.f10186r
                if (r8 == 0) goto L_0x0061
                com.fyber.inneractive.sdk.config.global.features.e r8 = r8.mo13264a(r1)
                com.fyber.inneractive.sdk.config.global.features.j r8 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r8
                java.lang.String r9 = "url_conn_connection_timeout"
                java.lang.Integer r8 = r8.mo13240b(r9)
                com.fyber.inneractive.sdk.player.cache.h r9 = r0.f10202l
                com.fyber.inneractive.sdk.config.global.s r9 = r9.f10186r
                com.fyber.inneractive.sdk.config.global.features.e r1 = r9.mo13264a(r1)
                com.fyber.inneractive.sdk.config.global.features.j r1 = (com.fyber.inneractive.sdk.config.global.features.C2649j) r1
                java.lang.String r9 = "url_conn_read_timeout"
                java.lang.Integer r1 = r1.mo13240b(r9)
                if (r8 == 0) goto L_0x0058
                int r8 = r8.intValue()
                r2.setConnectTimeout(r8)
            L_0x0058:
                if (r1 == 0) goto L_0x0061
                int r1 = r1.intValue()
                r2.setReadTimeout(r1)
            L_0x0061:
                r2.connect()
                int r1 = r2.getResponseCode()
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.player.cache.h r9 = r0.f10202l
                java.lang.String r10 = r9.f10169a
                r8[r5] = r10
                java.lang.String r9 = r9.mo13788a()
                r8[r6] = r9
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                r10 = 2
                r8[r10] = r9
                java.lang.String r9 = "%s http response code for %s is %d"
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r9, r8)
                r8 = 200(0xc8, float:2.8E-43)
                if (r1 == r8) goto L_0x0099
                r9 = 206(0xce, float:2.89E-43)
                if (r1 == r9) goto L_0x0099
                if (r7 > 0) goto L_0x008e
                goto L_0x0099
            L_0x008e:
                r2.disconnect()
                com.fyber.inneractive.sdk.player.cache.h$d r1 = new com.fyber.inneractive.sdk.player.cache.h$d
                java.lang.String r2 = "HTTP status code != 200"
                r1.<init>(r2)
                throw r1
            L_0x0099:
                int r9 = r2.getContentLength()
                long r11 = (long) r9
                r13 = 36700160(0x2300000, double:1.81322883E-316)
                int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r9 > 0) goto L_0x01fb
                if (r7 > 0) goto L_0x00a9
                r0.f10196f = r11
            L_0x00a9:
                java.io.InputStream r9 = r2.getInputStream()
                r0.f10192b = r9
                r9 = 100
                int r15 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r15 > 0) goto L_0x00b9
                r13 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00be
            L_0x00b9:
                int r13 = r9 / r30
                long r13 = (long) r13
                long r13 = r11 / r13
            L_0x00be:
                if (r15 > 0) goto L_0x00c4
                r5 = 716800(0xaf000, double:3.541463E-318)
                goto L_0x00d0
            L_0x00c4:
                int r15 = r0.f10201k
                int r15 = r30 + r15
                if (r15 <= r9) goto L_0x00cc
                r15 = r30
            L_0x00cc:
                int r9 = r9 / r15
                long r5 = (long) r9
                long r5 = r11 / r5
            L_0x00d0:
                com.fyber.inneractive.sdk.util.d r9 = com.fyber.inneractive.sdk.util.C3676d.f12833b
                r9.getClass()
                if (r27 == 0) goto L_0x00e2
                boolean r9 = r27.hasArray()
                if (r9 == 0) goto L_0x00e2
                byte[] r9 = r27.array()
                goto L_0x00e6
            L_0x00e2:
                r9 = 8192(0x2000, float:1.14794E-41)
                byte[] r9 = new byte[r9]
            L_0x00e6:
                long r11 = r0.f10196f
                int r16 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
                if (r16 <= 0) goto L_0x00f7
                long r11 = r0.f10195e
                r16 = -1
                int r18 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
                if (r18 != 0) goto L_0x00f7
                r0.f10195e = r3
                goto L_0x0139
            L_0x00f7:
                if (r7 <= 0) goto L_0x0139
                if (r1 != r8) goto L_0x0139
                r0.f10195e = r3
                java.lang.Object[] r1 = new java.lang.Object[r10]
                com.fyber.inneractive.sdk.player.cache.h r7 = r0.f10202l
                java.lang.String r8 = r7.f10169a
                r11 = 0
                r1[r11] = r8
                java.lang.String r7 = r7.mo13788a()
                r8 = 1
                r1[r8] = r7
                java.lang.String r7 = "%s | Server rejected Range header for %s | restarting"
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r7, r1)
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r25)
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r0.f10197g
                r1.mo13770a()
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                com.fyber.inneractive.sdk.player.cache.c r7 = r1.f10170b
                java.lang.String r1 = r1.mo13788a()
                r7.mo13763d(r1)
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                com.fyber.inneractive.sdk.player.cache.c r7 = r1.f10170b
                java.lang.String r1 = r1.mo13788a()
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r7.mo13754a((java.lang.String) r1)
                r7 = 0
                java.io.OutputStream r8 = r1.mo13769a(r7)
                r0.f10197g = r1
                goto L_0x013b
            L_0x0139:
                r8 = r25
            L_0x013b:
                java.io.InputStream r1 = r0.f10192b
                int r1 = r1.read(r9)
                r7 = -1
                if (r1 == r7) goto L_0x01fa
                java.util.concurrent.atomic.AtomicBoolean r7 = r0.f10191a
                r11 = 1
                boolean r7 = r7.compareAndSet(r11, r11)
                if (r7 == 0) goto L_0x0163
                java.lang.Object[] r1 = new java.lang.Object[r10]
                com.fyber.inneractive.sdk.player.cache.h r3 = r0.f10202l
                java.lang.String r4 = r3.f10169a
                r7 = 0
                r1[r7] = r4
                java.lang.String r3 = r3.mo13788a()
                r1[r11] = r3
                java.lang.String r3 = "%s | aborting download for cache %s"
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r3, r1)
                goto L_0x01fa
            L_0x0163:
                r7 = 0
                r8.write(r9, r7, r1)
                long r11 = r0.f10195e
                long r3 = (long) r1
                long r11 = r11 + r3
                r0.f10195e = r11
                boolean r1 = r0.f10193c
                if (r1 != 0) goto L_0x0178
                int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r1 >= 0) goto L_0x0176
                goto L_0x0178
            L_0x0176:
                r1 = 1
                goto L_0x0181
            L_0x0178:
                boolean r1 = r0.f10194d
                if (r1 != 0) goto L_0x01f5
                int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x01f5
                goto L_0x0176
            L_0x0181:
                r0.f10193c = r1
                int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r3 < 0) goto L_0x0189
                r0.f10194d = r1
            L_0x0189:
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                com.fyber.inneractive.sdk.player.cache.a r3 = r1.f10174f
                if (r3 != 0) goto L_0x01e1
                java.lang.String r19 = r1.mo13788a()
                com.fyber.inneractive.sdk.player.cache.h r3 = r0.f10202l
                java.lang.String r4 = r3.f10173e
                com.fyber.inneractive.sdk.player.cache.c r7 = r3.f10170b
                java.lang.String r3 = r3.mo13788a()
                r7.mo13756a()
                r7.mo13765e(r3)
                java.util.LinkedHashMap<java.lang.String, com.fyber.inneractive.sdk.player.cache.c$d> r7 = r7.f10129j
                java.lang.Object r3 = r7.get(r3)
                com.fyber.inneractive.sdk.player.cache.c$d r3 = (com.fyber.inneractive.sdk.player.cache.C2956c.C2961d) r3
                if (r3 != 0) goto L_0x01af
                r3 = 0
                goto L_0x01b4
            L_0x01af:
                r7 = 0
                java.io.File r3 = r3.mo13777b(r7)
            L_0x01b4:
                r21 = r3
                com.fyber.inneractive.sdk.player.cache.h r3 = r0.f10202l
                java.lang.String r3 = r3.f10180l
                com.fyber.inneractive.sdk.player.cache.a r7 = new com.fyber.inneractive.sdk.player.cache.a
                r22 = 1
                r18 = r7
                r20 = r4
                r23 = r3
                r18.<init>(r19, r20, r21, r22, r23)
                r1.f10174f = r7
                long r3 = r0.f10196f
                r11 = 0
                int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r1 <= 0) goto L_0x01e3
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                com.fyber.inneractive.sdk.player.cache.a r1 = r1.f10174f
                java.lang.String r3 = java.lang.String.valueOf(r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f10111e
                java.lang.String r4 = "http.file.length"
                r1.put(r4, r3)
                goto L_0x01e3
            L_0x01e1:
                r11 = 0
            L_0x01e3:
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                android.os.Handler r1 = r1.f10178j
                if (r1 == 0) goto L_0x01f7
                r8.flush()
                com.fyber.inneractive.sdk.player.cache.h r1 = r0.f10202l
                android.os.Handler r1 = r1.f10178j
                r3 = 4
                r1.sendEmptyMessage(r3)
                goto L_0x01f7
            L_0x01f5:
                r11 = 0
            L_0x01f7:
                r3 = r11
                goto L_0x013b
            L_0x01fa:
                return r2
            L_0x01fb:
                com.fyber.inneractive.sdk.player.cache.h$f r1 = new com.fyber.inneractive.sdk.player.cache.h$f
                java.lang.Object[] r2 = new java.lang.Object[r10]
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r13)
                r4 = 0
                r2[r4] = r3
                java.text.NumberFormat r3 = java.text.NumberFormat.getInstance()
                java.lang.String r3 = r3.format(r11)
                r4 = 1
                r2[r4] = r3
                java.lang.String r3 = "File size to big for cache (max=%s current=%s)"
                java.lang.String r2 = java.lang.String.format(r3, r2)
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2971h.C2976e.mo13796a(java.io.OutputStream, java.net.URL, java.nio.ByteBuffer, long, int):java.net.HttpURLConnection");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(14:88|89|92|93|94|95|96|97|98|(0)|101|(0)|105|107) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01e0 */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01e6 A[Catch:{ all -> 0x01fd, all -> 0x0206 }] */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x01f2 A[SYNTHETIC, Splitter:B:103:0x01f2] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7 A[Catch:{ f -> 0x00c3, all -> 0x0073, all -> 0x01bd }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9 A[Catch:{ f -> 0x00c3, all -> 0x0073, all -> 0x01bd }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r8 = r22
                java.lang.String r0 = "%s | Starting a fresh download for %s"
                r9 = 2
                java.lang.Object[] r1 = new java.lang.Object[r9]
                com.fyber.inneractive.sdk.player.cache.h r2 = r8.f10202l
                java.lang.String r3 = r2.f10169a
                r10 = 0
                r1[r10] = r3
                java.lang.String r2 = r2.mo13788a()
                r11 = 1
                r1[r11] = r2
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r0, r1)
                com.fyber.inneractive.sdk.util.d r0 = com.fyber.inneractive.sdk.util.C3676d.f12833b
                java.nio.ByteBuffer r12 = r0.mo15347b()
                r13 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r1 = r8.f10202l     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = r1.f10173e     // Catch:{ all -> 0x01c2 }
                r0.<init>(r1)     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = "%s | opening an editor for %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r3 = r8.f10202l     // Catch:{ all -> 0x01c2 }
                java.lang.String r4 = r3.f10169a     // Catch:{ all -> 0x01c2 }
                r2[r10] = r4     // Catch:{ all -> 0x01c2 }
                java.lang.String r3 = r3.mo13788a()     // Catch:{ all -> 0x01c2 }
                r2[r11] = r3     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r1, r2)     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.h r1 = r8.f10202l     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.c r2 = r1.f10170b     // Catch:{ all -> 0x01c2 }
                java.lang.String r1 = r1.mo13788a()     // Catch:{ all -> 0x01c2 }
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r2.mo13754a((java.lang.String) r1)     // Catch:{ all -> 0x01c2 }
                r8.f10197g = r1     // Catch:{ all -> 0x01c2 }
                java.io.OutputStream r14 = r1.mo13769a(r10)     // Catch:{ all -> 0x01c2 }
                int r1 = r8.f10199i     // Catch:{ all -> 0x01bf }
                int r1 = r1 - r11
                r15 = r13
            L_0x0051:
                if (r1 <= 0) goto L_0x00c5
                java.util.concurrent.atomic.AtomicBoolean r2 = r8.f10191a     // Catch:{ all -> 0x01bd }
                boolean r2 = r2.compareAndSet(r10, r10)     // Catch:{ all -> 0x01bd }
                if (r2 == 0) goto L_0x00c5
                if (r15 == 0) goto L_0x0060
                r15.disconnect()     // Catch:{ all -> 0x0060 }
            L_0x0060:
                int r16 = r1 + -1
                long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r5 = r8.f10195e     // Catch:{ f -> 0x00c3, all -> 0x0073 }
                int r7 = r8.f10198h     // Catch:{ f -> 0x00c3, all -> 0x0073 }
                r1 = r22
                r2 = r14
                r3 = r0
                r4 = r12
                java.net.HttpURLConnection r15 = r1.mo13796a(r2, r3, r4, r5, r7)     // Catch:{ f -> 0x00c3, all -> 0x0073 }
            L_0x0073:
                java.io.InputStream r1 = r8.f10192b     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r1)     // Catch:{ all -> 0x01bd }
                java.lang.String r1 = "%s Downloaded %d out of %d for key %s"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.player.cache.h r3 = r8.f10202l     // Catch:{ all -> 0x01bd }
                java.lang.String r3 = r3.f10169a     // Catch:{ all -> 0x01bd }
                r2[r10] = r3     // Catch:{ all -> 0x01bd }
                long r3 = r8.f10195e     // Catch:{ all -> 0x01bd }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01bd }
                r2[r11] = r3     // Catch:{ all -> 0x01bd }
                long r3 = r8.f10196f     // Catch:{ all -> 0x01bd }
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01bd }
                r2[r9] = r3     // Catch:{ all -> 0x01bd }
                r3 = 3
                com.fyber.inneractive.sdk.player.cache.h r4 = r8.f10202l     // Catch:{ all -> 0x01bd }
                java.lang.String r4 = r4.mo13788a()     // Catch:{ all -> 0x01bd }
                r2[r3] = r4     // Catch:{ all -> 0x01bd }
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r1, r2)     // Catch:{ all -> 0x01bd }
                long r1 = r8.f10195e     // Catch:{ all -> 0x01bd }
                long r3 = r8.f10196f     // Catch:{ all -> 0x01bd }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x00a9
                r1 = 0
                goto L_0x0051
            L_0x00a9:
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r1 = r1 - r17
                int r3 = r8.f10200j     // Catch:{ all -> 0x01bd }
                long r3 = (long) r3     // Catch:{ all -> 0x01bd }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x00c0
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01bd }
                long r1 = r1 - r17
                long r3 = r3 - r1
                java.lang.Thread.sleep(r3)     // Catch:{ all -> 0x01bd }
            L_0x00c0:
                r1 = r16
                goto L_0x0051
            L_0x00c3:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x01bd }
            L_0x00c5:
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01bd }
                java.lang.Object r1 = r0.f10179k     // Catch:{ all -> 0x01bd }
                monitor-enter(r1)     // Catch:{ all -> 0x01bd }
                long r2 = r8.f10196f     // Catch:{ all -> 0x01ba }
                long r4 = r8.f10195e     // Catch:{ all -> 0x01ba }
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x016a
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f10191a     // Catch:{ all -> 0x01ba }
                boolean r0 = r0.compareAndSet(r11, r11)     // Catch:{ all -> 0x01ba }
                if (r0 == 0) goto L_0x00dc
                goto L_0x016a
            L_0x00dc:
                java.lang.String r0 = "%s | committing to cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r3 = r8.f10202l     // Catch:{ all -> 0x01ba }
                java.lang.String r4 = r3.f10169a     // Catch:{ all -> 0x01ba }
                r2[r10] = r4     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r3.mo13788a()     // Catch:{ all -> 0x01ba }
                r2[r11] = r3     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r0, r2)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r14)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r2 = r0.f10174f     // Catch:{ all -> 0x01ba }
                if (r2 == 0) goto L_0x0144
                java.lang.Object r2 = r2.f10110d     // Catch:{ all -> 0x01ba }
                monitor-enter(r2)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c$c r0 = r8.f10197g     // Catch:{ all -> 0x0141 }
                boolean r3 = r0.f10138c     // Catch:{ all -> 0x0141 }
                if (r3 == 0) goto L_0x0110
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.C2956c.m7293a((com.fyber.inneractive.sdk.player.cache.C2956c) r3, (com.fyber.inneractive.sdk.player.cache.C2956c.C2959c) r0, (boolean) r10)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c$d r0 = r0.f10136a     // Catch:{ all -> 0x0141 }
                java.lang.String r0 = r0.f10141a     // Catch:{ all -> 0x0141 }
                r3.mo13763d(r0)     // Catch:{ all -> 0x0141 }
                goto L_0x0115
            L_0x0110:
                com.fyber.inneractive.sdk.player.cache.c r3 = com.fyber.inneractive.sdk.player.cache.C2956c.this     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.C2956c.m7293a((com.fyber.inneractive.sdk.player.cache.C2956c) r3, (com.fyber.inneractive.sdk.player.cache.C2956c.C2959c) r0, (boolean) r11)     // Catch:{ all -> 0x0141 }
            L_0x0115:
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r3 = r0.f10170b     // Catch:{ all -> 0x0141 }
                monitor-enter(r3)     // Catch:{ all -> 0x0141 }
                r3.mo13756a()     // Catch:{ all -> 0x013e }
                r3.mo13766f()     // Catch:{ all -> 0x013e }
                java.io.Writer r0 = r3.f10128i     // Catch:{ all -> 0x013e }
                r0.flush()     // Catch:{ all -> 0x013e }
                monitor-exit(r3)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.a r3 = r0.f10174f     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.c r4 = r0.f10170b     // Catch:{ all -> 0x0141 }
                java.lang.String r0 = r0.mo13788a()     // Catch:{ all -> 0x0141 }
                java.io.File r0 = r4.mo13755a(r0, r10)     // Catch:{ all -> 0x0141 }
                r3.f10107a = r0     // Catch:{ all -> 0x0141 }
                monitor-exit(r2)     // Catch:{ all -> 0x0141 }
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r0 = r0.f10174f     // Catch:{ all -> 0x01ba }
                r0.f10109c = r10     // Catch:{ all -> 0x01ba }
                goto L_0x018d
            L_0x013e:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0141 }
                throw r0     // Catch:{ all -> 0x0141 }
            L_0x0141:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0141 }
                throw r0     // Catch:{ all -> 0x01ba }
            L_0x0144:
                java.lang.String r17 = r0.mo13788a()     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r2 = r8.f10202l     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r2.f10173e     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c r4 = r2.f10170b     // Catch:{ all -> 0x01ba }
                java.lang.String r2 = r2.mo13788a()     // Catch:{ all -> 0x01ba }
                java.io.File r19 = r4.mo13755a(r2, r10)     // Catch:{ all -> 0x01ba }
                r20 = 1
                com.fyber.inneractive.sdk.player.cache.h r2 = r8.f10202l     // Catch:{ all -> 0x01ba }
                java.lang.String r2 = r2.f10180l     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.a r4 = new com.fyber.inneractive.sdk.player.cache.a     // Catch:{ all -> 0x01ba }
                r16 = r4
                r18 = r3
                r21 = r2
                r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ba }
                r0.f10174f = r4     // Catch:{ all -> 0x01ba }
                goto L_0x018d
            L_0x016a:
                com.fyber.inneractive.sdk.player.cache.c$c r0 = r8.f10197g     // Catch:{ all -> 0x01ba }
                r0.mo13770a()     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.c r2 = r0.f10170b     // Catch:{ all -> 0x01ba }
                java.lang.String r0 = r0.mo13788a()     // Catch:{ all -> 0x01ba }
                r2.mo13763d(r0)     // Catch:{ all -> 0x01ba }
                java.lang.String r0 = "%s | aborting cache - %s"
                java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r3 = r8.f10202l     // Catch:{ all -> 0x01ba }
                java.lang.String r4 = r3.f10169a     // Catch:{ all -> 0x01ba }
                r2[r10] = r4     // Catch:{ all -> 0x01ba }
                java.lang.String r3 = r3.mo13788a()     // Catch:{ all -> 0x01ba }
                r2[r11] = r3     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.util.IAlog.m9905d(r0, r2)     // Catch:{ all -> 0x01ba }
            L_0x018d:
                monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01bd }
                boolean unused = r0.f10183o = r10     // Catch:{ all -> 0x01bd }
                if (r15 == 0) goto L_0x0198
                r15.disconnect()     // Catch:{ all -> 0x01bd }
            L_0x0198:
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.f10191a     // Catch:{ all -> 0x01bd }
                boolean r0 = r0.compareAndSet(r10, r10)     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x01b1
                com.fyber.inneractive.sdk.player.cache.h r0 = r8.f10202l     // Catch:{ all -> 0x01bd }
                android.os.Handler r0 = r0.f10178j     // Catch:{ all -> 0x01bd }
                if (r0 == 0) goto L_0x01b1
                long r1 = r8.f10195e     // Catch:{ all -> 0x01bd }
                long r3 = r8.f10196f     // Catch:{ all -> 0x01bd }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 < 0) goto L_0x01b1
                r0.sendEmptyMessage(r9)     // Catch:{ all -> 0x01bd }
            L_0x01b1:
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01f5
                r15.disconnect()     // Catch:{ all -> 0x01f5 }
                goto L_0x01f5
            L_0x01ba:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x01ba }
                throw r0     // Catch:{ all -> 0x01bd }
            L_0x01bd:
                r0 = move-exception
                goto L_0x01c5
            L_0x01bf:
                r0 = move-exception
                r15 = r13
                goto L_0x01c5
            L_0x01c2:
                r0 = move-exception
                r14 = r13
                r15 = r14
            L_0x01c5:
                java.lang.String r1 = "%s | mDownloadRunnable exception raised during download"
                java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.player.cache.h r3 = r8.f10202l     // Catch:{ all -> 0x01fd }
                java.lang.String r3 = r3.f10169a     // Catch:{ all -> 0x01fd }
                r2[r10] = r3     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.util.IAlog.m9901a(r1, r0, r2)     // Catch:{ all -> 0x01fd }
                java.lang.String r1 = "mDownloadRunnable exception raised during download"
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.network.C2931r.m7253a(r1, r2, r13, r13)     // Catch:{ all -> 0x01fd }
                com.fyber.inneractive.sdk.player.cache.c$c r1 = r8.f10197g     // Catch:{ Exception -> 0x01e0 }
                r1.mo13770a()     // Catch:{ Exception -> 0x01e0 }
            L_0x01e0:
                com.fyber.inneractive.sdk.player.cache.h r1 = r8.f10202l     // Catch:{ all -> 0x01fd }
                android.os.Handler r1 = r1.f10178j     // Catch:{ all -> 0x01fd }
                if (r1 == 0) goto L_0x01ed
                android.os.Message r0 = r1.obtainMessage(r11, r0)     // Catch:{ all -> 0x01fd }
                r1.sendMessage(r0)     // Catch:{ all -> 0x01fd }
            L_0x01ed:
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x01f5
                r15.disconnect()     // Catch:{ all -> 0x01f5 }
            L_0x01f5:
                com.fyber.inneractive.sdk.util.d r0 = com.fyber.inneractive.sdk.util.C3676d.f12833b
                java.util.Queue<java.nio.ByteBuffer> r0 = r0.f12834a
                r0.offer(r12)
                return
            L_0x01fd:
                r0 = move-exception
                com.fyber.inneractive.sdk.player.cache.C2985m.m7338a((java.io.Closeable) r14)
                if (r15 == 0) goto L_0x0206
                r15.disconnect()     // Catch:{ all -> 0x0206 }
            L_0x0206:
                com.fyber.inneractive.sdk.util.d r1 = com.fyber.inneractive.sdk.util.C3676d.f12833b
                java.util.Queue<java.nio.ByteBuffer> r1 = r1.f12834a
                r1.offer(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2971h.C2976e.run():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$f */
    public static class C2977f extends C2975d {
        public C2977f(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$g */
    public interface C2978g {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.h$h */
    public interface C2979h {
    }

    public C2971h(C2956c cVar, String str, C2954b bVar, int i, C2666s sVar) {
        StringBuilder k = C13555b.m33972k("MediaDownloader-");
        k.append(hashCode());
        this.f10169a = k.toString();
        this.f10170b = cVar;
        this.f10173e = str;
        this.f10180l = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase(Locale.US));
        this.f10172d = bVar;
        this.f10186r = sVar;
        this.f10176h = new C2976e(this, String.format("MediaDownloader-%s-A", new Object[]{mo13788a()}), i);
        this.f10177i = new HandlerThread(String.format("MediaDownloader-%s-A", new Object[]{mo13788a()}));
    }

    /* renamed from: b */
    public final void mo13792b() {
        C3714n.f12902b.post(new C2972a());
    }

    public void handleMessage(Message message) {
        if (message.what != 4 || this.f10174f.f10112f) {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof Exception) {
                    mo13790a((Exception) obj);
                } else {
                    mo13790a((Exception) new C2975d("download failed"));
                }
                mo13791a(false);
            } else if (i == 2) {
                if (this.f10181m) {
                    synchronized (this.f10179k) {
                        IAlog.m9905d("%s | reading from cache 2 - %s", this.f10169a, mo13788a());
                        if (this.f10172d.mo13753a(this.f10174f, this.f10180l) == C2954b.C2955a.INVALID) {
                            mo13790a((Exception) new C2975d("Failed cache validation after downloading complete file"));
                            mo13791a(true);
                        } else {
                            mo13789a(this.f10174f);
                            C2953a aVar = this.f10174f;
                            aVar.f10111e.putAll(this.f10172d.f10113a);
                            mo13792b();
                        }
                    }
                } else {
                    C3714n.f12902b.post(new C2974c());
                }
                IAlog.m9905d("%s | Download success for cache key %s", this.f10169a, mo13788a());
            }
        } else {
            synchronized (this.f10179k) {
                IAlog.m9905d("%s | reading from cache 1 - %s", this.f10169a, mo13788a());
                C2954b.C2955a a = this.f10172d.mo13753a(this.f10174f, this.f10180l);
                if (a == C2954b.C2955a.INVALID) {
                    mo13790a((Exception) new C2975d("Failed cache validation"));
                    mo13791a(true);
                } else if (a == C2954b.C2955a.PARTIAL_CANNOT_VALIDATE) {
                    this.f10181m = true;
                } else {
                    this.f10174f.f10112f = true;
                    mo13789a(this.f10174f);
                    C2953a aVar2 = this.f10174f;
                    aVar2.f10111e.putAll(this.f10172d.f10113a);
                    mo13792b();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m7324b(C2971h hVar, boolean z) {
        C2970g gVar = new C2970g(hVar);
        Handler handler = hVar.f10178j;
        if (handler == null) {
            return;
        }
        if (z) {
            handler.postAtFrontOfQueue(gVar);
        } else {
            handler.postDelayed(gVar, 4);
        }
    }

    /* renamed from: a */
    public final void mo13790a(Exception exc) {
        C3714n.f12902b.post(new C2973b(exc));
    }

    /* renamed from: a */
    public final void mo13791a(boolean z) {
        C2976e eVar = this.f10176h;
        if (eVar != null) {
            eVar.f10191a.compareAndSet(false, true);
            this.f10176h = null;
        }
        HandlerThread handlerThread = this.f10177i;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f10178j = null;
        if (z) {
            try {
                this.f10170b.mo13763d(mo13788a());
            } catch (IOException e) {
                IAlog.m9901a("failed to remove cache key", e, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public String mo13788a() {
        String str = "";
        if (this.f10184p == null) {
            String str2 = this.f10173e;
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(str2.getBytes());
                byte[] digest = instance.digest();
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : digest) {
                    stringBuffer.append(Integer.toHexString((b & 255) | 256).substring(1));
                }
                str = stringBuffer.toString();
            } catch (NoSuchAlgorithmException unused) {
                try {
                    MessageDigest instance2 = MessageDigest.getInstance("MD5");
                    instance2.update(str2.getBytes());
                    byte[] digest2 = instance2.digest();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    for (byte b2 : digest2) {
                        stringBuffer2.append(Integer.toHexString((b2 & 255) | 256).substring(1));
                    }
                    str = stringBuffer2.toString();
                } catch (NoSuchAlgorithmException unused2) {
                    str = str2.replaceAll("\\W+", str);
                }
            } catch (NullPointerException unused3) {
            }
            this.f10184p = str;
        }
        return this.f10184p;
    }

    /* renamed from: a */
    public final void mo13789a(C2953a aVar) {
        C2978g gVar;
        if (aVar != null && (gVar = this.f10185q) != null) {
            File a = aVar.mo13752a();
            File file = ((C3684f) gVar).f12854a;
            if (!((file == null || a == null || !file.getAbsolutePath().equals(a.getAbsolutePath())) ? false : true)) {
                C2978g gVar2 = this.f10185q;
                File a2 = aVar.mo13752a();
                C3684f fVar = (C3684f) gVar2;
                fVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(a2.getPath());
                    mediaMetadataRetriever.extractMetadata(8192);
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1);
                    fVar.f12855b = frameAtTime;
                    if (frameAtTime != null && frameAtTime.getWidth() > 0 && fVar.f12855b.getHeight() > 0) {
                        fVar.f12854a = a2;
                    }
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    try {
                        IAlog.m9902a("Failed getting frame from video file%s", C3727s.m9990a((Throwable) e));
                        mediaMetadataRetriever.release();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
                IAlog.m9905d("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return;
            }
            return;
        }
        return;
        throw th;
    }
}
