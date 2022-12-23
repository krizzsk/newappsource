package p455dy;

import com.appboy.models.outgoing.FacebookUser;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import p455dy.C16753e;
import z20.C20806a;

/* renamed from: dy.a */
public final class C16748a implements C16753e.C16756c {
    /* renamed from: h */
    public final void mo44786h(C16753e eVar, LocationFavorite locationFavorite) {
    }

    /* renamed from: k */
    public final void mo44787k(C16753e eVar, LocationFavorite locationFavorite) {
        if (locationFavorite != null) {
            C20806a.C20807a aVar = new C20806a.C20807a("add_favorite_location_tap");
            aVar.mo52934b("work", "type");
            aVar.mo52935c();
        }
    }

    /* renamed from: s */
    public final void mo44788s(C16753e eVar, LocationFavorite locationFavorite) {
        C20806a.C20807a aVar = new C20806a.C20807a("add_favorite_location_tap");
        aVar.mo52934b(FacebookUser.LOCATION_OUTER_OBJECT_KEY, "type");
        aVar.mo52935c();
    }

    /* renamed from: t1 */
    public final void mo44789t1(C16753e eVar, LocationFavorite locationFavorite) {
        if (locationFavorite != null) {
            C20806a.C20807a aVar = new C20806a.C20807a("add_favorite_location_tap");
            aVar.mo52934b("home", "type");
            aVar.mo52935c();
        }
    }

    /* renamed from: y0 */
    public final void mo44790y0(C16753e eVar, LocationFavorite locationFavorite) {
        C20806a.C20807a aVar = new C20806a.C20807a("add_favorite_location_tap");
        aVar.mo52934b(FacebookUser.LOCATION_OUTER_OBJECT_KEY, "type");
        aVar.mo52935c();
    }
}
