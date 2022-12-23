package com.google.firebase.perf.p414v1;

import com.google.protobuf.GeneratedMessageLite;
import p814tf.C19670a;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.g */
public final class C14523g extends GeneratedMessageLite<C14523g, C14525b> implements C19670a {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C14523g DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile C20508p<C14523g> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C14510c applicationInfo_;
    private int bitField0_;
    private C14520f gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private C14530i traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.g$a */
    public static /* synthetic */ class C14524a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36671a;

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
                f36671a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36671a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.C14523g.C14524a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.g$b */
    public static final class C14525b extends GeneratedMessageLite.C14572a<C14523g, C14525b> implements C19670a {
        public C14525b() {
            super(C14523g.DEFAULT_INSTANCE);
        }

        /* renamed from: f */
        public final boolean mo43560f() {
            return ((C14523g) this.f36809c).mo43560f();
        }

        /* renamed from: g */
        public final boolean mo43561g() {
            return ((C14523g) this.f36809c).mo43561g();
        }

        /* renamed from: h */
        public final NetworkRequestMetric mo43562h() {
            return ((C14523g) this.f36809c).mo43562h();
        }

        /* renamed from: i */
        public final boolean mo43563i() {
            return ((C14523g) this.f36809c).mo43563i();
        }

        /* renamed from: k */
        public final C14530i mo43564k() {
            return ((C14523g) this.f36809c).mo43564k();
        }

        /* renamed from: l */
        public final C14520f mo43565l() {
            return ((C14523g) this.f36809c).mo43565l();
        }
    }

    static {
        C14523g gVar = new C14523g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.m36504r(C14523g.class, gVar);
    }

    /* renamed from: t */
    public static void m36187t(C14523g gVar, C14510c cVar) {
        gVar.getClass();
        gVar.applicationInfo_ = cVar;
        gVar.bitField0_ |= 1;
    }

    /* renamed from: u */
    public static void m36188u(C14523g gVar, C14520f fVar) {
        gVar.getClass();
        fVar.getClass();
        gVar.gaugeMetric_ = fVar;
        gVar.bitField0_ |= 8;
    }

    /* renamed from: v */
    public static void m36189v(C14523g gVar, C14530i iVar) {
        gVar.getClass();
        iVar.getClass();
        gVar.traceMetric_ = iVar;
        gVar.bitField0_ |= 2;
    }

    /* renamed from: w */
    public static void m36190w(C14523g gVar, NetworkRequestMetric networkRequestMetric) {
        gVar.getClass();
        networkRequestMetric.getClass();
        gVar.networkRequestMetric_ = networkRequestMetric;
        gVar.bitField0_ |= 4;
    }

    /* renamed from: z */
    public static C14525b m36191z() {
        return (C14525b) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: f */
    public final boolean mo43560f() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: g */
    public final boolean mo43561g() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: h */
    public final NetworkRequestMetric mo43562h() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.m36099H() : networkRequestMetric;
    }

    /* renamed from: i */
    public final boolean mo43563i() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: k */
    public final C14530i mo43564k() {
        C14530i iVar = this.traceMetric_;
        return iVar == null ? C14530i.m36216G() : iVar;
    }

    /* renamed from: l */
    public final C14520f mo43565l() {
        C14520f fVar = this.gaugeMetric_;
        return fVar == null ? C14520f.m36179z() : fVar;
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C14524a.f36671a[methodToInvoke.ordinal()]) {
            case 1:
                return new C14523g();
            case 2:
                return new C14525b();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<C14523g> pVar = PARSER;
                if (pVar == null) {
                    synchronized (C14523g.class) {
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
    public final C14510c mo43566x() {
        C14510c cVar = this.applicationInfo_;
        return cVar == null ? C14510c.m36151z() : cVar;
    }

    /* renamed from: y */
    public final boolean mo43567y() {
        return (this.bitField0_ & 1) != 0;
    }
}
