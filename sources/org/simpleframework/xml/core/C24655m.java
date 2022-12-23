package org.simpleframework.xml.core;

import gj0.C23422a;
import gj0.C23424c;
import gj0.C23425d;
import gj0.C23426e;
import gj0.C23427f;
import gj0.C23428g;
import gj0.C23429h;
import gj0.C23430i;
import gj0.C23435n;
import ij0.C23617c;
import ij0.C23619c1;
import ij0.C23622d1;
import ij0.C23639i1;
import ij0.C23662q;
import ij0.C23666r0;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kj0.C23810e;
import lj0.C24331h;
import mj0.C24415u;
import org.simpleframework.xml.core.SignatureBuilder;
import org.simpleframework.xml.transform.TransformException;
import p069e3.C4544g;
import p446dp.C16694c;
import p720pe.C18917a;

/* renamed from: org.simpleframework.xml.core.m */
public final class C24655m implements C23662q {

    /* renamed from: a */
    public final Class f62409a;

    /* renamed from: b */
    public final Object f62410b;

    /* renamed from: c */
    public final Object f62411c;

    /* renamed from: d */
    public final Serializable f62412d;

    /* renamed from: e */
    public final Object f62413e;

    public C24655m(Constructor constructor, ParameterMap parameterMap, C24664u uVar) {
        List<C23619c1> list;
        this.f62410b = new SignatureBuilder(constructor);
        this.f62411c = new C23622d1(uVar);
        this.f62409a = constructor.getDeclaringClass();
        this.f62413e = constructor;
        this.f62412d = parameterMap;
        Class[] parameterTypes = constructor.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls = parameterTypes[i];
            Annotation[][] parameterAnnotations = ((Constructor) this.f62413e).getParameterAnnotations();
            int i2 = 0;
            while (true) {
                Annotation[] annotationArr = parameterAnnotations[i];
                if (i2 >= annotationArr.length) {
                    break;
                }
                Annotation annotation = annotationArr[i2];
                if (annotation instanceof C23422a) {
                    list = mo61086c(annotation, i);
                } else if (annotation instanceof C23424c) {
                    list = mo61086c(annotation, i);
                } else if (annotation instanceof C23426e) {
                    list = mo61086c(annotation, i);
                } else if (annotation instanceof C23425d) {
                    list = mo61086c(annotation, i);
                } else if (annotation instanceof C23428g) {
                    list = mo61086c(annotation, i);
                } else if (annotation instanceof C23427f) {
                    list = mo61089f(annotation, i);
                } else if (annotation instanceof C23429h) {
                    list = mo61089f(annotation, i);
                } else if (annotation instanceof C23430i) {
                    list = mo61089f(annotation, i);
                } else if (annotation instanceof C23435n) {
                    list = mo61086c(annotation, i);
                } else {
                    list = Collections.emptyList();
                }
                for (C23619c1 c1Var : list) {
                    SignatureBuilder.ParameterList d = ((SignatureBuilder) this.f62410b).f62347a.get(i);
                    if (d != null) {
                        d.add(c1Var);
                    }
                }
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final Object mo58815a(C24331h hVar, Object obj) throws Exception {
        if (obj == null) {
            return mo58816b(hVar);
        }
        throw new PersistenceException("Can not read existing %s for %s", this.f62409a, (C23810e) this.f62413e);
    }

    /* renamed from: b */
    public final Object mo58816b(C24331h hVar) throws Exception {
        if (!hVar.mo60484a()) {
            return mo61087d(hVar, this.f62409a);
        }
        C23666r0 e = ((C23617c) this.f62410b).mo58750e(hVar);
        if (e.mo58773a()) {
            return e.getInstance();
        }
        Object d = mo61087d(hVar, this.f62409a);
        e.mo58774b(d);
        return d;
    }

    /* renamed from: c */
    public final List mo61086c(Annotation annotation, int i) throws Exception {
        C23619c1 a = ((C23622d1) this.f62411c).mo58782a((Constructor) this.f62413e, annotation, (Annotation) null, i);
        if (a != null) {
            mo61088e(a);
        }
        return Collections.singletonList(a);
    }

    /* renamed from: d */
    public final Object mo61087d(C24331h hVar, Class cls) throws Exception {
        String value = hVar.getValue();
        if (value == null) {
            return null;
        }
        String str = (String) this.f62412d;
        if (str != null && value.equals(str)) {
            return (String) this.f62412d;
        }
        C16694c cVar = (C16694c) ((C23639i1) this.f62411c).f59775a;
        cVar.getClass();
        if (value.indexOf(36) >= 0) {
            try {
                ((C18917a) cVar.f43483b).mo51430a(value);
                cVar.mo49406d();
                value = ((C18917a) cVar.f43485d).toString();
            } finally {
                C18917a aVar = (C18917a) cVar.f43484c;
                aVar.f48156d = null;
                aVar.f48155c = 0;
                C18917a aVar2 = (C18917a) cVar.f43485d;
                aVar2.f48156d = null;
                aVar2.f48155c = 0;
                C18917a aVar3 = (C18917a) cVar.f43483b;
                aVar3.f48156d = null;
                aVar3.f48155c = 0;
                cVar.f43482a = 0;
            }
        }
        if (value == null) {
            return null;
        }
        C24415u a = ((C23617c) this.f62410b).f59805b.f62446f.mo60539a(cls);
        if (a != null) {
            return a.mo60538a(value);
        }
        throw new TransformException("Transform of %s not supported", cls);
    }

    /* renamed from: e */
    public final void mo61088e(C23619c1 c1Var) throws Exception {
        String q = c1Var.mo58747q();
        Object key = c1Var.getKey();
        if (((ParameterMap) this.f62412d).containsKey(key)) {
            mo61090g(key, c1Var);
        }
        if (((ParameterMap) this.f62412d).containsKey(q)) {
            mo61090g(q, c1Var);
        }
        ((ParameterMap) this.f62412d).put(q, c1Var);
        ((ParameterMap) this.f62412d).put(key, c1Var);
    }

    /* renamed from: f */
    public final List mo61089f(Annotation annotation, int i) throws Exception {
        ((Constructor) this.f62413e).getDeclaringClass();
        ParameterMap parameterMap = new ParameterMap();
        Method[] declaredMethods = annotation.annotationType().getDeclaredMethods();
        if (declaredMethods.length == 1) {
            Annotation[] annotationArr = (Annotation[]) declaredMethods[0].invoke(annotation, new Object[0]);
            int length = annotationArr.length;
            int i2 = 0;
            while (i2 < length) {
                C23619c1 a = ((C23622d1) this.f62411c).mo58782a((Constructor) this.f62413e, annotation, annotationArr[i2], i);
                String q = a.mo58747q();
                if (!parameterMap.containsKey(q)) {
                    parameterMap.put(q, a);
                    mo61088e(a);
                    i2++;
                } else {
                    throw new UnionException("Annotation name '%s' used more than once in %s for %s", q, annotation, this.f62409a);
                }
            }
            return parameterMap.mo61007i();
        }
        throw new UnionException("Annotation '%s' is not a valid union for %s", annotation, this.f62409a);
    }

    /* renamed from: g */
    public final void mo61090g(Object obj, C23619c1 c1Var) throws Exception {
        C23619c1 c1Var2 = (C23619c1) ((ParameterMap) this.f62412d).get(obj);
        if (c1Var.mo58780v() != c1Var2.mo58780v()) {
            Annotation a = c1Var.mo58740a();
            Annotation a2 = c1Var2.mo58740a();
            String q = c1Var.mo58747q();
            if (!a.equals(a2)) {
                throw new ConstructorException("Annotations do not match for '%s' in %s", q, this.f62409a);
            } else if (c1Var2.getType() != c1Var.getType()) {
                throw new ConstructorException("Parameter types do not match for '%s' in %s", q, this.f62409a);
            }
        }
    }

    public C24655m(C23639i1 i1Var, C4544g gVar) {
        this.f62410b = new C23617c(i1Var, gVar, 1);
        this.f62409a = (Class) gVar.f15660c;
        this.f62411c = i1Var;
        this.f62412d = null;
        this.f62413e = gVar;
    }
}
