package com.google.i18n.phonenumbers.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public final class RegexCache {

    /* renamed from: a */
    public LRUCache<String, Pattern> f36780a;

    public static class LRUCache<K, V> {

        /* renamed from: a */
        public LinkedHashMap<K, V> f36781a;

        /* renamed from: b */
        public int f36782b;

        public LRUCache(int i) {
            this.f36782b = i;
            this.f36781a = new LinkedHashMap<K, V>(C13715c.m34237b(i, 4, 3, 1)) {
                public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    if (size() > LRUCache.this.f36782b) {
                        return true;
                    }
                    return false;
                }
            };
        }
    }

    public RegexCache(int i) {
        this.f36780a = new LRUCache<>(i);
    }

    /* renamed from: a */
    public final Pattern mo43873a(String str) {
        V v;
        LRUCache<String, Pattern> lRUCache = this.f36780a;
        synchronized (lRUCache) {
            v = lRUCache.f36781a.get(str);
        }
        Pattern pattern = (Pattern) v;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            LRUCache<String, Pattern> lRUCache2 = this.f36780a;
            synchronized (lRUCache2) {
                lRUCache2.f36781a.put(str, pattern);
            }
        }
        return pattern;
    }
}
