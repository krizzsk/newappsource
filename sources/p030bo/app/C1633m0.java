package p030bo.app;

import com.appboy.models.IInAppMessage;
import com.appboy.support.JsonUtils;
import org.json.JSONObject;

/* renamed from: bo.app.m0 */
public final class C1633m0 {

    /* renamed from: a */
    public final IInAppMessage f5823a;

    /* renamed from: b */
    public final String f5824b;

    /* renamed from: c */
    public final C1710v4 f5825c;

    public C1633m0(C1710v4 v4Var, IInAppMessage iInAppMessage, String str) {
        this.f5824b = str;
        iInAppMessage.getClass();
        this.f5823a = iInAppMessage;
        this.f5825c = v4Var;
    }

    /* renamed from: a */
    public IInAppMessage mo6215a() {
        return this.f5823a;
    }

    /* renamed from: b */
    public C1710v4 mo6216b() {
        return this.f5825c;
    }

    /* renamed from: c */
    public String mo6217c() {
        return this.f5824b;
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString((JSONObject) this.f5823a.forJsonPut()) + "\nTriggered Action Id: " + this.f5825c.getId() + "\nUser Id: " + this.f5824b;
    }
}
