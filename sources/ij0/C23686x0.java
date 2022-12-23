package ij0;

import java.lang.annotation.Annotation;
import org.simpleframework.xml.core.C24650h;
import org.simpleframework.xml.core.MethodException;

/* renamed from: ij0.x0 */
public final class C23686x0 implements C23659p {

    /* renamed from: b */
    public Annotation f59857b;

    /* renamed from: c */
    public C24650h f59858c;

    /* renamed from: d */
    public C24650h f59859d;

    /* renamed from: e */
    public Class f59860e;

    /* renamed from: f */
    public Class f59861f;

    /* renamed from: g */
    public String f59862g;

    public C23686x0(C24650h hVar, C24650h hVar2) {
        this.f59860e = hVar.getDeclaringClass();
        this.f59857b = hVar.mo61065a();
        hVar.mo61066b();
        hVar.mo61074x();
        this.f59861f = hVar.getType();
        this.f59862g = hVar.getName();
        this.f59858c = hVar2;
        this.f59859d = hVar;
    }

    /* renamed from: a */
    public final Annotation mo58838a() {
        return this.f59857b;
    }

    /* renamed from: b */
    public final void mo58839b(Object obj, Object obj2) throws Exception {
        Class<?> declaringClass = this.f59859d.getMethod().getDeclaringClass();
        C24650h hVar = this.f59858c;
        if (hVar != null) {
            hVar.getMethod().invoke(obj, new Object[]{obj2});
            return;
        }
        throw new MethodException("Property '%s' is read only in %s", this.f59862g, declaringClass);
    }

    /* renamed from: c */
    public final boolean mo58840c() {
        return this.f59858c == null;
    }

    public final Object get(Object obj) throws Exception {
        return this.f59859d.getMethod().invoke(obj, new Object[0]);
    }

    public final <T extends Annotation> T getAnnotation(Class<T> cls) {
        C24650h hVar;
        T annotation = this.f59859d.getAnnotation(cls);
        if (cls == this.f59857b.annotationType()) {
            return this.f59857b;
        }
        if (annotation != null || (hVar = this.f59858c) == null) {
            return annotation;
        }
        return hVar.getAnnotation(cls);
    }

    public final Class getDeclaringClass() {
        return this.f59860e;
    }

    public final String getName() {
        return this.f59862g;
    }

    public final Class getType() {
        return this.f59861f;
    }

    public final String toString() {
        return String.format("method '%s'", new Object[]{this.f59862g});
    }
}
