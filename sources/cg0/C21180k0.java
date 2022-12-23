package cg0;

import ag0.C20989e;
import java.util.ArrayList;
import java.util.List;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lf0.C24236l;
import lh0.C24307v;
import lh0.C24312z;
import p389bl.C13637c;
import ug0.C25069e;
import xg0.C25260c;
import zf0.C25442g;

/* renamed from: cg0.k0 */
public final class C21180k0 extends C21174i {

    /* renamed from: l */
    public final C24236l<C24307v, Void> f53085l;

    /* renamed from: m */
    public final ArrayList f53086m;

    /* renamed from: n */
    public boolean f53087n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21180k0(zf0.C25442g r12, ag0.C20989e r13, boolean r14, kotlin.reflect.jvm.internal.impl.types.Variance r15, ug0.C25069e r16, int r17, kh0.C23792h r18) {
        /*
            r11 = this;
            r9 = r11
            zf0.g0$a r8 = zf0.C25443g0.C25444a.f63738a
            r10 = 0
            if (r12 == 0) goto L_0x0042
            if (r13 == 0) goto L_0x003c
            if (r15 == 0) goto L_0x0036
            if (r16 == 0) goto L_0x0030
            if (r18 == 0) goto L_0x002a
            r0 = r11
            r1 = r18
            r2 = r12
            r3 = r13
            r4 = r16
            r5 = r15
            r6 = r14
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r9.f53086m = r0
            r0 = 0
            r9.f53087n = r0
            r9.f53085l = r10
            return
        L_0x002a:
            r0 = 25
            m49653A(r0)
            throw r10
        L_0x0030:
            r0 = 22
            m49653A(r0)
            throw r10
        L_0x0036:
            r0 = 21
            m49653A(r0)
            throw r10
        L_0x003c:
            r0 = 20
            m49653A(r0)
            throw r10
        L_0x0042:
            r0 = 19
            m49653A(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21180k0.<init>(zf0.g, ag0.e, boolean, kotlin.reflect.jvm.internal.impl.types.Variance, ug0.e, int, kh0.h):void");
    }

    /* renamed from: A */
    public static /* synthetic */ void m49653A(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: Q0 */
    public static C21180k0 m49654Q0(C25442g gVar, C20989e eVar, boolean z, Variance variance, C25069e eVar2, int i, C23792h hVar) {
        if (gVar == null) {
            m49653A(6);
            throw null;
        } else if (eVar == null) {
            m49653A(7);
            throw null;
        } else if (variance == null) {
            m49653A(8);
            throw null;
        } else if (eVar2 == null) {
            m49653A(9);
            throw null;
        } else if (hVar != null) {
            return new C21180k0(gVar, eVar, z, variance, eVar2, i, hVar);
        } else {
            m49653A(11);
            throw null;
        }
    }

    /* renamed from: R0 */
    public static C21180k0 m49655R0(C25442g gVar, Variance variance, C25069e eVar, int i, C23792h hVar) {
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        if (gVar == null) {
            m49653A(0);
            throw null;
        } else if (variance == null) {
            m49653A(2);
            throw null;
        } else if (hVar != null) {
            C21180k0 Q0 = m49654Q0(gVar, aVar, false, variance, eVar, i, hVar);
            C24312z p = DescriptorUtilsKt.m60284e(gVar).mo59393p();
            Q0.mo53502P0();
            if (!C13637c.m34082y(p)) {
                Q0.f53086m.add(p);
            }
            Q0.mo53502P0();
            Q0.f53087n = true;
            return Q0;
        } else {
            m49653A(4);
            throw null;
        }
    }

    /* renamed from: N0 */
    public final void mo53475N0(C24307v vVar) {
        if (vVar != null) {
            C24236l<C24307v, Void> lVar = this.f53085l;
            if (lVar != null) {
                lVar.invoke(vVar);
                return;
            }
            return;
        }
        m49653A(27);
        throw null;
    }

    /* renamed from: O0 */
    public final List<C24307v> mo53476O0() {
        if (this.f53087n) {
            ArrayList arrayList = this.f53086m;
            if (arrayList != null) {
                return arrayList;
            }
            m49653A(28);
            throw null;
        }
        StringBuilder k = C13555b.m33972k("Type parameter descriptor is not initialized: ");
        k.append(mo53503S0());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: P0 */
    public final void mo53502P0() {
        if (this.f53087n) {
            StringBuilder k = C13555b.m33972k("Type parameter descriptor is already initialized: ");
            k.append(mo53503S0());
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: S0 */
    public final String mo53503S0() {
        return getName() + " declared in " + C25260c.m63390g(mo53399b());
    }
}
