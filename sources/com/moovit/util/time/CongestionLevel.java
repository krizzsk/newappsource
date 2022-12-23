package com.moovit.util.time;

import p810sz.C19577c;
import p810sz.C19584i;

public enum CongestionLevel {
    EMPTY,
    FEW,
    LOW,
    MED,
    HIGH,
    FULL,
    PACKED;
    
    public static C19584i<CongestionLevel> CODER;

    /* access modifiers changed from: public */
    static {
        CongestionLevel congestionLevel;
        CongestionLevel congestionLevel2;
        CongestionLevel congestionLevel3;
        CongestionLevel congestionLevel4;
        CongestionLevel congestionLevel5;
        CongestionLevel congestionLevel6;
        CongestionLevel congestionLevel7;
        CODER = new C19577c(CongestionLevel.class, congestionLevel, congestionLevel2, congestionLevel3, congestionLevel4, congestionLevel5, congestionLevel6, congestionLevel7);
    }
}
