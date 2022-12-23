package com.umo.ads.p345h;

import bf0.C21050d;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

/* renamed from: com.umo.ads.h.zzd */
public final class zzd extends Lambda implements C24225a<C21050d> {

    /* renamed from: f */
    public static final zzd f30808f = new zzd();

    public zzd() {
        super(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r3 = this;
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a     // Catch:{ ClassNotFoundException -> 0x0008 }
            java.lang.String r1 = "Google Play Services Lib required for getting 'Advertising Id' is found."
            r0.mo6666c(r1)     // Catch:{ ClassNotFoundException -> 0x0008 }
            goto L_0x000f
        L_0x0008:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Google Play Services Lib required for getting 'Advertising Id' is missing."
            r0.mo6667d(r1)
        L_0x000f:
            android.content.Context r0 = zb0.C13364a.f33155a     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            boolean r1 = r0.isLimitAdTrackingEnabled()     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            zb0.C13364a.f33162h = r1     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            if (r1 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.String r0 = r0.getId()     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r0 = ""
        L_0x0026:
            zb0.C13364a.f33160f = r0     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            r1.<init>()     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            java.lang.String r2 = "Google Id Advertising Id: "
            r1.append(r2)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            java.lang.String r2 = zb0.C13364a.f33160f     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            r1.append(r2)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            java.lang.String r2 = ", isLimitAdTrackingEnabled : "
            r1.append(r2)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            boolean r2 = zb0.C13364a.f33162h     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            r1.append(r2)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            java.lang.String r1 = r1.toString()     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            r0.mo6672i(r1)     // Catch:{ GooglePlayServicesNotAvailableException -> 0x0074, IOException -> 0x006c, IllegalStateException -> 0x0064, GooglePlayServicesRepairableException -> 0x005c, Exception -> 0x004b }
            goto L_0x007b
        L_0x004b:
            r0 = move-exception
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r0 = r0.getLocalizedMessage()
            java.lang.String r2 = "Google Id Advertising Id: Exception: "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.mo6667d(r0)
            goto L_0x007b
        L_0x005c:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Google Id Advertising Id: GooglePlayServicesRepairableException"
            r0.mo6667d(r1)
            goto L_0x007b
        L_0x0064:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Google Id Advertising Id: IllegalStateException"
            r0.mo6667d(r1)
            goto L_0x007b
        L_0x006c:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Google Id Advertising Id: IOException"
            r0.mo6667d(r1)
            goto L_0x007b
        L_0x0074:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Google Id Advertising Id: GooglePlayServicesNotAvailableException"
            r0.mo6667d(r1)
        L_0x007b:
            bf0.d r0 = bf0.C21050d.f52856a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p345h.zzd.invoke():java.lang.Object");
    }
}
