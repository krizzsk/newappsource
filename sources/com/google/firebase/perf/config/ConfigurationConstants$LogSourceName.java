package com.google.firebase.perf.config;

import ci0.C21211f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ConfigurationConstants$LogSourceName extends C21211f {

    /* renamed from: b */
    public static ConfigurationConstants$LogSourceName f36618b;

    /* renamed from: c */
    public static final Map<Long, String> f36619c = Collections.unmodifiableMap(new HashMap<Long, String>() {
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });

    /* renamed from: h */
    public final String mo43443h() {
        return "com.google.firebase.perf.LogSourceName";
    }

    /* renamed from: p */
    public final String mo43444p() {
        return "fpr_log_source";
    }
}
