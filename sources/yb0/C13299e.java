package yb0;

import ac0.C7557a;
import bf0.C21050d;
import cc0.C7585a;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonDataException;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23569w;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.List;
import mf0.C24362h;
import nb0.C12949m;
import nc0.C12954d;
import p001a0.C0016g;
import p043ch.qos.logback.classic.Logger;
import p583jk.C17884p;
import vb0.C13198b;
import wb0.C13233c;

/* renamed from: yb0.e */
public final class C13299e {

    /* renamed from: a */
    public final C13198b f33007a;

    /* renamed from: yb0.e$a */
    public static final class C13300a implements C23538f {

        /* renamed from: b */
        public final /* synthetic */ String f33008b;

        /* renamed from: c */
        public final /* synthetic */ C13299e f33009c;

        public C13300a(String str, C13299e eVar) {
            this.f33008b = str;
            this.f33009c = eVar;
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
                StringBuilder t = C0016g.m36t("Banner Playlist fetch ", str);
                t.append(this.f33008b);
                t.append(": (Exception: ");
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
                    uMOAdKitError = UMOAdKitError.AD_REQUEST_TIMED_OUT;
                } else {
                    uMOAdKitError = UMOAdKitError.AD_REQUEST_FAILED;
                }
                this.f33009c.mo40201a(uMOAdKitError);
            }
        }

        /* renamed from: d */
        public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
            boolean z;
            C24362h.m61211f(c0Var, Payload.RESPONSE);
            if (eVar != null && ((C23569w) eVar).isCanceled()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (!c0Var.mo58644v()) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("Banner Playlist fetch failed");
                    J0.append(this.f33008b);
                    J0.append(" (StatusCode: ");
                    J0.append(c0Var.f59412d);
                    J0.append(')');
                    logger.mo6667d(J0.toString());
                    this.f33009c.mo40201a(UMOAdKitError.AD_REQUEST_FAILED);
                } else if (c0Var.f59412d == 204) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(this.f33008b, "Banner Playlist fetched but response is empty"));
                    this.f33009c.mo40201a(UMOAdKitError.EMPTY_AD_CONTENT);
                } else {
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder J02 = C21100e.m49315J0("Banner Playlist fetched Successfully");
                    J02.append(this.f33008b);
                    J02.append(": (");
                    J02.append(c0Var.f59416h);
                    J02.append(')');
                    logger2.mo6672i(J02.toString());
                    C23536e0 e0Var = c0Var.f59416h;
                    C21050d dVar = null;
                    if (e0Var != null) {
                        C13299e eVar2 = this.f33009c;
                        String str = this.f33008b;
                        try {
                            List list = (List) new C8017o(new C8017o.C8018a()).mo25081b(C12949m.m32790d(List.class, AKBannerResponse.class)).mo25049b(e0Var.mo58649v());
                            if (list != null) {
                                eVar2.f33007a.zza((List<AKBannerResponse>) list);
                                dVar = C21050d.f52856a;
                            }
                            if (dVar == null) {
                                eVar2.mo40201a(UMOAdKitError.AD_REQUEST_FAILED);
                            }
                        } catch (IOException e) {
                            Logger logger3 = C7557a.f23040a;
                            StringBuilder d0 = C17884p.m44363d0("IOException while processing Banner Ad Response", str, ": Exception: ");
                            d0.append(e.getLocalizedMessage());
                            logger3.mo6667d(d0.toString());
                            eVar2.mo40201a(UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR);
                        } catch (JsonDataException e2) {
                            Logger logger4 = C7557a.f23040a;
                            StringBuilder d02 = C17884p.m44363d0("JsonDataException while processing Banner Ad Response", str, ": Exception: ");
                            d02.append(e2.getLocalizedMessage());
                            logger4.mo6667d(d02.toString());
                            eVar2.mo40201a(UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR);
                        }
                        dVar = C21050d.f52856a;
                    }
                    if (dVar == null) {
                        this.f33009c.mo40201a(UMOAdKitError.AD_REQUEST_FAILED);
                    }
                }
            }
        }
    }

    public C13299e(C13198b bVar) {
        C24362h.m61211f(bVar, "fetchListener");
        this.f33007a = bVar;
    }

    /* renamed from: a */
    public final void mo40201a(UMOAdKitError uMOAdKitError) {
        this.f33007a.mo40078b("", uMOAdKitError);
    }

    /* renamed from: b */
    public final void mo40202b(String str, String str2, String str3, String str4) {
        Logger logger = C7557a.f23040a;
        StringBuilder h = C16759e.m42352h("FETCHING BANNER PLAYLIST: \nREQUEST URL", str4, ": ", str, " \nREQUEST PAYLOAD");
        h.append(str4);
        h.append(": ");
        h.append(str2);
        logger.mo6672i(h.toString());
        new C7585a(C13233c.m33332a(C13233c.m33348q(str3)), C13233c.m33340i()).mo23845b(str, str2, new C13300a(str4, this));
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [bf0.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d5  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40203c(java.util.ArrayList r13, boolean r14) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            if (r13 == 0) goto L_0x000d
            boolean r2 = r13.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            if (r2 != 0) goto L_0x001d
            ch.qos.logback.classic.Logger r13 = ac0.C7557a.f23040a
            java.lang.String r14 = "Invalid SpotId(s) for Banner Playlist Request"
            r13.mo6667d(r14)
            com.cubic.umo.ad.ext.types.UMOAdKitError r13 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.BAD_INPUTS
            r12.mo40201a(r13)
            return
        L_0x001d:
            if (r13 == 0) goto L_0x0028
            boolean r2 = r13.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0028
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x004b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = " (SpotId(s): ["
            r2.append(r4)
            mf0.C24362h.m61208c(r13)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            java.lang.String r6 = ", "
            r5 = r13
            java.lang.String r4 = kotlin.collections.C23825c.m58520q0(r5, r6, r7, r8, r9, r10)
            java.lang.String r2 = com.google.android.play.core.appupdate.C14226d.m35344K0(r2, r4)
            goto L_0x004c
        L_0x004b:
            r2 = r3
        L_0x004c:
            mf0.C24362h.m61208c(r13)
            android.content.Context r4 = wb0.C13233c.f32842a
            java.lang.Object r4 = r13.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            mc0.d r4 = wb0.C13233c.m33348q(r4)
            r5 = 0
            if (r4 != 0) goto L_0x0060
            goto L_0x00ee
        L_0x0060:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r4.f31966b
            if (r6 != 0) goto L_0x0066
            r6 = r5
            goto L_0x006a
        L_0x0066:
            java.lang.String r6 = r6.mo11106c()
        L_0x006a:
            boolean r6 = nc0.C12954d.m32800c(r6)
            java.lang.String r7 = "/"
            if (r6 == 0) goto L_0x00aa
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r4 = r4.f31966b
            if (r4 != 0) goto L_0x0077
            goto L_0x00b0
        L_0x0077:
            java.lang.String r6 = r4.mo11119n()
            boolean r6 = nc0.C12954d.m32800c(r6)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = r4.mo11119n()
            goto L_0x0092
        L_0x0086:
            com.cubic.umo.ad.types.AKBannerParams r6 = wb0.C13233c.m33343l()
            if (r6 != 0) goto L_0x008e
            r6 = r5
            goto L_0x0092
        L_0x008e:
            java.lang.String r6 = r6.getBannerPlaylist()
        L_0x0092:
            java.lang.String r4 = r4.mo11106c()
            if (r4 != 0) goto L_0x009a
            r4 = r5
            goto L_0x00a5
        L_0x009a:
            boolean r8 = uh0.C25081h.m62836z(r4, r7, r0)
            if (r8 == 0) goto L_0x00a1
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r4 = mf0.C24362h.m61216k(r7, r4)
        L_0x00a5:
            java.lang.String r4 = mf0.C24362h.m61216k(r6, r4)
            goto L_0x00ce
        L_0x00aa:
            com.cubic.umo.ad.types.AKBannerParams r4 = wb0.C13233c.m33343l()
            if (r4 != 0) goto L_0x00b2
        L_0x00b0:
            r4 = r3
            goto L_0x00ce
        L_0x00b2:
            java.lang.String r6 = r4.getServerUrl()
            java.lang.String r8 = "<this>"
            mf0.C24362h.m61211f(r6, r8)
            boolean r8 = uh0.C25081h.m62836z(r6, r7, r0)
            if (r8 == 0) goto L_0x00c2
            goto L_0x00c6
        L_0x00c2:
            java.lang.String r6 = mf0.C24362h.m61216k(r7, r6)
        L_0x00c6:
            java.lang.String r4 = r4.getBannerPlaylist()
            java.lang.String r4 = mf0.C24362h.m61216k(r4, r6)
        L_0x00ce:
            boolean r6 = nc0.C12954d.m32800c(r4)
            if (r6 != 0) goto L_0x00d5
            goto L_0x00ee
        L_0x00d5:
            java.lang.String r3 = "?id="
            java.lang.StringBuilder r3 = p001a0.C0016g.m36t(r4, r3)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            java.lang.String r7 = ","
            r6 = r13
            java.lang.String r4 = kotlin.collections.C23825c.m58520q0(r6, r7, r8, r9, r10, r11)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x00ee:
            zb0.c r4 = new zb0.c
            r4.<init>()
            java.lang.Object r6 = r13.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            mc0.d r6 = wb0.C13233c.m33348q(r6)
            if (r6 != 0) goto L_0x0101
            r8 = r5
            goto L_0x0169
        L_0x0101:
            boolean r7 = wb0.C13233c.m33345n(r6)
            d7.a r8 = wb0.C13233c.f32844c
            if (r8 != 0) goto L_0x010b
            r8 = r5
            goto L_0x010d
        L_0x010b:
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r8 = r8.f15463i
        L_0x010d:
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r5, r8)
            r4.f33183a = r9
            com.cubic.umo.ad.types.AKRequestPayload r8 = new com.cubic.umo.ad.types.AKRequestPayload
            java.lang.String r9 = "NA"
            r8.<init>(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r7 != 0) goto L_0x013e
            java.util.Iterator r6 = r13.iterator()
        L_0x0126:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0145
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            mc0.d r7 = wb0.C13233c.m33348q(r7)
            com.cubic.umo.ad.types.AKImp r7 = r4.mo40251g(r7, r1)
            r9.add(r7)
            goto L_0x0126
        L_0x013e:
            com.cubic.umo.ad.types.AKImp r6 = r4.mo40251g(r6, r0)
            r9.add(r6)
        L_0x0145:
            r8.f7576b = r9
            com.cubic.umo.ad.types.AKApp r6 = r4.mo40247b()
            r8.f7577c = r6
            com.cubic.umo.ad.types.AKDevice r6 = r4.mo40250f()
            r8.f7578d = r6
            com.cubic.umo.ad.types.AKGeo r6 = r6.f7452D
            if (r6 != 0) goto L_0x0159
            r6 = r5
            goto L_0x015b
        L_0x0159:
            java.lang.String r6 = r6.f7506c
        L_0x015b:
            com.cubic.umo.ad.types.AKUser r6 = r4.mo40249d(r6)
            r8.f7579e = r6
            com.cubic.umo.ad.types.AKPayloadExt r14 = r4.mo40248c(r14)
            r8.f7580f = r14
            r4.f33183a = r5
        L_0x0169:
            boolean r14 = nc0.C12954d.m32800c(r3)
            if (r14 != 0) goto L_0x0170
            goto L_0x017d
        L_0x0170:
            boolean r14 = android.webkit.URLUtil.isHttpUrl(r3)
            if (r14 != 0) goto L_0x017e
            boolean r14 = android.webkit.URLUtil.isHttpsUrl(r3)
            if (r14 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            if (r0 != 0) goto L_0x01a4
            ch.qos.logback.classic.Logger r13 = ac0.C7557a.f23040a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Invalid Banner Playlist Request Url"
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = ": "
            r14.append(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            r13.mo6667d(r14)
            com.cubic.umo.ad.ext.types.UMOAdKitError r13 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
            r12.mo40201a(r13)
            return
        L_0x01a4:
            if (r8 != 0) goto L_0x01a8
            goto L_0x0219
        L_0x01a8:
            java.util.List<com.cubic.umo.ad.types.AKImp> r14 = r8.f7576b
            if (r14 != 0) goto L_0x01ad
            goto L_0x01bf
        L_0x01ad:
            java.lang.Object r14 = r14.get(r1)
            com.cubic.umo.ad.types.AKImp r14 = (com.cubic.umo.p045ad.types.AKImp) r14
            if (r14 != 0) goto L_0x01b6
            goto L_0x01bf
        L_0x01b6:
            com.cubic.umo.ad.types.AKVideo r14 = r14.f7536i
            if (r14 != 0) goto L_0x01bb
            goto L_0x01bf
        L_0x01bb:
            com.cubic.umo.ad.types.AKImpVideoOrBannerExt r14 = r14.f7713y
            if (r14 != 0) goto L_0x01c1
        L_0x01bf:
            r14 = r5
            goto L_0x01c3
        L_0x01c1:
            java.lang.String r14 = r14.f7546a
        L_0x01c3:
            if (r14 != 0) goto L_0x01e0
            java.util.List<com.cubic.umo.ad.types.AKImp> r14 = r8.f7576b
            if (r14 != 0) goto L_0x01ca
            goto L_0x01e1
        L_0x01ca:
            java.lang.Object r14 = r14.get(r1)
            com.cubic.umo.ad.types.AKImp r14 = (com.cubic.umo.p045ad.types.AKImp) r14
            if (r14 != 0) goto L_0x01d3
            goto L_0x01e1
        L_0x01d3:
            com.cubic.umo.ad.types.AKBanner r14 = r14.f7535h
            if (r14 != 0) goto L_0x01d8
            goto L_0x01e1
        L_0x01d8:
            com.cubic.umo.ad.types.AKImpVideoOrBannerExt r14 = r14.f7418m
            if (r14 != 0) goto L_0x01dd
            goto L_0x01e1
        L_0x01dd:
            java.lang.String r5 = r14.f7546a
            goto L_0x01e1
        L_0x01e0:
            r5 = r14
        L_0x01e1:
            boolean r14 = nc0.C12954d.m32800c(r5)
            if (r14 == 0) goto L_0x01fb
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r3)
            r0 = 38
            r14.append(r0)
            r14.append(r5)
            java.lang.String r3 = r14.toString()
        L_0x01fb:
            com.cubic.umo.ad.types.AKRequestPayloadJsonAdapter r14 = new com.cubic.umo.ad.types.AKRequestPayloadJsonAdapter     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            com.squareup.moshi.o$a r0 = new com.squareup.moshi.o$a     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            r0.<init>()     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            com.squareup.moshi.o r4 = new com.squareup.moshi.o     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            r4.<init>(r0)     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            r14.<init>(r4)     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            java.lang.String r14 = r14.mo25051d(r8)     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            java.lang.Object r13 = r13.get(r1)     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            r12.mo40202b(r3, r14, r13, r2)     // Catch:{ IllegalAccessException -> 0x023d, IOException -> 0x022c }
            bf0.d r5 = bf0.C21050d.f52856a
        L_0x0219:
            if (r5 != 0) goto L_0x022b
            ch.qos.logback.classic.Logger r13 = ac0.C7557a.f23040a
            java.lang.String r14 = "Invalid Banner Playlist Request Payload"
            java.lang.String r14 = mf0.C24362h.m61216k(r2, r14)
            r13.mo6667d(r14)
            com.cubic.umo.ad.ext.types.UMOAdKitError r13 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
            r12.mo40201a(r13)
        L_0x022b:
            return
        L_0x022c:
            ch.qos.logback.classic.Logger r13 = ac0.C7557a.f23040a
            java.lang.String r14 = "IOException while attempting to fetch a Banner Playlist"
            java.lang.String r14 = mf0.C24362h.m61216k(r2, r14)
            r13.mo6667d(r14)
            com.cubic.umo.ad.ext.types.UMOAdKitError r13 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
            r12.mo40201a(r13)
            return
        L_0x023d:
            ch.qos.logback.classic.Logger r13 = ac0.C7557a.f23040a
            java.lang.String r14 = "IllegalAccessException while attempting to fetch a Banner Playlist"
            java.lang.String r14 = mf0.C24362h.m61216k(r2, r14)
            r13.mo6667d(r14)
            com.cubic.umo.ad.ext.types.UMOAdKitError r13 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_REQUEST_FAILED
            r12.mo40201a(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13299e.mo40203c(java.util.ArrayList, boolean):void");
    }
}
