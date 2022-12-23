package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14610k;

/* renamed from: com.google.firebase.perf.v1.ApplicationProcessState */
public enum ApplicationProcessState implements C14610k.C14611a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final C14610k.C14612b<ApplicationProcessState> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$a */
    public class C14489a implements C14610k.C14612b<ApplicationProcessState> {
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$b */
    public static final class C14490b implements C14610k.C14613c {

        /* renamed from: a */
        public static final C14490b f36656a = null;

        static {
            f36656a = new C14490b();
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C14489a();
    }

    private ApplicationProcessState(int i) {
        this.value = i;
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static C14610k.C14612b<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static C14610k.C14613c internalGetVerifier() {
        return C14490b.f36656a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
        return forNumber(i);
    }
}
