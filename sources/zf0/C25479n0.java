package zf0;

import kotlin.collections.builders.MapBuilder;
import mf0.C24362h;

/* renamed from: zf0.n0 */
public abstract class C25479n0 {

    /* renamed from: a */
    public final String f63766a;

    /* renamed from: b */
    public final boolean f63767b;

    public C25479n0(String str, boolean z) {
        this.f63766a = str;
        this.f63767b = z;
    }

    /* renamed from: a */
    public Integer mo58406a(C25479n0 n0Var) {
        C24362h.m61211f(n0Var, "visibility");
        MapBuilder mapBuilder = C25468m0.f63756a;
        if (this == n0Var) {
            return 0;
        }
        MapBuilder mapBuilder2 = C25468m0.f63756a;
        Integer num = (Integer) mapBuilder2.get(this);
        Integer num2 = (Integer) mapBuilder2.get(n0Var);
        if (num == null || num2 == null || C24362h.m61206a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* renamed from: b */
    public String mo58407b() {
        return this.f63766a;
    }

    /* renamed from: c */
    public C25479n0 mo58408c() {
        return this;
    }

    public final String toString() {
        return mo58407b();
    }
}
