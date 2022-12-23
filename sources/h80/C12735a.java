package h80;

import android.content.Context;
import android.view.View;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p001a0.C0016g;
import p066e0.C4454r0;
import p824tp.C19728f;
import p824tp.C19746x;
import p977zz.C20944i0;
import z70.C13321a;
import z70.C13324c;
import z70.C13327e;
import z70.C13329g;
import z70.C13335l;

/* renamed from: h80.a */
public final class C12735a extends C13324c {

    /* renamed from: e */
    public final C13752e f31458e;

    /* renamed from: f */
    public final C19728f f31459f;

    public C12735a(C13752e eVar, C19728f fVar) {
        super(eVar.f33852a, "moovit_stations");
        this.f31458e = eVar;
        this.f31459f = fVar;
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
        return Tasks.call(threadPoolExecutor, new C12736b(this.f31458e, this.f31459f, str, latLonE6)).onSuccessTask(threadPoolExecutor, new C4454r0(14));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: i */
    public final C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        return C13335l.m33605a(str, str2, locationDescriptor, SearchAction.SHOW_DETAILS, i);
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        String string = context.getString(C19746x.search_stops_section_title);
        int size = arrayList.size();
        List list = arrayList;
        if (size > 4) {
            list = arrayList.subList(0, 4);
        }
        return new C13327e(str, string, list, (C20944i0) null, (View) null);
    }
}
