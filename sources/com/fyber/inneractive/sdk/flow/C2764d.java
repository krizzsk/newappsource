package com.fyber.inneractive.sdk.flow;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.network.C2888b;
import com.fyber.inneractive.sdk.network.C2917n;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.d */
public class C2764d extends C2765e implements IAConfigManager.OnConfigurationReadyAndValidListener {
    /* renamed from: a */
    public void mo13521a(boolean z) {
        mo13525g();
        C2809a aVar = this.f9556c;
        if (aVar != null && z) {
            aVar.mo13515a();
            this.f9556c = null;
        }
        mo13530b();
        this.f9557d = null;
    }

    /* renamed from: d */
    public String mo13523d() {
        return IAlog.m9899a((Object) this);
    }

    /* renamed from: e */
    public void mo13524e() {
        super.mo13524e();
        mo13528a(this.f9558e, mo13531c(), InneractiveErrorCode.IN_FLIGHT_TIMEOUT);
        mo13525g();
    }

    /* renamed from: g */
    public void mo13525g() {
        IAConfigManager.removeListener(this);
        C2917n nVar = this.f9560g;
        if (nVar != null) {
            nVar.f9973e = true;
            nVar.f9971c = null;
            nVar.f9974f.f9900a = true;
            this.f9560g = null;
        }
        this.f9558e = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13526h() {
        /*
            r6 = this;
            boolean r0 = com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized()
            if (r0 != 0) goto L_0x001c
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f9557d
            if (r0 == 0) goto L_0x001c
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f9558e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo13531c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C2784n) r0
            r0.mo13567a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r0 = r6.f9558e
            java.lang.String r0 = r0.getSpotId()
            com.fyber.inneractive.sdk.config.x r0 = com.fyber.inneractive.sdk.config.C2618a.m6639a(r0)
            com.fyber.inneractive.sdk.response.e r1 = r6.mo13531c()
            r2 = 0
            if (r0 == 0) goto L_0x004a
            boolean r3 = r0.f9421b
            if (r3 != 0) goto L_0x004a
            r6.mo13522a(r2, r1)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f9557d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f9558e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo13531c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C2784n) r0
            r0.mo13567a(r1, r2, r3)
            goto L_0x0155
        L_0x004a:
            r3 = 1
            if (r0 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r4 = r0.f9420a
            java.util.Iterator r4 = r4.iterator()
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L_0x0114
            java.util.List<com.fyber.inneractive.sdk.config.y> r0 = r0.f9420a
            java.lang.Object r0 = r0.get(r2)
            com.fyber.inneractive.sdk.config.y r0 = (com.fyber.inneractive.sdk.config.C2702y) r0
            com.fyber.inneractive.sdk.config.r r1 = r0.f9424c
            if (r1 == 0) goto L_0x0066
            goto L_0x0074
        L_0x0066:
            com.fyber.inneractive.sdk.config.a0 r0 = r0.f9427f
            if (r0 == 0) goto L_0x0076
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f9256j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            if (r0 == r1) goto L_0x0074
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r0 != r1) goto L_0x0076
        L_0x0074:
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 != 0) goto L_0x008f
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f9557d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f9558e
            com.fyber.inneractive.sdk.response.e r2 = r6.mo13531c()
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C2784n) r0
            r0.mo13567a(r1, r2, r3)
            goto L_0x0155
        L_0x008f:
            com.fyber.inneractive.sdk.config.global.s r0 = new com.fyber.inneractive.sdk.config.global.s
            r0.<init>()
            r6.f9559f = r0
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f9558e
            java.lang.String r1 = r1.getSpotId()
            r0.mo13267a((java.lang.String) r1)
            com.fyber.inneractive.sdk.network.n r0 = new com.fyber.inneractive.sdk.network.n
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r6.f9558e
            java.lang.String r4 = r1.f9541b
            com.fyber.inneractive.sdk.config.global.s r5 = r6.f9559f
            r0.<init>(r1, r4, r5, r6)
            r6.f9560g = r0
            r0.f9973e = r2
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "IARemoteAdFetcher: requestAd called"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r4, r1)
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r1 = r0.f9969a
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r1.getSpotId()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00cb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "appID is null or empty. Please provide a valid appID and re-try."
            com.fyber.inneractive.sdk.util.IAlog.m9903b(r4, r1)
            goto L_0x00da
        L_0x00cb:
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00dc
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! "
            com.fyber.inneractive.sdk.util.IAlog.m9903b(r4, r1)
        L_0x00da:
            r1 = 0
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00eb
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m9903b(r4, r1)
        L_0x00eb:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r1 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r1)
            if (r1 != 0) goto L_0x00fa
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r4 = "It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r1)
        L_0x00fa:
            r1 = 1
        L_0x00fb:
            if (r1 != 0) goto L_0x0104
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r1 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT
            r3 = 0
            r0.mo13712a(r1, r3)
            goto L_0x010e
        L_0x0104:
            com.fyber.inneractive.sdk.config.IAConfigManager r1 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.network.w r1 = r1.f9232t
            com.fyber.inneractive.sdk.network.c0 r0 = r0.f9974f
            r1.mo13730c(r0)
            r2 = 1
        L_0x010e:
            if (r2 == 0) goto L_0x0155
            r6.mo13532f()
            goto L_0x0155
        L_0x0114:
            if (r0 != 0) goto L_0x011c
            r6.mo13522a(r3, r1)
            com.fyber.inneractive.sdk.config.IAConfigManager.m6631a()
        L_0x011c:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = "************************************************************************************************************************"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r5 = r6.f9558e
            java.lang.String r5 = r5.getSpotId()
            r0[r2] = r5
            com.fyber.inneractive.sdk.config.IAConfigManager r5 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            java.lang.String r5 = r5.f9215c
            r0[r3] = r5
            java.lang.String r3 = "*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?"
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r0)
            com.fyber.inneractive.sdk.flow.e$b r0 = r6.f9557d
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r2 = r6.f9558e
            com.fyber.inneractive.sdk.external.InneractiveInfrastructureError r3 = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r4 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT
            r3.<init>(r4)
            com.fyber.inneractive.sdk.flow.n r0 = (com.fyber.inneractive.sdk.flow.C2784n) r0
            r0.mo13567a(r2, r1, r3)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2764d.mo13526h():void");
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        InneractiveErrorCode inneractiveErrorCode;
        IAConfigManager.removeListener(this);
        if (z) {
            mo13526h();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f9558e;
        C3648e c = mo13531c();
        if (exc instanceof C2888b) {
            inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
        } else {
            inneractiveErrorCode = InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR;
        }
        mo13528a(inneractiveAdRequest, c, inneractiveErrorCode);
    }

    /* renamed from: a */
    public final void mo13522a(boolean z, C3648e eVar) {
        String str;
        String spotId = this.f9558e.getSpotId();
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        String str2 = iAConfigManager.f9236x.f9280c.get("KEY_MISSMATCH_STATS_SPOTS");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (!str2.contains(String.format("-%s-", new Object[]{spotId}))) {
            C2926q.C2927a aVar = new C2926q.C2927a(C2922o.MISSMATCH_SPOTID, this.f9558e, eVar, (JSONArray) null);
            if (z) {
                str = String.format("There is no %s spot ID in current app config", new Object[]{spotId});
            } else {
                str = String.format("spot ID %s is not active in current app config", new Object[]{spotId});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("reason", str);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "reason", str);
            }
            aVar.f10045f.put(jSONObject);
            aVar.mo13717a((String) null);
            C2628d0 d0Var = iAConfigManager.f9236x;
            d0Var.f9280c.put("KEY_MISSMATCH_STATS_SPOTS", String.format("%s -%s-", new Object[]{str2, spotId}));
        }
    }
}
