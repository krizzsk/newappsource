package fg0;

import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mf0.C24362h;
import og0.C24585a;
import og0.C24606u;

/* renamed from: fg0.u */
public final class C23377u extends C23379w implements C24606u {

    /* renamed from: a */
    public final Class<?> f59155a;

    /* renamed from: b */
    public final EmptyList f59156b = EmptyList.f60173b;

    public C23377u(Class<?> cls) {
        this.f59155a = cls;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: T */
    public final Type mo58488T() {
        return this.f59155a;
    }

    public final Collection<C24585a> getAnnotations() {
        return this.f59156b;
    }

    public final PrimitiveType getType() {
        if (C24362h.m61206a(this.f59155a, Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(this.f59155a.getName()).getPrimitiveType();
    }
}
