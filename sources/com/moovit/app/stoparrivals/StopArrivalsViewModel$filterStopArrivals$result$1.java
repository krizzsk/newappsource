package com.moovit.app.stoparrivals;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "it", "Lcom/moovit/app/stoparrivals/StopArrival;", "invoke", "(Lcom/moovit/app/stoparrivals/StopArrival;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$filterStopArrivals$result$1 extends Lambda implements C24236l<StopArrival, Boolean> {
    public final /* synthetic */ long $now;
    public final /* synthetic */ C15322a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsViewModel$filterStopArrivals$result$1(C15322a aVar, long j) {
        super(1);
        this.this$0 = aVar;
        this.$now = j;
    }

    public final Object invoke(Object obj) {
        StopArrival stopArrival = (StopArrival) obj;
        C24362h.m61211f(stopArrival, "it");
        long j = this.this$0.f39631c;
        long g = stopArrival.f39600c.mo24631g() - this.$now;
        boolean z = false;
        if (0 <= g && g <= j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
