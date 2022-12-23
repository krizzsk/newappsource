package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import cf0.C21136j;
import fg0.C23354b;
import fg0.C23361g;
import fg0.C23366k;
import fg0.C23368m;
import fg0.C23374s;
import fg0.C23380x;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C23816b;
import kotlin.collections.EmptyList;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import og0.C24585a;
import og0.C24592g;
import og0.C24595j;
import p092g3.C4752a;
import p583jk.C17875h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25479n0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a */
public final class C23912a extends C23368m implements C23361g, C23374s, C24592g {

    /* renamed from: a */
    public final Class<?> f60543a;

    public C23912a(Class<?> cls) {
        C24362h.m61211f(cls, "klass");
        this.f60543a = cls;
    }

    /* renamed from: A */
    public final boolean mo58506A() {
        return Modifier.isAbstract(getModifiers());
    }

    /* renamed from: C */
    public final Collection<C24595j> mo59468C() {
        Class<?> cls = this.f60543a;
        C24362h.m61211f(cls, "clazz");
        C23354b.C23355a aVar = C23354b.f59130a;
        Class[] clsArr = null;
        int i = 0;
        if (aVar == null) {
            Class<Class> cls2 = Class.class;
            try {
                aVar = new C23354b.C23355a(cls2.getMethod("isSealed", new Class[0]), cls2.getMethod("getPermittedSubclasses", new Class[0]), cls2.getMethod("isRecord", new Class[0]), cls2.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C23354b.C23355a((Method) null, (Method) null, (Method) null, (Method) null);
            }
            C23354b.f59130a = aVar;
        }
        Method method = aVar.f59132b;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke != null) {
                clsArr = (Class[]) invoke;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            }
        }
        if (clsArr == null) {
            return EmptyList.f60173b;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        int length = clsArr.length;
        while (i < length) {
            Class cls3 = clsArr[i];
            i++;
            arrayList.add(new C23366k(cls3));
        }
        return arrayList;
    }

    /* renamed from: D */
    public final List mo59469D() {
        Class[] declaredClasses = this.f60543a.getDeclaredClasses();
        C24362h.m61210e(declaredClasses, "klass.declaredClasses");
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60550k0(C24177b.m60544e0(C23816b.m58436R0(declaredClasses), ReflectJavaClass$innerClassNames$1.f60540f), ReflectJavaClass$innerClassNames$2.f60541f)));
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: G */
    public final boolean mo58507G() {
        return Modifier.isFinal(getModifiers());
    }

    /* renamed from: J */
    public final List mo59470J() {
        Field[] declaredFields = this.f60543a.getDeclaredFields();
        C24362h.m61210e(declaredFields, "klass.declaredFields");
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60549j0(C24177b.m60544e0(C23816b.m58436R0(declaredFields), ReflectJavaClass$fields$1.f60538b), ReflectJavaClass$fields$2.f60539b)));
    }

    /* renamed from: O */
    public final boolean mo59471O() {
        return this.f60543a.isInterface();
    }

    /* renamed from: P */
    public final void mo59472P() {
    }

    /* renamed from: c */
    public final C24585a mo58494c(C25066c cVar) {
        return C23361g.C23362a.m57440a(this, cVar);
    }

    /* renamed from: e */
    public final boolean mo58509e() {
        return Modifier.isStatic(getModifiers());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23912a) && C24362h.m61206a(this.f60543a, ((C23912a) obj).f60543a);
    }

    /* renamed from: f */
    public final C25066c mo59474f() {
        C25066c b = ReflectClassUtilKt.m58949a(this.f60543a).mo61569b();
        C24362h.m61210e(b, "klass.classId.asSingleFqName()");
        return b;
    }

    /* renamed from: g */
    public final C25479n0 mo58511g() {
        return C23374s.C23375a.m57476a(this);
    }

    public final Collection getAnnotations() {
        return C23361g.C23362a.m57441b(this);
    }

    public final int getModifiers() {
        return this.f60543a.getModifiers();
    }

    public final C25069e getName() {
        return C25069e.m62820i(this.f60543a.getSimpleName());
    }

    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f60543a.getTypeParameters();
        C24362h.m61210e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        int length = typeParameters.length;
        int i = 0;
        while (i < length) {
            TypeVariable typeVariable = typeParameters[i];
            i++;
            arrayList.add(new C23380x(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f60543a.hashCode();
    }

    /* renamed from: j */
    public final List mo59476j() {
        Constructor[] declaredConstructors = this.f60543a.getDeclaredConstructors();
        C24362h.m61210e(declaredConstructors, "klass.declaredConstructors");
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60549j0(C24177b.m60544e0(C23816b.m58436R0(declaredConstructors), ReflectJavaClass$constructors$1.f60536b), ReflectJavaClass$constructors$2.f60537b)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo59477k() {
        /*
            r10 = this;
            java.lang.Class<?> r0 = r10.f60543a
            java.lang.String r1 = "clazz"
            mf0.C24362h.m61211f(r0, r1)
            fg0.b$a r1 = fg0.C23354b.f59130a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x003d
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            fg0.b$a r4 = new fg0.b$a     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r5 = "isSealed"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r6 = "getPermittedSubclasses"
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r6 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r7 = "isRecord"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.String r8 = "getRecordComponents"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0036 }
            java.lang.reflect.Method r1 = r1.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ NoSuchMethodException -> 0x0036 }
            r1 = r4
            goto L_0x003b
        L_0x0036:
            fg0.b$a r1 = new fg0.b$a
            r1.<init>(r2, r2, r2, r2)
        L_0x003b:
            fg0.C23354b.f59130a = r1
        L_0x003d:
            java.lang.reflect.Method r1 = r1.f59134d
            if (r1 != 0) goto L_0x0042
            goto L_0x004b
        L_0x0042:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r0 = r1.invoke(r0, r2)
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
        L_0x004b:
            if (r2 != 0) goto L_0x004f
            java.lang.Object[] r2 = new java.lang.Object[r3]
        L_0x004f:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.length
            r0.<init>(r1)
            int r1 = r2.length
        L_0x0056:
            if (r3 >= r1) goto L_0x0065
            r4 = r2[r3]
            int r3 = r3 + 1
            fg0.v r5 = new fg0.v
            r5.<init>(r4)
            r0.add(r5)
            goto L_0x0056
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a.mo59477k():java.util.ArrayList");
    }

    /* renamed from: m */
    public final boolean mo59478m() {
        return this.f60543a.isAnnotation();
    }

    /* renamed from: n */
    public final Collection<C24595j> mo59479n() {
        Type type = Object.class;
        if (C24362h.m61206a(this.f60543a, type)) {
            return EmptyList.f60173b;
        }
        C4752a aVar = new C4752a(2);
        Type genericSuperclass = this.f60543a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        aVar.mo20256c(type);
        Type[] genericInterfaces = this.f60543a.getGenericInterfaces();
        C24362h.m61210e(genericInterfaces, "klass.genericInterfaces");
        aVar.mo20257d(genericInterfaces);
        List<Type> E = C17875h.m44281E(aVar.mo20260g(new Type[aVar.mo20259f()]));
        ArrayList arrayList = new ArrayList(C21136j.m49436X(E, 10));
        for (Type kVar : E) {
            arrayList.add(new C23366k(kVar));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final C23912a mo59480o() {
        Class<?> declaringClass = this.f60543a.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        return new C23912a(declaringClass);
    }

    /* renamed from: p */
    public final boolean mo59481p() {
        Class<?> cls = this.f60543a;
        C24362h.m61211f(cls, "clazz");
        C23354b.C23355a aVar = C23354b.f59130a;
        Boolean bool = null;
        if (aVar == null) {
            Class<Class> cls2 = Class.class;
            try {
                aVar = new C23354b.C23355a(cls2.getMethod("isSealed", new Class[0]), cls2.getMethod("getPermittedSubclasses", new Class[0]), cls2.getMethod("isRecord", new Class[0]), cls2.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C23354b.C23355a((Method) null, (Method) null, (Method) null, (Method) null);
            }
            C23354b.f59130a = aVar;
        }
        Method method = aVar.f59133c;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke != null) {
                bool = Boolean.valueOf(((Boolean) invoke).booleanValue());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: r */
    public final void mo59482r() {
    }

    /* renamed from: s */
    public final List mo59483s() {
        Method[] declaredMethods = this.f60543a.getDeclaredMethods();
        C24362h.m61210e(declaredMethods, "klass.declaredMethods");
        return C17875h.m44285I(C24177b.m60553n0(C24177b.m60549j0(C24177b.m60543d0(C23816b.m58436R0(declaredMethods), new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.f60542b)));
    }

    /* renamed from: t */
    public final AnnotatedElement mo58484t() {
        return this.f60543a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23912a.class, sb, ": ");
        sb.append(this.f60543a);
        return sb.toString();
    }

    /* renamed from: w */
    public final boolean mo59485w() {
        return this.f60543a.isEnum();
    }

    /* renamed from: y */
    public final boolean mo59486y() {
        Class<?> cls = this.f60543a;
        C24362h.m61211f(cls, "clazz");
        C23354b.C23355a aVar = C23354b.f59130a;
        Boolean bool = null;
        if (aVar == null) {
            Class<Class> cls2 = Class.class;
            try {
                aVar = new C23354b.C23355a(cls2.getMethod("isSealed", new Class[0]), cls2.getMethod("getPermittedSubclasses", new Class[0]), cls2.getMethod("isRecord", new Class[0]), cls2.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C23354b.C23355a((Method) null, (Method) null, (Method) null, (Method) null);
            }
            C23354b.f59130a = aVar;
        }
        Method method = aVar.f59131a;
        if (method != null) {
            Object invoke = method.invoke(cls, new Object[0]);
            if (invoke != null) {
                bool = Boolean.valueOf(((Boolean) invoke).booleanValue());
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
