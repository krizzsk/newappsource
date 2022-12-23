package cg0;

import com.appboy.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.resolve.C24116a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import lh0.C24274i0;
import lh0.C24289p;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25443g0;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25449j;

/* renamed from: cg0.i */
public abstract class C21174i extends C21186o implements C25448i0 {

    /* renamed from: f */
    public final Variance f53071f;

    /* renamed from: g */
    public final boolean f53072g;

    /* renamed from: h */
    public final int f53073h;

    /* renamed from: i */
    public final C23789e<C24274i0> f53074i;

    /* renamed from: j */
    public final C23789e<C24312z> f53075j;

    /* renamed from: k */
    public final C23792h f53076k;

    /* renamed from: cg0.i$a */
    public class C21175a extends AbstractTypeConstructor {

        /* renamed from: c */
        public final C25443g0 f53077c;

        /* renamed from: d */
        public final /* synthetic */ C21174i f53078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21175a(C21174i iVar, C23792h hVar, C25443g0 g0Var) {
            super(hVar);
            if (hVar != null) {
                this.f53078d = iVar;
                this.f53077c = g0Var;
                return;
            }
            m49611j(0);
            throw null;
        }

        /* renamed from: j */
        public static /* synthetic */ void m49611j(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: a */
        public final boolean mo53485a(C25437e eVar) {
            if (eVar instanceof C25448i0) {
                C24116a aVar = C24116a.f61198a;
                C21174i iVar = this.f53078d;
                C24362h.m61211f(iVar, Constants.APPBOY_PUSH_CONTENT_KEY);
                if (aVar.mo60176b(iVar, (C25448i0) eVar, true, DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.f61187f)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final Collection<C24307v> mo53486c() {
            List<C24307v> O0 = this.f53078d.mo53476O0();
            if (O0 != null) {
                return O0;
            }
            m49611j(1);
            throw null;
        }

        /* renamed from: d */
        public final C24307v mo53487d() {
            return C24289p.m60914d("Cyclic upper bounds");
        }

        /* renamed from: f */
        public final C25443g0 mo53488f() {
            C25443g0 g0Var = this.f53077c;
            if (g0Var != null) {
                return g0Var;
            }
            m49611j(5);
            throw null;
        }

        public final List<C25448i0> getParameters() {
            List<C25448i0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m49611j(2);
            throw null;
        }

        /* renamed from: h */
        public final List<C24307v> mo53489h(List<C24307v> list) {
            if (list != null) {
                List<C24307v> l0 = this.f53078d.mo53483l0(list);
                if (l0 != null) {
                    return l0;
                }
                m49611j(8);
                throw null;
            }
            m49611j(7);
            throw null;
        }

        /* renamed from: i */
        public final void mo53490i(C24307v vVar) {
            if (vVar != null) {
                this.f53078d.mo53475N0(vVar);
            } else {
                m49611j(6);
                throw null;
            }
        }

        /* renamed from: m */
        public final C23867c mo53458m() {
            C23867c e = DescriptorUtilsKt.m60284e(this.f53078d);
            if (e != null) {
                return e;
            }
            m49611j(4);
            throw null;
        }

        /* renamed from: o */
        public final C25437e mo53460o() {
            C21174i iVar = this.f53078d;
            if (iVar != null) {
                return iVar;
            }
            m49611j(3);
            throw null;
        }

        /* renamed from: p */
        public final boolean mo53461p() {
            return true;
        }

        public final String toString() {
            return this.f53078d.getName().f63263b;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21174i(kh0.C23792h r3, zf0.C25442g r4, ag0.C20989e r5, ug0.C25069e r6, kotlin.reflect.jvm.internal.impl.types.Variance r7, boolean r8, int r9, zf0.C25443g0 r10) {
        /*
            r2 = this;
            zf0.d0$a r0 = zf0.C25435d0.f63736a
            r1 = 0
            if (r3 == 0) goto L_0x004a
            if (r4 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0040
            if (r6 == 0) goto L_0x003b
            if (r7 == 0) goto L_0x0036
            if (r10 == 0) goto L_0x0031
            r2.<init>(r4, r5, r6, r0)
            r2.f53071f = r7
            r2.f53072g = r8
            r2.f53073h = r9
            cg0.f r4 = new cg0.f
            r4.<init>(r2, r3, r10)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h r4 = r3.mo59019d(r4)
            r2.f53074i = r4
            cg0.h r4 = new cg0.h
            r4.<init>(r2, r6)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h r4 = r3.mo59019d(r4)
            r2.f53075j = r4
            r2.f53076k = r3
            return
        L_0x0031:
            r3 = 6
            m49596A(r3)
            throw r1
        L_0x0036:
            r3 = 4
            m49596A(r3)
            throw r1
        L_0x003b:
            r3 = 3
            m49596A(r3)
            throw r1
        L_0x0040:
            r3 = 2
            m49596A(r3)
            throw r1
        L_0x0045:
            r3 = 1
            m49596A(r3)
            throw r1
        L_0x004a:
            r3 = 0
            m49596A(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cg0.C21174i.<init>(kh0.h, zf0.g, ag0.e, ug0.e, kotlin.reflect.jvm.internal.impl.types.Variance, boolean, int, zf0.g0):void");
    }

    /* renamed from: A */
    public static /* synthetic */ void m49596A(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: B0 */
    public final <R, D> R mo53398B0(C25447i<R, D> iVar, D d) {
        return iVar.mo60152c(this, d);
    }

    /* renamed from: N0 */
    public abstract void mo53475N0(C24307v vVar);

    /* renamed from: O0 */
    public abstract List<C24307v> mo53476O0();

    /* renamed from: P */
    public final C23792h mo53477P() {
        C23792h hVar = this.f53076k;
        if (hVar != null) {
            return hVar;
        }
        m49596A(14);
        throw null;
    }

    /* renamed from: T */
    public final boolean mo53478T() {
        return false;
    }

    /* renamed from: W */
    public final C25449j mo53425W() {
        return this;
    }

    /* renamed from: a */
    public final C25437e mo53407a() {
        return this;
    }

    /* renamed from: a */
    public final C25442g m49604a() {
        return this;
    }

    /* renamed from: a */
    public final C25448i0 m49605a() {
        return this;
    }

    public final int getIndex() {
        return this.f53073h;
    }

    public final List<C24307v> getUpperBounds() {
        List<C24307v> g = ((C21175a) mo53481j()).mo53459n();
        if (g != null) {
            return g;
        }
        m49596A(8);
        throw null;
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        C24274i0 i0Var = (C24274i0) this.f53074i.invoke();
        if (i0Var != null) {
            return i0Var;
        }
        m49596A(9);
        throw null;
    }

    /* renamed from: l */
    public final Variance mo53482l() {
        Variance variance = this.f53071f;
        if (variance != null) {
            return variance;
        }
        m49596A(7);
        throw null;
    }

    /* renamed from: l0 */
    public List<C24307v> mo53483l0(List<C24307v> list) {
        if (list == null) {
            m49596A(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            m49596A(13);
            throw null;
        }
    }

    /* renamed from: q */
    public final C24312z mo53412q() {
        C24312z zVar = (C24312z) this.f53075j.invoke();
        if (zVar != null) {
            return zVar;
        }
        m49596A(10);
        throw null;
    }

    /* renamed from: y */
    public final boolean mo53484y() {
        return this.f53072g;
    }
}
