package fg0;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;
import og0.C24590e;
import sf0.C24855b;
import ug0.C25069e;

/* renamed from: fg0.h */
public final class C23363h extends C23359e implements C24590e {

    /* renamed from: b */
    public final Object[] f59142b;

    public C23363h(C25069e eVar, Object[] objArr) {
        super(eVar);
        this.f59142b = objArr;
    }

    public final ArrayList getElements() {
        Object obj;
        Object[] objArr = this.f59142b;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            i++;
            C24362h.m61208c(obj2);
            Class<?> cls = obj2.getClass();
            List<C24855b<? extends Object>> list = ReflectClassUtilKt.f60530a;
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new C23369n((C25069e) null, (Enum) obj2);
            } else if (obj2 instanceof Annotation) {
                obj = new C23360f((C25069e) null, (Annotation) obj2);
            } else if (obj2 instanceof Object[]) {
                obj = new C23363h((C25069e) null, (Object[]) obj2);
            } else if (obj2 instanceof Class) {
                obj = new C23365j((C25069e) null, (Class) obj2);
            } else {
                obj = new C23371p(obj2, (C25069e) null);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
