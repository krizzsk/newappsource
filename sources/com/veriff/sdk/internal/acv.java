package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22713xw;
import com.veriff.sdk.internal.acd;
import com.veriff.sdk.internal.acf;
import com.veriff.sdk.internal.aci;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class acv {

    /* renamed from: a */
    public final C22713xw.C22714a f53776a;

    /* renamed from: b */
    public final C22738yl f53777b;

    /* renamed from: c */
    public final List<aci.C21342a> f53778c;

    /* renamed from: d */
    public final List<acf.C21336a> f53779d;

    /* renamed from: e */
    public final Executor f53780e;

    /* renamed from: f */
    public final boolean f53781f;

    /* renamed from: g */
    private final Map<Method, acw<?>> f53782g = new ConcurrentHashMap();

    /* renamed from: com.veriff.sdk.internal.acv$a */
    public static final class C21384a {

        /* renamed from: a */
        private final acr f53787a;

        /* renamed from: b */
        private C22713xw.C22714a f53788b;

        /* renamed from: c */
        private C22738yl f53789c;

        /* renamed from: d */
        private final List<aci.C21342a> f53790d;

        /* renamed from: e */
        private final List<acf.C21336a> f53791e;

        public C21384a(acr acr) {
            this.f53790d = new ArrayList();
            this.f53791e = new ArrayList();
            this.f53787a = acr;
        }

        /* renamed from: a */
        public C21384a mo54091a(C22746yp ypVar) {
            Objects.requireNonNull(ypVar, "client == null");
            return mo54089a((C22713xw.C22714a) ypVar);
        }

        /* renamed from: a */
        public C21384a mo54089a(C22713xw.C22714a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f53788b = aVar;
            return this;
        }

        /* renamed from: a */
        public C21384a mo54092a(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return mo54090a(C22738yl.m55584f(str));
        }

        public C21384a() {
            this(acr.m50762a());
        }

        /* renamed from: a */
        public C21384a mo54090a(C22738yl ylVar) {
            Objects.requireNonNull(ylVar, "baseUrl == null");
            List<String> k = ylVar.mo57298k();
            if ("".equals(k.get(k.size() - 1))) {
                this.f53789c = ylVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + ylVar);
        }

        /* renamed from: a */
        public C21384a mo54088a(aci.C21342a aVar) {
            List<aci.C21342a> list = this.f53790d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C21384a mo54087a(acf.C21336a aVar) {
            List<acf.C21336a> list = this.f53791e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        /* renamed from: a */
        public acv mo54093a() {
            if (this.f53789c != null) {
                C22713xw.C22714a aVar = this.f53788b;
                if (aVar == null) {
                    aVar = new C22746yp();
                }
                C22713xw.C22714a aVar2 = aVar;
                Executor b = this.f53787a.mo54050b();
                ArrayList arrayList = new ArrayList(this.f53791e);
                arrayList.addAll(this.f53787a.mo54048a(b));
                ArrayList arrayList2 = new ArrayList(this.f53790d.size() + 1 + this.f53787a.mo54052d());
                arrayList2.add(new acd());
                arrayList2.addAll(this.f53790d);
                arrayList2.addAll(this.f53787a.mo54051c());
                return new acv(aVar2, this.f53789c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), b, false);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public acv(C22713xw.C22714a aVar, C22738yl ylVar, List<aci.C21342a> list, List<acf.C21336a> list2, Executor executor, boolean z) {
        this.f53776a = aVar;
        this.f53777b = ylVar;
        this.f53778c = list;
        this.f53779d = list2;
        this.f53780e = executor;
        this.f53781f = z;
    }

    /* renamed from: b */
    private void m50809b(Class<?> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f53781f) {
                acr a = acr.m50762a();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!a.mo54049a(method) && !Modifier.isStatic(method.getModifiers())) {
                        mo54082a(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    /* renamed from: a */
    public <T> T mo54083a(final Class<T> cls) {
        m50809b(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c */
            private final acr f53785c = acr.m50762a();

            /* renamed from: d */
            private final Object[] f53786d = new Object[0];

            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.f53786d;
                }
                if (this.f53785c.mo54049a(method)) {
                    return this.f53785c.mo54047a(method, cls, obj, objArr);
                }
                return acv.this.mo54082a(method).mo54019a(objArr);
            }
        });
    }

    /* renamed from: c */
    public <T> aci<T, String> mo54085c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f53778c.size();
        for (int i = 0; i < size; i++) {
            aci<?, String> b = this.f53778c.get(i).mo54015b(type, annotationArr, this);
            if (b != null) {
                return b;
            }
        }
        return acd.C21333d.f53617a;
    }

    /* renamed from: a */
    public acw<?> mo54082a(Method method) {
        acw<?> acw;
        acw<?> acw2 = this.f53782g.get(method);
        if (acw2 != null) {
            return acw2;
        }
        synchronized (this.f53782g) {
            acw = this.f53782g.get(method);
            if (acw == null) {
                acw = acw.m50826a(this, method);
                this.f53782g.put(method, acw);
            }
        }
        return acw;
    }

    /* renamed from: a */
    public acf<?, ?> mo54078a(Type type, Annotation[] annotationArr) {
        return mo54077a((acf.C21336a) null, type, annotationArr);
    }

    /* renamed from: a */
    public acf<?, ?> mo54077a(acf.C21336a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f53779d.indexOf(aVar) + 1;
        int size = this.f53779d.size();
        for (int i = indexOf; i < size; i++) {
            acf<?, ?> a = this.f53779d.get(i).mo54009a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f53779d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f53779d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53779d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public <T> aci<C22759yv, T> mo54084b(Type type, Annotation[] annotationArr) {
        return mo54079a((aci.C21342a) null, type, annotationArr);
    }

    /* renamed from: a */
    public <T> aci<T, C22754yt> mo54081a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return mo54080a((aci.C21342a) null, type, annotationArr, annotationArr2);
    }

    /* renamed from: a */
    public <T> aci<T, C22754yt> mo54080a(aci.C21342a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f53778c.indexOf(aVar) + 1;
        int size = this.f53778c.size();
        for (int i = indexOf; i < size; i++) {
            aci<?, C22754yt> a = this.f53778c.get(i).mo53994a(type, annotationArr, annotationArr2, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f53778c.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f53778c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53778c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public <T> aci<C22759yv, T> mo54079a(aci.C21342a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f53778c.indexOf(aVar) + 1;
        int size = this.f53778c.size();
        for (int i = indexOf; i < size; i++) {
            aci<C22759yv, ?> a = this.f53778c.get(i).mo53993a(type, annotationArr, this);
            if (a != null) {
                return a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f53778c.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f53778c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f53778c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
