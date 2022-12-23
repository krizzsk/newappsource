package p274u8;

import com.facebook.GraphRequest;
import java.util.ArrayList;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0124u;
import p584jl.C17885a;

/* renamed from: u8.c */
public final /* synthetic */ class C6726c implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f20824a;

    public /* synthetic */ C6726c(ArrayList arrayList) {
        this.f20824a = arrayList;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        Boolean bool;
        ArrayList<C6724a> arrayList = this.f20824a;
        C24362h.m61211f(arrayList, "$validReports");
        try {
            if (uVar.f366c == null) {
                JSONObject jSONObject = uVar.f367d;
                if (jSONObject == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(jSONObject.getBoolean(WidgetMessageParser.KEY_SUCCESS));
                }
                if (C24362h.m61206a(bool, Boolean.TRUE)) {
                    for (C6724a aVar : arrayList) {
                        C17885a.m44408K(aVar.f20820a);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
