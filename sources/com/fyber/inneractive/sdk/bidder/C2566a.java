package com.fyber.inneractive.sdk.bidder;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C2628d0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.fyber.inneractive.sdk.serverapi.C3657b;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.bidder.a */
public class C2566a implements C2588d, C2628d0.C2629a {

    /* renamed from: h */
    public static final C2566a f9066h = new C2566a();

    /* renamed from: a */
    public final TokenParametersOuterClass$TokenParameters.C2553b f9067a;

    /* renamed from: b */
    public final C3657b f9068b;

    /* renamed from: c */
    public final C2586c f9069c;

    /* renamed from: d */
    public C2589e f9070d;

    /* renamed from: e */
    public final Map<String, String> f9071e = new C2567a(this);

    /* renamed from: f */
    public final AtomicReference<String> f9072f = new AtomicReference<>((Object) null);

    /* renamed from: g */
    public final AtomicBoolean f9073g = new AtomicBoolean(false);

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$a */
    public class C2567a extends HashMap<String, String> {
        public C2567a(C2566a aVar) {
            put(InneractiveMediationNameConsts.MAX, "token_size_limit_max");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$b */
    public class C2568b implements Runnable {
        public C2568b() {
        }

        public void run() {
            C2566a.this.mo13015a();
        }
    }

    public C2566a() {
        C3657b bVar = new C3657b(C2666s.m6734b());
        this.f9068b = bVar;
        C2586c cVar = new C2586c(bVar);
        this.f9069c = cVar;
        this.f9067a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager.m6633c().mo13212a((C2628d0.C2629a) this);
        mo13018c();
        if (IAConfigManager.m6632b().mo13276a().mo13273a("bidding_token_wait_for_ua", true)) {
            IAConfigManager.m6634d().mo15379d();
            cVar.mo13161a(IAConfigManager.m6634d().mo15375a());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0548, code lost:
        if (r8.equals("3") == false) goto L_0x0540;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13015a() {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f9073g
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0653
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            MessageType r3 = r0.f12365b
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e r4 = com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3469e.NEW_MUTABLE_INSTANCE
            java.lang.Object r3 = r3.dynamicMethod(r4)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r3 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r3
            r0.f12365b = r3
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            r3.getClass()
            java.lang.String r3 = "1.2"
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setVersion(r3)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = r15.f9072f
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x003c
            com.fyber.inneractive.sdk.bidder.c r0 = r15.f9069c
            r0.mo13160a()
        L_0x003c:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9128b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setUserAgent(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9129c
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setSdkVersion(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9130d
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setBundleID(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9131e
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setDeviceModel(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9132f
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setAppVersion(r3)
            java.lang.String r3 = "Android"
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setDeviceOS(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setDeviceApi(r3)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setOsVersion(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9133g
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setDeviceLanguage(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9134h
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setCountryCode(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9135i
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setCarrierName(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9136j
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setMobileCountryCode(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9137k
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setMobileNetworkCode(r3)
            boolean r3 = com.fyber.inneractive.sdk.config.C2672k.m6751c()
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setDnt(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            int r3 = r3.f9138l
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setTotalSpace(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.Long r3 = r3.f9139m
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableSInt32$a r4 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder()
            if (r3 == 0) goto L_0x015a
            int r3 = r3.intValue()
            r4.mo14761c()
            MessageType r5 = r4.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableSInt32 r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) r5
            r5.setData(r3)
        L_0x015a:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r3 = r4.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableSInt32 r3 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableSInt32) r3
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setOffsetFromGMT(r3)
            java.lang.String r3 = com.fyber.inneractive.sdk.config.IAConfigManager.m6635e()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r4 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r4
            r4.setUserID(r3)
            com.fyber.inneractive.sdk.config.IAConfigManager r3 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.d r4 = r3.f9207D
            r4.getClass()
            android.app.Application r5 = com.fyber.inneractive.sdk.util.C3707l.f12893a
            r6 = 0
            if (r5 != 0) goto L_0x018a
            r4 = r6
            goto L_0x018c
        L_0x018a:
            java.lang.String r4 = r4.f9272b
        L_0x018c:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setGdprString(r4)
            com.fyber.inneractive.sdk.config.d r4 = r3.f9207D
            java.lang.Boolean r4 = r4.mo13205a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setGdprConsent(r4)
            com.fyber.inneractive.sdk.config.d r4 = r3.f9207D
            r4.getClass()
            android.app.Application r5 = com.fyber.inneractive.sdk.util.C3707l.f12893a
            if (r5 != 0) goto L_0x01b9
            r4 = r6
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r4 = r4.f9275e
        L_0x01bb:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setCcpaString(r4)
            com.fyber.inneractive.sdk.config.d r4 = r3.f9207D
            r4.getClass()
            android.app.Application r5 = com.fyber.inneractive.sdk.util.C3707l.f12893a
            if (r5 != 0) goto L_0x01d4
            r4 = r6
            goto L_0x01d6
        L_0x01d4:
            java.lang.Boolean r4 = r4.f9276f
        L_0x01d6:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setLgpdConsent(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            int r4 = r4.f9140n
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setDeviceWidth(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            int r4 = r4.f9141o
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setDeviceHeight(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$d r4 = r4.f9142p
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setFrameworkName(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.String r4 = r4.f9143q
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setInputLanguages(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.String r4 = r4.f9126L
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r4)
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setMediationType(r4)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.String r4 = r4.f9144r
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setNetwork(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$h r4 = r4.f9145s
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setSecureContent(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9119E
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setBatteryCharging(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9146t
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setHeadsetPlugged(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9147u
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setBluetoothPlugged(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9148v
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setLowPowerMode(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            boolean r4 = r4.f9149w
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setDarkMode(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9150x
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setAirplaneMode(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9151y
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setDndMode(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Boolean r4 = r4.f9152z
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setIsRingMuted(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            int r4 = r4.f9115A
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setSessionDuration(r4)
            com.fyber.inneractive.sdk.serverapi.b r4 = r15.f9068b
            java.lang.String r4 = r4.mo15307d()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6594a((java.lang.String) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setLatitude(r4)
            com.fyber.inneractive.sdk.serverapi.b r4 = r15.f9068b
            java.lang.String r4 = r4.mo15308e()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6594a((java.lang.String) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setLongitude(r4)
            com.fyber.inneractive.sdk.serverapi.b r4 = r15.f9068b
            java.lang.String r4 = r4.mo15306c()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6594a((java.lang.String) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setHorAccuracy(r4)
            com.fyber.inneractive.sdk.serverapi.b r4 = r15.f9068b
            java.lang.String r4 = r4.mo15310g()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6594a((java.lang.String) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setVerAccuracy(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.String r4 = r4.f9116B
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableFloat r4 = com.fyber.inneractive.sdk.bidder.C2590f.m6594a((java.lang.String) r4)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setTimeAccuracy(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.String r4 = r4.f9120F
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32$a r5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder()
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L_0x0371
            int r4 = java.lang.Integer.parseInt(r4)
            r5.mo12990a(r4)
        L_0x0371:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r4 = r5.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) r4
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setBatteryLevel(r4)
            com.fyber.inneractive.sdk.bidder.c r4 = r15.f9069c
            java.lang.Long r4 = r4.f9117C
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32$a r5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder()
            if (r4 == 0) goto L_0x0392
            int r4 = r4.intValue()
            r5.mo12990a(r4)
        L_0x0392:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r4 = r5.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) r4
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setFreeSpace(r4)
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r4 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL
            com.fyber.inneractive.sdk.config.d0 r3 = r3.f9236x
            java.lang.String r5 = "LAST_VAST_SKIPED"
            java.lang.String r3 = r3.mo13209a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r4, (java.lang.String) r5)
            java.lang.String r4 = "1"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableBool r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6593a((java.lang.Boolean) r3)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setPriorSkip(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9121G
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setKeywords(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            int r3 = r3.f9122H
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6595a((int) r3)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setUserAge(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            com.fyber.inneractive.sdk.external.InneractiveUserConfig$Gender r3 = r3.f9123I
            com.fyber.inneractive.sdk.external.InneractiveUserConfig$Gender r5 = com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.FEMALE
            if (r3 != r5) goto L_0x03f3
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$l r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2563l.FEMALE
            goto L_0x03fc
        L_0x03f3:
            com.fyber.inneractive.sdk.external.InneractiveUserConfig$Gender r5 = com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.MALE
            if (r3 != r5) goto L_0x03fa
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$l r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2563l.MALE
            goto L_0x03fc
        L_0x03fa:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$l r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2563l.UNKNOWN
        L_0x03fc:
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setUserGender(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9125K
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r5 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r5
            r5.setZipCode(r3)
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            boolean r3 = r3.f9124J
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setMuteAudio(r3)
            boolean r0 = com.fyber.inneractive.sdk.config.C2672k.m6750b()
            if (r0 == 0) goto L_0x0441
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9118D
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setAmazonId(r3)
            goto L_0x0455
        L_0x0441:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.c r3 = r15.f9069c
            java.lang.String r3 = r3.f9118D
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r3 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r3)
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setAaid(r3)
        L_0x0455:
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
            int r3 = r0.length
            r5 = 0
        L_0x045b:
            r7 = 2
            if (r5 >= r3) goto L_0x0594
            r8 = r0[r5]
            boolean r9 = r8.isDeprecated()
            if (r9 != 0) goto L_0x0590
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k r9 = com.fyber.inneractive.sdk.bidder.C2590f.m6596a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r10 = com.fyber.inneractive.sdk.serverapi.C3655a.f12779a
            com.fyber.inneractive.sdk.config.IAConfigManager r10 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.d0 r11 = r10.f9236x
            java.lang.String r12 = "LAST_DOMAIN_SHOWED"
            java.lang.String r11 = r11.mo13209a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8, (java.lang.String) r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x048a
            java.lang.String r12 = ","
            boolean r13 = r11.contains(r12)
            if (r13 == 0) goto L_0x048a
            java.lang.String[] r11 = r11.split(r12)
            r11 = r11[r1]
        L_0x048a:
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x04ba
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r12 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdomain$a r13 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder()
            r13.mo14761c()
            MessageType r14 = r13.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdomain r14 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) r14
            r14.setAdomain(r11)
            r13.mo14761c()
            MessageType r11 = r13.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdomain r11 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) r11
            r11.setType(r9)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r11 = r13.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdomain r11 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdomain) r11
            r12.mo14761c()
            MessageType r12 = r12.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r12 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r12
            r12.addLastAdomains(r11)
        L_0x04ba:
            com.fyber.inneractive.sdk.config.d0 r11 = r10.f9236x
            java.lang.String r12 = "LAST_APP_BUNDLE_ID"
            java.lang.String r11 = r11.mo13209a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8, (java.lang.String) r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x04f2
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r12 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdvertisedBundle$a r13 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder()
            r13.mo14761c()
            MessageType r14 = r13.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdvertisedBundle r14 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) r14
            r14.setLastBundle(r11)
            r13.mo14761c()
            MessageType r11 = r13.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdvertisedBundle r11 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) r11
            r11.setType(r9)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r11 = r13.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$LastAdvertisedBundle r11 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) r11
            r12.mo14761c()
            MessageType r12 = r12.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r12 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r12
            r12.addLastAdvertisedBundles(r11)
        L_0x04f2:
            com.fyber.inneractive.sdk.config.d0 r11 = r10.f9236x
            java.lang.String r12 = "LAST_CLICKED"
            java.lang.String r11 = r11.mo13209a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8, (java.lang.String) r12)
            boolean r11 = android.text.TextUtils.equals(r11, r4)
            if (r11 == 0) goto L_0x0510
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r11 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k r12 = com.fyber.inneractive.sdk.bidder.C2590f.m6596a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8)
            r11.mo14761c()
            MessageType r11 = r11.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r11 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r11
            r11.addPriorClicks(r12)
        L_0x0510:
            java.lang.String r11 = "display"
            r15.mo13016a(r11, r8, r9)
            boolean r11 = r8.isFullscreenUnit()
            if (r11 == 0) goto L_0x0590
            java.lang.String r11 = "video"
            r15.mo13016a(r11, r8, r9)
            com.fyber.inneractive.sdk.config.d0 r10 = r10.f9236x
            java.lang.String r11 = "LAST_VAST_CLICKED_TYPE"
            java.lang.String r8 = r10.mo13209a((com.fyber.inneractive.sdk.config.enums.UnitDisplayType) r8, (java.lang.String) r11)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 != 0) goto L_0x0590
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r10 = r15.f9067a
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$PriorVideoClickType$a r11 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder()
            r8.getClass()
            r12 = -1
            int r13 = r8.hashCode()
            switch(r13) {
                case 49: goto L_0x0556;
                case 50: goto L_0x054b;
                case 51: goto L_0x0542;
                default: goto L_0x0540;
            }
        L_0x0540:
            r7 = -1
            goto L_0x055e
        L_0x0542:
            java.lang.String r13 = "3"
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x055e
            goto L_0x0540
        L_0x054b:
            java.lang.String r7 = "2"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0554
            goto L_0x0540
        L_0x0554:
            r7 = 1
            goto L_0x055e
        L_0x0556:
            boolean r7 = r8.equals(r4)
            if (r7 != 0) goto L_0x055d
            goto L_0x0540
        L_0x055d:
            r7 = 0
        L_0x055e:
            switch(r7) {
                case 0: goto L_0x056a;
                case 1: goto L_0x0567;
                case 2: goto L_0x0564;
                default: goto L_0x0561;
            }
        L_0x0561:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$n r7 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2565n.NOCLICK
            goto L_0x056c
        L_0x0564:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$n r7 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2565n.VIDEOVIEW
            goto L_0x056c
        L_0x0567:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$n r7 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2565n.COMPANION
            goto L_0x056c
        L_0x056a:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$n r7 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2565n.CTABUTTON
        L_0x056c:
            r11.mo14761c()
            MessageType r8 = r11.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$PriorVideoClickType r8 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) r8
            r8.setClickType(r7)
            r11.mo14761c()
            MessageType r7 = r11.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$PriorVideoClickType r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) r7
            r7.setType(r9)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r7 = r11.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$PriorVideoClickType r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.PriorVideoClickType) r7
            r10.mo14761c()
            MessageType r8 = r10.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r8 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r8
            r8.addPriorClickTypes(r7)
        L_0x0590:
            int r5 = r5 + 1
            goto L_0x045b
        L_0x0594:
            com.fyber.inneractive.sdk.serverapi.b r0 = r15.f9068b
            r0.getClass()
            com.fyber.inneractive.sdk.config.global.s r2 = new com.fyber.inneractive.sdk.config.global.s
            r2.<init>()
            r0.f12784a = r2
            java.lang.String r0 = ""
            r2.mo13267a((java.lang.String) r0)
            com.fyber.inneractive.sdk.serverapi.b r0 = r15.f9068b
            com.fyber.inneractive.sdk.config.global.s r0 = r0.f12784a
            if (r0 == 0) goto L_0x05af
            org.json.JSONArray r6 = r0.mo13269d()
        L_0x05af:
            if (r6 == 0) goto L_0x05f8
            r0 = 0
        L_0x05b2:
            int r2 = r6.length()
            if (r0 >= r2) goto L_0x05f8
            org.json.JSONObject r2 = r6.optJSONObject(r0)
            if (r2 == 0) goto L_0x05f5
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$Experiment$a r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment.newBuilder()
            java.lang.String r4 = "id"
            java.lang.String r4 = r2.optString(r4)
            r3.mo14761c()
            MessageType r5 = r3.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$Experiment r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) r5
            r5.setIdentifier(r4)
            java.lang.String r4 = "v"
            java.lang.String r2 = r2.optString(r4)
            r3.mo14761c()
            MessageType r4 = r3.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$Experiment r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) r4
            r4.setVariant(r2)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r2 = r15.f9067a
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r3 = r3.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$Experiment r3 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.Experiment) r3
            r2.mo14761c()
            MessageType r2 = r2.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r2 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r2
            r2.addAbExperiments(r3)
        L_0x05f5:
            int r0 = r0 + 1
            goto L_0x05b2
        L_0x05f8:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            int r2 = com.fyber.inneractive.sdk.config.C2630e.f9283a
            java.lang.String r2 = "ia.testEnvironmentConfiguration.number"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32$a r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x0613
            int r2 = java.lang.Integer.parseInt(r2)
            r3.mo12990a(r2)
        L_0x0613:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r2 = r3.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableUInt32 r2 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.NullableUInt32) r2
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setPortal(r2)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            java.lang.String r2 = "ia.testEnvironmentConfiguration.response"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$NullableString r2 = com.fyber.inneractive.sdk.bidder.C2590f.m6598c(r2)
            r0.mo14761c()
            MessageType r0 = r0.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            r0.setMockResponseId(r2)
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r0 = r15.f9067a
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r0 = r0.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r0 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r0
            byte[] r0 = r0.toByteArray()
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = r15.f9072f
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r7)
            r2.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.f9073g
            r0.set(r1)
        L_0x0653:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C2566a.mo13015a():void");
    }

    /* renamed from: b */
    public void mo13017b() {
        C3714n.m9976a(new C2568b());
    }

    /* renamed from: c */
    public final void mo13018c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C3707l.f12893a.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            connectivityManager.registerDefaultNetworkCallback(new C2585b(this));
        }
        C2589e eVar = new C2589e(this);
        this.f9070d = eVar;
        C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i >= 23) {
            C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        if (C3707l.m9966b("android.permission.BLUETOOTH")) {
            C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            C3707l.f12893a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13016a(java.lang.String r9, com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2562k r11) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.d0 r0 = r0.f9236x
            com.fyber.inneractive.sdk.cache.session.d r0 = r0.f9278a
            if (r0 == 0) goto L_0x00e8
            java.lang.String r10 = r10.value()
            java.util.HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, com.fyber.inneractive.sdk.cache.session.h> r1 = r0.f9176b
            com.fyber.inneractive.sdk.cache.session.enums.b r10 = com.fyber.inneractive.sdk.cache.session.enums.C2608b.m6628a(r10, r9)
            java.lang.Object r10 = r1.get(r10)
            com.fyber.inneractive.sdk.cache.session.h r10 = (com.fyber.inneractive.sdk.cache.session.C2613h) r10
            r1 = 0
            if (r10 == 0) goto L_0x002e
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r10)
            com.fyber.inneractive.sdk.cache.session.g r4 = new com.fyber.inneractive.sdk.cache.session.g
            r4.<init>(r10)
            java.util.Collections.sort(r3, r4)
            r2.<init>(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r10 = r0.mo13176a()
            if (r10 <= 0) goto L_0x00d0
            if (r2 == 0) goto L_0x00d0
            int r0 = r2.size()
            if (r0 < r10) goto L_0x00d0
            java.lang.String r0 = "video"
            boolean r1 = r9.equals(r0)
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = "display"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0051
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2561j.UNITCONTENTTYPEUNKNOWN
            goto L_0x0056
        L_0x0051:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2561j.DISPLAY
            goto L_0x0056
        L_0x0054:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2561j.VIDEO
        L_0x0056:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession$a r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.newBuilder()
            r3.mo14761c()
            MessageType r4 = r3.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r4
            r4.setSubType(r1)
            r1 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r2.next()
            com.fyber.inneractive.sdk.cache.session.e r4 = (com.fyber.inneractive.sdk.cache.session.C2606e) r4
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData$a r5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.newBuilder()
            int r6 = r4.f9181b
            r5.mo14761c()
            MessageType r7 = r5.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setClicks(r6)
            int r6 = r4.f9180a
            r5.mo14761c()
            MessageType r7 = r5.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setImpressions(r6)
            boolean r6 = r9.equals(r0)
            if (r6 != 0) goto L_0x009f
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k r6 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C2562k.REWARDED
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00ab
        L_0x009f:
            int r4 = r4.f9182c
            r5.mo14761c()
            MessageType r6 = r5.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r6 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r6
            r6.setCompletions(r4)
        L_0x00ab:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r4 = r5.mo14758a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r4
            r3.mo14761c()
            MessageType r5 = r3.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r5
            r5.addSessionDataItems(r4)
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0069
        L_0x00bf:
            r3.mo14761c()
            MessageType r9 = r3.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r9
            r9.setType(r11)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r9 = r3.mo14758a()
            r1 = r9
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r1 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r1
        L_0x00d0:
            if (r1 == 0) goto L_0x00e8
            java.util.List r9 = r1.getSessionDataItemsList()
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x00e8
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r9 = r8.f9067a
            r9.mo14761c()
            MessageType r9 = r9.f12365b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r9
            r9.addUserSessions(r1)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C2566a.mo13016a(java.lang.String, com.fyber.inneractive.sdk.config.enums.UnitDisplayType, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k):void");
    }
}
