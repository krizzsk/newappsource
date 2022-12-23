package cg0;

import ag0.C20989e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lh0.C24264f;
import lh0.C24274i0;
import lh0.C24312z;
import mh0.C24378d;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25481p;

/* renamed from: cg0.l */
public class C21181l extends C21179k {

    /* renamed from: i */
    public final Modality f53088i;

    /* renamed from: j */
    public final ClassKind f53089j;

    /* renamed from: k */
    public final C24264f f53090k;

    /* renamed from: l */
    public MemberScope f53091l;

    /* renamed from: m */
    public Set<C25430b> f53092m;

    /* renamed from: n */
    public C25430b f53093n;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21181l(zf0.C25442g r3, ug0.C25069e r4, kotlin.reflect.jvm.internal.impl.descriptors.Modality r5, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r6, java.util.List r7, kh0.C23792h r8) {
        /*
            r2 = this;
            zf0.d0$a r0 = zf0.C25435d0.f63736a
            r1 = 0
            if (r3 == 0) goto L_0x003b
            if (r4 == 0) goto L_0x0036
            if (r5 == 0) goto L_0x0031
            if (r6 == 0) goto L_0x002c
            if (r7 == 0) goto L_0x0027
            if (r8 == 0) goto L_0x0022
            r2.<init>(r8, r3, r4, r0)
            r2.f53088i = r5
            r2.f53089j = r6
            lh0.f r3 = new lh0.f
            java.util.List r4 = java.util.Collections.emptyList()
            r3.<init>(r2, r4, r7, r8)
            r2.f53090k = r3
            return
        L_0x0022:
            r3 = 6
            m49660W(r3)
            throw r1
        L_0x0027:
            r3 = 4
            m49660W(r3)
            throw r1
        L_0x002c:
            r3 = 3
            m49660W(r3)
            throw r1
        L_0x0031:
            r3 = 2
            m49660W(r3)
            throw r1
        L_0x0036:
            r3 = 1
            m49660W(r3)
            throw r1
        L_0x003b:
            r3 = 0
            m49660W(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21181l.<init>(zf0.g, ug0.e, kotlin.reflect.jvm.internal.impl.descriptors.Modality, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind, java.util.List, kh0.h):void");
    }

    /* renamed from: W */
    public static /* synthetic */ void m49660W(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B */
    public final Collection<C25432c> mo53504B() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49660W(19);
        throw null;
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        if (dVar != null) {
            MemberScope memberScope = this.f53091l;
            if (memberScope != null) {
                return memberScope;
            }
            m49660W(13);
            throw null;
        }
        m49660W(12);
        throw null;
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return false;
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return this.f53093n;
    }

    /* renamed from: N0 */
    public final void mo53508N0(MemberScope memberScope, Set set, C21177j jVar) {
        if (memberScope == null) {
            m49660W(7);
            throw null;
        } else if (set != null) {
            this.f53091l = memberScope;
            this.f53092m = set;
            this.f53093n = jVar;
        } else {
            m49660W(8);
            throw null;
        }
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return false;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        C25455m.C25463h hVar = C25455m.f63744e;
        if (hVar != null) {
            return hVar;
        }
        m49660W(17);
        throw null;
    }

    public final C20989e getAnnotations() {
        return C20989e.C20990a.f52739a;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        return false;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        C24264f fVar = this.f53090k;
        if (fVar != null) {
            return fVar;
        }
        m49660W(10);
        throw null;
    }

    /* renamed from: k */
    public final Collection<C25430b> mo53511k() {
        Set<C25430b> set = this.f53092m;
        if (set != null) {
            return set;
        }
        m49660W(11);
        throw null;
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return false;
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        ClassKind classKind = this.f53089j;
        if (classKind != null) {
            return classKind;
        }
        m49660W(15);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        List<C25448i0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        m49660W(18);
        throw null;
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        MemberScope.C24119a aVar = MemberScope.C24119a.f61217b;
        if (aVar != null) {
            return aVar;
        }
        m49660W(14);
        throw null;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = this.f53088i;
        if (modality != null) {
            return modality;
        }
        m49660W(16);
        throw null;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return null;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("class ");
        k.append(getName());
        return k.toString();
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        return null;
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        return false;
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        return false;
    }
}
