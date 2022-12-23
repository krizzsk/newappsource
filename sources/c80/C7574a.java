package c80;

import android.content.Context;
import android.text.style.StyleSpan;
import android.view.View;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.SearchLocationActivity;
import d80.C12599b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p102h0.C5021e;
import p824tp.C19728f;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20944i0;
import q00.C19047a;
import z70.C13324c;
import z70.C13327e;
import z70.C13329g;

/* renamed from: c80.a */
public final class C7574a extends C13324c {

    /* renamed from: e */
    public final WeakReference<SearchLocationActivity> f23065e;

    /* renamed from: f */
    public final C19047a f23066f;

    /* renamed from: g */
    public final C19728f f23067g;

    public C7574a(SearchLocationActivity searchLocationActivity, C19047a aVar, C19728f fVar) {
        super(searchLocationActivity, "google_geocode");
        C21100e.m49373x(searchLocationActivity, "host");
        this.f23065e = new WeakReference<>(searchLocationActivity);
        this.f23066f = aVar;
        this.f23067g = fVar;
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.call(threadPoolExecutor, new C12599b(this.f23152a, this.f23066f, this.f23067g, str)).onSuccessTask(threadPoolExecutor, new C5021e(latLonE6, 15));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return true;
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        String string = context.getString(C19746x.search_locations_section_title);
        WeakReference<SearchLocationActivity> weakReference = this.f23065e;
        StyleSpan styleSpan = C13329g.f33089a;
        return new C13327e(str, string, arrayList, new C20944i0(Integer.valueOf(C19742t.search_location_section_show_on_map_action), new C13329g.C13330a(this, weakReference, arrayList)), (View) null);
    }
}
