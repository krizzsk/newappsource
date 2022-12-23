package com.moovit.app.stoparrivals;

import android.widget.TextView;
import bf0.C21050d;
import c20.C13744a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.TransitStop;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p172m9.C5720b;
import p429cw.C16515e;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lcom/moovit/transit/TransitStop;", "kotlin.jvm.PlatformType", "stop", "Lbf0/d;", "invoke", "(Lcom/moovit/transit/TransitStop;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsActivity$onReady$2 extends Lambda implements C24236l<TransitStop, C21050d> {
    public final /* synthetic */ StopArrivalsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsActivity$onReady$2(StopArrivalsActivity stopArrivalsActivity) {
        super(1);
        this.this$0 = stopArrivalsActivity;
    }

    public final Object invoke(Object obj) {
        TransitStop transitStop = (TransitStop) obj;
        StopArrivalsActivity stopArrivalsActivity = this.this$0;
        int i = StopArrivalsActivity.f39603q0;
        C16515e eVar = (C16515e) stopArrivalsActivity.f39606Y.getValue();
        C24362h.m61210e(transitStop, "stop");
        eVar.getClass();
        C5720b.m14038F(eVar.f43116b, new StopArrivalsMapHelper$updateMapDestinationStop$1(eVar, transitStop));
        TextView textView = this.this$0.f39608l0;
        if (textView != null) {
            UiUtils.m40236D(textView, transitStop.f23731c, 4);
            TextView textView2 = this.this$0.f39608l0;
            if (textView2 != null) {
                C13744a.m34299a(textView2, UiUtils.Edge.LEFT, transitStop.f23734f);
                return C21050d.f52856a;
            }
            C24362h.m61217l("stopHeader");
            throw null;
        }
        C24362h.m61217l("stopHeader");
        throw null;
    }
}
