package z70;

import android.content.Intent;
import b00.C13563f;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.search.C7604a;
import com.moovit.search.C7606b;
import com.moovit.search.SearchLocationActivity;
import com.moovit.search.SearchLocationMapActivity;
import com.moovit.transit.LocationDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z70.k */
public final class C13334k extends C13563f<Void, Void, List<LocationDescriptor>> {

    /* renamed from: e */
    public final WeakReference<SearchLocationActivity> f33103e;

    /* renamed from: f */
    public final C7604a<?> f33104f;

    /* renamed from: g */
    public final List<C13321a> f33105g;

    public C13334k(SearchLocationActivity searchLocationActivity, C7604a<?> aVar, List<C13321a> list) {
        this.f33103e = new WeakReference<>(searchLocationActivity);
        C21100e.m49373x(aVar, "provider");
        this.f33104f = aVar;
        C21100e.m49373x(list, "items");
        this.f33105g = list;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ArrayList arrayList = new ArrayList(this.f33105g.size());
        for (C13321a next : this.f33105g) {
            LocationDescriptor locationDescriptor = null;
            if (isCancelled()) {
                return null;
            }
            try {
                locationDescriptor = (LocationDescriptor) Tasks.await(this.f33104f.mo23837d(C7606b.f23157q, next));
            } catch (Throwable unused) {
            }
            if (locationDescriptor != null) {
                arrayList.add(locationDescriptor);
            }
        }
        return arrayList;
    }

    public final void onPostExecute(Object obj) {
        SearchLocationActivity searchLocationActivity;
        List list = (List) obj;
        if (!isCancelled() && !C13717b.m34258e(list) && (searchLocationActivity = this.f33103e.get()) != null) {
            int i = SearchLocationMapActivity.f23138p0;
            Intent intent = new Intent(searchLocationActivity, SearchLocationMapActivity.class);
            intent.putExtra("LOCATION_ITEM_EXTRA", C13717b.m34264k(list));
            searchLocationActivity.startActivityForResult(intent, 1782);
        }
    }
}
