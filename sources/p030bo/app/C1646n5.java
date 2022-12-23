package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.List;
import org.json.JSONArray;

/* renamed from: bo.app.n5 */
public abstract class C1646n5 implements C1551c5 {

    /* renamed from: b */
    public static final String f5866b = AppboyLogger.getBrazeLogTag(C1646n5.class);

    /* renamed from: a */
    public final List<C1551c5> f5867a;

    public C1646n5(List<C1551c5> list) {
        this.f5867a = list;
    }

    /* renamed from: e */
    public JSONArray forJsonPut() {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C1551c5 forJsonPut : this.f5867a) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(f5866b, "Caught exception creating Json.", e);
        }
        return jSONArray;
    }
}
