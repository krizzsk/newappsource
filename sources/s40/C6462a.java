package s40;

import android.content.Context;
import android.os.ConditionVariable;
import com.moovit.network.model.ServerId;
import p824tp.C19728f;
import p977zz.C20944i0;
import q40.C6176a;
import q40.C6177b;
import r40.C6252c;

/* renamed from: s40.a */
public final class C6462a extends C6176a<C6465d> {
    public C6462a(Context context, C19728f fVar, C6465d dVar) {
        super(context, fVar, dVar);
    }

    /* renamed from: a */
    public final void mo22156a(Object obj) {
        ConditionVariable conditionVariable;
        C6465d dVar = (C6465d) obj;
        C6177b bVar = dVar.f20185b;
        int i = dVar.f20189f;
        ServerId serverId = dVar.f20191h;
        bVar.getClass();
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        synchronized (bVar.f19565h) {
            conditionVariable = bVar.f19565h.get(i0Var);
            if (conditionVariable == null) {
                conditionVariable = new ConditionVariable(true);
                bVar.f19565h.put(i0Var, conditionVariable);
            }
        }
        conditionVariable.block();
        conditionVariable.close();
        C6177b bVar2 = dVar.f20185b;
        int i2 = dVar.f20189f;
        dVar.f20199p = (C6252c) bVar2.f19564g.get(new C20944i0(Integer.valueOf(i2), dVar.f20191h));
    }

    /* renamed from: b */
    public final void mo22157b(Object obj) {
        C6465d dVar = (C6465d) obj;
        C6177b bVar = dVar.f20185b;
        int i = dVar.f20189f;
        ServerId serverId = dVar.f20191h;
        bVar.getClass();
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        ConditionVariable conditionVariable = bVar.f19565h.get(i0Var);
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException("Try to release line trips, " + i0Var + ", without existing lock");
    }
}
