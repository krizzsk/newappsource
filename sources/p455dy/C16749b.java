package p455dy;

import c00.C13717b;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0017h;
import p358af.C13437d;

/* renamed from: dy.b */
public final class C16749b {

    /* renamed from: a */
    public final ServerId f43607a;

    /* renamed from: b */
    public final List<ServerId> f43608b;

    /* renamed from: c */
    public final List<ServerId> f43609c;

    /* renamed from: d */
    public final List<LocationFavorite> f43610d;

    /* renamed from: e */
    public final LocationFavorite f43611e;

    /* renamed from: f */
    public final LocationFavorite f43612f;

    public C16749b(ServerId serverId, ArrayList arrayList, ArrayList arrayList2, List list, LocationFavorite locationFavorite, LocationFavorite locationFavorite2) {
        this.f43607a = serverId;
        this.f43608b = arrayList;
        this.f43609c = arrayList2;
        this.f43610d = list;
        this.f43611e = locationFavorite;
        this.f43612f = locationFavorite2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(C13437d.m33705j(C16749b.class, new StringBuilder(), "["));
        sb.append("[metroId,");
        sb.append(this.f43607a);
        sb.append("]");
        LocationFavorite locationFavorite = this.f43611e;
        String str2 = null;
        if (locationFavorite != null) {
            str = locationFavorite.toString();
        } else {
            str = null;
        }
        LocationFavorite locationFavorite2 = this.f43612f;
        if (locationFavorite2 != null) {
            str2 = locationFavorite2.toString();
        }
        C0017h.m61R(sb, "[HOME, ", str, "]", "[WORK, ");
        C16530d.m42019l(sb, str2, "]", "[FAV LOCATIONS, ");
        sb.append(C13717b.m34269p(this.f43610d));
        sb.append("[FAV LINE GROUPS, ");
        sb.append(C13717b.m34269p(this.f43608b));
        sb.append("]");
        sb.append("[FAV STOPS, ");
        sb.append(C13717b.m34269p(this.f43609c));
        sb.append("]");
        sb.append("]");
        return sb.toString();
    }
}
