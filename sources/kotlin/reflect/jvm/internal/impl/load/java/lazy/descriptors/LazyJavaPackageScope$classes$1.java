package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kg0.C23780d;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import lf0.C24236l;
import zf0.C25432c;

public final class LazyJavaPackageScope$classes$1 extends Lambda implements C24236l<LazyJavaPackageScope.C23931a, C25432c> {

    /* renamed from: $c */
    public final /* synthetic */ C23780d f60681$c;
    public final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(C23780d dVar, LazyJavaPackageScope lazyJavaPackageScope) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.f60681$c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23931a) r8
            java.lang.String r0 = "request"
            mf0.C24362h.m61211f(r8, r0)
            ug0.b r0 = new ug0.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r1 = r7.this$0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment r1 = r1.f60673o
            ug0.c r1 = r1.f53008f
            ug0.e r2 = r8.f60676a
            r0.<init>(r1, r2)
            og0.g r1 = r8.f60677b
            if (r1 == 0) goto L_0x0023
            kg0.d r2 = r7.f60681$c
            kg0.b r2 = r2.f60080a
            qg0.j r2 = r2.f60057c
            qg0.j$a$b r1 = r2.mo58427b(r1)
            goto L_0x002d
        L_0x0023:
            kg0.d r1 = r7.f60681$c
            kg0.b r1 = r1.f60080a
            qg0.j r1 = r1.f60057c
            qg0.j$a r1 = r1.mo58428c(r0)
        L_0x002d:
            r2 = 0
            if (r1 != 0) goto L_0x0032
        L_0x0030:
            r3 = r2
            goto L_0x0040
        L_0x0032:
            boolean r3 = r1 instanceof qg0.C24753j.C24754a.C24756b
            if (r3 == 0) goto L_0x003a
            r3 = r1
            qg0.j$a$b r3 = (qg0.C24753j.C24754a.C24756b) r3
            goto L_0x003b
        L_0x003a:
            r3 = r2
        L_0x003b:
            if (r3 != 0) goto L_0x003e
            goto L_0x0030
        L_0x003e:
            qg0.k r3 = r3.f62660a
        L_0x0040:
            if (r3 != 0) goto L_0x0044
            r4 = r2
            goto L_0x0048
        L_0x0044:
            ug0.b r4 = r3.mo58421d()
        L_0x0048:
            if (r4 == 0) goto L_0x0056
            boolean r5 = r4.mo61578k()
            if (r5 != 0) goto L_0x015f
            boolean r4 = r4.f63252c
            if (r4 == 0) goto L_0x0056
            goto L_0x015f
        L_0x0056:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r4 = r7.this$0
            r4.getClass()
            if (r3 != 0) goto L_0x0060
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23934b.f60679a
            goto L_0x0097
        L_0x0060:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r5 = r3.mo58420c()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r5.f60764a
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
            if (r5 != r6) goto L_0x0095
            kg0.d r4 = r4.f60684b
            kg0.b r4 = r4.f60080a
            kotlin.reflect.jvm.internal.impl.load.kotlin.a r4 = r4.f60058d
            r4.getClass()
            hh0.d r5 = r4.mo59588f(r3)
            if (r5 != 0) goto L_0x007b
            r3 = r2
            goto L_0x0089
        L_0x007b:
            hh0.g r4 = r4.mo59585c()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer r4 = r4.f59329s
            ug0.b r3 = r3.mo58421d()
            zf0.c r3 = r4.mo60186a(r3, r5)
        L_0x0089:
            if (r3 == 0) goto L_0x0092
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a r4 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a
            r4.<init>(r3)
            r3 = r4
            goto L_0x0097
        L_0x0092:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$b r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23934b.f60679a
            goto L_0x0097
        L_0x0095:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$c r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23935c.f60680a
        L_0x0097:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23933a
            if (r4 == 0) goto L_0x00a1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$b$a r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23933a) r3
            zf0.c r2 = r3.f60678a
            goto L_0x015f
        L_0x00a1:
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23935c
            if (r4 == 0) goto L_0x00a7
            goto L_0x015f
        L_0x00a7:
            boolean r3 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.C23932b.C23934b
            if (r3 == 0) goto L_0x0160
            og0.g r8 = r8.f60677b
            if (r8 != 0) goto L_0x00c9
            kg0.d r8 = r7.f60681$c
            kg0.b r8 = r8.f60080a
            hg0.g r8 = r8.f60056b
            hg0.g$a r3 = new hg0.g$a
            if (r1 != 0) goto L_0x00ba
            goto L_0x00c1
        L_0x00ba:
            boolean r4 = r1 instanceof qg0.C24753j.C24754a.C24755a
            if (r4 != 0) goto L_0x00bf
            r1 = r2
        L_0x00bf:
            qg0.j$a$a r1 = (qg0.C24753j.C24754a.C24755a) r1
        L_0x00c1:
            r1 = 4
            r3.<init>(r0, r2, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r8 = r8.mo58417c(r3)
        L_0x00c9:
            if (r8 != 0) goto L_0x00cc
            goto L_0x00cf
        L_0x00cc:
            r8.mo59472P()
        L_0x00cf:
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY
            if (r1 != 0) goto L_0x0129
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = "\nClassId: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = "\nfindKotlinClass(JavaClass) = "
            r3.append(r4)
            kg0.d r4 = r7.f60681$c
            kg0.b r4 = r4.f60080a
            qg0.j r4 = r4.f60057c
            java.lang.String r5 = "<this>"
            mf0.C24362h.m61211f(r4, r5)
            java.lang.String r5 = "javaClass"
            mf0.C24362h.m61211f(r8, r5)
            qg0.j$a$b r8 = r4.mo58427b(r8)
            if (r8 == 0) goto L_0x0107
            qg0.k r2 = r8.f62660a
        L_0x0107:
            r3.append(r2)
            java.lang.String r8 = "\nfindKotlinClass(ClassId) = "
            r3.append(r8)
            kg0.d r8 = r7.f60681$c
            kg0.b r8 = r8.f60080a
            qg0.j r8 = r8.f60057c
            qg0.k r8 = com.google.android.play.core.assetpacks.C14256d1.m35484b(r8, r0)
            r3.append(r8)
            r8 = 10
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r1.<init>(r8)
            throw r1
        L_0x0129:
            if (r8 != 0) goto L_0x012d
            r0 = r2
            goto L_0x0131
        L_0x012d:
            ug0.c r0 = r8.mo59474f()
        L_0x0131:
            if (r0 == 0) goto L_0x015f
            boolean r1 = r0.mo61582d()
            if (r1 != 0) goto L_0x015f
            ug0.c r0 = r0.mo61583e()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r1 = r7.this$0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment r1 = r1.f60673o
            ug0.c r1 = r1.f53008f
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 != 0) goto L_0x014a
            goto L_0x015f
        L_0x014a:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor
            kg0.d r1 = r7.f60681$c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope r3 = r7.this$0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment r3 = r3.f60673o
            r0.<init>(r1, r3, r8, r2)
            kg0.d r8 = r7.f60681$c
            kg0.b r8 = r8.f60080a
            hg0.h r8 = r8.f60073s
            r8.mo58581a(r0)
            r2 = r0
        L_0x015f:
            return r2
        L_0x0160:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$classes$1.invoke(java.lang.Object):java.lang.Object");
    }
}
