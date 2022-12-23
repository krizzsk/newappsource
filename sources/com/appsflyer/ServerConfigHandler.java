package com.appsflyer;

import com.appsflyer.internal.C2069ad;
import org.json.JSONObject;

public class ServerConfigHandler {
    public static JSONObject $$b(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            try {
                boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
                if (!jSONObject2.optBoolean("monitor", false) || z) {
                    C2069ad.$$a().$$b();
                    C2069ad.$$a().values();
                } else {
                    C2069ad.$$a().AFDateFormat();
                }
                if (!jSONObject2.has("ol_id")) {
                    return jSONObject2;
                }
                String optString = jSONObject2.optString("ol_scheme", (String) null);
                String optString2 = jSONObject2.optString("ol_domain", (String) null);
                String optString3 = jSONObject2.optString("ol_ver", (String) null);
                if (optString != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
                }
                if (optString2 != null) {
                    AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
                }
                if (optString3 == null) {
                    return jSONObject2;
                }
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject2;
            } catch (Throwable th) {
                th = th;
                jSONObject = jSONObject2;
                AFLogger.afErrorLog(th.getMessage(), th);
                C2069ad.$$a().$$b();
                C2069ad.$$a().values();
                return jSONObject;
            }
        } catch (Throwable th2) {
            th = th2;
            AFLogger.afErrorLog(th.getMessage(), th);
            C2069ad.$$a().$$b();
            C2069ad.$$a().values();
            return jSONObject;
        }
    }

    public static String getUrl(String str) {
        return String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLibCore.getInstance().getHostName()});
    }
}
