package p399bw;

import aa0.C7537i;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.moovit.MoovitActivity;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import f00.C16919g;
import p455dy.C16753e;
import p669mz.C18482c;
import p810sz.C19589j;
import p810sz.C19600l;
import p824tp.C19722a0;
import p834tz.C19803b;
import p834tz.C19804c;
import p977zz.C20944i0;
import p977zz.C20975x0;

/* renamed from: bw.d */
public final class C13700d {

    /* renamed from: d */
    public static final C16919g.C16924e f33765d = new C16919g.C16924e("suggest_frequent_favorites_location_declined", 0);

    /* renamed from: e */
    public static final C13700d f33766e = new C13700d(MoovitAppApplication.m37038x());

    /* renamed from: a */
    public C7537i f33767a;

    /* renamed from: b */
    public ServerId f33768b;

    /* renamed from: c */
    public final SharedPreferences f33769c;

    public C13700d(MoovitAppApplication moovitAppApplication) {
        this.f33769c = moovitAppApplication.getSharedPreferences("smart_locations", 0);
    }

    /* renamed from: a */
    public final boolean mo40567a(MoovitActivity moovitActivity, SearchLocationItem searchLocationItem) {
        ServerId serverId = ((C19722a0) moovitActivity.getSystemService("user_context")).f50160a.f32927c;
        if (this.f33767a == null || !C20975x0.m49118e(this.f33768b, serverId)) {
            this.f33768b = serverId;
            C7537i iVar = new C7537i(moovitActivity, "smart_location_tracking", this.f33768b, new C19803b(SearchLocationItem.f39453n, C19589j.f49774f), new C19804c(SearchLocationItem.f39452m, C19600l.f49785o));
            this.f33767a = iVar;
            iVar.mo51501d();
        }
        if (f33765d.mo19759a(this.f33769c).intValue() == 3 || searchLocationItem.f39457b.f15142b == -1) {
            return false;
        }
        C16753e eVar = (C16753e) moovitActivity.getSystemService("user_favorites_manager_service");
        if (eVar != null) {
            for (LocationFavorite locationFavorite : eVar.mo49437k()) {
                if (C20975x0.m49118e(((LocationDescriptor) locationFavorite.f52687b).f23649d, searchLocationItem.f39457b)) {
                    return false;
                }
            }
            LocationFavorite locationFavorite2 = eVar.f43620d;
            if (locationFavorite2 != null && C20975x0.m49118e(((LocationDescriptor) locationFavorite2.f52687b).f23649d, searchLocationItem.f39457b)) {
                return false;
            }
            LocationFavorite locationFavorite3 = eVar.f43621e;
            if (locationFavorite3 != null && C20975x0.m49118e(((LocationDescriptor) locationFavorite3.f52687b).f23649d, searchLocationItem.f39457b)) {
                return false;
            }
            C7537i iVar2 = this.f33767a;
            iVar2.mo51499b();
            C18482c<T> cVar = iVar2.f48432b;
            int size = cVar.size();
            for (int i = 0; i < size; i++) {
                C20944i0 i0Var = (C20944i0) cVar.get(i);
                if (((SearchLocationItem) i0Var.f52692a).equals(searchLocationItem)) {
                    int intValue = ((Integer) i0Var.f52693b).intValue() + 1;
                    cVar.set(i, new C20944i0((SearchLocationItem) i0Var.f52692a, Integer.valueOf(intValue)));
                    this.f33767a.mo51498a();
                    if (3 != intValue) {
                        return false;
                    }
                    int i2 = C13697b.f33757n;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("location_item", (SearchLocationItem) i0Var.f52692a);
                    C13697b bVar = new C13697b();
                    bVar.setArguments(bundle);
                    bVar.show(moovitActivity.getSupportFragmentManager(), "SMART_LOCATION_FRAGMENT");
                    return true;
                }
            }
            cVar.add(new C20944i0(searchLocationItem, 1));
            this.f33767a.mo51498a();
            return false;
        }
        throw new ApplicationBugException(moovitActivity.getClass().getSimpleName() + " does not declare required data part " + "USER_ACCOUNT");
    }
}
