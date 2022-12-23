package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cg0.C21174i;
import fg0.C23379w;
import hg0.C23470j;
import hg0.C23480p;
import ig0.C23598d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jg0.C23721b;
import kg0.C23780d;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import lf0.C24225a;
import lh0.C24307v;
import mf0.C24362h;
import mg0.C24371a;
import mg0.C24372b;
import og0.C24591f;
import og0.C24592g;
import og0.C24596k;
import og0.C24602q;
import og0.C24607v;
import og0.C24609x;
import p389bl.C13637c;
import p583jk.C17875h;
import p584jl.C17885a;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25478n;

public final class LazyJavaClassMemberScope$constructors$1 extends Lambda implements C24225a<List<? extends C25430b>> {

    /* renamed from: $c */
    public final /* synthetic */ C23780d f60662$c;
    public final /* synthetic */ LazyJavaClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$constructors$1(LazyJavaClassMemberScope lazyJavaClassMemberScope, C23780d dVar) {
        super(0);
        this.this$0 = lazyJavaClassMemberScope;
        this.f60662$c = dVar;
    }

    public final Object invoke() {
        C23721b bVar;
        List list;
        C23721b bVar2;
        C24371a aVar;
        ArrayList arrayList;
        C23721b bVar3;
        int i;
        Pair pair;
        boolean z;
        C24307v vVar;
        List<C24596k> j = this.this$0.f60655o.mo59476j();
        ArrayList arrayList2 = new ArrayList(j.size());
        for (C24596k kVar : j) {
            LazyJavaClassMemberScope lazyJavaClassMemberScope = this.this$0;
            C25432c cVar = lazyJavaClassMemberScope.f60654n;
            C23721b a1 = C23721b.m58238a1(cVar, C13637c.m34049D(lazyJavaClassMemberScope.f60684b, kVar), false, lazyJavaClassMemberScope.f60684b.f60080a.f60064j.mo58430a(kVar));
            C23780d dVar = lazyJavaClassMemberScope.f60684b;
            int size = cVar.mo53514r().size();
            C24362h.m61211f(dVar, "<this>");
            C23780d dVar2 = new C23780d(dVar.f60080a, new LazyJavaTypeParameterResolver(dVar, a1, kVar, size), dVar.f60082c);
            LazyJavaScope.C23937b u = LazyJavaScope.m59114u(dVar2, a1, kVar.mo58499h());
            List<C25448i0> r = cVar.mo53514r();
            C24362h.m61210e(r, "classDescriptor.declaredTypeParameters");
            ArrayList<C24609x> typeParameters = kVar.getTypeParameters();
            ArrayList arrayList3 = new ArrayList(C21136j.m49436X(typeParameters, 10));
            for (C24609x a : typeParameters) {
                C25448i0 a2 = dVar2.f60081b.mo59013a(a);
                C24362h.m61208c(a2);
                arrayList3.add(a2);
            }
            a1.mo53498Z0(u.f60701a, C17885a.m44389A0(kVar.mo58511g()), C23825c.m58527x0(arrayList3, r));
            a1.mo58952T0(false);
            a1.mo58953U0(u.f60702b);
            a1.mo59453V0(cVar.mo53412q());
            ((C23598d.C23599a) dVar2.f60080a.f60061g).getClass();
            arrayList2.add(a1);
        }
        if (this.this$0.f60655o.mo59481p()) {
            LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.this$0;
            C25432c cVar2 = lazyJavaClassMemberScope2.f60654n;
            C23721b a12 = C23721b.m58238a1(cVar2, C20989e.C20990a.f52739a, true, lazyJavaClassMemberScope2.f60684b.f60080a.f60064j.mo58430a(lazyJavaClassMemberScope2.f60655o));
            ArrayList<C24607v> k = lazyJavaClassMemberScope2.f60655o.mo59477k();
            ArrayList arrayList4 = new ArrayList(k.size());
            C24371a b = C24372b.m61251b(TypeUsage.COMMON, false, (C21174i) null, 2);
            int i2 = 0;
            for (C24607v vVar2 : k) {
                int i3 = i2 + 1;
                C24307v d = lazyJavaClassMemberScope2.f60684b.f60084e.mo59572d(vVar2.getType(), b);
                if (vVar2.mo58528b()) {
                    vVar = lazyJavaClassMemberScope2.f60684b.f60080a.f60069o.mo59460m().mo59384g(d);
                } else {
                    vVar = null;
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(new C23910d(a12, (C25452k0) null, i2, C20989e.C20990a.f52739a, vVar2.getName(), d, false, false, false, vVar, lazyJavaClassMemberScope2.f60684b.f60080a.f60064j.mo58430a(vVar2)));
                b = b;
                arrayList4 = arrayList5;
                i2 = i3;
            }
            ArrayList arrayList6 = arrayList4;
            a12.mo58953U0(false);
            C25478n g = cVar2.mo53429g();
            C24362h.m61210e(g, "classDescriptor.visibility");
            if (C24362h.m61206a(g, C23470j.f59255b)) {
                g = C23470j.f59256c;
                C24362h.m61210e(g, "PROTECTED_AND_PACKAGE");
            }
            a12.mo53497Y0(arrayList6, g);
            a12.mo58952T0(false);
            a12.mo59453V0(cVar2.mo53412q());
            int i4 = 2;
            String z2 = C17885a.m44474z(a12, 2);
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C24362h.m61206a(C17885a.m44474z((C25430b) it.next(), i4), z2)) {
                        z = false;
                        break;
                    } else {
                        i4 = 2;
                    }
                }
            }
            z = true;
            if (z) {
                arrayList2.add(a12);
                C23598d dVar3 = this.f60662$c.f60080a.f60061g;
                C24592g gVar = this.this$0.f60655o;
                ((C23598d.C23599a) dVar3).getClass();
                if (gVar == null) {
                    C23598d.C23599a.m57786a(3);
                    throw null;
                }
            }
        }
        this.f60662$c.f60080a.f60078x.mo53543b(this.this$0.f60654n, arrayList2);
        C23780d dVar4 = this.f60662$c;
        SignatureEnhancement signatureEnhancement = dVar4.f60080a.f60072r;
        LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.this$0;
        boolean isEmpty = arrayList2.isEmpty();
        List list2 = arrayList2;
        if (isEmpty) {
            boolean m = lazyJavaClassMemberScope3.f60655o.mo59478m();
            if (!lazyJavaClassMemberScope3.f60655o.mo59471O()) {
                lazyJavaClassMemberScope3.f60655o.mo59482r();
            }
            if (!m) {
                bVar = null;
            } else {
                C25432c cVar3 = lazyJavaClassMemberScope3.f60654n;
                C23721b a13 = C23721b.m58238a1(cVar3, C20989e.C20990a.f52739a, true, lazyJavaClassMemberScope3.f60684b.f60080a.f60064j.mo58430a(lazyJavaClassMemberScope3.f60655o));
                if (m) {
                    List s = lazyJavaClassMemberScope3.f60655o.mo59483s();
                    ArrayList arrayList7 = new ArrayList(s.size());
                    C24371a b2 = C24372b.m61251b(TypeUsage.COMMON, true, (C21174i) null, 2);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object next : s) {
                        if (C24362h.m61206a(((C24602q) next).getName(), C23480p.f59269b)) {
                            arrayList8.add(next);
                        } else {
                            arrayList9.add(next);
                        }
                    }
                    Pair pair2 = new Pair(arrayList8, arrayList9);
                    List list3 = (List) pair2.mo59066a();
                    List<C24602q> list4 = (List) pair2.mo59067b();
                    list3.size();
                    C24602q qVar = (C24602q) C23825c.m58515l0(list3);
                    if (qVar != null) {
                        C23379w E = qVar.mo58517E();
                        if (E instanceof C24591f) {
                            C24591f fVar = (C24591f) E;
                            pair = new Pair(lazyJavaClassMemberScope3.f60684b.f60084e.mo59571c(fVar, b2, true), lazyJavaClassMemberScope3.f60684b.f60084e.mo59572d(fVar.mo58486B(), b2));
                        } else {
                            pair = new Pair(lazyJavaClassMemberScope3.f60684b.f60084e.mo59572d(E, b2), null);
                        }
                        aVar = b2;
                        arrayList = arrayList7;
                        bVar3 = a13;
                        lazyJavaClassMemberScope3.mo59545x(arrayList7, a13, 0, qVar, (C24307v) pair.mo59066a(), (C24307v) pair.mo59067b());
                    } else {
                        aVar = b2;
                        arrayList = arrayList7;
                        bVar3 = a13;
                    }
                    if (qVar != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i5 = 0;
                    for (C24602q qVar2 : list4) {
                        C24371a aVar2 = aVar;
                        int i6 = i5 + i;
                        lazyJavaClassMemberScope3.mo59545x(arrayList, bVar3, i6, qVar2, lazyJavaClassMemberScope3.f60684b.f60084e.mo59572d(qVar2.mo58517E(), aVar2), (C24307v) null);
                        i5++;
                        aVar = aVar2;
                    }
                    bVar2 = bVar3;
                    list = arrayList;
                } else {
                    list = Collections.emptyList();
                    bVar2 = a13;
                }
                bVar2.mo58953U0(false);
                C25478n g2 = cVar3.mo53429g();
                C24362h.m61210e(g2, "classDescriptor.visibility");
                if (C24362h.m61206a(g2, C23470j.f59255b)) {
                    g2 = C23470j.f59256c;
                    C24362h.m61210e(g2, "PROTECTED_AND_PACKAGE");
                }
                bVar2.mo53497Y0(list, g2);
                bVar2.mo58952T0(true);
                bVar2.mo59453V0(cVar3.mo53412q());
                C23598d dVar5 = lazyJavaClassMemberScope3.f60684b.f60080a.f60061g;
                C24592g gVar2 = lazyJavaClassMemberScope3.f60655o;
                ((C23598d.C23599a) dVar5).getClass();
                if (gVar2 != null) {
                    bVar = bVar2;
                } else {
                    C23598d.C23599a.m57786a(3);
                    throw null;
                }
            }
            list2 = C17875h.m44282F(bVar);
        }
        return C23825c.m58499K0(signatureEnhancement.mo59573a(dVar4, list2));
    }
}
