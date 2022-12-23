package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cg0.C21171g0;
import cg0.C21174i;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.share.Constants;
import eg0.C23298h;
import eh0.C23306d;
import eh0.C23311g;
import ig0.C23600e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg0.C23780d;
import kh0.C23787c;
import kh0.C23788d;
import kh0.C23789e;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import lg0.C24248a;
import lh0.C24307v;
import mf0.C24362h;
import mf0.C24365j;
import mg0.C24372b;
import og0.C24602q;
import og0.C24609x;
import p389bl.C13637c;
import p584jl.C17885a;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25069e;
import xg0.C25258b;
import zf0.C25433c0;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25478n;
import zf0.C25491z;

public abstract class LazyJavaScope extends C23311g {

    /* renamed from: m */
    public static final /* synthetic */ C24866j<Object>[] f60683m;

    /* renamed from: b */
    public final C23780d f60684b;

    /* renamed from: c */
    public final LazyJavaScope f60685c;

    /* renamed from: d */
    public final C23789e<Collection<C25442g>> f60686d;

    /* renamed from: e */
    public final C23789e<C24248a> f60687e;

    /* renamed from: f */
    public final C23787c<C25069e, Collection<C23903e>> f60688f;

    /* renamed from: g */
    public final C23788d<C25069e, C25491z> f60689g;

    /* renamed from: h */
    public final C23787c<C25069e, Collection<C23903e>> f60690h;

    /* renamed from: i */
    public final C23789e f60691i;

    /* renamed from: j */
    public final C23789e f60692j;

    /* renamed from: k */
    public final C23789e f60693k;

    /* renamed from: l */
    public final C23787c<C25069e, List<C25491z>> f60694l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$a */
    public static final class C23936a {

        /* renamed from: a */
        public final C24307v f60695a;

        /* renamed from: b */
        public final C24307v f60696b = null;

        /* renamed from: c */
        public final List<C25452k0> f60697c;

        /* renamed from: d */
        public final List<C25448i0> f60698d;

        /* renamed from: e */
        public final boolean f60699e;

        /* renamed from: f */
        public final List<String> f60700f;

        public C23936a(List list, ArrayList arrayList, List list2, C24307v vVar) {
            C24362h.m61211f(vVar, "returnType");
            C24362h.m61211f(list, "valueParameters");
            C24362h.m61211f(list2, "errors");
            this.f60695a = vVar;
            this.f60697c = list;
            this.f60698d = arrayList;
            this.f60699e = false;
            this.f60700f = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23936a)) {
                return false;
            }
            C23936a aVar = (C23936a) obj;
            return C24362h.m61206a(this.f60695a, aVar.f60695a) && C24362h.m61206a(this.f60696b, aVar.f60696b) && C24362h.m61206a(this.f60697c, aVar.f60697c) && C24362h.m61206a(this.f60698d, aVar.f60698d) && this.f60699e == aVar.f60699e && C24362h.m61206a(this.f60700f, aVar.f60700f);
        }

        public final int hashCode() {
            int hashCode = this.f60695a.hashCode() * 31;
            C24307v vVar = this.f60696b;
            int hashCode2 = vVar == null ? 0 : vVar.hashCode();
            int hashCode3 = (this.f60698d.hashCode() + ((this.f60697c.hashCode() + ((hashCode + hashCode2) * 31)) * 31)) * 31;
            boolean z = this.f60699e;
            if (z) {
                z = true;
            }
            return this.f60700f.hashCode() + ((hashCode3 + (z ? 1 : 0)) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("MethodSignatureData(returnType=");
            k.append(this.f60695a);
            k.append(", receiverType=");
            k.append(this.f60696b);
            k.append(", valueParameters=");
            k.append(this.f60697c);
            k.append(", typeParameters=");
            k.append(this.f60698d);
            k.append(", hasStableParameterNames=");
            k.append(this.f60699e);
            k.append(", errors=");
            return C13555b.m33970i(k, this.f60700f, ')');
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b */
    public static final class C23937b {

        /* renamed from: a */
        public final List<C25452k0> f60701a;

        /* renamed from: b */
        public final boolean f60702b;

        public C23937b(List<? extends C25452k0> list, boolean z) {
            C24362h.m61211f(list, "descriptors");
            this.f60701a = list;
            this.f60702b = z;
        }
    }

    static {
        Class<LazyJavaScope> cls = LazyJavaScope.class;
        f60683m = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public LazyJavaScope(C23780d dVar, LazyJavaScope lazyJavaScope) {
        C24362h.m61211f(dVar, Constants.URL_CAMPAIGN);
        this.f60684b = dVar;
        this.f60685c = lazyJavaScope;
        this.f60686d = dVar.f60080a.f60055a.mo59021f(EmptyList.f60173b, new LazyJavaScope$allDescriptors$1(this));
        this.f60687e = dVar.f60080a.f60055a.mo59019d(new LazyJavaScope$declaredMemberIndex$1(this));
        this.f60688f = dVar.f60080a.f60055a.mo59020e(new LazyJavaScope$declaredFunctions$1(this));
        this.f60689g = dVar.f60080a.f60055a.mo59016a(new LazyJavaScope$declaredField$1(this));
        this.f60690h = dVar.f60080a.f60055a.mo59020e(new LazyJavaScope$functions$1(this));
        this.f60691i = dVar.f60080a.f60055a.mo59019d(new LazyJavaScope$functionNamesLazy$2(this));
        this.f60692j = dVar.f60080a.f60055a.mo59019d(new LazyJavaScope$propertyNamesLazy$2(this));
        this.f60693k = dVar.f60080a.f60055a.mo59019d(new LazyJavaScope$classNamesLazy$2(this));
        this.f60694l = dVar.f60080a.f60055a.mo59020e(new LazyJavaScope$properties$1(this));
    }

    /* renamed from: l */
    public static C24307v m59113l(C24602q qVar, C23780d dVar) {
        C24362h.m61211f(qVar, "method");
        return dVar.f60084e.mo59572d(qVar.mo58517E(), C24372b.m61251b(TypeUsage.COMMON, qVar.mo58515l().mo59478m(), (C21174i) null, 2));
    }

    /* JADX WARNING: type inference failed for: r8v7, types: [og0.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.C23937b m59114u(kg0.C23780d r19, kotlin.reflect.jvm.internal.impl.descriptors.impl.C23907b r20, java.util.List r21) {
        /*
            r0 = r19
            java.lang.String r1 = "jValueParameters"
            r2 = r21
            mf0.C24362h.m61211f(r2, r1)
            cf0.s r1 = kotlin.collections.C23825c.m58504P0(r21)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = cf0.C21136j.m49436X(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r5 = 0
        L_0x001e:
            r6 = r1
            cf0.t r6 = (cf0.C21146t) r6
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0100
            java.lang.Object r6 = r6.next()
            cf0.r r6 = (cf0.C21144r) r6
            int r10 = r6.f53001a
            T r6 = r6.f53002b
            og0.z r6 = (og0.C24611z) r6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r11 = p389bl.C13637c.m34049D(r0, r6)
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r7 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r8 = 3
            r9 = 0
            mg0.a r7 = mg0.C24372b.m61251b(r7, r4, r9, r8)
            boolean r8 = r6.mo58537b()
            r12 = 1
            if (r8 == 0) goto L_0x0077
            og0.w r8 = r6.getType()
            boolean r13 = r8 instanceof og0.C24591f
            if (r13 == 0) goto L_0x0051
            r9 = r8
            og0.f r9 = (og0.C24591f) r9
        L_0x0051:
            if (r9 == 0) goto L_0x006b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r8 = r0.f60084e
            lh0.u0 r7 = r8.mo59571c(r9, r7, r12)
            kg0.b r8 = r0.f60080a
            zf0.t r8 = r8.f60069o
            kotlin.reflect.jvm.internal.impl.builtins.c r8 = r8.mo59460m()
            lh0.v r8 = r8.mo59384g(r7)
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r7, r8)
            goto L_0x0087
        L_0x006b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Vararg parameter should be an array: "
            java.lang.String r1 = mf0.C24362h.m61216k(r6, r1)
            r0.<init>(r1)
            throw r0
        L_0x0077:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r8 = r0.f60084e
            og0.w r13 = r6.getType()
            lh0.v r7 = r8.mo59572d(r13, r7)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r7, r9)
            r9 = r8
        L_0x0087:
            java.lang.Object r7 = r9.mo59066a()
            r13 = r7
            lh0.v r13 = (lh0.C24307v) r13
            java.lang.Object r7 = r9.mo59067b()
            r17 = r7
            lh0.v r17 = (lh0.C24307v) r17
            ug0.e r7 = r20.getName()
            java.lang.String r7 = r7.mo61604f()
            java.lang.String r8 = "equals"
            boolean r7 = mf0.C24362h.m61206a(r7, r8)
            if (r7 == 0) goto L_0x00c5
            int r7 = r21.size()
            if (r7 != r12) goto L_0x00c5
            kg0.b r7 = r0.f60080a
            zf0.t r7 = r7.f60069o
            kotlin.reflect.jvm.internal.impl.builtins.c r7 = r7.mo59460m()
            lh0.z r7 = r7.mo59393p()
            boolean r7 = mf0.C24362h.m61206a(r7, r13)
            if (r7 == 0) goto L_0x00c5
            java.lang.String r7 = "other"
            ug0.e r7 = ug0.C25069e.m62820i(r7)
            goto L_0x00dc
        L_0x00c5:
            ug0.e r7 = r6.getName()
            if (r7 != 0) goto L_0x00cc
            r5 = 1
        L_0x00cc:
            if (r7 != 0) goto L_0x00dc
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            java.lang.String r8 = "p"
            java.lang.String r7 = mf0.C24362h.m61216k(r7, r8)
            ug0.e r7 = ug0.C25069e.m62820i(r7)
        L_0x00dc:
            r12 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d r15 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d
            r9 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            kg0.b r7 = r0.f60080a
            ng0.b r7 = r7.f60064j
            eg0.h$a r6 = r7.mo58430a(r6)
            r7 = r15
            r8 = r20
            r4 = r15
            r15 = r16
            r16 = r18
            r18 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r3.add(r4)
            r4 = 0
            goto L_0x001e
        L_0x0100:
            java.util.List r0 = kotlin.collections.C23825c.m58499K0(r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.m59114u(kg0.d, kotlin.reflect.jvm.internal.impl.descriptors.impl.b, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope$b");
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        return (Set) C19958a.m47435j(this.f60691i, f60683m[0]);
    }

    /* renamed from: b */
    public Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (!mo53530a().contains(eVar)) {
            return EmptyList.f60173b;
        }
        return (Collection) ((LockBasedStorageManager.C24148k) this.f60690h).invoke(eVar);
    }

    /* renamed from: c */
    public Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (!mo53533d().contains(eVar)) {
            return EmptyList.f60173b;
        }
        return (Collection) ((LockBasedStorageManager.C24148k) this.f60694l).invoke(eVar);
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        return (Set) C19958a.m47435j(this.f60692j, f60683m[1]);
    }

    /* renamed from: e */
    public Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        return (Collection) this.f60686d.invoke();
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        return (Set) C19958a.m47435j(this.f60693k, f60683m[2]);
    }

    /* renamed from: h */
    public abstract Set<C25069e> mo59533h(C23306d dVar, C24236l<? super C25069e, Boolean> lVar);

    /* renamed from: i */
    public abstract Set<C25069e> mo59534i(C23306d dVar, C24236l<? super C25069e, Boolean> lVar);

    /* renamed from: j */
    public void mo59535j(ArrayList arrayList, C25069e eVar) {
        C24362h.m61211f(eVar, "name");
    }

    /* renamed from: k */
    public abstract C24248a mo59536k();

    /* renamed from: m */
    public abstract void mo59537m(LinkedHashSet linkedHashSet, C25069e eVar);

    /* renamed from: n */
    public abstract void mo59538n(ArrayList arrayList, C25069e eVar);

    /* renamed from: o */
    public abstract Set mo59539o(C23306d dVar);

    /* renamed from: p */
    public abstract C25433c0 mo59540p();

    /* renamed from: q */
    public abstract C25442g mo59541q();

    /* renamed from: r */
    public boolean mo59542r(JavaMethodDescriptor javaMethodDescriptor) {
        return true;
    }

    /* renamed from: s */
    public abstract C23936a mo59543s(C24602q qVar, ArrayList arrayList, C24307v vVar, List list);

    /* renamed from: t */
    public final JavaMethodDescriptor mo59551t(C24602q qVar) {
        boolean z;
        C21171g0 g0Var;
        Map map;
        C24602q qVar2 = qVar;
        C24362h.m61211f(qVar2, "method");
        LazyJavaAnnotations D = C13637c.m34049D(this.f60684b, qVar2);
        C25442g q = mo59541q();
        C25069e name = qVar.getName();
        C23298h.C23299a a = this.f60684b.f60080a.f60064j.mo58430a(qVar2);
        if (((C24248a) this.f60687e.invoke()).mo59513d(qVar.getName()) == null || !qVar.mo58520h().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        JavaMethodDescriptor b1 = JavaMethodDescriptor.m59002b1(q, D, name, a, z);
        C23780d dVar = this.f60684b;
        C24362h.m61211f(dVar, "<this>");
        C23780d dVar2 = new C23780d(dVar.f60080a, new LazyJavaTypeParameterResolver(dVar, b1, qVar2, 0), dVar.f60082c);
        ArrayList<C24609x> typeParameters = qVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(typeParameters, 10));
        for (C24609x a2 : typeParameters) {
            C25448i0 a3 = dVar2.f60081b.mo59013a(a2);
            C24362h.m61208c(a3);
            arrayList.add(a3);
        }
        C23937b u = m59114u(dVar2, b1, qVar.mo58520h());
        C23936a s = mo59543s(qVar2, arrayList, m59113l(qVar2, dVar2), u.f60701a);
        C24307v vVar = s.f60696b;
        if (vVar == null) {
            g0Var = null;
        } else {
            g0Var = C25258b.m63380f(b1, vVar, C20989e.C20990a.f52739a);
        }
        C25433c0 p = mo59540p();
        List<C25448i0> list = s.f60698d;
        List<C25452k0> list2 = s.f60697c;
        C24307v vVar2 = s.f60695a;
        Modality.Companion.getClass();
        Modality a4 = Modality.C23887a.m58738a(false, qVar.mo58506A(), !qVar.mo58507G());
        C25478n A0 = C17885a.m44389A0(qVar.mo58511g());
        if (s.f60696b != null) {
            map = C13637c.m34046A(new Pair(JavaMethodDescriptor.f60601G, C23825c.m58513j0(u.f60701a)));
        } else {
            map = C23826d.m58530U();
        }
        b1.mo53472a1(g0Var, p, list, list2, vVar2, a4, A0, map);
        b1.mo59506c1(s.f60699e, u.f60702b);
        if (!(!s.f60700f.isEmpty())) {
            return b1;
        }
        C23600e eVar = dVar2.f60080a.f60059e;
        List<String> list3 = s.f60700f;
        ((C23600e.C23601a) eVar).getClass();
        if (list3 == null) {
            C23600e.C23601a.m57787a(6);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return C24362h.m61216k(mo59541q(), "Lazy scope for ");
    }
}
