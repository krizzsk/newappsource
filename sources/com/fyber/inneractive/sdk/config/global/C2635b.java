package com.fyber.inneractive.sdk.config.global;

import com.appsflyer.ServerParameters;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.b */
public class C2635b {

    /* renamed from: a */
    public String f9290a;

    /* renamed from: b */
    public int f9291b;

    /* renamed from: c */
    public final List<C2658k> f9292c = new ArrayList();

    /* renamed from: d */
    public List<C2637d> f9293d = new ArrayList();

    /* renamed from: a */
    public static void m6672a(C2635b bVar, JSONObject jSONObject, boolean z) throws Exception {
        Object obj;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                next.getClass();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1335432629:
                        if (next.equals("demand")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -977436259:
                        if (next.equals("pub_id")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -212583340:
                        if (next.equals("placement_type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3556:
                        if (next.equals("os")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 113722:
                        if (next.equals(ServerParameters.ANDROID_SDK_INT)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        obj = new C2636c(jSONObject.getJSONArray(next), z);
                        break;
                    case 1:
                        obj = new C2656i(jSONObject.getJSONArray(next), z);
                        break;
                    case 2:
                        obj = new C2655h(jSONObject.getJSONArray(next), z);
                        break;
                    case 3:
                        obj = new C2639f(jSONObject.getString(next), z);
                        break;
                    case 4:
                        obj = new C2657j(jSONObject.getString(next), z);
                        break;
                    default:
                        obj = null;
                        break;
                }
                if (obj != null) {
                    bVar.f9293d.add(obj);
                } else {
                    IAlog.m9902a(String.format("%s: Unsupported filter type: %s", new Object[]{"b", next}), new Object[0]);
                }
            }
        }
    }

    public String toString() {
        return String.format("experiment: id=%s, variants=%s, filters=%s", new Object[]{this.f9290a, this.f9292c, this.f9293d});
    }
}
