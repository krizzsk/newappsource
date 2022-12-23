package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

final class ReflectJavaClass$methods$1 extends Lambda implements C24236l<Method, Boolean> {
    public final /* synthetic */ C23912a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReflectJavaClass$methods$1(C23912a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r5 == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r0 = r5.isSynthetic()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000b
            goto L_0x004d
        L_0x000b:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = r4.this$0
            boolean r0 = r0.mo59485w()
            if (r0 == 0) goto L_0x004e
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r0 = r4.this$0
            r0.getClass()
            java.lang.String r0 = r5.getName()
            java.lang.String r3 = "values"
            boolean r3 = mf0.C24362h.m61206a(r0, r3)
            if (r3 == 0) goto L_0x0032
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.String r0 = "method.parameterTypes"
            mf0.C24362h.m61210e(r5, r0)
            int r5 = r5.length
            if (r5 != 0) goto L_0x0049
            r5 = 1
            goto L_0x004a
        L_0x0032:
            java.lang.String r3 = "valueOf"
            boolean r0 = mf0.C24362h.m61206a(r0, r3)
            if (r0 == 0) goto L_0x0049
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            boolean r5 = java.util.Arrays.equals(r5, r0)
            goto L_0x004a
        L_0x0049:
            r5 = 0
        L_0x004a:
            if (r5 != 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1.invoke(java.lang.Object):java.lang.Object");
    }
}
