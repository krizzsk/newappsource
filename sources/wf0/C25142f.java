package wf0;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import lf0.C24225a;

/* renamed from: wf0.f */
public final class C25142f implements C24225a<Void> {

    /* renamed from: b */
    public final /* synthetic */ C23909c f63416b;

    /* renamed from: c */
    public final /* synthetic */ C23867c f63417c;

    public C25142f(JvmBuiltIns jvmBuiltIns, C23909c cVar) {
        this.f63417c = jvmBuiltIns;
        this.f63416b = cVar;
    }

    public final Object invoke() {
        C23867c cVar = this.f63417c;
        if (cVar.f60310a == null) {
            cVar.f60310a = this.f63416b;
            return null;
        }
        StringBuilder k = C13555b.m33972k("Built-ins module is already set: ");
        k.append(this.f63417c.f60310a);
        k.append(" (attempting to reset to ");
        k.append(this.f63416b);
        k.append(")");
        throw new AssertionError(k.toString());
    }
}
