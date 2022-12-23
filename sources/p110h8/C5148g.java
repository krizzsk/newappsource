package p110h8;

import android.content.SharedPreferences;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.C23826d;
import kotlin.text.C24179b;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0115o;
import p135j8.C5399e;
import p262t8.C6606a;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: h8.g */
public final class C5148g {

    /* renamed from: a */
    public static final C5148g f17191a = new C5148g();

    /* renamed from: b */
    public static SharedPreferences f17192b;

    /* renamed from: c */
    public static final CopyOnWriteArraySet f17193c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public static final ConcurrentHashMap f17194d = new ConcurrentHashMap();

    /* renamed from: d */
    public static final boolean m13055d() {
        Class<C5148g> cls = C5148g.class;
        if (C6606a.m15601b(cls)) {
            return false;
        }
        try {
            f17191a.mo20881f();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f17192b;
            if (sharedPreferences != null) {
                long j = sharedPreferences.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0);
                if (j != 0 && currentTimeMillis - j < ((long) Strategy.TTL_SECONDS_MAX)) {
                    return false;
                }
                SharedPreferences sharedPreferences2 = f17192b;
                if (sharedPreferences2 != null) {
                    sharedPreferences2.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", currentTimeMillis).apply();
                    return true;
                }
                C24362h.m61217l("sharedPreferences");
                throw null;
            }
            C24362h.m61217l("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return false;
        }
    }

    /* renamed from: e */
    public static final void m13056e(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        C5148g gVar;
        Class<C5148g> cls = C5148g.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(concurrentHashMap, "purchaseDetailsMap");
                C24362h.m61211f(concurrentHashMap2, "skuDetailsMap");
                gVar = f17191a;
                gVar.mo20881f();
                LinkedHashMap c = gVar.mo20880c(gVar.mo20878a(concurrentHashMap), concurrentHashMap2);
                if (!C6606a.m15601b(gVar)) {
                    for (Map.Entry entry : c.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        if (!(str == null || str2 == null)) {
                            C5399e.m13504b(str, str2, false);
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: a */
    public final HashMap mo20878a(ConcurrentHashMap concurrentHashMap) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C24362h.m61211f(concurrentHashMap, "purchaseDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : C23826d.m58535Z(concurrentHashMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (f17194d.containsKey(string)) {
                            concurrentHashMap.remove(str);
                        } else {
                            CopyOnWriteArraySet copyOnWriteArraySet = f17193c;
                            copyOnWriteArraySet.add(string + ';' + currentTimeMillis);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences = f17192b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putStringSet("PURCHASE_DETAILS_SET", f17193c).apply();
                return new HashMap(concurrentHashMap);
            }
            C24362h.m61217l("sharedPreferences");
            throw null;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo20879b() {
        if (!C6606a.m15601b(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f17192b;
                if (sharedPreferences != null) {
                    long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                    if (j == 0) {
                        SharedPreferences sharedPreferences2 = f17192b;
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else {
                            C24362h.m61217l("sharedPreferences");
                            throw null;
                        }
                    } else if (currentTimeMillis - j > 604800) {
                        for (Map.Entry entry : C23826d.m58535Z(f17194d).entrySet()) {
                            String str = (String) entry.getKey();
                            long longValue = ((Number) entry.getValue()).longValue();
                            if (currentTimeMillis - longValue > 86400) {
                                CopyOnWriteArraySet copyOnWriteArraySet = f17193c;
                                copyOnWriteArraySet.remove(str + ';' + longValue);
                                f17194d.remove(str);
                            }
                        }
                        SharedPreferences sharedPreferences3 = f17192b;
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putStringSet("PURCHASE_DETAILS_SET", f17193c).putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else {
                            C24362h.m61217l("sharedPreferences");
                            throw null;
                        }
                    }
                } else {
                    C24362h.m61217l("sharedPreferences");
                    throw null;
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    /* renamed from: c */
    public final LinkedHashMap mo20880c(HashMap hashMap, ConcurrentHashMap concurrentHashMap) {
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            C24362h.m61211f(hashMap, "purchaseDetailsMap");
            C24362h.m61211f(concurrentHashMap2, "skuDetailsMap");
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) concurrentHashMap2.get((String) entry.getKey());
                if (jSONObject != null && jSONObject.has("purchaseTime")) {
                    try {
                        if (currentTimeMillis - (jSONObject.getLong("purchaseTime") / 1000) <= 86400) {
                            if (jSONObject2 != null) {
                                String jSONObject3 = jSONObject.toString();
                                C24362h.m61210e(jSONObject3, "purchaseDetail.toString()");
                                String jSONObject4 = jSONObject2.toString();
                                C24362h.m61210e(jSONObject4, "skuDetail.toString()");
                                linkedHashMap.put(jSONObject3, jSONObject4);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: f */
    public final void mo20881f() {
        if (!C6606a.m15601b(this)) {
            try {
                SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
                SharedPreferences sharedPreferences2 = C0115o.m210a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
                if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                    sharedPreferences.edit().clear().apply();
                    sharedPreferences2.edit().clear().apply();
                }
                SharedPreferences sharedPreferences3 = C0115o.m210a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
                C24362h.m61210e(sharedPreferences3, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
                f17192b = sharedPreferences3;
                CopyOnWriteArraySet copyOnWriteArraySet = f17193c;
                Collection stringSet = sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    List Y = C24179b.m60577Y((String) it.next(), new String[]{";"}, 2, 2);
                    f17194d.put(Y.get(0), Long.valueOf(Long.parseLong((String) Y.get(1))));
                }
                mo20879b();
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
