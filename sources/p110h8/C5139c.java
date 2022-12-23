package p110h8;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p135j8.C5399e;
import p262t8.C6606a;

/* renamed from: h8.c */
public final class C5139c {

    /* renamed from: a */
    public static final C5139c f17148a = new C5139c();

    /* renamed from: b */
    public static final AtomicBoolean f17149b = new AtomicBoolean(false);

    /* renamed from: c */
    public static Boolean f17150c;

    /* renamed from: d */
    public static Boolean f17151d;

    /* renamed from: e */
    public static C5137a f17152e;

    /* renamed from: f */
    public static C5138b f17153f;

    /* renamed from: g */
    public static Intent f17154g;

    /* renamed from: h */
    public static Object f17155h;

    /* renamed from: a */
    public static final void m13030a(C5139c cVar, Context context, ArrayList arrayList, boolean z) {
        cVar.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    C24362h.m61210e(string, "sku");
                    C24362h.m61210e(str, ProductAction.ACTION_PURCHASE);
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            C5147f fVar = C5147f.f17185a;
            Object obj = f17155h;
            Class<C5147f> cls = C5147f.class;
            LinkedHashMap linkedHashMap = null;
            if (!C6606a.m15601b(cls)) {
                try {
                    LinkedHashMap j = C5147f.f17185a.mo20876j(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        if (!j.containsKey(str2)) {
                            arrayList3.add(str2);
                        }
                    }
                    j.putAll(C5147f.f17185a.mo20873g(context, arrayList3, obj, z));
                    linkedHashMap = j;
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getValue();
                String str4 = (String) hashMap.get((String) entry.getKey());
                if (str4 != null) {
                    C5399e.m13504b(str4, str3, z);
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m13031b() {
        boolean z;
        boolean z2;
        f17148a.getClass();
        if (f17150c == null) {
            if (C5151j.m13064a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f17150c = valueOf;
            if (!C24362h.m61206a(valueOf, Boolean.FALSE)) {
                if (C5151j.m13064a("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                f17151d = Boolean.valueOf(z2);
                C5147f fVar = C5147f.f17185a;
                Class<C5147f> cls = C5147f.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        SharedPreferences sharedPreferences = C5147f.f17189e;
                        long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                        if (j == 0) {
                            sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        } else if (currentTimeMillis - j > ((long) 604800)) {
                            sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                        }
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                    }
                }
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                C24362h.m61210e(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
                f17154g = intent;
                f17152e = new C5137a();
                f17153f = new C5138b();
            }
        }
        if (!C24362h.m61206a(f17150c, Boolean.FALSE) && C5399e.m13503a()) {
            f17148a.getClass();
            if (f17149b.compareAndSet(false, true)) {
                Context a = C0115o.m210a();
                if (a instanceof Application) {
                    Application application = (Application) a;
                    C5138b bVar = f17153f;
                    if (bVar != null) {
                        application.registerActivityLifecycleCallbacks(bVar);
                        Intent intent2 = f17154g;
                        if (intent2 != null) {
                            C5137a aVar = f17152e;
                            if (aVar != null) {
                                a.bindService(intent2, aVar, 1);
                            } else {
                                C24362h.m61217l("serviceConnection");
                                throw null;
                            }
                        } else {
                            C24362h.m61217l("intent");
                            throw null;
                        }
                    } else {
                        C24362h.m61217l("callbacks");
                        throw null;
                    }
                }
            }
        }
    }
}
