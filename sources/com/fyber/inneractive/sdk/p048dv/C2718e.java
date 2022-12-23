package com.fyber.inneractive.sdk.p048dv;

import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p048dv.enums.C2719a;
import com.fyber.inneractive.sdk.p048dv.handler.C2725c;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3648e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.e */
public class C2718e extends C3645b {
    /* renamed from: a */
    public void mo13324a(String str, C2702y yVar) {
        try {
            ((C2720f) this.f12732a).f9445B = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            C2725c.m6814a(yVar != null ? yVar.f9423b : null, C2719a.Parse, (InneractiveAdRequest) null, (C3648e) null, e.getLocalizedMessage());
        }
    }

    /* renamed from: b */
    public boolean mo13325b() {
        return true;
    }

    /* renamed from: a */
    public C3648e mo13323a() {
        return new C2720f();
    }
}
