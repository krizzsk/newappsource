package fg0;

import fg0.C23361g;
import fg0.C23374s;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import mf0.C24362h;
import og0.C24585a;
import og0.C24601p;
import ug0.C25066c;
import ug0.C25069e;
import ug0.C25071g;
import zf0.C25479n0;

/* renamed from: fg0.q */
public abstract class C23372q extends C23368m implements C23361g, C23374s, C24601p {
    /* renamed from: A */
    public final boolean mo58506A() {
        return Modifier.isAbstract(getModifiers());
    }

    /* renamed from: F */
    public final void mo58487F() {
    }

    /* renamed from: G */
    public final boolean mo58507G() {
        return Modifier.isFinal(getModifiers());
    }

    /* renamed from: T */
    public abstract Member mo58497T();

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo58508U(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.length
            r0.<init>(r1)
            fg0.c r1 = fg0.C23356c.f59135a
            java.lang.reflect.Member r2 = r12.mo58497T()
            java.lang.String r3 = "member"
            mf0.C24362h.m61211f(r2, r3)
            fg0.c$a r3 = fg0.C23356c.f59136b
            if (r3 != 0) goto L_0x0025
            monitor-enter(r1)
            fg0.c$a r3 = fg0.C23356c.f59136b     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x0020
            fg0.c$a r3 = fg0.C23356c.m57432a(r2)     // Catch:{ all -> 0x0022 }
            fg0.C23356c.f59136b = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r1)
            goto L_0x0025
        L_0x0022:
            r13 = move-exception
            monitor-exit(r1)
            throw r13
        L_0x0025:
            java.lang.reflect.Method r1 = r3.f59137a
            r4 = 0
            r5 = 0
            if (r1 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            java.lang.reflect.Method r3 = r3.f59138b
            if (r3 != 0) goto L_0x0032
        L_0x0030:
            r2 = r4
            goto L_0x0060
        L_0x0032:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r1 = r1.invoke(r2, r6)
            if (r1 == 0) goto L_0x0116
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r1.length
            r2.<init>(r6)
            int r6 = r1.length
            r7 = 0
        L_0x0044:
            if (r7 >= r6) goto L_0x0060
            r8 = r1[r7]
            int r7 = r7 + 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.Object r8 = r3.invoke(r8, r9)
            if (r8 == 0) goto L_0x0058
            java.lang.String r8 = (java.lang.String) r8
            r2.add(r8)
            goto L_0x0044
        L_0x0058:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.String"
            r13.<init>(r14)
            throw r13
        L_0x0060:
            if (r2 != 0) goto L_0x0064
            r1 = 0
            goto L_0x006a
        L_0x0064:
            int r1 = r2.size()
            int r3 = r13.length
            int r1 = r1 - r3
        L_0x006a:
            int r3 = r13.length
            r6 = 0
        L_0x006c:
            if (r6 >= r3) goto L_0x0115
            int r7 = r6 + 1
            r8 = r13[r6]
            java.lang.String r9 = "type"
            mf0.C24362h.m61211f(r8, r9)
            boolean r9 = r8 instanceof java.lang.Class
            if (r9 == 0) goto L_0x008a
            r10 = r8
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r11 = r10.isPrimitive()
            if (r11 == 0) goto L_0x008a
            fg0.u r8 = new fg0.u
            r8.<init>(r10)
            goto L_0x00b2
        L_0x008a:
            boolean r10 = r8 instanceof java.lang.reflect.GenericArrayType
            if (r10 != 0) goto L_0x00ac
            if (r9 == 0) goto L_0x009a
            r9 = r8
            java.lang.Class r9 = (java.lang.Class) r9
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x009a
            goto L_0x00ac
        L_0x009a:
            boolean r9 = r8 instanceof java.lang.reflect.WildcardType
            if (r9 == 0) goto L_0x00a6
            fg0.z r9 = new fg0.z
            java.lang.reflect.WildcardType r8 = (java.lang.reflect.WildcardType) r8
            r9.<init>(r8)
            goto L_0x00b1
        L_0x00a6:
            fg0.k r9 = new fg0.k
            r9.<init>(r8)
            goto L_0x00b1
        L_0x00ac:
            fg0.i r9 = new fg0.i
            r9.<init>(r8)
        L_0x00b1:
            r8 = r9
        L_0x00b2:
            if (r2 != 0) goto L_0x00b6
            r9 = r4
            goto L_0x00c0
        L_0x00b6:
            int r9 = r6 + r1
            java.lang.Object r9 = kotlin.collections.C23825c.m58516m0(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x00d6
        L_0x00c0:
            if (r15 == 0) goto L_0x00c9
            int r10 = r13.length
            int r10 = r10 + -1
            if (r6 != r10) goto L_0x00c9
            r10 = 1
            goto L_0x00ca
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            fg0.y r11 = new fg0.y
            r6 = r14[r6]
            r11.<init>(r8, r6, r9, r10)
            r0.add(r11)
            r6 = r7
            goto L_0x006c
        L_0x00d6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "No parameter with index "
            r14.append(r15)
            r14.append(r6)
            r15 = 43
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = " (name="
            r14.append(r15)
            ug0.e r15 = r12.getName()
            r14.append(r15)
            java.lang.String r15 = " type="
            r14.append(r15)
            r14.append(r8)
            java.lang.String r15 = ") in "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0115:
            return r0
        L_0x0116:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.Array<*>"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: fg0.C23372q.mo58508U(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
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
        return (obj instanceof C23372q) && C24362h.m61206a(mo58497T(), ((C23372q) obj).mo58497T());
    }

    /* renamed from: g */
    public final C25479n0 mo58511g() {
        return C23374s.C23375a.m57476a(this);
    }

    public final Collection getAnnotations() {
        return C23361g.C23362a.m57441b(this);
    }

    public final int getModifiers() {
        return mo58497T().getModifiers();
    }

    public final C25069e getName() {
        String name = mo58497T().getName();
        return name == null ? C25071g.f63266a : C25069e.m62820i(name);
    }

    public final int hashCode() {
        return mo58497T().hashCode();
    }

    /* renamed from: l */
    public final C23912a mo58515l() {
        Class<?> declaringClass = mo58497T().getDeclaringClass();
        C24362h.m61210e(declaringClass, "member.declaringClass");
        return new C23912a(declaringClass);
    }

    /* renamed from: t */
    public final AnnotatedElement mo58484t() {
        return (AnnotatedElement) mo58497T();
    }

    public final String toString() {
        return getClass().getName() + ": " + mo58497T();
    }
}
