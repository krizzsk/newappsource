package com.fyber.inneractive.sdk.external;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.C2566a;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

public final class BidTokenProvider {
    public static String getBidderToken() {
        boolean z = false;
        if (!InneractiveAdManager.wasInitialized()) {
            IAlog.m9903b("BidTokenProvider: Cannot generate token. Please init Fyber Marketplace SDK.", new Object[0]);
            return null;
        }
        C2566a aVar = C2566a.f9066h;
        if (aVar.f9072f.get() == null) {
            aVar.mo13015a();
        } else {
            aVar.mo13017b();
        }
        String str = aVar.f9072f.get();
        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
        String str2 = iAConfigManager.f9225m;
        int i = 2000;
        if (!TextUtils.isEmpty(str2)) {
            i = iAConfigManager.f9234v.f9337b.mo13271a(aVar.f9071e.get(str2.toLowerCase()), 2000, 1);
        } else {
            str2 = "unknown";
        }
        if (str != null && str.getBytes().length > i) {
            C2922o oVar = C2922o.TOKEN_EXCEEDS_LIMIT;
            C2926q.C2927a aVar2 = new C2926q.C2927a((C3648e) null);
            aVar2.f10041b = oVar;
            aVar2.f10040a = null;
            aVar2.f10043d = null;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediator", str2);
            } catch (Exception unused) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "mediator", str2);
            }
            Integer valueOf = Integer.valueOf(str.getBytes().length);
            try {
                jSONObject.put("token_size", valueOf);
            } catch (Exception unused2) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "token_size", valueOf);
            }
            Integer valueOf2 = Integer.valueOf(i);
            try {
                jSONObject.put("token_limit", valueOf2);
            } catch (Exception unused3) {
                IAlog.m9906e("Got exception adding param to json object: %s, %s", "token_limit", valueOf2);
            }
            aVar2.f10045f.put(jSONObject);
            aVar2.mo13717a((String) null);
            z = true;
        }
        if (z) {
            return null;
        }
        return str;
    }
}
