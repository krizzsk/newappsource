package com.moovit.app.tod.center;

import android.content.Context;
import bf0.C21050d;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.tranzmate.R;
import ff0.C23349c;
import gf0.C23413c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import o00.C18676l;
import p430cx.C16519a;
import p430cx.C16520b;
import p430cx.C16521c;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.tod.center.TodCenterViewModel$createSections$2", mo58555f = "TodCenterViewModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Ljava/util/ArrayList;", "Lo00/l$b;", "Lcom/moovit/app/tod/model/TodRide;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class TodCenterViewModel$createSections$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super ArrayList<C18676l.C18678b<TodRide>>>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List<TodRide> $rides;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodCenterViewModel$createSections$2(Context context, List list, C23349c cVar) {
        super(2, cVar);
        this.$rides = list;
        this.$context = context;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new TodCenterViewModel$createSections$2(this.$context, this.$rides, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((TodCenterViewModel$createSections$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            if (this.$rides.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(this.$rides);
            String string = this.$context.getString(R.string.tod_passenger_rides_center_historical_section);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean z3 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TodRideStatus todRideStatus = ((TodRide) next).f40266d;
                if (!(todRideStatus == TodRideStatus.FUTURE || todRideStatus == TodRideStatus.ACTIVE)) {
                    z3 = true;
                }
                if (z3) {
                    arrayList2.add(next);
                }
            }
            C18676l.C18678b bVar = new C18676l.C18678b(string, C23825c.m58496H0(arrayList2, new C16519a(TodCenterViewModel$createSections$2$historicalRides$2.f40200f)));
            String string2 = this.$context.getString(R.string.tod_passenger_rides_center_future_section);
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((TodRide) next2).f40266d == TodRideStatus.FUTURE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList3.add(next2);
                }
            }
            C18676l.C18678b bVar2 = new C18676l.C18678b(string2, C23825c.m58496H0(arrayList3, new C16520b(TodCenterViewModel$createSections$2$futureRides$2.f40199f)));
            String string3 = this.$context.getString(R.string.tod_passenger_rides_center_active_section);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                if (((TodRide) next3).f40266d == TodRideStatus.ACTIVE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList4.add(next3);
                }
            }
            C18676l.C18678b bVar3 = new C18676l.C18678b(string3, C23825c.m58496H0(arrayList4, new C16521c(TodCenterViewModel$createSections$2$activeRides$2.f40198f)));
            ArrayList arrayList5 = new ArrayList(3);
            if (!bVar3.isEmpty()) {
                arrayList5.add(bVar3);
            }
            if (!bVar2.isEmpty()) {
                arrayList5.add(bVar2);
            }
            if (!bVar.isEmpty()) {
                arrayList5.add(bVar);
            }
            return arrayList5;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
