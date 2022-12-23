package cg0;

import ag0.C20989e;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import lh0.C24307v;
import lh0.C24312z;
import ug0.C25069e;
import zf0.C25431b0;
import zf0.C25435d0;
import zf0.C25447i;
import zf0.C25452k0;

/* renamed from: cg0.f0 */
public final class C21169f0 extends C21162c0 implements C25431b0 {

    /* renamed from: n */
    public C25452k0 f53064n;

    /* renamed from: o */
    public final C25431b0 f53065o;

    /* JADX WARNING: type inference failed for: r21v0, types: [zf0.b0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21169f0(zf0.C25491z r13, ag0.C20989e r14, kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, zf0.C25478n r16, boolean r17, boolean r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, zf0.C25431b0 r21, zf0.C25435d0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<set-"
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
            r1.f53065o = r0
            return
        L_0x0043:
            r1 = r12
            r2 = 5
            m49565A(r2)
            throw r0
        L_0x0049:
            r1 = r12
            r2 = 4
            m49565A(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 3
            m49565A(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 2
            m49565A(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 1
            m49565A(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21169f0.<init>(zf0.z, ag0.e, kotlin.reflect.jvm.internal.impl.descriptors.Modality, zf0.n, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, zf0.b0, zf0.d0):void");
    }

    /* renamed from: A */
    public static /* synthetic */ void m49565A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: O0 */
    public static C23910d m49566O0(C21169f0 f0Var, C24307v vVar, C20989e eVar) {
        if (vVar == null) {
            m49565A(8);
            throw null;
        } else if (eVar != null) {
            return new C23910d(f0Var, (C25452k0) null, 0, eVar, C25069e.m62822k("<set-?>"), vVar, false, false, false, (C24307v) null, C25435d0.f63736a);
        } else {
            m49565A(9);
            throw null;
        }
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60154e(this, d);
    }

    /* renamed from: P0 */
    public final C25431b0 mo53432l0() {
        C25431b0 b0Var = this.f53065o;
        if (b0Var != null) {
            return b0Var;
        }
        m49565A(13);
        throw null;
    }

    /* renamed from: d */
    public final Collection<? extends C25431b0> mo53440d() {
        return mo53421N0(false);
    }

    /* renamed from: h */
    public final List<C25452k0> mo53442h() {
        C25452k0 k0Var = this.f53064n;
        if (k0Var != null) {
            List<C25452k0> singletonList = Collections.singletonList(k0Var);
            if (singletonList != null) {
                return singletonList;
            }
            m49565A(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public final C24307v mo53443i() {
        C24312z x = DescriptorUtilsKt.m60284e(this).mo59399x();
        if (x != null) {
            return x;
        }
        m49565A(12);
        throw null;
    }
}
