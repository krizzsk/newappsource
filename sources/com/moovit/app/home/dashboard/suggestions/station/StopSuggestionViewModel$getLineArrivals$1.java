package com.moovit.app.home.dashboard.suggestions.station;

import android.app.Application;
import androidx.lifecycle.C1040t;
import bf0.C21050d;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.transit.TransitStop;
import ff0.C23349c;
import gf0.C23413c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import p824tp.C19728f;
import p952yy.C20786b;
import p952yy.C20792f;
import p952yy.C20793g;
import q00.C19047a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.home.dashboard.suggestions.station.StopSuggestionViewModel$getLineArrivals$1", mo58555f = "StopSuggestionViewModel.kt", mo58556l = {}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopSuggestionViewModel$getLineArrivals$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ TransitStop $stop;
    public int label;
    public final /* synthetic */ StopSuggestionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionViewModel$getLineArrivals$1(StopSuggestionViewModel stopSuggestionViewModel, TransitStop transitStop, C23349c<? super StopSuggestionViewModel$getLineArrivals$1> cVar) {
        super(2, cVar);
        this.this$0 = stopSuggestionViewModel;
        this.$stop = transitStop;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new StopSuggestionViewModel$getLineArrivals$1(this.this$0, this.$stop, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StopSuggestionViewModel$getLineArrivals$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C17885a.m44475z0(obj);
            StopSuggestionViewModel stopSuggestionViewModel = this.this$0;
            TransitStop transitStop = this.$stop;
            stopSuggestionViewModel.getClass();
            try {
                Application application = stopSuggestionViewModel.f3907b;
                C24362h.m61210e(application, "getApplication()");
                C13752e g0 = C21100e.m49341g0(application);
                HashSet hashSet = C19728f.f50164e;
                C19728f fVar = (C19728f) application.getSystemService("metro_context");
                C19047a.C19048a aVar = C19047a.f48441d;
                C19047a aVar2 = (C19047a) application.getSystemService("user_configuration");
                C21100e.m49373x(fVar, "metroContext");
                C21100e.m49373x(aVar2, "configuration");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C20786b bVar = new C20786b();
                linkedHashSet.add(transitStop.f23730b);
                bVar.f52453g = true;
                obj2 = (C20793g) new C20792f(g0, fVar, aVar2, new ArrayList(linkedHashSet), bVar).mo52626J();
            } catch (Throwable th) {
                obj2 = C17885a.m44400G(th);
            }
            C1040t tVar = (C1040t) this.this$0.f38348d.getValue();
            if (obj2 instanceof Result.Failure) {
                obj2 = null;
            }
            C20793g gVar = (C20793g) obj2;
            if (gVar == null || (obj3 = gVar.f52481n) == null) {
                obj3 = EmptyList.f60173b;
            }
            tVar.postValue(obj3);
            return C21050d.f52856a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
