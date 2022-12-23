package p387bj;

import com.appsflyer.ServerParameters;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p702ok.C18777c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: bj.b */
public final class C13632b extends C20528a<C18777c> {
    public C13632b(C20531d dVar) {
        super(dVar, C18777c.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        Map map;
        String str;
        String str2;
        String str3;
        JSONObject jSONObject2 = jSONObject;
        Integer k = C20528a.m48232k("id", jSONObject2);
        String o = C20528a.m48234o("name", jSONObject2);
        String o2 = C20528a.m48234o("shortName", jSONObject2);
        String o3 = C20528a.m48234o("longName", jSONObject2);
        String o4 = C20528a.m48234o(UnityMediationAdapter.KEY_PLACEMENT_ID, jSONObject2);
        String o5 = C20528a.m48234o("subBrand", jSONObject2);
        BigDecimal g = C20528a.m48228g(ServerParameters.LAT_KEY, jSONObject2);
        BigDecimal g2 = C20528a.m48228g(ServerParameters.LON_KEY, jSONObject2);
        Boolean h = C20528a.m48229h("hidden", jSONObject2);
        Boolean h2 = C20528a.m48229h("important", jSONObject2);
        if (jSONObject2.isNull("externalIds")) {
            map = null;
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("externalIds");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject3.get(next);
                if (obj instanceof String) {
                    hashMap.put(next, (String) obj);
                }
            }
            map = hashMap;
        }
        String str4 = "";
        if (o == null) {
            o = str4;
        }
        if (o2 != null) {
            str = o2;
        } else {
            str = str4;
        }
        if (o3 != null) {
            str2 = o3;
        } else {
            str2 = str4;
        }
        if (o4 != null) {
            str3 = o4;
        } else {
            str3 = str4;
        }
        if (o5 != null) {
            str4 = o5;
        }
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(h);
        boolean equals2 = bool.equals(h2);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return new C18777c(k, o, str, str2, str3, str4, g, g2, equals, equals2, map);
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18777c cVar = (C18777c) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "id", cVar.f47792a);
        C20528a.m48237t(jSONObject, "name", cVar.f47793b);
        C20528a.m48237t(jSONObject, "shortName", cVar.f47794c);
        C20528a.m48237t(jSONObject, "longName", cVar.f47795d);
        C20528a.m48237t(jSONObject, UnityMediationAdapter.KEY_PLACEMENT_ID, cVar.f47796e);
        C20528a.m48237t(jSONObject, "subBrand", cVar.f47797f);
        C20528a.m48237t(jSONObject, ServerParameters.LAT_KEY, cVar.f47798g);
        C20528a.m48237t(jSONObject, ServerParameters.LON_KEY, cVar.f47799h);
        C20528a.m48237t(jSONObject, "hidden", Boolean.valueOf(cVar.f47800i));
        C20528a.m48237t(jSONObject, "important", Boolean.valueOf(cVar.f47801j));
        Map<String, String> map = cVar.f47802k;
        if (map == null) {
            jSONObject.put("externalIds", JSONObject.NULL);
        } else {
            jSONObject.put("externalIds", new JSONObject(map));
        }
        return jSONObject;
    }
}
