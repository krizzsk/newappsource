package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new C2457a();

    /* renamed from: e */
    public final String f8785e = "katana_proxy_auth";

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    public static final class C2457a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new KatanaProxyLoginMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new KatanaProxyLoginMethodHandler[i];
        }
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8785e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo12612o(com.facebook.login.LoginClient.Request r35) {
        /*
            r34 = this;
            r1 = r34
            r0 = r35
            com.facebook.login.LoginBehavior r2 = r0.f8798b
            boolean r3 = p009a8.C0115o.f344n
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = com.facebook.internal.C2394e.m6288a()
            if (r3 == 0) goto L_0x0018
            boolean r2 = r2.allowsCustomTabAuth()
            if (r2 == 0) goto L_0x0018
            r2 = 1
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r6 = "init"
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0028 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "e2e.toString()"
            mf0.C24362h.m61210e(r3, r6)
            com.facebook.internal.z r6 = com.facebook.internal.C2440z.f8743a
            com.facebook.login.LoginClient r6 = r34.mo12682f()
            r6.mo12659g()
            java.lang.String r15 = r0.f8801e
            java.util.Set<java.lang.String> r14 = r0.f8799c
            boolean r22 = r35.mo12666b()
            com.facebook.login.DefaultAudience r6 = r0.f8800d
            if (r6 != 0) goto L_0x0049
            com.facebook.login.DefaultAudience r6 = com.facebook.login.DefaultAudience.NONE
        L_0x0049:
            r13 = r6
            java.lang.String r6 = r0.f8802f
            java.lang.String r23 = r1.mo12681d(r6)
            java.lang.String r12 = r0.f8805i
            java.lang.String r11 = r0.f8807k
            boolean r10 = r0.f8808l
            boolean r9 = r0.f8810n
            boolean r8 = r0.f8811o
            java.lang.String r7 = r0.f8812p
            com.facebook.login.CodeChallengeMethod r0 = r0.f8815s
            r24 = 0
            if (r0 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r0.name()
        L_0x0066:
            java.lang.Class<com.facebook.internal.z> r6 = com.facebook.internal.C2440z.class
            boolean r0 = p262t8.C6606a.m15601b(r6)
            if (r0 == 0) goto L_0x0070
            goto L_0x00f3
        L_0x0070:
            java.lang.String r0 = "applicationId"
            mf0.C24362h.m61211f(r15, r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "permissions"
            mf0.C24362h.m61211f(r14, r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "defaultAudience"
            mf0.C24362h.m61211f(r13, r0)     // Catch:{ all -> 0x00ee }
            java.lang.String r0 = "authType"
            mf0.C24362h.m61211f(r12, r0)     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r0 = com.facebook.internal.C2440z.f8744b     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00ee }
            r5.<init>()     // Catch:{ all -> 0x00ee }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ee }
        L_0x008f:
            boolean r16 = r0.hasNext()     // Catch:{ all -> 0x00ee }
            if (r16 == 0) goto L_0x00eb
            java.lang.Object r16 = r0.next()     // Catch:{ all -> 0x00ee }
            com.facebook.internal.z$e r16 = (com.facebook.internal.C2440z.C2445e) r16     // Catch:{ all -> 0x00ee }
            com.facebook.internal.z r17 = com.facebook.internal.C2440z.f8743a     // Catch:{ all -> 0x00ee }
            com.facebook.login.LoginTargetApp r18 = com.facebook.login.LoginTargetApp.FACEBOOK     // Catch:{ all -> 0x00ee }
            r4 = r6
            r6 = r17
            r25 = r7
            r7 = r16
            r26 = r8
            r8 = r15
            r27 = r9
            r9 = r14
            r28 = r10
            r10 = r3
            r29 = r11
            r11 = r22
            r30 = r12
            r12 = r13
            r31 = r13
            r13 = r23
            r32 = r14
            r14 = r30
            r33 = r15
            r15 = r2
            r16 = r29
            r17 = r28
            r19 = r27
            r20 = r26
            r21 = r25
            android.content.Intent r6 = r6.mo12599d(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x00d7
            r5.add(r6)     // Catch:{ all -> 0x00d5 }
            goto L_0x00d7
        L_0x00d5:
            r0 = move-exception
            goto L_0x00f0
        L_0x00d7:
            r6 = r4
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            goto L_0x008f
        L_0x00eb:
            r24 = r5
            goto L_0x00f3
        L_0x00ee:
            r0 = move-exception
            r4 = r6
        L_0x00f0:
            p262t8.C6606a.m15600a(r4, r0)
        L_0x00f3:
            java.lang.String r0 = "e2e"
            r1.mo12680b(r3, r0)
            java.util.Iterator r0 = r24.iterator()
            r2 = 0
        L_0x00fd:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0117
            r3 = 1
            int r2 = r2 + r3
            java.lang.Object r4 = r0.next()
            android.content.Intent r4 = (android.content.Intent) r4
            com.facebook.internal.CallbackManagerImpl$RequestCodeOffset r5 = com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Login
            r5.toRequestCode()
            boolean r4 = r1.mo12689u(r4)
            if (r4 == 0) goto L_0x00fd
            return r2
        L_0x0117:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.KatanaProxyLoginMethodHandler.mo12612o(com.facebook.login.LoginClient$Request):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "source");
    }
}
