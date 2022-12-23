package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14625q;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;
import p911xg.C20505m;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.c */
public final class C14510c extends GeneratedMessageLite<C14510c, C14512b> implements C20505m {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C14510c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile C20508p<C14510c> PARSER;
    private C14504a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f36812b;
    private String googleAppId_ = "";

    /* renamed from: com.google.firebase.perf.v1.c$a */
    public static /* synthetic */ class C14511a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36666a;

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
                f36666a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36666a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.C14510c.C14511a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.c$b */
    public static final class C14512b extends GeneratedMessageLite.C14572a<C14510c, C14512b> implements C20505m {
        public C14512b() {
            super(C14510c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.c$c */
    public static final class C14513c {

        /* renamed from: a */
        public static final C14625q<String, String> f36667a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36667a = new C14625q<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        C14510c cVar = new C14510c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.m36504r(C14510c.class, cVar);
    }

    /* renamed from: E */
    public static C14512b m36144E() {
        return (C14512b) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: t */
    public static void m36146t(C14510c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    /* renamed from: u */
    public static void m36147u(C14510c cVar, ApplicationProcessState applicationProcessState) {
        cVar.getClass();
        cVar.applicationProcessState_ = applicationProcessState.getNumber();
        cVar.bitField0_ |= 8;
    }

    /* renamed from: v */
    public static MapFieldLite m36148v(C14510c cVar) {
        if (!cVar.customAttributes_.mo43972g()) {
            cVar.customAttributes_ = cVar.customAttributes_.mo43975i();
        }
        return cVar.customAttributes_;
    }

    /* renamed from: w */
    public static void m36149w(C14510c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    /* renamed from: x */
    public static void m36150x(C14510c cVar, C14504a aVar) {
        cVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    /* renamed from: z */
    public static C14510c m36151z() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A */
    public final boolean mo43549A() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: B */
    public final boolean mo43550B() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: C */
    public final boolean mo43551C() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: D */
    public final boolean mo43552D() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C14511a.f36666a[methodToInvoke.ordinal()]) {
            case 1:
                return new C14510c();
            case 2:
                return new C14512b();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.internalGetVerifier(), "customAttributes_", C14513c.f36667a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<C14510c> pVar = PARSER;
                if (pVar == null) {
                    synchronized (C14510c.class) {
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

    /* renamed from: y */
    public final C14504a mo43553y() {
        C14504a aVar = this.androidAppInfo_;
        return aVar == null ? C14504a.m36134w() : aVar;
    }
}
