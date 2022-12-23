package uf0;

import cf0.C21132f;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p583jk.C17875h;
import uf0.C25032b;

/* renamed from: uf0.e */
public abstract class C25060e implements C25032b<Method> {

    /* renamed from: a */
    public final Method f63241a;

    /* renamed from: b */
    public final List<Type> f63242b;

    /* renamed from: c */
    public final Class f63243c;

    /* renamed from: uf0.e$a */
    public static final class C25061a extends C25060e implements C25031a {

        /* renamed from: d */
        public final Object f63244d;

        public C25061a(Object obj, Method method) {
            super(method, EmptyList.f60173b);
            this.f63244d = obj;
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            return this.f63241a.invoke(this.f63244d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: uf0.e$b */
    public static final class C25062b extends C25060e {
        public C25062b(Method method) {
            super(method, C17875h.m44280D(method.getDeclaringClass()));
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            Object[] objArr2;
            C25032b.C25033a.m62749a(this, objArr);
            Object obj = objArr[0];
            if (objArr.length <= 1) {
                objArr2 = new Object[0];
            } else {
                objArr2 = C21132f.m49433P0(objArr, 1, objArr.length);
            }
            return this.f63241a.invoke(obj, Arrays.copyOf(objArr2, objArr2.length));
        }
    }

    public C25060e(Method method, List list) {
        this.f63241a = method;
        this.f63242b = list;
        Class<?> returnType = method.getReturnType();
        C24362h.m61210e(returnType, "unboxMethod.returnType");
        this.f63243c = returnType;
    }

    /* renamed from: b */
    public final List<Type> mo59359b() {
        return this.f63242b;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Member mo59360c() {
        return null;
    }

    /* renamed from: i */
    public final Type mo59361i() {
        return this.f63243c;
    }
}
