package com.google.firebase.perf.p414v1;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.C14583a;
import com.google.protobuf.C14610k;
import com.google.protobuf.C14625q;
import com.google.protobuf.C14635y;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;
import java.util.List;
import p911xg.C20505m;
import p911xg.C20508p;
import p911xg.C20511s;

/* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, C14496b> implements C20505m {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile C20508p<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f36812b;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C14610k.C14615e<C14526h> perfSessions_ = C14635y.f36900e;
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod */
    public enum HttpMethod implements C14610k.C14611a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final C14610k.C14612b<HttpMethod> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$a */
        public class C14491a implements C14610k.C14612b<HttpMethod> {
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$b */
        public static final class C14492b implements C14610k.C14613c {

            /* renamed from: a */
            public static final C14492b f36657a = null;

            static {
                f36657a = new C14492b();
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C14491a();
        }

        private HttpMethod(int i) {
            this.value = i;
        }

        public static HttpMethod forNumber(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static C14610k.C14612b<HttpMethod> internalGetValueMap() {
            return internalValueMap;
        }

        public static C14610k.C14613c internalGetVerifier() {
            return C14492b.f36657a;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static HttpMethod valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason */
    public enum NetworkClientErrorReason implements C14610k.C14611a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final C14610k.C14612b<NetworkClientErrorReason> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$a */
        public class C14493a implements C14610k.C14612b<NetworkClientErrorReason> {
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$b */
        public static final class C14494b implements C14610k.C14613c {

            /* renamed from: a */
            public static final C14494b f36658a = null;

            static {
                f36658a = new C14494b();
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C14493a();
        }

        private NetworkClientErrorReason(int i) {
            this.value = i;
        }

        public static NetworkClientErrorReason forNumber(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static C14610k.C14612b<NetworkClientErrorReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static C14610k.C14613c internalGetVerifier() {
            return C14494b.f36658a;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static NetworkClientErrorReason valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$a */
    public static /* synthetic */ class C14495a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36659a;

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
                f36659a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36659a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p414v1.NetworkRequestMetric.C14495a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$b */
    public static final class C14496b extends GeneratedMessageLite.C14572a<NetworkRequestMetric, C14496b> implements C20505m {
        public C14496b() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$c */
    public static final class C14497c {

        /* renamed from: a */
        public static final C14625q<String, String> f36660a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36660a = new C14625q<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.m36504r(NetworkRequestMetric.class, networkRequestMetric);
    }

    /* renamed from: A */
    public static void m36093A(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 512;
        networkRequestMetric.timeToResponseInitiatedUs_ = j;
    }

    /* renamed from: B */
    public static void m36094B(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 1024;
        networkRequestMetric.timeToResponseCompletedUs_ = j;
    }

    /* renamed from: C */
    public static void m36095C(NetworkRequestMetric networkRequestMetric, List list) {
        C14610k.C14615e<C14526h> eVar = networkRequestMetric.perfSessions_;
        if (!eVar.mo44025Q0()) {
            networkRequestMetric.perfSessions_ = GeneratedMessageLite.m36503q(eVar);
        }
        C14583a.m36539b(list, networkRequestMetric.perfSessions_);
    }

    /* renamed from: D */
    public static void m36096D(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
        networkRequestMetric.getClass();
        networkRequestMetric.httpMethod_ = httpMethod.getNumber();
        networkRequestMetric.bitField0_ |= 2;
    }

    /* renamed from: E */
    public static void m36097E(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 4;
        networkRequestMetric.requestPayloadBytes_ = j;
    }

    /* renamed from: F */
    public static void m36098F(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 8;
        networkRequestMetric.responsePayloadBytes_ = j;
    }

    /* renamed from: H */
    public static NetworkRequestMetric m36099H() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Z */
    public static C14496b m36100Z() {
        return (C14496b) DEFAULT_INSTANCE.mo43950m();
    }

    /* renamed from: t */
    public static void m36102t(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 1;
        networkRequestMetric.url_ = str;
    }

    /* renamed from: u */
    public static void m36103u(NetworkRequestMetric networkRequestMetric, NetworkClientErrorReason networkClientErrorReason) {
        networkRequestMetric.getClass();
        networkRequestMetric.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        networkRequestMetric.bitField0_ |= 16;
    }

    /* renamed from: v */
    public static void m36104v(NetworkRequestMetric networkRequestMetric, int i) {
        networkRequestMetric.bitField0_ |= 32;
        networkRequestMetric.httpResponseCode_ = i;
    }

    /* renamed from: w */
    public static void m36105w(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 64;
        networkRequestMetric.responseContentType_ = str;
    }

    /* renamed from: x */
    public static void m36106x(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.bitField0_ &= -65;
        networkRequestMetric.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    /* renamed from: y */
    public static void m36107y(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= RecyclerView.C1119a0.FLAG_IGNORE;
        networkRequestMetric.clientStartTimeUs_ = j;
    }

    /* renamed from: z */
    public static void m36108z(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 256;
        networkRequestMetric.timeToRequestCompletedUs_ = j;
    }

    /* renamed from: G */
    public final long mo43528G() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: I */
    public final HttpMethod mo43529I() {
        HttpMethod forNumber = HttpMethod.forNumber(this.httpMethod_);
        if (forNumber == null) {
            return HttpMethod.HTTP_METHOD_UNKNOWN;
        }
        return forNumber;
    }

    /* renamed from: J */
    public final int mo43530J() {
        return this.httpResponseCode_;
    }

    /* renamed from: K */
    public final C14610k.C14615e mo43531K() {
        return this.perfSessions_;
    }

    /* renamed from: L */
    public final long mo43532L() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: M */
    public final long mo43533M() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: N */
    public final long mo43534N() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: O */
    public final long mo43535O() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: P */
    public final long mo43536P() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: Q */
    public final String mo43537Q() {
        return this.url_;
    }

    /* renamed from: R */
    public final boolean mo43538R() {
        return (this.bitField0_ & RecyclerView.C1119a0.FLAG_IGNORE) != 0;
    }

    /* renamed from: S */
    public final boolean mo43539S() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: T */
    public final boolean mo43540T() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: U */
    public final boolean mo43541U() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: V */
    public final boolean mo43542V() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: W */
    public final boolean mo43543W() {
        return (this.bitField0_ & 256) != 0;
    }

    /* renamed from: X */
    public final boolean mo43544X() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: Y */
    public final boolean mo43545Y() {
        return (this.bitField0_ & 512) != 0;
    }

    /* renamed from: n */
    public final Object mo43546n(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C14495a.f36659a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new C14496b();
            case 3:
                return new C20511s(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.internalGetVerifier(), "customAttributes_", C14497c.f36660a, "perfSessions_", C14526h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C20508p<NetworkRequestMetric> pVar = PARSER;
                if (pVar == null) {
                    synchronized (NetworkRequestMetric.class) {
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
