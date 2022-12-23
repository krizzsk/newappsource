package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bo.app.t */
public final class C1691t implements C1658p {

    /* renamed from: b */
    public static final String f5998b = AppboyLogger.getBrazeLogTag(C1691t.class);

    /* renamed from: a */
    public final C1658p f5999a;

    public C1691t(C1658p pVar) {
        this.f5999a = pVar;
    }

    /* renamed from: a */
    public JSONObject mo6258a(URI uri, Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return this.f5999a.mo6258a(uri, map);
        } finally {
            C1554d0 d0Var = C1554d0.GET;
            String a = C1655o4.m4562a(uri, map, d0Var);
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = f5998b;
            StringBuilder l = C13555b.m33973l("Request(id = ", a, ") Executed in [");
            l.append(currentTimeMillis2 - currentTimeMillis);
            l.append("ms] [");
            l.append(d0Var.toString());
            l.append(" : ");
            l.append(uri.toString());
            l.append("]");
            AppboyLogger.m5448d(str, l.toString());
        }
    }

    /* renamed from: a */
    public JSONObject mo6259a(URI uri, Map<String, String> map, JSONObject jSONObject) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return this.f5999a.mo6259a(uri, map, jSONObject);
        } finally {
            C1554d0 d0Var = C1554d0.POST;
            String a = C1655o4.m4562a(uri, map, jSONObject, d0Var);
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = f5998b;
            StringBuilder l = C13555b.m33973l("Request(id = ", a, ") Executed in [");
            l.append(currentTimeMillis2 - currentTimeMillis);
            l.append("ms] [");
            l.append(d0Var.toString());
            l.append(":");
            l.append(uri.toString());
            l.append("]");
            AppboyLogger.m5448d(str, l.toString());
        }
    }
}
