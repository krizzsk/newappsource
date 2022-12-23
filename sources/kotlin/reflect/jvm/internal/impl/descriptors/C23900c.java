package kotlin.reflect.jvm.internal.impl.descriptors;

import ag0.C20989e;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lh0.C24287o0;
import lh0.C24307v;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25433c0;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25478n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
public interface C23900c extends CallableMemberDescriptor {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c$a */
    public interface C23901a<D extends C23900c> {
        /* renamed from: a */
        C23901a mo59421a(EmptyList emptyList);

        /* renamed from: b */
        C23901a<D> mo59422b(List<C25452k0> list);

        D build();

        /* renamed from: c */
        C23901a mo59424c(Boolean bool);

        /* renamed from: d */
        C23901a<D> mo59425d(C25433c0 c0Var);

        /* renamed from: e */
        C23901a<D> mo59426e();

        /* renamed from: f */
        C23901a mo59427f();

        /* renamed from: g */
        C23901a<D> mo59428g();

        /* renamed from: h */
        C23901a<D> mo59429h(C24307v vVar);

        /* renamed from: i */
        C23901a<D> mo59430i(C20989e eVar);

        /* renamed from: j */
        C23901a<D> mo59431j(C25442g gVar);

        /* renamed from: k */
        C23901a<D> mo59432k(C24287o0 o0Var);

        /* renamed from: l */
        C23901a<D> mo59433l(Modality modality);

        /* renamed from: m */
        C23901a<D> mo59434m();

        /* renamed from: n */
        C23901a mo59435n(C25430b bVar);

        /* renamed from: o */
        C23901a<D> mo59436o(C25478n nVar);

        /* renamed from: p */
        C23901a<D> mo59437p(C25069e eVar);

        /* renamed from: q */
        C23901a<D> mo59438q(CallableMemberDescriptor.Kind kind);

        /* renamed from: r */
        C23901a<D> mo59439r();
    }

    /* renamed from: G */
    boolean mo53414G();

    /* renamed from: H0 */
    boolean mo53415H0();

    /* renamed from: J0 */
    boolean mo53418J0();

    /* renamed from: K0 */
    boolean mo53419K0();

    /* renamed from: V */
    boolean mo53424V();

    /* renamed from: a */
    C23900c mo53407a();

    /* renamed from: b */
    C25442g mo53399b();

    /* renamed from: c */
    C23900c mo53408c(TypeSubstitutor typeSubstitutor);

    /* renamed from: d */
    Collection<? extends C23900c> mo53440d();

    /* renamed from: q0 */
    boolean mo53435q0();

    /* renamed from: u */
    C23901a<? extends C23900c> mo53474u();

    /* renamed from: w */
    boolean mo53437w();

    /* renamed from: w0 */
    C23900c mo53438w0();
}
