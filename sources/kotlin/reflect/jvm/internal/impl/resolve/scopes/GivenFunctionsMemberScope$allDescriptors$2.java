package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import zf0.C25442g;

public final class GivenFunctionsMemberScope$allDescriptors$2 extends Lambda implements C24225a<List<? extends C25442g>> {
    public final /* synthetic */ GivenFunctionsMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GivenFunctionsMemberScope$allDescriptors$2(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        super(0);
        this.this$0 = givenFunctionsMemberScope;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r12 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope r0 = r12.this$0
            java.util.List r0 = r0.mo60183h()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope r1 = r12.this$0
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 3
            r2.<init>(r3)
            zf0.c r4 = r1.f61211b
            lh0.i0 r4 = r4.mo53481j()
            java.util.Collection r4 = r4.mo53459n()
            java.lang.String r5 = "containingClass.typeConstructor.supertypes"
            mf0.C24362h.m61210e(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0029:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0042
            java.lang.Object r6 = r4.next()
            lh0.v r6 = (lh0.C24307v) r6
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r6 = r6.mo59564o()
            r7 = 0
            java.util.Collection r6 = eh0.C23312h.C23313a.m57410a(r6, r7, r3)
            cf0.C21140n.m49439a0(r6, r5)
            goto L_0x0029
        L_0x0042:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L_0x004b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005d
            java.lang.Object r5 = r4.next()
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r6 == 0) goto L_0x004b
            r3.add(r5)
            goto L_0x004b
        L_0x005d:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0066:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x008b
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r6
            ug0.e r6 = r6.getName()
            java.lang.Object r7 = r4.get(r6)
            if (r7 != 0) goto L_0x0085
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r4.put(r6, r7)
        L_0x0085:
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L_0x0066
        L_0x008b:
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0093:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            ug0.e r5 = (ug0.C25069e) r5
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b4:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00db
            java.lang.Object r7 = r4.next()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r8
            boolean r8 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23900c
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r9 = r6.get(r8)
            if (r9 != 0) goto L_0x00d5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r6.put(r8, r9)
        L_0x00d5:
            java.util.List r9 = (java.util.List) r9
            r9.add(r7)
            goto L_0x00b4
        L_0x00db:
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00e3:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0093
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r6 = r6.getValue()
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.f61189d
            if (r7 == 0) goto L_0x0128
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r9 = r0.iterator()
        L_0x010d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x012a
            java.lang.Object r10 = r9.next()
            r11 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.c r11 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r11
            ug0.e r11 = r11.getName()
            boolean r11 = mf0.C24362h.m61206a(r11, r5)
            if (r11 == 0) goto L_0x010d
            r7.add(r10)
            goto L_0x010d
        L_0x0128:
            kotlin.collections.EmptyList r7 = kotlin.collections.EmptyList.f60173b
        L_0x012a:
            r9 = r7
            zf0.c r10 = r1.f61211b
            eh0.e r11 = new eh0.e
            r11.<init>(r2, r1)
            r7 = r5
            r6.mo60170h(r7, r8, r9, r10, r11)
            goto L_0x00e3
        L_0x0137:
            java.util.List r1 = mf0.C24361g.m61195x(r2)
            java.util.ArrayList r0 = kotlin.collections.C23825c.m58527x0(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope$allDescriptors$2.invoke():java.lang.Object");
    }
}
