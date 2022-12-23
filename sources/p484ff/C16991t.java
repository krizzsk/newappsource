package p484ff;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: ff.t */
public final class C16991t {

    /* renamed from: a */
    public final Bundle f44106a;

    public C16991t(Bundle bundle) {
        this.f44106a = new Bundle(bundle);
    }

    /* renamed from: f */
    public static boolean m42834f(Bundle bundle) {
        if (DiskLruCache.VERSION_1.equals(bundle.getString("gcm.n.e")) || DiskLruCache.VERSION_1.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static void m42835h(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    /* renamed from: a */
    public final boolean mo49626a(String str) {
        String e = mo49630e(str);
        if (DiskLruCache.VERSION_1.equals(e) || Boolean.parseBoolean(e)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final Integer mo49627b(String str) {
        String e = mo49630e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e));
        } catch (NumberFormatException unused) {
            m42835h(str);
            return null;
        }
    }

    /* renamed from: c */
    public final JSONArray mo49628c(String str) {
        String e = mo49630e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return new JSONArray(e);
        } catch (JSONException unused) {
            m42835h(str);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo49629d(String str, Resources resources, String str2) {
        String[] strArr;
        String e = mo49630e(str2);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        String e2 = mo49630e(str2 + "_loc_key");
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(e2, "string", str);
        if (identifier == 0) {
            m42835h(str2 + "_loc_key");
            return null;
        }
        JSONArray c = mo49628c(str2 + "_loc_args");
        if (c == null) {
            strArr = null;
        } else {
            int length = c.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = c.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            m42835h(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    /* renamed from: e */
    public final String mo49630e(String str) {
        String str2;
        Bundle bundle = this.f44106a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.f44106a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: g */
    public final Bundle mo49631g() {
        boolean z;
        Bundle bundle = new Bundle(this.f44106a);
        for (String next : this.f44106a.keySet()) {
            if (next.startsWith("google.c.a.") || next.equals("from")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                bundle.remove(next);
            }
        }
        return bundle;
    }
}
