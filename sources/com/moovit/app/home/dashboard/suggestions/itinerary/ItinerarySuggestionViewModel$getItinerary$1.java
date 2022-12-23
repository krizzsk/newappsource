package com.moovit.app.home.dashboard.suggestions.itinerary;

import android.app.Application;
import androidx.lifecycle.C1040t;
import bf0.C21050d;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import e20.C16788m;
import e20.C16789n;
import ff0.C23349c;
import gf0.C23413c;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import p589jq.C17909a;
import p646lz.C18299a;
import p716oy.C18860a;
import p824tp.C19728f;
import p977zz.C20961r;
import q00.C19047a;
import v90.C13187a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionViewModel$getItinerary$1", mo58555f = "ItinerarySuggestionViewModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class ItinerarySuggestionViewModel$getItinerary$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ LocationDescriptor $destination;
    public int label;
    public final /* synthetic */ ItinerarySuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItinerarySuggestionViewModel$getItinerary$1(ItinerarySuggestionViewModel itinerarySuggestionViewModel, LocationDescriptor locationDescriptor, C23349c<? super ItinerarySuggestionViewModel$getItinerary$1> cVar) {
        super(2, cVar);
        this.this$0 = itinerarySuggestionViewModel;
        this.$destination = locationDescriptor;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new ItinerarySuggestionViewModel$getItinerary$1(this.this$0, this.$destination, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ItinerarySuggestionViewModel$getItinerary$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            ItinerarySuggestionViewModel itinerarySuggestionViewModel = this.this$0;
            LocationDescriptor locationDescriptor = this.$destination;
            itinerarySuggestionViewModel.getClass();
            try {
                Application application = itinerarySuggestionViewModel.f3907b;
                C24362h.m61210e(application, "getApplication()");
                C18299a X = C21100e.m49329X(application);
                LatLonE6 j = LatLonE6.m40177j(C21100e.m49339f0(application));
                C13187a aVar = (C13187a) X.mo50700l("TRIP_PLANNER_CONFIGURATION");
                C13752e g0 = C21100e.m49341g0(application);
                HashSet hashSet = C19728f.f50164e;
                C19047a.C19048a aVar2 = C19047a.f48441d;
                obj2 = (C16789n) new C16788m(g0, (C19728f) application.getSystemService("metro_context"), (C19047a) application.getSystemService("user_configuration"), TripPlannerTime.m17899f(), aVar.mo40061b(), aVar.mo40063d(), aVar.mo40060a(), ((C17909a) X.mo50700l("ACCESSIBILITY_CONFIGURATION")).mo50463a(), LocationDescriptor.m17770k(j), locationDescriptor, C18860a.m45884a().f48028p).mo52626J();
            } catch (Throwable th) {
                obj2 = C17885a.m44400G(th);
            }
            ItinerarySuggestionViewModel itinerarySuggestionViewModel2 = this.this$0;
            if (!(obj2 instanceof Result.Failure)) {
                ((C1040t) itinerarySuggestionViewModel2.f38326d.getValue()).postValue(new C20961r(((C16789n) obj2).f43705m));
            }
            ItinerarySuggestionViewModel itinerarySuggestionViewModel3 = this.this$0;
            Throwable a = Result.m58423a(obj2);
            if (a != null) {
                ((C1040t) itinerarySuggestionViewModel3.f38326d.getValue()).postValue(new C20961r(new Exception(a)));
            }
            return C21050d.f52856a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
