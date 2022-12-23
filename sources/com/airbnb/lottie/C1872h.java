package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.h */
public final class C1872h implements Callable<C1904r<C1867f>> {

    /* renamed from: b */
    public final /* synthetic */ Context f6469b;

    /* renamed from: c */
    public final /* synthetic */ String f6470c;

    /* renamed from: d */
    public final /* synthetic */ String f6471d;

    public C1872h(Context context, String str, String str2) {
        this.f6469b = context;
        this.f6470c = str;
        this.f6471d = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r10 = this;
            android.content.Context r0 = r10.f6469b
            f5.e r1 = p584jl.C17885a.f45881c
            if (r1 != 0) goto L_0x003f
            java.lang.Class<f5.e> r2 = p083f5.C4686e.class
            monitor-enter(r2)
            f5.e r1 = p584jl.C17885a.f45881c     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003a
            f5.e r1 = new f5.e     // Catch:{ all -> 0x003c }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x003c }
            f5.d r3 = p584jl.C17885a.f45882d     // Catch:{ all -> 0x003c }
            if (r3 != 0) goto L_0x0030
            java.lang.Class<f5.d> r3 = p083f5.C4685d.class
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            f5.d r4 = p584jl.C17885a.f45882d     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002a
            f5.d r4 = new f5.d     // Catch:{ all -> 0x002d }
            com.airbnb.lottie.c r5 = new com.airbnb.lottie.c     // Catch:{ all -> 0x002d }
            r5.<init>(r0)     // Catch:{ all -> 0x002d }
            r4.<init>(r5)     // Catch:{ all -> 0x002d }
            p584jl.C17885a.f45882d = r4     // Catch:{ all -> 0x002d }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            r3 = r4
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0030:
            f5.b r0 = new f5.b     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x003c }
            p584jl.C17885a.f45881c = r1     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            java.lang.String r0 = r10.f6470c
            java.lang.String r2 = r10.f6471d
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0049
            goto L_0x00c3
        L_0x0049:
            f5.d r5 = r1.f15952a
            r5.getClass()
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x009d }
            java.io.File r7 = r5.mo20204b()     // Catch:{ FileNotFoundException -> 0x009d }
            com.airbnb.lottie.network.FileExtension r8 = com.airbnb.lottie.network.FileExtension.JSON     // Catch:{ FileNotFoundException -> 0x009d }
            java.lang.String r9 = p083f5.C4685d.m11992a(r0, r8, r4)     // Catch:{ FileNotFoundException -> 0x009d }
            r6.<init>(r7, r9)     // Catch:{ FileNotFoundException -> 0x009d }
            boolean r7 = r6.exists()     // Catch:{ FileNotFoundException -> 0x009d }
            if (r7 == 0) goto L_0x0064
            goto L_0x007b
        L_0x0064:
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x009d }
            java.io.File r5 = r5.mo20204b()     // Catch:{ FileNotFoundException -> 0x009d }
            com.airbnb.lottie.network.FileExtension r7 = com.airbnb.lottie.network.FileExtension.ZIP     // Catch:{ FileNotFoundException -> 0x009d }
            java.lang.String r7 = p083f5.C4685d.m11992a(r0, r7, r4)     // Catch:{ FileNotFoundException -> 0x009d }
            r6.<init>(r5, r7)     // Catch:{ FileNotFoundException -> 0x009d }
            boolean r5 = r6.exists()     // Catch:{ FileNotFoundException -> 0x009d }
            if (r5 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r6 = r3
        L_0x007b:
            if (r6 != 0) goto L_0x007e
            goto L_0x009e
        L_0x007e:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x009d }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x009d }
            java.lang.String r7 = r6.getAbsolutePath()
            java.lang.String r9 = ".zip"
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x0091
            com.airbnb.lottie.network.FileExtension r8 = com.airbnb.lottie.network.FileExtension.ZIP
        L_0x0091:
            r6.getAbsolutePath()
            p107h5.C5055c.m12895a()
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r8, r5)
            goto L_0x009f
        L_0x009d:
        L_0x009e:
            r6 = r3
        L_0x009f:
            if (r6 != 0) goto L_0x00a2
            goto L_0x00c3
        L_0x00a2:
            java.lang.Object r5 = r6.first
            com.airbnb.lottie.network.FileExtension r5 = (com.airbnb.lottie.network.FileExtension) r5
            java.lang.Object r6 = r6.second
            java.io.InputStream r6 = (java.io.InputStream) r6
            com.airbnb.lottie.network.FileExtension r7 = com.airbnb.lottie.network.FileExtension.ZIP
            if (r5 != r7) goto L_0x00b8
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream
            r5.<init>(r6)
            com.airbnb.lottie.r r5 = com.airbnb.lottie.C1868g.m5249g(r5, r0)
            goto L_0x00bc
        L_0x00b8:
            com.airbnb.lottie.r r5 = com.airbnb.lottie.C1868g.m5245c(r6, r0)
        L_0x00bc:
            V r5 = r5.f6703a
            if (r5 == 0) goto L_0x00c3
            com.airbnb.lottie.f r5 = (com.airbnb.lottie.C1867f) r5
            goto L_0x00c4
        L_0x00c3:
            r5 = r3
        L_0x00c4:
            if (r5 == 0) goto L_0x00cc
            com.airbnb.lottie.r r0 = new com.airbnb.lottie.r
            r0.<init>((com.airbnb.lottie.C1867f) r5)
            goto L_0x012b
        L_0x00cc:
            p107h5.C5055c.m12895a()
            java.lang.String r5 = "LottieFetchResult close failed "
            p107h5.C5055c.m12895a()
            f5.b r6 = r1.f15953b     // Catch:{ Exception -> 0x00ec }
            r6.getClass()     // Catch:{ Exception -> 0x00ec }
            f5.a r3 = p083f5.C4683b.m11991a(r0)     // Catch:{ Exception -> 0x00ec }
            java.net.HttpURLConnection r6 = r3.f15950b     // Catch:{ IOException -> 0x00ee }
            int r6 = r6.getResponseCode()     // Catch:{ IOException -> 0x00ee }
            int r6 = r6 / 100
            r7 = 2
            if (r6 != r7) goto L_0x00ee
            r4 = 1
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            goto L_0x013d
        L_0x00ec:
            r0 = move-exception
            goto L_0x011b
        L_0x00ee:
            if (r4 == 0) goto L_0x0104
            java.net.HttpURLConnection r4 = r3.f15950b     // Catch:{ Exception -> 0x00ec }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Exception -> 0x00ec }
            java.net.HttpURLConnection r6 = r3.f15950b     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.getContentType()     // Catch:{ Exception -> 0x00ec }
            com.airbnb.lottie.r r0 = r1.mo20206a(r0, r4, r6, r2)     // Catch:{ Exception -> 0x00ec }
            p107h5.C5055c.m12895a()     // Catch:{ Exception -> 0x00ec }
            goto L_0x0112
        L_0x0104:
            com.airbnb.lottie.r r0 = new com.airbnb.lottie.r     // Catch:{ Exception -> 0x00ec }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x00ec }
            java.lang.String r2 = r3.mo20203e()     // Catch:{ Exception -> 0x00ec }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ec }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x00ec }
        L_0x0112:
            r3.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x012b
        L_0x0116:
            r1 = move-exception
            p107h5.C5055c.m12897c(r5, r1)
            goto L_0x012b
        L_0x011b:
            com.airbnb.lottie.r r1 = new com.airbnb.lottie.r     // Catch:{ all -> 0x00ea }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x00ea }
            if (r3 == 0) goto L_0x012a
            r3.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x012a
        L_0x0126:
            r0 = move-exception
            p107h5.C5055c.m12897c(r5, r0)
        L_0x012a:
            r0 = r1
        L_0x012b:
            java.lang.String r1 = r10.f6471d
            if (r1 == 0) goto L_0x013c
            V r2 = r0.f6703a
            if (r2 == 0) goto L_0x013c
            b5.f r3 = p024b5.C1484f.f5384b
            com.airbnb.lottie.f r2 = (com.airbnb.lottie.C1867f) r2
            s0.f<java.lang.String, com.airbnb.lottie.f> r3 = r3.f5385a
            r3.put(r1, r2)
        L_0x013c:
            return r0
        L_0x013d:
            if (r3 == 0) goto L_0x0147
            r3.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r1 = move-exception
            p107h5.C5055c.m12897c(r5, r1)
        L_0x0147:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.C1872h.call():java.lang.Object");
    }
}
