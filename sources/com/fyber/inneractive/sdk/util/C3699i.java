package com.fyber.inneractive.sdk.util;

/* renamed from: com.fyber.inneractive.sdk.util.i */
public class C3699i {

    /* renamed from: a */
    public static boolean f12879a = false;

    /* renamed from: b */
    public static Boolean f12880b;

    /* renamed from: com.fyber.inneractive.sdk.util.i$a */
    public interface C3700a {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (com.google.android.gms.common.GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(r3) == 0) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9941a(android.content.Context r3, com.fyber.inneractive.sdk.util.C3699i.C3700a r4) {
        /*
            java.lang.Boolean r0 = f12880b
            if (r0 != 0) goto L_0x0033
            r0 = 1
            int r1 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE     // Catch:{ all -> 0x000c }
            com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api$ApiOptions$NoOptions> r1 = com.google.android.gms.location.LocationServices.API     // Catch:{ all -> 0x000c }
            f12879a = r0     // Catch:{ all -> 0x000c }
            goto L_0x000d
        L_0x000c:
        L_0x000d:
            boolean r1 = f12879a
            if (r1 == 0) goto L_0x002f
            r1 = 0
            com.google.android.gms.common.GoogleApiAvailability r2 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ all -> 0x001d }
            int r2 = r2.isGooglePlayServicesAvailable(r3)     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0027
            goto L_0x0028
        L_0x001d:
            r0 = move-exception
            java.lang.String r0 = com.fyber.inneractive.sdk.util.C3727s.m9990a((java.lang.Throwable) r0)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r0, r2)
        L_0x0027:
            r0 = 0
        L_0x0028:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            f12880b = r0
            goto L_0x0033
        L_0x002f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            f12880b = r0
        L_0x0033:
            java.lang.Boolean r0 = f12880b
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.fyber.inneractive.sdk.util.C3707l.m9966b((java.lang.String) r0)
            if (r0 == 0) goto L_0x005b
        L_0x004b:
            com.google.android.gms.location.FusedLocationProviderClient r3 = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient((android.content.Context) r3)     // Catch:{ all -> 0x005b }
            com.google.android.gms.tasks.Task r3 = r3.getLastLocation()     // Catch:{ all -> 0x005b }
            com.fyber.inneractive.sdk.util.h r0 = new com.fyber.inneractive.sdk.util.h     // Catch:{ all -> 0x005b }
            r0.<init>(r4)     // Catch:{ all -> 0x005b }
            r3.addOnSuccessListener(r0)     // Catch:{ all -> 0x005b }
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3699i.m9941a(android.content.Context, com.fyber.inneractive.sdk.util.i$a):void");
    }
}
