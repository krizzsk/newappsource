package com.usebutton.sdk.internal.api;

import com.usebutton.sdk.action.ActionQuery;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonThreadFactory;
import com.usebutton.sdk.internal.util.TimeProvider;
import com.usebutton.sdk.internal.util.TtlReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ActionCache implements AppActionCache {
    private static final long DEFAULT_CACHE_TIME_SECONDS = TimeUnit.HOURS.toSeconds(1);
    private static final Executor DEFAULT_SHARED_EXECUTOR = Executors.newSingleThreadExecutor(new ButtonThreadFactory(TAG));
    public static final int MAX_ENTRIES = 100;
    private static final String TAG = "ActionCache";
    private final LinkedHashMap<Pair<String, String>, TtlReference<AppAction>> mCache;
    private final Executor mGarbageMan;
    private int mHits;
    private int mMisses;
    private final TimeProvider mTimeProvider;

    public ActionCache() {
        this(TtlReference.REALTIME_MILLIS_PROVIDER, DEFAULT_SHARED_EXECUTOR);
    }

    private Pair cacheKeyForContext(String str, String str2, ActionQuery actionQuery) {
        String locale = Locale.getDefault().toString();
        if (actionQuery != null) {
            StringBuilder k = C13555b.m33972k(locale);
            k.append(actionQuery.key());
            locale = k.toString();
        }
        if (str2 != null) {
            locale = C25541a.m63881k(locale, str2);
        }
        return new Pair(str, locale);
    }

    /* access modifiers changed from: private */
    public synchronized void evictExpired() {
        Iterator<Map.Entry<Pair<String, String>, TtlReference<AppAction>>> it = this.mCache.entrySet().iterator();
        while (it.hasNext()) {
            if (((TtlReference) it.next().getValue()).isDead()) {
                it.remove();
            }
        }
    }

    private void scheduleCleanup() {
        this.mGarbageMan.execute(new Runnable() {
            public void run() {
                ActionCache.this.evictExpired();
            }
        });
    }

    public synchronized boolean contains(String str, String str2, ActionQuery actionQuery) {
        boolean z;
        scheduleCleanup();
        Pair cacheKeyForContext = cacheKeyForContext(str, str2, actionQuery);
        z = true;
        if (this.mCache.get(cacheKeyForContext) != null) {
            this.mHits++;
        } else {
            this.mMisses++;
            z = false;
        }
        if (this.mHits + (this.mMisses % 10) == 0) {
            ButtonLog.info(TAG, toString());
        }
        return z;
    }

    public synchronized AppAction get(String str, String str2, ActionQuery actionQuery) {
        AppAction appAction;
        TtlReference ttlReference = this.mCache.get(cacheKeyForContext(str, str2, actionQuery));
        if (ttlReference != null) {
            appAction = (AppAction) ttlReference.get();
        } else {
            appAction = null;
        }
        return appAction;
    }

    public synchronized void put(String str, String str2, ActionQuery actionQuery, AppAction appAction) {
        long j;
        if (appAction == null) {
            j = DEFAULT_CACHE_TIME_SECONDS;
        } else {
            j = (long) appAction.getMeta().getMaxAgeSeconds();
        }
        if (j > 0) {
            this.mCache.put(cacheKeyForContext(str, str2, actionQuery), new TtlReference(this.mTimeProvider, appAction, j * 1000));
        }
    }

    public synchronized int size() {
        return this.mCache.size();
    }

    public String toString() {
        int i = this.mHits;
        int i2 = this.mMisses + i;
        return String.format(Locale.US, "ActionCache hits/misses/total: %d/%d/%d hit rate=%.2f", new Object[]{Integer.valueOf(i), Integer.valueOf(this.mMisses), Integer.valueOf(i2), Double.valueOf((((double) this.mHits) * 1.0d) / ((double) i2))});
    }

    public ActionCache(TimeProvider timeProvider, Executor executor) {
        this.mCache = new LinkedHashMap<Pair<String, String>, TtlReference<AppAction>>() {
            public boolean removeEldestEntry(Map.Entry entry) {
                if (size() <= 100) {
                    return false;
                }
                ButtonLog.infoFormat(ActionCache.TAG, "At capacity so evicting eldest entry: " + entry, new Object[0]);
                return true;
            }
        };
        this.mHits = 0;
        this.mMisses = 0;
        this.mTimeProvider = timeProvider;
        this.mGarbageMan = executor;
    }
}
