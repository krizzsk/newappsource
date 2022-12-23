package lh0;

import ag0.C20984a;
import com.appboy.Constants;
import com.google.android.play.core.appupdate.C14226d;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mh0.C24378d;
import oh0.C24617f;
import p389bl.C13637c;
import p583jk.C17875h;

/* renamed from: lh0.v */
public abstract class C24307v implements C20984a, C24617f {

    /* renamed from: b */
    public int f61607b;

    /* renamed from: N0 */
    public abstract List<C24281l0> mo60410N0();

    /* renamed from: O0 */
    public abstract C24274i0 mo60411O0();

    /* renamed from: P0 */
    public abstract boolean mo60412P0();

    /* renamed from: Q0 */
    public abstract C24307v mo59558Q0(C24378d dVar);

    /* renamed from: R0 */
    public abstract C24306u0 mo60450R0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24307v)) {
            return false;
        }
        C24307v vVar = (C24307v) obj;
        if (mo60412P0() == vVar.mo60412P0()) {
            C24306u0 R0 = mo60450R0();
            C24306u0 R02 = vVar.mo60450R0();
            C24362h.m61211f(R0, Constants.APPBOY_PUSH_CONTENT_KEY);
            C24362h.m61211f(R02, "b");
            if (C17875h.m44293T(C14226d.f35756k, R0, R02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.f61607b;
        if (i2 != 0) {
            return i2;
        }
        if (C13637c.m34082y(this)) {
            i = super.hashCode();
        } else {
            int hashCode = mo60410N0().hashCode();
            i = (mo60412P0() ? 1 : 0) + ((hashCode + (mo60411O0().hashCode() * 31)) * 31);
        }
        this.f61607b = i;
        return i;
    }

    /* renamed from: o */
    public abstract MemberScope mo59564o();
}
