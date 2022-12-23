package cg0;

import ag0.C20989e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kh0.C23792h;
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
import zf0.C25478n;
import zf0.C25481p;

/* renamed from: cg0.z */
public final class C21201z extends C21179k {

    /* renamed from: i */
    public final ClassKind f53127i;

    /* renamed from: j */
    public final boolean f53128j;

    /* renamed from: k */
    public Modality f53129k;

    /* renamed from: l */
    public C25478n f53130l;

    /* renamed from: m */
    public C24264f f53131m;

    /* renamed from: n */
    public ArrayList f53132n;

    /* renamed from: o */
    public final ArrayList f53133o;

    /* renamed from: p */
    public final C23792h f53134p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21201z(cg0.C21187p r3, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4, ug0.C25069e r5, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C24137a r6) {
        /*
            r2 = this;
            zf0.d0$a r0 = zf0.C25435d0.f63736a
            r1 = 0
            if (r4 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0020
            if (r6 == 0) goto L_0x001b
            r2.<init>(r6, r3, r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f53133o = r3
            r2.f53134p = r6
            r2.f53127i = r4
            r3 = 0
            r2.f53128j = r3
            return
        L_0x001b:
            r3 = 4
            m49784W(r3)
            throw r1
        L_0x0020:
            r3 = 2
            m49784W(r3)
            throw r1
        L_0x0025:
            r3 = 1
            m49784W(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21201z.<init>(cg0.p, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind, ug0.e, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$a):void");
    }

    /* renamed from: W */
    public static /* synthetic */ void m49784W(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
        m49784W(19);
        throw null;
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        if (dVar != null) {
            MemberScope.C24119a aVar = MemberScope.C24119a.f61217b;
            if (aVar != null) {
                return aVar;
            }
            m49784W(17);
            throw null;
        }
        m49784W(16);
        throw null;
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        return this.f53128j;
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return null;
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
        C25478n nVar = this.f53130l;
        if (nVar != null) {
            return nVar;
        }
        m49784W(10);
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
        C24264f fVar = this.f53131m;
        if (fVar != null) {
            return fVar;
        }
        m49784W(11);
        throw null;
    }

    /* renamed from: k */
    public final Collection mo53511k() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        m49784W(13);
        throw null;
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        return false;
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        ClassKind classKind = this.f53127i;
        if (classKind != null) {
            return classKind;
        }
        m49784W(8);
        throw null;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        return false;
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        ArrayList arrayList = this.f53132n;
        if (arrayList != null) {
            return arrayList;
        }
        m49784W(15);
        throw null;
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        MemberScope.C24119a aVar = MemberScope.C24119a.f61217b;
        if (aVar != null) {
            return aVar;
        }
        m49784W(18);
        throw null;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        Modality modality = this.f53129k;
        if (modality != null) {
            return modality;
        }
        m49784W(7);
        throw null;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return null;
    }

    public final String toString() {
        return C21185n.m49696C(this);
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
