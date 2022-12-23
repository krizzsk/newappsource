package p873vq;

import android.content.Context;
import android.net.Uri;
import c70.C13752e;
import c70.C13753f;
import c70.C13772m;
import com.moovit.app.ads.mapitem.C14751a;
import com.moovit.map.collections.category.CategoryMapItemSource;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import com.moovit.request.RequestOptions;
import mf0.C24362h;
import p20.C18878e;
import p824tp.C19728f;
import q20.C19075a;

/* renamed from: vq.a */
public final class C20196a extends C18878e<C19075a<DirectAdMetadata>, C14751a> {

    /* renamed from: a */
    public final CategoryMapItemSource f51235a = CategoryMapItemSource.DIRECT_AD;

    /* renamed from: a */
    public final C13753f<C13772m<C14751a>> mo51344a(C13752e eVar) {
        C24362h.m61211f(eVar, "requestContext");
        Context context = eVar.f33852a;
        C24362h.m61210e(context, "requestContext.androidContext");
        Uri M = C13772m.m34412M(context, this.f51235a.getUrlResId(), this.f51235a.getProtocolVersion(), eVar.f33853b, (C19728f) null);
        C24362h.m61210e(M, "createResourceUri(contex…rsion, userContext, null)");
        C13772m mVar = new C13772m(eVar, M, C14751a.class);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return new C13753f<>(mo51345b(), mVar, requestOptions);
    }

    /* renamed from: b */
    public final String mo51345b() {
        String id = this.f51235a.getId();
        C24362h.m61210e(id, "source.id");
        return id;
    }
}
