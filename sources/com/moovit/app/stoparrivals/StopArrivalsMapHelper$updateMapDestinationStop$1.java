package com.moovit.app.stoparrivals;

import android.util.SparseArray;
import bf0.C21050d;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import o20.C18699e;
import p429cw.C16515e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class StopArrivalsMapHelper$updateMapDestinationStop$1 extends Lambda implements C24225a<C21050d> {
    public final /* synthetic */ TransitStop $stop;
    public final /* synthetic */ C16515e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsMapHelper$updateMapDestinationStop$1(C16515e eVar, TransitStop transitStop) {
        super(0);
        this.this$0 = eVar;
        this.$stop = transitStop;
    }

    public final Object invoke() {
        C16515e eVar = this.this$0;
        Object obj = eVar.f43119e;
        if (obj != null) {
            eVar.f43116b.mo48637h3(obj, eVar.f43120f);
        }
        SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(this.$stop.f23738j);
        C16281i.m41507c(c);
        C16515e eVar2 = this.this$0;
        MapFragment mapFragment = eVar2.f43116b;
        TransitStop transitStop = this.$stop;
        eVar2.f43119e = mapFragment.mo48650q2(transitStop.f23732d, transitStop, C18699e.m45697a(c), this.this$0.f43120f);
        return C21050d.f52856a;
    }
}
