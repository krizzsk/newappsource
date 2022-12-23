package p097g8;

import com.facebook.appevents.AppEvent;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONObject;
import p009a8.C0115o;
import p262t8.C6606a;

/* renamed from: g8.a */
public final class C4845a {

    /* renamed from: a */
    public static final C4845a f16269a = new C4845a();

    /* renamed from: b */
    public static boolean f16270b;

    /* renamed from: c */
    public static final ArrayList f16271c = new ArrayList();

    /* renamed from: d */
    public static final HashSet f16272d = new HashSet();

    /* renamed from: g8.a$a */
    public static final class C4846a {

        /* renamed from: a */
        public String f16273a;

        /* renamed from: b */
        public List<String> f16274b;

        public C4846a(String str, ArrayList arrayList) {
            this.f16273a = str;
            this.f16274b = arrayList;
        }
    }

    /* renamed from: b */
    public static final void m12166b(ArrayList arrayList) {
        Class<C4845a> cls = C4845a.class;
        if (!C6606a.m15601b(cls)) {
            try {
                C24362h.m61211f(arrayList, "events");
                if (f16270b) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (f16272d.contains(((AppEvent) it.next()).mo12454c())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo20334a() {
        if (!C6606a.m15601b(this)) {
            try {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                boolean z = false;
                C2429s f = FetchedAppSettingsManager.m6264f(C0115o.m211b(), false);
                if (f != null) {
                    String str = f.f8720m;
                    if (str != null) {
                        if (str.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            JSONObject jSONObject = new JSONObject(str);
                            f16271c.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        HashSet hashSet = f16272d;
                                        C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                                        hashSet.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                                        C4846a aVar = new C4846a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            aVar.f16274b = C2397f0.m6313g(optJSONArray);
                                        }
                                        f16271c.add(aVar);
                                    }
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
