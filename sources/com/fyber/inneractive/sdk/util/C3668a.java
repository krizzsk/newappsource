package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.util.a */
public class C3668a {

    /* renamed from: a */
    public InneractiveAdSpot f12817a;

    /* renamed from: b */
    public boolean f12818b = false;

    /* renamed from: c */
    public boolean f12819c;

    /* renamed from: d */
    public long f12820d = 0;

    /* renamed from: e */
    public long f12821e = 0;

    /* renamed from: f */
    public long f12822f = 0;

    /* renamed from: a */
    public void mo15342a(boolean z) {
        String str = "skip";
        if (!this.f12818b) {
            Object[] objArr = new Object[2];
            objArr[0] = "AdExperienceLatency: ";
            if (!z) {
                str = "close";
            }
            objArr[1] = str;
            IAlog.m9902a("%s%s timer started", objArr);
            this.f12820d = System.currentTimeMillis();
            this.f12818b = true;
            this.f12819c = z;
            return;
        }
        Object[] objArr2 = new Object[2];
        objArr2[0] = "AdExperienceLatency: ";
        if (!z) {
            str = "close";
        }
        objArr2[1] = str;
        IAlog.m9902a("%s%s timer could not start. Timer is in action!", objArr2);
    }

    /* renamed from: b */
    public void mo15343b() {
        if (this.f12818b && this.f12821e > 0) {
            this.f12822f += System.currentTimeMillis() - this.f12821e;
            this.f12821e = 0;
        }
    }

    /* renamed from: c */
    public void mo15344c() {
        C2776j jVar;
        C2924p pVar;
        InneractiveAdRequest inneractiveAdRequest;
        C3648e eVar;
        JSONArray jSONArray;
        String str;
        C2666s sVar;
        if (this.f12818b) {
            String a = C3675c0.m9915a(this.f12820d, this.f12822f);
            InneractiveAdSpot inneractiveAdSpot = this.f12817a;
            if (inneractiveAdSpot != null) {
                jVar = inneractiveAdSpot.getAdContent();
            } else {
                jVar = null;
            }
            if (this.f12819c) {
                pVar = C2924p.USER_SKIP_ACTION_LATENCY;
            } else {
                pVar = C2924p.USER_CLOSE_ACTION_LATENCY;
            }
            if (jVar != null) {
                inneractiveAdRequest = jVar.f9590a;
            } else {
                inneractiveAdRequest = null;
            }
            if (jVar != null) {
                eVar = jVar.mo13293c();
            } else {
                eVar = null;
            }
            if (jVar == null || (sVar = jVar.f9592c) == null) {
                jSONArray = null;
            } else {
                jSONArray = sVar.mo13268c();
            }
            C2926q.C2927a aVar = new C2926q.C2927a(eVar);
            aVar.f10042c = pVar;
            aVar.f10040a = inneractiveAdRequest;
            aVar.f10043d = jSONArray;
            Object[] objArr = new Object[2];
            if (this.f12819c) {
                str = "skip_action_latency";
            } else {
                str = "close_action_latency";
            }
            objArr[0] = str;
            objArr[1] = a;
            aVar.mo13716a(objArr);
            aVar.mo13717a((String) null);
            mo15341a();
        }
    }

    /* renamed from: a */
    public void mo15341a() {
        this.f12820d = 0;
        this.f12821e = 0;
        this.f12822f = 0;
        this.f12818b = false;
    }
}
