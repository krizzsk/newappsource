package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.d */
public class C2604d {

    /* renamed from: a */
    public C2610f f9175a = new C2610f();

    /* renamed from: b */
    public HashMap<C2608b, C2613h> f9176b;

    /* renamed from: c */
    public final Object f9177c = new Object();

    /* renamed from: d */
    public final Object f9178d = new Object();

    /* renamed from: e */
    public C2605a f9179e;

    /* renamed from: com.fyber.inneractive.sdk.cache.session.d$a */
    public interface C2605a {
        /* renamed from: a */
        void mo13179a(C2604d dVar, boolean z, JSONObject jSONObject);
    }

    public C2604d(int i, C2605a aVar) {
        this.f9176b = new C2600a(this, i);
        this.f9179e = null;
    }

    /* renamed from: a */
    public static JSONObject m6621a(C2604d dVar) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", dVar.f9175a.mo13181a());
            for (Map.Entry next : dVar.f9176b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                C2608b bVar = (C2608b) next.getKey();
                Iterator it = ((PriorityQueue) next.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C2606e) it.next()).mo13180a(true, true));
                }
                jSONObject.put(bVar.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo13177a(C2608b bVar, C2606e eVar) {
        synchronized (this.f9178d) {
            C2613h hVar = this.f9176b.get(bVar);
            if (hVar != null) {
                hVar.add(eVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo13178a(C2610f fVar) {
        C2606e eVar;
        for (C2608b bVar : C2608b.values()) {
            if (!(bVar == C2608b.NONE || (eVar = fVar.f9200a.get(bVar)) == null || eVar.f9180a == 0)) {
                mo13177a(bVar, eVar);
            }
        }
    }

    /* renamed from: a */
    public int mo13176a() {
        int i;
        C2667h hVar = IAConfigManager.f9202J.f9234v.f9337b;
        String num = Integer.toString(5);
        if (hVar.f9334a.containsKey("number_of_sessions")) {
            num = hVar.f9334a.get("number_of_sessions");
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
            i = 5;
        }
        if (i < 0) {
            return 5;
        }
        return i;
    }
}
