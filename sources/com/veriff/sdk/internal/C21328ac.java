package com.veriff.sdk.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.veriff.sdk.internal.ac */
final class C21328ac {

    /* renamed from: a */
    private final Map<Integer, Integer> f53607a = new HashMap();

    /* renamed from: a */
    public void mo53990a(int i) {
        Integer num = this.f53607a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f53607a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: a */
    public int[] mo53991a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f53607a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
                arrayList.add(next.getKey());
            } else if (((Integer) next.getValue()).intValue() == i) {
                arrayList.add(next.getKey());
            }
        }
        return C22720y.m55475a((Collection<Integer>) arrayList);
    }
}
