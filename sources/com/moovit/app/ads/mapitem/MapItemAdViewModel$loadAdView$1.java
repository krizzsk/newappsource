package com.moovit.app.ads.mapitem;

import android.app.Application;
import android.view.View;
import androidx.lifecycle.C1040t;
import bf0.C21050d;
import com.moovit.ads.mapitem.C14709a;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p393bq.C13652a;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.ads.mapitem.MapItemAdViewModel$loadAdView$1", mo58555f = "MapItemAdViewModel.kt", mo58556l = {57}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class MapItemAdViewModel$loadAdView$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ C13652a $config;
    public int label;
    public final /* synthetic */ MapItemAdViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdViewModel$loadAdView$1(MapItemAdViewModel mapItemAdViewModel, C13652a aVar, C23349c<? super MapItemAdViewModel$loadAdView$1> cVar) {
        super(2, cVar);
        this.this$0 = mapItemAdViewModel;
        this.$config = aVar;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new MapItemAdViewModel$loadAdView$1(this.this$0, this.$config, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((MapItemAdViewModel$loadAdView$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            Application application = this.this$0.f3907b;
            C24362h.m61210e(application, "getApplication()");
            C13652a aVar = this.$config;
            this.label = 1;
            obj = C14709a.m37026b(application, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((C1040t) this.this$0.f37555d.getValue()).setValue((View) obj);
        return C21050d.f52856a;
    }
}
