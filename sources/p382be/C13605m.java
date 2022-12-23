package p382be;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p986firebaseauthapi.zzaf;
import com.google.android.gms.internal.p986firebaseauthapi.zzpz;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p241s0.C6302b;

/* renamed from: be.m */
public final class C13605m {

    /* renamed from: a */
    public static final Logger f33572a = new Logger("JSONParser", new String[0]);

    @VisibleForTesting
    /* renamed from: a */
    public static ArrayList m34018a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m34018a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m34021d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map m34019b(String str) {
        Preconditions.checkNotEmpty(str);
        List zzd = zzaf.zzb('.').zzd(str);
        if (zzd.size() < 2) {
            f33572a.mo65852e("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            C6302b c = m34020c(new String(Base64Utils.decodeUrlSafeNoPadding((String) zzd.get(1)), "UTF-8"));
            if (c == null) {
                return new HashMap();
            }
            return c;
        } catch (UnsupportedEncodingException e) {
            f33572a.mo65851e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static C6302b m34020c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m34021d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new zzpz(e);
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    public static C6302b m34021d(JSONObject jSONObject) throws JSONException {
        C6302b bVar = new C6302b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m34018a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m34021d((JSONObject) obj);
            }
            bVar.put(next, obj);
        }
        return bVar;
    }
}
