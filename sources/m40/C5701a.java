package m40;

import android.os.ConditionVariable;
import com.moovit.network.model.ServerId;
import java.util.Map;
import p241s0.C6302b;
import p358af.C13437d;
import p693nz.C18659h;
import p693nz.C18662j;
import p988j$.util.DesugarCollections;

/* renamed from: m40.a */
public final class C5701a {

    /* renamed from: a */
    public final Map<String, ConditionVariable> f18492a = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: b */
    public final C18662j f18493b = new C18662j(new C18659h(20));

    /* renamed from: c */
    public final Map<String, ConditionVariable> f18494c = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: d */
    public final C18662j f18495d = new C18662j(new C18659h(50));

    /* renamed from: a */
    public static String m14007a(int i, ServerId serverId, ServerId serverId2) {
        return i + "_" + serverId + "_" + serverId2;
    }

    /* renamed from: b */
    public static String m14008b(int i, ServerId serverId) {
        return i + "_" + serverId;
    }

    /* renamed from: c */
    public final void mo21542c(int i, ServerId serverId, ServerId serverId2) {
        String a = m14007a(i, serverId, serverId2);
        ConditionVariable conditionVariable = this.f18494c.get(a);
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException(C13437d.m33706k("Try to release arrivals, ", a, ", without existing lock"));
    }

    /* renamed from: d */
    public final void mo21543d(int i, ServerId serverId) {
        String b = m14008b(i, serverId);
        ConditionVariable conditionVariable = this.f18492a.get(b);
        if (conditionVariable != null) {
            conditionVariable.open();
            return;
        }
        throw new IllegalStateException(C13437d.m33706k("Try to release line group trips, ", b, ", without existing lock"));
    }
}
