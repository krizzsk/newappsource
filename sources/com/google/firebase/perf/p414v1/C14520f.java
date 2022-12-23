package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14610k;
import com.google.protobuf.C14635y;
import com.google.protobuf.GeneratedMessageLite;
import p911xg.C20505m;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.f */
public final class C14520f extends GeneratedMessageLite<C14520f, C14522b> implements C20505m {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C14520f DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile C20508p<C14520f> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C14610k.C14615e<C14507b> androidMemoryReadings_;
    private int bitField0_;
    private C14610k.C14615e<C14514d> cpuMetricReadings_;
    private C14517e gaugeMetadata_;
    private String sessionId_ = "";

    /* renamed from: com.google.firebase.perf.v1.f$a */
    public static /* synthetic */ class C14521a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36670a;

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
                f36670a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36670a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.C14520f.C14521a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.f$b */
    public static final class C14522b extends GeneratedMessageLite.C14572a<C14520f, C14522b> implements C20505m {
        public C14522b() {
            super(C14520f.DEFAULT_INSTANCE);
        }
    }

    static {
        C14520f fVar = new C14520f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.m36504r(C14520f.class, fVar);
    }

    public C14520f() {
        C14635y<Object> yVar = C14635y.f36900e;
        this.cpuMetricReadings_ = yVar;
        this.androidMemoryReadings_ = yVar;
    }

    /* renamed from: D */
    public static C14522b m36173D() {
        return (C14522b) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: t */
    public static void m36175t(C14520f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.bitField0_ |= 1;
        fVar.sessionId_ = str;
    }

    /* renamed from: u */
    public static void m36176u(C14520f fVar, C14507b bVar) {
        fVar.getClass();
        bVar.getClass();
        C14610k.C14615e<C14507b> eVar = fVar.androidMemoryReadings_;
        if (!eVar.mo44025Q0()) {
            fVar.androidMemoryReadings_ = GeneratedMessageLite.m36503q(eVar);
        }
        fVar.androidMemoryReadings_.add(bVar);
    }

    /* renamed from: v */
    public static void m36177v(C14520f fVar, C14517e eVar) {
        fVar.getClass();
        eVar.getClass();
        fVar.gaugeMetadata_ = eVar;
        fVar.bitField0_ |= 2;
    }

    /* renamed from: w */
    public static void m36178w(C14520f fVar, C14514d dVar) {
        fVar.getClass();
        dVar.getClass();
        C14610k.C14615e<C14514d> eVar = fVar.cpuMetricReadings_;
        if (!eVar.mo44025Q0()) {
            fVar.cpuMetricReadings_ = GeneratedMessageLite.m36503q(eVar);
        }
        fVar.cpuMetricReadings_.add(dVar);
    }

    /* renamed from: z */
    public static C14520f m36179z() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final C14517e mo43555A() {
        C14517e eVar = this.gaugeMetadata_;
        return eVar == null ? C14517e.m36169x() : eVar;
    }

    /* renamed from: B */
    public final boolean mo43556B() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: C */
    public final boolean mo43557C() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C14521a.f36670a[methodToInvoke.ordinal()]) {
            case 1:
                return new C14520f();
            case 2:
                return new C14522b();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C14514d.class, "gaugeMetadata_", "androidMemoryReadings_", C14507b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<C14520f> pVar = PARSER;
                if (pVar == null) {
                    synchronized (C14520f.class) {
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

    /* renamed from: x */
    public final int mo43558x() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: y */
    public final int mo43559y() {
        return this.cpuMetricReadings_.size();
    }
}
