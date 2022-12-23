package com.google.firebase.perf.p414v1;

import com.google.protobuf.C14583a;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14625q;
import com.google.protobuf.C14635y;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p911xg.C20505m;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.i */
public final class C14530i extends GeneratedMessageLite<C14530i, C14532b> implements C20505m {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final C14530i DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C20508p<C14530i> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_;
    private MapFieldLite<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C14610k.C14615e<C14526h> perfSessions_;
    private C14610k.C14615e<C14530i> subtraces_;

    /* renamed from: com.google.firebase.perf.v1.i$a */
    public static /* synthetic */ class C14531a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36673a;

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
                f36673a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36673a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.C14530i.C14531a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.i$b */
    public static final class C14532b extends GeneratedMessageLite.C14572a<C14530i, C14532b> implements C20505m {
        public C14532b() {
            super(C14530i.DEFAULT_INSTANCE);
        }

        /* renamed from: r */
        public final void mo43579r(long j) {
            mo43956p();
            C14530i.m36214A((C14530i) this.f36809c, j);
        }

        /* renamed from: s */
        public final void mo43580s(long j) {
            mo43956p();
            C14530i.m36215B((C14530i) this.f36809c, j);
        }

        /* renamed from: t */
        public final void mo43581t(String str) {
            mo43956p();
            C14530i.m36219t((C14530i) this.f36809c, str);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.i$c */
    public static final class C14533c {

        /* renamed from: a */
        public static final C14625q<String, Long> f36674a = new C14625q<>(WireFormat$FieldType.STRING, WireFormat$FieldType.INT64, 0L);
    }

    /* renamed from: com.google.firebase.perf.v1.i$d */
    public static final class C14534d {

        /* renamed from: a */
        public static final C14625q<String, String> f36675a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36675a = new C14625q<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        C14530i iVar = new C14530i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.m36504r(C14530i.class, iVar);
    }

    public C14530i() {
        MapFieldLite<String, Long> mapFieldLite = MapFieldLite.f36812b;
        this.counters_ = mapFieldLite;
        this.customAttributes_ = mapFieldLite;
        C14635y<Object> yVar = C14635y.f36900e;
        this.subtraces_ = yVar;
        this.perfSessions_ = yVar;
    }

    /* renamed from: A */
    public static void m36214A(C14530i iVar, long j) {
        iVar.bitField0_ |= 4;
        iVar.clientStartTimeUs_ = j;
    }

    /* renamed from: B */
    public static void m36215B(C14530i iVar, long j) {
        iVar.bitField0_ |= 8;
        iVar.durationUs_ = j;
    }

    /* renamed from: G */
    public static C14530i m36216G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: M */
    public static C14532b m36217M() {
        return (C14532b) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: t */
    public static void m36219t(C14530i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.bitField0_ |= 1;
        iVar.name_ = str;
    }

    /* renamed from: u */
    public static MapFieldLite m36220u(C14530i iVar) {
        if (!iVar.counters_.mo43972g()) {
            iVar.counters_ = iVar.counters_.mo43975i();
        }
        return iVar.counters_;
    }

    /* renamed from: v */
    public static void m36221v(C14530i iVar, C14530i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        C14610k.C14615e<C14530i> eVar = iVar.subtraces_;
        if (!eVar.mo44025Q0()) {
            iVar.subtraces_ = GeneratedMessageLite.m36503q(eVar);
        }
        iVar.subtraces_.add(iVar2);
    }

    /* renamed from: w */
    public static void m36222w(C14530i iVar, ArrayList arrayList) {
        C14610k.C14615e<C14530i> eVar = iVar.subtraces_;
        if (!eVar.mo44025Q0()) {
            iVar.subtraces_ = GeneratedMessageLite.m36503q(eVar);
        }
        C14583a.m36539b(arrayList, iVar.subtraces_);
    }

    /* renamed from: x */
    public static MapFieldLite m36223x(C14530i iVar) {
        if (!iVar.customAttributes_.mo43972g()) {
            iVar.customAttributes_ = iVar.customAttributes_.mo43975i();
        }
        return iVar.customAttributes_;
    }

    /* renamed from: y */
    public static void m36224y(C14530i iVar, C14526h hVar) {
        iVar.getClass();
        C14610k.C14615e<C14526h> eVar = iVar.perfSessions_;
        if (!eVar.mo44025Q0()) {
            iVar.perfSessions_ = GeneratedMessageLite.m36503q(eVar);
        }
        iVar.perfSessions_.add(hVar);
    }

    /* renamed from: z */
    public static void m36225z(C14530i iVar, List list) {
        C14610k.C14615e<C14526h> eVar = iVar.perfSessions_;
        if (!eVar.mo44025Q0()) {
            iVar.perfSessions_ = GeneratedMessageLite.m36503q(eVar);
        }
        C14583a.m36539b(list, iVar.perfSessions_);
    }

    /* renamed from: C */
    public final boolean mo43570C() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    /* renamed from: D */
    public final int mo43571D() {
        return this.counters_.size();
    }

    /* renamed from: E */
    public final Map<String, Long> mo43572E() {
        return Collections.unmodifiableMap(this.counters_);
    }

    /* renamed from: F */
    public final Map<String, String> mo43573F() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    /* renamed from: H */
    public final long mo43574H() {
        return this.durationUs_;
    }

    /* renamed from: I */
    public final String mo43575I() {
        return this.name_;
    }

    /* renamed from: J */
    public final C14610k.C14615e mo43576J() {
        return this.perfSessions_;
    }

    /* renamed from: K */
    public final C14610k.C14615e mo43577K() {
        return this.subtraces_;
    }

    /* renamed from: L */
    public final boolean mo43578L() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        Class<C14530i> cls = C14530i.class;
        switch (C14531a.f36673a[methodToInvoke.ordinal()]) {
            case 1:
                return new C14530i();
            case 2:
                return new C14532b();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C14533c.f36674a, "subtraces_", cls, "customAttributes_", C14534d.f36675a, "perfSessions_", C14526h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<C14530i> pVar = PARSER;
                if (pVar == null) {
                    synchronized (cls) {
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
}
