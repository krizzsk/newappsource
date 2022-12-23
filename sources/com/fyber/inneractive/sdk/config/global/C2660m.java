package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.cache.C2592a;
import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.m */
public class C2660m implements C2592a<C2659l> {
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo13168a(Object obj) {
        C2659l lVar = (C2659l) obj;
    }

    /* renamed from: b */
    public String mo13169b() {
        return "IALastModifiedFromHeader.remote";
    }

    /* renamed from: c */
    public String mo13170c() {
        return "ia-remote.config";
    }

    /* renamed from: d */
    public boolean mo13171d() {
        return true;
    }

    /* renamed from: a */
    public Object mo13166a(String str) throws Exception {
        try {
            return C2659l.m6707a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.m9903b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f12814a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    /* renamed from: a */
    public String mo13167a() {
        int i = C2630e.f9283a;
        if (System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") != null) {
            return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
        }
        return String.format(Locale.ENGLISH, "https://%sfeatures_config.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});
    }
}
