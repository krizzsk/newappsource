package lh0;

import ag0.C20989e;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* renamed from: lh0.v0 */
public abstract class C24308v0 extends C24307v {
    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return mo60256S0().mo60410N0();
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return mo60256S0().mo60411O0();
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return mo60256S0().mo60412P0();
    }

    /* renamed from: R0 */
    public final C24306u0 mo60450R0() {
        C24307v S0 = mo60256S0();
        while (S0 instanceof C24308v0) {
            S0 = ((C24308v0) S0).mo60256S0();
        }
        return (C24306u0) S0;
    }

    /* renamed from: S0 */
    public abstract C24307v mo60256S0();

    /* renamed from: T0 */
    public boolean mo60257T0() {
        return true;
    }

    public final C20989e getAnnotations() {
        return mo60256S0().getAnnotations();
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return mo60256S0().mo59564o();
    }

    public final String toString() {
        if (mo60257T0()) {
            return mo60256S0().toString();
        }
        return "<Not computed yet>";
    }
}
