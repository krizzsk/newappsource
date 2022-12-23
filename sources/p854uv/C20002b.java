package p854uv;

import aa0.C7527d;
import android.content.Context;
import android.view.View;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.app.useraccount.manager.favorites.LocationFavorite;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ResourceImage;
import com.moovit.search.C7606b;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import p001a0.C0016g;
import p455dy.C16753e;
import p977zz.C20944i0;
import p977zz.C20964s0;
import z70.C13321a;
import z70.C13324c;
import z70.C13327e;
import z70.C13329g;
import z70.C13335l;

/* renamed from: uv.b */
public final class C20002b extends C13324c {

    /* renamed from: e */
    public final C7527d<LocationDescriptor> f50849e = new C7527d<>(C7527d.f23004f);

    /* renamed from: f */
    public final C16753e f50850f;

    /* renamed from: g */
    public final C20001a f50851g;

    /* renamed from: uv.b$a */
    public static class C20003a implements Callable<C13324c.C13325a> {

        /* renamed from: b */
        public final C16753e f50852b;

        /* renamed from: c */
        public final C7527d<LocationDescriptor> f50853c;

        /* renamed from: d */
        public final LatLonE6 f50854d;

        public C20003a(C16753e eVar, C7527d dVar, LatLonE6 latLonE6) {
            C21100e.m49373x(eVar, "ufm");
            this.f50852b = eVar;
            this.f50853c = dVar;
            this.f50854d = latLonE6;
        }

        public final Object call() throws Exception {
            int i;
            C16753e eVar = this.f50852b;
            LocationFavorite locationFavorite = eVar.f43620d;
            LocationFavorite locationFavorite2 = eVar.f43621e;
            List<LocationFavorite> k = eVar.mo49437k();
            if (k != null) {
                i = k.size();
            } else {
                i = 0;
            }
            ArrayList arrayList = new ArrayList(i + 2);
            if (locationFavorite != null) {
                LocationDescriptor locationDescriptor = locationFavorite.f40600d;
                if (locationDescriptor.f23655j == null) {
                    locationDescriptor.f23655j = new ResourceImage(R.drawable.ic_home_24_on_surface_emphasis_high, new String[0]);
                }
                arrayList.add(locationDescriptor);
            }
            if (locationFavorite2 != null) {
                LocationDescriptor locationDescriptor2 = locationFavorite2.f40600d;
                if (locationDescriptor2.f23655j == null) {
                    locationDescriptor2.f23655j = new ResourceImage(R.drawable.ic_work_24_on_surface_emphasis_high, new String[0]);
                }
                arrayList.add(locationDescriptor2);
            }
            if (k != null) {
                for (LocationFavorite locationFavorite3 : k) {
                    LocationDescriptor locationDescriptor3 = locationFavorite3.f40600d;
                    if (locationDescriptor3.f23655j == null) {
                        locationDescriptor3.f23655j = new ResourceImage(R.drawable.ic_pin_24_on_surface_emphasis_high, new String[0]);
                    }
                    arrayList.add(locationDescriptor3);
                }
            }
            C7527d<LocationDescriptor> dVar = this.f50853c;
            if (dVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!dVar.mo19661o(it.next())) {
                        it.remove();
                    }
                }
            }
            return new C13324c.C13325a((List<LocationDescriptor>) arrayList, this.f50854d);
        }
    }

    public C20002b(Context context, C7606b bVar, C16753e eVar) {
        super(context, "favorite_locations");
        this.f50850f = eVar;
        C20001a aVar = new C20001a(bVar);
        this.f50851g = aVar;
        eVar.mo49434h(aVar);
    }

    /* renamed from: a */
    public final String mo23775a(String str, LatLonE6 latLonE6) {
        if (C20964s0.m49090h(str) || latLonE6 == null) {
            return str;
        }
        StringBuilder t = C0016g.m36t(str, "_");
        t.append(C13329g.m33603b(latLonE6));
        return t.toString();
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        C20003a aVar;
        this.f50849e.mo23793a(str);
        if (C20964s0.m49090h(str)) {
            aVar = new C20003a(this.f50850f, (C7527d) null, (LatLonE6) null);
        } else {
            aVar = new C20003a(this.f50850f, this.f50849e, latLonE6);
        }
        return Tasks.call(threadPoolExecutor, aVar);
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: f */
    public final void mo23778f() {
        super.mo23778f();
        this.f50850f.mo49446u(this.f50851g);
    }

    /* renamed from: i */
    public final C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        SearchAction searchAction;
        if (!LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b) || locationDescriptor.f23649d == null) {
            searchAction = null;
        } else {
            searchAction = SearchAction.SHOW_DETAILS;
        }
        return C13335l.m33605a(str, str2, locationDescriptor, searchAction, i);
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        return new C13327e(str, context.getString(R.string.dashboard_favorites_title), arrayList, (C20944i0) null, (View) null);
    }
}
