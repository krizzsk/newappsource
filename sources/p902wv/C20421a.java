package p902wv;

import android.content.Context;
import com.moovit.search.C7606b;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import f80.C12635b;
import f80.C12638d;
import p455dy.C16753e;
import z70.C13321a;
import z70.C13335l;

/* renamed from: wv.a */
public final class C20421a extends C12635b {

    /* renamed from: g */
    public final C16753e f51738g;

    public C20421a(Context context, C7606b bVar, C12638d dVar, C16753e eVar) {
        super(context, bVar, dVar);
        this.f51738g = eVar;
    }

    /* renamed from: i */
    public final C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        boolean z;
        SearchAction searchAction;
        if (this.f51738g.mo49439m(locationDescriptor) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            searchAction = null;
        } else {
            searchAction = SearchAction.MARK_AS_FAVORITE;
        }
        return C13335l.m33605a(str, str2, locationDescriptor, searchAction, i);
    }
}
