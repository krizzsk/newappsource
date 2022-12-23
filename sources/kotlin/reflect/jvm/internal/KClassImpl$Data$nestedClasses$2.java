package kotlin.reflect.jvm.internal;

import eh0.C23306d;
import eh0.C23312h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24979k;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25442g;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a6\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002 \u0004*\u001a\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, mo59060d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "T", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$nestedClasses$2 extends Lambda implements C24225a<List<? extends KClassImpl<? extends Object>>> {
    public final /* synthetic */ KClassImpl<T>.Data this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$nestedClasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.this$0 = data;
    }

    public final Object invoke() {
        C25432c cVar;
        Class<?> cls;
        KClassImpl kClassImpl;
        MemberScope X = this.this$0.mo59315a().mo53405X();
        C24362h.m61210e(X, "descriptor.unsubstitutedInnerClassesScope");
        Collection a = C23312h.C23313a.m57410a(X, (C23306d) null, 3);
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            if (!C25260c.m63396m((C25442g) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C25442g gVar = (C25442g) it.next();
            if (gVar instanceof C25432c) {
                cVar = (C25432c) gVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                cls = null;
            } else {
                cls = C24979k.m62680g(cVar);
            }
            if (cls == null) {
                kClassImpl = null;
            } else {
                kClassImpl = new KClassImpl(cls);
            }
            if (kClassImpl != null) {
                arrayList2.add(kClassImpl);
            }
        }
        return arrayList2;
    }
}
