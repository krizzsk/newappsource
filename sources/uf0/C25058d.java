package uf0;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import mf0.C24362h;
import rf0.C24806h;
import tf0.C24979k;

/* renamed from: uf0.d */
public final class C25058d<M extends Member> implements C25032b<M> {

    /* renamed from: a */
    public final C25032b<M> f63235a;

    /* renamed from: b */
    public final boolean f63236b;

    /* renamed from: c */
    public final C25059a f63237c;

    /* renamed from: uf0.d$a */
    public static final class C25059a {

        /* renamed from: a */
        public final C24806h f63238a;

        /* renamed from: b */
        public final Method[] f63239b;

        /* renamed from: c */
        public final Method f63240c;

        public C25059a(C24806h hVar, Method[] methodArr, Method method) {
            C24362h.m61211f(hVar, "argumentRange");
            this.f63238a = hVar;
            this.f63239b = methodArr;
            this.f63240c = method;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if ((r9 instanceof uf0.C25031a) != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25058d(uf0.C25032b r9, kotlin.reflect.jvm.internal.impl.descriptors.C23900c r10, boolean r11) {
        /*
            r8 = this;
            java.lang.String r0 = "descriptor"
            mf0.C24362h.m61211f(r10, r0)
            r8.<init>()
            r8.f63235a = r9
            r8.f63236b = r11
            lh0.v r0 = r10.mo53443i()
            mf0.C24362h.m61208c(r0)
            java.lang.Class r0 = p389bl.C13637c.m34056K(r0)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x001e
            r1 = r3
            goto L_0x0035
        L_0x001e:
            java.lang.String r4 = "box-impl"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x017c }
            java.lang.reflect.Method r5 = p389bl.C13637c.m34079v(r0, r10)     // Catch:{ NoSuchMethodException -> 0x017c }
            java.lang.Class r5 = r5.getReturnType()     // Catch:{ NoSuchMethodException -> 0x017c }
            r1[r2] = r5     // Catch:{ NoSuchMethodException -> 0x017c }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r4, r1)     // Catch:{ NoSuchMethodException -> 0x017c }
            java.lang.String r4 = "{\n        getDeclaredMet…riptor).returnType)\n    }"
            mf0.C24362h.m61210e(r1, r4)     // Catch:{ NoSuchMethodException -> 0x017c }
        L_0x0035:
            boolean r0 = xg0.C25261d.m63406a(r10)
            if (r0 == 0) goto L_0x0046
            uf0.d$a r9 = new uf0.d$a
            rf0.h r10 = rf0.C24806h.f62735e
            java.lang.reflect.Method[] r11 = new java.lang.reflect.Method[r2]
            r9.<init>(r10, r11, r1)
            goto L_0x013c
        L_0x0046:
            boolean r0 = r9 instanceof uf0.C25034c.C25051g.C25054c
            java.lang.String r4 = "descriptor.containingDeclaration"
            r5 = -1
            if (r0 == 0) goto L_0x004e
            goto L_0x0072
        L_0x004e:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23899b
            if (r0 == 0) goto L_0x0057
            boolean r9 = r9 instanceof uf0.C25031a
            if (r9 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0057:
            zf0.c0 r0 = r10.mo53422O()
            if (r0 == 0) goto L_0x0071
            boolean r9 = r9 instanceof uf0.C25031a
            if (r9 != 0) goto L_0x0071
            zf0.g r9 = r10.mo53399b()
            mf0.C24362h.m61210e(r9, r4)
            boolean r9 = xg0.C25261d.m63407b(r9)
            if (r9 == 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            if (r11 == 0) goto L_0x0076
            r9 = 2
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            boolean r11 = r10.mo53424V()
            int r11 = r11 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            zf0.c0 r0 = r10.mo53423R()
            if (r0 != 0) goto L_0x0089
            r0 = r3
            goto L_0x008d
        L_0x0089:
            lh0.v r0 = r0.getType()
        L_0x008d:
            if (r0 == 0) goto L_0x0093
            r9.add(r0)
            goto L_0x00d1
        L_0x0093:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23899b
            if (r0 == 0) goto L_0x00b7
            r0 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C23899b) r0
            zf0.c r0 = r0.mo53500g0()
            java.lang.String r4 = "descriptor.constructedClass"
            mf0.C24362h.m61210e(r0, r4)
            boolean r4 = r0.mo53506E()
            if (r4 == 0) goto L_0x00d1
            zf0.g r0 = r0.mo53399b()
            zf0.c r0 = (zf0.C25432c) r0
            lh0.z r0 = r0.mo53412q()
            r9.add(r0)
            goto L_0x00d1
        L_0x00b7:
            zf0.g r0 = r10.mo53399b()
            mf0.C24362h.m61210e(r0, r4)
            boolean r4 = r0 instanceof zf0.C25432c
            if (r4 == 0) goto L_0x00d1
            boolean r4 = xg0.C25261d.m63407b(r0)
            if (r4 == 0) goto L_0x00d1
            zf0.c r0 = (zf0.C25432c) r0
            lh0.z r0 = r0.mo53412q()
            r9.add(r0)
        L_0x00d1:
            java.util.List r0 = r10.mo53442h()
            java.lang.String r4 = "descriptor.valueParameters"
            mf0.C24362h.m61210e(r0, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x00de:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f2
            java.lang.Object r4 = r0.next()
            zf0.k0 r4 = (zf0.C25452k0) r4
            lh0.v r4 = r4.getType()
            r9.add(r4)
            goto L_0x00de
        L_0x00f2:
            int r0 = r9.size()
            int r0 = r0 + r5
            int r0 = r0 + r11
            int r11 = ce0.C21100e.m49330Y(r8)
            if (r11 != r0) goto L_0x013f
            int r11 = java.lang.Math.max(r5, r2)
            int r2 = r9.size()
            int r2 = r2 + r5
            rf0.h r11 = p584jl.C17885a.m44393C0(r11, r2)
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r0]
            r4 = 0
        L_0x010e:
            if (r4 >= r0) goto L_0x0137
            int r6 = r11.f62728b
            int r7 = r11.f62729c
            if (r4 > r7) goto L_0x011a
            if (r6 > r4) goto L_0x011a
            r6 = 1
            goto L_0x011b
        L_0x011a:
            r6 = 0
        L_0x011b:
            if (r6 == 0) goto L_0x0131
            int r6 = r4 - r5
            java.lang.Object r6 = r9.get(r6)
            lh0.v r6 = (lh0.C24307v) r6
            java.lang.Class r6 = p389bl.C13637c.m34056K(r6)
            if (r6 != 0) goto L_0x012c
            goto L_0x0131
        L_0x012c:
            java.lang.reflect.Method r6 = p389bl.C13637c.m34079v(r6, r10)
            goto L_0x0132
        L_0x0131:
            r6 = r3
        L_0x0132:
            r2[r4] = r6
            int r4 = r4 + 1
            goto L_0x010e
        L_0x0137:
            uf0.d$a r9 = new uf0.d$a
            r9.<init>(r11, r2, r1)
        L_0x013c:
            r8.f63237c = r9
            return
        L_0x013f:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r11 = "Inconsistent number of parameters in the descriptor and Java reflection object: "
            java.lang.StringBuilder r11 = p379.C13555b.m33972k(r11)
            int r1 = ce0.C21100e.m49330Y(r8)
            r11.append(r1)
            java.lang.String r1 = " != "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = "\nCalling: "
            r11.append(r0)
            r11.append(r10)
            java.lang.String r10 = "\nParameter types: "
            r11.append(r10)
            java.util.List r10 = r8.mo59359b()
            r11.append(r10)
            java.lang.String r10 = ")\nDefault: "
            r11.append(r10)
            boolean r10 = r8.f63236b
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x017c:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "No box method found in inline class: "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r0 = " (calling "
            r11.append(r0)
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C25058d.<init>(uf0.b, kotlin.reflect.jvm.internal.impl.descriptors.c, boolean):void");
    }

    /* renamed from: a */
    public final Object mo59358a(Object[] objArr) {
        Object invoke;
        C25059a aVar = this.f63237c;
        C24806h hVar = aVar.f63238a;
        Method[] methodArr = aVar.f63239b;
        Method method = aVar.f63240c;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C24362h.m61210e(copyOf, "copyOf(this, size)");
        int i = hVar.f62728b;
        int i2 = hVar.f62729c;
        if (i <= i2) {
            while (true) {
                int i3 = i + 1;
                Method method2 = methodArr[i];
                Object obj = objArr[i];
                if (method2 != null) {
                    if (obj != null) {
                        obj = method2.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method2.getReturnType();
                        C24362h.m61210e(returnType, "method.returnType");
                        obj = C24979k.m62676c(returnType);
                    }
                }
                copyOf[i] = obj;
                if (i == i2) {
                    break;
                }
                i = i3;
            }
        }
        Object a = this.f63235a.mo59358a(copyOf);
        if (method == null || (invoke = method.invoke((Object) null, new Object[]{a})) == null) {
            return a;
        }
        return invoke;
    }

    /* renamed from: b */
    public final List<Type> mo59359b() {
        return this.f63235a.mo59359b();
    }

    /* renamed from: c */
    public final M mo59360c() {
        return this.f63235a.mo59360c();
    }

    /* renamed from: i */
    public final Type mo59361i() {
        return this.f63235a.mo59361i();
    }
}
