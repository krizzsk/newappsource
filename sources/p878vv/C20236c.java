package p878vv;

import aa0.C7537i;
import android.content.Context;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.network.model.ServerId;
import java.util.HashMap;
import p741pz.C19045d;
import p824tp.C19722a0;

/* renamed from: vv.c */
public final class C20236c extends C19045d<SearchLocationItem> {

    /* renamed from: d */
    public static final HashMap f51341d = new HashMap();

    public C20236c(Context context, ServerId serverId) {
        super(new C7537i(context, "search_location_history", serverId, SearchLocationItem.f39453n, SearchLocationItem.f39452m), 15);
    }

    /* renamed from: f */
    public static C20236c m47804f(Context context) {
        ServerId serverId = ((C19722a0) context.getSystemService("user_context")).f50160a.f32927c;
        HashMap hashMap = f51341d;
        C20236c cVar = (C20236c) hashMap.get(serverId);
        if (cVar != null) {
            return cVar;
        }
        C20236c cVar2 = new C20236c(context.getApplicationContext(), serverId);
        cVar2.mo51501d();
        hashMap.put(serverId, cVar2);
        return cVar2;
    }
}
