package fg0;

import java.lang.annotation.Annotation;
import java.util.Collection;
import mf0.C24362h;
import og0.C24585a;
import og0.C24608w;
import og0.C24611z;
import p584jl.C17885a;
import ug0.C25066c;
import ug0.C25069e;

/* renamed from: fg0.y */
public final class C23381y extends C23368m implements C24611z {

    /* renamed from: a */
    public final C23379w f59159a;

    /* renamed from: b */
    public final Annotation[] f59160b;

    /* renamed from: c */
    public final String f59161c;

    /* renamed from: d */
    public final boolean f59162d;

    public C23381y(C23379w wVar, Annotation[] annotationArr, String str, boolean z) {
        C24362h.m61211f(annotationArr, "reflectAnnotations");
        this.f59159a = wVar;
        this.f59160b = annotationArr;
        this.f59161c = str;
        this.f59162d = z;
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: b */
    public final boolean mo58537b() {
        return this.f59162d;
    }

    /* renamed from: c */
    public final C24585a mo58494c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return C17885a.m44414N(this.f59160b, cVar);
    }

    public final Collection getAnnotations() {
        return C17885a.m44418P(this.f59160b);
    }

    public final C25069e getName() {
        String str = this.f59161c;
        if (str == null) {
            return null;
        }
        return C25069e.m62819h(str);
    }

    public final C24608w getType() {
        return this.f59159a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23381y.class, sb, ": ");
        if (this.f59162d) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(getName());
        sb.append(": ");
        sb.append(this.f59159a);
        return sb.toString();
    }
}
