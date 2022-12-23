package q20;

import c70.C13752e;
import c70.C13753f;
import c70.C13772m;
import ce0.C21100e;
import com.moovit.map.collections.category.CategoryMapItemSource;
import com.moovit.request.RequestOptions;
import p20.C18878e;
import p824tp.C19728f;

/* renamed from: q20.b */
public final class C19076b extends C18878e<C19075a<?>, C19077c> {

    /* renamed from: a */
    public final CategoryMapItemSource f48498a;

    public C19076b(CategoryMapItemSource categoryMapItemSource) {
        C21100e.m49373x(categoryMapItemSource, "source");
        this.f48498a = categoryMapItemSource;
    }

    /* renamed from: a */
    public final C13753f<C13772m<C19077c>> mo51344a(C13752e eVar) {
        C13772m mVar = new C13772m(eVar, C13772m.m34412M(eVar.f33852a, this.f48498a.getUrlResId(), this.f48498a.getProtocolVersion(), eVar.f33853b, (C19728f) null), C19077c.class);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return new C13753f<>(mo51345b(), mVar, requestOptions);
    }

    /* renamed from: b */
    public final String mo51345b() {
        return this.f48498a.getId();
    }
}
