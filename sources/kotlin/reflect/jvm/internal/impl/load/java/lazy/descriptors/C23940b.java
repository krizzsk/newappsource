package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cf0.C21136j;
import cf0.C21140n;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg0.C23777b;
import kg0.C23780d;
import kotlin.collections.C23825c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import lf0.C24236l;
import lg0.C24248a;
import lg0.C24250b;
import lg0.C24251c;
import mf0.C24362h;
import og0.C24592g;
import p389bl.C13637c;
import p583jk.C17875h;
import p626lf.C18201b;
import rh0.C24814b;
import ug0.C25069e;
import xg0.C25258b;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25491z;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b */
public final class C23940b extends C24251c {

    /* renamed from: n */
    public final C24592g f60708n;

    /* renamed from: o */
    public final LazyJavaClassDescriptor f60709o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23940b(C23780d dVar, C24592g gVar, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(dVar);
        C24362h.m61211f(gVar, "jClass");
        C24362h.m61211f(lazyJavaClassDescriptor, "ownerDescriptor");
        this.f60708n = gVar;
        this.f60709o = lazyJavaClassDescriptor;
    }

    /* renamed from: v */
    public static C25491z m59134v(C25491z zVar) {
        if (zVar.mo53433p().isReal()) {
            return zVar;
        }
        Collection<? extends C25491z> d = zVar.mo53440d();
        C24362h.m61210e(d, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(d, 10));
        for (C25491z zVar2 : d) {
            C24362h.m61210e(zVar2, "it");
            arrayList.add(m59134v(zVar2));
        }
        return (C25491z) C23825c.m58491C0(C23825c.m58499K0(C23825c.m58502N0(arrayList)));
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return null;
    }

    /* renamed from: h */
    public final Set<C25069e> mo59533h(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        return EmptySet.f60175b;
    }

    /* renamed from: i */
    public final Set<C25069e> mo59534i(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        Collection collection;
        C24362h.m61211f(dVar, "kindFilter");
        Set<C25069e> N0 = C23825c.m58502N0(((C24248a) this.f60687e.invoke()).mo59510a());
        C23940b u = C13637c.m34078u(this.f60709o);
        if (u == null) {
            collection = null;
        } else {
            collection = u.mo53530a();
        }
        if (collection == null) {
            collection = EmptySet.f60175b;
        }
        N0.addAll(collection);
        if (this.f60708n.mo59485w()) {
            N0.addAll(C17875h.m44281E(C23872e.f60323b, C23872e.f60322a));
        }
        N0.addAll(this.f60684b.f60080a.f60078x.mo53545d(this.f60709o));
        return N0;
    }

    /* renamed from: j */
    public final void mo59535j(ArrayList arrayList, C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        this.f60684b.f60080a.f60078x.mo53542a(this.f60709o, eVar, arrayList);
    }

    /* renamed from: k */
    public final C24248a mo59536k() {
        return new ClassDeclaredMemberIndex(this.f60708n, LazyJavaStaticClassScope$computeMemberIndex$1.f60704f);
    }

    /* renamed from: m */
    public final void mo59537m(LinkedHashSet linkedHashSet, C25069e eVar) {
        Collection collection;
        C24362h.m61211f(eVar, "name");
        C23940b u = C13637c.m34078u(this.f60709o);
        if (u == null) {
            collection = EmptySet.f60175b;
        } else {
            collection = C23825c.m58503O0(u.mo53531b(eVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        Collection collection2 = collection;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f60709o;
        C23777b bVar = this.f60684b.f60080a;
        linkedHashSet.addAll(C18201b.m44926w(eVar, collection2, linkedHashSet, lazyJavaClassDescriptor, bVar.f60060f, bVar.f60075u.mo60528a()));
        if (!this.f60708n.mo59485w()) {
            return;
        }
        if (C24362h.m61206a(eVar, C23872e.f60323b)) {
            linkedHashSet.add(C25258b.m63378d(this.f60709o));
        } else if (C24362h.m61206a(eVar, C23872e.f60322a)) {
            linkedHashSet.add(C25258b.m63379e(this.f60709o));
        }
    }

    /* renamed from: n */
    public final void mo59538n(ArrayList arrayList, C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f60709o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C24814b.m62344b(C17875h.m44280D(lazyJavaClassDescriptor), C23939a.f60707b, new C24250b(lazyJavaClassDescriptor, linkedHashSet, new C23938xd2f8c9a5(eVar)));
        if (!arrayList.isEmpty()) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor2 = this.f60709o;
            C23777b bVar = this.f60684b.f60080a;
            arrayList.addAll(C18201b.m44926w(eVar, linkedHashSet, arrayList, lazyJavaClassDescriptor2, bVar.f60060f, bVar.f60075u.mo60528a()));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            C25491z v = m59134v((C25491z) next);
            Object obj = linkedHashMap.get(v);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(v, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            LazyJavaClassDescriptor lazyJavaClassDescriptor3 = this.f60709o;
            C23777b bVar2 = this.f60684b.f60080a;
            C21140n.m49439a0(C18201b.m44926w(eVar, (Collection) value.getValue(), arrayList, lazyJavaClassDescriptor3, bVar2.f60060f, bVar2.f60075u.mo60528a()), arrayList2);
        }
        arrayList.addAll(arrayList2);
    }

    /* renamed from: o */
    public final Set mo59539o(C23306d dVar) {
        C24362h.m61211f(dVar, "kindFilter");
        Set<T> N0 = C23825c.m58502N0(((C24248a) this.f60687e.invoke()).mo59512c());
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.f60709o;
        C24814b.m62344b(C17875h.m44280D(lazyJavaClassDescriptor), C23939a.f60707b, new C24250b(lazyJavaClassDescriptor, N0, LazyJavaStaticClassScope$computePropertyNames$1$1.f60705f));
        return N0;
    }

    /* renamed from: q */
    public final C25442g mo59541q() {
        return this.f60709o;
    }
}
