package oc0;

import com.unity3d.scar.adapter.common.GMAEvent;
import pc0.C13008c;

/* renamed from: oc0.a */
public final class C12981a extends C12988h {
    public C12981a(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, (String) null, objArr);
    }

    /* renamed from: a */
    public static C12981a m32861a(C13008c cVar) {
        String format = String.format("Cannot show ad that is not loaded for placement %s", new Object[]{cVar.f32193a});
        return new C12981a(GMAEvent.AD_NOT_LOADED_ERROR, format, cVar.f32193a, cVar.f32194b, format);
    }

    /* renamed from: b */
    public static C12981a m32862b(C13008c cVar) {
        String format = String.format("Missing queryInfoMetadata for ad %s", new Object[]{cVar.f32193a});
        return new C12981a(GMAEvent.QUERY_NOT_FOUND_ERROR, format, cVar.f32193a, cVar.f32194b, format);
    }

    public final String getDomain() {
        return "GMA";
    }

    public C12981a(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }
}
