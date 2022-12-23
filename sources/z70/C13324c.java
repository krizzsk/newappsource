package z70;

import android.content.Context;
import c00.C13717b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.search.C7604a;
import com.moovit.search.SearchAction;
import com.moovit.transit.LocationDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: z70.c */
public abstract class C13324c extends C7604a<C13325a> {

    /* renamed from: d */
    public final HashMap f33080d = new HashMap();

    /* renamed from: z70.c$a */
    public static class C13325a {

        /* renamed from: a */
        public final List<LocationDescriptor> f33081a;

        /* renamed from: b */
        public final Map<LocationDescriptor, Integer> f33082b;

        public C13325a() {
            throw null;
        }

        public C13325a(List<LocationDescriptor> list, LatLonE6 latLonE6) {
            this(list, C13329g.m33602a(list, latLonE6));
        }

        public C13325a(List<LocationDescriptor> list, Map<LocationDescriptor, Integer> map) {
            this.f33081a = list;
            this.f33082b = map == null ? Collections.emptyMap() : map;
        }
    }

    public C13324c(Context context, String str) {
        super(context, str);
    }

    /* renamed from: b */
    public final C13327e mo23836b(Context context, String str, String str2, Object obj) {
        int i;
        C13325a aVar = (C13325a) obj;
        List<LocationDescriptor> list = aVar.f33081a;
        if (C13717b.m34258e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (LocationDescriptor next : list) {
            Integer num = aVar.f33082b.get(next);
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            C13321a i2 = mo23779i(str, str2, next, i);
            this.f33080d.put(i2.f33070b, next);
            arrayList.add(i2);
        }
        return mo23780j(context, str, arrayList);
    }

    /* renamed from: d */
    public final Task mo23837d(ThreadPoolExecutor threadPoolExecutor, C13321a aVar) {
        LocationDescriptor locationDescriptor = (LocationDescriptor) this.f33080d.get(aVar.f33070b);
        if (locationDescriptor != null) {
            return Tasks.forResult(locationDescriptor);
        }
        StringBuilder k = C13555b.m33972k("Unknown location id: ");
        k.append(aVar.f33070b);
        return Tasks.forException(new ApplicationBugException(k.toString()));
    }

    /* renamed from: i */
    public C13321a mo23779i(String str, String str2, LocationDescriptor locationDescriptor, int i) {
        return C13335l.m33605a(str, str2, locationDescriptor, (SearchAction) null, i);
    }

    /* renamed from: j */
    public abstract C13327e mo23780j(Context context, String str, ArrayList arrayList);
}
