package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import ug0.C25069e;
import zf0.C25491z;

public final class LazyJavaScope$declaredField$1 extends Lambda implements C24236l<C25069e, C25491z> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$declaredField$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        if (wf0.C25144h.m63106a(r4) == false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            ug0.e r14 = (ug0.C25069e) r14
            java.lang.String r0 = "name"
            mf0.C24362h.m61211f(r14, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r0 = r13.this$0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r1 = r0.f60685c
            r2 = 0
            if (r1 == 0) goto L_0x0019
            kh0.d<ug0.e, zf0.z> r0 = r1.f60689g
            java.lang.Object r14 = r0.invoke(r14)
            r2 = r14
            zf0.z r2 = (zf0.C25491z) r2
            goto L_0x012e
        L_0x0019:
            kh0.e<lg0.a> r0 = r0.f60687e
            java.lang.Object r0 = r0.invoke()
            lg0.a r0 = (lg0.C24248a) r0
            og0.n r14 = r0.mo59514e(r14)
            if (r14 == 0) goto L_0x012e
            boolean r0 = r14.mo58502M()
            if (r0 != 0) goto L_0x012e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope r0 = r13.this$0
            r0.getClass()
            boolean r1 = r14.mo58507G()
            r3 = 1
            r8 = r1 ^ 1
            kg0.d r1 = r0.f60684b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r5 = p389bl.C13637c.m34049D(r1, r14)
            zf0.g r4 = r0.mo59541q()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r6 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            zf0.n0 r1 = r14.mo58511g()
            zf0.n r7 = p584jl.C17885a.m44389A0(r1)
            ug0.e r9 = r14.getName()
            kg0.d r1 = r0.f60684b
            kg0.b r1 = r1.f60080a
            ng0.b r1 = r1.f60064j
            eg0.h$a r10 = r1.mo58430a(r14)
            boolean r1 = r14.mo58507G()
            r12 = 0
            if (r1 == 0) goto L_0x006a
            boolean r1 = r14.mo58509e()
            if (r1 == 0) goto L_0x006a
            r11 = 1
            goto L_0x006b
        L_0x006a:
            r11 = 0
        L_0x006b:
            jg0.e r1 = jg0.C23724e.m58247R0(r4, r5, r6, r7, r8, r9, r10, r11)
            r1.mo53447O0(r2, r2, r2, r2)
            kg0.d r4 = r0.f60684b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r4 = r4.f60084e
            og0.w r5 = r14.getType()
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r6 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r7 = 3
            mg0.a r6 = mg0.C24372b.m61251b(r6, r12, r2, r7)
            lh0.v r4 = r4.mo59572d(r5, r6)
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58676G(r4)
            if (r5 != 0) goto L_0x0091
            boolean r5 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58678I(r4)
            if (r5 == 0) goto L_0x00a5
        L_0x0091:
            boolean r5 = r14.mo58507G()
            if (r5 == 0) goto L_0x009f
            boolean r5 = r14.mo58509e()
            if (r5 == 0) goto L_0x009f
            r5 = 1
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 == 0) goto L_0x00a5
            r14.mo58503S()
        L_0x00a5:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.f60173b
            zf0.c0 r6 = r0.mo59540p()
            r1.mo53449Q0(r4, r5, r6, r2)
            lh0.v r4 = r1.getType()
            if (r4 == 0) goto L_0x0128
            int r5 = xg0.C25260c.f63536a
            boolean r5 = r1.f53097g
            if (r5 != 0) goto L_0x00ff
            boolean r5 = p389bl.C13637c.m34082y(r4)
            if (r5 == 0) goto L_0x00c1
            goto L_0x00ff
        L_0x00c1:
            boolean r5 = lh0.C24299r0.m60970b(r4)
            if (r5 == 0) goto L_0x00c8
            goto L_0x0100
        L_0x00c8:
            kotlin.reflect.jvm.internal.impl.builtins.c r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60284e(r1)
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58676G(r4)
            if (r6 != 0) goto L_0x0100
            mh0.h r6 = mh0.C24376c.f61714a
            lh0.z r7 = r5.mo59397v()
            boolean r7 = r6.mo60530d(r7, r4)
            if (r7 != 0) goto L_0x0100
            java.lang.String r7 = "Number"
            zf0.c r7 = r5.mo59388k(r7)
            lh0.z r7 = r7.mo53412q()
            boolean r7 = r6.mo60530d(r7, r4)
            if (r7 != 0) goto L_0x0100
            lh0.z r5 = r5.mo59383f()
            boolean r5 = r6.mo60530d(r5, r4)
            if (r5 != 0) goto L_0x0100
            boolean r4 = wf0.C25144h.m63106a(r4)
            if (r4 == 0) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r3 = 0
        L_0x0100:
            if (r3 == 0) goto L_0x011b
            kg0.d r3 = r0.f60684b
            kg0.b r3 = r3.f60080a
            kh0.h r3 = r3.f60055a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1 r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$resolveProperty$1
            r4.<init>(r0, r14, r1)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f r14 = r3.mo59022g(r4)
            if (r14 == 0) goto L_0x0116
            r1.f53098h = r14
            goto L_0x011b
        L_0x0116:
            r14 = 4
            cg0.C21184m0.m49692A(r14)
            throw r2
        L_0x011b:
            kg0.d r14 = r0.f60684b
            kg0.b r14 = r14.f60080a
            ig0.d r14 = r14.f60061g
            ig0.d$a r14 = (ig0.C23598d.C23599a) r14
            r14.getClass()
            r2 = r1
            goto L_0x012e
        L_0x0128:
            r14 = 64
            xg0.C25260c.m63384a(r14)
            throw r2
        L_0x012e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$declaredField$1.invoke(java.lang.Object):java.lang.Object");
    }
}
