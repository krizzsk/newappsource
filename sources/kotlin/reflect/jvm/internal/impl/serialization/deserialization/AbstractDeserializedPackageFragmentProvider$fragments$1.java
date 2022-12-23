package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import hh0.C23494g;
import ih0.C23604b;
import java.io.InputStream;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;
import yf0.C25299f;
import zf0.C25486u;

final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends Lambda implements C24236l<C25066c, C25486u> {
    public final /* synthetic */ C24125a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(C24125a aVar) {
        super(1);
        this.this$0 = aVar;
    }

    public final Object invoke(Object obj) {
        C23604b bVar;
        C25066c cVar = (C25066c) obj;
        C24362h.m61211f(cVar, "fqName");
        C25299f fVar = (C25299f) this.this$0;
        fVar.getClass();
        InputStream a = fVar.f61254b.mo58426a(cVar);
        if (a == null) {
            bVar = null;
        } else {
            bVar = C23604b.C23605a.m57790a(cVar, fVar.f61253a, fVar.f61255c, a, false);
        }
        if (bVar == null) {
            return null;
        }
        C23494g gVar = this.this$0.f61256d;
        if (gVar != null) {
            bVar.mo60189N0(gVar);
            return bVar;
        }
        C24362h.m61217l("components");
        throw null;
    }
}
