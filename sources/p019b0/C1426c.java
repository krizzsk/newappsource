package p019b0;

import ac0.C7557a;
import android.content.Context;
import android.util.SparseArray;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import hi0.C23534e;
import hi0.C23538f;
import hi0.C23569w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mf0.C24362h;
import nc0.C12954d;
import p001a0.C0016g;
import p001a0.C0022m;
import p001a0.C0026p;
import p043ch.qos.logback.classic.Logger;
import p193o4.C5981g;
import p389bl.C13640f;
import p434dd.C16552f0;
import p530hd.C17384i;
import p583jk.C17884p;
import p988j$.util.concurrent.ConcurrentHashMap;
import wb0.C13233c;
import zb0.C13366b;

/* renamed from: b0.c */
public final class C1426c implements C16552f0, C23538f {

    /* renamed from: b */
    public final /* synthetic */ int f5272b;

    /* renamed from: c */
    public Object f5273c;

    public /* synthetic */ C1426c(Object obj, int i) {
        this.f5272b = i;
        this.f5273c = obj;
    }

    /* renamed from: a */
    public final void mo5764a(Class cls, String str, Class cls2) {
        ((Map) this.f5273c).put(new C5981g(cls, str.toLowerCase(Locale.US)), cls2);
    }

    /* renamed from: b */
    public final Object mo5765b(int i) {
        return ((SparseArray) this.f5273c).get(i);
    }

    /* renamed from: c */
    public final void mo5762c(C23534e eVar, IOException iOException) {
        boolean z;
        UMOAdKitError uMOAdKitError;
        boolean z2;
        boolean z3 = false;
        String str = null;
        String str2 = "Timed Out";
        switch (this.f5272b) {
            case 10:
                if (eVar != null && ((C23569w) eVar).isCanceled()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if ((iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException)) {
                        z3 = true;
                    }
                    if (!z3) {
                        str2 = "Failed";
                    }
                    Logger logger = C7557a.f23040a;
                    StringBuilder d0 = C17884p.m44363d0("PLACEHOLDER: Downloading Package ", str2, " (Exception: ");
                    if (iOException != null) {
                        str = iOException.getLocalizedMessage();
                    }
                    d0.append(str);
                    d0.append(')');
                    logger.mo6667d(d0.toString());
                    C12954d.m32799b(C13233c.m33333b(), 4, iOException);
                    return;
                }
                return;
            default:
                if (eVar != null && ((C23569w) eVar).isCanceled()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if ((iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException)) {
                        z3 = true;
                    }
                    if (!z3) {
                        str2 = "Failed";
                    }
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder t = C0016g.m36t("Fetching MRAID Ad Content ", str2);
                    t.append(((C13366b) this.f5273c).f33182c);
                    t.append(": Exception: ");
                    if (iOException != null) {
                        str = iOException.getLocalizedMessage();
                    }
                    t.append(str);
                    t.append(')');
                    logger2.mo6667d(t.toString());
                    C12954d.m32799b(C13233c.m33333b(), 2, iOException);
                    if (z3) {
                        uMOAdKitError = UMOAdKitError.AD_REQUEST_TIMED_OUT;
                    } else {
                        uMOAdKitError = UMOAdKitError.AD_REQUEST_FAILED;
                    }
                    C13366b bVar = (C13366b) this.f5273c;
                    C13366b.C13367a aVar = bVar.f33181b;
                    if (aVar != null) {
                        C24362h.m61211f(bVar.f33180a, "spotId");
                        C24362h.m61211f(uMOAdKitError, "akError");
                        ((C13640f) aVar).mo40524d(uMOAdKitError);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0267, code lost:
        r9 = (zb0.C13366b) r8.f5273c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        p584jl.C17885a.m44462t(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        p584jl.C17885a.m44462t(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bb, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5763d(hi0.C23534e r9, hi0.C23529c0 r10) {
        /*
            r8 = this;
            int r0 = r8.f5272b
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 41
            java.lang.String r6 = "response"
            switch(r0) {
                case 10: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0138
        L_0x0010:
            mf0.C24362h.m61211f(r10, r6)
            if (r9 != 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            hi0.w r9 = (hi0.C23569w) r9
            boolean r9 = r9.isCanceled()
            if (r9 != r1) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0024
            goto L_0x0137
        L_0x0024:
            boolean r9 = r10.mo58644v()
            if (r9 == 0) goto L_0x0120
            int r9 = r10.f59412d
            if (r9 != r4) goto L_0x0037
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r10 = "PLACEHOLDER: Downloading Package failed with an empty response"
            r9.mo6667d(r10)
            goto L_0x0137
        L_0x0037:
            hi0.e0 r9 = r10.f59416h
            if (r9 != 0) goto L_0x003d
            goto L_0x0116
        L_0x003d:
            java.lang.Object r0 = r8.f5273c
            com.umo.ads.g.zzl r0 = (com.umo.ads.p344g.zzl) r0
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r4 = "PLACEHOLDER: Downloading Package Successful."
            r1.mo6672i(r4)
            java.lang.String r1 = "content-type"
            java.lang.String r10 = r10.mo58641r(r1)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.lang.String r10 = r1.getExtensionFromMimeType(r10)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            com.umo.ads.p344g.zzl.m32038d(r0)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            com.umo.ads.p344g.zzl.m32039e(r0, r10)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.io.File r10 = r0.f30798h     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.lang.String r1 = "packageFile"
            if (r10 == 0) goto L_0x00bc
            java.util.logging.Logger r4 = si0.C24912s.f62972a     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            r4.<init>(r10, r3)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            si0.u r10 = si0.C24911r.m62550f(r4)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            si0.w r3 = new si0.w     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            r3.<init>(r10)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            si0.i r9 = r9.mo53600t()     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.lang.String r10 = "input"
            mf0.C24362h.m61210e(r9, r10)     // Catch:{ all -> 0x00ae }
            r3.mo61417q1(r9)     // Catch:{ all -> 0x00ae }
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = "PLACEHOLDER: Package downloaded into Local Cache @Path: "
            java.io.File r6 = r0.f30798h     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = r6.getPath()     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = mf0.C24362h.m61216k(r6, r4)     // Catch:{ all -> 0x00ae }
            r10.mo6672i(r4)     // Catch:{ all -> 0x00ae }
            bf0.d r10 = bf0.C21050d.f52856a     // Catch:{ all -> 0x00ae }
            p584jl.C17885a.m44462t(r3, r2)     // Catch:{ all -> 0x00b5 }
            p584jl.C17885a.m44462t(r9, r2)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.io.File r9 = r0.f30798h     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            if (r9 == 0) goto L_0x00a6
            boolean r9 = r0.mo35782l(r9)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            goto L_0x0116
        L_0x00a6:
            mf0.C24362h.m61217l(r1)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
        L_0x00aa:
            mf0.C24362h.m61217l(r1)     // Catch:{ all -> 0x00ae }
            throw r2     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            p584jl.C17885a.m44462t(r3, r10)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            p584jl.C17885a.m44462t(r9, r10)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            throw r0     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
        L_0x00bc:
            mf0.C24362h.m61217l(r1)     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
            throw r2     // Catch:{ FileNotFoundException -> 0x00fa, IllegalArgumentException -> 0x00dd, IOException -> 0x00c0 }
        L_0x00c0:
            r9 = move-exception
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r0 = "PLACEHOLDER: IOException while processing Package (Exception: "
            java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
            java.lang.String r9 = r9.getLocalizedMessage()
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = r0.toString()
            r10.mo6667d(r9)
            bf0.d r2 = bf0.C21050d.f52856a
            goto L_0x0116
        L_0x00dd:
            r9 = move-exception
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r0 = "PLACEHOLDER: IllegalArgumentException while processing Package (Exception: "
            java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
            java.lang.String r9 = r9.getLocalizedMessage()
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = r0.toString()
            r10.mo6667d(r9)
            bf0.d r2 = bf0.C21050d.f52856a
            goto L_0x0116
        L_0x00fa:
            r9 = move-exception
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r0 = "PLACEHOLDER: FileNotFoundException while processing Package (Exception: "
            java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
            java.lang.String r9 = r9.getLocalizedMessage()
            r0.append(r9)
            r0.append(r5)
            java.lang.String r9 = r0.toString()
            r10.mo6667d(r9)
            bf0.d r2 = bf0.C21050d.f52856a
        L_0x0116:
            if (r2 != 0) goto L_0x0137
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r10 = "PLACEHOLDER: Downloading Package Failed with an Invalid Response"
            r9.mo6667d(r10)
            goto L_0x0137
        L_0x0120:
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r0 = "PLACEHOLDER: Downloading Package Failed (StatusCode: "
            java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
            int r10 = r10.f59412d
            r0.append(r10)
            r0.append(r5)
            java.lang.String r10 = r0.toString()
            r9.mo6667d(r10)
        L_0x0137:
            return
        L_0x0138:
            mf0.C24362h.m61211f(r10, r6)
            if (r9 != 0) goto L_0x013e
            goto L_0x0147
        L_0x013e:
            hi0.w r9 = (hi0.C23569w) r9
            boolean r9 = r9.isCanceled()
            if (r9 != r1) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r1 = 0
        L_0x0148:
            if (r1 == 0) goto L_0x014c
            goto L_0x02bd
        L_0x014c:
            boolean r9 = r10.mo58644v()
            java.lang.String r0 = "akError"
            java.lang.String r1 = "spotId"
            if (r9 == 0) goto L_0x0280
            int r9 = r10.f59412d
            if (r9 != r4) goto L_0x0186
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.Object r10 = r8.f5273c
            zb0.b r10 = (zb0.C13366b) r10
            java.lang.String r10 = r10.f33182c
            java.lang.String r2 = "MRAID Ad Content fetched but response is empty"
            java.lang.String r10 = mf0.C24362h.m61216k(r10, r2)
            r9.mo6667d(r10)
            java.lang.Object r9 = r8.f5273c
            zb0.b r9 = (zb0.C13366b) r9
            zb0.b$a r10 = r9.f33181b
            if (r10 != 0) goto L_0x0175
            goto L_0x02bd
        L_0x0175:
            java.lang.String r9 = r9.f33180a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.EMPTY_AD_CONTENT
            bl.f r10 = (p389bl.C13640f) r10
            mf0.C24362h.m61211f(r9, r1)
            mf0.C24362h.m61211f(r2, r0)
            r10.mo40524d(r2)
            goto L_0x02bd
        L_0x0186:
            hi0.e0 r9 = r10.f59416h
            if (r9 != 0) goto L_0x018c
            goto L_0x0265
        L_0x018c:
            java.lang.Object r10 = r8.f5273c
            zb0.b r10 = (zb0.C13366b) r10
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r5 = r10.f33182c
            java.lang.String r6 = "MRAID Ad Content fetched Successfully"
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r6)
            r4.mo6672i(r5)
            si0.i r9 = r9.mo53600t()
            java.io.InputStream r9 = r9.mo61411h2()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r9, r7)     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            r9 = 16384(0x4000, float:2.2959E-41)
            r5.<init>(r6, r9)     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            r9 = 4096(0x1000, float:5.74E-42)
            char[] r9 = new char[r9]     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
        L_0x01bc:
            int r6 = r5.read(r9)     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            r7 = -1
            if (r6 != r7) goto L_0x01c4
            goto L_0x020b
        L_0x01c4:
            r4.append(r9, r3, r6)     // Catch:{ IllegalArgumentException -> 0x01fb, NullPointerException -> 0x01ea, UnsupportedEncodingException -> 0x01d9, IndexOutOfBoundsException -> 0x01c8 }
            goto L_0x01bc
        L_0x01c8:
            r9 = move-exception
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.String r5 = "getDataFromInputStream(): IndexOutOfBoundsException: "
            java.lang.String r9 = mf0.C24362h.m61216k(r9, r5)
            r3.mo6667d(r9)
            goto L_0x020b
        L_0x01d9:
            r9 = move-exception
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.String r5 = "getDataFromInputStream(): UnsupportedEncodingException: "
            java.lang.String r9 = mf0.C24362h.m61216k(r9, r5)
            r3.mo6667d(r9)
            goto L_0x020b
        L_0x01ea:
            r9 = move-exception
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.String r5 = "getDataFromInputStream(): NullPointerException: "
            java.lang.String r9 = mf0.C24362h.m61216k(r9, r5)
            r3.mo6667d(r9)
            goto L_0x020b
        L_0x01fb:
            r9 = move-exception
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r9 = r9.getLocalizedMessage()
            java.lang.String r5 = "getDataFromInputStream(): IllegalArgumentException: "
            java.lang.String r9 = mf0.C24362h.m61216k(r9, r5)
            r3.mo6667d(r9)
        L_0x020b:
            java.lang.String r9 = r4.toString()
            java.lang.String r3 = "sb.toString()"
            mf0.C24362h.m61210e(r9, r3)
            boolean r3 = nc0.C12954d.m32800c(r9)
            if (r3 == 0) goto L_0x024f
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r4 = "MRAID Ad Content"
            java.lang.StringBuilder r4 = ce0.C21100e.m49315J0(r4)
            java.lang.String r5 = r10.f33182c
            r4.append(r5)
            java.lang.String r5 = "\n: "
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r3.mo6666c(r4)
            zb0.b$a r3 = r10.f33181b
            if (r3 != 0) goto L_0x023b
            goto L_0x0265
        L_0x023b:
            java.lang.String r10 = r10.f33180a
            bl.f r3 = (p389bl.C13640f) r3
            mf0.C24362h.m61211f(r10, r1)
            java.lang.Object r2 = r3.f33657d
            vb0.b r2 = (vb0.C13198b) r2
            r2.zza((java.lang.String) r10)
            r3.mo40527h(r9)
            bf0.d r2 = bf0.C21050d.f52856a
            goto L_0x0265
        L_0x024f:
            zb0.b$a r9 = r10.f33181b
            if (r9 != 0) goto L_0x0254
            goto L_0x0265
        L_0x0254:
            java.lang.String r10 = r10.f33180a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            bl.f r9 = (p389bl.C13640f) r9
            mf0.C24362h.m61211f(r10, r1)
            mf0.C24362h.m61211f(r2, r0)
            r9.mo40524d(r2)
            bf0.d r2 = bf0.C21050d.f52856a
        L_0x0265:
            if (r2 != 0) goto L_0x02bd
            java.lang.Object r9 = r8.f5273c
            zb0.b r9 = (zb0.C13366b) r9
            zb0.b$a r10 = r9.f33181b
            if (r10 != 0) goto L_0x0270
            goto L_0x02bd
        L_0x0270:
            java.lang.String r9 = r9.f33180a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            bl.f r10 = (p389bl.C13640f) r10
            mf0.C24362h.m61211f(r9, r1)
            mf0.C24362h.m61211f(r2, r0)
            r10.mo40524d(r2)
            goto L_0x02bd
        L_0x0280:
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r2 = "Fetching MRAID Ad Content Failed"
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            java.lang.Object r3 = r8.f5273c
            zb0.b r3 = (zb0.C13366b) r3
            java.lang.String r3 = r3.f33182c
            r2.append(r3)
            java.lang.String r3 = " (StatusCode: "
            r2.append(r3)
            int r10 = r10.f59412d
            r2.append(r10)
            r2.append(r5)
            java.lang.String r10 = r2.toString()
            r9.mo6667d(r10)
            java.lang.Object r9 = r8.f5273c
            zb0.b r9 = (zb0.C13366b) r9
            zb0.b$a r10 = r9.f33181b
            if (r10 != 0) goto L_0x02ae
            goto L_0x02bd
        L_0x02ae:
            java.lang.String r9 = r9.f33180a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            bl.f r10 = (p389bl.C13640f) r10
            mf0.C24362h.m61211f(r9, r1)
            mf0.C24362h.m61211f(r2, r0)
            r10.mo40524d(r2)
        L_0x02bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p019b0.C1426c.mo5763d(hi0.e, hi0.c0):void");
    }

    /* renamed from: e */
    public final void mo5766e(int i, Object obj) {
        ((SparseArray) this.f5273c).append(i, obj);
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C17384i((Context) ((C16552f0) this.f5273c).zza());
    }

    public C1426c(int i) {
        this.f5272b = i;
        if (i == 1) {
            this.f5273c = new HashMap();
        } else if (i == 2) {
            this.f5273c = new ConcurrentHashMap();
        } else if (i != 8) {
            this.f5273c = (C0026p) C0022m.m93a(C0026p.class);
        } else {
            this.f5273c = new SparseArray();
        }
    }
}
