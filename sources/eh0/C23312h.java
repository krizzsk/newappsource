package eh0;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25442g;

/* renamed from: eh0.h */
public interface C23312h {

    /* renamed from: eh0.h$a */
    public static final class C23313a {
        /* renamed from: a */
        public static Collection m57410a(C23312h hVar, C23306d dVar, int i) {
            C24236l<C25069e, Boolean> lVar;
            if ((i & 1) != 0) {
                dVar = C23306d.f59098m;
            }
            if ((i & 2) != 0) {
                MemberScope.f61214a.getClass();
                lVar = MemberScope.Companion.f61216b;
            } else {
                lVar = null;
            }
            return hVar.mo53492e(dVar, lVar);
        }
    }

    /* renamed from: e */
    Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar);

    /* renamed from: g */
    C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation);
}
