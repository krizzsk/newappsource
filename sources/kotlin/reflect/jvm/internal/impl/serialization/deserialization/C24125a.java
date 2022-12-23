package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import eg0.C23295e;
import hh0.C23494g;
import hh0.C23505o;
import ih0.C23604b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kh0.C23788d;
import kh0.C23792h;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25066c;
import ug0.C25069e;
import yf0.C25299f;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25488w;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a */
public abstract class C24125a implements C25488w {

    /* renamed from: a */
    public final C23792h f61253a;

    /* renamed from: b */
    public final C23505o f61254b;

    /* renamed from: c */
    public final C25485t f61255c;

    /* renamed from: d */
    public C23494g f61256d;

    /* renamed from: e */
    public final C23788d<C25066c, C25486u> f61257e;

    public C24125a(LockBasedStorageManager lockBasedStorageManager, C23295e eVar, C23909c cVar) {
        this.f61253a = lockBasedStorageManager;
        this.f61254b = eVar;
        this.f61255c = cVar;
        this.f61257e = lockBasedStorageManager.mo59016a(new AbstractDeserializedPackageFragmentProvider$fragments$1(this));
    }

    /* renamed from: a */
    public final void mo53521a(C25066c cVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "fqName");
        C24361g.m61168j(this.f61257e.invoke(cVar), arrayList);
    }

    /* renamed from: b */
    public final List<C25486u> mo53522b(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return C17875h.m44282F(this.f61257e.invoke(cVar));
    }

    /* renamed from: c */
    public final boolean mo53523c(C25066c cVar) {
        Object obj;
        C24362h.m61211f(cVar, "fqName");
        if (((LockBasedStorageManager.C24147j) this.f61257e).mo60228b(cVar)) {
            obj = this.f61257e.invoke(cVar);
        } else {
            C25299f fVar = (C25299f) this;
            InputStream a = fVar.f61254b.mo58426a(cVar);
            if (a == null) {
                obj = null;
            } else {
                obj = C23604b.C23605a.m57790a(cVar, fVar.f61253a, fVar.f61255c, a, false);
            }
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final Collection<C25066c> mo53524n(C25066c cVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(lVar, "nameFilter");
        return EmptySet.f60175b;
    }
}
