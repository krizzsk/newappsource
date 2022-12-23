package tf0;

import hg0.C23479o;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import mf0.C24362h;
import p584jl.C17885a;
import tg0.C24985d;
import ug0.C25065b;
import ug0.C25066c;
import zf0.C25429a0;
import zf0.C25431b0;

/* renamed from: tf0.j */
public final class C24978j {

    /* renamed from: a */
    public static final C25065b f63115a = C25065b.m62790l(new C25066c("java.lang.Void"));

    /* renamed from: a */
    public static JvmFunctionSignature.C23838c m62671a(C23900c cVar) {
        String a = SpecialBuiltinMembers.m58980a(cVar);
        if (a == null) {
            if (cVar instanceof C25429a0) {
                String f = DescriptorUtilsKt.m60291l(cVar).getName().mo61604f();
                C24362h.m61210e(f, "descriptor.propertyIfAccessor.name.asString()");
                a = C23479o.m57578a(f);
            } else if (cVar instanceof C25431b0) {
                String f2 = DescriptorUtilsKt.m60291l(cVar).getName().mo61604f();
                C24362h.m61210e(f2, "descriptor.propertyIfAccessor.name.asString()");
                a = C23479o.m57579b(f2);
            } else {
                a = cVar.getName().mo61604f();
                C24362h.m61210e(a, "descriptor.name.asString()");
            }
        }
        return new JvmFunctionSignature.C23838c(new C24985d.C24987b(a, C17885a.m44474z(cVar, 1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.reflect.jvm.internal.JvmFunctionSignature$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static tf0.C24962b m62672b(zf0.C25491z r7) {
        /*
            java.lang.String r0 = "possiblyOverriddenProperty"
            mf0.C24362h.m61211f(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r7 = xg0.C25260c.m63404u(r7)
            zf0.z r7 = (zf0.C25491z) r7
            zf0.z r1 = r7.mo53407a()
            java.lang.String r7 = "unwrapFakeOverride(possi…rriddenProperty).original"
            mf0.C24362h.m61210e(r1, r7)
            boolean r7 = r1 instanceof jh0.C23733g
            r0 = 0
            if (r7 == 0) goto L_0x0038
            r7 = r1
            jh0.g r7 = (jh0.C23733g) r7
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = r7.f59941A
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.f61002d
            java.lang.String r4 = "propertySignature"
            mf0.C24362h.m61210e(r3, r4)
            java.lang.Object r3 = p584jl.C17885a.m44423T(r2, r3)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3
            if (r3 == 0) goto L_0x00bd
            tf0.b$c r6 = new tf0.b$c
            sg0.c r4 = r7.f59942B
            sg0.e r5 = r7.f59943C
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0038:
            boolean r7 = r1 instanceof jg0.C23724e
            if (r7 == 0) goto L_0x00bd
            r7 = r1
            jg0.e r7 = (jg0.C23724e) r7
            zf0.d0 r7 = r7.mo53400e()
            boolean r2 = r7 instanceof ng0.C24501a
            if (r2 == 0) goto L_0x004a
            ng0.a r7 = (ng0.C24501a) r7
            goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            if (r7 != 0) goto L_0x004f
            r7 = r0
            goto L_0x0053
        L_0x004f:
            fg0.m r7 = r7.mo58431c()
        L_0x0053:
            boolean r2 = r7 instanceof fg0.C23370o
            if (r2 == 0) goto L_0x0061
            tf0.b$a r0 = new tf0.b$a
            fg0.o r7 = (fg0.C23370o) r7
            java.lang.reflect.Field r7 = r7.f59151a
            r0.<init>(r7)
            goto L_0x0098
        L_0x0061:
            boolean r2 = r7 instanceof fg0.C23373r
            if (r2 == 0) goto L_0x0099
            tf0.b$b r2 = new tf0.b$b
            fg0.r r7 = (fg0.C23373r) r7
            java.lang.reflect.Method r7 = r7.f59153a
            zf0.b0 r1 = r1.getSetter()
            if (r1 != 0) goto L_0x0073
            r1 = r0
            goto L_0x0077
        L_0x0073:
            zf0.d0 r1 = r1.mo53400e()
        L_0x0077:
            boolean r3 = r1 instanceof ng0.C24501a
            if (r3 == 0) goto L_0x007e
            ng0.a r1 = (ng0.C24501a) r1
            goto L_0x007f
        L_0x007e:
            r1 = r0
        L_0x007f:
            if (r1 != 0) goto L_0x0083
            r1 = r0
            goto L_0x0087
        L_0x0083:
            fg0.m r1 = r1.mo58431c()
        L_0x0087:
            boolean r3 = r1 instanceof fg0.C23373r
            if (r3 == 0) goto L_0x008e
            fg0.r r1 = (fg0.C23373r) r1
            goto L_0x008f
        L_0x008e:
            r1 = r0
        L_0x008f:
            if (r1 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            java.lang.reflect.Method r0 = r1.f59153a
        L_0x0094:
            r2.<init>(r7, r0)
            r0 = r2
        L_0x0098:
            return r0
        L_0x0099:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r7)
            r7 = 41
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7)
            throw r0
        L_0x00bd:
            cg0.e0 r7 = r1.getGetter()
            mf0.C24362h.m61208c(r7)
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r7 = m62671a(r7)
            zf0.b0 r1 = r1.getSetter()
            if (r1 != 0) goto L_0x00cf
            goto L_0x00d3
        L_0x00cf:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r0 = m62671a(r1)
        L_0x00d3:
            tf0.b$d r1 = new tf0.b$d
            r1.<init>(r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C24978j.m62672b(zf0.z):tf0.b");
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [fg0.m] */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0154, code lost:
        if (r0.mo53442h().isEmpty() != false) goto L_0x0156;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.JvmFunctionSignature m62673c(kotlin.reflect.jvm.internal.impl.descriptors.C23900c r6) {
        /*
            java.lang.String r0 = "possiblySubstitutedFunction"
            mf0.C24362h.m61211f(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = xg0.C25260c.m63404u(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r0
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r0.mo53407a()
            java.lang.String r1 = "unwrapFakeOverride(possi…titutedFunction).original"
            mf0.C24362h.m61210e(r0, r1)
            boolean r1 = r0 instanceof jh0.C23728b
            if (r1 == 0) goto L_0x0074
            r1 = r0
            jh0.b r1 = (jh0.C23728b) r1
            kotlin.reflect.jvm.internal.impl.protobuf.h r2 = r1.mo58961i0()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            if (r3 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = tg0.C24991g.f63134a
            r3 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3
            sg0.c r4 = r1.mo58958M()
            sg0.e r5 = r1.mo58957I()
            tg0.d$b r3 = tg0.C24991g.m62700c(r3, r4, r5)
            if (r3 != 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r6.<init>(r3)
            return r6
        L_0x003d:
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r3 == 0) goto L_0x006f
            kotlin.reflect.jvm.internal.impl.protobuf.d r3 = tg0.C24991g.f63134a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor) r2
            sg0.c r3 = r1.mo58958M()
            sg0.e r1 = r1.mo58957I()
            tg0.d$b r1 = tg0.C24991g.m62698a(r2, r3, r1)
            if (r1 != 0) goto L_0x0054
            goto L_0x006f
        L_0x0054:
            zf0.g r6 = r6.mo53399b()
            java.lang.String r0 = "possiblySubstitutedFunction.containingDeclaration"
            mf0.C24362h.m61210e(r6, r0)
            boolean r6 = xg0.C25261d.m63407b(r6)
            if (r6 == 0) goto L_0x0069
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$c
            r6.<init>(r1)
            goto L_0x006e
        L_0x0069:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$b r6 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$b
            r6.<init>(r1)
        L_0x006e:
            return r6
        L_0x006f:
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = m62671a(r0)
            return r6
        L_0x0074:
            boolean r6 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            r1 = 0
            if (r6 == 0) goto L_0x00ad
            r6 = r0
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r6 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r6
            zf0.d0 r6 = r6.mo53400e()
            boolean r2 = r6 instanceof ng0.C24501a
            if (r2 == 0) goto L_0x0087
            ng0.a r6 = (ng0.C24501a) r6
            goto L_0x0088
        L_0x0087:
            r6 = r1
        L_0x0088:
            if (r6 != 0) goto L_0x008c
            r6 = r1
            goto L_0x0090
        L_0x008c:
            fg0.m r6 = r6.mo58431c()
        L_0x0090:
            boolean r2 = r6 instanceof fg0.C23373r
            if (r2 == 0) goto L_0x0097
            r1 = r6
            fg0.r r1 = (fg0.C23373r) r1
        L_0x0097:
            if (r1 == 0) goto L_0x00a1
            java.lang.reflect.Method r6 = r1.f59153a
            kotlin.reflect.jvm.internal.JvmFunctionSignature$a r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$a
            r0.<init>(r6)
            return r0
        L_0x00a1:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.String r1 = "Incorrect resolution sequence for Java method "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r1)
            r6.<init>(r0)
            throw r6
        L_0x00ad:
            boolean r6 = r0 instanceof jg0.C23721b
            r2 = 41
            java.lang.String r3 = " ("
            if (r6 == 0) goto L_0x010f
            r6 = r0
            jg0.b r6 = (jg0.C23721b) r6
            zf0.d0 r6 = r6.mo53400e()
            boolean r4 = r6 instanceof ng0.C24501a
            if (r4 == 0) goto L_0x00c3
            ng0.a r6 = (ng0.C24501a) r6
            goto L_0x00c4
        L_0x00c3:
            r6 = r1
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            goto L_0x00cb
        L_0x00c7:
            fg0.m r1 = r6.mo58431c()
        L_0x00cb:
            boolean r6 = r1 instanceof fg0.C23367l
            if (r6 == 0) goto L_0x00d9
            kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor r6 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$JavaConstructor
            fg0.l r1 = (fg0.C23367l) r1
            java.lang.reflect.Constructor<?> r0 = r1.f59149a
            r6.<init>(r0)
            goto L_0x00ee
        L_0x00d9:
            boolean r6 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a
            if (r6 == 0) goto L_0x00ef
            r6 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a r6 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a) r6
            boolean r4 = r6.mo59478m()
            if (r4 == 0) goto L_0x00ef
            kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor r0 = new kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor
            java.lang.Class<?> r6 = r6.f60543a
            r0.<init>(r6)
            r6 = r0
        L_0x00ee:
            return r6
        L_0x00ef:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r6.<init>(r0)
            throw r6
        L_0x010f:
            ug0.e r6 = r0.getName()
            ug0.e r1 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60323b
            boolean r6 = r6.equals(r1)
            r1 = 0
            r4 = 1
            if (r6 == 0) goto L_0x0125
            boolean r6 = xg0.C25258b.m63383i(r0)
            if (r6 == 0) goto L_0x0125
            r6 = 1
            goto L_0x0126
        L_0x0125:
            r6 = 0
        L_0x0126:
            if (r6 != 0) goto L_0x0156
            ug0.e r6 = r0.getName()
            ug0.e r5 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60322a
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x013c
            boolean r6 = xg0.C25258b.m63383i(r0)
            if (r6 == 0) goto L_0x013c
            r6 = 1
            goto L_0x013d
        L_0x013c:
            r6 = 0
        L_0x013d:
            if (r6 == 0) goto L_0x0140
            goto L_0x0156
        L_0x0140:
            ug0.e r6 = r0.getName()
            ug0.e r5 = yf0.C25293a.f63580e
            boolean r6 = mf0.C24362h.m61206a(r6, r5)
            if (r6 == 0) goto L_0x0157
            java.util.List r6 = r0.mo53442h()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0157
        L_0x0156:
            r1 = 1
        L_0x0157:
            if (r1 == 0) goto L_0x015e
            kotlin.reflect.jvm.internal.JvmFunctionSignature$c r6 = m62671a(r0)
            return r6
        L_0x015e:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r6 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unknown origin of "
            r1.append(r4)
            r1.append(r0)
            r1.append(r3)
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C24978j.m62673c(kotlin.reflect.jvm.internal.impl.descriptors.c):kotlin.reflect.jvm.internal.JvmFunctionSignature");
    }
}
