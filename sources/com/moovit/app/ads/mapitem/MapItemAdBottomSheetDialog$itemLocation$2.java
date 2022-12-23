package com.moovit.app.ads.mapitem;

import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/moovit/commons/geo/LatLonE6;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class MapItemAdBottomSheetDialog$itemLocation$2 extends Lambda implements C24225a<LatLonE6> {
    public final /* synthetic */ MapItemAdBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdBottomSheetDialog$itemLocation$2(MapItemAdBottomSheetDialog mapItemAdBottomSheetDialog) {
        super(0);
        this.this$0 = mapItemAdBottomSheetDialog;
    }

    public final Object invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable("itemLocation");
        C24362h.m61208c(parcelable);
        return (LatLonE6) parcelable;
    }
}
