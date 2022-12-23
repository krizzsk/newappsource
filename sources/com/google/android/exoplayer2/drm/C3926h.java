package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.http.HttpHeader;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p001a0.C0016g;
import p099ga.C4883f;
import p265tb.C6657i;
import p265tb.C6664o;
import p265tb.C6666p;
import p277ub.C6774a0;
import p583jk.C17875h;
import p624ld.C18187b;

/* renamed from: com.google.android.exoplayer2.drm.h */
public final class C3926h implements C3927i {

    /* renamed from: a */
    public final C6666p f13741a;

    /* renamed from: b */
    public final String f13742b;

    /* renamed from: c */
    public final boolean f13743c;

    /* renamed from: d */
    public final HashMap f13744d;

    public C3926h(String str, boolean z, C6664o.C6665a aVar) {
        boolean z2;
        if (!z || !TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17875h.m44301k(z2);
        this.f13741a = aVar;
        this.f13742b = str;
        this.f13743c = z;
        this.f13744d = new HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        r0 = r7.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = p277ub.C6774a0.f20959a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004e, code lost:
        r8 = r6.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r8 == -1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        r7.write(r0, r3, r8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10476b(p265tb.C6666p r36, java.lang.String r37, byte[] r38, java.util.Map<java.lang.String, java.lang.String> r39) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        /*
            tb.t r1 = new tb.t
            r0 = r36
            tb.o$a r0 = (p265tb.C6664o.C6665a) r0
            tb.o r2 = new tb.o
            java.lang.String r3 = r0.f20741b
            int r4 = r0.f20742c
            int r5 = r0.f20743d
            tb.q r0 = r0.f20740a
            r2.<init>(r3, r4, r5, r0)
            r1.<init>(r2)
            r19 = 0
            r17 = 0
            r13 = 0
            r8 = 0
            java.util.Collections.emptyMap()
            r15 = -1
            android.net.Uri r7 = android.net.Uri.parse(r37)
            r10 = 2
            r18 = 1
            java.lang.String r2 = "The uri must be set."
            p583jk.C17875h.m44307r(r7, r2)
            tb.i r21 = new tb.i
            r6 = r21
            r11 = r38
            r12 = r39
            r6.<init>(r7, r8, r10, r11, r12, r13, r15, r17, r18, r19)
            r3 = 0
            r4 = r21
            r5 = 0
        L_0x003e:
            tb.h r6 = new tb.h     // Catch:{ Exception -> 0x00e4 }
            r6.<init>(r1, r4)     // Catch:{ Exception -> 0x00e4 }
            int r0 = p277ub.C6774a0.f20959a     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r7.<init>()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
        L_0x004e:
            int r8 = r6.read(r0)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            r9 = -1
            if (r8 == r9) goto L_0x005e
            r7.write(r0, r3, r8)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            goto L_0x004e
        L_0x0059:
            r0 = move-exception
            goto L_0x00de
        L_0x005c:
            r0 = move-exception
            goto L_0x0068
        L_0x005e:
            byte[] r0 = r7.toByteArray()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x005c }
            int r2 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        L_0x0068:
            int r7 = r0.responseCode     // Catch:{ all -> 0x0059 }
            r8 = 307(0x133, float:4.3E-43)
            if (r7 == r8) goto L_0x0072
            r8 = 308(0x134, float:4.32E-43)
            if (r7 != r8) goto L_0x0077
        L_0x0072:
            r7 = 5
            if (r5 >= r7) goto L_0x0077
            r7 = 1
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            r8 = 0
            if (r7 != 0) goto L_0x007c
            goto L_0x0097
        L_0x007c:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r0.headerFields     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0097
            java.lang.String r9 = "Location"
            java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x0059 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x0097
            boolean r9 = r7.isEmpty()     // Catch:{ all -> 0x0059 }
            if (r9 != 0) goto L_0x0097
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x0059 }
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0059 }
        L_0x0097:
            if (r8 == 0) goto L_0x00dd
            int r5 = r5 + 1
            long r9 = r4.f20669b     // Catch:{ all -> 0x0059 }
            int r0 = r4.f20670c     // Catch:{ all -> 0x0059 }
            byte[] r7 = r4.f20671d     // Catch:{ all -> 0x0059 }
            java.util.Map<java.lang.String, java.lang.String> r11 = r4.f20672e     // Catch:{ all -> 0x0059 }
            long r12 = r4.f20673f     // Catch:{ all -> 0x0059 }
            long r14 = r4.f20674g     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = r4.f20675h     // Catch:{ all -> 0x0059 }
            r37 = r5
            int r5 = r4.f20676i     // Catch:{ all -> 0x0059 }
            java.lang.Object r4 = r4.f20677j     // Catch:{ all -> 0x0059 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x0059 }
            p583jk.C17875h.m44307r(r8, r2)     // Catch:{ all -> 0x0059 }
            tb.i r16 = new tb.i     // Catch:{ all -> 0x0059 }
            r22 = r16
            r23 = r8
            r24 = r9
            r26 = r0
            r27 = r7
            r28 = r11
            r29 = r12
            r31 = r14
            r33 = r3
            r34 = r5
            r35 = r4
            r22.<init>(r23, r24, r26, r27, r28, r29, r31, r33, r34, r35)     // Catch:{ all -> 0x0059 }
            int r0 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            r5 = r37
            r4 = r16
            r3 = 0
            goto L_0x003e
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x00de:
            int r2 = p277ub.C6774a0.f20959a     // Catch:{ Exception -> 0x00e4 }
            r6.close()     // Catch:{ IOException -> 0x00e3 }
        L_0x00e3:
            throw r0     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            r26 = r0
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r0 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r2 = r1.f20750c
            r2.getClass()
            java.util.Map r23 = r1.mo20679b()
            long r3 = r1.f20749b
            r20 = r0
            r22 = r2
            r24 = r3
            r20.<init>(r21, r22, r23, r24, r26)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C3926h.m10476b(tb.p, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* renamed from: a */
    public final byte[] mo16020a(UUID uuid, C3920f.C3921a aVar) throws MediaDrmCallbackException {
        String str;
        UUID uuid2 = uuid;
        C3920f.C3921a aVar2 = aVar;
        String str2 = aVar2.f13734b;
        if (this.f13743c || TextUtils.isEmpty(str2)) {
            str2 = this.f13742b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = C4883f.f16445e;
            if (uuid3.equals(uuid2)) {
                str = "text/xml";
            } else if (C4883f.f16443c.equals(uuid2)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put(HttpHeader.CONTENT_TYPE, str);
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f13744d) {
                hashMap.putAll(this.f13744d);
            }
            return m10476b(this.f13741a, str2, aVar2.f13733a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        C17875h.m44307r(uri, "The uri must be set.");
        throw new MediaDrmCallbackException(new C6657i(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null), Uri.EMPTY, ImmutableMap.m35707j(), 0, new IllegalStateException("No license URL"));
    }

    /* renamed from: c */
    public final byte[] mo16021c(C3920f.C3924d dVar) throws MediaDrmCallbackException {
        String str = dVar.f13736b;
        byte[] bArr = dVar.f13735a;
        int i = C6774a0.f20959a;
        String str2 = new String(bArr, C18187b.f46429c);
        return m10476b(this.f13741a, C25541a.m63875e(str2.length() + C0016g.m25h(str, 15), str, "&signedRequest=", str2), (byte[]) null, Collections.emptyMap());
    }
}
