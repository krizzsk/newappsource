package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cf0.C21140n;
import cf0.C21151y;
import cg0.C21167e0;
import cg0.C21169f0;
import cg0.C21171g0;
import cg0.C21174i;
import cg0.C21179k;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.share.Constants;
import eh0.C23306d;
import gg0.C23417b;
import hg0.C23474k;
import hg0.C23479o;
import hh0.C23500l;
import ig0.C23598d;
import ig0.C23600e;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jg0.C23721b;
import jg0.C23723d;
import jg0.C23724e;
import kg0.C23777b;
import kg0.C23780d;
import kh0.C23788d;
import kh0.C23789e;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.C23924b;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import lf0.C24236l;
import lg0.C24248a;
import lh0.C24299r0;
import lh0.C24306u0;
import lh0.C24307v;
import mf0.C24362h;
import mg0.C24372b;
import mh0.C24376c;
import mh0.C24384h;
import og0.C24592g;
import og0.C24599n;
import og0.C24602q;
import og0.C24607v;
import p389bl.C13637c;
import p583jk.C17884p;
import p584jl.C17885a;
import p626lf.C18201b;
import rh0.C24823d;
import ug0.C25069e;
import xg0.C25258b;
import xg0.C25260c;
import zf0.C25429a0;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25455m;
import zf0.C25480o;
import zf0.C25491z;

public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* renamed from: n */
    public final C25432c f60654n;

    /* renamed from: o */
    public final C24592g f60655o;

    /* renamed from: p */
    public final boolean f60656p;

    /* renamed from: q */
    public final C23789e<List<C25430b>> f60657q;

    /* renamed from: r */
    public final C23789e<Set<C25069e>> f60658r;

    /* renamed from: s */
    public final C23789e<Map<C25069e, C24599n>> f60659s;

    /* renamed from: t */
    public final C23788d<C25069e, C21179k> f60660t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(C23780d dVar, C25432c cVar, C24592g gVar, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(dVar, lazyJavaClassMemberScope);
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(cVar, "ownerDescriptor");
        C24362h.m61211f(gVar, "jClass");
        this.f60654n = cVar;
        this.f60655o = gVar;
        this.f60656p = z;
        this.f60657q = dVar.f60080a.f60055a.mo59019d(new LazyJavaClassMemberScope$constructors$1(this, dVar));
        this.f60658r = dVar.f60080a.f60055a.mo59019d(new LazyJavaClassMemberScope$nestedClassIndex$1(this));
        this.f60659s = dVar.f60080a.f60055a.mo59019d(new LazyJavaClassMemberScope$enumEntryIndex$1(this));
        this.f60660t = dVar.f60080a.f60055a.mo59016a(new LazyJavaClassMemberScope$nestedClasses$1(this, dVar));
    }

    /* renamed from: C */
    public static C23903e m59067C(C23903e eVar, C23900c cVar, AbstractCollection abstractCollection) {
        boolean z;
        boolean z2 = true;
        if (!abstractCollection.isEmpty()) {
            Iterator it = abstractCollection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C23903e eVar2 = (C23903e) it.next();
                if (C24362h.m61206a(eVar, eVar2) || eVar2.mo53438w0() != null || !m59069F(eVar2, cVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (z2) {
            return eVar;
        }
        Object build = eVar.mo53474u().mo59428g().build();
        C24362h.m61208c(build);
        return (C23903e) build;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (mf0.C24362h.m61206a(r3, kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60325d) == false) goto L_0x003f;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.descriptors.C23903e m59068D(kotlin.reflect.jvm.internal.impl.descriptors.C23903e r5) {
        /*
            java.util.List r0 = r5.mo53442h()
            java.lang.String r1 = "valueParameters"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.Object r0 = kotlin.collections.C23825c.m58523t0(r0)
            zf0.k0 r0 = (zf0.C25452k0) r0
            r2 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x003f
        L_0x0013:
            lh0.v r3 = r0.getType()
            lh0.i0 r3 = r3.mo60411O0()
            zf0.e r3 = r3.mo53460o()
            if (r3 != 0) goto L_0x0022
            goto L_0x0030
        L_0x0022:
            ug0.d r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60287h(r3)
            boolean r4 = r3.mo61596f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 != 0) goto L_0x0032
        L_0x0030:
            r3 = r2
            goto L_0x0036
        L_0x0032:
            ug0.c r3 = r3.mo61600i()
        L_0x0036:
            ug0.c r4 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.f60325d
            boolean r3 = mf0.C24362h.m61206a(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            return r2
        L_0x0043:
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r2 = r5.mo53474u()
            java.util.List r5 = r5.mo53442h()
            mf0.C24362h.m61210e(r5, r1)
            r1 = 1
            java.util.List r5 = kotlin.collections.C23825c.m58509f0(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r5 = r2.mo59422b(r5)
            lh0.v r0 = r0.getType()
            java.util.List r0 = r0.mo60410N0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            lh0.l0 r0 = (lh0.C24281l0) r0
            lh0.v r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r5 = r5.mo59429h(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = r5.build()
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r5
            r0 = r5
            cg0.h0 r0 = (cg0.C21173h0) r0
            if (r0 != 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r0.f60486v = r1
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.m59068D(kotlin.reflect.jvm.internal.impl.descriptors.e):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    /* renamed from: F */
    public static boolean m59069F(C23894a aVar, C23894a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f61189d.mo60173n(aVar2, aVar, true).mo60174c();
        C24362h.m61210e(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c != OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE || C23474k.C23475a.m57576a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.c] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m59070G(kotlin.reflect.jvm.internal.impl.descriptors.C23903e r2, kotlin.reflect.jvm.internal.impl.descriptors.C23903e r3) {
        /*
            int r0 = hg0.C23460b.f59241m
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r2, r0)
            ug0.e r0 = r2.getName()
            java.lang.String r0 = r0.mo61604f()
            java.lang.String r1 = "removeAt"
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = p584jl.C17885a.m44388A(r2)
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60569h
            java.lang.String r1 = r1.f60575b
            boolean r0 = mf0.C24362h.m61206a(r0, r1)
            if (r0 == 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x002e
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r3.mo53407a()
        L_0x002e:
            java.lang.String r0 = "if (superDescriptor.isRe…iginal else subDescriptor"
            mf0.C24362h.m61210e(r3, r0)
            boolean r2 = m59069F(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.m59070G(kotlin.reflect.jvm.internal.impl.descriptors.e, kotlin.reflect.jvm.internal.impl.descriptors.e):boolean");
    }

    /* renamed from: H */
    public static C23903e m59071H(C25491z zVar, String str, C24236l lVar) {
        C23903e eVar;
        boolean z;
        Iterator it = ((Iterable) lVar.invoke(C25069e.m62820i(str))).iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            C23903e eVar2 = (C23903e) it.next();
            if (eVar2.mo53442h().size() == 0) {
                C24384h hVar = C24376c.f61714a;
                C24307v i = eVar2.mo53443i();
                if (i == null) {
                    z = false;
                } else {
                    z = hVar.mo60531f(i, zVar.getType());
                }
                if (z) {
                    eVar = eVar2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (eVar == null);
        return eVar;
    }

    /* renamed from: J */
    public static C23903e m59072J(C25491z zVar, C24236l lVar) {
        C23903e eVar;
        C24307v i;
        String f = zVar.getName().mo61604f();
        C24362h.m61210e(f, "name.asString()");
        Iterator it = ((Iterable) lVar.invoke(C25069e.m62820i(C23479o.m57579b(f)))).iterator();
        do {
            eVar = null;
            if (!it.hasNext()) {
                break;
            }
            C23903e eVar2 = (C23903e) it.next();
            if (eVar2.mo53442h().size() == 1 && (i = eVar2.mo53443i()) != null) {
                C25069e eVar3 = C23867c.f60309e;
                if (!C23867c.m58674E(i, C23872e.C23873a.f60366d)) {
                    continue;
                } else {
                    C24384h hVar = C24376c.f61714a;
                    List<C25452k0> h = eVar2.mo53442h();
                    C24362h.m61210e(h, "descriptor.valueParameters");
                    if (hVar.mo60530d(((C25452k0) C23825c.m58491C0(h)).getType(), zVar.getType())) {
                        eVar = eVar2;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (eVar == null);
        return eVar;
    }

    /* renamed from: M */
    public static boolean m59073M(C23903e eVar, C23900c cVar) {
        String z = C17885a.m44474z(eVar, 2);
        C23900c a = cVar.mo53407a();
        C24362h.m61210e(a, "builtinWithErasedParameters.original");
        if (!C24362h.m61206a(z, C17885a.m44474z(a, 2)) || m59069F(eVar, cVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final ArrayList m59074v(LazyJavaClassMemberScope lazyJavaClassMemberScope, C25069e eVar) {
        Collection<C24602q> f = ((C24248a) lazyJavaClassMemberScope.f60687e.invoke()).mo59515f(eVar);
        ArrayList arrayList = new ArrayList(C21136j.m49436X(f, 10));
        for (C24602q t : f) {
            arrayList.add(lazyJavaClassMemberScope.mo59551t(t));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final ArrayList m59075w(LazyJavaClassMemberScope lazyJavaClassMemberScope, C25069e eVar) {
        boolean z;
        LinkedHashSet K = lazyJavaClassMemberScope.mo59529K(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object next : K) {
            C23903e eVar2 = (C23903e) next;
            C24362h.m61211f(eVar2, "<this>");
            boolean z2 = true;
            if (SpecialBuiltinMembers.m58981b(eVar2) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && BuiltinMethodsWithSpecialGenericSignature.m58976a(eVar2) == null) {
                z2 = false;
            }
            if (!z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void mo59525A(Set set, AbstractCollection abstractCollection, C24823d dVar, C24236l lVar) {
        C23903e eVar;
        C21169f0 f0Var;
        C24823d dVar2 = dVar;
        C24236l lVar2 = lVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C25491z zVar = (C25491z) it.next();
            C23723d dVar3 = null;
            if (mo59527E(zVar, lVar2)) {
                C23903e I = mo59528I(zVar, lVar2);
                C24362h.m61208c(I);
                if (zVar.mo53526Q()) {
                    eVar = m59072J(zVar, lVar2);
                    C24362h.m61208c(eVar);
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    eVar.mo53436s();
                    I.mo53436s();
                }
                C23723d dVar4 = new C23723d(this.f60654n, I, eVar, zVar);
                C24307v i = I.mo53443i();
                C24362h.m61208c(i);
                dVar4.mo53449Q0(i, EmptyList.f60173b, mo59540p(), (C21171g0) null);
                C21167e0 g = C25258b.m63381g(dVar4, I.getAnnotations(), false, I.mo53400e());
                g.f53028m = I;
                g.mo53464P0(dVar4.getType());
                if (eVar != null) {
                    List<C25452k0> h = eVar.mo53442h();
                    C24362h.m61210e(h, "setterMethod.valueParameters");
                    C25452k0 k0Var = (C25452k0) C23825c.m58515l0(h);
                    if (k0Var != null) {
                        f0Var = C25258b.m63382h(dVar4, eVar.getAnnotations(), k0Var.getAnnotations(), false, eVar.mo53429g(), eVar.mo53400e());
                        f0Var.f53028m = eVar;
                    } else {
                        throw new AssertionError(C24362h.m61216k(eVar, "No parameter found for "));
                    }
                } else {
                    f0Var = null;
                }
                dVar4.mo53447O0(g, f0Var, (C25480o) null, (C25480o) null);
                dVar3 = dVar4;
            }
            AbstractCollection abstractCollection2 = abstractCollection;
            if (dVar3 != null) {
                abstractCollection2.add(dVar3);
                if (dVar2 != null) {
                    dVar2.add(zVar);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: B */
    public final Collection<C24307v> mo59526B() {
        if (!this.f60656p) {
            return this.f60684b.f60080a.f60075u.mo60529b().mo60526z(this.f60654n);
        }
        Collection<C24307v> n = this.f60654n.mo53481j().mo53459n();
        C24362h.m61210e(n, "ownerDescriptor.typeConstructor.supertypes");
        return n;
    }

    /* renamed from: E */
    public final boolean mo59527E(C25491z zVar, C24236l<? super C25069e, ? extends Collection<? extends C23903e>> lVar) {
        if (C17884p.m44339J(zVar)) {
            return false;
        }
        C23903e I = mo59528I(zVar, lVar);
        C23903e J = m59072J(zVar, lVar);
        if (I == null) {
            return false;
        }
        if (!zVar.mo53526Q()) {
            return true;
        }
        if (J == null || J.mo53436s() != I.mo53436s()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public final C23903e mo59528I(C25491z zVar, C24236l<? super C25069e, ? extends Collection<? extends C23903e>> lVar) {
        C25429a0 a0Var;
        C21167e0 getter = zVar.getGetter();
        String str = null;
        if (getter == null) {
            a0Var = null;
        } else {
            a0Var = (C25429a0) SpecialBuiltinMembers.m58981b(getter);
        }
        if (a0Var != null) {
            str = C23924b.m58991a(a0Var);
        }
        if (str != null && !SpecialBuiltinMembers.m58983d(this.f60654n, a0Var)) {
            return m59071H(zVar, str, lVar);
        }
        String f = zVar.getName().mo61604f();
        C24362h.m61210e(f, "name.asString()");
        return m59071H(zVar, C23479o.m57578a(f), lVar);
    }

    /* renamed from: K */
    public final LinkedHashSet mo59529K(C25069e eVar) {
        Collection<C24307v> B = mo59526B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C24307v o : B) {
            C21140n.m49439a0(o.mo59564o().mo53531b(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: L */
    public final Set<C25491z> mo59530L(C25069e eVar) {
        Collection<C24307v> B = mo59526B();
        ArrayList arrayList = new ArrayList();
        for (C24307v o : B) {
            Collection<C25491z> c = o.mo59564o().mo53532c(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(c, 10));
            for (C25491z add : c) {
                arrayList2.add(add);
            }
            C21140n.m49439a0(arrayList2, arrayList);
        }
        return C23825c.m58503O0(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (uh0.C25081h.m62835F(r2, "set") == false) goto L_0x00c7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x00cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017c  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo59531N(kotlin.reflect.jvm.internal.impl.descriptors.C23903e r11) {
        /*
            r10 = this;
            ug0.e r0 = r11.getName()
            java.lang.String r1 = "function.name"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = r0.mo61604f()
            java.lang.String r2 = "name.asString()"
            mf0.C24362h.m61210e(r1, r2)
            ug0.c r2 = hg0.C23479o.f59266a
            java.lang.String r2 = "get"
            boolean r3 = uh0.C25081h.m62835F(r1, r2)
            java.lang.String r4 = "is"
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L_0x0029
            boolean r3 = uh0.C25081h.m62835F(r1, r4)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            r7 = 0
            java.lang.String r8 = "set"
            if (r3 == 0) goto L_0x0042
            r1 = 12
            ug0.e r1 = mf0.C24361g.m61165h0(r0, r2, r7, r1)
            if (r1 != 0) goto L_0x003d
            r1 = 8
            ug0.e r1 = mf0.C24361g.m61165h0(r0, r4, r7, r1)
        L_0x003d:
            java.util.List r0 = p583jk.C17875h.m44282F(r1)
            goto L_0x0069
        L_0x0042:
            boolean r1 = uh0.C25081h.m62835F(r1, r8)
            if (r1 == 0) goto L_0x005d
            r1 = 2
            ug0.e[] r1 = new ug0.C25069e[r1]
            r2 = 4
            ug0.e r3 = mf0.C24361g.m61165h0(r0, r8, r7, r2)
            r1[r5] = r3
            ug0.e r0 = mf0.C24361g.m61165h0(r0, r8, r4, r2)
            r1[r6] = r0
            java.util.ArrayList r0 = kotlin.collections.C23816b.m58438T0(r1)
            goto L_0x0069
        L_0x005d:
            java.util.LinkedHashMap r1 = hg0.C23461c.f59243b
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0069
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f60173b
        L_0x0069:
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0074
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0074
            goto L_0x00d3
        L_0x0074:
            java.util.Iterator r0 = r0.iterator()
        L_0x0078:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r1 = r0.next()
            ug0.e r1 = (ug0.C25069e) r1
            java.util.Set r1 = r10.mo59530L(r1)
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0093
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0093
            goto L_0x00ce
        L_0x0093:
            java.util.Iterator r1 = r1.iterator()
        L_0x0097:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ce
            java.lang.Object r2 = r1.next()
            zf0.z r2 = (zf0.C25491z) r2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
            r3.<init>(r11, r10)
            boolean r3 = r10.mo59527E(r2, r3)
            if (r3 == 0) goto L_0x00c9
            boolean r2 = r2.mo53526Q()
            if (r2 != 0) goto L_0x00c7
            ug0.e r2 = r11.getName()
            java.lang.String r2 = r2.mo61604f()
            java.lang.String r3 = "function.name.asString()"
            mf0.C24362h.m61210e(r2, r3)
            boolean r2 = uh0.C25081h.m62835F(r2, r8)
            if (r2 != 0) goto L_0x00c9
        L_0x00c7:
            r2 = 1
            goto L_0x00ca
        L_0x00c9:
            r2 = 0
        L_0x00ca:
            if (r2 == 0) goto L_0x0097
            r1 = 1
            goto L_0x00cf
        L_0x00ce:
            r1 = 0
        L_0x00cf:
            if (r1 == 0) goto L_0x0078
            r0 = 1
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            if (r0 == 0) goto L_0x00d7
            return r5
        L_0x00d7:
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60562a
            ug0.e r0 = r11.getName()
            java.lang.String r1 = "name"
            mf0.C24362h.m61210e(r0, r1)
            java.util.LinkedHashMap r2 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f60573l
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x00ee
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.f60173b
        L_0x00ee:
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00fa
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00fa
            goto L_0x0179
        L_0x00fa:
            java.util.Iterator r0 = r0.iterator()
        L_0x00fe:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r0.next()
            ug0.e r2 = (ug0.C25069e) r2
            java.util.LinkedHashSet r3 = r10.mo59529K(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0117:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0138
            java.lang.Object r7 = r3.next()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.e r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r8
            java.lang.String r9 = "<this>"
            mf0.C24362h.m61211f(r8, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r8 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58981b(r8)
            if (r8 == 0) goto L_0x0131
            r8 = 1
            goto L_0x0132
        L_0x0131:
            r8 = 0
        L_0x0132:
            if (r8 == 0) goto L_0x0117
            r4.add(r7)
            goto L_0x0117
        L_0x0138:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x013f
            goto L_0x0174
        L_0x013f:
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r3 = r11.mo53474u()
            r3.mo59437p(r2)
            r3.mo59439r()
            r3.mo59434m()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = r3.build()
            mf0.C24362h.m61208c(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r2
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x015c
            goto L_0x0174
        L_0x015c:
            java.util.Iterator r3 = r4.iterator()
        L_0x0160:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r4
            boolean r4 = m59070G(r4, r2)
            if (r4 == 0) goto L_0x0160
            r2 = 1
            goto L_0x0175
        L_0x0174:
            r2 = 0
        L_0x0175:
            if (r2 == 0) goto L_0x00fe
            r0 = 1
            goto L_0x017a
        L_0x0179:
            r0 = 0
        L_0x017a:
            if (r0 != 0) goto L_0x0219
            int r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f60546m
            ug0.e r0 = r11.getName()
            mf0.C24362h.m61210e(r0, r1)
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58977b(r0)
            if (r0 != 0) goto L_0x018c
            goto L_0x01d6
        L_0x018c:
            ug0.e r0 = r11.getName()
            mf0.C24362h.m61210e(r0, r1)
            java.util.LinkedHashSet r0 = r10.mo59529K(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x01a0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01b7
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r3
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58976a(r3)
            if (r3 != 0) goto L_0x01b3
            goto L_0x01a0
        L_0x01b3:
            r2.add(r3)
            goto L_0x01a0
        L_0x01b7:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01be
            goto L_0x01d6
        L_0x01be:
            java.util.Iterator r0 = r2.iterator()
        L_0x01c2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01d6
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r2
            boolean r2 = m59073M(r11, r2)
            if (r2 == 0) goto L_0x01c2
            r0 = 1
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 != 0) goto L_0x0219
            kotlin.reflect.jvm.internal.impl.descriptors.e r0 = m59068D(r11)
            if (r0 != 0) goto L_0x01e0
            goto L_0x0215
        L_0x01e0:
            ug0.e r11 = r11.getName()
            mf0.C24362h.m61210e(r11, r1)
            java.util.LinkedHashSet r11 = r10.mo59529K(r11)
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x01f2
            goto L_0x0215
        L_0x01f2:
            java.util.Iterator r11 = r11.iterator()
        L_0x01f6:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0215
            java.lang.Object r1 = r11.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r1
            boolean r2 = r1.mo53424V()
            if (r2 == 0) goto L_0x0210
            boolean r1 = m59069F(r0, r1)
            if (r1 == 0) goto L_0x0210
            r1 = 1
            goto L_0x0211
        L_0x0210:
            r1 = 0
        L_0x0211:
            if (r1 == 0) goto L_0x01f6
            r11 = 1
            goto L_0x0216
        L_0x0215:
            r11 = 0
        L_0x0216:
            if (r11 != 0) goto L_0x0219
            r5 = 1
        L_0x0219:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.mo59531N(kotlin.reflect.jvm.internal.impl.descriptors.e):boolean");
    }

    /* renamed from: O */
    public final void mo59532O(C25069e eVar, C23417b bVar) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(bVar, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C17884p.m44346Q(this.f60684b.f60080a.f60068n, (NoLookupLocation) bVar, this.f60654n, eVar);
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59532O(eVar, noLookupLocation);
        return super.mo53531b(eVar, noLookupLocation);
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59532O(eVar, noLookupLocation);
        return super.mo53532c(eVar, noLookupLocation);
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C21179k kVar;
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        mo59532O(eVar, noLookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.f60685c;
        if (lazyJavaClassMemberScope == null) {
            kVar = null;
        } else {
            kVar = lazyJavaClassMemberScope.f60660t.invoke(eVar);
        }
        if (kVar == null) {
            return this.f60660t.invoke(eVar);
        }
        return kVar;
    }

    /* renamed from: h */
    public final Set<C25069e> mo59533h(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        return C21151y.m49445h0((Set) this.f60658r.invoke(), ((Map) this.f60659s.invoke()).keySet());
    }

    /* renamed from: i */
    public final Set mo59534i(C23306d dVar, C24236l lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        Collection<C24307v> n = this.f60654n.mo53481j().mo53459n();
        C24362h.m61210e(n, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C24307v o : n) {
            C21140n.m49439a0(o.mo59564o().mo53530a(), linkedHashSet);
        }
        linkedHashSet.addAll(((C24248a) this.f60687e.invoke()).mo59510a());
        linkedHashSet.addAll(((C24248a) this.f60687e.invoke()).mo59511b());
        linkedHashSet.addAll(mo59533h(dVar, lVar));
        linkedHashSet.addAll(this.f60684b.f60080a.f60078x.mo53546e(this.f60654n));
        return linkedHashSet;
    }

    /* renamed from: j */
    public final void mo59535j(ArrayList arrayList, C25069e eVar) {
        boolean z;
        ArrayList arrayList2 = arrayList;
        C25069e eVar2 = eVar;
        C24362h.m61211f(eVar2, "name");
        if (this.f60655o.mo59481p() && ((C24248a) this.f60687e.invoke()).mo59513d(eVar2) != null) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C23903e) it.next()).mo53442h().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                C24607v d = ((C24248a) this.f60687e.invoke()).mo59513d(eVar2);
                C24362h.m61208c(d);
                JavaMethodDescriptor b1 = JavaMethodDescriptor.m59002b1(this.f60654n, C13637c.m34049D(this.f60684b, d), d.getName(), this.f60684b.f60080a.f60064j.mo58430a(d), true);
                C24307v d2 = this.f60684b.f60084e.mo59572d(d.getType(), C24372b.m61251b(TypeUsage.COMMON, false, (C21174i) null, 2));
                C25433c0 p = mo59540p();
                EmptyList emptyList = EmptyList.f60173b;
                Modality.Companion.getClass();
                b1.mo53472a1((C21171g0) null, p, emptyList, emptyList, d2, Modality.C23887a.m58738a(false, false, true), C25455m.f63744e, (Map) null);
                b1.mo59506c1(false, false);
                ((C23598d.C23599a) this.f60684b.f60080a.f60061g).getClass();
                arrayList2.add(b1);
            }
        }
        this.f60684b.f60080a.f60078x.mo53544c(this.f60654n, eVar2, arrayList2);
    }

    /* renamed from: k */
    public final C24248a mo59536k() {
        return new ClassDeclaredMemberIndex(this.f60655o, LazyJavaClassMemberScope$computeMemberIndex$1.f60661f);
    }

    /* renamed from: m */
    public final void mo59537m(LinkedHashSet linkedHashSet, C25069e eVar) {
        boolean z;
        C24362h.m61211f(eVar, "name");
        LinkedHashSet K = mo59529K(eVar);
        SpecialGenericSignatures.C23920a aVar = SpecialGenericSignatures.f60562a;
        if (!SpecialGenericSignatures.f60572k.contains(eVar)) {
            int i = BuiltinMethodsWithSpecialGenericSignature.f60546m;
            if (!BuiltinMethodsWithSpecialGenericSignature.m58977b(eVar)) {
                if (!K.isEmpty()) {
                    Iterator it = K.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C23900c) it.next()).mo53424V()) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : K) {
                        if (mo59531N((C23903e) next)) {
                            arrayList.add(next);
                        }
                    }
                    mo59546y(linkedHashSet, eVar, arrayList, false);
                    return;
                }
            }
        }
        C24823d dVar = new C24823d();
        LinkedHashSet v = C18201b.m44925v(eVar, K, EmptyList.f60173b, this.f60654n, C23500l.f59341f0, this.f60684b.f60080a.f60075u.mo60528a());
        C25069e eVar2 = eVar;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        LinkedHashSet linkedHashSet3 = v;
        mo59547z(eVar2, linkedHashSet2, linkedHashSet3, linkedHashSet, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        mo59547z(eVar2, linkedHashSet2, linkedHashSet3, dVar, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : K) {
            if (mo59531N((C23903e) next2)) {
                arrayList2.add(next2);
            }
        }
        mo59546y(linkedHashSet, eVar, C23825c.m58527x0(dVar, arrayList2), true);
    }

    /* renamed from: n */
    public final void mo59538n(ArrayList arrayList, C25069e eVar) {
        Set<T> set;
        C24602q qVar;
        C24362h.m61211f(eVar, "name");
        if (this.f60655o.mo59478m() && (qVar = (C24602q) C23825c.m58492D0(((C24248a) this.f60687e.invoke()).mo59515f(eVar))) != null) {
            Modality modality = Modality.FINAL;
            C23724e R0 = C23724e.m58247R0(this.f60654n, C13637c.m34049D(this.f60684b, qVar), modality, C17885a.m44389A0(qVar.mo58511g()), false, qVar.getName(), this.f60684b.f60080a.f60064j.mo58430a(qVar), false);
            C21167e0 b = C25258b.m63376b(R0, C20989e.C20990a.f52739a);
            R0.mo53447O0(b, (C21169f0) null, (C25480o) null, (C25480o) null);
            C23780d dVar = this.f60684b;
            C24362h.m61211f(dVar, "<this>");
            C24307v l = LazyJavaScope.m59113l(qVar, new C23780d(dVar.f60080a, new LazyJavaTypeParameterResolver(dVar, R0, qVar, 0), dVar.f60082c));
            R0.mo53449Q0(l, EmptyList.f60173b, mo59540p(), (C21171g0) null);
            b.mo53464P0(l);
            arrayList.add(R0);
        }
        Set<C25491z> L = mo59530L(eVar);
        if (!L.isEmpty()) {
            C24823d dVar2 = new C24823d();
            C24823d dVar3 = new C24823d();
            mo59525A(L, arrayList, dVar2, new LazyJavaClassMemberScope$computeNonDeclaredProperties$1(this));
            if (dVar2.isEmpty()) {
                set = C23825c.m58503O0(L);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (T next : L) {
                    if (!dVar2.contains(next)) {
                        linkedHashSet.add(next);
                    }
                }
                set = linkedHashSet;
            }
            mo59525A(set, dVar3, (C24823d) null, new LazyJavaClassMemberScope$computeNonDeclaredProperties$2(this));
            LinkedHashSet h0 = C21151y.m49445h0(L, dVar3);
            C25432c cVar = this.f60654n;
            C23777b bVar = this.f60684b.f60080a;
            arrayList.addAll(C18201b.m44925v(eVar, h0, arrayList, cVar, bVar.f60060f, bVar.f60075u.mo60528a()));
        }
    }

    /* renamed from: o */
    public final Set mo59539o(C23306d dVar) {
        C24362h.m61211f(dVar, "kindFilter");
        if (this.f60655o.mo59478m()) {
            return mo53530a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C24248a) this.f60687e.invoke()).mo59512c());
        Collection<C24307v> n = this.f60654n.mo53481j().mo53459n();
        C24362h.m61210e(n, "ownerDescriptor.typeConstructor.supertypes");
        for (C24307v o : n) {
            C21140n.m49439a0(o.mo59564o().mo53533d(), linkedHashSet);
        }
        return linkedHashSet;
    }

    /* renamed from: p */
    public final C25433c0 mo59540p() {
        C25432c cVar = this.f60654n;
        if (cVar != null) {
            int i = C25260c.f63536a;
            return cVar.mo53404M0();
        }
        C25260c.m63384a(0);
        throw null;
    }

    /* renamed from: q */
    public final C25442g mo59541q() {
        return this.f60654n;
    }

    /* renamed from: r */
    public final boolean mo59542r(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.f60655o.mo59478m()) {
            return false;
        }
        return mo59531N(javaMethodDescriptor);
    }

    /* renamed from: s */
    public final LazyJavaScope.C23936a mo59543s(C24602q qVar, ArrayList arrayList, C24307v vVar, List list) {
        C24362h.m61211f(qVar, "method");
        C24362h.m61211f(vVar, "returnType");
        C24362h.m61211f(list, "valueParameters");
        C23600e eVar = this.f60684b.f60080a.f60059e;
        C25432c cVar = this.f60654n;
        ((C23600e.C23601a) eVar).getClass();
        if (cVar != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new LazyJavaScope.C23936a(list, arrayList, emptyList, vVar);
            }
            C23600e.C23602b.m57788a(3);
            throw null;
        }
        C23600e.C23601a.m57787a(1);
        throw null;
    }

    public final String toString() {
        return C24362h.m61216k(this.f60655o.mo59474f(), "Lazy Java member scope for ");
    }

    /* renamed from: x */
    public final void mo59545x(ArrayList arrayList, C23721b bVar, int i, C24602q qVar, C24307v vVar, C24307v vVar2) {
        C24306u0 u0Var;
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        C25069e name = qVar.getName();
        C24306u0 i2 = C24299r0.m60977i(vVar);
        boolean R = qVar.mo58518R();
        if (vVar2 == null) {
            u0Var = null;
        } else {
            u0Var = C24299r0.m60977i(vVar2);
        }
        ArrayList arrayList2 = arrayList;
        arrayList.add(new C23910d(bVar, (C25452k0) null, i, aVar, name, i2, R, false, false, u0Var, this.f60684b.f60080a.f60064j.mo58430a(qVar)));
    }

    /* renamed from: y */
    public final void mo59546y(LinkedHashSet linkedHashSet, C25069e eVar, ArrayList arrayList, boolean z) {
        C25432c cVar = this.f60654n;
        C23777b bVar = this.f60684b.f60080a;
        LinkedHashSet<C23903e> v = C18201b.m44925v(eVar, arrayList, linkedHashSet, cVar, bVar.f60060f, bVar.f60075u.mo60528a());
        if (!z) {
            linkedHashSet.addAll(v);
            return;
        }
        ArrayList x0 = C23825c.m58527x0(v, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(v, 10));
        for (C23903e eVar2 : v) {
            C23903e eVar3 = (C23903e) SpecialBuiltinMembers.m58982c(eVar2);
            if (eVar3 != null) {
                eVar2 = m59067C(eVar2, eVar3, x0);
            }
            arrayList2.add(eVar2);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59547z(ug0.C25069e r17, java.util.LinkedHashSet r18, java.util.LinkedHashSet r19, java.util.AbstractSet r20, lf0.C24236l r21) {
        /*
            r16 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            java.util.Iterator r3 = r19.iterator()
        L_0x000a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0157
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r4
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58981b(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r5
            r6 = 0
            if (r5 != 0) goto L_0x0022
        L_0x001f:
            r9 = r17
            goto L_0x0066
        L_0x0022:
            java.lang.String r7 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m58980a(r5)
            mf0.C24362h.m61208c(r7)
            ug0.e r7 = ug0.C25069e.m62820i(r7)
            java.lang.Object r7 = r2.invoke(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0037:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x001f
            java.lang.Object r8 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r8
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r8 = r8.mo53474u()
            r9 = r17
            r8.mo59437p(r9)
            r8.mo59439r()
            r8.mo59434m()
            kotlin.reflect.jvm.internal.impl.descriptors.c r8 = r8.build()
            mf0.C24362h.m61208c(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.e r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r8
            boolean r10 = m59070G(r5, r8)
            if (r10 == 0) goto L_0x0037
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = m59067C(r8, r5, r0)
            goto L_0x0067
        L_0x0066:
            r5 = r6
        L_0x0067:
            mf0.C24361g.m61168j(r5, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.c r5 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m58976a(r4)
            if (r5 != 0) goto L_0x0074
        L_0x0070:
            r8 = r16
            goto L_0x0111
        L_0x0074:
            ug0.e r7 = r5.getName()
            java.lang.String r8 = "overridden.name"
            mf0.C24362h.m61210e(r7, r8)
            java.lang.Object r7 = r2.invoke(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0087:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x009b
            java.lang.Object r8 = r7.next()
            r10 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.e r10 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r10
            boolean r10 = m59073M(r10, r5)
            if (r10 == 0) goto L_0x0087
            goto L_0x009c
        L_0x009b:
            r8 = r6
        L_0x009c:
            kotlin.reflect.jvm.internal.impl.descriptors.e r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r8
            if (r8 != 0) goto L_0x00a2
            r7 = r6
            goto L_0x0101
        L_0x00a2:
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r7 = r8.mo53474u()
            java.util.List r10 = r5.mo53442h()
            java.lang.String r11 = "overridden.valueParameters"
            mf0.C24362h.m61210e(r10, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = cf0.C21136j.m49436X(r10, r12)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x00be:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00e0
            java.lang.Object r12 = r10.next()
            zf0.k0 r12 = (zf0.C25452k0) r12
            jg0.g r13 = new jg0.g
            lh0.v r14 = r12.getType()
            java.lang.String r15 = "it.type"
            mf0.C24362h.m61210e(r14, r15)
            boolean r12 = r12.mo59462F0()
            r13.<init>(r14, r12)
            r11.add(r13)
            goto L_0x00be
        L_0x00e0:
            java.util.List r8 = r8.mo53442h()
            java.lang.String r10 = "override.valueParameters"
            mf0.C24362h.m61210e(r8, r10)
            java.util.ArrayList r8 = p389bl.C13637c.m34074q(r11, r8, r5)
            r7.mo59422b(r8)
            r7.mo59439r()
            r7.mo59434m()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.mo59424c(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.c r7 = r7.build()
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r7
        L_0x0101:
            if (r7 != 0) goto L_0x0105
            goto L_0x0070
        L_0x0105:
            r8 = r16
            boolean r10 = r8.mo59531N(r7)
            if (r10 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r7 = r6
        L_0x010f:
            if (r7 != 0) goto L_0x0113
        L_0x0111:
            r5 = r6
            goto L_0x0117
        L_0x0113:
            kotlin.reflect.jvm.internal.impl.descriptors.e r5 = m59067C(r7, r5, r0)
        L_0x0117:
            mf0.C24361g.m61168j(r5, r1)
            boolean r5 = r4.mo53424V()
            if (r5 != 0) goto L_0x0121
            goto L_0x0152
        L_0x0121:
            ug0.e r5 = r4.getName()
            java.lang.String r7 = "descriptor.name"
            mf0.C24362h.m61210e(r5, r7)
            java.lang.Object r5 = r2.invoke(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0134:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0152
            java.lang.Object r7 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r7
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = m59068D(r7)
            if (r7 != 0) goto L_0x0147
            goto L_0x014e
        L_0x0147:
            boolean r10 = m59069F(r7, r4)
            if (r10 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r7 = r6
        L_0x014f:
            if (r7 == 0) goto L_0x0134
            r6 = r7
        L_0x0152:
            mf0.C24361g.m61168j(r6, r1)
            goto L_0x000a
        L_0x0157:
            r8 = r16
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.mo59547z(ug0.e, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, lf0.l):void");
    }
}
