package c80;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.search.C7604a;
import d80.C12604g;
import d80.C12605h;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p028ba.C1513g;
import p824tp.C19728f;
import p824tp.C19746x;
import p977zz.C20944i0;
import q00.C19047a;
import z70.C13321a;
import z70.C13327e;

/* renamed from: c80.d */
public final class C7577d extends C7604a<C12604g> {

    /* renamed from: d */
    public final C19047a f23074d;

    /* renamed from: e */
    public final C19728f f23075e;

    /* renamed from: f */
    public volatile String f23076f;

    public C7577d(Context context, C19047a aVar, C19728f fVar) {
        super(context, "google_place_autocomplete");
        this.f23074d = aVar;
        this.f23075e = fVar;
    }

    /* renamed from: b */
    public final C13327e mo23836b(Context context, String str, String str2, Object obj) {
        List<C13321a> list = ((C12604g) obj).f31151f;
        if (C13717b.m34258e(list)) {
            return null;
        }
        return new C13327e(str, context.getString(C19746x.search_locations_section_title), list, (C20944i0) null, (View) null);
    }

    /* renamed from: c */
    public final Task mo23776c(ThreadPoolExecutor threadPoolExecutor, String str, LatLonE6 latLonE6) {
        return Tasks.call(threadPoolExecutor, new C7575b(this, latLonE6)).onSuccessTask(threadPoolExecutor, new C7576c(this, threadPoolExecutor, str, latLonE6));
    }

    /* renamed from: d */
    public final Task mo23837d(ThreadPoolExecutor threadPoolExecutor, C13321a aVar) {
        return Tasks.call(threadPoolExecutor, new C12605h(this.f23152a, this.f23075e, aVar)).onSuccessTask(threadPoolExecutor, new C1513g(aVar, 14));
    }

    /* renamed from: e */
    public final boolean mo23777e() {
        return true;
    }

    /* renamed from: g */
    public final void mo23838g(Bundle bundle) {
        this.f23076f = bundle.getString("sessionToken");
    }

    /* renamed from: h */
    public final Bundle mo23839h() {
        String str = this.f23076f;
        if (str == null) {
            return null;
        }
        Bundle bundle = new Bundle(1);
        bundle.putString("sessionToken", str);
        return bundle;
    }
}
