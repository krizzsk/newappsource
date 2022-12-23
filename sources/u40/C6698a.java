package u40;

import android.content.Context;
import android.os.ConditionVariable;
import com.moovit.network.model.ServerId;
import p824tp.C19728f;
import p977zz.C20944i0;
import q40.C6176a;
import q40.C6177b;
import t40.C6590a;

/* renamed from: u40.a */
public final class C6698a extends C6176a<C6702e> {
    public C6698a(Context context, C19728f fVar, C6702e eVar) {
        super(context, fVar, eVar);
    }

    /* renamed from: a */
    public final void mo22156a(Object obj) {
        ConditionVariable conditionVariable;
        C6702e eVar = (C6702e) obj;
        C6177b bVar = eVar.f20781b;
        int i = eVar.f20785f;
        ServerId serverId = eVar.f20786g;
        bVar.getClass();
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        synchronized (bVar.f19567j) {
            conditionVariable = bVar.f19567j.get(i0Var);
            if (conditionVariable == null) {
                conditionVariable = new ConditionVariable(true);
                bVar.f19567j.put(i0Var, conditionVariable);
            }
        }
        conditionVariable.block();
        conditionVariable.close();
        C6177b bVar2 = eVar.f20781b;
        int i2 = eVar.f20785f;
        eVar.f20788i = (C6590a) bVar2.f19566i.get(new C20944i0(Integer.valueOf(i2), eVar.f20786g));
    }

    /* renamed from: b */
    public final void mo22157b(Object obj) {
        C6702e eVar = (C6702e) obj;
        C6177b bVar = eVar.f20781b;
        int i = eVar.f20785f;
        ServerId serverId = eVar.f20786g;
        bVar.getClass();
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        ConditionVariable conditionVariable = bVar.f19567j.get(i0Var);
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException("Try to release line group trips, " + i0Var + ", without existing lock");
    }
}
