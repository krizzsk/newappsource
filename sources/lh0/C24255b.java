package lh0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import rh0.C24819c;
import zf0.C25432c;
import zf0.C25442g;

/* renamed from: lh0.b */
public abstract class C24255b extends AbstractTypeConstructor {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24255b(C23792h hVar) {
        super(hVar);
        if (hVar != null) {
        } else {
            m60771j(0);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m60771j(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = 3
            goto L_0x0018
        L_0x0017:
            r5 = 2
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C24255b.m60771j(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (mf0.C24362h.m61206a(((zf0.C25486u) r0).mo53401f(), ((zf0.C25486u) r6).mo53401f()) != false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53485a(zf0.C25437e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zf0.C25432c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0073
            zf0.c r0 = r5.mo53460o()
            java.lang.String r3 = "first"
            mf0.C24362h.m61211f(r0, r3)
            ug0.e r3 = r0.getName()
            ug0.e r4 = r6.getName()
            boolean r3 = mf0.C24362h.m61206a(r3, r4)
            if (r3 != 0) goto L_0x001e
            goto L_0x0064
        L_0x001e:
            zf0.g r0 = r0.mo53399b()
            zf0.g r6 = r6.mo53399b()
        L_0x0026:
            if (r0 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x006f
            boolean r3 = r0 instanceof zf0.C25485t
            if (r3 == 0) goto L_0x0031
            boolean r6 = r6 instanceof zf0.C25485t
            goto L_0x0070
        L_0x0031:
            boolean r3 = r6 instanceof zf0.C25485t
            if (r3 == 0) goto L_0x0036
            goto L_0x0064
        L_0x0036:
            boolean r3 = r0 instanceof zf0.C25486u
            if (r3 == 0) goto L_0x0051
            boolean r3 = r6 instanceof zf0.C25486u
            if (r3 == 0) goto L_0x0064
            zf0.u r0 = (zf0.C25486u) r0
            ug0.c r0 = r0.mo53401f()
            zf0.u r6 = (zf0.C25486u) r6
            ug0.c r6 = r6.mo53401f()
            boolean r6 = mf0.C24362h.m61206a(r0, r6)
            if (r6 == 0) goto L_0x0064
            goto L_0x006f
        L_0x0051:
            boolean r3 = r6 instanceof zf0.C25486u
            if (r3 == 0) goto L_0x0056
            goto L_0x0064
        L_0x0056:
            ug0.e r3 = r0.getName()
            ug0.e r4 = r6.getName()
            boolean r3 = mf0.C24362h.m61206a(r3, r4)
            if (r3 != 0) goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0070
        L_0x0066:
            zf0.g r0 = r0.mo53399b()
            zf0.g r6 = r6.mo53399b()
            goto L_0x0026
        L_0x006f:
            r6 = 1
        L_0x0070:
            if (r6 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lh0.C24255b.mo53485a(zf0.e):boolean");
    }

    /* renamed from: d */
    public final C24307v mo53487d() {
        if (C23867c.m58677H(mo53460o())) {
            return null;
        }
        return mo53458m().mo59383f();
    }

    /* renamed from: e */
    public final Collection<C24307v> mo60231e(boolean z) {
        C25442g b = mo53460o().mo53399b();
        if (!(b instanceof C25432c)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m60771j(3);
            throw null;
        }
        C24819c cVar = new C24819c();
        C25432c cVar2 = (C25432c) b;
        cVar.add(cVar2.mo53412q());
        C25432c s0 = cVar2.mo53516s0();
        if (z && s0 != null) {
            cVar.add(s0.mo53412q());
        }
        return cVar;
    }

    /* renamed from: k */
    public abstract C25432c mo53460o();

    /* renamed from: m */
    public final C23867c mo53458m() {
        C23867c e = DescriptorUtilsKt.m60284e(mo53460o());
        if (e != null) {
            return e;
        }
        m60771j(1);
        throw null;
    }
}
