package q40;

import android.os.ConditionVariable;
import com.moovit.network.model.ServerId;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p241s0.C6302b;
import p693nz.C18659h;
import p693nz.C18662j;
import p977zz.C20944i0;
import p988j$.util.DesugarCollections;
import r40.C6250a;

/* renamed from: q40.b */
public final class C6177b {

    /* renamed from: a */
    public AtomicReference<C6250a> f19558a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    public final ConditionVariable f19559b = new ConditionVariable(true);

    /* renamed from: c */
    public final C18662j f19560c = new C18662j(new C18659h(7));

    /* renamed from: d */
    public final Map<Integer, ConditionVariable> f19561d = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: e */
    public final C18662j f19562e = new C18662j(new C18659h(20));

    /* renamed from: f */
    public final Map<C20944i0<Integer, ServerId>, ConditionVariable> f19563f = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: g */
    public final C18662j f19564g = new C18662j(new C18659h(20));

    /* renamed from: h */
    public final Map<C20944i0<Integer, ServerId>, ConditionVariable> f19565h = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: i */
    public final C18662j f19566i = new C18662j(new C18659h(20));

    /* renamed from: j */
    public final Map<C20944i0<Integer, ServerId>, ConditionVariable> f19567j = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: a */
    public final void mo22159a(int i) {
        ConditionVariable conditionVariable = this.f19561d.get(Integer.valueOf(i));
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException(C25541a.m63878h("Try to release active services, ", i, ", without existing lock"));
    }

    /* renamed from: b */
    public final void mo22160b(int i, ServerId serverId) {
        C20944i0 i0Var = new C20944i0(Integer.valueOf(i), serverId);
        ConditionVariable conditionVariable = this.f19563f.get(i0Var);
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException("Try to release line frequencies, " + i0Var + ", without existing lock");
    }
}
