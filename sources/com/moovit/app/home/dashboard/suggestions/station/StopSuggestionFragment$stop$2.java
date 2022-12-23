package com.moovit.app.home.dashboard.suggestions.station;

import android.os.Bundle;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/moovit/transit/TransitStop;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class StopSuggestionFragment$stop$2 extends Lambda implements C24225a<TransitStop> {
    public final /* synthetic */ StopSuggestionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopSuggestionFragment$stop$2(StopSuggestionFragment stopSuggestionFragment) {
        super(0);
        this.this$0 = stopSuggestionFragment;
    }

    public final Object invoke() {
        Bundle arguments = this.this$0.getArguments();
        Object obj = arguments != null ? arguments.get("stop") : null;
        C24362h.m61209d(obj, "null cannot be cast to non-null type com.moovit.transit.TransitStop");
        return (TransitStop) obj;
    }
}
