package p660mq;

import com.moovit.app.MoovitAppActivity;
import com.moovit.genies.Genie;
import com.moovit.network.model.ServerId;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.collections.EmptyList;
import p389bl.C13637c;
import p583jk.C17875h;
import p660mq.C18421e;

/* renamed from: mq.c */
public abstract class C18419c<A extends MoovitAppActivity> extends C18421e<A> {
    public C18419c(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public final Genie mo50869A2() {
        return Genie.LINE_VIEW_LIVE_LOCATION;
    }

    /* renamed from: C2 */
    public final String mo50870C2() {
        ServerId F2 = mo50873F2();
        ServerId E2 = mo50872E2();
        StringBuilder sb = new StringBuilder();
        sb.append(F2);
        sb.append('_');
        sb.append(E2);
        return sb.toString();
    }

    /* renamed from: E2 */
    public abstract ServerId mo50872E2();

    /* renamed from: F2 */
    public abstract ServerId mo50873F2();

    /* renamed from: z2 */
    public final C18421e.C18422a mo50871z2() {
        ServerId F2 = mo50873F2();
        ServerId E2 = mo50872E2();
        StringBuilder sb = new StringBuilder();
        sb.append(F2);
        sb.append('_');
        sb.append(E2);
        String sb2 = sb.toString();
        if (F2 == null || E2 == null) {
            return new C18421e.C18422a(C23826d.m58530U(), EmptyList.f60173b, sb2);
        }
        return new C18421e.C18422a(C13637c.m34046A(new Pair(F2, C17875h.m44280D(E2))), C17875h.m44280D(F2), sb2);
    }
}
