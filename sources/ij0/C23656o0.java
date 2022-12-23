package ij0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: ij0.o0 */
public final class C23656o0 implements C23659p {

    /* renamed from: b */
    public final ConcurrentCache f59810b = new ConcurrentCache();

    /* renamed from: c */
    public final Annotation[] f59811c;

    /* renamed from: d */
    public final Annotation f59812d;

    /* renamed from: e */
    public final Field f59813e;

    /* renamed from: f */
    public final String f59814f;

    /* renamed from: g */
    public final int f59815g;

    public C23656o0(Field field, Annotation annotation, Annotation[] annotationArr) {
        this.f59815g = field.getModifiers();
        this.f59814f = field.getName();
        this.f59812d = annotation;
        this.f59813e = field;
        this.f59811c = annotationArr;
    }

    /* renamed from: a */
    public final Annotation mo58838a() {
        return this.f59812d;
    }

    /* renamed from: b */
    public final void mo58839b(Object obj, Object obj2) throws Exception {
        if (!Modifier.isFinal(this.f59815g)) {
            this.f59813e.set(obj, obj2);
        }
    }

    /* renamed from: c */
    public final boolean mo58840c() {
        if (Modifier.isStatic(this.f59815g) || !Modifier.isFinal(this.f59815g)) {
            return false;
        }
        return true;
    }

    public final Object get(Object obj) throws Exception {
        return this.f59813e.get(obj);
    }

    public final <T extends Annotation> T getAnnotation(Class<T> cls) {
        if (cls == this.f59812d.annotationType()) {
            return this.f59812d;
        }
        if (this.f59810b.isEmpty()) {
            for (Annotation annotation : this.f59811c) {
                this.f59810b.put(annotation.annotationType(), annotation);
            }
        }
        return (Annotation) this.f59810b.get(cls);
    }

    public final Class getDeclaringClass() {
        return this.f59813e.getDeclaringClass();
    }

    public final String getName() {
        return this.f59814f;
    }

    public final Class getType() {
        return this.f59813e.getType();
    }

    public final String toString() {
        return String.format("field '%s' %s", new Object[]{this.f59814f, this.f59813e.toString()});
    }
}
