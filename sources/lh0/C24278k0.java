package lh0;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import mf0.C24362h;
import zf0.C25448i0;

/* renamed from: lh0.k0 */
public abstract class C24278k0 extends C24287o0 {

    /* renamed from: b */
    public static final C24279a f61571b = new C24279a();

    /* renamed from: lh0.k0$a */
    public static final class C24279a {
        /* renamed from: a */
        public final C24287o0 mo60437a(C24307v vVar) {
            return mo60438b(vVar.mo60411O0(), vVar.mo60410N0());
        }

        /* renamed from: b */
        public final C24287o0 mo60438b(C24274i0 i0Var, List<? extends C24281l0> list) {
            C24362h.m61211f(i0Var, "typeConstructor");
            C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
            List<C25448i0> parameters = i0Var.getParameters();
            C24362h.m61210e(parameters, "typeConstructor.parameters");
            C25448i0 i0Var2 = (C25448i0) C23825c.m58523t0(parameters);
            boolean z = true;
            if (i0Var2 == null || !i0Var2.mo53478T()) {
                z = false;
            }
            if (z) {
                List<C25448i0> parameters2 = i0Var.getParameters();
                C24362h.m61210e(parameters2, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters2, 10));
                for (C25448i0 j : parameters2) {
                    arrayList.add(j.mo53481j());
                }
                return new C24276j0(C23826d.m58536a0(C23825c.m58505Q0(arrayList, list)), false);
            }
            Object[] array = parameters.toArray(new C25448i0[0]);
            if (array != null) {
                C25448i0[] i0VarArr = (C25448i0[]) array;
                Object[] array2 = list.toArray(new C24281l0[0]);
                if (array2 != null) {
                    return new C24305u(i0VarArr, (C24281l0[]) array2, false);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* renamed from: d */
    public final C24281l0 mo59555d(C24307v vVar) {
        return mo60418g(vVar.mo60411O0());
    }

    /* renamed from: g */
    public abstract C24281l0 mo60418g(C24274i0 i0Var);
}
