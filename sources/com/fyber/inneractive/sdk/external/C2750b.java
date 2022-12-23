package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3707l;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.external.b */
public class C2750b implements Runnable {
    public C2750b(InneractiveAdManager inneractiveAdManager) {
    }

    public void run() {
        boolean z;
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        SharedPreferences sharedPreferences = C3707l.f12893a.getSharedPreferences("IAConfigurationPreferences", 0);
        if (sharedPreferences == null || !sharedPreferences.contains("IAConfigFQE")) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            SharedPreferences sharedPreferences2 = C3707l.f12893a.getSharedPreferences("IAConfigurationPreferences", 0);
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putBoolean("IAConfigFQE", true).apply();
            }
            new C2926q.C2927a(C2924p.FIRST_OPENED, (InneractiveAdRequest) null, (C3648e) null, (JSONArray) null).mo13717a((String) null);
        }
    }
}
