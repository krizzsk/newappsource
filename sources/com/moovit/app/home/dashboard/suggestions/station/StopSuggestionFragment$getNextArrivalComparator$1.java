package com.moovit.app.home.dashboard.suggestions.station;

import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import mf0.C24362h;
import p455dy.C16753e;
import p977zz.C20944i0;
import p977zz.C20975x0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"Lzz/i0;", "Lcom/moovit/transit/TransitLine;", "Lcom/moovit/transit/Schedule;", "lhs", "rhs", "", "invoke", "(Lzz/i0;Lzz/i0;)Ljava/lang/Integer;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopSuggestionFragment$getNextArrivalComparator$1 extends Lambda implements C24240p<C20944i0<TransitLine, Schedule>, C20944i0<TransitLine, Schedule>, Integer> {
    public final /* synthetic */ Comparator<Schedule> $scheduleComparator;
    public final /* synthetic */ StopSuggestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionFragment$getNextArrivalComparator$1(StopSuggestionFragment stopSuggestionFragment, Schedule.C7799d dVar) {
        super(2);
        this.this$0 = stopSuggestionFragment;
        this.$scheduleComparator = dVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C20944i0 i0Var = (C20944i0) obj;
        C20944i0 i0Var2 = (C20944i0) obj2;
        C24362h.m61211f(i0Var, "lhs");
        C24362h.m61211f(i0Var2, "rhs");
        C16753e eVar = this.this$0.f38342q;
        if (eVar != null) {
            boolean z = !eVar.mo49441p(((TransitLine) i0Var.f52692a).mo24369b().f23694b);
            C16753e eVar2 = this.this$0.f38342q;
            if (eVar2 != null) {
                int a = C20975x0.m49114a(z ? 1 : 0, eVar2.mo49441p(((TransitLine) i0Var2.f52692a).mo24369b().f23694b) ^ true ? 1 : 0);
                if (a == 0) {
                    a = this.$scheduleComparator.compare(i0Var.f52693b, i0Var2.f52693b);
                }
                return Integer.valueOf(a);
            }
            C24362h.m61217l("favoritesManager");
            throw null;
        }
        C24362h.m61217l("favoritesManager");
        throw null;
    }
}
