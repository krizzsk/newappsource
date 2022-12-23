package jg0;

import ag0.C20989e;
import cg0.C21164d0;
import cg0.C21167e0;
import cg0.C21169f0;
import cg0.C21171g0;
import com.google.android.play.core.appupdate.C14226d;
import hg0.C23480p;
import java.util.ArrayList;
import kh0.C23790f;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import lh0.C24299r0;
import lh0.C24307v;
import mf0.C24362h;
import mh0.C24373a;
import ng0.C24501a;
import pg0.C24694b;
import pg0.C24707k;
import ug0.C25066c;
import ug0.C25069e;
import wf0.C25144h;
import xg0.C25258b;
import zf0.C25431b0;
import zf0.C25435d0;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25478n;
import zf0.C25491z;
import zg0.C25498g;

/* renamed from: jg0.e */
public class C23724e extends C21164d0 implements C23720a {

    /* renamed from: A */
    public final boolean f59927A;

    /* renamed from: B */
    public final Pair<C23894a.C23895a<?>, ?> f59928B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23724e(C25442g gVar, C20989e eVar, Modality modality, C25478n nVar, boolean z, C25069e eVar2, C25435d0 d0Var, C25491z zVar, CallableMemberDescriptor.Kind kind, boolean z2, Pair<C23894a.C23895a<?>, ?> pair) {
        super(gVar, zVar, eVar, modality, nVar, z, eVar2, kind, d0Var, false, false, false, false, false, false);
        if (gVar == null) {
            m58246A(0);
            throw null;
        } else if (eVar == null) {
            m58246A(1);
            throw null;
        } else if (modality == null) {
            m58246A(2);
            throw null;
        } else if (nVar == null) {
            m58246A(3);
            throw null;
        } else if (eVar2 == null) {
            m58246A(4);
            throw null;
        } else if (d0Var == null) {
            m58246A(5);
            throw null;
        } else if (kind != null) {
            this.f59927A = z2;
            this.f59928B = pair;
        } else {
            m58246A(6);
            throw null;
        }
    }

    /* renamed from: A */
    public static /* synthetic */ void m58246A(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: R0 */
    public static C23724e m58247R0(C25442g gVar, LazyJavaAnnotations lazyJavaAnnotations, Modality modality, C25478n nVar, boolean z, C25069e eVar, C24501a aVar, boolean z2) {
        if (gVar == null) {
            m58246A(7);
            throw null;
        } else if (modality == null) {
            m58246A(9);
            throw null;
        } else if (eVar == null) {
            m58246A(11);
            throw null;
        } else if (aVar != null) {
            return new C23724e(gVar, lazyJavaAnnotations, modality, nVar, z, eVar, aVar, (C25491z) null, CallableMemberDescriptor.Kind.DECLARATION, z2, (Pair<C23894a.C23895a<?>, ?>) null);
        } else {
            m58246A(12);
            throw null;
        }
    }

    /* renamed from: A0 */
    public final C23720a mo58951A0(C24307v vVar, ArrayList arrayList, C24307v vVar2, Pair pair) {
        C25491z zVar;
        C21167e0 e0Var;
        C21169f0 f0Var;
        C21171g0 g0Var;
        C25431b0 b0Var;
        C21167e0 e0Var2;
        C24307v vVar3 = vVar;
        C24307v vVar4 = vVar2;
        if (vVar4 != null) {
            if (m49530a() == this) {
                zVar = null;
            } else {
                zVar = m49530a();
            }
            C23724e eVar = r5;
            C23724e eVar2 = new C23724e(mo53399b(), getAnnotations(), mo53436s(), mo53429g(), this.f53097g, getName(), mo53400e(), zVar, mo53433p(), this.f59927A, pair);
            C21167e0 e0Var3 = this.f53043w;
            if (e0Var3 != null) {
                C20989e annotations = e0Var3.getAnnotations();
                Modality s = e0Var3.mo53436s();
                C25478n g = e0Var3.mo53429g();
                boolean z = e0Var3.f53021f;
                boolean z2 = e0Var3.f53022g;
                boolean z3 = e0Var3.f53025j;
                CallableMemberDescriptor.Kind p = mo53433p();
                if (zVar == null) {
                    e0Var2 = null;
                } else {
                    e0Var2 = zVar.getGetter();
                }
                e0Var = r5;
                C21167e0 e0Var4 = new C21167e0(eVar, annotations, s, g, z, z2, z3, p, e0Var2, e0Var3.mo53400e());
                e0Var.f53028m = e0Var3.f53028m;
                e0Var.mo53464P0(vVar4);
            } else {
                e0Var = null;
            }
            C25431b0 b0Var2 = this.f53044x;
            if (b0Var2 != null) {
                C20989e annotations2 = b0Var2.getAnnotations();
                Modality s2 = b0Var2.mo53436s();
                C25478n g2 = b0Var2.mo53429g();
                boolean J = b0Var2.mo53417J();
                boolean c0 = b0Var2.mo53428c0();
                boolean w = b0Var2.mo53437w();
                CallableMemberDescriptor.Kind p2 = mo53433p();
                if (zVar == null) {
                    b0Var = null;
                } else {
                    b0Var = zVar.getSetter();
                }
                C21169f0 f0Var2 = r5;
                C21169f0 f0Var3 = new C21169f0(eVar, annotations2, s2, g2, J, c0, w, p2, b0Var, b0Var2.mo53400e());
                f0Var2.f53028m = f0Var2.f53028m;
                C25452k0 k0Var = b0Var2.mo53442h().get(0);
                if (k0Var != null) {
                    f0Var2.f53064n = k0Var;
                    f0Var = f0Var2;
                } else {
                    C21169f0.m49565A(6);
                    throw null;
                }
            } else {
                f0Var = null;
            }
            C23724e eVar3 = eVar;
            eVar3.mo53447O0(e0Var, f0Var, this.f53045y, this.f53046z);
            C23790f<C25498g<?>> fVar = this.f53098h;
            if (fVar != null) {
                eVar3.f53098h = fVar;
            }
            eVar3.mo53416I0(mo53440d());
            C24307v vVar5 = vVar;
            if (vVar5 == null) {
                g0Var = null;
            } else {
                g0Var = C25258b.m63380f(this, vVar5, C20989e.C20990a.f52739a);
            }
            eVar3.mo53449Q0(vVar2, getTypeParameters(), this.f53040t, g0Var);
            return eVar3;
        }
        m58246A(20);
        throw null;
    }

    /* renamed from: P0 */
    public final void mo53448P0(C24307v vVar) {
    }

    /* renamed from: e0 */
    public final boolean mo53451e0() {
        boolean z;
        C24307v type = getType();
        if (!this.f59927A) {
            return false;
        }
        C24362h.m61211f(type, "type");
        if (((C23867c.m58676G(type) || C25144h.m63106a(type)) && !C24299r0.m60975g(type)) || C23867c.m58678I(type)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C24694b bVar = C24707k.f62553a;
        C14226d dVar = C14226d.f35756k;
        C25066c cVar = C23480p.f59282o;
        C24362h.m61210e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        if (!C24373a.C24374a.m61259A(dVar, type, cVar) || C23867c.m58678I(type)) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public final boolean mo53431j0() {
        return false;
    }

    /* renamed from: l0 */
    public final C21164d0 mo53454l0(C25442g gVar, Modality modality, C25478n nVar, C25491z zVar, CallableMemberDescriptor.Kind kind, C25069e eVar) {
        C25435d0.C25436a aVar = C25435d0.f63736a;
        if (gVar == null) {
            m58246A(13);
            throw null;
        } else if (modality == null) {
            m58246A(14);
            throw null;
        } else if (nVar == null) {
            m58246A(15);
            throw null;
        } else if (kind == null) {
            m58246A(16);
            throw null;
        } else if (eVar != null) {
            return new C23724e(gVar, getAnnotations(), modality, nVar, this.f53097g, eVar, aVar, zVar, kind, this.f59927A, this.f59928B);
        } else {
            m58246A(17);
            throw null;
        }
    }

    /* renamed from: y0 */
    public final <V> V mo53439y0(C23894a.C23895a<V> aVar) {
        Pair<C23894a.C23895a<?>, ?> pair = this.f59928B;
        if (pair == null || !pair.mo59068c().equals(aVar)) {
            return null;
        }
        return this.f59928B.mo59069d();
    }
}
