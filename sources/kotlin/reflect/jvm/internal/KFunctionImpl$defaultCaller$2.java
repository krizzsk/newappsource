package kotlin.reflect.jvm.internal;

import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import uf0.C25032b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Luf0/b;", "invoke", "()Luf0/b;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KFunctionImpl$defaultCaller$2 extends Lambda implements C24225a<C25032b<? extends Member>> {
    public final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            ug0.b r0 = tf0.C24978j.f63115a
            kotlin.reflect.jvm.internal.KFunctionImpl r0 = r12.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.mo59298d()
            kotlin.reflect.jvm.internal.JvmFunctionSignature r0 = tf0.C24978j.m62673c(r0)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.C23838c
            r2 = 1
            java.lang.String r3 = "desc"
            r4 = 0
            if (r1 == 0) goto L_0x008d
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r5 = r1.f60230c
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.C23838c) r0
            tg0.d$b r0 = r0.f60202a
            java.lang.String r6 = r0.f63125a
            java.lang.String r0 = r0.f63126b
            uf0.b r1 = r1.mo59296b()
            java.lang.reflect.Member r1 = r1.mo59360c()
            mf0.C24362h.m61208c(r1)
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r1 = r1 ^ r2
            r5.getClass()
            java.lang.String r7 = "name"
            mf0.C24362h.m61211f(r6, r7)
            mf0.C24362h.m61211f(r0, r3)
            java.lang.String r3 = "<init>"
            boolean r3 = mf0.C24362h.m61206a(r6, r3)
            if (r3 == 0) goto L_0x0049
            goto L_0x0141
        L_0x0049:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r1 == 0) goto L_0x0057
            java.lang.Class r7 = r5.mo59301a()
            r3.add(r7)
        L_0x0057:
            r7 = 0
            r5.mo59316d(r3, r0, r7)
            java.lang.Class r8 = r5.mo59319j()
            java.lang.String r9 = "$default"
            java.lang.String r6 = mf0.C24362h.m61216k(r9, r6)
            java.lang.Class[] r9 = new java.lang.Class[r7]
            java.lang.Object[] r3 = r3.toArray(r9)
            if (r3 == 0) goto L_0x0085
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            r9 = 41
            r10 = 6
            int r7 = kotlin.text.C24179b.m60564L(r0, r9, r7, r7, r10)
            int r7 = r7 + r2
            int r9 = r0.length()
            java.lang.Class r0 = r5.mo59321o(r7, r9, r0)
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.m58589n(r8, r6, r3, r0, r1)
            goto L_0x0142
        L_0x0085:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r0.<init>(r1)
            throw r0
        L_0x008d:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.C23837b
            r5 = 10
            if (r1 == 0) goto L_0x0104
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            boolean r1 = r1.mo59299e()
            if (r1 == 0) goto L_0x00e1
            kotlin.reflect.jvm.internal.KFunctionImpl r0 = r12.this$0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.f60230c
            java.lang.Class r0 = r0.mo59301a()
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            tf0.i$a<java.util.ArrayList<kotlin.reflect.KParameter>> r1 = r1.f60206b
            java.lang.Object r1 = r1.invoke()
            java.lang.String r2 = "_parameters()"
            mf0.C24362h.m61210e(r1, r2)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = cf0.C21136j.m49436X(r1, r5)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x00bf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00d6
            java.lang.Object r3 = r1.next()
            kotlin.reflect.KParameter r3 = (kotlin.reflect.KParameter) r3
            java.lang.String r3 = r3.getName()
            mf0.C24362h.m61208c(r3)
            r2.add(r3)
            goto L_0x00bf
        L_0x00d6:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r1 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r3 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r4 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r4.<init>(r0, r2, r1, r3)
            goto L_0x01c1
        L_0x00e1:
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r1.f60230c
            kotlin.reflect.jvm.internal.JvmFunctionSignature$b r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.C23837b) r0
            tg0.d$b r0 = r0.f60200a
            java.lang.String r0 = r0.f63126b
            r1.getClass()
            mf0.C24362h.m61211f(r0, r3)
            java.lang.Class r3 = r1.mo59301a()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.mo59316d(r5, r0, r2)
            bf0.d r0 = bf0.C21050d.f52856a
            java.lang.reflect.Constructor r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.m58590p(r3, r5)
            goto L_0x0142
        L_0x0104:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor
            if (r1 == 0) goto L_0x0141
            kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) r0
            java.util.List<java.lang.reflect.Method> r11 = r0.f60197a
            kotlin.reflect.jvm.internal.KFunctionImpl r0 = r12.this$0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0 = r0.f60230c
            java.lang.Class r7 = r0.mo59301a()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = cf0.C21136j.m49436X(r11, r5)
            r8.<init>(r0)
            java.util.Iterator r0 = r11.iterator()
        L_0x0121:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0135
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = r1.getName()
            r8.add(r1)
            goto L_0x0121
        L_0x0135:
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r9 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin r10 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller r4 = new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x01c1
        L_0x0141:
            r0 = r4
        L_0x0142:
            boolean r1 = r0 instanceof java.lang.reflect.Constructor
            if (r1 == 0) goto L_0x0153
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r1.mo59298d()
            uf0.c r0 = kotlin.reflect.jvm.internal.KFunctionImpl.m58602g(r1, r0, r3)
            goto L_0x01b4
        L_0x0153:
            boolean r1 = r0 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L_0x01b3
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r1.mo59298d()
            ag0.e r1 = r1.getAnnotations()
            ug0.c r3 = tf0.C24979k.f63116a
            ag0.c r1 = r1.mo53071c(r3)
            if (r1 == 0) goto L_0x0192
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r1.mo59298d()
            zf0.g r1 = r1.mo53399b()
            zf0.c r1 = (zf0.C25432c) r1
            boolean r1 = r1.mo53509d0()
            if (r1 != 0) goto L_0x0192
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r1 = r1.mo59300f()
            if (r1 == 0) goto L_0x018b
            uf0.c$g$b r1 = new uf0.c$g$b
            r1.<init>(r0)
            goto L_0x0190
        L_0x018b:
            uf0.c$g$e r1 = new uf0.c$g$e
            r1.<init>(r0)
        L_0x0190:
            r0 = r1
            goto L_0x01b4
        L_0x0192:
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r3 = r1.mo59300f()
            if (r3 == 0) goto L_0x01ad
            uf0.c$g$c r3 = new uf0.c$g$c
            java.lang.Object r5 = r1.f60232e
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r1.mo59298d()
            java.lang.Object r1 = p389bl.C13637c.m34072l(r5, r1)
            r3.<init>(r1, r0)
            r0 = r3
            goto L_0x01b4
        L_0x01ad:
            uf0.c$g$f r1 = new uf0.c$g$f
            r1.<init>(r0)
            goto L_0x0190
        L_0x01b3:
            r0 = r4
        L_0x01b4:
            if (r0 != 0) goto L_0x01b7
            goto L_0x01c1
        L_0x01b7:
            kotlin.reflect.jvm.internal.KFunctionImpl r1 = r12.this$0
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r1.mo59298d()
            uf0.b r4 = p389bl.C13637c.m34075r(r0, r1, r2)
        L_0x01c1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl$defaultCaller$2.invoke():java.lang.Object");
    }
}
