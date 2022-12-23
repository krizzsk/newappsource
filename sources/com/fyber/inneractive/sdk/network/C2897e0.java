package com.fyber.inneractive.sdk.network;

import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.network.C2889b0;
import com.fyber.inneractive.sdk.p048dv.C2721g;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.response.C3653j;
import com.fyber.inneractive.sdk.response.C3654k;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.e0 */
public abstract class C2897e0<T> implements C2889b0<T> {

    /* renamed from: a */
    public volatile boolean f9900a = false;

    /* renamed from: b */
    public final C2936u<T> f9901b;

    /* renamed from: c */
    public C2901g f9902c;

    /* renamed from: d */
    public C2889b0.C2890a f9903d;

    /* renamed from: e */
    public C2908j f9904e;

    /* renamed from: f */
    public volatile C2916m0 f9905f = C2916m0.INITIAL;

    /* renamed from: com.fyber.inneractive.sdk.network.e0$a */
    public class C2898a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f9906a;

        /* renamed from: b */
        public final /* synthetic */ Exception f9907b;

        /* renamed from: c */
        public final /* synthetic */ boolean f9908c;

        public C2898a(Object obj, Exception exc, boolean z) {
            this.f9906a = obj;
            this.f9907b = exc;
            this.f9908c = z;
        }

        public void run() {
            C2897e0.this.f9901b.mo13154a(this.f9906a, this.f9907b, this.f9908c);
        }
    }

    public C2897e0(C2936u<T> uVar, C2901g gVar) {
        this.f9901b = uVar;
        this.f9902c = gVar;
    }

    /* renamed from: a */
    public void mo13665a(C2887a0 a0Var, String str, String str2) {
    }

    /* renamed from: a */
    public void mo13667a(T t, Exception exc, boolean z) {
        C3714n.f12902b.post(new C2898a(t, exc, z));
    }

    /* renamed from: b */
    public void mo13668b() {
        try {
            C2908j jVar = this.f9904e;
            if (jVar != null) {
                jVar.mo13704a();
            }
            this.f9902c.mo13698b();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public String mo13669c() {
        return null;
    }

    /* renamed from: e */
    public boolean mo13670e() {
        return this.f9900a;
    }

    /* renamed from: g */
    public C2886a<T> mo13672g() {
        return null;
    }

    /* renamed from: h */
    public C2666s mo13673h() {
        return null;
    }

    /* renamed from: i */
    public C2923o0 mo13674i() {
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        return new C2923o0(iAConfigManager.f9234v.f9337b.mo13271a("connect_timeout", InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 1), iAConfigManager.f9234v.f9337b.mo13271a("read_timeout", InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 1));
    }

    /* renamed from: k */
    public byte[] mo13676k() {
        return null;
    }

    /* renamed from: l */
    public C2916m0 mo13677l() {
        return this.f9905f;
    }

    /* renamed from: m */
    public String mo13678m() {
        return "application/json; charset=utf-8";
    }

    /* renamed from: q */
    public Map<String, String> mo13681q() {
        return null;
    }

    /* renamed from: a */
    public C2908j mo13663a(String str) throws Exception {
        try {
            C2889b0.C2890a aVar = this.f9903d;
            if (aVar != null) {
                aVar.mo13155a("sdkInitNetworkRequest");
            }
            this.f9904e = this.f9902c.mo13697a(this, C3707l.m9973f(), str);
            C2889b0.C2890a aVar2 = this.f9903d;
            if (aVar2 != null) {
                aVar2.mo13155a("sdkGotServerResponse");
            }
            return this.f9904e;
        } catch (C2888b e) {
            IAlog.m9901a("failed start network request", e, new Object[0]);
            throw e;
        } catch (C2930q0 e2) {
            IAlog.m9901a("failed read network response", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m9901a("failed start network request", e3, new Object[0]);
            throw e3;
        }
    }

    /* renamed from: a */
    public void mo13666a(C2916m0 m0Var) {
        this.f9905f = m0Var;
    }

    /* renamed from: a */
    public C3648e mo13695a(int i, C2915m mVar, C3653j jVar, C2721g gVar) throws Exception {
        try {
            C3644a a = C3644a.m9818a(i);
            if (a == null) {
                a = C3644a.RETURNED_ADTYPE_MRAID;
            }
            C3645b a2 = C2754b.C2755a.f9535a.mo13508a(a);
            if (a2 == null) {
                IAlog.m9906e("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i));
                int size = C2754b.C2755a.f9535a.f9534a.size();
                throw new C2944z("Could not find parser for ad type " + i);
            }
            IAlog.m9902a("Received ad type %s - Got parser! %s", Integer.valueOf(i), a2);
            if (jVar != null) {
                a2.f12734c = jVar;
            }
            a2.f12732a = a2.mo13323a();
            if (mVar != null) {
                a2.f12734c = new C3654k(mVar);
            }
            C3648e a3 = a2.mo15289a((String) null);
            if (gVar != null) {
                a3.f12761s = gVar;
            }
            C2889b0.C2890a aVar = this.f9903d;
            if (aVar != null) {
                aVar.mo13155a("sdkParsedResponse");
            }
            return a3;
        } catch (Exception e) {
            IAlog.m9901a("failed parse ad network request", e, new Object[0]);
            throw new C2944z(e);
        }
    }
}
