package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14596c;
import com.google.protobuf.C14609j;
import com.google.protobuf.C14610k;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Arrays;
import p911xg.C20497g;
import p911xg.C20505m;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.h */
public final class C14526h extends GeneratedMessageLite<C14526h, C14529c> implements C20505m {
    /* access modifiers changed from: private */
    public static final C14526h DEFAULT_INSTANCE;
    private static volatile C20508p<C14526h> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C20497g<Integer, SessionVerbosity> sessionVerbosity_converter_ = new C14527a();
    private int bitField0_;
    private String sessionId_ = "";
    private C14610k.C14614d sessionVerbosity_ = C14609j.f36858e;

    /* renamed from: com.google.firebase.perf.v1.h$a */
    public class C14527a implements C20497g<Integer, SessionVerbosity> {
    }

    /* renamed from: com.google.firebase.perf.v1.h$b */
    public static /* synthetic */ class C14528b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36672a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36672a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36672a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.C14526h.C14528b.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.h$c */
    public static final class C14529c extends GeneratedMessageLite.C14572a<C14526h, C14529c> implements C20505m {
        public C14529c() {
            super(C14526h.DEFAULT_INSTANCE);
        }
    }

    static {
        C14526h hVar = new C14526h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.m36504r(C14526h.class, hVar);
    }

    /* renamed from: t */
    public static void m36208t(C14526h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.sessionId_ = str;
    }

    /* renamed from: u */
    public static void m36209u(C14526h hVar, SessionVerbosity sessionVerbosity) {
        int i;
        hVar.getClass();
        sessionVerbosity.getClass();
        C14610k.C14614d dVar = hVar.sessionVerbosity_;
        if (!((C14596c) dVar).f36836b) {
            C14609j jVar = (C14609j) dVar;
            int i2 = jVar.f36860d;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            if (i >= i2) {
                hVar.sessionVerbosity_ = new C14609j(Arrays.copyOf(jVar.f36859c, i), jVar.f36860d);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((C14609j) hVar.sessionVerbosity_).mo44089i(sessionVerbosity.getNumber());
    }

    /* renamed from: x */
    public static C14529c m36210x() {
        return (C14529c) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C14528b.f36672a[methodToInvoke.ordinal()]) {
            case 1:
                return new C14526h();
            case 2:
                return new C14529c();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<C14526h> pVar = PARSER;
                if (pVar == null) {
                    synchronized (C14526h.class) {
                        pVar = PARSER;
                        if (pVar == null) {
                            pVar = new GeneratedMessageLite.C14573b<>(DEFAULT_INSTANCE);
                            PARSER = pVar;
                        }
                    }
                }
                return pVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: v */
    public final SessionVerbosity mo43568v() {
        C20497g<Integer, SessionVerbosity> gVar = sessionVerbosity_converter_;
        Integer valueOf = Integer.valueOf(((C14609j) this.sessionVerbosity_).mo44092n(0));
        ((C14527a) gVar).getClass();
        SessionVerbosity forNumber = SessionVerbosity.forNumber(valueOf.intValue());
        if (forNumber == null) {
            return SessionVerbosity.SESSION_VERBOSITY_NONE;
        }
        return forNumber;
    }

    /* renamed from: w */
    public final int mo43569w() {
        return ((C14609j) this.sessionVerbosity_).f36860d;
    }
}
