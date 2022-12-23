package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.config.C2630e;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.b */
public class C2593b implements C2592a<C2667h> {

    /* renamed from: a */
    public static final String f9156a = String.format("https://%sconfig_android.json", new Object[]{"cdn2.inner-active.mobi/ia-sdk-config/"});

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo13168a(Object obj) {
        C2667h hVar = (C2667h) obj;
    }

    /* renamed from: b */
    public String mo13169b() {
        return "IALastModifiedFromHeader.global";
    }

    /* renamed from: c */
    public String mo13170c() {
        return "ia-global.config";
    }

    /* renamed from: d */
    public boolean mo13171d() {
        return true;
    }

    /* renamed from: a */
    public Object mo13166a(String str) throws Exception {
        try {
            return C2667h.m6742a(new JSONObject(str));
        } catch (JSONException e) {
            IAlog.m9903b("internal error while parsing global config file", new Object[0]);
            throw e;
        }
    }

    /* renamed from: a */
    public String mo13167a() {
        int i = C2630e.f9283a;
        if (System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return f9156a;
        }
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
