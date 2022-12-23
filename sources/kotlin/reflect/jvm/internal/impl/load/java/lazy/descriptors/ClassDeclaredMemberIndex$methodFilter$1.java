package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import og0.C24602q;

public final class ClassDeclaredMemberIndex$methodFilter$1 extends Lambda implements C24236l<C24602q, Boolean> {
    public final /* synthetic */ ClassDeclaredMemberIndex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        super(1);
        this.this$0 = classDeclaredMemberIndex;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (r0.equals("toString") == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0096, code lost:
        r6 = r6.mo58520h().isEmpty();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r6 != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            og0.q r6 = (og0.C24602q) r6
            java.lang.String r0 = "m"
            mf0.C24362h.m61211f(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex r0 = r5.this$0
            lf0.l<og0.p, java.lang.Boolean> r0 = r0.f60617b
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00a6
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = r6.mo58515l()
            boolean r0 = r0.mo59471O()
            if (r0 == 0) goto L_0x00a2
            ug0.e r0 = r6.getName()
            java.lang.String r0 = r0.mo61604f()
            int r3 = r0.hashCode()
            r4 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r3 == r4) goto L_0x008c
            r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r3 == r4) goto L_0x0048
            r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r3 == r4) goto L_0x003f
            goto L_0x0094
        L_0x003f:
            java.lang.String r3 = "hashCode"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0096
            goto L_0x0094
        L_0x0048:
            java.lang.String r3 = "equals"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0051
            goto L_0x0094
        L_0x0051:
            java.util.List r6 = r6.mo58520h()
            java.lang.Object r6 = kotlin.collections.C23825c.m58493E0(r6)
            og0.z r6 = (og0.C24611z) r6
            r0 = 0
            if (r6 != 0) goto L_0x0060
            r6 = r0
            goto L_0x0064
        L_0x0060:
            og0.w r6 = r6.getType()
        L_0x0064:
            boolean r3 = r6 instanceof og0.C24595j
            if (r3 == 0) goto L_0x006b
            r0 = r6
            og0.j r0 = (og0.C24595j) r0
        L_0x006b:
            if (r0 != 0) goto L_0x006e
            goto L_0x0094
        L_0x006e:
            og0.i r6 = r0.mo58493a()
            boolean r0 = r6 instanceof og0.C24592g
            if (r0 == 0) goto L_0x0094
            og0.g r6 = (og0.C24592g) r6
            ug0.c r6 = r6.mo59474f()
            if (r6 == 0) goto L_0x0094
            java.lang.String r6 = r6.mo61580b()
            java.lang.String r0 = "java.lang.Object"
            boolean r6 = mf0.C24362h.m61206a(r6, r0)
            if (r6 == 0) goto L_0x0094
            r6 = 1
            goto L_0x009e
        L_0x008c:
            java.lang.String r3 = "toString"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0096
        L_0x0094:
            r6 = 0
            goto L_0x009e
        L_0x0096:
            java.util.List r6 = r6.mo58520h()
            boolean r6 = r6.isEmpty()
        L_0x009e:
            if (r6 == 0) goto L_0x00a2
            r6 = 1
            goto L_0x00a3
        L_0x00a2:
            r6 = 0
        L_0x00a3:
            if (r6 != 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r1 = 0
        L_0x00a7:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1.invoke(java.lang.Object):java.lang.Object");
    }
}
