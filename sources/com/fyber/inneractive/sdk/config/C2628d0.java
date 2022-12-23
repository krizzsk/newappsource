package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.bidder.C2566a;
import com.fyber.inneractive.sdk.cache.session.C2603c;
import com.fyber.inneractive.sdk.cache.session.C2604d;
import com.fyber.inneractive.sdk.cache.session.C2606e;
import com.fyber.inneractive.sdk.cache.session.C2612g;
import com.fyber.inneractive.sdk.cache.session.C2613h;
import com.fyber.inneractive.sdk.cache.session.enums.C2607a;
import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3714n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.d0 */
public class C2628d0 implements C2631e0 {

    /* renamed from: a */
    public C2604d f9278a;

    /* renamed from: b */
    public final Map<UnitDisplayType, Map<String, String>> f9279b = new HashMap();

    /* renamed from: c */
    public final Map<String, String> f9280c = new HashMap();

    /* renamed from: d */
    public C2629a f9281d;

    /* renamed from: e */
    public boolean f9282e = false;

    /* renamed from: com.fyber.inneractive.sdk.config.d0$a */
    public interface C2629a {
    }

    /* renamed from: a */
    public String mo13209a(UnitDisplayType unitDisplayType, String str) {
        Map map = this.f9279b.get(unitDisplayType);
        if (map == null || map.get(str) == null) {
            return "";
        }
        return (String) map.get(str);
    }

    /* renamed from: a */
    public void mo13213a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map map = this.f9279b.get(unitDisplayType);
        if (map == null) {
            map = new HashMap();
            this.f9279b.put(unitDisplayType, map);
        }
        map.put(str, str2);
        C2629a aVar = this.f9281d;
        if (aVar != null && this.f9282e) {
            ((C2566a) aVar).mo13017b();
        }
    }

    /* renamed from: a */
    public JSONArray mo13210a(UnitDisplayType unitDisplayType) {
        String str;
        C2604d dVar = this.f9278a;
        if (dVar == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (C2608b bVar : C2608b.values()) {
                if (bVar != C2608b.NONE && (unitDisplayType == null || bVar.f9197a == unitDisplayType)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f9197a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject.put("subType", str);
                    C2613h hVar = dVar.f9176b.get(bVar);
                    int a = dVar.mo13176a();
                    if (a > 0 && hVar != null && hVar.size() >= a) {
                        boolean z = bVar.f9198b;
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList arrayList = new ArrayList(hVar);
                        Collections.sort(arrayList, new C2612g(hVar));
                        Iterator it = arrayList.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            jSONArray2.put(((C2606e) it.next()).mo13180a(false, z));
                            i++;
                            if (i >= a) {
                                break;
                            }
                        }
                        jSONObject.put("sessionData", jSONArray2);
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (Exception unused) {
            return jSONArray;
        }
    }

    /* renamed from: a */
    public void mo13211a(C2608b bVar, C2607a aVar) {
        C2604d dVar = this.f9278a;
        if (dVar != null) {
            C3714n.m9976a(new C2603c(dVar, aVar, bVar));
        }
    }

    /* renamed from: a */
    public void mo13214a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String a : strArr) {
            mo13213a(unitDisplayType, a, "0");
        }
    }

    /* renamed from: a */
    public void mo13212a(C2629a aVar) {
        this.f9281d = aVar;
    }
}
