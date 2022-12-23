package p735pt;

import aa0.C7537i;
import android.content.Context;
import com.moovit.app.index.UpdateIndexingDescription;
import com.moovit.network.model.ServerId;
import java.util.HashMap;
import p741pz.C19045d;
import p824tp.C19722a0;

/* renamed from: pt.b */
public final class C18981b extends C19045d<UpdateIndexingDescription> {

    /* renamed from: d */
    public static final HashMap f48327d = new HashMap();

    public C18981b(Context context, ServerId serverId) {
        super(new C7537i(context, "update_app_index", serverId, UpdateIndexingDescription.f38437h, UpdateIndexingDescription.f38436g), 100);
    }

    /* renamed from: f */
    public static C18981b m46094f(Context context) {
        ServerId serverId = ((C19722a0) context.getSystemService("user_context")).f50160a.f32927c;
        HashMap hashMap = f48327d;
        C18981b bVar = (C18981b) hashMap.get(serverId);
        if (bVar != null) {
            return bVar;
        }
        C18981b bVar2 = new C18981b(context.getApplicationContext(), serverId);
        bVar2.mo51501d();
        hashMap.put(serverId, bVar2);
        return bVar2;
    }
}
