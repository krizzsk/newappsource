package com.appsflyer;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

public class AdvertisingIdUtil {
    public static String $$a = null;
    public static final String AMAZON_MANUFACTURER = "Amazon";

    public static AdvertisingIdObject getAmazonAID(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || AppsFlyerProperties.getInstance().getString(ServerParameters.AMAZON_AID) != null || !AMAZON_MANUFACTURER.equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            return new AdvertisingIdObject(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i == 2) {
            return null;
        }
        try {
            str = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
            str = "";
        }
        return new AdvertisingIdObject(str, Boolean.TRUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r8.length() == 0) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f A[SYNTHETIC, Splitter:B:31:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.AdvertisingIdObject getGaid(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "advertiserIdEnabled"
            java.lang.String r1 = "advertiserId"
            java.lang.String r2 = "Trying to fetch GAID.."
            com.appsflyer.AFLogger.afInfoLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch:{ all -> 0x0017 }
            int r3 = r3.isGooglePlayServicesAvailable(r12)     // Catch:{ all -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r3 = -1
        L_0x0018:
            r4 = 0
            r5 = 1
            r6 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r12)     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x0047
            java.lang.String r8 = r7.getId()     // Catch:{ all -> 0x0054 }
            boolean r7 = r7.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0043 }
            if (r8 == 0) goto L_0x0035
            int r6 = r8.length()     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x003a
        L_0x0035:
            java.lang.String r6 = "emptyOrNull |"
            r2.append(r6)     // Catch:{ all -> 0x003d }
        L_0x003a:
            r6 = 1
            goto L_0x00e7
        L_0x003d:
            r6 = move-exception
            r7 = r6
            r6 = r4
            r4 = r8
            r8 = 1
            goto L_0x0057
        L_0x0043:
            r7 = move-exception
            r6 = r4
            r4 = r8
            goto L_0x0056
        L_0x0047:
            java.lang.String r7 = "gpsAdInfo-null |"
            r2.append(r7)     // Catch:{ all -> 0x0054 }
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0054 }
            java.lang.String r8 = "GpsAdIndo is null"
            r7.<init>(r8)     // Catch:{ all -> 0x0054 }
            throw r7     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r7 = move-exception
            r6 = r4
        L_0x0056:
            r8 = 0
        L_0x0057:
            java.lang.String r9 = r7.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r9, r7)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r2.append(r7)
            java.lang.String r7 = " |"
            r2.append(r7)
            java.lang.String r9 = "WARNING: Google Play Services is missing."
            com.appsflyer.AFLogger.afInfoLog(r9)
            com.appsflyer.AppsFlyerProperties r9 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r10 = "enableGpsFallback"
            boolean r9 = r9.getBoolean(r10, r5)
            if (r9 == 0) goto L_0x00e3
            com.appsflyer.internal.p$c r4 = com.appsflyer.internal.C2085p.values(r12)     // Catch:{ all -> 0x009b }
            java.lang.String r6 = r4.valueOf     // Catch:{ all -> 0x009b }
            boolean r4 = r4.$$b()     // Catch:{ all -> 0x009b }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x0095
            int r9 = r6.length()     // Catch:{ all -> 0x009b }
            if (r9 != 0) goto L_0x00e0
        L_0x0095:
            java.lang.String r9 = "emptyOrNull (bypass) |"
            r2.append(r9)     // Catch:{ all -> 0x009b }
            goto L_0x00e0
        L_0x009b:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r6, r4)
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            r2.append(r7)
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r6 = r6.getString(r1)
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r7 = r7.getString(r0)
            boolean r7 = java.lang.Boolean.parseBoolean(r7)
            r7 = r7 ^ r5
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            java.lang.String r9 = r4.getLocalizedMessage()
            if (r9 == 0) goto L_0x00d8
            java.lang.String r4 = r4.getLocalizedMessage()
            com.appsflyer.AFLogger.afInfoLog(r4)
            goto L_0x00df
        L_0x00d8:
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afInfoLog(r4)
        L_0x00df:
            r4 = r7
        L_0x00e0:
            r11 = r8
            r8 = r6
            goto L_0x00e6
        L_0x00e3:
            r11 = r8
            r8 = r4
            r4 = r6
        L_0x00e6:
            r6 = r11
        L_0x00e7:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r7 = "android.app.ReceiverRestrictedContext"
            boolean r12 = r12.equals(r7)
            if (r12 == 0) goto L_0x0115
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r12.getString(r1)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r12 = r12.getString(r0)
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            r12 = r12 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r12)
            java.lang.String r12 = "context = android.app.ReceiverRestrictedContext |"
            r2.append(r12)
        L_0x0115:
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x0134
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r3 = ": "
            r12.append(r3)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "gaidError"
            r13.put(r2, r12)
        L_0x0134:
            if (r8 == 0) goto L_0x0167
            if (r4 == 0) goto L_0x0167
            r13.put(r1, r8)
            boolean r12 = r4.booleanValue()
            r12 = r12 ^ r5
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13.put(r0, r12)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            r12.set((java.lang.String) r1, (java.lang.String) r8)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r1 = r4.booleanValue()
            r1 = r1 ^ r5
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.set((java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "isGaidWithGps"
            r13.put(r0, r12)
        L_0x0167:
            com.appsflyer.AdvertisingIdObject r12 = new com.appsflyer.AdvertisingIdObject
            r12.<init>(r8, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AdvertisingIdUtil.getGaid(android.content.Context, java.util.Map):com.appsflyer.AdvertisingIdObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.AdvertisingIdObject getOaid(android.content.Context r5) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = $$a
            r2 = 1
            if (r1 == 0) goto L_0x000b
            r3 = 1
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = 0
            if (r3 == 0) goto L_0x0011
        L_0x000f:
            r5 = r4
            goto L_0x0040
        L_0x0011:
            java.lang.String r1 = "collectOAID"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x003e
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch:{ all -> 0x0037 }
            r1.<init>(r5)     // Catch:{ all -> 0x0037 }
            boolean r5 = r0.isEnableLog()     // Catch:{ all -> 0x0037 }
            r1.setLogging(r5)     // Catch:{ all -> 0x0037 }
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x003e
            java.lang.String r0 = r5.getId()     // Catch:{ all -> 0x0037 }
            java.lang.Boolean r5 = r5.getLat()     // Catch:{ all -> 0x0035 }
            r1 = r0
            goto L_0x0040
        L_0x0035:
            r1 = r0
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            java.lang.String r5 = "No OAID library"
            com.appsflyer.AFLogger.afDebugLog(r5)
            goto L_0x000f
        L_0x003e:
            r5 = r4
            r1 = r5
        L_0x0040:
            if (r1 == 0) goto L_0x004b
            com.appsflyer.AdvertisingIdObject r0 = new com.appsflyer.AdvertisingIdObject
            r0.<init>(r1, r5)
            r0.setManual(r3)
            return r0
        L_0x004b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AdvertisingIdUtil.getOaid(android.content.Context):com.appsflyer.AdvertisingIdObject");
    }
}
