package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import ag0.C20986c;
import ag0.C20989e;
import com.appsflyer.share.Constants;
import ig0.C23595b;
import java.util.Iterator;
import kg0.C23780d;
import kh0.C23788d;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import og0.C24585a;
import og0.C24589d;
import th0.C24997e;
import th0.C25012n;
import ug0.C25066c;
import ug0.C25069e;

public final class LazyJavaAnnotations implements C20989e {

    /* renamed from: b */
    public final C23780d f60605b;

    /* renamed from: c */
    public final C24589d f60606c;

    /* renamed from: d */
    public final boolean f60607d;

    /* renamed from: e */
    public final C23788d<C24585a, C20986c> f60608e;

    public LazyJavaAnnotations(C23780d dVar, C24589d dVar2, boolean z) {
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(dVar2, "annotationOwner");
        this.f60605b = dVar;
        this.f60606c = dVar2;
        this.f60607d = z;
        this.f60608e = dVar.f60080a.f60055a.mo59016a(new LazyJavaAnnotations$annotationDescriptors$1(this));
    }

    /* renamed from: b1 */
    public final boolean mo53070b1(C25066c cVar) {
        return C20989e.C20992b.m49150b(this, cVar);
    }

    /* renamed from: c */
    public final C20986c mo53071c(C25066c cVar) {
        C20986c cVar2;
        C24362h.m61211f(cVar, "fqName");
        C24585a c = this.f60606c.mo58494c(cVar);
        if (c == null) {
            cVar2 = null;
        } else {
            cVar2 = this.f60608e.invoke(c);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        C25069e eVar = C23595b.f59671a;
        return C23595b.m57782a(cVar, this.f60606c, this.f60605b);
    }

    public final boolean isEmpty() {
        if (!this.f60606c.getAnnotations().isEmpty()) {
            return false;
        }
        this.f60606c.mo58487F();
        return true;
    }

    public final Iterator<C20986c> iterator() {
        C25012n j0 = C24177b.m60549j0(C23825c.m58506c0(this.f60606c.getAnnotations()), this.f60608e);
        C25069e eVar = C23595b.f59671a;
        return new C24997e.C24998a(C24177b.m60545f0(C24177b.m60551l0(j0, C23595b.m57782a(C23872e.C23873a.f60375m, this.f60606c, this.f60605b))));
    }
}
