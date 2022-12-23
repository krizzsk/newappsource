package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C2780m;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public class InneractiveAdSpotManager {

    /* renamed from: a */
    public Map<String, InneractiveAdSpot> f9498a = new ConcurrentHashMap();

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdSpotManager$a */
    public static class C2746a {

        /* renamed from: a */
        public static InneractiveAdSpotManager f9499a = new InneractiveAdSpotManager();
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().f9498a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public static InneractiveAdSpotManager get() {
        return C2746a.f9499a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f9498a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        C2780m mVar = new C2780m();
        this.f9498a.put(mVar.f9609a, mVar);
        return mVar;
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.f9498a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.f9498a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
