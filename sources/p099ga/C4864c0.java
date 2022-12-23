package p099ga;

import p099ga.C4936u0;
import p112ha.C5199n0;
import p252sb.C6505e;
import p277ub.C6786k;

/* renamed from: ga.c0 */
public final /* synthetic */ class C4864c0 implements C6786k.C6787a {

    /* renamed from: a */
    public final /* synthetic */ int f16301a;

    /* renamed from: b */
    public final /* synthetic */ Object f16302b;

    /* renamed from: c */
    public final /* synthetic */ Object f16303c;

    public /* synthetic */ C4864c0(int i, Object obj, Object obj2) {
        this.f16301a = i;
        this.f16302b = obj;
        this.f16303c = obj2;
    }

    public final void invoke(Object obj) {
        switch (this.f16301a) {
            case 0:
                ((C4936u0.C4938b) obj).mo16427Q(((C4930r0) this.f16302b).f16682h, (C6505e) this.f16303c);
                return;
            case 1:
                ((C5199n0) obj).mo20931K();
                return;
            default:
                ((C5199n0) obj).onPlayerError();
                return;
        }
    }
}
