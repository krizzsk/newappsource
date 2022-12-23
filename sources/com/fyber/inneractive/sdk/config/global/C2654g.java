package com.fyber.inneractive.sdk.config.global;

import com.appboy.enums.CardKey;
import com.fyber.inneractive.sdk.config.global.features.C2644e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.g */
public class C2654g {
    /* renamed from: a */
    public static JSONArray m6703a(Map<Class, C2644e> map, boolean z) {
        C2637d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (C2644e next : map.values()) {
                List<C2635b> list = next.f9303c;
                Map<String, C2658k> map2 = next.f9304d;
                for (C2635b next2 : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", next2.f9290a);
                    if (map2.containsKey(next2.f9290a)) {
                        jSONObject.put("v", map2.get(next2.f9290a).f9323b);
                    } else {
                        jSONObject.put("v", CardKey.CONTROL_KEY);
                    }
                    if (z) {
                        Class<C2636c> cls = C2636c.class;
                        Iterator<C2637d> it = next2.f9293d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dVar = null;
                                break;
                            }
                            dVar = it.next();
                            if (cls.equals(dVar.getClass())) {
                                break;
                            }
                        }
                        if (dVar != null && ((C2636c) dVar).f9295b) {
                            Set<Long> set = ((C2636c) dVar).f9294a;
                            JSONArray jSONArray2 = new JSONArray();
                            for (Long put : set) {
                                jSONArray2.put(put);
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put("d", jSONArray2);
                            }
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m9902a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f12814a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
