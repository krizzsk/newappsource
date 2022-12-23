package com.facebook.appevents.internal;

import android.content.Context;
import android.os.Build;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.C2317b;
import com.facebook.appevents.C2355s;
import com.facebook.internal.C2376b;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2436x;
import com.facebook.internal.FeatureManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C23826d;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0098d0;
import p009a8.C0115o;
import p262t8.C6606a;

public final class AppEventsLoggerUtility {

    /* renamed from: a */
    public static final HashMap f8536a = C23826d.m58532W(new Pair(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    /* renamed from: a */
    public static final JSONObject m6204a(GraphAPIActivityType graphAPIActivityType, C2376b bVar, String str, boolean z, Context context) throws JSONException {
        boolean z2;
        C24362h.m61211f(graphAPIActivityType, "activityType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f8536a.get(graphAPIActivityType));
        C2317b bVar2 = C2317b.f8487a;
        if (!C2317b.f8490d) {
            C2317b.f8487a.getClass();
            C2317b.m6187a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = C2317b.f8488b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = C2317b.f8489c;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            C2397f0 f0Var = C2397f0.f8630a;
            FeatureManager featureManager = FeatureManager.f8588a;
            FeatureManager.Feature feature = FeatureManager.Feature.ServiceUpdateCompliance;
            if (!FeatureManager.m6257c(feature)) {
                jSONObject.put("anon_id", str);
            }
            jSONObject.put("application_tracking_enabled", !z);
            C0115o oVar = C0115o.f331a;
            jSONObject.put("advertiser_id_collection_enabled", C0098d0.m168a());
            if (bVar != null) {
                if (FeatureManager.m6257c(feature)) {
                    C2397f0 f0Var2 = C2397f0.f8630a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        f0Var2.getClass();
                        if (C2397f0.m6332z(context)) {
                            if (!bVar.f8609e) {
                                jSONObject.put("anon_id", str);
                            }
                        }
                    } else {
                        f0Var2.getClass();
                    }
                    jSONObject.put("anon_id", str);
                }
                if (bVar.f8607c != null) {
                    if (FeatureManager.m6257c(feature)) {
                        C2397f0 f0Var3 = C2397f0.f8630a;
                        if (Build.VERSION.SDK_INT >= 31) {
                            f0Var3.getClass();
                            if (C2397f0.m6332z(context)) {
                                if (!bVar.f8609e) {
                                    jSONObject.put("attribution", bVar.f8607c);
                                }
                            }
                        } else {
                            f0Var3.getClass();
                        }
                        jSONObject.put("attribution", bVar.f8607c);
                    } else {
                        jSONObject.put("attribution", bVar.f8607c);
                    }
                }
                if (bVar.mo12541a() != null) {
                    jSONObject.put("advertiser_id", bVar.mo12541a());
                    jSONObject.put("advertiser_tracking_enabled", !bVar.f8609e);
                }
                if (!bVar.f8609e) {
                    C2355s sVar = C2355s.f8576a;
                    Class<C2355s> cls = C2355s.class;
                    String str3 = null;
                    if (!C6606a.m15601b(cls)) {
                        try {
                            if (!C2355s.f8578c.get()) {
                                C2355s.f8576a.mo12517b();
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.putAll(C2355s.f8579d);
                            hashMap.putAll(C2355s.f8576a.mo12516a());
                            str3 = C2397f0.m6296E(hashMap);
                        } catch (Throwable th) {
                            C6606a.m15600a(cls, th);
                        }
                    }
                    if (str3.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        jSONObject.put("ud", str3);
                    }
                }
                String str4 = bVar.f8608d;
                if (str4 != null) {
                    jSONObject.put("installer_package", str4);
                }
            }
            try {
                C2397f0.m6304M(context, jSONObject);
            } catch (Exception e) {
                C2436x.C2437a aVar = C2436x.f8729d;
                C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
            }
            JSONObject o = C2397f0.m6321o();
            if (o != null) {
                Iterator<String> keys = o.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, o.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            C2317b.f8488b.readLock().unlock();
            throw th2;
        }
    }
}
