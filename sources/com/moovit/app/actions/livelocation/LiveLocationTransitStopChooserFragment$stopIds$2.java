package com.moovit.app.actions.livelocation;

import android.os.Bundle;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/moovit/network/model/ServerId;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class LiveLocationTransitStopChooserFragment$stopIds$2 extends Lambda implements C24225a<ArrayList<ServerId>> {
    public final /* synthetic */ LiveLocationTransitStopChooserFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveLocationTransitStopChooserFragment$stopIds$2(LiveLocationTransitStopChooserFragment liveLocationTransitStopChooserFragment) {
        super(0);
        this.this$0 = liveLocationTransitStopChooserFragment;
    }

    public final Object invoke() {
        ArrayList parcelableArrayList;
        Bundle arguments = this.this$0.getArguments();
        if (arguments != null && (parcelableArrayList = arguments.getParcelableArrayList("stopIds")) != null) {
            return parcelableArrayList;
        }
        throw new IllegalStateException("Did you called LiveLocationTransitStopChooserFragment.newInstance(...)?");
    }
}
