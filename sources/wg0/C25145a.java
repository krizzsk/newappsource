package wg0;

import cf0.C21150x;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25067d;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25486u;

/* renamed from: wg0.a */
public interface C25145a {

    /* renamed from: wg0.a$a */
    public static final class C25146a implements C25145a {

        /* renamed from: a */
        public static final C25146a f63423a = new C25146a();

        /* renamed from: a */
        public final String mo61745a(C25437e eVar, DescriptorRenderer descriptorRenderer) {
            C24362h.m61211f(descriptorRenderer, "renderer");
            if (eVar instanceof C25448i0) {
                C25069e name = ((C25448i0) eVar).getName();
                C24362h.m61210e(name, "classifier.name");
                return descriptorRenderer.mo60090r(name, false);
            }
            C25067d g = C25260c.m63390g(eVar);
            C24362h.m61210e(g, "getFqName(classifier)");
            return descriptorRenderer.mo60089q(g);
        }
    }

    /* renamed from: wg0.a$b */
    public static final class C25147b implements C25145a {

        /* renamed from: a */
        public static final C25147b f63424a = new C25147b();

        /* renamed from: a */
        public final String mo61745a(C25437e eVar, DescriptorRenderer descriptorRenderer) {
            boolean z;
            C24362h.m61211f(descriptorRenderer, "renderer");
            if (eVar instanceof C25448i0) {
                C25069e name = ((C25448i0) eVar).getName();
                C24362h.m61210e(name, "classifier.name");
                return descriptorRenderer.mo60090r(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C25442g gVar = eVar;
            do {
                arrayList.add(gVar.getName());
                C25442g b = gVar.mo53399b();
                z = b instanceof C25432c;
                gVar = b;
            } while (z);
            return C17875h.m44289N(new C21150x(arrayList));
        }
    }

    /* renamed from: wg0.a$c */
    public static final class C25148c implements C25145a {

        /* renamed from: a */
        public static final C25148c f63425a = new C25148c();

        /* renamed from: b */
        public static String m63110b(C25437e eVar) {
            String str;
            C25069e name = eVar.getName();
            C24362h.m61210e(name, "descriptor.name");
            String M = C17875h.m44288M(name);
            if (eVar instanceof C25448i0) {
                return M;
            }
            C25442g b = eVar.mo53399b();
            C24362h.m61210e(b, "descriptor.containingDeclaration");
            if (b instanceof C25432c) {
                str = m63110b((C25437e) b);
            } else if (b instanceof C25486u) {
                C25067d i = ((C25486u) b).mo53401f().mo61589i();
                C24362h.m61210e(i, "descriptor.fqName.toUnsafe()");
                str = C17875h.m44289N(i.mo61597g());
            } else {
                str = null;
            }
            if (str == null || C24362h.m61206a(str, "")) {
                return M;
            }
            return str + '.' + M;
        }

        /* renamed from: a */
        public final String mo61745a(C25437e eVar, DescriptorRenderer descriptorRenderer) {
            C24362h.m61211f(descriptorRenderer, "renderer");
            return m63110b(eVar);
        }
    }

    /* renamed from: a */
    String mo61745a(C25437e eVar, DescriptorRenderer descriptorRenderer);
}
