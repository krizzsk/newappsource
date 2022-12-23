package com.moovit.util.time;

import p810sz.C19577c;
import p810sz.C19584i;

public enum CongestionSource {
    SENSOR,
    USER,
    PREDICTION;
    
    public static C19584i<CongestionSource> CODER;

    /* access modifiers changed from: public */
    static {
        CongestionSource congestionSource;
        CongestionSource congestionSource2;
        CongestionSource congestionSource3;
        CODER = new C19577c(CongestionSource.class, congestionSource, congestionSource2, congestionSource3);
    }
}
