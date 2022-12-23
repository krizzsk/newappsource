package com.moovit.app.actions.livelocation;

import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment;
import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$onViewCreated$1", mo58555f = "LiveLocationTransitStopChooserFragment.kt", mo58556l = {81}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class LiveLocationTransitStopChooserFragment$onViewCreated$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public final /* synthetic */ RecyclerView $recyclerView;
    public int label;
    public final /* synthetic */ LiveLocationTransitStopChooserFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveLocationTransitStopChooserFragment$onViewCreated$1(LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment, RecyclerView recyclerView, C23349c<? super LiveLocationTransitStopChooserFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = liveLocationTransitStopChooserFragment;
        this.$recyclerView = recyclerView;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new LiveLocationTransitStopChooserFragment$onViewCreated$1(this.this$0, this.$recyclerView, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LiveLocationTransitStopChooserFragment$onViewCreated$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C17885a.m44475z0(obj);
            LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment = this.this$0;
            Object value = liveLocationTransitStopChooserFragment.f37424i.getValue();
            C24362h.m61210e(value, "<get-stopIds>(...)");
            this.label = 1;
            obj = LiveLocationTransitStopChooserFragment.m37059S1(liveLocationTransitStopChooserFragment, (List) value, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C17885a.m44475z0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$recyclerView.setAdapter(new LiveLocationTransitStopChooserFragment.C14717a((List) obj, this.this$0.f37423h));
        return C21050d.f52856a;
    }
}
