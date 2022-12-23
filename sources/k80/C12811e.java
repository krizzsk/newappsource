package k80;

import android.content.Context;
import c70.C13746a;
import c70.C13752e;
import p824tp.C19721a;
import p824tp.C19731i;
import p824tp.C19746x;
import p977zz.C20930c;

/* renamed from: k80.e */
public final class C12811e extends C13746a<C12811e, C12812f> {
    public C12811e(C13752e eVar, String str) {
        super(eVar, C19746x.server_path_cdn_server_url, C19746x.api_path_service_alert_by_id, false, C12812f.class);
        Context context = eVar.f33852a;
        mo52629r("alertId", str);
        mo52629r("langKey", C20930c.m49020b(context).getLanguage());
        mo52629r("metroId", eVar.f33853b.f50160a.f32927c.mo19751c());
        C19721a aVar = C19731i.m47197a(context).f50171a;
        mo52629r("apiKey", aVar.f50155f);
        mo52627p(aVar.f50159j, "osTypeId");
    }
}
