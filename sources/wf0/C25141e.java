package wf0;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;

/* renamed from: wf0.e */
public final class C25141e implements C24236l<C25069e, C25432c> {

    /* renamed from: b */
    public final /* synthetic */ C23867c f63415b;

    public C25141e(C23867c cVar) {
        this.f63415b = cVar;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C23909c l = this.f63415b.mo59389l();
        C25066c cVar = C23872e.f60330i;
        MemberScope o = l.mo59458k0(cVar).mo59447o();
        if (o != null) {
            C25437e g = o.mo58433g(eVar, NoLookupLocation.FROM_BUILTINS);
            if (g == null) {
                StringBuilder k = C13555b.m33972k("Built-in class ");
                k.append(cVar.mo61581c(eVar));
                k.append(" is not found");
                throw new AssertionError(k.toString());
            } else if (g instanceof C25432c) {
                return (C25432c) g;
            } else {
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + g);
            }
        } else {
            C23867c.m58681a(11);
            throw null;
        }
    }
}
