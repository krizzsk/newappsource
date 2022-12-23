package com.google.android.datatransport.runtime.firebase.transport;

import p861ve.C20111b;

public final class LogEventDropped {

    /* renamed from: a */
    public final long f13388a;

    /* renamed from: b */
    public final Reason f13389b;

    public enum Reason implements C20111b {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private Reason(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    static {
        Reason reason = Reason.REASON_UNKNOWN;
    }

    public LogEventDropped(long j, Reason reason) {
        this.f13388a = j;
        this.f13389b = reason;
    }
}
