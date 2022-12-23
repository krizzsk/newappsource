package p040c8;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.text.C24179b;
import mf0.C24362h;
import org.json.JSONObject;
import p262t8.C6606a;

/* renamed from: c8.c */
public final class C1804c {

    /* renamed from: d */
    public static final CopyOnWriteArraySet f6294d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final String f6295a;

    /* renamed from: b */
    public final String f6296b;

    /* renamed from: c */
    public final List<String> f6297c;

    /* renamed from: c8.c$a */
    public static final class C1805a {
        /* renamed from: a */
        public static void m5117a(JSONObject jSONObject) {
            boolean z;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C24362h.m61210e(optString, "k");
                    if (optString.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        CopyOnWriteArraySet a = C1804c.m5115a();
                        C24362h.m61210e(next, LinksConfiguration.KEY_KEY);
                        List Y = C24179b.m60577Y(optString, new String[]{AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR}, 0, 6);
                        C24362h.m61210e(optString2, "v");
                        a.add(new C1804c(next, Y, optString2));
                    }
                }
            }
        }
    }

    public C1804c() {
        throw null;
    }

    public C1804c(String str, List list, String str2) {
        this.f6295a = str;
        this.f6296b = str2;
        this.f6297c = list;
    }

    /* renamed from: a */
    public static final /* synthetic */ CopyOnWriteArraySet m5115a() {
        Class<C1804c> cls = C1804c.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return f6294d;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo6618b() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            return this.f6295a;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }
}
