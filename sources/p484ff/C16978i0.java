package p484ff;

import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: ff.i0 */
public final /* synthetic */ class C16978i0 implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f44076b;

    /* renamed from: c */
    public final /* synthetic */ Object f44077c;

    public /* synthetic */ C16978i0(Object obj, int i) {
        this.f44076b = i;
        this.f44077c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r10) {
        /*
            r9 = this;
            int r0 = r9.f44076b
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0181;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00a6;
                case 3: goto L_0x0068;
                case 4: goto L_0x005e;
                case 5: goto L_0x003f;
                case 6: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0189
        L_0x0009:
            java.lang.Object r0 = r9.f44077c
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r10.isSuccessful()
            java.lang.String r2 = "ActivityRecognitionClientCommands"
            if (r1 == 0) goto L_0x001f
            com.moovit.sdk.profilers.ProfilerLog r10 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r0 = "removeActivityTransitionUpdates-completed successfully"
            r10.mo49244b(r2, r0)
            goto L_0x003e
        L_0x001f:
            com.moovit.sdk.profilers.ProfilerLog r0 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r1 = "removeActivityTransitionUpdates-failed with error "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.Exception r3 = r10.getException()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo49244b(r2, r1)
            java.lang.Exception r10 = r10.getException()
            java.util.Objects.toString(r10)
        L_0x003e:
            return
        L_0x003f:
            java.lang.Object r0 = r9.f44077c
            d40.g r0 = (d40.C4351g) r0
            android.net.Uri r1 = d40.C4351g.f15323p
            r0.getClass()
            boolean r0 = r10.isSuccessful()
            if (r0 == 0) goto L_0x004f
            goto L_0x005d
        L_0x004f:
            de.f r0 = p435de.C16596f.m42113a()
            java.lang.Exception r1 = r10.getException()
            r0.mo49364c(r1)
            r10.getException()
        L_0x005d:
            return
        L_0x005e:
            java.lang.Object r10 = r9.f44077c
            com.moovit.micromobility.MicroMobilityRideActivity r10 = (com.moovit.micromobility.MicroMobilityRideActivity) r10
            int r0 = com.moovit.micromobility.MicroMobilityRideActivity.f14823n0
            r10.mo44506I1()
            return
        L_0x0068:
            java.lang.Object r0 = r9.f44077c
            com.moovit.location.LocationSettingsFixer r0 = (com.moovit.location.LocationSettingsFixer) r0
            r0.getClass()
            boolean r2 = r10.isSuccessful()
            if (r2 == 0) goto L_0x0086
            androidx.lifecycle.v<zz.r<android.location.Location>> r0 = r0.f42247a
            zz.r r1 = new zz.r
            java.lang.Object r10 = r10.getResult()
            android.location.Location r10 = (android.location.Location) r10
            r1.<init>(r10)
            r0.postValue(r1)
            goto L_0x00a5
        L_0x0086:
            java.lang.Exception r2 = r10.getException()
            if (r2 == 0) goto L_0x009b
            androidx.lifecycle.v<zz.r<android.location.Location>> r0 = r0.f42247a
            zz.r r1 = new zz.r
            java.lang.Exception r10 = r10.getException()
            r1.<init>((java.lang.Exception) r10)
            r0.postValue(r1)
            goto L_0x00a5
        L_0x009b:
            androidx.lifecycle.v<zz.r<android.location.Location>> r10 = r0.f42247a
            zz.r r0 = new zz.r
            r0.<init>(r1)
            r10.postValue(r0)
        L_0x00a5:
            return
        L_0x00a6:
            java.lang.Object r0 = r9.f44077c
            com.moovit.app.linedetail.ui.LineTripPatternActivity r0 = (com.moovit.app.linedetail.p416ui.LineTripPatternActivity) r0
            int r1 = com.moovit.app.linedetail.p416ui.LineTripPatternActivity.f38762E0
            r0.getClass()
            boolean r1 = r10.isSuccessful()
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r10 = r10.getResult()
            j80.d r10 = (j80.C12775d) r10
            r0.mo45440F2(r10)
            goto L_0x00c3
        L_0x00bf:
            com.moovit.network.model.ServerId r10 = r0.f38773n0
            int r10 = r10.f15142b
        L_0x00c3:
            return
        L_0x00c4:
            java.lang.Object r0 = r9.f44077c
            com.moovit.app.itinerary.schedule.ItineraryScheduleActivity r0 = (com.moovit.app.itinerary.schedule.ItineraryScheduleActivity) r0
            int r1 = com.moovit.app.itinerary.schedule.ItineraryScheduleActivity.f38618Z
            r0.getClass()
            boolean r1 = r10.isSuccessful()
            r3 = 1
            r4 = 2131363953(0x7f0a0871, float:1.834773E38)
            if (r1 == 0) goto L_0x0168
            java.lang.Object r1 = r10.getResult()
            if (r1 == 0) goto L_0x0168
            java.lang.Object r10 = r10.getResult()
            com.moovit.app.itinerary.schedule.a$b r10 = (com.moovit.app.itinerary.schedule.C15065a.C15067b) r10
            r1 = 2131363067(0x7f0a04fb, float:1.8345932E38)
            android.view.View r1 = r0.findViewById(r1)
            com.moovit.design.view.list.ListItemView r1 = (com.moovit.design.view.list.ListItemView) r1
            com.moovit.transit.LocationDescriptor r5 = r10.f38628a
            java.lang.String r5 = r5.mo24313f()
            r1.setTitle((java.lang.CharSequence) r5)
            r5 = 2131889044(0x7f120b94, float:1.941274E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.moovit.transit.LocationDescriptor r7 = r10.f38629b
            java.lang.String r7 = r7.mo24313f()
            r6[r2] = r7
            java.lang.String r5 = r0.getString(r5, r6)
            r1.setSubtitle((java.lang.CharSequence) r5)
            a00.C13382a.m33673i(r1)
            r5 = 2
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            r6 = 2131889591(0x7f120db7, float:1.941385E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.moovit.transit.LocationDescriptor r8 = r10.f38628a
            java.lang.String r8 = r8.mo24313f()
            r7[r2] = r8
            java.lang.String r6 = r0.getString(r6, r7)
            r5[r2] = r6
            r6 = 2131889642(0x7f120dea, float:1.9413953E38)
            java.lang.Object[] r7 = new java.lang.Object[r3]
            com.moovit.transit.LocationDescriptor r8 = r10.f38629b
            java.lang.String r8 = r8.mo24313f()
            r7[r2] = r8
            java.lang.String r2 = r0.getString(r6, r7)
            r5[r3] = r2
            a00.C13382a.m33674j(r1, r5)
            android.view.View r1 = r0.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.getAdapter()
            boolean r2 = r2 instanceof p971zt.C20892b
            if (r2 == 0) goto L_0x014d
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r1.getAdapter()
            zt.b r0 = (p971zt.C20892b) r0
            goto L_0x015d
        L_0x014d:
            zt.b r3 = new zt.b
            java.util.HashSet r4 = p824tp.C19728f.f50164e
            java.lang.String r4 = "metro_context"
            java.lang.Object r4 = r0.getSystemService(r4)
            tp.f r4 = (p824tp.C19728f) r4
            r3.<init>(r0, r4)
            r0 = r3
        L_0x015d:
            java.util.List<o00.l$c<zt.c>> r10 = r10.f38630c
            r0.mo51055y(r10)
            if (r2 != 0) goto L_0x0180
            r1.mo4627l0(r0)
            goto L_0x0180
        L_0x0168:
            r10.getException()
            android.view.View r10 = r0.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r10 = (androidx.recyclerview.widget.RecyclerView) r10
            o00.h r0 = new o00.h
            int[] r1 = new int[r3]
            r3 = 2131559294(0x7f0d037e, float:1.8743928E38)
            r1[r2] = r3
            r0.<init>(r1)
            r10.mo4627l0(r0)
        L_0x0180:
            return
        L_0x0181:
            java.lang.Object r10 = r9.f44077c
            android.content.Intent r10 = (android.content.Intent) r10
            p484ff.C16980j0.m42818a(r10)
            return
        L_0x0189:
            java.lang.Object r0 = r9.f44077c
            com.moovit.ticketing.activation.BaseTicketActivationActivity r0 = (com.moovit.ticketing.activation.BaseTicketActivationActivity) r0
            int r3 = com.moovit.ticketing.activation.BaseTicketActivationActivity.f23235X
            boolean r3 = r0.f37313z
            if (r3 != 0) goto L_0x0194
            goto L_0x01b7
        L_0x0194:
            r0.mo23972H2(r2)
            boolean r2 = r10.isSuccessful()
            if (r2 == 0) goto L_0x01a4
            java.lang.Object r10 = r10.getResult()
            r1 = r10
            java.util.List r1 = (java.util.List) r1
        L_0x01a4:
            boolean r10 = c00.C13717b.m34258e(r1)
            if (r10 != 0) goto L_0x01b7
            java.util.ArrayList r10 = r0.f23236U
            r10.clear()
            java.util.ArrayList r10 = r0.f23236U
            r10.addAll(r1)
            r0.mo23970G2(r1)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p484ff.C16978i0.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
