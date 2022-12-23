package com.moovit.app.stoparrivals;

import androidx.fragment.app.Fragment;
import com.moovit.map.MapFragment;
import com.tranzmate.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p429cw.C16515e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lcw/e;", "invoke", "()Lcw/e;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsActivity$mapHelper$2 extends Lambda implements C24225a<C16515e> {
    public final /* synthetic */ StopArrivalsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsActivity$mapHelper$2(StopArrivalsActivity stopArrivalsActivity) {
        super(0);
        this.this$0 = stopArrivalsActivity;
    }

    public final Object invoke() {
        StopArrivalsActivity stopArrivalsActivity = this.this$0;
        Fragment n1 = stopArrivalsActivity.mo44529n1(R.id.map_fragment);
        C24362h.m61210e(n1, "fragmentById(R.id.map_fragment)");
        return new C16515e(stopArrivalsActivity, (MapFragment) n1, this.this$0.mo45868y2(), this.this$0.f39607Z);
    }
}
