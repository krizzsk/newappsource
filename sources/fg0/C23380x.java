package fg0;

import fg0.C23361g;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import og0.C24585a;
import og0.C24609x;
import ug0.C25066c;
import ug0.C25069e;

/* renamed from: fg0.x */
public final class C23380x extends C23368m implements C23361g, C24609x {

    /* renamed from: a */
    public final TypeVariable<?> f59158a;

    public C23380x(TypeVariable<?> typeVariable) {
        C24362h.m61211f(typeVariable, "typeVariable");
        this.f59158a = typeVariable;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: c */
    public final C24585a mo58494c(C25066c cVar) {
        return C23361g.C23362a.m57440a(this, cVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23380x) && C24362h.m61206a(this.f59158a, ((C23380x) obj).f59158a);
    }

    public final Collection getAnnotations() {
        return C23361g.C23362a.m57441b(this);
    }

    public final C25069e getName() {
        return C25069e.m62820i(this.f59158a.getName());
    }

    public final Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.f59158a.getBounds();
        C24362h.m61210e(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        int length = bounds.length;
        int i = 0;
        while (i < length) {
            Type type2 = bounds[i];
            i++;
            arrayList.add(new C23366k(type2));
        }
        C23366k kVar = (C23366k) C23825c.m58493E0(arrayList);
        if (kVar == null) {
            type = null;
        } else {
            type = kVar.f59147a;
        }
        if (C24362h.m61206a(type, Object.class)) {
            return EmptyList.f60173b;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f59158a.hashCode();
    }

    /* renamed from: t */
    public final AnnotatedElement mo58484t() {
        TypeVariable<?> typeVariable = this.f59158a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23380x.class, sb, ": ");
        sb.append(this.f59158a);
        return sb.toString();
    }
}
