package p926xv;

import com.google.android.gms.tasks.OnCompleteListener;

/* renamed from: xv.i */
public final /* synthetic */ class C20628i implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f52150b;

    /* renamed from: c */
    public final /* synthetic */ Object f52151c;

    public /* synthetic */ C20628i(Object obj, int i) {
        this.f52150b = i;
        this.f52151c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete(com.google.android.gms.tasks.Task r9) {
        /*
            r8 = this;
            int r0 = r8.f52150b
            r1 = 0
            r2 = 1
            r3 = 2
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0109;
                case 1: goto L_0x00cc;
                case 2: goto L_0x006a;
                case 3: goto L_0x004b;
                case 4: goto L_0x0015;
                case 5: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x01a3
        L_0x000b:
            java.lang.Object r9 = r8.f52151c
            m80.v r9 = (m80.C12887v) r9
            java.util.concurrent.ThreadPoolExecutor r0 = m80.C12887v.f31893d
            r9.mo39737i()
            return
        L_0x0015:
            java.lang.Object r0 = r8.f52151c
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r9.isSuccessful()
            java.lang.String r2 = "ActivityRecognitionClientCommands"
            if (r1 == 0) goto L_0x002b
            com.moovit.sdk.profilers.ProfilerLog r9 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r0 = "removeActivityUpdates-completed successfully"
            r9.mo49244b(r2, r0)
            goto L_0x004a
        L_0x002b:
            com.moovit.sdk.profilers.ProfilerLog r0 = com.moovit.sdk.profilers.ProfilerLog.m41879c(r0)
            java.lang.String r1 = "removeActivityUpdates-failed with error "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.Exception r3 = r9.getException()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo49244b(r2, r1)
            java.lang.Exception r9 = r9.getException()
            java.util.Objects.toString(r9)
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r0 = r8.f52151c
            d40.g r0 = (d40.C4351g) r0
            android.net.Uri r1 = d40.C4351g.f15323p
            r0.getClass()
            boolean r0 = r9.isSuccessful()
            if (r0 == 0) goto L_0x005b
            goto L_0x0069
        L_0x005b:
            de.f r0 = p435de.C16596f.m42113a()
            java.lang.Exception r1 = r9.getException()
            r0.mo49364c(r1)
            r9.getException()
        L_0x0069:
            return
        L_0x006a:
            java.lang.Object r0 = r8.f52151c
            com.moovit.location.AddressFragment r0 = (com.moovit.location.AddressFragment) r0
            int r1 = com.moovit.location.AddressFragment.f42184r
            r0.getClass()
            boolean r1 = r9.isSuccessful()
            r5 = 4
            if (r1 == 0) goto L_0x009d
            java.lang.Object r9 = r9.getResult()
            j20.d r9 = (j20.C17707d) r9
            com.moovit.transit.LocationDescriptor r1 = r9.f45454e
            if (r1 != 0) goto L_0x008e
            com.moovit.transit.LocationDescriptor r1 = r9.f45450a
            int r9 = p824tp.C19746x.map_tapped_location
            java.lang.String r9 = r0.getString(r9)
            r1.f23651f = r9
        L_0x008e:
            java.lang.String r9 = r1.mo24313f()
            android.widget.ProgressBar r1 = r0.f42187p
            r1.setVisibility(r5)
            android.widget.TextView r0 = r0.f42186o
            r0.setText(r9)
            goto L_0x00cb
        L_0x009d:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.moovit.commons.geo.LatLonE6 r3 = r0.f42188q
            double r6 = r3.mo46922k()
            java.lang.Double r3 = java.lang.Double.valueOf(r6)
            r1[r4] = r3
            com.moovit.commons.geo.LatLonE6 r3 = r0.f42188q
            double r3 = r3.mo46926o()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "(%1.6f, %2.6f)"
            java.lang.String r9 = java.lang.String.format(r9, r2, r1)
            android.widget.ProgressBar r1 = r0.f42187p
            r1.setVisibility(r5)
            android.widget.TextView r0 = r0.f42186o
            r0.setText(r9)
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.Object r0 = r8.f52151c
            lx.f r0 = (p644lx.C18289f) r0
            int r1 = p644lx.C18289f.f46625z
            r0.getClass()
            boolean r1 = r9.isSuccessful()
            r2 = -1
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r1 = r9.getResult()
            if (r1 == 0) goto L_0x00ed
            java.lang.Object r9 = r9.getResult()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            goto L_0x00ee
        L_0x00ed:
            r9 = -1
        L_0x00ee:
            if (r9 == r2) goto L_0x0108
            lx.f$b r1 = r0.f46632x
            T r1 = r1.f47543g
            lx.f$a r1 = (p644lx.C18289f.C18290a) r1
            r1.f46642o = r9
            r1.notifyItemChanged(r9)
            r0.mo50683s2()
            androidx.recyclerview.widget.RecyclerView r1 = r0.f46629u
            lx.c r2 = new lx.c
            r2.<init>(r0, r9)
            r1.post(r2)
        L_0x0108:
            return
        L_0x0109:
            java.lang.Object r0 = r8.f52151c
            xv.k r0 = (p926xv.C20630k) r0
            int r5 = p926xv.C20630k.f52155o
            r0.getClass()
            boolean r5 = r9.isSuccessful()
            if (r5 == 0) goto L_0x019f
            java.lang.Object r5 = r9.getResult()
            if (r5 != 0) goto L_0x0120
            goto L_0x019f
        L_0x0120:
            java.lang.Object r9 = r9.getResult()
            com.moovit.servicealerts.ServiceAlert r9 = (com.moovit.servicealerts.ServiceAlert) r9
            r0.f52159k = r9
            hq.b$a r5 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.SERVICE_ALERT_SHOWN
            r5.<init>(r6)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.SERVICE_ALERT_TYPE
            com.moovit.servicealerts.ServiceAlert r7 = r0.f52159k
            if (r7 == 0) goto L_0x013a
            com.moovit.servicealerts.ServiceStatus r7 = r7.f23191c
            com.moovit.servicealerts.ServiceStatusCategory r7 = r7.f23213b
            goto L_0x013b
        L_0x013a:
            r7 = r1
        L_0x013b:
            java.lang.String r7 = p001a0.C0016g.m12B(r7)
            r5.mo49945m(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ALERT_ID
            com.moovit.servicealerts.ServiceAlert r7 = r0.f52159k
            if (r7 == 0) goto L_0x014a
            java.lang.String r1 = r7.f23190b
        L_0x014a:
            r5.mo49945m(r6, r1)
            hq.b r1 = r5.mo49933a()
            r0.mo22564R1(r1)
            com.moovit.servicealerts.ServiceStatus r1 = r9.f23191c
            com.moovit.design.view.list.ListItemView r5 = r0.f52161m
            android.content.Context r5 = r5.getContext()
            com.moovit.servicealerts.ServiceStatusCategory r6 = r1.f23213b
            int r6 = r6.getColorAttrId()
            int r5 = p977zz.C20941h.m49043f(r6, r5)
            android.view.View r6 = r0.f52160l
            r6.setBackgroundColor(r5)
            com.moovit.design.view.list.ListItemView r5 = r0.f52161m
            com.moovit.servicealerts.ServiceStatusCategory r6 = r1.f23213b
            int r6 = r6.getIconResId()
            r5.setIcon((int) r6)
            com.moovit.design.view.list.ListItemView r5 = r0.f52161m
            java.lang.String r6 = r1.f23214c
            r5.setText((java.lang.CharSequence) r6)
            android.widget.TextView r5 = r0.f52162n
            java.lang.String r6 = r9.f23200l
            com.moovit.commons.utils.UiUtils.m40234B(r5, r6)
            android.view.View r5 = r0.getView()
            if (r5 == 0) goto L_0x019b
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r3]
            java.lang.String r1 = r1.f23214c
            r3[r4] = r1
            java.lang.String r9 = r9.f23200l
            r3[r2] = r9
            java.lang.String r9 = a00.C13382a.m33667c(r3)
            r5.setContentDescription(r9)
        L_0x019b:
            r0.mo52815S1()
            goto L_0x01a2
        L_0x019f:
            r0.dismissAllowingStateLoss()
        L_0x01a2:
            return
        L_0x01a3:
            java.lang.Object r0 = r8.f52151c
            com.moovit.ticketing.activation.BaseTicketActivationActivity r0 = (com.moovit.ticketing.activation.BaseTicketActivationActivity) r0
            int r2 = com.moovit.ticketing.activation.BaseTicketActivationActivity.f23235X
            boolean r2 = r0.f37313z
            if (r2 != 0) goto L_0x01ae
            goto L_0x01d1
        L_0x01ae:
            r0.mo23972H2(r4)
            boolean r2 = r9.isSuccessful()
            if (r2 == 0) goto L_0x01be
            java.lang.Object r9 = r9.getResult()
            r1 = r9
            java.util.List r1 = (java.util.List) r1
        L_0x01be:
            boolean r9 = c00.C13717b.m34258e(r1)
            if (r9 != 0) goto L_0x01d1
            java.util.ArrayList r9 = r0.f23236U
            r9.clear()
            java.util.ArrayList r9 = r0.f23236U
            r9.addAll(r1)
            r0.mo23970G2(r1)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p926xv.C20628i.onComplete(com.google.android.gms.tasks.Task):void");
    }
}
