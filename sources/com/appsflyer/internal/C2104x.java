package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFDeepLinkManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.x */
public final class C2104x extends OneLinkHttpTask {
    private static List<String> values = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});
    private String $$a;
    public C2105a $$b;
    public boolean AFDateFormat = false;
    private String valueOf;

    /* renamed from: com.appsflyer.internal.x$a */
    public interface C2105a {
        void $$b(Map<String, String> map);

        void valueOf(String str);
    }

    public C2104x(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : values) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            if (AFDeepLinkManager.values != null) {
                StringBuilder sb = new StringBuilder("Validate if link ");
                sb.append(uri);
                sb.append(" belongs to custom domains: ");
                sb.append(Arrays.asList(AFDeepLinkManager.values));
                AFLogger.afRDLog(sb.toString());
                for (String str : AFDeepLinkManager.values) {
                    if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                        AFLogger.afDebugLog("Link matches custom domain: ".concat(String.valueOf(str)));
                        this.AFDateFormat = true;
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.oneLinkId = split[1];
                this.$$a = split[2];
                this.valueOf = uri.toString();
            }
        }
    }

    public final String getOneLinkUrl() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl(OneLinkHttpTask.BASE_URL));
        sb.append("/");
        sb.append(this.oneLinkId);
        sb.append("?id=");
        sb.append(this.$$a);
        return sb.toString();
    }

    public final void handleResponse(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.$$b.$$b(hashMap);
        } catch (JSONException e) {
            this.$$b.valueOf("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    public final void initRequest(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    public final void onErrorResponse() {
        String str = this.valueOf;
        if (str == null) {
            str = OneLinkHttpTask.NO_CONNECTION_ERROR_MSG;
        }
        this.$$b.valueOf(str);
    }

    public final boolean values() {
        return !TextUtils.isEmpty(this.oneLinkId) && !TextUtils.isEmpty(this.$$a) && !this.oneLinkId.equals("app");
    }
}
