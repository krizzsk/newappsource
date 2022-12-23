package p009a8;

import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p236r8.C6267d;
import p262t8.C6606a;
import p584jl.C17885a;

/* renamed from: a8.q */
public final /* synthetic */ class C0118q implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ int f352a;

    /* renamed from: b */
    public final /* synthetic */ Object f353b;

    public /* synthetic */ C0118q(List list, int i) {
        this.f352a = i;
        this.f353b = list;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        Boolean bool;
        switch (this.f352a) {
            case 0:
                GraphRequest.C2282d dVar = (GraphRequest.C2282d) this.f353b;
                if (dVar != null) {
                    dVar.onCompleted();
                    return;
                }
                return;
            default:
                List<InstrumentData> list = (List) this.f353b;
                AtomicBoolean atomicBoolean = C6267d.f19738a;
                Class<C6267d> cls = C6267d.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C24362h.m61211f(list, "$validReports");
                        try {
                            if (uVar.f366c == null) {
                                JSONObject jSONObject = uVar.f367d;
                                if (jSONObject == null) {
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(jSONObject.getBoolean(WidgetMessageParser.KEY_SUCCESS));
                                }
                                if (C24362h.m61206a(bool, Boolean.TRUE)) {
                                    for (InstrumentData instrumentData : list) {
                                        C17885a.m44408K(instrumentData.f8643a);
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
