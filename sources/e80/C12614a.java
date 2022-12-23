package e80;

import android.content.Context;
import android.text.style.StyleSpan;
import android.view.View;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.SearchAction;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p001a0.C0016g;
import p009a8.C0114n;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20944i0;
import z70.C13321a;
import z70.C13324c;
import z70.C13327e;
import z70.C13329g;
import z70.C13335l;

/* renamed from: e80.a */
public final class C12614a extends C13324c {

    /* renamed from: e */
    public final WeakReference<SearchLocationActivity> f31174e;

    /* renamed from: f */
    public final C13752e f31175f;

    public C12614a(SearchLocationActivity searchLocationActivity) {
        super(searchLocationActivity, "moovit_places");
        C21100e.m49373x(searchLocationActivity, "host");
        this.f31174e = new WeakReference<>(searchLocationActivity);
        this.f31175f = searchLocationActivity.mo44548x1();
    }

    /* renamed from: a */
    public final String mo23775a(String str, LatLonE6 latLonE6) {
        if (latLonE6 == null) {
            return str;
        }
        StringBuilder t = C0016g.m36t(str, "_");
        t.append(C13329g.m33603b(latLonE6));
        return t.toString();
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.call(threadPoolExecutor, new C12615b(this.f31175f, str, latLonE6)).onSuccessTask(threadPoolExecutor, new C0114n(19));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: i */
    public final C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        return C13335l.m33605a(str, str2, locationDescriptor, SearchAction.COPY, i);
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        String string = context.getString(C19746x.search_locations_section_title);
        WeakReference<SearchLocationActivity> weakReference = this.f31174e;
        StyleSpan styleSpan = C13329g.f33089a;
        return new C13327e(str, string, arrayList, new C20944i0(Integer.valueOf(C19742t.search_location_section_show_on_map_action), new C13329g.C13330a(this, weakReference, arrayList)), (View) null);
    }
}
