package cg0;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lh0.C24307v;
import zf0.C25429a0;
import zf0.C25447i;
import zf0.C25452k0;

/* renamed from: cg0.e0 */
public final class C21167e0 extends C21162c0 implements C25429a0 {

    /* renamed from: n */
    public C24307v f53059n;

    /* renamed from: o */
    public final C25429a0 f53060o;

    /* JADX WARNING: type inference failed for: r21v0, types: [zf0.a0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21167e0(zf0.C25491z r13, ag0.C20989e r14, kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, zf0.C25478n r16, boolean r17, boolean r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, zf0.C25429a0 r21, zf0.C25435d0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<get-"
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            ug0.e r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ug0.e r6 = ug0.C25069e.m62822k(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x003e
            r1 = r12
            r0 = r21
            goto L_0x0040
        L_0x003e:
            r0 = r12
            r1 = r0
        L_0x0040:
            r1.f53060o = r0
            return
        L_0x0043:
            r1 = r12
            r2 = 5
            m49552A(r2)
            throw r0
        L_0x0049:
            r1 = r12
            r2 = 4
            m49552A(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 3
            m49552A(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 2
            m49552A(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 1
            m49552A(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21167e0.<init>(zf0.z, ag0.e, kotlin.reflect.jvm.internal.impl.descriptors.Modality, zf0.n, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, zf0.a0, zf0.d0):void");
    }

    /* renamed from: A */
    public static /* synthetic */ void m49552A(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60153d(this, d);
    }

    /* renamed from: O0 */
    public final C25429a0 mo53432l0() {
        C25429a0 a0Var = this.f53060o;
        if (a0Var != null) {
            return a0Var;
        }
        m49552A(8);
        throw null;
    }

    /* renamed from: P0 */
    public final void mo53464P0(C24307v vVar) {
        if (vVar == null) {
            vVar = mo53426Y().getType();
        }
        this.f53059n = vVar;
    }

    /* renamed from: d */
    public final Collection<? extends C25429a0> mo53440d() {
        return mo53421N0(true);
    }

    /* renamed from: h */
    public final List<C25452k0> mo53442h() {
        List<C25452k0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49552A(7);
        throw null;
    }

    /* renamed from: i */
    public final C24307v mo53443i() {
        return this.f53059n;
    }
}
