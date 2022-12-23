package com.moovit.app.home.dashboard.suggestions.station;

import bf0.C21050d;
import cf0.C21136j;
import cf0.C21139m;
import com.moovit.app.home.dashboard.suggestions.station.StopSuggestionFragment;
import com.moovit.database.DbEntityRef;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p640lt.C18275a;
import p952yy.C20787c;
import p977zz.C20944i0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"", "Lyy/c;", "kotlin.jvm.PlatformType", "lineArrivals", "Lbf0/d;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopSuggestionFragment$onViewCreated$1 extends Lambda implements C24236l<List<? extends C20787c>, C21050d> {
    public final /* synthetic */ StopSuggestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionFragment$onViewCreated$1(StopSuggestionFragment stopSuggestionFragment) {
        super(1);
        this.this$0 = stopSuggestionFragment;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        List list = (List) obj;
        StopSuggestionFragment stopSuggestionFragment = this.this$0;
        C24362h.m61210e(list, "lineArrivals");
        int i = StopSuggestionFragment.f38338s;
        stopSuggestionFragment.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            TransitLine transitLine = null;
            if (!it.hasNext()) {
                break;
            }
            C20787c cVar = (C20787c) it.next();
            DbEntityRef<TransitLine> b = stopSuggestionFragment.mo45186m2().mo24410b(cVar.f52456a);
            if (b != null) {
                transitLine = b.get();
            }
            if (transitLine != null) {
                arrayList.add(new C20944i0(transitLine, cVar.f52458c));
            }
        }
        if (arrayList.isEmpty()) {
            List<DbEntityRef<TransitLine>> list2 = stopSuggestionFragment.mo45186m2().f23735g;
            C24362h.m61210e(list2, "stop.lineRefs");
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(list2, 10));
            for (DbEntityRef dbEntityRef : list2) {
                arrayList2.add(new C20944i0(dbEntityRef.get(), Schedule.f23657c));
            }
            arrayList.addAll(arrayList2);
        }
        Schedule.C7799d D = Schedule.m17782D();
        if (stopSuggestionFragment.mo46775H1()) {
            obj2 = new StopSuggestionFragment$getNextArrivalComparator$1(stopSuggestionFragment, D);
        } else {
            obj2 = new StopSuggestionFragment$getNextArrivalComparator$2(D);
        }
        C21139m.m49437Y(arrayList, new C18275a(obj2, 2));
        StopSuggestionFragment.C14980a aVar = stopSuggestionFragment.f38343r;
        if (aVar != null) {
            aVar.f38344g = arrayList;
            aVar.notifyDataSetChanged();
            return C21050d.f52856a;
        }
        C24362h.m61217l("adapter");
        throw null;
    }
}
