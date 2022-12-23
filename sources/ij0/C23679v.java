package ij0;

import gj0.C23423b;
import gj0.C23431j;
import gj0.C23432k;
import gj0.C23433l;
import gj0.C23434m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;
import org.simpleframework.xml.DefaultType;
import p583jk.C17884p;

/* renamed from: ij0.v */
public final class C23679v implements C23675u {

    /* renamed from: a */
    public LinkedList f59840a = new LinkedList();

    /* renamed from: b */
    public LinkedList f59841b = new LinkedList();

    /* renamed from: c */
    public Annotation[] f59842c;

    /* renamed from: d */
    public DefaultType f59843d;

    /* renamed from: e */
    public DefaultType f59844e;

    /* renamed from: f */
    public Class f59845f;

    /* renamed from: g */
    public String f59846g;

    /* renamed from: h */
    public boolean f59847h;

    /* renamed from: i */
    public boolean f59848i;

    public C23679v(Class cls, DefaultType defaultType) {
        boolean z;
        this.f59842c = cls.getDeclaredAnnotations();
        this.f59843d = defaultType;
        this.f59848i = true;
        this.f59845f = cls;
        for (Method y0Var : cls.getDeclaredMethods()) {
            this.f59840a.add(new C23690y0(y0Var));
        }
        for (Field p0Var : cls.getDeclaredFields()) {
            this.f59841b.add(new C23660p0(p0Var));
        }
        for (Annotation annotation : this.f59842c) {
            if ((annotation instanceof C23431j) && annotation != null) {
                C23431j jVar = (C23431j) annotation;
            }
            if ((annotation instanceof C23432k) && annotation != null) {
                C23432k kVar = (C23432k) annotation;
            }
            if ((annotation instanceof C23434m) && annotation != null) {
                C23434m mVar = (C23434m) annotation;
                String simpleName = this.f59845f.getSimpleName();
                String name = mVar.name();
                if (name.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                name = z ? C17884p.m44330A(simpleName) : name;
                this.f59848i = mVar.strict();
                this.f59846g = name;
            }
            if ((annotation instanceof C23433l) && annotation != null) {
                C23433l lVar = (C23433l) annotation;
            }
            if ((annotation instanceof C23423b) && annotation != null) {
                C23423b bVar = (C23423b) annotation;
                this.f59847h = bVar.required();
                this.f59844e = bVar.value();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo58851b() {
        return this.f59845f.isPrimitive();
    }

    /* renamed from: c */
    public final boolean mo58852c() {
        return this.f59847h;
    }

    public final String getName() {
        return this.f59846g;
    }

    public final C23431j getNamespace() {
        return null;
    }

    public final C23433l getOrder() {
        return null;
    }

    public final C23434m getRoot() {
        return null;
    }

    public final Class getType() {
        return this.f59845f;
    }

    /* renamed from: k */
    public final Constructor[] mo58858k() {
        return this.f59845f.getDeclaredConstructors();
    }

    /* renamed from: l */
    public final DefaultType mo58859l() {
        return this.f59843d;
    }

    /* renamed from: m */
    public final boolean mo58860m() {
        return this.f59848i;
    }

    /* renamed from: n */
    public final List<C23660p0> mo58861n() {
        return this.f59841b;
    }

    /* renamed from: o */
    public final DefaultType mo58862o() {
        DefaultType defaultType = this.f59843d;
        if (defaultType != null) {
            return defaultType;
        }
        return this.f59844e;
    }

    /* renamed from: p */
    public final Class mo58863p() {
        Class<Object> superclass = this.f59845f.getSuperclass();
        if (superclass == Object.class) {
            return null;
        }
        return superclass;
    }

    /* renamed from: q */
    public final List<C23690y0> mo58864q() {
        return this.f59840a;
    }

    /* renamed from: r */
    public final boolean mo58865r() {
        if (Modifier.isStatic(this.f59845f.getModifiers())) {
            return true;
        }
        return !this.f59845f.isMemberClass();
    }

    /* renamed from: s */
    public final C23432k mo58866s() {
        return null;
    }

    public final String toString() {
        return this.f59845f.toString();
    }
}
