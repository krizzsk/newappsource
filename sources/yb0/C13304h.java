package yb0;

import ac0.C7557a;
import android.webkit.URLUtil;
import bf0.C21050d;
import cc0.C7585a;
import com.appsflyer.internal.referrer.Payload;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKImp;
import com.cubic.umo.p045ad.types.AKImpVideoOrBannerExt;
import com.cubic.umo.p045ad.types.AKRequestPayload;
import com.cubic.umo.p045ad.types.AKRequestPayloadJsonAdapter;
import com.cubic.umo.p045ad.types.AKVideo;
import com.squareup.moshi.C8017o;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23569w;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import mc0.C12909a;
import mc0.C12911c;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p583jk.C17875h;
import p583jk.C17884p;
import p584jl.C17885a;
import zb0.C13370d;

/* renamed from: yb0.h */
public final class C13304h implements C13370d.C13371a {

    /* renamed from: a */
    public C13305a f33022a;

    /* renamed from: b */
    public final int f33023b;

    /* renamed from: c */
    public final int f33024c;

    /* renamed from: d */
    public C13370d f33025d;

    /* renamed from: yb0.h$a */
    public interface C13305a {
        /* renamed from: a */
        void mo40214a(String str, C12909a aVar);

        /* renamed from: c */
        void mo40215c(String str, UMOAdKitError uMOAdKitError, zzd zzd);
    }

    /* renamed from: yb0.h$b */
    public static final class C13306b implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C13304h f33026b;

        /* renamed from: c */
        public final /* synthetic */ boolean f33027c;

        /* renamed from: d */
        public final /* synthetic */ String f33028d;

        /* renamed from: e */
        public final /* synthetic */ String f33029e;

        public C13306b(C13304h hVar, boolean z, String str, String str2) {
            this.f33026b = hVar;
            this.f33027c = z;
            this.f33028d = str;
            this.f33029e = str2;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            boolean z = true;
            if (eVar == null || !((C23569w) eVar).isCanceled()) {
                z = false;
            }
            if (!z) {
                C13304h.m33570f(this.f33026b, iOException, this.f33027c, this.f33028d, this.f33029e);
            }
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            boolean z = true;
            if (eVar == null || !((C23569w) eVar).isCanceled()) {
                z = false;
            }
            if (!z) {
                C13304h.m33569e(this.f33026b, c0Var, this.f33027c, this.f33028d, this.f33029e);
            }
        }
    }

    /* renamed from: yb0.h$c */
    public static final class C13307c implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ C13304h f33030b;

        /* renamed from: c */
        public final /* synthetic */ boolean f33031c;

        /* renamed from: d */
        public final /* synthetic */ String f33032d;

        /* renamed from: e */
        public final /* synthetic */ String f33033e;

        public C13307c(C13304h hVar, boolean z, String str, String str2) {
            this.f33030b = hVar;
            this.f33031c = z;
            this.f33032d = str;
            this.f33033e = str2;
        }

        /* renamed from: c */
        public final void mo5762c(C23534e eVar, IOException iOException) {
            boolean z = true;
            if (eVar == null || !((C23569w) eVar).isCanceled()) {
                z = false;
            }
            if (!z) {
                C13304h.m33570f(this.f33030b, iOException, this.f33031c, this.f33032d, this.f33033e);
            }
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            boolean z = true;
            if (eVar == null || !((C23569w) eVar).isCanceled()) {
                z = false;
            }
            if (!z) {
                C13304h.m33569e(this.f33030b, c0Var, this.f33031c, this.f33032d, this.f33033e);
            }
        }
    }

    public C13304h(C13305a aVar, int i, int i2) {
        this.f33022a = aVar;
        this.f33023b = i;
        this.f33024c = i2;
    }

    /* renamed from: d */
    public static void m33568d(C13304h hVar, UMOAdKitError uMOAdKitError, int i) {
        zzd zzd;
        String str;
        C13305a aVar;
        if ((i & 1) != 0) {
            uMOAdKitError = UMOAdKitError.AD_REQUEST_FAILED;
        }
        if ((i & 2) != 0) {
            zzd = zzd.NONE;
        } else {
            zzd = null;
        }
        C13370d dVar = hVar.f33025d;
        if (dVar != null && (str = dVar.f33185a) != null && (aVar = hVar.f33022a) != null) {
            aVar.mo40215c(str, uMOAdKitError, zzd);
        }
    }

    /* renamed from: e */
    public static final void m33569e(C13304h hVar, C23529c0 c0Var, boolean z, String str, String str2) {
        C21050d dVar;
        hVar.getClass();
        if (!c0Var.mo58644v()) {
            Logger logger = C7557a.f23040a;
            StringBuilder d0 = C17884p.m44363d0("VAST_AD: VAST Playlist fetch failed", str2, " (StatusCode: ");
            d0.append(c0Var.f59412d);
            d0.append(')');
            logger.mo6667d(d0.toString());
        } else if (c0Var.f59412d == 204) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "VAST Playlist fetched but response is empty"));
            hVar.mo40212g(z, str, false, UMOAdKitError.EMPTY_AD_CONTENT);
            return;
        } else {
            C23536e0 e0Var = c0Var.f59416h;
            if (e0Var == null) {
                dVar = null;
            } else {
                try {
                    String v = e0Var.mo58649v();
                    C24362h.m61210e(v, "respXml");
                    if (hVar.mo40213h(v, e0Var.mo53599q(), z)) {
                        return;
                    }
                } catch (IOException e) {
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder d02 = C17884p.m44363d0("VAST_AD: IOException while processing VAST XML Response", str2, " (Exception: ");
                    d02.append(e.getLocalizedMessage());
                    d02.append(')');
                    logger2.mo6667d(d02.toString());
                }
                dVar = C21050d.f52856a;
            }
            if (dVar == null) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "VAST_AD: VAST Playlist fetch Successful but response is Invalid"));
            }
        }
        hVar.mo40212g(z, str, false, UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m33570f(yb0.C13304h r7, java.io.IOException r8, boolean r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof java.net.SocketTimeoutException
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            boolean r3 = r8 instanceof java.net.ConnectException
            if (r3 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r3 = 0
            goto L_0x0011
        L_0x0010:
            r3 = 1
        L_0x0011:
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "Timed Out"
            goto L_0x0018
        L_0x0016:
            java.lang.String r3 = "Failed"
        L_0x0018:
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "VAST_AD: VAST Playlist fetch "
            r5.append(r6)
            r5.append(r3)
            r5.append(r11)
            java.lang.String r11 = " (Exception: "
            r5.append(r11)
            if (r8 != 0) goto L_0x0033
            r11 = 0
            goto L_0x0037
        L_0x0033:
            java.lang.String r11 = r8.getLocalizedMessage()
        L_0x0037:
            r5.append(r11)
            r11 = 41
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            r4.mo6667d(r11)
            boolean r11 = r8 instanceof java.lang.RuntimeException
            if (r11 == 0) goto L_0x0074
            java.lang.RuntimeException r8 = (java.lang.RuntimeException) r8
            java.lang.String r8 = r8.getLocalizedMessage()
            if (r8 == 0) goto L_0x0085
            java.lang.String r9 = "javax.xml.stream.XMLStreamException"
            boolean r8 = kotlin.text.C24179b.m60559G(r8, r9, r1)
            if (r8 == 0) goto L_0x0085
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.String r9 = "VAST_AD: Exception while parsing playlist."
            r8.mo6667d(r9)
            zb0.d r8 = r7.f33025d
            if (r8 != 0) goto L_0x0066
            goto L_0x006a
        L_0x0066:
            java.lang.String r8 = r8.f33185a
            if (r8 != 0) goto L_0x006c
        L_0x006a:
            java.lang.String r8 = ""
        L_0x006c:
            com.cubic.umo.ad.ext.types.UMOAdKitError r9 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR
            com.umo.ads.c.zzd r10 = com.umo.ads.p342c.zzd.XML_MAL_FORMED
            r7.mo40209a(r8, r9, r10)
            goto L_0x0084
        L_0x0074:
            boolean r8 = r8 instanceof java.net.ConnectException
            if (r8 == 0) goto L_0x007a
            r8 = 1
            goto L_0x007b
        L_0x007a:
            r8 = r0
        L_0x007b:
            if (r8 == 0) goto L_0x0085
            if (r9 == 0) goto L_0x0085
            com.cubic.umo.ad.ext.types.UMOAdKitError r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
            r7.mo40212g(r9, r10, r0, r8)
        L_0x0084:
            r1 = 1
        L_0x0085:
            if (r1 != 0) goto L_0x0092
            if (r0 == 0) goto L_0x008c
            com.cubic.umo.ad.ext.types.UMOAdKitError r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_TIMED_OUT
            goto L_0x008e
        L_0x008c:
            com.cubic.umo.ad.ext.types.UMOAdKitError r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
        L_0x008e:
            r9 = 2
            m33568d(r7, r8, r9)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13304h.m33570f(yb0.h, java.io.IOException, boolean, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo40209a(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        String str2;
        String str3;
        C13305a aVar;
        C12909a aVar2;
        LinkedHashMap linkedHashMap;
        C12911c cVar;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        C13370d dVar = this.f33025d;
        String str9 = null;
        if (dVar == null) {
            str2 = null;
        } else {
            str2 = dVar.f33192h;
        }
        if (!C12954d.m32800c(str2)) {
            Logger logger = C7557a.f23040a;
            C13370d dVar2 = this.f33025d;
            if (dVar2 != null) {
                str9 = dVar2.f33185a;
            }
            if (C12954d.m32800c(str9)) {
                str8 = C17885a.m44403H0(str9);
            } else {
                str8 = "";
            }
            logger.mo6667d(C24362h.m61216k(str8, "No first party error tracker found"));
        } else {
            C13370d dVar3 = this.f33025d;
            if (dVar3 == null || (str7 = dVar3.f33185a) == null) {
                str6 = "";
            } else {
                str6 = str7;
            }
            if (dVar3 != null) {
                str9 = dVar3.f33192h;
            }
            C24362h.m61208c(str9);
            C17885a.m44411L0(str6, C17875h.m44280D(str9), zzb.ERROR, this.f33023b, this.f33024c, zzd);
        }
        C13370d dVar4 = this.f33025d;
        if (!(dVar4 == null || (aVar2 = dVar4.f33191g) == null || (linkedHashMap = aVar2.f31953h) == null || (cVar = (C12911c) linkedHashMap.get(zzb.ERROR)) == null)) {
            C13370d dVar5 = this.f33025d;
            if (dVar5 == null || (str5 = dVar5.f33185a) == null) {
                str4 = "";
            } else {
                str4 = str5;
            }
            cVar.mo39779a(str4, true, this.f33023b, this.f33024c, zzd);
        }
        C13370d dVar6 = this.f33025d;
        if (dVar6 != null && (str3 = dVar6.f33185a) != null && (aVar = this.f33022a) != null) {
            aVar.mo40215c(str3, uMOAdKitError, zzd);
        }
    }

    /* renamed from: b */
    public final void mo40210b(String str, AKRequestPayload aKRequestPayload, boolean z) {
        String str2;
        String str3;
        boolean z2;
        C21050d dVar;
        String str4;
        AKImp aKImp;
        AKVideo aKVideo;
        AKImpVideoOrBannerExt aKImpVideoOrBannerExt;
        C24362h.m61211f(str, "reqUrl");
        String str5 = "";
        if (z) {
            str2 = " (WRAPPER)";
        } else {
            str2 = str5;
        }
        C13370d dVar2 = this.f33025d;
        if (dVar2 == null) {
            str3 = null;
        } else {
            str3 = dVar2.f33185a;
        }
        if (C12954d.m32800c(str3)) {
            str5 = C17885a.m44403H0(str3);
        }
        String k = C24362h.m61216k(str2, str5);
        if (C12954d.m32800c(str) && (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C7557a.f23040a.mo6667d("VAST_AD: Invalid VAST Playlist Request Url" + k + ": " + str);
            m33568d(this, (UMOAdKitError) null, 3);
        } else if (z) {
            mo40211c(str, (String) null, z);
        } else {
            if (aKRequestPayload == null) {
                dVar = null;
            } else {
                List<AKImp> list = aKRequestPayload.f7576b;
                if (list == null || (aKImp = list.get(0)) == null || (aKVideo = aKImp.f7536i) == null || (aKImpVideoOrBannerExt = aKVideo.f7713y) == null) {
                    str4 = null;
                } else {
                    str4 = aKImpVideoOrBannerExt.f7546a;
                }
                if (C12954d.m32800c(str4)) {
                    str = str + '&' + str4;
                }
                try {
                    mo40211c(str, new AKRequestPayloadJsonAdapter(new C8017o(new C8017o.C8018a())).mo25051d(aKRequestPayload), z);
                    dVar = C21050d.f52856a;
                } catch (IllegalAccessException unused) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(k, "VAST_AD: IllegalAccessException while attempting to fetch a VAST Playlist"));
                    m33568d(this, (UMOAdKitError) null, 3);
                    return;
                } catch (IOException unused2) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(k, "VAST_AD: IOException while attempting to fetch a VAST Playlist"));
                    m33568d(this, (UMOAdKitError) null, 3);
                    return;
                }
            }
            if (dVar == null) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(k, "VAST_AD: Invalid VAST Playlist Request Payload"));
                m33568d(this, (UMOAdKitError) null, 3);
            }
        }
    }

    /* renamed from: c */
    public final void mo40211c(String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6 = "";
        if (z) {
            str3 = " (WRAPPER)";
        } else {
            str3 = str6;
        }
        C13370d dVar = this.f33025d;
        if (dVar == null) {
            str4 = null;
        } else {
            str4 = dVar.f33185a;
        }
        if (C12954d.m32800c(str4)) {
            str5 = C17885a.m44403H0(str4);
        } else {
            str5 = str6;
        }
        String k = C24362h.m61216k(str3, str5);
        if (str2 != null) {
            str6 = "\nREQUEST PAYLOAD" + k + ": " + str2;
        }
        C7557a.f23040a.mo6672i("VAST_AD: Fetching VAST Playlist: \nREQUEST URL" + k + ": " + str + ' ' + str6);
        C7585a aVar = new C7585a(this.f33023b, this.f33024c);
        if (!z) {
            C24362h.m61208c(str2);
            aVar.mo23845b(str, str2, new C13306b(this, z, str, k));
            return;
        }
        aVar.mo23844a(str, new C13307c(this, z, str, k));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r7 == true) goto L_0x0046;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40212g(boolean r7, java.lang.String r8, boolean r9, com.cubic.umo.p045ad.ext.types.UMOAdKitError r10) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0049
            zb0.d r7 = r6.f33025d
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0009
            goto L_0x0045
        L_0x0009:
            java.lang.String r2 = "wrapperUrl"
            mf0.C24362h.m61211f(r8, r2)
            int r2 = r7.f33197m
            if (r2 <= 0) goto L_0x003c
            int r3 = r7.f33199o
            if (r3 >= r2) goto L_0x003c
            r2 = 0
            r7.f33200p = r2
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            r3 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "WRAPPER_RETRY: Starting Wrapper Retry Timer (milliseconds): "
            java.lang.String r4 = mf0.C24362h.m61216k(r4, r5)
            r2.mo6672i(r4)
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            r7.f33200p = r2
            zb0.e r4 = new zb0.e
            r4.<init>(r7, r8)
            long r7 = (long) r3
            r2.schedule(r4, r7)
            r7 = 1
            goto L_0x0042
        L_0x003c:
            r7.mo40254f()
            r7.f33199o = r1
            r7 = 0
        L_0x0042:
            if (r7 != r0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.String r7 = ""
            if (r9 == 0) goto L_0x0060
            zb0.d r8 = r6.f33025d
            if (r8 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            java.lang.String r8 = r8.f33185a
            if (r8 != 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r7 = r8
        L_0x0058:
            com.cubic.umo.ad.ext.types.UMOAdKitError r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_TIMED_OUT
            com.umo.ads.c.zzd r9 = com.umo.ads.p342c.zzd.RESPONSE_TIMED_OUT
            r6.mo40209a(r7, r8, r9)
            goto L_0x0070
        L_0x0060:
            zb0.d r8 = r6.f33025d
            if (r8 != 0) goto L_0x0065
            goto L_0x006b
        L_0x0065:
            java.lang.String r8 = r8.f33185a
            if (r8 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r7 = r8
        L_0x006b:
            com.umo.ads.c.zzd r8 = com.umo.ads.p342c.zzd.XML_NO_FEED
            r6.mo40209a(r7, r10, r8)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13304h.mo40212g(boolean, java.lang.String, boolean, com.cubic.umo.ad.ext.types.UMOAdKitError):void");
    }

    /* JADX WARNING: type inference failed for: r10v12, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, mc0.e>] */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0698, code lost:
        if (r8 == null) goto L_0x069a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x069f  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06a4  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06ca A[RETURN] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40213h(java.lang.String r17, hi0.C23562t r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r3 = " (Exception: "
            hi0.d0 r0 = hi0.C23536e0.m57676r(r17, r18)
            java.lang.String r4 = " (WRAPPER)"
            java.lang.String r5 = ""
            if (r19 == 0) goto L_0x0012
            r6 = r4
            goto L_0x0013
        L_0x0012:
            r6 = r5
        L_0x0013:
            zb0.d r7 = r1.f33025d
            if (r7 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            java.lang.String r7 = r7.f33185a
        L_0x001b:
            boolean r9 = nc0.C12954d.m32800c(r7)
            if (r9 == 0) goto L_0x0026
            java.lang.String r7 = p584jl.C17885a.m44403H0(r7)
            goto L_0x0027
        L_0x0026:
            r7 = r5
        L_0x0027:
            java.lang.String r6 = mf0.C24362h.m61216k(r6, r7)
            r7 = 41
            org.simpleframework.xml.convert.a r9 = new org.simpleframework.xml.convert.a     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            r9.<init>()     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            ij0.g1 r10 = new ij0.g1     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            r10.<init>(r9)     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            java.lang.String r0 = r0.mo58649v()     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            java.lang.Object r0 = r10.mo58810a(r0)     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            com.cubic.umo.ad.types.AKVASTResponse r0 = (com.cubic.umo.p045ad.types.AKVASTResponse) r0     // Catch:{ IOException -> 0x005d, Exception -> 0x0042 }
            goto L_0x0078
        L_0x0042:
            r0 = move-exception
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r10 = "VAST_AD: Exception while converting VAST XML Response to AKVASTResponse"
            java.lang.StringBuilder r3 = p583jk.C17884p.m44363d0(r10, r6, r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r9.mo6667d(r0)
            goto L_0x0077
        L_0x005d:
            r0 = move-exception
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r10 = "VAST_AD: IOException while converting VAST XML Response to AKVASTResponse"
            java.lang.StringBuilder r3 = p583jk.C17884p.m44363d0(r10, r6, r3)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r9.mo6667d(r0)
        L_0x0077:
            r0 = 0
        L_0x0078:
            r3 = 0
            r6 = 1
            if (r0 != 0) goto L_0x007f
            r8 = 0
            goto L_0x06c7
        L_0x007f:
            zb0.d r7 = r1.f33025d
            if (r7 != 0) goto L_0x0084
            goto L_0x0088
        L_0x0084:
            r9 = r19 ^ 1
            r7.f33190f = r9
        L_0x0088:
            if (r7 != 0) goto L_0x008c
            r7 = 0
            goto L_0x008e
        L_0x008c:
            java.lang.String r7 = r7.f33185a
        L_0x008e:
            boolean r9 = nc0.C12954d.m32800c(r7)
            if (r9 == 0) goto L_0x0098
            java.lang.String r5 = p584jl.C17885a.m44403H0(r7)
        L_0x0098:
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "VAST_AD: Response Xml Received"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = ": "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r7.mo6666c(r9)
            com.cubic.umo.ad.types.AKVASTResponseJsonAdapter r7 = new com.cubic.umo.ad.types.AKVASTResponseJsonAdapter
            com.squareup.moshi.o$a r9 = new com.squareup.moshi.o$a
            r9.<init>()
            com.squareup.moshi.o r11 = new com.squareup.moshi.o
            r11.<init>(r9)
            r7.<init>(r11)
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r11 = "VAST_AD: Response Received"
            java.lang.StringBuilder r10 = p583jk.C17884p.m44363d0(r11, r5, r10)
            java.lang.String r7 = r7.mo25051d(r0)
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r9.mo6666c(r7)
            zb0.d r7 = r1.f33025d
            if (r7 != 0) goto L_0x00e1
            goto L_0x06a1
        L_0x00e1:
            java.util.Map<java.lang.String, zb0.d$b> r10 = r7.f33188d
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x00eb:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0109
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Map<java.lang.String, zb0.d$b> r12 = r7.f33188d
            java.lang.Object r12 = r12.get(r11)
            zb0.d$b r12 = (zb0.C13370d.C13372b) r12
            if (r12 != 0) goto L_0x0102
            goto L_0x00eb
        L_0x0102:
            boolean r11 = kotlin.text.C24179b.m60559G(r2, r11, r6)
            r12.f33201a = r11
            goto L_0x00eb
        L_0x0109:
            boolean r2 = r7.f33190f
            if (r2 == 0) goto L_0x0165
            java.util.List r2 = r0.getAds()
            if (r2 != 0) goto L_0x0114
            goto L_0x012a
        L_0x0114:
            java.lang.Object r2 = r2.get(r3)
            com.cubic.umo.ad.types.AKVASTAd r2 = (com.cubic.umo.p045ad.types.AKVASTAd) r2
            if (r2 != 0) goto L_0x011d
            goto L_0x012a
        L_0x011d:
            com.cubic.umo.ad.types.AKVASTWrapper r2 = r2.getWrapper()
            if (r2 != 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            java.lang.String r2 = r2.getErrorTrackerUrl()
            if (r2 != 0) goto L_0x012c
        L_0x012a:
            r2 = 0
            goto L_0x0134
        L_0x012c:
            java.lang.CharSequence r2 = kotlin.text.C24179b.m60585g0(r2)
            java.lang.String r2 = r2.toString()
        L_0x0134:
            if (r2 != 0) goto L_0x0163
            java.util.List r2 = r0.getAds()
            if (r2 != 0) goto L_0x013d
            goto L_0x0153
        L_0x013d:
            java.lang.Object r2 = r2.get(r3)
            com.cubic.umo.ad.types.AKVASTAd r2 = (com.cubic.umo.p045ad.types.AKVASTAd) r2
            if (r2 != 0) goto L_0x0146
            goto L_0x0153
        L_0x0146:
            com.cubic.umo.ad.types.AKVASTInline r2 = r2.getInline()
            if (r2 != 0) goto L_0x014d
            goto L_0x0153
        L_0x014d:
            java.lang.String r2 = r2.getErrorTrackerUrl()
            if (r2 != 0) goto L_0x0155
        L_0x0153:
            r2 = 0
            goto L_0x015d
        L_0x0155:
            java.lang.CharSequence r2 = kotlin.text.C24179b.m60585g0(r2)
            java.lang.String r2 = r2.toString()
        L_0x015d:
            if (r2 != 0) goto L_0x0163
            java.lang.String r2 = r0.getNoAdErrorTrackerUrl()
        L_0x0163:
            r7.f33192h = r2
        L_0x0165:
            java.lang.String r2 = "</VAST>"
            boolean r10 = r7.mo40256h(r2)
            if (r10 != 0) goto L_0x0170
            r7.mo40255g(r2)
        L_0x0170:
            if (r10 != 0) goto L_0x0174
            goto L_0x069a
        L_0x0174:
            java.lang.String r2 = r0.getVastVersion()
            java.util.List<java.lang.String> r10 = r7.f33187c
            boolean r10 = kotlin.collections.C23825c.m58507d0(r10, r2)
            if (r10 != 0) goto L_0x0192
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r11 = "VAST_PARSER: Unsupported VAST Playlist Version: "
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r11)
            r10.mo6667d(r2)
            com.umo.ads.c.zzd r2 = com.umo.ads.p342c.zzd.XML_FEED_UNSUPPORTED_PLAYLIST
            zb0.C13370d.m33651c(r7, r2)
            r2 = 0
            goto L_0x0193
        L_0x0192:
            r2 = 1
        L_0x0193:
            if (r2 != 0) goto L_0x0197
            goto L_0x069a
        L_0x0197:
            java.lang.String r2 = r0.getVastVersion()
            r7.f33189e = r2
            java.lang.String r2 = "</Ad>"
            boolean r10 = r7.mo40256h(r2)
            java.lang.String r11 = "</InLine>"
            boolean r11 = r7.mo40256h(r11)
            java.lang.String r12 = "</Wrapper>"
            boolean r12 = r7.mo40256h(r12)
            if (r12 == 0) goto L_0x01b6
            int r13 = r7.f33198n
            int r13 = r13 + r6
            r7.f33198n = r13
        L_0x01b6:
            if (r10 != 0) goto L_0x01c1
            if (r11 != 0) goto L_0x01bc
            if (r12 == 0) goto L_0x01c1
        L_0x01bc:
            r7.mo40255g(r2)
            goto L_0x069a
        L_0x01c1:
            if (r10 != 0) goto L_0x01d5
            if (r11 != 0) goto L_0x01d5
            if (r12 != 0) goto L_0x01d5
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: XML Feed Empty."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_EMPTY
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x01d5:
            if (r11 != 0) goto L_0x01e7
            if (r12 != 0) goto L_0x01e7
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: Neither <InLine> nor <Wrapper> nodes received."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_UNSUPPORTED_PLAYLIST
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x01e7:
            java.lang.String r2 = "</Creatives>"
            boolean r13 = r7.mo40256h(r2)
            if (r13 != 0) goto L_0x01f2
            r7.mo40255g(r2)
        L_0x01f2:
            if (r13 != 0) goto L_0x01f6
            goto L_0x069a
        L_0x01f6:
            java.lang.String r2 = "</Creative>"
            boolean r2 = r7.mo40256h(r2)
            if (r11 == 0) goto L_0x020e
            if (r2 != 0) goto L_0x020e
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: No <Creative> node found in an InLine Ad."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_NO_CREATIVE
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x020e:
            java.util.List r2 = r0.getAds()
            if (r2 != 0) goto L_0x0215
            goto L_0x022b
        L_0x0215:
            java.lang.Object r2 = r2.get(r3)
            com.cubic.umo.ad.types.AKVASTAd r2 = (com.cubic.umo.p045ad.types.AKVASTAd) r2
            if (r2 != 0) goto L_0x021e
            goto L_0x022b
        L_0x021e:
            com.cubic.umo.ad.types.AKVASTWrapper r2 = r2.getWrapper()
            if (r2 != 0) goto L_0x0225
            goto L_0x022b
        L_0x0225:
            java.lang.String r2 = r2.getVastAdTagUri()
            if (r2 != 0) goto L_0x022d
        L_0x022b:
            r2 = 0
            goto L_0x0235
        L_0x022d:
            java.lang.CharSequence r2 = kotlin.text.C24179b.m60585g0(r2)
            java.lang.String r2 = r2.toString()
        L_0x0235:
            if (r10 == 0) goto L_0x024d
            if (r12 == 0) goto L_0x024d
            boolean r10 = nc0.C12954d.m32800c(r2)
            if (r10 != 0) goto L_0x024d
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: Invalid VASTAdTagURI received for a Wrapper Ad."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_UNSUPPORTED_PLAYLIST
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x024d:
            java.lang.String r10 = "</Linear>"
            boolean r10 = r7.mo40256h(r10)
            java.lang.String r13 = "</NonLinear>"
            boolean r13 = r7.mo40256h(r13)
            if (r13 != 0) goto L_0x0266
            java.lang.String r13 = "</NonLinearAds>"
            boolean r13 = r7.mo40256h(r13)
            if (r13 == 0) goto L_0x0264
            goto L_0x0266
        L_0x0264:
            r13 = 0
            goto L_0x0267
        L_0x0266:
            r13 = 1
        L_0x0267:
            java.util.Map<java.lang.Integer, mc0.e> r14 = r7.f33193i
            if (r14 != 0) goto L_0x027d
            if (r13 == 0) goto L_0x027d
            if (r10 != 0) goto L_0x027d
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: Non-Linear ad received in Linear Placement."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONLINEAR_AD_IN_LINEAR_PLACEMENT
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x027d:
            java.lang.String r13 = "</MediaFile>"
            boolean r13 = r7.mo40256h(r13)
            if (r11 == 0) goto L_0x0295
            if (r13 != 0) goto L_0x0295
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: No <MediaFile> node found in an InLine Ad."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_NO_CREATIVE
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x0295:
            if (r11 == 0) goto L_0x02a7
            if (r10 != 0) goto L_0x02a7
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: No <Linear> node found in an InLine Ad."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_UNSUPPORTED_PLAYLIST
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x02a7:
            java.util.List r0 = r0.getAds()
            if (r0 != 0) goto L_0x02af
            r0 = 0
            goto L_0x02b5
        L_0x02af:
            java.lang.Object r0 = r0.get(r3)
            com.cubic.umo.ad.types.AKVASTAd r0 = (com.cubic.umo.p045ad.types.AKVASTAd) r0
        L_0x02b5:
            if (r0 != 0) goto L_0x02b9
            goto L_0x0319
        L_0x02b9:
            com.cubic.umo.ad.types.AKVASTInline r10 = r0.getInline()
            if (r10 == 0) goto L_0x02c1
            r10 = 1
            goto L_0x02c2
        L_0x02c1:
            r10 = 0
        L_0x02c2:
            com.cubic.umo.ad.types.AKVASTWrapper r13 = r0.getWrapper()
            if (r13 == 0) goto L_0x02ca
            r13 = 1
            goto L_0x02cb
        L_0x02ca:
            r13 = 0
        L_0x02cb:
            if (r13 == 0) goto L_0x02ee
            com.cubic.umo.ad.types.AKVASTWrapper r13 = r0.getWrapper()
            if (r13 != 0) goto L_0x02d4
            goto L_0x02ee
        L_0x02d4:
            com.cubic.umo.ad.types.AKVASTCreatives r13 = r13.getCreatives()
            if (r13 != 0) goto L_0x02db
            goto L_0x02ee
        L_0x02db:
            java.util.List r13 = r13.getCreativesList()
            if (r13 != 0) goto L_0x02e2
            goto L_0x02ee
        L_0x02e2:
            java.lang.Object r13 = r13.get(r3)
            com.cubic.umo.ad.types.AKVASTCreative r13 = (com.cubic.umo.p045ad.types.AKVASTCreative) r13
            if (r13 != 0) goto L_0x02eb
            goto L_0x02ee
        L_0x02eb:
            r7.mo40252d(r3, r13, r0)
        L_0x02ee:
            if (r10 == 0) goto L_0x0319
            com.cubic.umo.ad.types.AKVASTInline r10 = r0.getInline()
            if (r10 != 0) goto L_0x02f7
            goto L_0x0319
        L_0x02f7:
            com.cubic.umo.ad.types.AKVASTCreatives r10 = r10.getCreatives()
            if (r10 != 0) goto L_0x02fe
            goto L_0x0319
        L_0x02fe:
            java.util.List r10 = r10.getCreativesList()
            if (r10 != 0) goto L_0x0305
            goto L_0x0319
        L_0x0305:
            java.util.Iterator r10 = r10.iterator()
        L_0x0309:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0319
            java.lang.Object r13 = r10.next()
            com.cubic.umo.ad.types.AKVASTCreative r13 = (com.cubic.umo.p045ad.types.AKVASTCreative) r13
            r7.mo40252d(r6, r13, r0)
            goto L_0x0309
        L_0x0319:
            java.util.Map<java.lang.Integer, mc0.e> r10 = r7.f33193i
            if (r10 != 0) goto L_0x0320
            r8 = 0
            goto L_0x0396
        L_0x0320:
            r13 = -1
            if (r11 != r6) goto L_0x0363
            java.util.ArrayList<java.lang.Integer> r14 = r7.f33194j
            if (r14 != 0) goto L_0x0329
            r8 = -1
            goto L_0x0378
        L_0x0329:
            int r15 = r14.size()
            if (r15 <= r6) goto L_0x0338
            int r15 = r14.size()
            if (r15 <= r6) goto L_0x0338
            java.util.Collections.sort(r14)
        L_0x0338:
            ch.qos.logback.classic.Logger r15 = ac0.C7557a.f23040a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "Least Linear Seq. No: "
            r9.append(r8)
            r9.append(r14)
            java.lang.String r8 = "[0]"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r15.mo6666c(r8)
            java.lang.Object r8 = r14.get(r3)
            java.lang.String r9 = "it[0]"
            mf0.C24362h.m61210e(r8, r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            goto L_0x0378
        L_0x0363:
            java.util.ArrayList<java.lang.Integer> r8 = r7.f33194j
            if (r8 != 0) goto L_0x0368
            goto L_0x0370
        L_0x0368:
            java.lang.Object r8 = r8.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L_0x0374
        L_0x0370:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
        L_0x0374:
            int r8 = r8.intValue()
        L_0x0378:
            if (r8 == r13) goto L_0x0385
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r10.get(r9)
            mc0.e r9 = (mc0.C12913e) r9
            goto L_0x0386
        L_0x0385:
            r9 = 0
        L_0x0386:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r13 = "Selected Linear Creative Sequence No: "
            java.lang.String r8 = mf0.C24362h.m61216k(r8, r13)
            r10.mo6666c(r8)
            r8 = r9
        L_0x0396:
            if (r11 == 0) goto L_0x03c0
            java.util.Map<java.lang.Integer, mc0.e> r9 = r7.f33193i
            if (r9 == 0) goto L_0x039e
            if (r8 != 0) goto L_0x03c0
        L_0x039e:
            if (r8 != 0) goto L_0x03a2
            r9 = 0
            goto L_0x03a4
        L_0x03a2:
            java.util.List<mc0.b> r9 = r8.f31949d
        L_0x03a4:
            if (r9 == 0) goto L_0x03af
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x03af
            r9 = 1
            goto L_0x03b0
        L_0x03af:
            r9 = 0
        L_0x03b0:
            if (r9 != 0) goto L_0x03c0
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: No supported ad formats received - 1."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.CREATIVE_UNSUPPORTED_FORMAT
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x03c0:
            java.lang.String r9 = "<set-?>"
            if (r8 == 0) goto L_0x04b6
            mc0.a r10 = r7.f33191g
            if (r10 != 0) goto L_0x03d6
            mc0.a r10 = new mc0.a
            r10.<init>()
            r7.f33191g = r10
            java.lang.String r13 = r7.f33185a
            mf0.C24362h.m61211f(r13, r9)
            r10.f31946a = r13
        L_0x03d6:
            mc0.a r10 = r7.f33191g
            if (r10 != 0) goto L_0x03db
            goto L_0x03e2
        L_0x03db:
            java.lang.String r13 = r8.f31948c
            mf0.C24362h.m61211f(r13, r9)
            r10.f31948c = r13
        L_0x03e2:
            mc0.a r10 = r7.f33191g
            java.util.LinkedHashMap r13 = r8.f31953h
            if (r13 != 0) goto L_0x03ea
            goto L_0x0475
        L_0x03ea:
            if (r10 != 0) goto L_0x03ee
            r14 = 0
            goto L_0x03f0
        L_0x03ee:
            java.util.LinkedHashMap r14 = r10.f31953h
        L_0x03f0:
            if (r14 != 0) goto L_0x03fc
            if (r10 != 0) goto L_0x03f5
            goto L_0x03fc
        L_0x03f5:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            r10.f31953h = r14
        L_0x03fc:
            java.util.Set r10 = r13.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0404:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x0475
            java.lang.Object r14 = r10.next()
            com.umo.ads.c.zzb r14 = (com.umo.ads.p342c.zzb) r14
            mc0.a r15 = r7.f33191g
            if (r15 != 0) goto L_0x0415
            goto L_0x0419
        L_0x0415:
            java.util.LinkedHashMap r15 = r15.f31953h
            if (r15 != 0) goto L_0x041b
        L_0x0419:
            r15 = 0
            goto L_0x0423
        L_0x041b:
            boolean r15 = r15.containsKey(r14)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
        L_0x0423:
            mf0.C24362h.m61208c(r15)
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x045a
            java.lang.Object r15 = r13.get(r14)
            mc0.c r15 = (mc0.C12911c) r15
            if (r15 != 0) goto L_0x0435
            goto L_0x0404
        L_0x0435:
            java.util.ArrayList r15 = r15.f31963b
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            if (r15 != 0) goto L_0x043e
            goto L_0x0404
        L_0x043e:
            mc0.a r6 = r7.f33191g
            if (r6 != 0) goto L_0x0443
            goto L_0x0473
        L_0x0443:
            java.util.LinkedHashMap r6 = r6.f31953h
            if (r6 != 0) goto L_0x0448
            goto L_0x0473
        L_0x0448:
            java.lang.Object r6 = r6.get(r14)
            mc0.c r6 = (mc0.C12911c) r6
            if (r6 != 0) goto L_0x0451
            goto L_0x0473
        L_0x0451:
            java.util.ArrayList r6 = r6.f31963b
            if (r6 != 0) goto L_0x0456
            goto L_0x0473
        L_0x0456:
            r6.addAll(r15)
            goto L_0x0473
        L_0x045a:
            java.lang.Object r6 = r13.get(r14)
            mc0.c r6 = (mc0.C12911c) r6
            if (r6 != 0) goto L_0x0463
            goto L_0x0473
        L_0x0463:
            mc0.a r15 = r7.f33191g
            if (r15 != 0) goto L_0x0468
            goto L_0x0473
        L_0x0468:
            java.util.LinkedHashMap r15 = r15.f31953h
            if (r15 != 0) goto L_0x046d
            goto L_0x0473
        L_0x046d:
            java.lang.Object r6 = r15.put(r14, r6)
            mc0.c r6 = (mc0.C12911c) r6
        L_0x0473:
            r6 = 1
            goto L_0x0404
        L_0x0475:
            java.lang.String r6 = r8.f31954i
            boolean r6 = nc0.C12954d.m32800c(r6)
            if (r6 == 0) goto L_0x0486
            mc0.a r6 = r7.f33191g
            if (r6 != 0) goto L_0x0482
            goto L_0x0486
        L_0x0482:
            java.lang.String r10 = r8.f31954i
            r6.f31954i = r10
        L_0x0486:
            java.util.List<mc0.b> r6 = r8.f31949d
            if (r6 == 0) goto L_0x0491
            mc0.a r10 = r7.f33191g
            if (r10 != 0) goto L_0x048f
            goto L_0x0491
        L_0x048f:
            r10.f31949d = r6
        L_0x0491:
            java.lang.String r6 = r8.f31952g
            if (r6 != 0) goto L_0x0496
            goto L_0x049d
        L_0x0496:
            mc0.a r10 = r7.f33191g
            if (r10 != 0) goto L_0x049b
            goto L_0x049d
        L_0x049b:
            r10.f31952g = r6
        L_0x049d:
            boolean r6 = r7.f33190f
            if (r6 == 0) goto L_0x04b1
            mc0.a r6 = r7.f33191g
            if (r6 != 0) goto L_0x04a6
            goto L_0x04aa
        L_0x04a6:
            int r10 = r8.f31955j
            r6.f31955j = r10
        L_0x04aa:
            if (r6 != 0) goto L_0x04ad
            goto L_0x04b1
        L_0x04ad:
            com.umo.ads.u.zzq r8 = r8.f31956k
            r6.f31956k = r8
        L_0x04b1:
            r6 = 0
            r7.f33193i = r6
            r7.f33194j = r6
        L_0x04b6:
            boolean r6 = r7.f33190f
            if (r6 == 0) goto L_0x0504
            if (r0 != 0) goto L_0x04bd
            goto L_0x0504
        L_0x04bd:
            com.cubic.umo.ad.types.AKVASTWrapper r6 = r0.getWrapper()
            if (r6 != 0) goto L_0x04c4
            goto L_0x04ca
        L_0x04c4:
            java.util.List r6 = r6.getImpressionTrackers()
            if (r6 != 0) goto L_0x04cc
        L_0x04ca:
            r6 = 0
            goto L_0x04d4
        L_0x04cc:
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x04d4:
            if (r6 != 0) goto L_0x04ed
            com.cubic.umo.ad.types.AKVASTInline r0 = r0.getInline()
            if (r0 != 0) goto L_0x04dd
            goto L_0x04e3
        L_0x04dd:
            java.util.List r0 = r0.getImpressionTrackers()
            if (r0 != 0) goto L_0x04e5
        L_0x04e3:
            r6 = 0
            goto L_0x04ed
        L_0x04e5:
            int r0 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x04ed:
            if (r6 != 0) goto L_0x04f0
            goto L_0x0504
        L_0x04f0:
            int r0 = r6.intValue()
            if (r0 != 0) goto L_0x0504
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: Invalid Impression Tracker received."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_FEED_UNSUPPORTED_PLAYLIST
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x0504:
            if (r12 == 0) goto L_0x0526
            int r0 = r7.f33198n
            int r6 = r7.f33196l
            int r8 = r6 + 1
            if (r0 < r8) goto L_0x0526
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.String r4 = "VAST_PARSER: Wrapper Count exceeded max limit of "
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r4)
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_MAX_WRAPPERS
            zb0.C13370d.m33651c(r7, r0)
            r7.f33198n = r3
            goto L_0x069a
        L_0x0526:
            boolean r0 = r7.f33190f
            if (r0 == 0) goto L_0x052e
            if (r11 == 0) goto L_0x052e
            goto L_0x05b5
        L_0x052e:
            mc0.a r0 = r7.f33191g
            if (r0 != 0) goto L_0x0534
            goto L_0x05b5
        L_0x0534:
            java.util.LinkedHashMap r0 = r0.f31953h
            if (r0 != 0) goto L_0x053a
            goto L_0x05b5
        L_0x053a:
            java.util.Set r6 = r0.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0542:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x05b5
            java.lang.Object r8 = r6.next()
            com.umo.ads.c.zzb r8 = (com.umo.ads.p342c.zzb) r8
            java.lang.Object r10 = r0.get(r8)
            mc0.c r10 = (mc0.C12911c) r10
            if (r10 != 0) goto L_0x0558
            r13 = 0
            goto L_0x055a
        L_0x0558:
            java.util.ArrayList r13 = r10.f31963b
        L_0x055a:
            if (r13 == 0) goto L_0x0566
            boolean r13 = r13.isEmpty()
            r14 = 1
            r13 = r13 ^ r14
            if (r13 == 0) goto L_0x0566
            r13 = 1
            goto L_0x0567
        L_0x0566:
            r13 = 0
        L_0x0567:
            if (r13 == 0) goto L_0x0542
            if (r10 != 0) goto L_0x056c
            goto L_0x0570
        L_0x056c:
            java.util.ArrayList r10 = r10.f31963b
            if (r10 != 0) goto L_0x0572
        L_0x0570:
            r10 = 0
            goto L_0x057a
        L_0x0572:
            int r10 = r10.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L_0x057a:
            mf0.C24362h.m61208c(r10)
            int r10 = r10.intValue()
            com.umo.ads.c.zzb r13 = com.umo.ads.p342c.zzb.ERROR
            if (r8 != r13) goto L_0x058f
            java.lang.String r13 = r7.f33192h
            boolean r13 = nc0.C12954d.m32800c(r13)
            if (r13 == 0) goto L_0x058f
            int r10 = r10 + 1
        L_0x058f:
            int r13 = r7.f33195k
            if (r10 <= r13) goto L_0x0542
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "VAST_PARSER: \""
            r6.append(r10)
            r6.append(r8)
            java.lang.String r8 = "\" Tracker Count exceeded max limit of "
            r6.append(r8)
            int r8 = r7.f33195k
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r0.mo6667d(r6)
            r0 = 0
            goto L_0x05b6
        L_0x05b5:
            r0 = 1
        L_0x05b6:
            if (r0 != 0) goto L_0x05bf
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.XML_MAX_TRACKERS
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x05bf:
            if (r11 == 0) goto L_0x05d9
            mc0.a r0 = r7.f33191g
            if (r0 == 0) goto L_0x05d9
            boolean r0 = r7.mo40253e()
            if (r0 != 0) goto L_0x05d9
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "VAST_PARSER: No supported ad formats received - 2."
            r0.mo6667d(r2)
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.CREATIVE_ABSENT
            zb0.C13370d.m33651c(r7, r0)
            goto L_0x069a
        L_0x05d9:
            if (r12 == 0) goto L_0x05dc
            goto L_0x05de
        L_0x05dc:
            java.lang.String r4 = " (INLINE)"
        L_0x05de:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "VAST_PARSER: Valid Playlist Received"
            r6.append(r8)
            r6.append(r4)
            r4 = 46
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.mo6672i(r4)
            if (r12 == 0) goto L_0x060e
            if (r2 != 0) goto L_0x05ff
            goto L_0x069c
        L_0x05ff:
            zb0.d$a r0 = r7.f33186b
            if (r0 != 0) goto L_0x0605
            goto L_0x069c
        L_0x0605:
            yb0.h r0 = (yb0.C13304h) r0
            r4 = 1
            r6 = 0
            r0.mo40210b(r2, r6, r4)
            goto L_0x069c
        L_0x060e:
            r6 = 0
            if (r11 == 0) goto L_0x069c
            java.lang.String r0 = r7.f33192h
            boolean r0 = nc0.C12954d.m32800c(r0)
            if (r0 != 0) goto L_0x061a
            goto L_0x067a
        L_0x061a:
            com.umo.ads.c.zzb r0 = com.umo.ads.p342c.zzb.ERROR
            mc0.a r2 = r7.f33191g
            if (r2 != 0) goto L_0x0622
            r2 = r6
            goto L_0x0624
        L_0x0622:
            java.util.LinkedHashMap r2 = r2.f31953h
        L_0x0624:
            mf0.C24362h.m61208c(r2)
            boolean r2 = r2.containsKey(r0)
            if (r2 == 0) goto L_0x064f
            mc0.a r2 = r7.f33191g
            if (r2 != 0) goto L_0x0633
            r2 = r6
            goto L_0x0635
        L_0x0633:
            java.util.LinkedHashMap r2 = r2.f31953h
        L_0x0635:
            mf0.C24362h.m61208c(r2)
            java.lang.Object r0 = r2.get(r0)
            mc0.c r0 = (mc0.C12911c) r0
            if (r0 != 0) goto L_0x0641
            goto L_0x067a
        L_0x0641:
            java.util.ArrayList r0 = r0.f31963b
            if (r0 != 0) goto L_0x0646
            goto L_0x067a
        L_0x0646:
            java.lang.String r2 = r7.f33192h
            mf0.C24362h.m61208c(r2)
            r0.add(r2)
            goto L_0x067a
        L_0x064f:
            mc0.c r2 = new mc0.c
            r2.<init>()
            mf0.C24362h.m61211f(r0, r9)
            r2.f31962a = r0
            r2.f31964c = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.f31963b = r4
            java.lang.String r8 = r7.f33192h
            mf0.C24362h.m61208c(r8)
            r4.add(r8)
            mc0.a r4 = r7.f33191g
            if (r4 != 0) goto L_0x066f
            goto L_0x067a
        L_0x066f:
            java.util.LinkedHashMap r4 = r4.f31953h
            if (r4 != 0) goto L_0x0674
            goto L_0x067a
        L_0x0674:
            java.lang.Object r0 = r4.put(r0, r2)
            mc0.c r0 = (mc0.C12911c) r0
        L_0x067a:
            mc0.a r0 = r7.f33191g
            if (r0 != 0) goto L_0x067f
            goto L_0x0683
        L_0x067f:
            zb0.d$a r2 = r7.f33186b
            if (r2 != 0) goto L_0x0685
        L_0x0683:
            r8 = r6
            goto L_0x0698
        L_0x0685:
            java.lang.String r4 = r7.f33185a
            yb0.h r2 = (yb0.C13304h) r2
            java.lang.String r6 = "spotId"
            mf0.C24362h.m61211f(r4, r6)
            yb0.h$a r2 = r2.f33022a
            if (r2 != 0) goto L_0x0693
            goto L_0x0696
        L_0x0693:
            r2.mo40214a(r4, r0)
        L_0x0696:
            bf0.d r8 = bf0.C21050d.f52856a
        L_0x0698:
            if (r8 != 0) goto L_0x069c
        L_0x069a:
            r14 = 0
            goto L_0x069d
        L_0x069c:
            r14 = 1
        L_0x069d:
            if (r14 != 0) goto L_0x06a1
            r14 = 1
            goto L_0x06a2
        L_0x06a1:
            r14 = 0
        L_0x06a2:
            if (r14 == 0) goto L_0x06c5
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "VAST_PARSER: Invalid Playlist received"
            r2.append(r4)
            r2.append(r5)
            r4 = 46
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.mo6667d(r2)
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR
            r2 = 2
            m33568d(r1, r0, r2)
        L_0x06c5:
            bf0.d r8 = bf0.C21050d.f52856a
        L_0x06c7:
            if (r8 != 0) goto L_0x06ca
            return r3
        L_0x06ca:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13304h.mo40213h(java.lang.String, hi0.t, boolean):boolean");
    }
}
