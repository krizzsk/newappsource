package com.usebutton.sdk.internal.util;

import java.util.Locale;

public abstract class ResourceLink<K, V> implements CachingLink<K, V> {
    public static final CachingLink LAST_LINK = new CachingLink() {
        public Object get(Object obj) {
            return null;
        }

        public void put(Object obj, Object obj2) {
        }

        public int size() {
            return 0;
        }
    };
    private static final String TAG = "ResourceLink";
    private int mHits;
    private int mInserts;
    private int mMisses;
    private final CachingLink<K, V> mNext;

    public ResourceLink() {
        this(LAST_LINK);
    }

    private void logSelf() {
        if ((this.mMisses % 2) + this.mHits == 0) {
            StringBuilder k = C13555b.m33972k("Status: ");
            k.append(toString());
            ButtonLog.verbose(TAG, k.toString());
        }
    }

    public abstract V doGet(K k);

    public abstract void doPut(K k, V v);

    public synchronized V get(K k) {
        if (k == null) {
            return null;
        }
        V doGet = doGet(k);
        logSelf();
        if (doGet != null) {
            this.mHits++;
            return doGet;
        }
        this.mMisses++;
        V v = this.mNext.get(k);
        put(k, v);
        return v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void put(K r2, V r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x001c
            if (r3 != 0) goto L_0x0006
            goto L_0x001c
        L_0x0006:
            int r0 = r1.mInserts     // Catch:{ all -> 0x0019 }
            int r0 = r0 + 1
            r1.mInserts = r0     // Catch:{ all -> 0x0019 }
            r1.logSelf()     // Catch:{ all -> 0x0019 }
            r1.doPut(r2, r3)     // Catch:{ all -> 0x0019 }
            com.usebutton.sdk.internal.util.CachingLink<K, V> r0 = r1.mNext     // Catch:{ all -> 0x0019 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x001c:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.util.ResourceLink.put(java.lang.Object, java.lang.Object):void");
    }

    public String toString() {
        return String.format(Locale.US, "%s{next=%s, hits/misses/total %d/%d/%d, inserts=%d}", new Object[]{getClass().getSimpleName(), this.mNext.getClass(), Integer.valueOf(this.mHits), Integer.valueOf(this.mMisses), Integer.valueOf(this.mHits + this.mMisses), Integer.valueOf(this.mInserts)});
    }

    public ResourceLink(CachingLink<K, V> cachingLink) {
        this.mMisses = 0;
        this.mHits = 0;
        this.mInserts = 0;
        this.mNext = cachingLink;
    }
}
