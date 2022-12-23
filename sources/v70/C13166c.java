package v70;

import com.moovit.sdk.Locale.LocaleInfo;

/* renamed from: v70.c */
public final class C13166c extends C13173i<C13166c, C13167d> {

    /* renamed from: t */
    public final LocaleInfo f32710t;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13166c(v70.C13177m r5, com.moovit.commons.geo.LatLonE6 r6) {
        /*
            r4 = this;
            int r0 = e70.C4590c.api_path_moovit_sdk_create_user_request_path
            java.lang.Class<v70.d> r1 = v70.C13167d.class
            r4.<init>((v70.C13177m) r5, (int) r0, r1)
            android.content.Context r5 = r5.f32719a
            android.os.Parcelable$Creator<com.moovit.sdk.Locale.LocaleInfo> r0 = com.moovit.sdk.Locale.LocaleInfo.CREATOR
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = p977zz.C20943i.m49050c(r0)
            if (r0 != 0) goto L_0x001b
            r0 = 0
            goto L_0x002d
        L_0x001b:
            com.moovit.sdk.Locale.LocaleInfo r1 = new com.moovit.sdk.Locale.LocaleInfo
            java.lang.String r2 = r0.getLanguage()
            java.lang.String r3 = r0.getCountry()
            java.lang.String r0 = r0.getVariant()
            r1.<init>(r2, r3, r0)
            r0 = r1
        L_0x002d:
            r4.f32710t = r0
            r0 = 1
            com.google.android.gms.common.GoogleApiAvailability r1 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            int r1 = r1.isGooglePlayServicesAvailable(r5)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0053
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r1 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r5)     // Catch:{ IOException -> 0x004f, GooglePlayServicesRepairableException -> 0x004d, GooglePlayServicesNotAvailableException -> 0x004b }
            if (r1 == 0) goto L_0x0053
            boolean r0 = r1.isLimitAdTrackingEnabled()     // Catch:{ IOException -> 0x004f, GooglePlayServicesRepairableException -> 0x004d, GooglePlayServicesNotAvailableException -> 0x004b }
            java.lang.String r2 = r1.getId()     // Catch:{ IOException -> 0x004f, GooglePlayServicesRepairableException -> 0x004d, GooglePlayServicesNotAvailableException -> 0x004b }
            goto L_0x0053
        L_0x004b:
            r1 = move-exception
            goto L_0x0050
        L_0x004d:
            r1 = move-exception
            goto L_0x0050
        L_0x004f:
            r1 = move-exception
        L_0x0050:
            r1.printStackTrace()
        L_0x0053:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "advertisingId"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = "limitAdTrackingEnabled"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "locale"
            com.moovit.sdk.Locale.LocaleInfo r2 = r4.f32710t     // Catch:{ JSONException -> 0x00ff }
            org.json.JSONObject r2 = ce0.C21100e.m49319N(r2)     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "deviceName"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00ff }
            r2.<init>()     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x00ff }
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = " "
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = android.os.Build.PRODUCT     // Catch:{ JSONException -> 0x00ff }
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "osVersion"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00ff }
            r2.<init>()     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x00ff }
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r3 = "_"
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x00ff }
            r2.append(r3)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "phoneOsType"
            com.moovit.sdk.protocol.ProtocolEnums$MVPhoneOsTypes r2 = com.moovit.sdk.protocol.ProtocolEnums$MVPhoneOsTypes.Android     // Catch:{ JSONException -> 0x00ff }
            int r2 = r2.getValue()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "screenResolution"
            com.moovit.sdk.protocol.ProtocolEnums$MVClientResolution r2 = ce0.C21100e.m49343h0(r5)     // Catch:{ JSONException -> 0x00ff }
            int r2 = r2.getValue()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "requestTime"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "uniqueId"
            java.lang.String r2 = p977zz.C20975x0.m49119f(r5)     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r0 = "hostedAppPackage"
            java.lang.String r5 = r5.getPackageName()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r0, r5)     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r5 = "userType"
            com.moovit.sdk.protocol.ProtocolEnums$MVUserType r0 = com.moovit.sdk.protocol.ProtocolEnums$MVUserType.Sdk     // Catch:{ JSONException -> 0x00ff }
            int r0 = r0.getValue()     // Catch:{ JSONException -> 0x00ff }
            r1.put(r5, r0)     // Catch:{ JSONException -> 0x00ff }
            if (r6 == 0) goto L_0x00ff
            java.lang.String r5 = "userLocation"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ff }
            r0.<init>()     // Catch:{ JSONException -> 0x00ff }
            java.lang.String r2 = "latitude"
            int r3 = r6.f40980b     // Catch:{ JSONException -> 0x00fc }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x00fc }
            java.lang.String r2 = "longitude"
            int r6 = r6.f40981c     // Catch:{ JSONException -> 0x00fc }
            r0.put(r2, r6)     // Catch:{ JSONException -> 0x00fc }
        L_0x00fc:
            r1.put(r5, r0)     // Catch:{ JSONException -> 0x00ff }
        L_0x00ff:
            r4.f32717r = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v70.C13166c.<init>(v70.m, com.moovit.commons.geo.LatLonE6):void");
    }
}
