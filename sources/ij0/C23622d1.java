package ij0;

import gj0.C23422a;
import gj0.C23424c;
import gj0.C23425d;
import gj0.C23426e;
import gj0.C23427f;
import gj0.C23428g;
import gj0.C23429h;
import gj0.C23430i;
import gj0.C23435n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import lj0.C24330g;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.core.PersistenceException;

/* renamed from: ij0.d1 */
public final class C23622d1 {

    /* renamed from: a */
    public final C24330g f59708a;

    /* renamed from: ij0.d1$a */
    public static class C23623a {

        /* renamed from: a */
        public final Class f59709a;

        /* renamed from: b */
        public final Class f59710b;

        /* renamed from: c */
        public final Class f59711c;

        public C23623a(Class cls, Class cls2, Class cls3) {
            this.f59710b = cls2;
            this.f59709a = cls3;
            this.f59711c = cls;
        }
    }

    public C23622d1(C24664u uVar) {
        this.f59708a = uVar.f62448h;
    }

    /* renamed from: a */
    public final C23619c1 mo58782a(Constructor constructor, Annotation annotation, Annotation annotation2, int i) throws Exception {
        C23623a aVar;
        Constructor constructor2;
        Annotation annotation3 = annotation;
        if (annotation3 instanceof C23424c) {
            aVar = new C23623a(C23635h0.class, C23424c.class, (Class) null);
        } else if (annotation3 instanceof C23426e) {
            aVar = new C23623a(C23612a0.class, C23426e.class, (Class) null);
        } else if (annotation3 instanceof C23425d) {
            aVar = new C23623a(C23685x.class, C23425d.class, (Class) null);
        } else if (annotation3 instanceof C23429h) {
            aVar = new C23623a(C23632g0.class, C23429h.class, C23428g.class);
        } else if (annotation3 instanceof C23427f) {
            aVar = new C23623a(C23618c0.class, C23427f.class, C23426e.class);
        } else if (annotation3 instanceof C23430i) {
            aVar = new C23623a(C23641j0.class, C23430i.class, C23424c.class);
        } else if (annotation3 instanceof C23428g) {
            aVar = new C23623a(C23625e0.class, C23428g.class, (Class) null);
        } else if (annotation3 instanceof C23422a) {
            aVar = new C23623a(C23628f.class, C23422a.class, (Class) null);
        } else if (annotation3 instanceof C23435n) {
            aVar = new C23623a(C23678u1.class, C23435n.class, (Class) null);
        } else {
            throw new PersistenceException("Annotation %s not supported", annotation3);
        }
        Class<C24330g> cls = C24330g.class;
        Class cls2 = aVar.f59709a;
        if (cls2 != null) {
            constructor2 = aVar.f59711c.getConstructor(new Class[]{Constructor.class, aVar.f59710b, cls2, cls, Integer.TYPE});
        } else {
            constructor2 = aVar.f59711c.getConstructor(new Class[]{Constructor.class, aVar.f59710b, cls, Integer.TYPE});
        }
        if (!constructor2.isAccessible()) {
            constructor2.setAccessible(true);
        }
        if (annotation2 != null) {
            return (C23619c1) constructor2.newInstance(new Object[]{constructor, annotation3, annotation2, this.f59708a, Integer.valueOf(i)});
        }
        return (C23619c1) constructor2.newInstance(new Object[]{constructor, annotation3, this.f59708a, Integer.valueOf(i)});
    }
}
