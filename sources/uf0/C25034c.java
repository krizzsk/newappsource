package uf0;

import bf0.C21050d;
import cf0.C21132f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p092g3.C4752a;
import p583jk.C17875h;
import uf0.C25032b;

/* renamed from: uf0.c */
public abstract class C25034c<M extends Member> implements C25032b<M> {

    /* renamed from: a */
    public final M f63223a;

    /* renamed from: b */
    public final Type f63224b;

    /* renamed from: c */
    public final Class<?> f63225c;

    /* renamed from: d */
    public final List<Type> f63226d;

    /* renamed from: uf0.c$a */
    public static final class C25035a extends C25034c<Constructor<?>> implements C25031a {

        /* renamed from: e */
        public final Object f63227e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25035a(java.lang.reflect.Constructor<?> r5, java.lang.Object r6) {
            /*
                r4 = this;
                java.lang.String r0 = "constructor"
                mf0.C24362h.m61211f(r5, r0)
                java.lang.Class r0 = r5.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                mf0.C24362h.m61210e(r0, r1)
                java.lang.reflect.Type[] r1 = r5.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                mf0.C24362h.m61210e(r1, r2)
                int r2 = r1.length
                r3 = 2
                if (r2 > r3) goto L_0x001f
                r1 = 0
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                goto L_0x0026
            L_0x001f:
                int r2 = r1.length
                r3 = 1
                int r2 = r2 - r3
                java.lang.Object[] r1 = cf0.C21132f.m49433P0(r1, r3, r2)
            L_0x0026:
                java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
                r2 = 0
                r4.<init>(r5, r0, r2, r1)
                r4.f63227e = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25035a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            C4752a aVar = new C4752a(3);
            aVar.mo20256c(this.f63227e);
            aVar.mo20257d(objArr);
            aVar.mo20256c((Object) null);
            return ((Constructor) this.f63223a).newInstance(aVar.mo20260g(new Object[aVar.mo20259f()]));
        }
    }

    /* renamed from: uf0.c$b */
    public static final class C25036b extends C25034c<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25036b(java.lang.reflect.Constructor<?> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "constructor"
                mf0.C24362h.m61211f(r6, r0)
                java.lang.Class r0 = r6.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                mf0.C24362h.m61210e(r0, r1)
                java.lang.reflect.Type[] r1 = r6.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                mf0.C24362h.m61210e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 1
                if (r2 > r4) goto L_0x001f
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
                goto L_0x0025
            L_0x001f:
                int r2 = r1.length
                int r2 = r2 - r4
                java.lang.Object[] r1 = cf0.C21132f.m49433P0(r1, r3, r2)
            L_0x0025:
                java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
                r2 = 0
                r5.<init>(r6, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25036b.<init>(java.lang.reflect.Constructor):void");
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            C4752a aVar = new C4752a(2);
            aVar.mo20257d(objArr);
            aVar.mo20256c((Object) null);
            return ((Constructor) this.f63223a).newInstance(aVar.mo20260g(new Object[aVar.mo20259f()]));
        }
    }

    /* renamed from: uf0.c$c */
    public static final class C25037c extends C25034c<Constructor<?>> implements C25031a {

        /* renamed from: e */
        public final Object f63228e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25037c(java.lang.reflect.Constructor<?> r4, java.lang.Object r5) {
            /*
                r3 = this;
                java.lang.String r0 = "constructor"
                mf0.C24362h.m61211f(r4, r0)
                java.lang.Class r0 = r4.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                mf0.C24362h.m61210e(r0, r1)
                java.lang.reflect.Type[] r1 = r4.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                mf0.C24362h.m61210e(r1, r2)
                r2 = 0
                r3.<init>(r4, r0, r2, r1)
                r3.f63228e = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25037c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            C4752a aVar = new C4752a(2);
            aVar.mo20256c(this.f63228e);
            aVar.mo20257d(objArr);
            return ((Constructor) this.f63223a).newInstance(aVar.mo20260g(new Object[aVar.mo20259f()]));
        }
    }

    /* renamed from: uf0.c$d */
    public static final class C25038d extends C25034c<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25038d(java.lang.reflect.Constructor<?> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "constructor"
                mf0.C24362h.m61211f(r5, r0)
                java.lang.Class r0 = r5.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                mf0.C24362h.m61210e(r0, r1)
                java.lang.Class r1 = r5.getDeclaringClass()
                java.lang.Class r2 = r1.getDeclaringClass()
                if (r2 == 0) goto L_0x0023
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x0023
                goto L_0x0024
            L_0x0023:
                r2 = 0
            L_0x0024:
                java.lang.reflect.Type[] r1 = r5.getGenericParameterTypes()
                java.lang.String r3 = "constructor.genericParameterTypes"
                mf0.C24362h.m61210e(r1, r3)
                r4.<init>(r5, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25038d.<init>(java.lang.reflect.Constructor):void");
        }

        /* renamed from: a */
        public final Object mo59358a(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            return ((Constructor) this.f63223a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: uf0.c$e */
    public static abstract class C25039e extends C25034c<Field> {

        /* renamed from: uf0.c$e$a */
        public static final class C25040a extends C25039e implements C25031a {

            /* renamed from: e */
            public final Object f63229e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25040a(Field field, Object obj) {
                super(field, false);
                C24362h.m61211f(field, "field");
                this.f63229e = obj;
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                return ((Field) this.f63223a).get(this.f63229e);
            }
        }

        /* renamed from: uf0.c$e$b */
        public static final class C25041b extends C25039e implements C25031a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25041b(Field field) {
                super(field, false);
                C24362h.m61211f(field, "field");
            }
        }

        /* renamed from: uf0.c$e$c */
        public static final class C25042c extends C25039e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25042c(Field field) {
                super(field, true);
                C24362h.m61211f(field, "field");
            }
        }

        /* renamed from: uf0.c$e$d */
        public static final class C25043d extends C25039e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25043d(Field field) {
                super(field, true);
                C24362h.m61211f(field, "field");
            }

            /* renamed from: d */
            public final void mo61563d(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                mo61564e(C23816b.m58440V0(objArr));
            }
        }

        /* renamed from: uf0.c$e$e */
        public static final class C25044e extends C25039e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25044e(Field field) {
                super(field, false);
                C24362h.m61211f(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25039e(java.lang.reflect.Field r3, boolean r4) {
            /*
                r2 = this;
                java.lang.reflect.Type r0 = r3.getGenericType()
                java.lang.String r1 = "field.genericType"
                mf0.C24362h.m61210e(r0, r1)
                if (r4 == 0) goto L_0x0010
                java.lang.Class r4 = r3.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r4 = 0
            L_0x0011:
                r1 = 0
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2.<init>(r3, r0, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25039e.<init>(java.lang.reflect.Field, boolean):void");
        }

        /* renamed from: a */
        public Object mo59358a(Object[] objArr) {
            Object obj;
            mo61563d(objArr);
            Field field = (Field) this.f63223a;
            if (this.f63225c != null) {
                obj = C23816b.m58439U0(objArr);
            } else {
                obj = null;
            }
            return field.get(obj);
        }
    }

    /* renamed from: uf0.c$f */
    public static abstract class C25045f extends C25034c<Field> {

        /* renamed from: e */
        public final boolean f63230e;

        /* renamed from: uf0.c$f$a */
        public static final class C25046a extends C25045f implements C25031a {

            /* renamed from: f */
            public final Object f63231f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25046a(Field field, boolean z, Object obj) {
                super(field, z, false);
                C24362h.m61211f(field, "field");
                this.f63231f = obj;
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                mo61563d(objArr);
                ((Field) this.f63223a).set(this.f63231f, C23816b.m58439U0(objArr));
                return C21050d.f52856a;
            }
        }

        /* renamed from: uf0.c$f$b */
        public static final class C25047b extends C25045f implements C25031a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25047b(Field field, boolean z) {
                super(field, z, false);
                C24362h.m61211f(field, "field");
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                mo61563d(objArr);
                ((Field) this.f63223a).set((Object) null, C23816b.m58445a1(objArr));
                return C21050d.f52856a;
            }
        }

        /* renamed from: uf0.c$f$c */
        public static final class C25048c extends C25045f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25048c(Field field, boolean z) {
                super(field, z, true);
                C24362h.m61211f(field, "field");
            }
        }

        /* renamed from: uf0.c$f$d */
        public static final class C25049d extends C25045f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25049d(Field field, boolean z) {
                super(field, z, true);
                C24362h.m61211f(field, "field");
            }

            /* renamed from: d */
            public final void mo61563d(Object[] objArr) {
                super.mo61563d(objArr);
                mo61564e(C23816b.m58440V0(objArr));
            }
        }

        /* renamed from: uf0.c$f$e */
        public static final class C25050e extends C25045f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25050e(Field field, boolean z) {
                super(field, z, false);
                C24362h.m61211f(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25045f(java.lang.reflect.Field r6, boolean r7, boolean r8) {
            /*
                r5 = this;
                java.lang.Class r0 = java.lang.Void.TYPE
                java.lang.String r1 = "TYPE"
                mf0.C24362h.m61210e(r0, r1)
                if (r8 == 0) goto L_0x000e
                java.lang.Class r8 = r6.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r8 = 0
            L_0x000f:
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                java.lang.reflect.Type r3 = r6.getGenericType()
                java.lang.String r4 = "field.genericType"
                mf0.C24362h.m61210e(r3, r4)
                r1[r2] = r3
                r5.<init>(r6, r0, r8, r1)
                r5.f63230e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25045f.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        /* renamed from: a */
        public Object mo59358a(Object[] objArr) {
            Object obj;
            mo61563d(objArr);
            Field field = (Field) this.f63223a;
            if (this.f63225c != null) {
                obj = C23816b.m58439U0(objArr);
            } else {
                obj = null;
            }
            field.set(obj, C23816b.m58445a1(objArr));
            return C21050d.f52856a;
        }

        /* renamed from: d */
        public void mo61563d(Object[] objArr) {
            C25032b.C25033a.m62749a(this, objArr);
            if (this.f63230e && C23816b.m58445a1(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }
    }

    public C25034c(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> list;
        this.f63223a = member;
        this.f63224b = type;
        this.f63225c = cls;
        if (cls == null) {
            list = C23816b.m58452h1(typeArr);
        } else {
            C4752a aVar = new C4752a(2);
            aVar.mo20256c(cls);
            aVar.mo20257d(typeArr);
            list = C17875h.m44281E(aVar.mo20260g(new Type[aVar.mo20259f()]));
        }
        this.f63226d = list;
    }

    /* renamed from: b */
    public final List<Type> mo59359b() {
        return this.f63226d;
    }

    /* renamed from: c */
    public final M mo59360c() {
        return this.f63223a;
    }

    /* renamed from: d */
    public void mo61563d(Object[] objArr) {
        C25032b.C25033a.m62749a(this, objArr);
    }

    /* renamed from: e */
    public final void mo61564e(Object obj) {
        if (obj == null || !this.f63223a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    /* renamed from: i */
    public final Type mo59361i() {
        return this.f63224b;
    }

    /* renamed from: uf0.c$g */
    public static abstract class C25051g extends C25034c<Method> {

        /* renamed from: e */
        public final boolean f63232e;

        /* renamed from: uf0.c$g$a */
        public static final class C25052a extends C25051g implements C25031a {

            /* renamed from: f */
            public final Object f63233f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25052a(Object obj, Method method) {
                super(method, false, 4);
                C24362h.m61211f(method, "method");
                this.f63233f = obj;
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                return mo61565f(this.f63233f, objArr);
            }
        }

        /* renamed from: uf0.c$g$b */
        public static final class C25053b extends C25051g implements C25031a {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25053b(Method method) {
                super(method, false, 4);
                C24362h.m61211f(method, "method");
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                return mo61565f((Object) null, objArr);
            }
        }

        /* renamed from: uf0.c$g$c */
        public static final class C25054c extends C25051g implements C25031a {

            /* renamed from: f */
            public final Object f63234f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C25054c(java.lang.Object r5, java.lang.reflect.Method r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    mf0.C24362h.m61211f(r6, r0)
                    java.lang.reflect.Type[] r0 = r6.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    mf0.C24362h.m61210e(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = cf0.C21132f.m49433P0(r0, r2, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>((java.lang.reflect.Method) r6, (boolean) r3, (java.lang.reflect.Type[]) r0)
                    r4.f63234f = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25051g.C25054c.<init>(java.lang.Object, java.lang.reflect.Method):void");
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                C4752a aVar = new C4752a(2);
                aVar.mo20256c(this.f63234f);
                aVar.mo20257d(objArr);
                return mo61565f((Object) null, aVar.mo20260g(new Object[aVar.mo20259f()]));
            }
        }

        /* renamed from: uf0.c$g$d */
        public static final class C25055d extends C25051g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25055d(Method method) {
                super(method, false, 6);
                C24362h.m61211f(method, "method");
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
                return mo61565f(obj, objArr2);
            }
        }

        /* renamed from: uf0.c$g$e */
        public static final class C25056e extends C25051g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25056e(Method method) {
                super(method, true, 4);
                C24362h.m61211f(method, "method");
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                Object[] objArr2;
                C25032b.C25033a.m62749a(this, objArr);
                mo61564e(C23816b.m58440V0(objArr));
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = C21132f.m49433P0(objArr, 1, objArr.length);
                }
                return mo61565f((Object) null, objArr2);
            }
        }

        /* renamed from: uf0.c$g$f */
        public static final class C25057f extends C25051g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C25057f(Method method) {
                super(method, false, 6);
                C24362h.m61211f(method, "method");
            }

            /* renamed from: a */
            public final Object mo59358a(Object[] objArr) {
                C25032b.C25033a.m62749a(this, objArr);
                return mo61565f((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C25051g(java.lang.reflect.Method r2, boolean r3, int r4) {
            /*
                r1 = this;
                r0 = r4 & 2
                if (r0 == 0) goto L_0x000e
                int r3 = r2.getModifiers()
                boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
                r3 = r3 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001c
                java.lang.reflect.Type[] r4 = r2.getGenericParameterTypes()
                java.lang.String r0 = "class Method(\n        me…        }\n        }\n    }"
                mf0.C24362h.m61210e(r4, r0)
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                r1.<init>((java.lang.reflect.Method) r2, (boolean) r3, (java.lang.reflect.Type[]) r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25051g.<init>(java.lang.reflect.Method, boolean, int):void");
        }

        /* renamed from: f */
        public final Object mo61565f(Object obj, Object[] objArr) {
            C24362h.m61211f(objArr, "args");
            Object invoke = ((Method) this.f63223a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (this.f63232e) {
                return C21050d.f52856a;
            }
            return invoke;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C25051g(java.lang.reflect.Method r3, boolean r4, java.lang.reflect.Type[] r5) {
            /*
                r2 = this;
                java.lang.reflect.Type r0 = r3.getGenericReturnType()
                java.lang.String r1 = "method.genericReturnType"
                mf0.C24362h.m61210e(r0, r1)
                if (r4 == 0) goto L_0x0010
                java.lang.Class r4 = r3.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r4 = 0
            L_0x0011:
                r2.<init>(r3, r0, r4, r5)
                java.lang.Class r3 = java.lang.Void.TYPE
                boolean r3 = mf0.C24362h.m61206a(r0, r3)
                r2.f63232e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uf0.C25034c.C25051g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
