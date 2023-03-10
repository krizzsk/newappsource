package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.C2107z;
import com.facebook.ads.AdSDKNotificationListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    private static String AFDateFormat = "https://%simpression.%s";

    /* renamed from: com.appsflyer.share.CrossPromotionHelper$c */
    public static class C2112c implements Runnable {
        private final WeakReference<Context> $$a;
        private final boolean $$b;
        private final C2107z AFDateFormat;
        private final String valueOf;

        public C2112c(String str, C2107z zVar, Context context, boolean z) {
            this.valueOf = str;
            this.AFDateFormat = zVar;
            this.$$a = new WeakReference<>(context);
            this.$$b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[DONT_GENERATE] */
        /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                boolean r0 = r6.$$b
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00b5 }
                java.lang.String r2 = r6.valueOf     // Catch:{ all -> 0x00b5 }
                r1.<init>(r2)     // Catch:{ all -> 0x00b5 }
                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00b5 }
                java.lang.Object r1 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r1)     // Catch:{ all -> 0x00b5 }
                java.net.URLConnection r1 = (java.net.URLConnection) r1     // Catch:{ all -> 0x00b5 }
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00b5 }
                r0 = 10000(0x2710, float:1.4013E-41)
                r1.setConnectTimeout(r0)     // Catch:{ all -> 0x00b3 }
                r0 = 0
                r1.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00b3 }
                int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00b3 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r2 == r3) goto L_0x009c
                r3 = 301(0x12d, float:4.22E-43)
                if (r2 == r3) goto L_0x004e
                r3 = 302(0x12e, float:4.23E-43)
                if (r2 == r3) goto L_0x004e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "call to "
                r0.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00b3 }
                r0.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = " failed: "
                r0.append(r3)     // Catch:{ all -> 0x00b3 }
                r0.append(r2)     // Catch:{ all -> 0x00b3 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x00b3 }
                goto L_0x00af
            L_0x004e:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "Cross promotion redirection success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00b3 }
                r2.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.afInfoLog(r2, r0)     // Catch:{ all -> 0x00b3 }
                com.appsflyer.internal.z r0 = r6.AFDateFormat     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x00af
                java.lang.ref.WeakReference<android.content.Context> r0 = r6.$$a     // Catch:{ all -> 0x00b3 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00b3 }
                if (r0 == 0) goto L_0x00af
                com.appsflyer.internal.z r0 = r6.AFDateFormat     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = "Location"
                java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ all -> 0x00b3 }
                r0.valueOf = r2     // Catch:{ all -> 0x00b3 }
                com.appsflyer.internal.z r0 = r6.AFDateFormat     // Catch:{ all -> 0x00b3 }
                java.lang.ref.WeakReference<android.content.Context> r2 = r6.$$a     // Catch:{ all -> 0x00b3 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00b3 }
                android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r0.valueOf     // Catch:{ all -> 0x00b3 }
                if (r3 == 0) goto L_0x00af
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x00b3 }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r0 = r0.valueOf     // Catch:{ all -> 0x00b3 }
                android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x00b3 }
                r3.<init>(r4, r0)     // Catch:{ all -> 0x00b3 }
                r0 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r0 = r3.setFlags(r0)     // Catch:{ all -> 0x00b3 }
                r2.startActivity(r0)     // Catch:{ all -> 0x00b3 }
                goto L_0x00af
            L_0x009c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = "Cross promotion impressions success: "
                r2.<init>(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r3 = r6.valueOf     // Catch:{ all -> 0x00b3 }
                r2.append(r3)     // Catch:{ all -> 0x00b3 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b3 }
                com.appsflyer.AFLogger.afInfoLog(r2, r0)     // Catch:{ all -> 0x00b3 }
            L_0x00af:
                r1.disconnect()
                return
            L_0x00b3:
                r0 = move-exception
                goto L_0x00b9
            L_0x00b5:
                r1 = move-exception
                r5 = r1
                r1 = r0
                r0 = r5
            L_0x00b9:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00c7 }
                r3 = 1
                com.appsflyer.AFLogger.afErrorLog(r2, r0, r3)     // Catch:{ all -> 0x00c7 }
                if (r1 == 0) goto L_0x00c6
                r1.disconnect()
            L_0x00c6:
                return
            L_0x00c7:
                r0 = move-exception
                if (r1 == 0) goto L_0x00cd
                r1.disconnect()
            L_0x00cd:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.C2112c.run():void");
        }
    }

    private static LinkGenerator AFDateFormat(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.$$b = str3;
        linkGenerator.valueOf = str;
        linkGenerator.addParameter(Constants.URL_SITE_ID, context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, (Map<String, String>) null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, (Map<String, String>) null);
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != 96801) {
                if (hashCode == 120623625 && str2.equals(AdSDKNotificationListener.IMPRESSION_EVENT)) {
                    c = 1;
                }
            } else if (str2.equals("app")) {
                c = 0;
            }
            if (c == 0) {
                Constants.AFDateFormat = str;
            } else if (c == 1) {
                AFDateFormat = str;
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator AFDateFormat2 = AFDateFormat(context, str, str2, map, ServerConfigHandler.getUrl(Constants.AFDateFormat));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new C2112c(AFDateFormat2.generateLink(), new C2107z(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new C2112c(AFDateFormat(context, str, str2, map, ServerConfigHandler.getUrl(AFDateFormat)).generateLink(), (C2107z) null, (Context) null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }
}
