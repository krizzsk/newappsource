package com.fyber.inneractive.sdk.player.cache;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.player.cache.C2971h;
import com.fyber.inneractive.sdk.player.controller.C2992d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.util.C3684f;
import com.fyber.inneractive.sdk.util.C3717n0;
import com.fyber.inneractive.sdk.util.C3727s;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.cache.d */
public class C2964d implements C3353g {

    /* renamed from: a */
    public boolean f10148a = false;

    /* renamed from: b */
    public C2953a f10149b;

    /* renamed from: c */
    public C2971h f10150c;

    /* renamed from: d */
    public Uri f10151d;

    /* renamed from: e */
    public long f10152e = 0;

    /* renamed from: f */
    public FileInputStream f10153f;

    /* renamed from: g */
    public FileInputStream f10154g;

    /* renamed from: h */
    public C2966b f10155h;

    /* renamed from: i */
    public C2967c f10156i;

    /* renamed from: j */
    public int f10157j;

    /* renamed from: k */
    public C2666s f10158k;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$a */
    public class C2965a implements C2971h.C2979h {

        /* renamed from: a */
        public final /* synthetic */ C3684f f10159a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f10160b;

        /* renamed from: c */
        public final /* synthetic */ CountDownLatch f10161c;

        public C2965a(C3684f fVar, AtomicReference atomicReference, CountDownLatch countDownLatch) {
            this.f10159a = fVar;
            this.f10160b = atomicReference;
            this.f10161c = countDownLatch;
        }

        /* renamed from: a */
        public void mo13784a(C2971h hVar, C2953a aVar, Exception exc) {
            C2966b bVar;
            C2964d dVar = C2964d.this;
            if (!dVar.f10148a) {
                if (exc == null) {
                    Bitmap bitmap = this.f10159a.f12855b;
                    if (!(bitmap == null || (bVar = dVar.f10155h) == null)) {
                        ((C2992d) bVar).f10232C = bitmap;
                    }
                    dVar.f10149b = aVar;
                } else {
                    this.f10160b.set(exc);
                }
            }
            this.f10161c.countDown();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$b */
    public interface C2966b {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.d$c */
    public interface C2967c {
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws IOException {
        String str;
        C2649j jVar2;
        C2954b bVar;
        C2649j.C2653d dVar;
        C3357j jVar3 = jVar;
        if (this.f10149b == null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            AtomicReference atomicReference = new AtomicReference();
            C3684f fVar = new C3684f();
            Uri uri = jVar3.f12004a;
            this.f10151d = uri;
            C2986n nVar = C2986n.f10211f;
            int i = this.f10157j;
            String uri2 = uri.toString();
            C2666s sVar = this.f10158k;
            C2965a aVar = new C2965a(fVar, atomicReference, countDownLatch);
            C2956c cVar = nVar.f10213b;
            boolean a = IAConfigManager.f9202J.f9234v.f9337b.mo13273a("validateHasVideoTracks", false);
            if (sVar == null) {
                jVar2 = null;
            } else {
                jVar2 = (C2649j) sVar.mo13264a(C2649j.class);
            }
            if (jVar2 != null) {
                C2649j.C2653d dVar2 = C2649j.C2653d.LEGACY;
                String a2 = jVar2.mo13237a("v_type", "legacy");
                C2649j.C2653d[] values = C2649j.C2653d.values();
                int length = values.length;
                C2649j.C2653d dVar3 = dVar2;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = dVar3;
                        break;
                    }
                    int i3 = length;
                    C2649j.C2653d dVar4 = values[i2];
                    C2649j.C2653d[] dVarArr = values;
                    C2649j.C2653d dVar5 = dVar4;
                    if (TextUtils.equals(dVar4.f9316a, a2.toLowerCase(Locale.US))) {
                        dVar = dVar5;
                        break;
                    }
                    i2++;
                    length = i3;
                    values = dVarArr;
                }
                int ordinal = dVar.ordinal();
                if (ordinal == 1) {
                    bVar = new C2980i();
                } else if (ordinal != 2) {
                    bVar = new C2981j(a);
                } else {
                    bVar = new C2982k();
                }
            } else {
                bVar = new C2981j(a);
            }
            C2971h hVar = new C2971h(cVar, uri2, bVar, i, sVar);
            hVar.f10175g = aVar;
            nVar.f10215d.add(hVar.mo13788a());
            this.f10150c = hVar;
            hVar.f10185q = fVar;
            hVar.f10183o = true;
            HandlerThread handlerThread = hVar.f10177i;
            if (handlerThread != null) {
                handlerThread.start();
                C3717n0 n0Var = new C3717n0(hVar.f10177i.getLooper(), hVar);
                hVar.f10178j = n0Var;
                n0Var.post(new C2969f(hVar));
            }
            C2967c cVar2 = this.f10156i;
            if (cVar2 != null) {
                ((C2992d) cVar2).f10235F.add(this.f10150c);
            }
            try {
                countDownLatch.await(7, TimeUnit.SECONDS);
                if (this.f10149b == null) {
                    if (atomicReference.get() == null) {
                        throw new IOException("Cache has failed to download");
                    }
                    throw new IOException((Throwable) atomicReference.get());
                }
            } catch (InterruptedException e) {
                C2971h hVar2 = this.f10150c;
                hVar2.mo13791a(hVar2.f10183o);
                throw new IOException(e);
            }
        }
        this.f10152e = jVar3.f12007d;
        C2953a aVar2 = this.f10149b;
        if (aVar2.f10109c) {
            str = aVar2.f10111e.get("http.file.length");
        } else {
            str = String.valueOf(aVar2.mo13752a().length());
        }
        if (str == null || !TextUtils.isDigitsOnly(str)) {
            return -1;
        }
        return Long.parseLong(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:7|(2:10|8)|48|11|12|13|29|30|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[SYNTHETIC, Splitter:B:24:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo13782b(byte[] r12, int r13, int r14) throws java.io.IOException {
        /*
            r11 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r11.f10149b
            java.lang.String r0 = r0.f10108b
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            int r2 = r12.length
            r1.<init>(r2)
            long r2 = r11.f10152e
            int r3 = (int) r2
            com.fyber.inneractive.sdk.util.d r2 = com.fyber.inneractive.sdk.util.C3676d.f12833b
            java.nio.ByteBuffer r2 = r2.mo15347b()
            r4 = 0
            r5 = 0
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            java.net.URLConnection r0 = r6.openConnection()     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x008a, all -> 0x0074 }
            java.lang.String r6 = "Range"
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.lang.String r8 = "bytes=%d-"
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r9[r4] = r3     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.lang.String r3 = java.lang.String.format(r7, r8, r9)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r0.setRequestProperty(r6, r3)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r0.connect()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            int r3 = r0.getResponseCode()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r6 = 206(0xce, float:2.89E-43)
            if (r3 != r6) goto L_0x0064
            java.io.InputStream r5 = r0.getInputStream()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            byte[] r2 = r2.array()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
        L_0x004f:
            int r3 = r5.read(r2)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r6 = -1
            if (r3 == r6) goto L_0x005a
            r1.write(r2)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            goto L_0x004f
        L_0x005a:
            r5.close()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r0.disconnect()     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            r0.disconnect()     // Catch:{ Exception -> 0x007f }
            goto L_0x007f
        L_0x0064:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            java.lang.String r3 = "Server did not reply with proper range."
            r2.<init>(r3)     // Catch:{ IOException -> 0x0070, all -> 0x006c }
            throw r2     // Catch:{ IOException -> 0x0070, all -> 0x006c }
        L_0x006c:
            r10 = r5
            r5 = r0
            r0 = r10
            goto L_0x0075
        L_0x0070:
            r12 = move-exception
            r13 = r5
            r5 = r0
            goto L_0x008c
        L_0x0074:
            r0 = r5
        L_0x0075:
            if (r5 == 0) goto L_0x007c
            r5.disconnect()     // Catch:{ Exception -> 0x007b }
            goto L_0x007c
        L_0x007b:
        L_0x007c:
            if (r0 == 0) goto L_0x0082
            r5 = r0
        L_0x007f:
            r5.close()     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            byte[] r0 = r1.toByteArray()
            java.lang.System.arraycopy(r0, r4, r12, r13, r14)
            return r14
        L_0x008a:
            r12 = move-exception
            r13 = r5
        L_0x008c:
            throw r12     // Catch:{ all -> 0x008d }
        L_0x008d:
            r12 = move-exception
            if (r5 == 0) goto L_0x0095
            r5.disconnect()     // Catch:{ Exception -> 0x0094 }
            goto L_0x0095
        L_0x0094:
        L_0x0095:
            if (r13 == 0) goto L_0x009a
            r13.close()     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2964d.mo13782b(byte[], int, int):int");
    }

    public void close() throws IOException {
        this.f10148a = true;
        this.f10152e = 0;
        C3727s.m9995b(this.f10153f);
        C3727s.m9995b(this.f10154g);
        this.f10153f = null;
        this.f10154g = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098 A[Catch:{ InterruptedException -> 0x003e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13779a(byte[] r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.cache.a r0 = r9.f10149b
            if (r0 != 0) goto L_0x0006
            r10 = -1
            return r10
        L_0x0006:
            if (r12 != 0) goto L_0x0009
            return r12
        L_0x0009:
            java.lang.Object r0 = r0.f10110d
            monitor-enter(r0)
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f10149b     // Catch:{ all -> 0x00b6 }
            java.io.File r1 = r1.mo13752a()     // Catch:{ all -> 0x00b6 }
            long r1 = r1.length()     // Catch:{ all -> 0x00b6 }
            int r2 = (int) r1     // Catch:{ all -> 0x00b6 }
            if (r11 <= r2) goto L_0x001f
            int r10 = r9.mo13782b(r10, r11, r12)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r10
        L_0x001f:
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f10149b     // Catch:{ all -> 0x00b6 }
            boolean r1 = r1.f10109c     // Catch:{ all -> 0x00b6 }
            r3 = 0
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0058
        L_0x0029:
            int r1 = r2 - r11
            if (r1 > 0) goto L_0x0045
            r1 = 50
            r9.wait(r3, r1)     // Catch:{ InterruptedException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.a r1 = r9.f10149b     // Catch:{ all -> 0x00b6 }
            java.io.File r1 = r1.mo13752a()     // Catch:{ all -> 0x00b6 }
            long r1 = r1.length()     // Catch:{ all -> 0x00b6 }
            int r2 = (int) r1     // Catch:{ all -> 0x00b6 }
            goto L_0x0029
        L_0x003e:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            r11.<init>(r10)     // Catch:{ all -> 0x00b6 }
            throw r11     // Catch:{ all -> 0x00b6 }
        L_0x0045:
            java.io.FileInputStream r1 = r9.f10154g     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x007f
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f10149b     // Catch:{ all -> 0x00b6 }
            java.io.File r5 = r5.mo13752a()     // Catch:{ all -> 0x00b6 }
            r1.<init>(r5)     // Catch:{ all -> 0x00b6 }
            r9.f10154g = r1     // Catch:{ all -> 0x00b6 }
        L_0x0056:
            r5 = 1
            goto L_0x007f
        L_0x0058:
            java.io.FileInputStream r1 = r9.f10153f     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x007f
            java.lang.String r1 = "%s creating a single instance of fis"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b6 }
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x00b6 }
            r7[r5] = r8     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r7)     // Catch:{ all -> 0x00b6 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.player.cache.a r5 = r9.f10149b     // Catch:{ all -> 0x00b6 }
            java.io.File r5 = r5.mo13752a()     // Catch:{ all -> 0x00b6 }
            r1.<init>(r5)     // Catch:{ all -> 0x00b6 }
            r9.f10153f = r1     // Catch:{ all -> 0x00b6 }
            java.io.FileInputStream r1 = r9.f10154g     // Catch:{ all -> 0x00b6 }
            com.fyber.inneractive.sdk.util.C3727s.m9995b(r1)     // Catch:{ all -> 0x00b6 }
            r1 = 0
            r9.f10154g = r1     // Catch:{ all -> 0x00b6 }
            goto L_0x0056
        L_0x007f:
            java.io.FileInputStream r1 = r9.f10153f     // Catch:{ all -> 0x00b6 }
            if (r1 != 0) goto L_0x0085
            java.io.FileInputStream r1 = r9.f10154g     // Catch:{ all -> 0x00b6 }
        L_0x0085:
            long r6 = r9.f10152e     // Catch:{ all -> 0x00b6 }
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a0
            if (r5 == 0) goto L_0x00a0
            long r3 = r1.skip(r6)     // Catch:{ all -> 0x00b6 }
            long r5 = r9.f10152e     // Catch:{ all -> 0x00b6 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0098
            goto L_0x00a0
        L_0x0098:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
            java.lang.String r11 = "Failed to skip the stream"
            r10.<init>(r11)     // Catch:{ all -> 0x00b6 }
            throw r10     // Catch:{ all -> 0x00b6 }
        L_0x00a0:
            int r2 = r2 - r11
            int r3 = r10.length     // Catch:{ all -> 0x00b6 }
            int r2 = java.lang.Math.min(r3, r2)     // Catch:{ all -> 0x00b6 }
            int r12 = java.lang.Math.min(r2, r12)     // Catch:{ all -> 0x00b6 }
            int r10 = r1.read(r10, r11, r12)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            long r11 = r9.f10152e
            long r0 = (long) r10
            long r11 = r11 + r0
            r9.f10152e = r11
            return r10
        L_0x00b6:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2964d.mo13779a(byte[], int, int):int");
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f10151d;
    }
}
