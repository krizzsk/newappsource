package zendesk.core;

import android.util.LruCache;

class ZendeskLruMemoryCache implements MemoryCache {
    public final LruCache<String, Object> cache;

    public ZendeskLruMemoryCache() {
        this(new LruCache(50));
    }

    public void clear() {
        this.cache.evictAll();
    }

    public <T> T get(String str) {
        T t;
        synchronized (this) {
            t = this.cache.get(str);
        }
        return t;
    }

    public <T> T getOrDefault(String str, T t) {
        T t2 = get(str);
        return t2 != null ? t2 : t;
    }

    public void put(String str, Object obj) {
        synchronized (this) {
            this.cache.put(str, obj);
        }
    }

    public ZendeskLruMemoryCache(LruCache<String, Object> lruCache) {
        this.cache = lruCache;
    }
}
