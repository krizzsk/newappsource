package com.moovit.app.stoparrivals;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/TripsUpdateResult;", "kotlin.jvm.PlatformType", "tripsResult", "Lbf0/d;", "invoke", "(Lcom/moovit/app/stoparrivals/TripsUpdateResult;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsActivity$onReady$3 extends Lambda implements C24236l<TripsUpdateResult, C21050d> {
    public final /* synthetic */ StopArrivalsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsActivity$onReady$3(StopArrivalsActivity stopArrivalsActivity) {
        super(1);
        this.this$0 = stopArrivalsActivity;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            com.moovit.app.stoparrivals.TripsUpdateResult r4 = (com.moovit.app.stoparrivals.TripsUpdateResult) r4
            java.util.List<com.moovit.app.stoparrivals.StopArrival> r0 = r4.f39628c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0043
            com.moovit.app.stoparrivals.StopArrivalsActivity r4 = r3.this$0
            com.moovit.app.stoparrivals.StopArrivalsActivity$b r0 = r4.f39604U
            r0.mo23803d()
            com.moovit.design.dialog.AlertDialogFragment$a r0 = new com.moovit.design.dialog.AlertDialogFragment$a
            r0.<init>((android.content.Context) r4)
            java.lang.String r1 = "empty_results_dialog_tag"
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47682k(r1)
            r1 = 2131231765(0x7f080415, float:1.807962E38)
            r2 = 0
            r0.mo47676e(r1, r2)
            r1 = 2131887593(0x7f1205e9, float:1.9409797E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47683l(r1)
            r1 = 2131887592(0x7f1205e8, float:1.9409795E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47678g(r1)
            r1 = 2131886158(0x7f12004e, float:1.9406887E38)
            com.moovit.design.dialog.AlertDialogFragment$a r0 = r0.mo47681j(r1)
            r0.mo47674c(r2)
            com.moovit.design.dialog.AlertDialogFragment r0 = r0.mo47673b()
            r4.mo44530n2(r0)
            goto L_0x0075
        L_0x0043:
            com.moovit.app.stoparrivals.StopArrivalsActivity r0 = r3.this$0
            int r1 = com.moovit.app.stoparrivals.StopArrivalsActivity.f39603q0
            bf0.c r0 = r0.f39606Y
            java.lang.Object r0 = r0.getValue()
            cw.e r0 = (p429cw.C16515e) r0
            r0.getClass()
            com.moovit.map.MapFragment r1 = r0.f43116b
            com.moovit.app.stoparrivals.StopArrivalsMapHelper$updateMapStopArrivals$1 r2 = new com.moovit.app.stoparrivals.StopArrivalsMapHelper$updateMapStopArrivals$1
            r2.<init>(r4, r0)
            p172m9.C5720b.m14038F(r1, r2)
            com.moovit.app.stoparrivals.StopArrivalsActivity r0 = r3.this$0
            androidx.viewpager2.widget.ViewPager2 r0 = r0.f39609m0
            r1 = 0
            if (r0 == 0) goto L_0x0078
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            boolean r2 = r0 instanceof com.moovit.app.stoparrivals.StopArrivalsActivity.C15316a
            if (r2 == 0) goto L_0x006e
            r1 = r0
            com.moovit.app.stoparrivals.StopArrivalsActivity$a r1 = (com.moovit.app.stoparrivals.StopArrivalsActivity.C15316a) r1
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            java.util.List<com.moovit.app.stoparrivals.StopArrival> r4 = r4.f39628c
            r1.mo39637k(r4)
        L_0x0075:
            bf0.d r4 = bf0.C21050d.f52856a
            return r4
        L_0x0078:
            java.lang.String r4 = "viewPager"
            mf0.C24362h.m61217l(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.stoparrivals.StopArrivalsActivity$onReady$3.invoke(java.lang.Object):java.lang.Object");
    }
}
