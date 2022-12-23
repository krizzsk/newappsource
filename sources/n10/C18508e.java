package n10;

import aa0.C7537i;
import android.content.Context;
import com.moovit.network.model.ServerId;
import p241s0.C6302b;
import p741pz.C19045d;
import p824tp.C19722a0;

/* renamed from: n10.e */
public final class C18508e extends C19045d<ServerId> {

    /* renamed from: d */
    public static final C6302b f47132d = new C6302b();

    public C18508e(Context context, ServerId serverId) {
        super(new C7537i(context, "search_line_history_ids", serverId, ServerId.f15141f, ServerId.f15140e), 15);
    }

    /* renamed from: f */
    public static C18508e m45375f(Context context) {
        return m45376g(context, ((C19722a0) context.getSystemService("user_context")).f50160a.f32927c);
    }

    /* renamed from: g */
    public static C18508e m45376g(Context context, ServerId serverId) {
        C6302b bVar = f47132d;
        C18508e eVar = (C18508e) bVar.getOrDefault(serverId, null);
        if (eVar == null) {
            synchronized (bVar) {
                C18508e eVar2 = (C18508e) bVar.getOrDefault(serverId, null);
                if (eVar2 == null) {
                    eVar2 = new C18508e(context.getApplicationContext(), serverId);
                    eVar2.mo51501d();
                    bVar.put(serverId, eVar2);
                }
                eVar = eVar2;
            }
        }
        return eVar;
    }
}
