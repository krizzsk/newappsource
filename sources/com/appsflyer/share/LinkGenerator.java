package com.appsflyer.share;

import android.content.Context;
import com.appboy.models.outgoing.AttributionData;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;

public class LinkGenerator {
    private String $$a;
    public String $$b;
    private String AFDateFormat;
    private String AFDeepLinkManager;
    private String AFEvent;
    private String collectIntentsFromActivities;
    private Map<String, String> context = new HashMap();
    private String dateFormatUTC;
    private String getDataFormatter;
    private String getInstance;
    private Map<String, String> getRequestListener = new HashMap();
    private String requestListener;
    public String valueOf;
    private String values;

    private static String $$a(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb = new StringBuilder("Illegal ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str);
            AFLogger.afErrorLog(sb.toString(), e);
            return "";
        } catch (Throwable th) {
            AFLogger.afErrorLog(th);
            return "";
        }
    }

    public LinkGenerator(String str) {
        this.values = str;
    }

    private StringBuilder values() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = this.$$b;
        if (str2 == null || !str2.startsWith("http")) {
            sb.append(ServerConfigHandler.getUrl(Constants.AFDateFormat));
        } else {
            sb.append(this.$$b);
        }
        if (this.valueOf != null) {
            sb.append('/');
            sb.append(this.valueOf);
        }
        this.getRequestListener.put(Constants.URL_MEDIA_SOURCE, this.values);
        sb.append('?');
        sb.append("pid=");
        sb.append($$a(this.values, "media source"));
        String str3 = this.dateFormatUTC;
        if (str3 != null) {
            this.getRequestListener.put("af_referrer_uid", str3);
            sb.append('&');
            sb.append("af_referrer_uid=");
            sb.append($$a(this.dateFormatUTC, "referrerUID"));
        }
        String str4 = this.$$a;
        if (str4 != null) {
            this.getRequestListener.put("af_channel", str4);
            sb.append('&');
            sb.append("af_channel=");
            sb.append($$a(this.$$a, "channel"));
        }
        String str5 = this.getInstance;
        if (str5 != null) {
            this.getRequestListener.put("af_referrer_customer_id", str5);
            sb.append('&');
            sb.append("af_referrer_customer_id=");
            sb.append($$a(this.getInstance, "referrerCustomerId"));
        }
        String str6 = this.AFDateFormat;
        if (str6 != null) {
            this.getRequestListener.put(Constants.URL_CAMPAIGN, str6);
            sb.append('&');
            sb.append("c=");
            sb.append($$a(this.AFDateFormat, AttributionData.CAMPAIGN_KEY));
        }
        String str7 = this.getDataFormatter;
        if (str7 != null) {
            this.getRequestListener.put("af_referrer_name", str7);
            sb.append('&');
            sb.append("af_referrer_name=");
            sb.append($$a(this.getDataFormatter, "referrerName"));
        }
        String str8 = this.collectIntentsFromActivities;
        if (str8 != null) {
            this.getRequestListener.put("af_referrer_image_url", str8);
            sb.append('&');
            sb.append("af_referrer_image_url=");
            sb.append($$a(this.collectIntentsFromActivities, "referrerImageURL"));
        }
        if (this.AFEvent != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.AFEvent);
            String str9 = "";
            if (this.AFEvent.endsWith("/")) {
                str = str9;
            } else {
                str = "/";
            }
            sb2.append(str);
            String str10 = this.AFDeepLinkManager;
            if (str10 != null) {
                sb2.append(str10);
            }
            this.getRequestListener.put("af_dp", sb2.toString());
            sb.append('&');
            sb.append("af_dp=");
            sb.append($$a(this.AFEvent, "baseDeeplink"));
            if (this.AFDeepLinkManager != null) {
                if (!this.AFEvent.endsWith("/")) {
                    str9 = "%2F";
                }
                sb.append(str9);
                sb.append($$a(this.AFDeepLinkManager, "deeplinkPath"));
            }
        }
        for (String next : this.context.keySet()) {
            String obj = sb.toString();
            StringBuilder t = C0016g.m36t(next, "=");
            t.append($$a(this.context.get(next), next));
            if (!obj.contains(t.toString())) {
                sb.append('&');
                sb.append(next);
                sb.append('=');
                sb.append($$a(this.context.get(next), next));
            }
        }
        return sb;
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.context.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.context.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return values().toString();
    }

    public String getBrandDomain() {
        return this.requestListener;
    }

    public String getCampaign() {
        return this.AFDateFormat;
    }

    public String getChannel() {
        return this.$$a;
    }

    public String getMediaSource() {
        return this.values;
    }

    public Map<String, String> getParameters() {
        return this.context;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.AFEvent = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.$$b = String.format("https://%s/%s", new Object[]{ServerConfigHandler.getUrl("%sapp.%s"), str3});
        } else {
            if (str2 == null || str2.length() < 5) {
                str2 = "go.onelink.me";
            }
            this.$$b = String.format("https://%s/%s", new Object[]{str2, str});
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.requestListener = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFDateFormat = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.$$a = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.AFDeepLinkManager = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.getInstance = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.collectIntentsFromActivities = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.getDataFormatter = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.dateFormatUTC = str;
        return this;
    }

    public void generateLink(Context context2, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.context.isEmpty()) {
            for (Map.Entry next : this.context.entrySet()) {
                this.getRequestListener.put(next.getKey(), next.getValue());
            }
        }
        values();
        String str = this.requestListener;
        Map<String, String> map = this.getRequestListener;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, AppsFlyerLibCore.getInstance(), context2, AppsFlyerLib.getInstance().isStopped());
        createOneLinkHttpTask.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        createOneLinkHttpTask.setListener(responseListener);
        createOneLinkHttpTask.setBrandDomain(str);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(createOneLinkHttpTask);
    }
}
