package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
public final class C2382c {

    /* renamed from: a */
    public static final HashMap f8623a;

    /* renamed from: com.facebook.internal.c$a */
    public static final class C2383a implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    public static final class C2384b implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c */
    public static final class C2385c implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    public static final class C2386d implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    public static final class C2387e implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            bundle.putString(str, (String) obj);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    public static final class C2388f implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    public static final class C2389g implements C2390h {
        /* renamed from: a */
        public final void mo12551a(Bundle bundle, String str, Object obj) throws JSONException {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add(obj2);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(C24362h.m61216k(obj2.getClass(), "Unexpected type in an array: "));
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.c$h */
    public interface C2390h {
        /* renamed from: a */
        void mo12551a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f8623a = hashMap;
        hashMap.put(Boolean.class, new C2383a());
        hashMap.put(Integer.class, new C2384b());
        hashMap.put(Long.class, new C2385c());
        hashMap.put(Double.class, new C2386d());
        hashMap.put(String.class, new C2387e());
        hashMap.put(String[].class, new C2388f());
        hashMap.put(JSONArray.class, new C2389g());
    }

    /* renamed from: a */
    public static final Bundle m6277a(JSONObject jSONObject) throws JSONException {
        C24362h.m61211f(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, m6277a((JSONObject) obj));
                } else {
                    C2390h hVar = (C2390h) f8623a.get(obj.getClass());
                    if (hVar != null) {
                        C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                        hVar.mo12551a(bundle, next, obj);
                    } else {
                        throw new IllegalArgumentException(C24362h.m61216k(obj.getClass(), "Unsupported type: "));
                    }
                }
            }
        }
        return bundle;
    }
}
