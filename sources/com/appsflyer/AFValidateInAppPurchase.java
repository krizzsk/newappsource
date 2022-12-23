package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.C2069ad;
import com.appsflyer.internal.model.event.Purchase;
import com.appsflyer.internal.model.event.SdkServices;
import com.appsflyer.internal.model.event.Validate;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class AFValidateInAppPurchase implements Runnable {
    private static String $$a = "https://%ssdk-services.%s/validate-android-signature";
    private static String $$b;
    private String AFDateFormat;
    /* access modifiers changed from: private */
    public Map<String, String> AFDeepLinkManager;
    private String collectIntentsFromActivities;
    private String dateFormatUTC;
    private String getDataFormatter;
    private String getInstance;
    /* access modifiers changed from: private */
    public WeakReference<Context> valueOf;
    private String values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AppsFlyerLibCore.SERVER_BUILD_NUMBER);
        sb.append("/androidevent?buildnumber=6.1.4&app_id=");
        $$b = sb.toString();
    }

    public AFValidateInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.valueOf = new WeakReference<>(context);
        this.values = str;
        this.AFDateFormat = str2;
        this.collectIntentsFromActivities = str4;
        this.getInstance = str5;
        this.getDataFormatter = str6;
        this.AFDeepLinkManager = map;
        this.dateFormatUTC = str3;
    }

    public static void setUrl(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getValue();
            String str2 = (String) next.getKey();
            char c = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1421272810) {
                if (hashCode == 454162577 && str2.equals("sdk-services")) {
                    c = 0;
                }
            } else if (str2.equals("validate")) {
                c = 1;
            }
            if (c == 0) {
                $$a = str;
            } else if (c == 1) {
                $$b = str;
            }
        }
    }

    private static void valueOf(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.AFDateFormat != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.AFDateFormat.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.AFDateFormat;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    public void run() {
        String str = this.values;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = this.valueOf.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.AFDateFormat);
                    hashMap.put("sig-data", this.collectIntentsFromActivities);
                    hashMap.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.dateFormatUTC);
                    final HashMap hashMap2 = new HashMap(hashMap);
                    new Thread(new Runnable() {
                        public final void run() {
                            AFValidateInAppPurchase aFValidateInAppPurchase = AFValidateInAppPurchase.this;
                            AFValidateInAppPurchase.$$a(aFValidateInAppPurchase, hashMap2, aFValidateInAppPurchase.AFDeepLinkManager, AFValidateInAppPurchase.this.valueOf);
                        }
                    }).start();
                    hashMap.put("dev_key", this.values);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put(ServerParameters.AF_USER_ID, AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put(ServerParameters.ADVERTISING_ID_PARAM, AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl($$a);
                    C2069ad.$$a().AFDateFormat("server_request", url, jSONObject);
                    HttpURLConnection values2 = values((Purchase) new SdkServices().addParams(hashMap).urlString(url));
                    int i = -1;
                    if (values2 != null) {
                        i = values2.getResponseCode();
                    }
                    String readServerResponse = AppsFlyerLibCore.getInstance().readServerResponse(values2);
                    C2069ad.$$a().AFDateFormat("server_response", url, String.valueOf(i), readServerResponse);
                    JSONObject jSONObject2 = new JSONObject(readServerResponse);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.afInfoLog(sb.toString());
                        valueOf(jSONObject2.optBoolean("result"), this.collectIntentsFromActivities, this.getInstance, this.getDataFormatter, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        valueOf(false, this.collectIntentsFromActivities, this.getInstance, this.getDataFormatter, jSONObject2.toString());
                    }
                    if (values2 != null) {
                        values2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    public static /* synthetic */ void $$a(AFValidateInAppPurchase aFValidateInAppPurchase, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl($$b));
            sb.append(((Context) weakReference.get()).getPackageName());
            String obj = sb.toString();
            String string = AppsFlyerLibCore.getSharedPreferences((Context) weakReference.get()).getString("referrer", "");
            AFEvent key = new Validate((Context) weakReference.get()).key(aFValidateInAppPurchase.values);
            key.valueOf = string;
            Validate validate = (Validate) key;
            Map<String, Object> AFDateFormat2 = AppsFlyerLibCore.getInstance().AFDateFormat((AFEvent) validate);
            AFDateFormat2.put(InAppPurchaseMetaData.KEY_PRICE, aFValidateInAppPurchase.getInstance);
            AFDateFormat2.put(InAppPurchaseMetaData.KEY_CURRENCY, aFValidateInAppPurchase.getDataFormatter);
            AFDateFormat2.put("receipt_data", map);
            if (map2 != null) {
                AFDateFormat2.put("extra_prms", map2);
            }
            String jSONObject = new JSONObject(AFDateFormat2).toString();
            C2069ad.$$a().AFDateFormat("server_request", obj, jSONObject);
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection values2 = values((Purchase) validate.addParams(AFDateFormat2).urlString(obj));
                int i = -1;
                if (values2 != null) {
                    i = values2.getResponseCode();
                }
                String readServerResponse = AppsFlyerLibCore.getInstance().readServerResponse(values2);
                C2069ad.$$a().AFDateFormat("server_response", obj, String.valueOf(i), readServerResponse);
                StringBuilder sb2 = new StringBuilder("Validate-WH response - ");
                sb2.append(i);
                sb2.append(": ");
                sb2.append(new JSONObject(readServerResponse).toString());
                AFLogger.afInfoLog(sb2.toString());
                if (values2 != null) {
                    values2.disconnect();
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    private static HttpURLConnection values(Purchase purchase) {
        StringBuilder sb = new StringBuilder("Calling ");
        sb.append(purchase.urlString());
        AFLogger.afDebugLog(sb.toString());
        return new BackgroundHttpTask(purchase.trackingStopped(AppsFlyerLib.getInstance().isStopped())).doInBackground();
    }
}
