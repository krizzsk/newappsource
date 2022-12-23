package p030bo.app;

import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p001a0.C0017h;

/* renamed from: bo.app.q */
public final class C1668q implements C1658p {

    /* renamed from: b */
    public static final String f5943b = AppboyLogger.getBrazeLogTag(C1668q.class);

    /* renamed from: a */
    public final C1658p f5944a;

    public C1668q(C1658p pVar) {
        this.f5944a = pVar;
    }

    /* renamed from: a */
    public final String mo6303a(URI uri, Map<String, String> map, String str, JSONObject jSONObject) {
        StringBuilder O = C0017h.m58O(1024, "Making request with id => \"", str, "\"\n", "to url: ");
        O.append(uri);
        O.append("\n\nwith headers:");
        O.append(mo6304a(map));
        O.append(10);
        if (jSONObject != null) {
            O.append("\nand JSON:\n");
            O.append(JsonUtils.getPrettyPrintedString(jSONObject));
        }
        return O.toString();
    }

    /* renamed from: b */
    public final void mo6307b(URI uri, Map<String, String> map, String str) {
        try {
            AppboyLogger.m5448d(f5943b, mo6302a(uri, map, str));
        } catch (Exception e) {
            AppboyLogger.m5449d(f5943b, "Exception while logging request: ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public JSONObject mo6258a(URI uri, Map<String, String> map) {
        String a = C1655o4.m4562a(uri, map, C1554d0.GET);
        mo6307b(uri, map, a);
        JSONObject a2 = this.f5944a.mo6258a(uri, map);
        mo6306a(a2, a);
        return a2;
    }

    /* renamed from: a */
    public JSONObject mo6259a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        String a = C1655o4.m4562a(uri, map, jSONObject, C1554d0.POST);
        mo6305a(uri, map, jSONObject, a);
        JSONObject a2 = this.f5944a.mo6259a(uri, map, jSONObject);
        mo6306a(a2, a);
        return a2;
    }

    /* renamed from: a */
    public final void mo6305a(URI uri, Map<String, String> map, JSONObject jSONObject, String str) {
        try {
            AppboyLogger.m5448d(f5943b, mo6303a(uri, map, str, jSONObject));
        } catch (Exception e) {
            AppboyLogger.m5449d(f5943b, "Exception while logging request: ", (Throwable) e);
        }
    }

    /* renamed from: a */
    public final void mo6306a(JSONObject jSONObject, String str) {
        String str2;
        if (jSONObject == null) {
            str2 = "none";
        } else {
            try {
                str2 = JsonUtils.getPrettyPrintedString(jSONObject);
            } catch (Exception e) {
                AppboyLogger.m5449d(f5943b, "Exception while logging result: ", (Throwable) e);
                return;
            }
        }
        String str3 = f5943b;
        AppboyLogger.m5448d(str3, "Result(id = " + str + ") \n" + str2);
    }

    /* renamed from: a */
    public final String mo6304a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : map.entrySet()) {
            StringBuilder k = C13555b.m33972k("\n\"");
            k.append((String) next.getKey());
            k.append("\" => \"");
            k.append((String) next.getValue());
            k.append("\"");
            arrayList.add(k.toString());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        if (sb.length() == 0) {
            return "";
        }
        return sb.substring(0, sb.length() - 2);
    }

    /* renamed from: a */
    public final String mo6302a(URI uri, Map<String, String> map, String str) {
        return mo6303a(uri, map, str, (JSONObject) null);
    }
}
