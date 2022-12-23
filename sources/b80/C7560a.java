package b80;

import android.content.Context;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import p824tp.C19728f;
import p824tp.C19746x;
import p977zz.C20944i0;
import z70.C13324c;
import z70.C13327e;

/* renamed from: b80.a */
public final class C7560a extends C13324c {

    /* renamed from: e */
    public final C19728f f23043e;

    public C7560a(Context context, C19728f fVar) {
        super(context, "custom_poi");
        this.f23043e = fVar;
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.call(threadPoolExecutor, new C7561b(this.f23152a, this.f23043e, str, latLonE6));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return false;
    }

    /* renamed from: j */
    public final C13327e mo23780j(Context context, String str, ArrayList arrayList) {
        return new C13327e(str, context.getString(C19746x.search_promoted_locations_section_title), arrayList, (C20944i0) null, (View) null);
    }
}
