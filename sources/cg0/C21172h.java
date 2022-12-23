package cg0;

import ag0.C20989e;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import lf0.C24225a;
import lh0.C24274i0;
import lh0.C24312z;
import mf0.C24362h;
import ug0.C25069e;

/* renamed from: cg0.h */
public final class C21172h implements C24225a<C24312z> {

    /* renamed from: b */
    public final /* synthetic */ C25069e f53069b;

    /* renamed from: c */
    public final /* synthetic */ C21174i f53070c;

    public C21172h(C21174i iVar, C25069e eVar) {
        this.f53070c = iVar;
        this.f53069b = eVar;
    }

    public final Object invoke() {
        C20989e.C20990a.C20991a aVar = C20989e.C20990a.f52739a;
        C24274i0 j = this.f53070c.mo53481j();
        List emptyList = Collections.emptyList();
        C21170g gVar = new C21170g(this);
        LockBasedStorageManager.C24137a aVar2 = LockBasedStorageManager.f61310e;
        C24362h.m61210e(aVar2, "NO_LOCKS");
        return KotlinTypeFactory.m60479h(emptyList, aVar, new LazyScopeAdapter(aVar2, gVar), j, false);
    }
}
