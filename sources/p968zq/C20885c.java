package p968zq;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import ce0.C21100e;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.deeplink.DeepLinkListener;
import com.braze.Braze;
import com.moovit.app.general.settings.privacy.C14894a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p528gz.C17269d;
import p716oy.C18860a;
import p977zz.C20930c;

/* renamed from: zq.c */
public final class C20885c implements DeepLinkListener {

    /* renamed from: c */
    public static volatile C20885c f52624c;

    /* renamed from: a */
    public final Application f52625a;

    /* renamed from: b */
    public long f52626b = -2;

    public C20885c(Application application) {
        C21100e.m49373x(application, "application");
        this.f52625a = application;
    }

    /* renamed from: a */
    public final void mo52989a() {
        C21100e.m49369v(1);
        try {
            String string = C20930c.m49021c(this.f52625a).getString("com.appsflyer.AppKey");
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                AppsFlyerLib instance = AppsFlyerLib.getInstance();
                HashMap hashMap = new HashMap(1);
                hashMap.put("brazeCustomerId", Braze.getInstance(C17269d.m43283a().f44637a).getDeviceId());
                instance.setAdditionalData(hashMap);
                instance.setDebugLog(false);
                instance.subscribeForDeepLink(this, TimeUnit.SECONDS.toMillis(20));
                instance.init(string, (AppsFlyerConversionListener) null, this.f52625a.getApplicationContext());
                this.f52626b = -1;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo52990b(boolean z) {
        boolean z2 = true;
        C21100e.m49369v(1);
        C14894a.C14895a a = C14894a.m37560b(this.f52625a).mo45012a();
        a.mo45021c(z);
        a.mo45019a();
        if (this.f52626b < 0) {
            z2 = false;
        }
        if (z2) {
            AppsFlyerLibCore instance = AppsFlyerLibCore.getInstance();
            if (z) {
                instance.sharingFilter = new String[0];
            } else {
                instance.setSharingFilterForAllPartners();
            }
        } else {
            mo52991c(this.f52625a);
        }
    }

    /* renamed from: c */
    public final void mo52991c(Context context) {
        boolean z;
        boolean z2 = true;
        C21100e.m49369v(1);
        long j = this.f52626b;
        if (j >= -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j < 0) {
                z2 = false;
            }
            if (!z2) {
                if (C18860a.m45884a().f48021i) {
                    if (!C14894a.m37560b(f52624c.f52625a).mo45013c().contains(C14894a.f38078f.f43935a)) {
                        return;
                    }
                }
                AppsFlyerLib instance = AppsFlyerLib.getInstance();
                if (!C14894a.f38078f.mo19759a(C14894a.m37560b(this.f52625a).mo45013c()).booleanValue()) {
                    instance.setSharingFilterForAllPartners();
                }
                this.f52626b = SystemClock.elapsedRealtime();
                instance.start(context);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDeepLinking(com.appsflyer.deeplink.DeepLinkResult r19) {
        /*
            r18 = this;
            com.appsflyer.deeplink.DeepLinkResult$Status r0 = r19.getStatus()
            com.appsflyer.deeplink.DeepLinkResult$Status r1 = com.appsflyer.deeplink.DeepLinkResult.Status.FOUND
            if (r0 != r1) goto L_0x0012
            com.appsflyer.deeplink.DeepLink r0 = r19.getDeepLink()
            if (r0 != 0) goto L_0x000f
            goto L_0x0012
        L_0x000f:
            r4 = r19
            goto L_0x0031
        L_0x0012:
            de.f r0 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r2 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppsFlyer DeepLinkResult Error - result = "
            r3.append(r4)
            r4 = r19
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>((java.lang.String) r3)
            r0.mo49364c(r2)
        L_0x0031:
            com.moovit.MoovitApplication<?, ?, ?> r0 = com.moovit.MoovitApplication.f37317k
            java.lang.String r2 = "imi"
            if (r0 != 0) goto L_0x0039
            goto L_0x00c7
        L_0x0039:
            com.appsflyer.deeplink.DeepLinkResult$Status r5 = r19.getStatus()
            com.appsflyer.deeplink.DeepLinkResult$Status r6 = com.appsflyer.deeplink.DeepLinkResult.Status.ERROR
            if (r5 != r6) goto L_0x0046
            com.appsflyer.deeplink.DeepLinkResult$Error r6 = r19.getError()
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            com.appsflyer.deeplink.DeepLink r7 = r19.getDeepLink()
            if (r7 == 0) goto L_0x0052
            java.lang.String r8 = r7.getDeepLinkValue()
            goto L_0x0053
        L_0x0052:
            r8 = 0
        L_0x0053:
            if (r7 == 0) goto L_0x005a
            java.lang.String r9 = r7.getStringValue(r2)
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r12 = r18
            long r13 = r12.f52626b
            long r10 = r10 - r13
            if (r7 == 0) goto L_0x006b
            java.lang.Boolean r7 = r7.isDeferred()
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            tp.i r13 = r0.mo44558j()
            u2.a r13 = r13.f50173c
            com.moovit.analytics.AnalyticsFlowKey r14 = com.moovit.analytics.AnalyticsFlowKey.APPS_FLYER
            r15 = 1
            hq.b[] r3 = new p543hq.C17474b[r15]
            r16 = 0
            hq.b$a r15 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r4 = com.moovit.analytics.AnalyticsEventKey.DEEP_LINK_LOADED
            r15.<init>(r4)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.STATUS
            int[] r17 = p968zq.C20883a.f52623h
            int r5 = r5.ordinal()
            r5 = r17[r5]
            r12 = 1
            if (r5 == r12) goto L_0x009c
            r12 = 2
            if (r5 == r12) goto L_0x0099
            r12 = 3
            if (r5 == r12) goto L_0x0096
            java.lang.String r5 = "null"
            goto L_0x009e
        L_0x0096:
            java.lang.String r5 = "apps_flyer_status_error"
            goto L_0x009e
        L_0x0099:
            java.lang.String r5 = "apps_flyer_status_not_found"
            goto L_0x009e
        L_0x009c:
            java.lang.String r5 = "apps_flyer_status_found"
        L_0x009e:
            r15.mo49939g(r4, r5)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.REASON
            r15.mo49944l(r4, r6)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.URI
            r15.mo49945m(r4, r8)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.METRO_ID
            r15.mo49939g(r4, r9)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.TIME
            r15.mo49936d(r4, r10)
            com.moovit.analytics.AnalyticsAttributeKey r4 = com.moovit.analytics.AnalyticsAttributeKey.IS_DEFERRED
            r15.mo49944l(r4, r7)
            hq.b r4 = r15.mo49933a()
            r3[r16] = r4
            r13.getClass()
            r4 = 1
            p269u2.C6677a.m15759j(r0, r14, r4, r3)
        L_0x00c7:
            com.appsflyer.deeplink.DeepLinkResult$Status r0 = r19.getStatus()
            if (r0 == r1) goto L_0x00ce
            return
        L_0x00ce:
            com.appsflyer.deeplink.DeepLink r1 = r19.getDeepLink()
            if (r1 != 0) goto L_0x00d5
            return
        L_0x00d5:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = r1.isDeferred()
            boolean r3 = r0.equals(r3)
            java.lang.String r4 = r1.getDeepLinkValue()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00ea
            goto L_0x0113
        L_0x00ea:
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00ef }
            goto L_0x0114
        L_0x00ef:
            r0 = move-exception
            r5 = r0
            de.f r0 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Deep Link: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r0.mo49363b(r4)
            com.moovit.commons.utils.ApplicationBugException r4 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r6 = "AppsFlyer unable tp parse deep link Uri"
            r4.<init>(r6, r5)
            r0.mo49364c(r4)
        L_0x0113:
            r0 = 0
        L_0x0114:
            if (r0 == 0) goto L_0x0131
            c10.d r4 = c10.C13743d.f33820d
            c10.a r5 = new c10.a
            java.lang.String r6 = "deep_link_sub1"
            java.lang.String r1 = r1.getStringValue(r6)
            java.util.Map r1 = java.util.Collections.singletonMap(r2, r1)
            r5.<init>(r3, r0, r1)
            java.util.concurrent.atomic.AtomicReference<c10.a> r0 = r4.f33822b
            r0.set(r5)
            android.os.ConditionVariable r0 = r4.f33821a
            r0.open()
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p968zq.C20885c.onDeepLinking(com.appsflyer.deeplink.DeepLinkResult):void");
    }
}
