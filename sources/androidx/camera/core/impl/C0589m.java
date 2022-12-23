package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.m */
public final class C0589m extends C0590n implements C0588l {

    /* renamed from: A */
    public static final Config.OptionPriority f2012A = Config.OptionPriority.OPTIONAL;

    public C0589m(TreeMap<Config.C0564a<?>, Map<Config.OptionPriority, Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: t */
    public static C0589m m1674t() {
        return new C0589m(new TreeMap(C0590n.f2013y));
    }

    /* renamed from: u */
    public static C0589m m1675u(Config config) {
        TreeMap treeMap = new TreeMap(C0590n.f2013y);
        for (Config.C0564a next : config.listOptions()) {
            Set<Config.OptionPriority> h = config.mo2429h(next);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority next2 : h) {
                arrayMap.put(next2, config.mo2426f(next, next2));
            }
            treeMap.put(next, arrayMap);
        }
        return new C0589m(treeMap);
    }

    /* renamed from: v */
    public final <ValueT> void mo2502v(Config.C0564a<ValueT> aVar, Config.OptionPriority optionPriority, ValueT valuet) {
        Config.OptionPriority optionPriority2;
        Map map = this.f2015x.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.f2015x.put(aVar, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        Config.OptionPriority optionPriority3 = (Config.OptionPriority) Collections.min(map.keySet());
        if (!Objects.equals(map.get(optionPriority3), valuet)) {
            Config.OptionPriority optionPriority4 = Config.OptionPriority.ALWAYS_OVERRIDE;
            boolean z = true;
            if (!((optionPriority3 == optionPriority4 && optionPriority == optionPriority4) || (optionPriority3 == (optionPriority2 = Config.OptionPriority.REQUIRED) && optionPriority == optionPriority2))) {
                z = false;
            }
            if (z) {
                StringBuilder k = C13555b.m33972k("Option values conflicts: ");
                k.append(aVar.mo2447b());
                k.append(", existing value (");
                k.append(optionPriority3);
                k.append(")=");
                k.append(map.get(optionPriority3));
                k.append(", conflicting (");
                k.append(optionPriority);
                k.append(")=");
                k.append(valuet);
                throw new IllegalArgumentException(k.toString());
            }
        }
        map.put(optionPriority, valuet);
    }

    /* renamed from: w */
    public final <ValueT> void mo2503w(Config.C0564a<ValueT> aVar, ValueT valuet) {
        mo2502v(aVar, f2012A, valuet);
    }
}
