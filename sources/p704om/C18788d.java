package p704om;

import ce0.C21100e;
import com.masabi.justride.usagePeriodCalculator.UsagePeriodSpecificationException;
import java.util.TimeZone;
import p364al.C13487h;
import p445do.C16690b;
import p489fk.C17032a;
import p583jk.C17873f;
import p659mp.C18416b;
import p725pj.C18926a;
import p891wk.C20362q;
import p988j$.util.DesugarTimeZone;

/* renamed from: om.d */
public final class C18788d {

    /* renamed from: a */
    public final Object f47821a;

    /* renamed from: b */
    public final Object f47822b;

    /* renamed from: c */
    public final Object f47823c;

    /* renamed from: d */
    public final Object f47824d;

    public /* synthetic */ C18788d(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f47821a = obj;
        this.f47822b = obj2;
        this.f47823c = obj3;
        this.f47824d = obj4;
    }

    /* renamed from: a */
    public final C13487h mo51269a(C20362q qVar) {
        if (C21100e.m49352m0(qVar.f51585G)) {
            return new C13487h(null, (C18926a) null);
        }
        try {
            Long l = qVar.f51608n.f51511f;
            if (l == null) {
                l = Long.valueOf(((C16690b) this.f47822b).mo49402a());
            }
            long longValue = l.longValue();
            String str = qVar.f51585G;
            TimeZone timeZone = DesugarTimeZone.getTimeZone((String) this.f47824d);
            long longValue2 = qVar.f51606l.f51514a.longValue();
            long longValue3 = qVar.f51606l.f51515b.longValue();
            ((C18416b) this.f47821a).getClass();
            return new C13487h(C18416b.m45255b(longValue, str, timeZone, longValue2, longValue3), (C18926a) null);
        } catch (UsagePeriodSpecificationException e) {
            ((C17873f) this.f47823c).getClass();
            return new C13487h(null, new C17032a(C17873f.m44275b(e)));
        }
    }
}
