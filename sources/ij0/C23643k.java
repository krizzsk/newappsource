package ij0;

import gj0.C23431j;
import gj0.C23432k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.core.C24644b;
import org.simpleframework.xml.core.C24664u;
import p247s6.C6478c;

/* renamed from: ij0.k */
public final class C23643k {

    /* renamed from: a */
    public C6478c f59783a = new C6478c(6);

    /* renamed from: b */
    public C24644b f59784b;

    /* renamed from: c */
    public C23663q0 f59785c;

    /* renamed from: d */
    public C23663q0 f59786d;

    /* renamed from: e */
    public C23663q0 f59787e;

    /* renamed from: f */
    public C23663q0 f59788f;

    /* renamed from: g */
    public C23663q0 f59789g;

    /* renamed from: h */
    public C23663q0 f59790h;

    /* renamed from: i */
    public C24664u f59791i;

    public C23643k(C23675u uVar, C24664u uVar2) throws Exception {
        C23675u uVar3;
        this.f59784b = new C24644b(uVar, uVar2);
        this.f59791i = uVar2;
        DefaultType l = uVar.mo58859l();
        Class type = uVar.getType();
        while (type != null) {
            C24664u uVar4 = this.f59791i;
            if (l != null) {
                uVar3 = uVar4.f62443c.mo61062a(type);
            } else {
                uVar3 = uVar4.f62444d.mo61062a(type);
            }
            C23432k s = uVar3.mo58866s();
            C23431j namespace = uVar3.getNamespace();
            if (namespace != null) {
                ((List) this.f59783a.f20214a).add(namespace);
            }
            if (s != null) {
                for (C23431j add : s.value()) {
                    ((List) this.f59783a.f20214a).add(add);
                }
            }
            for (C23690y0 next : uVar3.mo58864q()) {
                Annotation[] annotationArr = next.f59868a;
                Method method = next.f59869b;
                for (Annotation annotation : annotationArr) {
                    if ((annotation instanceof C23649m) && this.f59785c == null) {
                        this.f59785c = m57990a(method);
                    }
                    if ((annotation instanceof C23684w1) && this.f59786d == null) {
                        this.f59786d = m57990a(method);
                    }
                    if ((annotation instanceof C23630f1) && this.f59787e == null) {
                        this.f59787e = m57990a(method);
                    }
                    if ((annotation instanceof C23655o) && this.f59788f == null) {
                        this.f59788f = m57990a(method);
                    }
                    if ((annotation instanceof C23645k1) && this.f59789g == null) {
                        this.f59789g = m57990a(method);
                    }
                    if ((annotation instanceof C23648l1) && this.f59790h == null) {
                        this.f59790h = m57990a(method);
                    }
                }
            }
            uVar3.getRoot();
            uVar3.getOrder();
            type = uVar3.mo58863p();
        }
        C23431j namespace2 = uVar.getNamespace();
        if (namespace2 != null) {
            C6478c cVar = this.f59783a;
            ((List) cVar.f20214a).add(namespace2);
            cVar.f20215b = namespace2;
        }
    }

    /* renamed from: a */
    public static C23663q0 m57990a(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        boolean z = false;
        if (parameterTypes.length == 1) {
            z = Map.class.equals(parameterTypes[0]);
        }
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return new C23663q0(method, z);
    }
}
