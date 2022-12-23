package p206p4;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import p001a0.C0017h;
import p019b0.C1426c;
import p043ch.qos.logback.core.util.AggregationType;
import p043ch.qos.logback.core.util.PropertySetterException;
import p172m9.C5720b;
import p193o4.C5977c;
import p193o4.C5981g;
import p271u4.C6693d;
import p358af.C13437d;
import p584jl.C17885a;

/* renamed from: p4.c */
public final class C6064c extends C6693d {

    /* renamed from: e */
    public Object f19319e;

    /* renamed from: f */
    public Class<?> f19320f;

    /* renamed from: g */
    public C6063b[] f19321g;

    /* renamed from: h */
    public C6062a[] f19322h;

    /* renamed from: p4.c$a */
    public static /* synthetic */ class C6065a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19323a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ch.qos.logback.core.util.AggregationType[] r0 = p043ch.qos.logback.core.util.AggregationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19323a = r0
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19323a     // Catch:{ NoSuchFieldError -> 0x001d }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f19323a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f19323a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_BASIC_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f19323a     // Catch:{ NoSuchFieldError -> 0x003e }
                ch.qos.logback.core.util.AggregationType r1 = p043ch.qos.logback.core.util.AggregationType.AS_COMPLEX_PROPERTY_COLLECTION     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p206p4.C6064c.C6065a.<clinit>():void");
        }
    }

    public C6064c(Object obj) {
        this.f19319e = obj;
        this.f19320f = obj.getClass();
    }

    /* renamed from: m */
    public static String m14536m(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    /* renamed from: o */
    public static AggregationType m14537o(Method method) {
        Class cls;
        boolean z;
        Class[] parameterTypes = method.getParameterTypes();
        Method method2 = null;
        boolean z2 = true;
        if (parameterTypes.length != 1) {
            cls = null;
        } else {
            cls = parameterTypes[0];
        }
        if (cls == null) {
            return AggregationType.NOT_FOUND;
        }
        Package packageR = cls.getPackage();
        if (!cls.isPrimitive() && (packageR == null || !"java.lang".equals(packageR.getName()))) {
            try {
                method2 = cls.getMethod("valueOf", C5720b.f18548d);
            } catch (NoSuchMethodException | SecurityException unused) {
            }
            if (method2 == null) {
                z = false;
            } else {
                z = Modifier.isStatic(method2.getModifiers());
            }
            if (!z && !cls.isEnum() && !Charset.class.isAssignableFrom(cls)) {
                z2 = false;
            }
        }
        if (z2) {
            return AggregationType.AS_BASIC_PROPERTY;
        }
        return AggregationType.AS_COMPLEX_PROPERTY;
    }

    /* renamed from: n */
    public final AggregationType mo22046n(String str) {
        Method method;
        Method p = mo22047p(str);
        if (p != null) {
            AggregationType o = m14537o(p);
            int i = C6065a.f19323a[o.ordinal()];
            if (i == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i == 4 || i == 5) {
                mo21722a("Unexpected AggregationType " + o);
            }
        }
        C6063b r = mo22049r(C17885a.m44406J(str));
        if (r != null) {
            method = r.f19316a;
        } else {
            method = null;
        }
        if (method != null) {
            return m14537o(method);
        }
        return AggregationType.NOT_FOUND;
    }

    /* renamed from: p */
    public final Method mo22047p(String str) {
        String k = C25541a.m63881k(ProductAction.ACTION_ADD, m14536m(str));
        if (this.f19322h == null) {
            mo22050s();
        }
        int i = 0;
        while (true) {
            C6062a[] aVarArr = this.f19322h;
            if (i >= aVarArr.length) {
                return null;
            }
            if (k.equals(aVarArr[i].f19314a)) {
                return this.f19322h[i].f19315b;
            }
            i++;
        }
    }

    /* renamed from: q */
    public final Class<?> mo22048q(String str, AggregationType aggregationType, C1426c cVar) {
        Class<?> cls;
        Method method;
        Class<?> cls2;
        Class<?> cls3;
        Class cls4 = this.f19319e.getClass();
        cVar.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        while (true) {
            if (cls4 == null) {
                cls = null;
                break;
            }
            cls = (Class) ((Map) cVar.f5273c).get(new C5981g(cls4, lowerCase));
            if (cls != null) {
                break;
            }
            cls4 = cls4.getSuperclass();
        }
        if (cls != null) {
            return cls;
        }
        String m = m14536m(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            method = mo22047p(m);
        } else if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            C6063b r = mo22049r(C17885a.m44406J(m));
            if (r != null) {
                method = r.f19316a;
            } else {
                method = null;
            }
        } else {
            throw new IllegalStateException(aggregationType + " not allowed here");
        }
        if (method == null) {
            return null;
        }
        C5977c cVar2 = (C5977c) method.getAnnotation(C5977c.class);
        if (cVar2 != null) {
            cls2 = cVar2.value();
        } else {
            cls2 = null;
        }
        if (cls2 != null) {
            return cls2;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        boolean z = false;
        if (parameterTypes.length != 1) {
            cls3 = null;
        } else {
            cls3 = parameterTypes[0];
        }
        if (cls3 == null) {
            return null;
        }
        if (!cls3.isInterface()) {
            try {
                if (cls3.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]) != null) {
                    z = true;
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (z) {
            return cls3;
        }
        return null;
    }

    /* renamed from: r */
    public final C6063b mo22049r(String str) {
        if (this.f19321g == null) {
            mo22050s();
        }
        int i = 0;
        while (true) {
            C6063b[] bVarArr = this.f19321g;
            if (i >= bVarArr.length) {
                return null;
            }
            if (str.equals(bVarArr[i].f19317b)) {
                return this.f19321g[i];
            }
            i++;
        }
    }

    /* renamed from: s */
    public final void mo22050s() {
        this.f19321g = C17885a.m44429Z(this.f19320f);
        Class<?> cls = this.f19320f;
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getMethods()) {
            arrayList.add(new C6062a(method.getName(), method));
        }
        this.f19322h = (C6062a[]) arrayList.toArray(new C6062a[0]);
    }

    /* renamed from: t */
    public final void mo22051t(Object obj, Method method) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.f19319e, new Object[]{obj});
        } catch (Exception e) {
            StringBuilder k = C13555b.m33972k("Could not invoke method ");
            k.append(method.getName());
            k.append(" in class ");
            k.append(this.f19319e.getClass().getName());
            k.append(" with parameter of type ");
            k.append(cls.getName());
            mo21727f(k.toString(), e);
        }
    }

    /* renamed from: u */
    public final boolean mo22052u(String str, Class[] clsArr, Object obj) {
        StringBuilder sb;
        String str2;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            sb = C13555b.m33973l("Wrong number of parameters in setter method for property [", str, "] in ");
            str2 = this.f19319e.getClass().getName();
        } else if (clsArr[0].isAssignableFrom(obj.getClass())) {
            return true;
        } else {
            StringBuilder k = C13555b.m33972k("A \"");
            C13715c.m34249o(cls, k, "\" object is not assignable to a \"");
            k.append(clsArr[0].getName());
            k.append("\" variable.");
            mo21722a(k.toString());
            mo21722a("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            mo21722a("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb = new StringBuilder();
            sb.append("\"");
            sb.append(cls.getName());
            sb.append("\" was loaded by [");
            sb.append(cls.getClassLoader());
            str2 = "].";
        }
        sb.append(str2);
        mo21722a(sb.toString());
        return false;
    }

    /* renamed from: v */
    public final void mo22053v(Object obj, String str) {
        Class<?> cls;
        StringBuilder sb;
        C6063b r = mo22049r(C17885a.m44406J(str));
        if (r == null) {
            sb = C13555b.m33973l("Could not find PropertyDescriptor for [", str, "] in ");
            cls = this.f19320f;
        } else {
            Method method = r.f19316a;
            if (method == null) {
                sb = C13555b.m33973l("Not setter method for property [", str, "] in ");
                cls = this.f19319e.getClass();
            } else if (mo22052u(str, method.getParameterTypes(), obj)) {
                try {
                    mo22051t(obj, method);
                    return;
                } catch (Exception e) {
                    StringBuilder k = C13555b.m33972k("Could not set component ");
                    k.append(this.f19319e);
                    k.append(" for parent component ");
                    k.append(this.f19319e);
                    mo21727f(k.toString(), e);
                    return;
                }
            } else {
                return;
            }
        }
        sb.append(cls.getName());
        mo22867k(sb.toString());
    }

    /* renamed from: w */
    public final void mo22054w(String str, String str2) {
        if (str2 != null) {
            String J = C17885a.m44406J(str);
            C6063b r = mo22049r(J);
            if (r == null) {
                StringBuilder l = C13555b.m33973l("No such property [", J, "] in ");
                l.append(this.f19320f.getName());
                l.append(".");
                mo22867k(l.toString());
                return;
            }
            try {
                mo22055x(r, J, str2);
            } catch (PropertySetterException e) {
                mo22868l(C0017h.m56M("Failed to set property [", J, "] to value \"", str2, "\". "), e);
            }
        }
    }

    /* renamed from: x */
    public final void mo22055x(C6063b bVar, String str, String str2) throws PropertySetterException {
        Method method = bVar.f19316a;
        if (method != null) {
            Class[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                try {
                    Object c = C5720b.m14052c(this, parameterTypes[0], str2);
                    if (c != null) {
                        try {
                            method.invoke(this.f19319e, new Object[]{c});
                        } catch (Exception e) {
                            throw new PropertySetterException(e);
                        }
                    } else {
                        StringBuilder k = C13555b.m33972k("Conversion to type [");
                        k.append(parameterTypes[0]);
                        k.append("] failed.");
                        throw new PropertySetterException(k.toString());
                    }
                } catch (Throwable th) {
                    StringBuilder k2 = C13555b.m33972k("Conversion to type [");
                    k2.append(parameterTypes[0]);
                    k2.append("] failed. ");
                    throw new PropertySetterException(k2.toString(), th);
                }
            } else {
                throw new PropertySetterException("#params for setter != 1");
            }
        } else {
            throw new PropertySetterException(C13437d.m33706k("No setter for property [", str, "]."));
        }
    }
}
