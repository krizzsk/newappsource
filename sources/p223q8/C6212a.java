package p223q8;

import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0124u;
import p584jl.C17885a;

/* renamed from: q8.a */
public final /* synthetic */ class C6212a implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ int f19628a;

    /* renamed from: b */
    public final /* synthetic */ Object f19629b;

    public /* synthetic */ C6212a(Object obj, int i) {
        this.f19628a = i;
        this.f19629b = obj;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        Boolean bool = null;
        switch (this.f19628a) {
            case 0:
                InstrumentData instrumentData = (InstrumentData) this.f19629b;
                C24362h.m61211f(instrumentData, "$instrumentData");
                try {
                    if (uVar.f366c == null) {
                        JSONObject jSONObject = uVar.f367d;
                        if (jSONObject != null) {
                            bool = Boolean.valueOf(jSONObject.getBoolean(WidgetMessageParser.KEY_SUCCESS));
                        }
                        if (C24362h.m61206a(bool, Boolean.TRUE)) {
                            C17885a.m44408K(instrumentData.f8643a);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            default:
                List<InstrumentData> list = (List) this.f19629b;
                C24362h.m61211f(list, "$validReports");
                try {
                    if (uVar.f366c == null) {
                        JSONObject jSONObject2 = uVar.f367d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean(WidgetMessageParser.KEY_SUCCESS));
                        }
                        if (C24362h.m61206a(bool, Boolean.TRUE)) {
                            for (InstrumentData instrumentData2 : list) {
                                C17885a.m44408K(instrumentData2.f8643a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }
}
