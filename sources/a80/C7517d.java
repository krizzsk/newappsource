package a80;

import android.content.Context;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.C7606b;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import l30.C5573e;
import p824tp.C19746x;
import p977zz.C20944i0;
import z70.C13321a;
import z70.C13324c;
import z70.C13327e;
import z70.C13335l;

/* renamed from: a80.d */
public final class C7517d extends C13324c {

    /* renamed from: e */
    public final C7513a f22983e;

    /* renamed from: f */
    public final C12638d f22984f;

    /* renamed from: g */
    public final C7516c f22985g;

    public C7517d(Context context, C7606b bVar, C7513a aVar, C12638d dVar) {
        super(context, "search_examples");
        this.f22983e = aVar;
        this.f22984f = dVar;
        C7516c cVar = new C7516c(bVar);
        this.f22985g = cVar;
        dVar.mo51499b();
        dVar.f48438c.mo50903a(cVar);
    }

    /* renamed from: a */
    public final String mo23775a(String str, LatLonE6 latLonE6) {
        return "search_examples";
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.call(threadPoolExecutor, new C5573e(this, 1));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: f */
    public final void mo23778f() {
        super.mo23778f();
        C12638d dVar = this.f22984f;
        dVar.mo51499b();
        dVar.f48438c.mo50904b(this.f22985g);
    }

    /* renamed from: i */
    public final C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        SearchAction searchAction;
        if (!LocationDescriptor.LocationType.STOP.equals(locationDescriptor.f23647b) || locationDescriptor.f23649d == null) {
            searchAction = SearchAction.COPY;
        } else {
            searchAction = SearchAction.SHOW_DETAILS;
        }
        return C13335l.m33605a(str, str2, locationDescriptor, searchAction, i);
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        return new C13327e(str, context.getString(C19746x.search_location_example_section_header), arrayList, (C20944i0) null, (View) null);
    }
}
