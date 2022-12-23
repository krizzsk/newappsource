package o10;

import aa0.C7537i;
import android.content.Context;
import com.moovit.network.model.ServerId;
import p241s0.C6302b;
import p741pz.C19045d;
import p824tp.C19722a0;

/* renamed from: o10.d */
public final class C18688d extends C19045d<ServerId> {

    /* renamed from: d */
    public static final C6302b f47574d = new C6302b();

    public C18688d(Context context, ServerId serverId) {
        super(new C7537i(context, "search_stop_history_ids", serverId, ServerId.f15141f, ServerId.f15140e), 15);
    }

    /* renamed from: f */
    public static C18688d m45685f(Context context) {
        ServerId serverId = ((C19722a0) context.getSystemService("user_context")).f50160a.f32927c;
        C6302b bVar = f47574d;
        C18688d dVar = (C18688d) bVar.getOrDefault(serverId, null);
        if (dVar == null) {
            synchronized (bVar) {
                C18688d dVar2 = (C18688d) bVar.getOrDefault(serverId, null);
                if (dVar2 == null) {
                    dVar2 = new C18688d(context.getApplicationContext(), serverId);
                    dVar2.mo51501d();
                    bVar.put(serverId, dVar2);
                }
                dVar = dVar2;
            }
        }
        return dVar;
    }
}
