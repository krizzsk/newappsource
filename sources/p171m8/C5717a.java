package p171m8;

import com.facebook.internal.C2397f0;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: m8.a */
public final class C5717a {

    /* renamed from: a */
    public static final C5717a f18537a = new C5717a();

    /* renamed from: b */
    public static boolean f18538b;

    /* renamed from: c */
    public static final ArrayList f18539c = new ArrayList();

    /* renamed from: d */
    public static final CopyOnWriteArraySet f18540d = new CopyOnWriteArraySet();

    /* renamed from: m8.a$a */
    public static final class C5718a {

        /* renamed from: a */
        public String f18541a;

        /* renamed from: b */
        public Map<String, String> f18542b;

        public C5718a(String str, HashMap hashMap) {
            this.f18541a = str;
            this.f18542b = hashMap;
        }
    }

    /* renamed from: a */
    public final String mo21555a(String str, String str2) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            Iterator it = new ArrayList(f18539c).iterator();
            while (it.hasNext()) {
                C5718a aVar = (C5718a) it.next();
                if (aVar != null) {
                    if (C24362h.m61206a(str, aVar.f18541a)) {
                        for (String next : aVar.f18542b.keySet()) {
                            if (C24362h.m61206a(str2, next)) {
                                return aVar.f18542b.get(next);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo21556b() {
        String str;
        if (!C6606a.m15601b(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                boolean z = false;
                C2429s f = FetchedAppSettingsManager.m6264f(C0115o.m211b(), false);
                if (f != null && (str = f.f8720m) != null) {
                    if (str.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        JSONObject jSONObject = new JSONObject(str);
                        f18539c.clear();
                        f18540d.clear();
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                            if (jSONObject2 != null) {
                                JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                                C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                                C5718a aVar = new C5718a(next, new HashMap());
                                if (optJSONObject != null) {
                                    aVar.f18542b = C2397f0.m6315i(optJSONObject);
                                    f18539c.add(aVar);
                                }
                                if (jSONObject2.has("process_event_name")) {
                                    f18540d.add(aVar.f18541a);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
