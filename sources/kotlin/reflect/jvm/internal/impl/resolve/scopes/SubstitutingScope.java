package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import bf0.C21049c;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C23812a;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24236l;
import lh0.C24287o0;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25441f0;
import zf0.C25442g;

public final class SubstitutingScope implements MemberScope {

    /* renamed from: b */
    public final MemberScope f61222b;

    /* renamed from: c */
    public final TypeSubstitutor f61223c;

    /* renamed from: d */
    public HashMap f61224d;

    /* renamed from: e */
    public final C21049c f61225e = C23812a.m58432b(new SubstitutingScope$_allDescriptors$2(this));

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        C24362h.m61211f(memberScope, "workerScope");
        C24362h.m61211f(typeSubstitutor, "givenSubstitutor");
        this.f61222b = memberScope;
        C24287o0 g = typeSubstitutor.mo60248g();
        C24362h.m61210e(g, "givenSubstitutor.substitution");
        this.f61223c = TypeSubstitutor.m60494e(CapturedTypeConstructorKt.m60271b(g));
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        return this.f61222b.mo53530a();
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo60184h(this.f61222b.mo53531b(eVar, noLookupLocation));
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo60184h(this.f61222b.mo53532c(eVar, noLookupLocation));
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        return this.f61222b.mo53533d();
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        return (Collection) this.f61225e.getValue();
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        return this.f61222b.mo53493f();
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C25437e g = this.f61222b.mo58433g(eVar, noLookupLocation);
        if (g == null) {
            return null;
        }
        return (C25437e) mo60185i(g);
    }

    /* renamed from: h */
    public final <D extends C25442g> Collection<D> mo60184h(Collection<? extends D> collection) {
        if (this.f61223c.mo60249h() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        int i = 3;
        if (size >= 3) {
            i = (size / 3) + size + 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(i);
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(mo60185i((C25442g) it.next()));
        }
        return linkedHashSet;
    }

    /* renamed from: i */
    public final <D extends C25442g> D mo60185i(D d) {
        if (this.f61223c.mo60249h()) {
            return d;
        }
        if (this.f61224d == null) {
            this.f61224d = new HashMap();
        }
        HashMap hashMap = this.f61224d;
        C24362h.m61208c(hashMap);
        D d2 = hashMap.get(d);
        if (d2 == null) {
            if (d instanceof C25441f0) {
                d2 = ((C25441f0) d).mo53408c(this.f61223c);
                if (d2 != null) {
                    hashMap.put(d, d2);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(C24362h.m61216k(d, "Unknown descriptor in scope: ").toString());
            }
        }
        return (C25442g) d2;
    }
}
