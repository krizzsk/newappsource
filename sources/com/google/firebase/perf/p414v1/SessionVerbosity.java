package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14610k;

/* renamed from: com.google.firebase.perf.v1.SessionVerbosity */
public enum SessionVerbosity implements C14610k.C14611a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final C14610k.C14612b<SessionVerbosity> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$a */
    public class C14498a implements C14610k.C14612b<SessionVerbosity> {
    }

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$b */
    public static final class C14499b implements C14610k.C14613c {

        /* renamed from: a */
        public static final C14499b f36661a = null;

        static {
            f36661a = new C14499b();
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C14498a();
    }

    private SessionVerbosity(int i) {
        this.value = i;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C14610k.C14612b<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static C14610k.C14613c internalGetVerifier() {
        return C14499b.f36661a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }
}
