package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p032c0.C1754d;
import p032c0.C1755e;
import p304x.C7072l1;

/* renamed from: androidx.camera.core.impl.n */
public class C0590n implements Config {

    /* renamed from: y */
    public static final C7072l1 f2013y;

    /* renamed from: z */
    public static final C0590n f2014z;

    /* renamed from: x */
    public final TreeMap<Config.C0564a<?>, Map<Config.OptionPriority, Object>> f2015x;

    static {
        C7072l1 l1Var = new C7072l1(1);
        f2013y = l1Var;
        f2014z = new C0590n(new TreeMap(l1Var));
    }

    public C0590n(TreeMap<Config.C0564a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.f2015x = treeMap;
    }

    /* renamed from: s */
    public static C0590n m1678s(C0588l lVar) {
        if (C0590n.class.equals(lVar.getClass())) {
            return (C0590n) lVar;
        }
        TreeMap treeMap = new TreeMap(f2013y);
        C0590n nVar = (C0590n) lVar;
        for (Config.C0564a next : nVar.listOptions()) {
            Set<Config.OptionPriority> h = nVar.mo2429h(next);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority next2 : h) {
                arrayMap.put(next2, nVar.mo2426f(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C0590n(treeMap);
    }

    /* renamed from: a */
    public final <ValueT> ValueT mo2422a(Config.C0564a<ValueT> aVar) {
        Map map = this.f2015x.get(aVar);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* renamed from: b */
    public final <ValueT> ValueT mo2423b(Config.C0564a<ValueT> aVar, ValueT valuet) {
        try {
            return mo2422a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    /* renamed from: c */
    public final Config.OptionPriority mo2424c(Config.C0564a<?> aVar) {
        Map map = this.f2015x.get(aVar);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    /* renamed from: e */
    public final boolean mo2425e(Config.C0564a<?> aVar) {
        return this.f2015x.containsKey(aVar);
    }

    /* renamed from: f */
    public final <ValueT> ValueT mo2426f(Config.C0564a<ValueT> aVar, Config.OptionPriority optionPriority) {
        Map map = this.f2015x.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        } else if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        } else {
            throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + optionPriority);
        }
    }

    /* renamed from: h */
    public final Set<Config.OptionPriority> mo2429h(Config.C0564a<?> aVar) {
        Map map = this.f2015x.get(aVar);
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    /* renamed from: l */
    public final void mo2430l(C1754d dVar) {
        for (Map.Entry next : this.f2015x.tailMap(Config.C0564a.m1591a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (((Config.C0564a) next.getKey()).mo2447b().startsWith("camera2.captureRequest.option.")) {
                Config.C0564a aVar = (Config.C0564a) next.getKey();
                Config config = (Config) dVar.f6155d;
                ((C1755e.C1756a) dVar.f6154c).f6157a.mo2502v(aVar, config.mo2424c(aVar), config.mo2422a(aVar));
            } else {
                return;
            }
        }
    }

    public final Set<Config.C0564a<?>> listOptions() {
        return Collections.unmodifiableSet(this.f2015x.keySet());
    }
}
