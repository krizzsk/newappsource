package p030bo.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: bo.app.z4 */
public abstract class C1746z4 extends C1738y4 {

    /* renamed from: g */
    public Map<String, String> f6138g = new HashMap();

    public C1746z4(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: a */
    public void mo6414a(Map<String, String> map) {
        this.f6138g = new HashMap(map);
    }

    /* renamed from: y */
    public Map<String, String> mo6507y() {
        return Collections.unmodifiableMap(this.f6138g);
    }
}
