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
import gj0.C23437p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import lj0.C24330g;
import org.simpleframework.xml.core.PersistenceException;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: ij0.u0 */
public final class C23676u0 {

    /* renamed from: a */
    public final ConcurrentCache f59835a = new ConcurrentCache();

    /* renamed from: b */
    public final C24330g f59836b;

    /* renamed from: ij0.u0$a */
    public static class C23677a {

        /* renamed from: a */
        public final Class f59837a;

        /* renamed from: b */
        public final Class f59838b;

        /* renamed from: c */
        public final Class f59839c;

        public C23677a(Class cls, Class cls2, Class cls3) {
            this.f59838b = cls3;
            this.f59837a = cls2;
            this.f59839c = cls;
        }
    }

    public C23676u0(C24330g gVar) {
        this.f59836b = gVar;
    }

    /* renamed from: a */
    public final C23680v0 mo58869a(C23659p pVar, Annotation annotation, C23683w0 w0Var) throws Exception {
        C23680v0 v0Var;
        C23680v0 v0Var2 = (C23680v0) this.f59835a.get(w0Var);
        if (v0Var2 != null) {
            return v0Var2;
        }
        if (annotation instanceof C23430i) {
            v0Var = mo58871c(pVar, annotation);
        } else if (annotation instanceof C23427f) {
            v0Var = mo58871c(pVar, annotation);
        } else if (annotation instanceof C23429h) {
            v0Var = mo58871c(pVar, annotation);
        } else {
            C23673t0 b = mo58870b(pVar, annotation, (Annotation) null);
            if (b != null) {
                b = new C23631g(b);
            }
            v0Var = new C23680v0(Arrays.asList(new C23673t0[]{b}));
        }
        if (v0Var != null) {
            this.f59835a.put(w0Var, v0Var);
        }
        return v0Var;
    }

    /* renamed from: b */
    public final C23673t0 mo58870b(C23659p pVar, Annotation annotation, Annotation annotation2) throws Exception {
        C23677a aVar;
        Constructor constructor;
        if (annotation instanceof C23424c) {
            aVar = new C23677a(C23689y.class, C23424c.class, (Class) null);
        } else if (annotation instanceof C23426e) {
            aVar = new C23677a(C23692z.class, C23426e.class, (Class) null);
        } else if (annotation instanceof C23425d) {
            aVar = new C23677a(C23682w.class, C23425d.class, (Class) null);
        } else if (annotation instanceof C23428g) {
            aVar = new C23677a(C23621d0.class, C23428g.class, (Class) null);
        } else if (annotation instanceof C23430i) {
            aVar = new C23677a(C23638i0.class, C23430i.class, C23424c.class);
        } else if (annotation instanceof C23427f) {
            aVar = new C23677a(C23615b0.class, C23427f.class, C23426e.class);
        } else if (annotation instanceof C23429h) {
            aVar = new C23677a(C23629f0.class, C23429h.class, C23428g.class);
        } else if (annotation instanceof C23422a) {
            aVar = new C23677a(C23624e.class, C23422a.class, (Class) null);
        } else if (annotation instanceof C23437p) {
            aVar = new C23677a(C23691y1.class, C23437p.class, (Class) null);
        } else if (annotation instanceof C23435n) {
            aVar = new C23677a(C23674t1.class, C23435n.class, (Class) null);
        } else {
            throw new PersistenceException("Annotation %s not supported", annotation);
        }
        Class<C24330g> cls = C24330g.class;
        Class<C23659p> cls2 = C23659p.class;
        Class cls3 = aVar.f59838b;
        if (cls3 != null) {
            Class cls4 = aVar.f59837a;
            constructor = aVar.f59839c.getConstructor(new Class[]{cls2, cls4, cls3, cls});
        } else {
            Class cls5 = aVar.f59837a;
            constructor = aVar.f59839c.getConstructor(new Class[]{cls2, cls5, cls});
        }
        if (!constructor.isAccessible()) {
            constructor.setAccessible(true);
        }
        if (annotation2 != null) {
            return (C23673t0) constructor.newInstance(new Object[]{pVar, annotation, annotation2, this.f59836b});
        }
        return (C23673t0) constructor.newInstance(new Object[]{pVar, annotation, this.f59836b});
    }

    /* renamed from: c */
    public final C23680v0 mo58871c(C23659p pVar, Annotation annotation) throws Exception {
        Annotation[] annotationArr;
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length > 0) {
            annotationArr = (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]);
        } else {
            annotationArr = new Annotation[0];
        }
        if (annotationArr.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (Annotation b : annotationArr) {
            C23673t0 b2 = mo58870b(pVar, annotation, b);
            if (b2 != null) {
                b2 = new C23631g(b2);
            }
            linkedList.add(b2);
        }
        return new C23680v0(linkedList);
    }
}
