package cg0;

import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import mf0.C24362h;
import p502fx.C17119d;
import ug0.C25066c;

/* renamed from: cg0.b0 */
public interface C21158b0 {

    /* renamed from: a */
    public static final C21159a f53017a = C21159a.f53018a;

    /* renamed from: cg0.b0$a */
    public static final class C21159a {

        /* renamed from: a */
        public static final /* synthetic */ C21159a f53018a = new C21159a();

        /* renamed from: b */
        public static final C17119d f53019b = new C17119d("PackageViewDescriptorFactory", 1);
    }

    /* renamed from: cg0.b0$b */
    public static final class C21160b implements C21158b0 {

        /* renamed from: b */
        public static final C21160b f53020b = new C21160b();

        /* renamed from: a */
        public final LazyPackageViewDescriptorImpl mo53413a(C23909c cVar, C25066c cVar2, C23792h hVar) {
            C24362h.m61211f(cVar, "module");
            C24362h.m61211f(cVar2, "fqName");
            C24362h.m61211f(hVar, "storageManager");
            return new LazyPackageViewDescriptorImpl(cVar, cVar2, hVar);
        }
    }

    /* renamed from: a */
    LazyPackageViewDescriptorImpl mo53413a(C23909c cVar, C25066c cVar2, C23792h hVar);
}
