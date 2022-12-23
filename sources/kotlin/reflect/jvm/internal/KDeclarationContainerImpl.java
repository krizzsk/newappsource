package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.text.C24179b;
import kotlin.text.Regex;
import mf0.C24357c;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24855b;
import sf0.C24866j;
import tf0.C24973i;
import tf0.C24979k;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;
import zf0.C25491z;

public abstract class KDeclarationContainerImpl implements C24357c {

    /* renamed from: b */
    public static final Regex f60224b = new Regex("<v#(\\d+)>");

    public abstract class Data {

        /* renamed from: b */
        public static final /* synthetic */ C24866j<Object>[] f60225b = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(Data.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a */
        public final C24973i.C24974a f60226a;

        public Data(KDeclarationContainerImpl kDeclarationContainerImpl) {
            C24362h.m61211f(kDeclarationContainerImpl, "this$0");
            this.f60226a = C24973i.m62670c(new KDeclarationContainerImpl$Data$moduleData$2(kDeclarationContainerImpl));
        }
    }

    @Metadata(mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo59060d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "(Ljava/lang/String;I)V", "accept", "", "member", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "DECLARED", "INHERITED", "kotlin-reflection"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum MemberBelonginess {
        DECLARED,
        INHERITED;

        public final boolean accept(CallableMemberDescriptor callableMemberDescriptor) {
            C24362h.m61211f(callableMemberDescriptor, "member");
            return callableMemberDescriptor.mo53433p().isReal() == (this == DECLARED);
        }
    }

    /* renamed from: n */
    public static Method m58589n(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class superclass;
        Class t0;
        if (z) {
            clsArr[0] = cls;
        }
        Method q = m58591q(cls, str, clsArr, cls2);
        if (q != null || ((superclass = cls.getSuperclass()) != null && (q = m58589n(superclass, str, clsArr, cls2, z)) != null)) {
            return q;
        }
        Class[] interfaces = cls.getInterfaces();
        C24362h.m61210e(interfaces, "interfaces");
        int length = interfaces.length;
        int i = 0;
        while (i < length) {
            Class cls3 = interfaces[i];
            i++;
            C24362h.m61210e(cls3, "superInterface");
            Method n = m58589n(cls3, str, clsArr, cls2, z);
            if (n == null) {
                if (z && (t0 = C24361g.m61188t0(ReflectClassUtilKt.m58952d(cls3), C24362h.m61216k("$DefaultImpls", cls3.getName()))) != null) {
                    clsArr[0] = cls3;
                    n = m58591q(t0, str, clsArr, cls2);
                    if (n == null) {
                    }
                }
            }
            return n;
        }
        return null;
    }

    /* renamed from: p */
    public static Constructor m58590p(Class cls, ArrayList arrayList) {
        try {
            Object[] array = arrayList.toArray(new Class[0]);
            if (array != null) {
                Class[] clsArr = (Class[]) array;
                return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static Method m58591q(Class cls, String str, Class[] clsArr, Class cls2) {
        boolean z;
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C24362h.m61206a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C24362h.m61210e(declaredMethods, "declaredMethods");
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                i++;
                if (!C24362h.m61206a(method.getName(), str) || !C24362h.m61206a(method.getReturnType(), cls2) || !Arrays.equals(method.getParameterTypes(), clsArr)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: d */
    public final void mo59316d(ArrayList arrayList, String str, boolean z) {
        Object obj;
        ArrayList m = mo59320m(str);
        arrayList.addAll(m);
        int size = ((m.size() + 32) - 1) / 32;
        int i = 0;
        while (i < size) {
            i++;
            Class cls = Integer.TYPE;
            C24362h.m61210e(cls, "TYPE");
            arrayList.add(cls);
        }
        if (z) {
            obj = DefaultConstructorMarker.class;
        } else {
            obj = Object.class;
        }
        arrayList.add(obj);
    }

    /* renamed from: e */
    public final Method mo59317e(String str, String str2) {
        Method n;
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "desc");
        if (C24362h.m61206a(str, "<init>")) {
            return null;
        }
        Object[] array = mo59320m(str2).toArray(new Class[0]);
        if (array != null) {
            Class[] clsArr = (Class[]) array;
            Class o = mo59321o(C24179b.m60564L(str2, ')', 0, false, 6) + 1, str2.length(), str2);
            Method n2 = m58589n(mo59319j(), str, clsArr, o, false);
            if (n2 != null) {
                return n2;
            }
            if (!mo59319j().isInterface() || (n = m58589n(Object.class, str, clsArr, o, false)) == null) {
                return null;
            }
            return n;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: f */
    public abstract Collection<C23899b> mo59305f();

    /* renamed from: g */
    public abstract Collection<C23900c> mo59306g(C25069e eVar);

    /* renamed from: h */
    public abstract C25491z mo59307h(int i);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001e A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo59318i(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "belonginess"
            mf0.C24362h.m61211f(r9, r0)
            tf0.f r0 = new tf0.f
            r0.<init>(r7)
            r1 = 0
            r2 = 3
            java.util.Collection r8 = eh0.C23312h.C23313a.m57410a(r8, r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x001e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r8.next()
            zf0.g r3 = (zf0.C25442g) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L_0x004c
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            zf0.n r5 = r4.mo53429g()
            zf0.m$k r6 = zf0.C25455m.f63747h
            boolean r5 = mf0.C24362h.m61206a(r5, r6)
            if (r5 != 0) goto L_0x004c
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L_0x004c
            bf0.d r4 = bf0.C21050d.f52856a
            java.lang.Object r3 = r3.mo53398B0(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L_0x004d
        L_0x004c:
            r3 = r1
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            goto L_0x001e
        L_0x0050:
            r2.add(r3)
            goto L_0x001e
        L_0x0054:
            java.util.List r8 = kotlin.collections.C23825c.m58499K0(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.mo59318i(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.List");
    }

    /* renamed from: j */
    public Class<?> mo59319j() {
        Class<?> a = mo59301a();
        List<C24855b<? extends Object>> list = ReflectClassUtilKt.f60530a;
        C24362h.m61211f(a, "<this>");
        Class<?> cls = ReflectClassUtilKt.f60532c.get(a);
        if (cls == null) {
            return mo59301a();
        }
        return cls;
    }

    /* renamed from: k */
    public abstract Collection<C25491z> mo59309k(C25069e eVar);

    /* renamed from: m */
    public final ArrayList mo59320m(String str) {
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            int i3 = i2;
            while (str.charAt(i3) == '[') {
                i3++;
            }
            char charAt = str.charAt(i3);
            if (C24179b.m60564L("VZCBSIFJD", charAt, 0, false, 2) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = i3 + 1;
            } else if (charAt == 'L') {
                i = C24179b.m60564L(str, ';', i2, false, 4) + 1;
            } else {
                throw new KotlinReflectionInternalError(C24362h.m61216k(str, "Unknown type prefix in the method signature: "));
            }
            arrayList.add(mo59321o(i2, i, str));
            i2 = i;
        }
        return arrayList;
    }

    /* renamed from: o */
    public final Class mo59321o(int i, int i2, String str) {
        char charAt = str.charAt(i);
        if (charAt == 'L') {
            ClassLoader d = ReflectClassUtilKt.m58952d(mo59301a());
            String substring = str.substring(i + 1, i2 - 1);
            C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> loadClass = d.loadClass(C25081h.m62834E(substring, '/', '.'));
            C24362h.m61210e(loadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return loadClass;
        } else if (charAt == '[') {
            Class o = mo59321o(i + 1, i2, str);
            C25066c cVar = C24979k.f63116a;
            C24362h.m61211f(o, "<this>");
            return Array.newInstance(o, 0).getClass();
        } else if (charAt == 'V') {
            Class cls = Void.TYPE;
            C24362h.m61210e(cls, "TYPE");
            return cls;
        } else if (charAt == 'Z') {
            return Boolean.TYPE;
        } else {
            if (charAt == 'C') {
                return Character.TYPE;
            }
            if (charAt == 'B') {
                return Byte.TYPE;
            }
            if (charAt == 'S') {
                return Short.TYPE;
            }
            if (charAt == 'I') {
                return Integer.TYPE;
            }
            if (charAt == 'F') {
                return Float.TYPE;
            }
            if (charAt == 'J') {
                return Long.TYPE;
            }
            if (charAt == 'D') {
                return Double.TYPE;
            }
            throw new KotlinReflectionInternalError(C24362h.m61216k(str, "Unknown type prefix in the method signature: "));
        }
    }
}
