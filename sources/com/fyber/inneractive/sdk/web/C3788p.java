package com.fyber.inneractive.sdk.web;

import android.util.LruCache;

/* renamed from: com.fyber.inneractive.sdk.web.p */
public class C3788p<K> extends LruCache<K, C3791s> {
    public C3788p(int i) {
        super(i);
    }

    public int sizeOf(Object obj, Object obj2) {
        String str;
        C3791s sVar = (C3791s) obj2;
        int i = 0;
        for (String next : sVar.f13068b.keySet()) {
            if (!(next == null || (str = sVar.f13068b.get(next)) == null)) {
                i += str.length() + next.length();
            }
        }
        return i + sVar.f13067a.length;
    }
}
