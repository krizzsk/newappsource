package com.fyber.inneractive.sdk.flow;

import android.os.Looper;
import android.text.TextUtils;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.bidder.adm.C2578a;
import com.fyber.inneractive.sdk.bidder.adm.C2583e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C2765e;
import com.fyber.inneractive.sdk.metrics.C2830c;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.m */
public class C2780m implements C2786p, C2795v {

    /* renamed from: a */
    public final String f9609a;

    /* renamed from: b */
    public InneractiveAdSpot.RequestListener f9610b;

    /* renamed from: c */
    public InneractiveAdRequest f9611c;

    /* renamed from: d */
    public C2765e.C2767b f9612d;

    /* renamed from: e */
    public C2776j f9613e;

    /* renamed from: f */
    public C2806x f9614f;

    /* renamed from: g */
    public Set<C2806x> f9615g;

    /* renamed from: h */
    public C2764d f9616h;

    /* renamed from: i */
    public C2783c f9617i;

    /* renamed from: j */
    public boolean f9618j = true;

    /* renamed from: k */
    public boolean f9619k = false;

    /* renamed from: l */
    public C2768f f9620l;

    /* renamed from: com.fyber.inneractive.sdk.flow.m$a */
    public class C2781a implements C2583e.C2584a {

        /* renamed from: a */
        public final /* synthetic */ C2583e f9621a;

        /* renamed from: b */
        public final /* synthetic */ String f9622b;

        public C2781a(C2583e eVar, String str) {
            this.f9621a = eVar;
            this.f9622b = str;
        }

        /* renamed from: a */
        public void mo13565a(Exception exc, InneractiveErrorCode inneractiveErrorCode, C3648e... eVarArr) {
            C3648e eVar;
            C2922o oVar;
            if (eVarArr.length > 0) {
                eVar = eVarArr[0];
            } else {
                eVar = null;
            }
            C2765e.C2767b bVar = C2780m.this.f9612d;
            if (bVar != null) {
                ((C2784n) bVar).mo13567a((InneractiveAdRequest) null, eVar, new InneractiveInfrastructureError(inneractiveErrorCode));
            }
            C2780m mVar = C2780m.this;
            String str = this.f9622b;
            mVar.getClass();
            if (inneractiveErrorCode.equals(InneractiveErrorCode.CONNECTION_ERROR)) {
                oVar = C2922o.FATAL_ADM_MARKUP_FETCHING_ERROR;
            } else {
                oVar = C2922o.FATAL_ADM_PARSING_ERROR;
            }
            if (eVar != null) {
                eVar.f12742A = false;
            }
            C2926q.C2927a aVar = new C2926q.C2927a(eVar);
            aVar.f10041b = oVar;
            aVar.f10040a = null;
            aVar.f10043d = null;
            JSONObject jSONObject = new JSONObject();
            String name = exc.getClass().getName();
            try {
                jSONObject.put("exception", name);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "exception", name);
            }
            String localizedMessage = exc.getLocalizedMessage();
            try {
                jSONObject.put(InAppMessageBase.MESSAGE, localizedMessage);
            } catch (Exception unused2) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", InAppMessageBase.MESSAGE, localizedMessage);
            }
            try {
                jSONObject.put("admPayload", str);
            } catch (Exception unused3) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "admPayload", str);
            }
            aVar.f10045f.put(jSONObject);
            aVar.mo13717a((String) null);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$b */
    public class C2782b implements Runnable {
        public C2782b() {
        }

        public void run() {
            C2780m.this.mo13562b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.m$c */
    public interface C2783c {
        void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode);

        void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot);
    }

    public C2780m() {
        String uuid = UUID.randomUUID().toString();
        this.f9609a = uuid;
        this.f9615g = new HashSet();
        IAlog.m9902a("%sInneractiveAdSpotImpl created with UID: %s", mo13563c(), uuid);
    }

    public void addUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C2806x xVar = (C2806x) inneractiveUnitController;
            xVar.setAdSpot(this);
            if (this.f9615g.size() > 0) {
                Iterator it = new HashSet(this.f9615g).iterator();
                while (it.hasNext()) {
                    InneractiveUnitController inneractiveUnitController2 = (InneractiveUnitController) it.next();
                    if (inneractiveUnitController2.getClass().equals(inneractiveUnitController.getClass())) {
                        C2806x xVar2 = this.f9614f;
                        if (xVar2 != null && xVar2.equals(inneractiveUnitController2)) {
                            this.f9614f.destroy();
                            this.f9614f = null;
                        }
                        this.f9615g.remove(inneractiveUnitController2);
                    }
                }
            }
            this.f9615g.add(xVar);
            if (this.f9613e != null) {
                mo13564d();
            }
        }
    }

    /* renamed from: b */
    public final void mo13562b() {
        for (C2806x destroy : this.f9615g) {
            destroy.destroy();
        }
        this.f9615g.clear();
        C2764d dVar = this.f9616h;
        if (dVar != null) {
            dVar.mo13521a(true);
            this.f9616h = null;
        }
        this.f9610b = null;
        mo13559a();
        InneractiveAdSpotManager.get().removeSpot(this);
    }

    /* renamed from: c */
    public final String mo13563c() {
        return IAlog.m9899a((Object) this);
    }

    /* renamed from: d */
    public final boolean mo13564d() {
        for (C2806x next : this.f9615g) {
            if (next.supports(this)) {
                this.f9614f = next;
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            C3714n.f12902b.post(new C2782b());
        } else {
            mo13562b();
        }
    }

    public C2776j getAdContent() {
        return this.f9613e;
    }

    public InneractiveAdRequest getCurrentProcessedRequest() {
        return this.f9611c;
    }

    public String getLocalUniqueId() {
        return this.f9609a;
    }

    public InneractiveMediationName getMediationName() {
        return IAConfigManager.f9202J.f9226n;
    }

    public String getMediationNameString() {
        return IAConfigManager.f9202J.f9225m;
    }

    public String getMediationVersion() {
        return IAConfigManager.f9202J.f9227o;
    }

    public String getRequestedSpotId() {
        InneractiveAdRequest inneractiveAdRequest = this.f9611c;
        return inneractiveAdRequest != null ? inneractiveAdRequest.getSpotId() : "";
    }

    public InneractiveUnitController getSelectedUnitController() {
        return this.f9614f;
    }

    public boolean isReady() {
        boolean z;
        C2776j jVar;
        C2776j jVar2 = this.f9613e;
        if (jVar2 == null) {
            return false;
        }
        if (jVar2.mo13293c() == null || !this.f9613e.mo13293c().mo15296d()) {
            z = false;
        } else {
            z = true;
        }
        if (z && (jVar = this.f9613e) != null) {
            C3648e c = jVar.mo13293c();
            if (!this.f9619k && c != null) {
                long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - c.f12745c);
                long j = c.f12744b;
                long j2 = minutes - j;
                IAlog.m9902a(String.format("Firing Event 802 - AdExpired - time passed- %s, sessionTimeOut - %s", new Object[]{Long.valueOf(j2), Long.valueOf(j)}), new Object[0]);
                C2922o oVar = C2922o.IA_AD_EXPIRED;
                InneractiveAdRequest inneractiveAdRequest = jVar.f9590a;
                JSONArray c2 = jVar.f9592c.mo13268c();
                C2926q.C2927a aVar = new C2926q.C2927a(c);
                aVar.f10041b = oVar;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = c2;
                JSONObject jSONObject = new JSONObject();
                Long valueOf = Long.valueOf(j2);
                try {
                    jSONObject.put("time_passed", valueOf);
                } catch (Exception unused) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                }
                Long valueOf2 = Long.valueOf(j);
                try {
                    jSONObject.put("timeout", valueOf2);
                } catch (Exception unused2) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                }
                aVar.f10045f.put(jSONObject);
                aVar.mo13717a((String) null);
                this.f9619k = true;
            }
        }
        if (z || !this.f9613e.mo13294e()) {
            return false;
        }
        return true;
    }

    public void loadAd(String str) {
        if (TextUtils.isEmpty(str)) {
            InneractiveAdSpot.RequestListener requestListener = this.f9610b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f9610b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            C2830c.f9722c.mo13620a(this.f9609a).mo13623c();
            C2768f fVar = new C2768f(this.f9610b, this);
            this.f9620l = fVar;
            if (this.f9612d == null) {
                this.f9612d = new C2784n(this);
            }
            C2583e eVar = new C2583e(str);
            C2781a aVar = new C2781a(eVar, str);
            fVar.mo13532f();
            eVar.f9113d = this.f9609a;
            C3714n.m9976a(new C2578a(eVar, aVar));
        }
    }

    public void removeUnitController(InneractiveUnitController inneractiveUnitController) {
        if (inneractiveUnitController != null) {
            C2806x xVar = this.f9614f;
            if (xVar != null && xVar.equals(inneractiveUnitController)) {
                this.f9614f.destroy();
                this.f9614f = null;
            }
            this.f9615g.remove(inneractiveUnitController);
        }
    }

    public void requestAd(InneractiveAdRequest inneractiveAdRequest) {
        InneractiveAdRequest inneractiveAdRequest2;
        boolean z;
        boolean z2;
        IAlog.m9902a("%srequestAd called with request: %s", IAlog.m9899a((Object) this), inneractiveAdRequest);
        if (inneractiveAdRequest == null && this.f9611c == null) {
            IAlog.m9903b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m9899a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f9610b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f9610b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest2 = inneractiveAdRequest;
            } else {
                inneractiveAdRequest2 = this.f9611c;
            }
            String str = this.f9609a;
            inneractiveAdRequest2.f9541b = str;
            C2830c.f9722c.mo13620a(str).mo13623c();
            if (this.f9615g.isEmpty()) {
                IAlog.m9903b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m9899a((Object) this));
                if (this.f9610b != null) {
                    if (inneractiveAdRequest == null) {
                        inneractiveAdRequest = this.f9611c;
                    }
                    mo13560a(inneractiveAdRequest, (C3648e) null);
                    this.f9610b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C2764d dVar = this.f9616h;
            if (dVar != null) {
                if (inneractiveAdRequest != null || this.f9611c == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.mo13521a(z2);
            }
            if (inneractiveAdRequest != null) {
                InneractiveAdRequest inneractiveAdRequest3 = this.f9611c;
                if (inneractiveAdRequest3 != null) {
                    inneractiveAdRequest.setSelectedUnitConfig(inneractiveAdRequest3.getSelectedUnitConfig());
                }
                this.f9611c = inneractiveAdRequest;
                C2776j jVar = this.f9613e;
                if (jVar != null) {
                    jVar.mo13291a();
                    this.f9618j = true;
                }
                Iterator<C2806x> it = this.f9615g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next() instanceof InneractiveFullscreenUnitController) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    this.f9611c.f9540a = false;
                }
            }
            this.f9616h = new C2764d();
            if (this.f9612d == null) {
                this.f9612d = new C2784n(this);
            }
            IAlog.m9902a("%sFound ad source for request! %s", IAlog.m9899a((Object) this), this.f9616h);
            C2764d dVar2 = this.f9616h;
            InneractiveAdRequest inneractiveAdRequest4 = this.f9611c;
            C2765e.C2767b bVar = this.f9612d;
            dVar2.f9558e = inneractiveAdRequest4;
            dVar2.f9557d = bVar;
            if (IAConfigManager.m6637g()) {
                dVar2.mo13526h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m6631a();
        }
    }

    public void setMediationName(InneractiveMediationName inneractiveMediationName) {
        InneractiveAdManager.setMediationName(inneractiveMediationName);
    }

    public void setMediationVersion(String str) {
        InneractiveAdManager.setMediationVersion(str);
    }

    public void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
        IAlog.m9902a("%ssetRequestListener called with: %s", IAlog.m9899a((Object) this), requestListener);
        this.f9610b = requestListener;
    }

    /* renamed from: a */
    public void mo13561a(C2783c cVar) {
        this.f9617i = cVar;
        IAlog.m9902a("%srequestAd called with request: %s", IAlog.m9899a((Object) this), null);
        if (this.f9611c == null) {
            IAlog.m9903b("%srequestAd called with a null request, but no previous request is available! Cannot continue", IAlog.m9899a((Object) this));
            InneractiveAdSpot.RequestListener requestListener = this.f9610b;
            if (requestListener != null) {
                requestListener.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
            }
        } else if (!InneractiveAdManager.wasInitialized()) {
            InneractiveAdSpot.RequestListener requestListener2 = this.f9610b;
            if (requestListener2 != null) {
                requestListener2.onInneractiveFailedAdRequest(this, InneractiveErrorCode.SDK_NOT_INITIALIZED);
            }
        } else {
            InneractiveAdRequest inneractiveAdRequest = this.f9611c;
            String str = this.f9609a;
            inneractiveAdRequest.f9541b = str;
            C2830c.f9722c.mo13620a(str).mo13623c();
            if (this.f9615g.isEmpty()) {
                IAlog.m9903b("%srequestAd called but no AdUnitControllers exist! Cannot continue", IAlog.m9899a((Object) this));
                if (this.f9610b != null) {
                    mo13560a(this.f9611c, (C3648e) null);
                    this.f9610b.onInneractiveFailedAdRequest(this, InneractiveErrorCode.INVALID_INPUT);
                    return;
                }
                return;
            }
            C2764d dVar = this.f9616h;
            if (dVar != null) {
                dVar.mo13521a(this.f9611c == null);
            }
            this.f9616h = new C2764d();
            if (this.f9612d == null) {
                this.f9612d = new C2784n(this);
            }
            IAlog.m9902a("%sFound ad source for request! %s", IAlog.m9899a((Object) this), this.f9616h);
            C2764d dVar2 = this.f9616h;
            InneractiveAdRequest inneractiveAdRequest2 = this.f9611c;
            C2765e.C2767b bVar = this.f9612d;
            dVar2.f9558e = inneractiveAdRequest2;
            dVar2.f9557d = bVar;
            if (IAConfigManager.m6637g()) {
                dVar2.mo13526h();
                return;
            }
            IAConfigManager.addListener(dVar2);
            IAConfigManager.m6631a();
        }
    }

    public void setMediationName(String str) {
        InneractiveAdManager.setMediationName(str);
    }

    /* renamed from: a */
    public void mo13559a() {
        C2776j jVar;
        C2776j jVar2 = this.f9613e;
        if (jVar2 != null) {
            if (jVar2.mo13299d() && (jVar = this.f9613e) != null && !jVar.f9594e) {
                C3648e c = jVar.mo13293c();
                InneractiveAdRequest inneractiveAdRequest = this.f9613e.f9590a;
                C3714n.f12902b.post(new C2785o(this, Arrays.toString(Thread.currentThread().getStackTrace()), inneractiveAdRequest, c));
            }
            this.f9613e.mo13291a();
            this.f9613e = null;
        }
        this.f9614f = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r2 = r2.f9591b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13560a(com.fyber.inneractive.sdk.external.InneractiveAdRequest r10, com.fyber.inneractive.sdk.response.C3648e r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f9424c
            if (r1 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.r r1 = r1.f9424c
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f9368b
            goto L_0x0034
        L_0x001e:
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f9427f
            if (r1 == 0) goto L_0x0033
            com.fyber.inneractive.sdk.config.z r1 = r10.getSelectedUnitConfig()
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.a0 r1 = r1.f9427f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r1.f9256j
            goto L_0x0034
        L_0x0033:
            r1 = r0
        L_0x0034:
            com.fyber.inneractive.sdk.flow.j r2 = r9.f9613e
            if (r2 == 0) goto L_0x003e
            T r2 = r2.f9591b
            if (r2 == 0) goto L_0x003e
            r4 = r2
            goto L_0x003f
        L_0x003e:
            r4 = r11
        L_0x003f:
            java.lang.String r6 = r9.f9609a
            if (r1 != 0) goto L_0x0047
            if (r4 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r4.f12756n
        L_0x0047:
            r7 = r1
            com.fyber.inneractive.sdk.metrics.b r11 = new com.fyber.inneractive.sdk.metrics.b
            com.fyber.inneractive.sdk.flow.j r1 = r9.f9613e
            if (r1 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            com.fyber.inneractive.sdk.config.global.s r0 = r1.f9592c
            org.json.JSONArray r0 = r0.mo13268c()
        L_0x0055:
            r8 = r0
            r3 = r11
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r11.mo13618a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C2780m.mo13560a(com.fyber.inneractive.sdk.external.InneractiveAdRequest, com.fyber.inneractive.sdk.response.e):void");
    }
}
