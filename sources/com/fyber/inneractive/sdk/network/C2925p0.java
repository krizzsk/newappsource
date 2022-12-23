package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import hi0.C23529c0;
import hi0.C23536e0;
import hi0.C23566v;
import hi0.C23571x;

/* renamed from: com.fyber.inneractive.sdk.network.p0 */
public class C2925p0 extends C2903h implements C2901g {

    /* renamed from: a */
    public final C23566v f10037a = new C23566v();

    /* renamed from: b */
    public C23529c0 f10038b = null;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0102  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.fyber.inneractive.sdk.network.C2908j mo13697a(com.fyber.inneractive.sdk.network.C2889b0<T> r11, java.lang.String r12, java.lang.String r13) throws java.lang.Exception {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "OkHttpExecutorImpl"
            r0[r1] = r2
            java.lang.String r2 = "%s okhttp network stack is in use"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r2, r0)
            hi0.x$a r0 = new hi0.x$a
            r0.<init>()
            java.lang.String r2 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r10.mo13715a((hi0.C23571x.C23572a) r0, (java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "User-Agent"
            r10.mo13715a((hi0.C23571x.C23572a) r0, (java.lang.String) r2, (java.lang.String) r12)
            java.lang.String r12 = "If-Modified-Since"
            r10.mo13715a((hi0.C23571x.C23572a) r0, (java.lang.String) r12, (java.lang.String) r13)
            java.util.Map r12 = r11.mo13681q()
            if (r12 == 0) goto L_0x0047
            java.util.Set r13 = r12.keySet()
            java.util.Iterator r13 = r13.iterator()
        L_0x0031:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r12.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r10.mo13715a((hi0.C23571x.C23572a) r0, (java.lang.String) r2, (java.lang.String) r4)
            goto L_0x0031
        L_0x0047:
            java.lang.String r12 = r11.mo13664a()
            r0.mo58731e(r12)
            com.fyber.inneractive.sdk.network.y r12 = r11.mo13679n()
            com.fyber.inneractive.sdk.network.y r13 = com.fyber.inneractive.sdk.network.C2943y.POST
            if (r12 == r13) goto L_0x005e
            com.fyber.inneractive.sdk.network.y r12 = r11.mo13679n()
            com.fyber.inneractive.sdk.network.y r13 = com.fyber.inneractive.sdk.network.C2943y.PUT
            if (r12 != r13) goto L_0x0073
        L_0x005e:
            byte[] r12 = r11.mo13676k()
            if (r12 == 0) goto L_0x0109
            java.lang.String r13 = "application/json; charset=utf-8"
            hi0.t r13 = hi0.C23562t.m57743c(r13)
            hi0.b0 r12 = hi0.C23521b0.create(r12, r13)
            java.lang.String r13 = "POST"
            r0.mo58728b(r13, r12)
        L_0x0073:
            hi0.x r12 = r0.mo58727a()
            com.fyber.inneractive.sdk.network.o0 r11 = r11.mo13674i()
            hi0.v r13 = r10.f10037a
            r13.getClass()
            hi0.v$b r0 = new hi0.v$b
            r0.<init>(r13)
            int r13 = r11.f10010a
            long r4 = (long) r13
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.mo58716b(r4, r13)
            int r11 = r11.f10011b
            long r4 = (long) r11
            r0.mo58717c(r4, r13)
            hi0.v r11 = new hi0.v
            r11.<init>(r0)
            hi0.v r11 = r10.f10037a
            r11.getClass()
            hi0.w r11 = hi0.C23569w.m57753i(r11, r12, r1)
            hi0.c0 r11 = r11.mo58720g()
            r10.f10038b = r11
            int r6 = r11.f59412d
            java.lang.String r7 = r11.f59413e
            r12 = 0
            hi0.e0 r13 = r11.f59416h     // Catch:{ Exception -> 0x00ce }
            if (r13 == 0) goto L_0x00cf
            java.lang.String r13 = "content-encoding"
            hi0.q r11 = r11.f59415g     // Catch:{ Exception -> 0x00ce }
            java.lang.String r11 = r11.mo58682c(r13)     // Catch:{ Exception -> 0x00ce }
            boolean r11 = android.text.TextUtils.equals(r3, r11)     // Catch:{ Exception -> 0x00ce }
            hi0.c0 r13 = r10.f10038b     // Catch:{ Exception -> 0x00ce }
            hi0.e0 r13 = r13.f59416h     // Catch:{ Exception -> 0x00ce }
            si0.i r13 = r13.mo53600t()     // Catch:{ Exception -> 0x00ce }
            java.io.InputStream r13 = r13.mo61411h2()     // Catch:{ Exception -> 0x00ce }
            java.io.InputStream r11 = r10.mo13700a(r13, r11)     // Catch:{ Exception -> 0x00ce }
            r5 = r11
            goto L_0x00d0
        L_0x00ce:
        L_0x00cf:
            r5 = r12
        L_0x00d0:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            hi0.c0 r11 = r10.f10038b
            if (r11 == 0) goto L_0x00f4
            hi0.q r11 = r11.f59415g
        L_0x00db:
            java.lang.String[] r13 = r11.f59531a
            int r13 = r13.length
            int r13 = r13 / 2
            if (r1 >= r13) goto L_0x00f4
            java.lang.String r13 = r11.mo58683d(r1)
            java.lang.String r0 = r11.mo58682c(r13)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r8.put(r13, r0)
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00f4:
            hi0.c0 r11 = r10.f10038b
            if (r11 == 0) goto L_0x0102
            hi0.q r11 = r11.f59415g
            java.lang.String r12 = "Last-Modified"
            java.lang.String r11 = r11.mo58682c(r12)
            r9 = r11
            goto L_0x0103
        L_0x0102:
            r9 = r12
        L_0x0103:
            r4 = r10
            com.fyber.inneractive.sdk.network.j r11 = r4.mo13699a(r5, r6, r7, r8, r9)
            return r11
        L_0x0109:
            java.lang.Exception r11 = new java.lang.Exception
            java.lang.String r12 = "Could not create ok http request. post payload is null"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2925p0.mo13697a(com.fyber.inneractive.sdk.network.b0, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.network.j");
    }

    /* renamed from: b */
    public void mo13698b() {
        try {
            C23529c0 c0Var = this.f10038b;
            if (c0Var != null) {
                c0Var.close();
                C23536e0 e0Var = this.f10038b.f59416h;
                if (e0Var != null) {
                    e0Var.close();
                }
            }
        } catch (Throwable th) {
            IAlog.m9902a("%s exception during disconnect with exception %s", "OkHttpExecutorImpl", th);
        }
        this.f10038b = null;
    }

    /* renamed from: a */
    public final void mo13715a(C23571x.C23572a aVar, String str, String str2) {
        IAlog.m9900a(1, (Exception) null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            aVar.f59644c.mo58690a(str, str2);
        }
    }
}
