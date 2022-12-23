package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.v3 */
public class C1709v3 extends C1688s3<C1651o2> {

    /* renamed from: g */
    public static final String f6036g = AppboyLogger.getBrazeLogTag(C1709v3.class);

    /* renamed from: d */
    public final BrazeConfigurationProvider f6037d;

    /* renamed from: e */
    public final SharedPreferences f6038e;

    /* renamed from: f */
    public C1651o2 f6039f;

    public C1709v3(Context context) {
        this(context, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo6408a(C1651o2 o2Var) {
        this.f6039f = o2Var;
    }

    /* renamed from: d */
    public void mo6410d() {
        AppboyLogger.m5457v(f6036g, "Device object cache cleared.");
        this.f6038e.edit().clear().apply();
    }

    /* renamed from: e */
    public C1651o2 mo6103c() {
        JSONObject w = this.f6039f.forJsonPut();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(this.f6038e.getString("cached_device", "{}"));
        } catch (JSONException e) {
            AppboyLogger.m5452e(f6036g, "Caught exception confirming and unlocking Json objects.", e);
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = w.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = w.opt(next);
            Object opt2 = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    if (opt2 != null) {
                        try {
                            if (JsonUtils.areJsonObjectsEqual((JSONObject) opt, (JSONObject) opt2)) {
                            }
                        } catch (JSONException e2) {
                            AppboyLogger.m5449d(f6036g, "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.", (Throwable) e2);
                            return this.f6039f;
                        }
                    }
                    jSONObject2.put(next, opt);
                } else if (!opt.equals(opt2)) {
                    try {
                        jSONObject2.put(next, opt);
                    } catch (JSONException e3) {
                        AppboyLogger.m5452e(f6036g, "Caught json exception creating dirty outbound device. Returning the whole device.", e3);
                        return this.f6039f;
                    }
                }
            }
        }
        return C1651o2.m4543a(this.f6037d, jSONObject2);
    }

    public C1709v3(Context context, String str, String str2) {
        this.f6039f = null;
        StringBuilder k = C13555b.m33972k("com.appboy.storage.device_cache.v3");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f6038e = context.getSharedPreferences(k.toString(), 0);
        this.f6037d = new BrazeConfigurationProvider(context);
    }

    /* renamed from: a */
    public void mo6099b(C1651o2 o2Var, boolean z) {
        if (z && o2Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f6038e.getString("cached_device", "{}"));
                JSONObject w = o2Var.forJsonPut();
                SharedPreferences.Editor edit = this.f6038e.edit();
                edit.putString("cached_device", JsonUtils.mergeJsonObjects(jSONObject, w).toString());
                edit.apply();
            } catch (JSONException e) {
                AppboyLogger.m5449d(f6036g, "Caught exception confirming and unlocking device cache.", (Throwable) e);
            }
        }
    }
}
