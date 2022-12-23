package zb0;

import ac0.C7557a;
import android.webkit.URLUtil;
import cc0.C7585a;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import hi0.C23534e;
import hi0.C23538f;
import hi0.C23569w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import mc0.C12909a;
import mf0.C24362h;
import nc0.C12954d;
import p001a0.C0016g;
import p043ch.qos.logback.classic.Logger;
import p584jl.C17885a;
import wb0.C13233c;

/* renamed from: zb0.g */
public final class C13375g {

    /* renamed from: a */
    public final String f33206a;

    /* renamed from: b */
    public final C13376a f33207b;

    /* renamed from: c */
    public final String f33208c;

    /* renamed from: zb0.g$a */
    public interface C13376a {
        /* renamed from: a */
        void mo40259a(String str, C12909a aVar);

        /* renamed from: b */
        void mo40260b(String str, UMOAdKitError uMOAdKitError);
    }

    /* renamed from: zb0.g$b */
    public static final class C13377b implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C13375g f33209b;

        /* renamed from: c */
        public final /* synthetic */ C12909a f33210c;

        public C13377b(C13375g gVar, C12909a aVar) {
            this.f33209b = gVar;
            this.f33210c = aVar;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            boolean z;
            String str;
            String str2;
            UMOAdKitError uMOAdKitError;
            boolean z2 = false;
            if (eVar != null && ((C23569w) eVar).isCanceled()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if ((iOException instanceof SocketTimeoutException) || (iOException instanceof ConnectException)) {
                    z2 = true;
                }
                if (z2) {
                    str = "Timed Out";
                } else {
                    str = "Failed";
                }
                Logger logger = C7557a.f23040a;
                StringBuilder t = C0016g.m36t("Fetching VPAID Ad Content ", str);
                t.append(this.f33209b.f33208c);
                t.append(": Exception: ");
                if (iOException == null) {
                    str2 = null;
                } else {
                    str2 = iOException.getLocalizedMessage();
                }
                t.append(str2);
                t.append(')');
                logger.mo6667d(t.toString());
                C12954d.m32799b(C13233c.m33333b(), 2, iOException);
                if (z2) {
                    uMOAdKitError = UMOAdKitError.AD_PLAY_TIMED_OUT;
                } else {
                    uMOAdKitError = UMOAdKitError.AD_PLAY_FAILED;
                }
                C13375g gVar = this.f33209b;
                C13376a aVar = gVar.f33207b;
                if (aVar != null) {
                    aVar.mo40260b(gVar.f33206a, uMOAdKitError);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
            r8 = r7.f33209b;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5763d(hi0.C23534e r8, hi0.C23529c0 r9) {
            /*
                r7 = this;
                java.lang.String r0 = "response"
                mf0.C24362h.m61211f(r9, r0)
                r0 = 0
                r1 = 1
                if (r8 != 0) goto L_0x000a
                goto L_0x0013
            L_0x000a:
                hi0.w r8 = (hi0.C23569w) r8
                boolean r8 = r8.isCanceled()
                if (r8 != r1) goto L_0x0013
                goto L_0x0014
            L_0x0013:
                r1 = 0
            L_0x0014:
                if (r1 == 0) goto L_0x0017
                return
            L_0x0017:
                boolean r8 = r9.mo58644v()
                r1 = 0
                if (r8 == 0) goto L_0x0120
                int r8 = r9.f59412d
                r2 = 204(0xcc, float:2.86E-43)
                if (r8 != r2) goto L_0x0042
                ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
                zb0.g r9 = r7.f33209b
                java.lang.String r9 = r9.f33208c
                java.lang.String r0 = "VPAID Ad Content fetched but response is empty"
                java.lang.String r9 = mf0.C24362h.m61216k(r9, r0)
                r8.mo6667d(r9)
                zb0.g r8 = r7.f33209b
                zb0.g$a r9 = r8.f33207b
                if (r9 != 0) goto L_0x003a
                goto L_0x0041
            L_0x003a:
                java.lang.String r8 = r8.f33206a
                com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.EMPTY_AD_CONTENT
                r9.mo40260b(r8, r0)
            L_0x0041:
                return
            L_0x0042:
                hi0.e0 r8 = r9.f59416h
                if (r8 != 0) goto L_0x0048
                goto L_0x010f
            L_0x0048:
                zb0.g r9 = r7.f33209b
                mc0.a r2 = r7.f33210c
                ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
                java.lang.String r4 = r9.f33208c
                java.lang.String r5 = "VPAID Ad Content fetched Successfully"
                java.lang.String r4 = mf0.C24362h.m61216k(r4, r5)
                r3.mo6672i(r4)
                si0.i r8 = r8.mo53600t()
                java.io.InputStream r8 = r8.mo61411h2()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                java.lang.String r6 = "UTF-8"
                r5.<init>(r8, r6)     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                r8 = 16384(0x4000, float:2.2959E-41)
                r4.<init>(r5, r8)     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                r8 = 4096(0x1000, float:5.74E-42)
                char[] r8 = new char[r8]     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
            L_0x0078:
                int r5 = r4.read(r8)     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                r6 = -1
                if (r5 != r6) goto L_0x0080
                goto L_0x00c7
            L_0x0080:
                r3.append(r8, r0, r5)     // Catch:{ IllegalArgumentException -> 0x00b7, NullPointerException -> 0x00a6, UnsupportedEncodingException -> 0x0095, IndexOutOfBoundsException -> 0x0084 }
                goto L_0x0078
            L_0x0084:
                r8 = move-exception
                ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
                java.lang.String r8 = r8.getLocalizedMessage()
                java.lang.String r4 = "getDataFromInputStream(): IndexOutOfBoundsException: "
                java.lang.String r8 = mf0.C24362h.m61216k(r8, r4)
                r0.mo6667d(r8)
                goto L_0x00c7
            L_0x0095:
                r8 = move-exception
                ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
                java.lang.String r8 = r8.getLocalizedMessage()
                java.lang.String r4 = "getDataFromInputStream(): UnsupportedEncodingException: "
                java.lang.String r8 = mf0.C24362h.m61216k(r8, r4)
                r0.mo6667d(r8)
                goto L_0x00c7
            L_0x00a6:
                r8 = move-exception
                ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
                java.lang.String r8 = r8.getLocalizedMessage()
                java.lang.String r4 = "getDataFromInputStream(): NullPointerException: "
                java.lang.String r8 = mf0.C24362h.m61216k(r8, r4)
                r0.mo6667d(r8)
                goto L_0x00c7
            L_0x00b7:
                r8 = move-exception
                ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
                java.lang.String r8 = r8.getLocalizedMessage()
                java.lang.String r4 = "getDataFromInputStream(): IllegalArgumentException: "
                java.lang.String r8 = mf0.C24362h.m61216k(r8, r4)
                r0.mo6667d(r8)
            L_0x00c7:
                java.lang.String r8 = r3.toString()
                java.lang.String r0 = "sb.toString()"
                mf0.C24362h.m61210e(r8, r0)
                boolean r0 = nc0.C12954d.m32800c(r8)
                if (r0 == 0) goto L_0x0101
                ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
                java.lang.String r3 = "VPAID Ad Content"
                java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
                java.lang.String r4 = r9.f33208c
                r3.append(r4)
                java.lang.String r4 = "\n: "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                r0.mo6666c(r3)
                r2.f31951f = r8
                zb0.g$a r8 = r9.f33207b
                if (r8 != 0) goto L_0x00f9
                goto L_0x010f
            L_0x00f9:
                java.lang.String r9 = r9.f33206a
                r8.mo40259a(r9, r2)
                bf0.d r1 = bf0.C21050d.f52856a
                goto L_0x010f
            L_0x0101:
                zb0.g$a r8 = r9.f33207b
                if (r8 != 0) goto L_0x0106
                goto L_0x010f
            L_0x0106:
                java.lang.String r9 = r9.f33206a
                com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
                r8.mo40260b(r9, r0)
                bf0.d r1 = bf0.C21050d.f52856a
            L_0x010f:
                if (r1 != 0) goto L_0x0153
                zb0.g r8 = r7.f33209b
                zb0.g$a r9 = r8.f33207b
                if (r9 != 0) goto L_0x0118
                goto L_0x0153
            L_0x0118:
                java.lang.String r8 = r8.f33206a
                com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
                r9.mo40260b(r8, r0)
                goto L_0x0153
            L_0x0120:
                ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
                java.lang.String r0 = "Fetching VPAID Ad Content Failed"
                java.lang.StringBuilder r0 = ce0.C21100e.m49315J0(r0)
                zb0.g r1 = r7.f33209b
                java.lang.String r1 = r1.f33208c
                r0.append(r1)
                java.lang.String r1 = " (StatusCode: "
                r0.append(r1)
                int r9 = r9.f59412d
                r0.append(r9)
                r9 = 41
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.mo6667d(r9)
                zb0.g r8 = r7.f33209b
                zb0.g$a r9 = r8.f33207b
                if (r9 != 0) goto L_0x014c
                goto L_0x0153
            L_0x014c:
                java.lang.String r8 = r8.f33206a
                com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
                r9.mo40260b(r8, r0)
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zb0.C13375g.C13377b.mo5763d(hi0.e, hi0.c0):void");
        }
    }

    public C13375g(String str, C13376a aVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        this.f33206a = str;
        this.f33207b = aVar;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        this.f33208c = str2;
    }

    /* renamed from: a */
    public final boolean mo40258a(C12909a aVar, int i, int i2) {
        boolean z;
        String str = aVar.f31950e;
        if (C12954d.m32800c(str) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("Invalid VPAID Ad Content Url");
            J0.append(this.f33208c);
            J0.append(": ");
            J0.append(aVar.f31950e);
            logger.mo6667d(J0.toString());
            return false;
        }
        Logger logger2 = C7557a.f23040a;
        StringBuilder J02 = C21100e.m49315J0("Fetching VPAID Ad Content");
        J02.append(this.f33208c);
        J02.append(": ");
        J02.append(aVar.f31950e);
        logger2.mo6672i(J02.toString());
        C7585a aVar2 = new C7585a(i, i2);
        String str2 = aVar.f31950e;
        C24362h.m61208c(str2);
        aVar2.mo23844a(str2, new C13377b(this, aVar));
        return true;
    }
}
