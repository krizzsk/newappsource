package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.model.vast.c */
public class C2836c implements C3652i {

    /* renamed from: a */
    public C2840g f9746a;

    /* renamed from: b */
    public C2841h f9747b;

    /* renamed from: c */
    public int f9748c;

    /* renamed from: d */
    public int f9749d;

    /* renamed from: e */
    public String f9750e;

    /* renamed from: f */
    public String f9751f;

    /* renamed from: g */
    public String f9752g;

    /* renamed from: h */
    public Map<C2850q, List<String>> f9753h = new HashMap();

    public C2836c(C2840g gVar, int i, int i2, String str) {
        this.f9746a = gVar;
        this.f9748c = i;
        this.f9749d = i2;
        this.f9750e = str;
    }

    /* renamed from: a */
    public void mo13637a(C2850q qVar, String str) {
        List list = this.f9753h.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f9753h.put(qVar, list);
        }
        list.add(str);
    }

    public String toString() {
        String str;
        StringBuilder n = C13437d.m33708n("Companion: ", " w:");
        n.append(this.f9748c);
        n.append(" h:");
        n.append(this.f9749d);
        n.append(" type:");
        n.append(this.f9746a.toString());
        n.append(" creativeType: ");
        C2841h hVar = this.f9747b;
        if (hVar != null) {
            str = hVar.f9778a;
        } else {
            str = "none";
        }
        n.append(str);
        n.append(" ctr:");
        n.append(this.f9752g);
        n.append(" events:");
        n.append(this.f9753h);
        return n.toString();
    }

    /* renamed from: a */
    public List<String> mo13613a(C2850q qVar) {
        Map<C2850q, List<String>> map = this.f9753h;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public JSONObject mo13636a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f9748c);
            jSONObject.put("h", this.f9749d);
            jSONObject.put("type", this.f9746a.toString());
            C2841h hVar = this.f9747b;
            jSONObject.put("creativeType", hVar != null ? hVar.f9778a : "none");
            jSONObject.put("content", this.f9751f);
        } catch (JSONException e) {
            IAlog.m9902a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
