package ij0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* renamed from: ij0.p0 */
public final class C23660p0 {

    /* renamed from: a */
    public final Annotation[] f59819a;

    /* renamed from: b */
    public final Field f59820b;

    public C23660p0(Field field) {
        this.f59819a = field.getDeclaredAnnotations();
        field.getName();
        this.f59820b = field;
    }
}
