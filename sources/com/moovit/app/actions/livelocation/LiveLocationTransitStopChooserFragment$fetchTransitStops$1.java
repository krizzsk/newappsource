package com.moovit.app.actions.livelocation;

import ff0.C23349c;
import gf0.C23413c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@C23413c(mo58554c = "com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment", mo58555f = "LiveLocationTransitStopChooserFragment.kt", mo58556l = {105, 107}, mo58557m = "fetchTransitStops")
@Metadata(mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class LiveLocationTransitStopChooserFragment$fetchTransitStops$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ LiveLocationTransitStopChooserFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveLocationTransitStopChooserFragment$fetchTransitStops$1(LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment, C23349c<? super LiveLocationTransitStopChooserFragment$fetchTransitStops$1> cVar) {
        super(cVar);
        this.this$0 = liveLocationTransitStopChooserFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return LiveLocationTransitStopChooserFragment.m37059S1(this.this$0, (List) null, this);
    }
}
