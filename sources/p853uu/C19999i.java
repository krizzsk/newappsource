package p853uu;

import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.C15682c;

/* renamed from: uu.i */
public final /* synthetic */ class C19999i implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f50843b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f50844c;

    /* renamed from: d */
    public final /* synthetic */ Object f50845d;

    /* renamed from: e */
    public final /* synthetic */ Object f50846e;

    public /* synthetic */ C19999i(C15682c cVar, Object obj, Object obj2, int i) {
        this.f50843b = i;
        this.f50844c = cVar;
        this.f50845d = obj;
        this.f50846e = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r15 != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f50843b
            switch(r0) {
                case 0: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c0
        L_0x0007:
            com.moovit.c r0 = r14.f50844c
            uu.j r0 = (p853uu.C20000j) r0
            java.lang.Object r1 = r14.f50845d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.f50846e
            com.moovit.network.model.ServerId r2 = (com.moovit.network.model.ServerId) r2
            java.util.List r15 = (java.util.List) r15
            int r3 = p853uu.C20000j.f50847n
            A r3 = r0.f40822c
            if (r3 != 0) goto L_0x001d
            goto L_0x00bf
        L_0x001d:
            java.lang.Object r15 = c00.C13717b.m34256c(r15)
            com.moovit.app.mot.model.MotActivation r15 = (com.moovit.app.mot.model.MotActivation) r15
            if (r15 != 0) goto L_0x002a
            r3.finish()
            goto L_0x00bf
        L_0x002a:
            com.moovit.app.mot.model.MotActivationStationInfo r3 = r15.f38997n
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0031
            goto L_0x0042
        L_0x0031:
            com.moovit.transit.TransitStop r3 = r3.mo45574b()
            if (r3 != 0) goto L_0x0044
            com.moovit.app.mot.model.MotActivation$Status r3 = r15.f38990g
            com.moovit.app.mot.model.MotActivation$Status r6 = com.moovit.app.mot.model.MotActivation.Status.ACTIVE
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            if (r3 == 0) goto L_0x004a
            java.lang.String r15 = "exit_qr_code_viewer"
            goto L_0x00b2
        L_0x004a:
            java.lang.String r3 = "CONFIGURATION"
            java.lang.Object r3 = r0.mo46776J1(r3)
            q00.a r3 = (q00.C19047a) r3
            android.location.Location r6 = r0.mo46780O1()
            com.moovit.commons.geo.LatLonE6 r6 = com.moovit.commons.geo.LatLonE6.m40177j(r6)
            com.moovit.app.mot.model.MotActivationStationInfo r7 = r15.f38997n
            if (r7 == 0) goto L_0x0067
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitStop> r7 = r7.f39021b
            j40.a r7 = r7.get()
            com.moovit.transit.TransitStop r7 = (com.moovit.transit.TransitStop) r7
            goto L_0x0068
        L_0x0067:
            r7 = 0
        L_0x0068:
            if (r6 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x006d
            goto L_0x00aa
        L_0x006d:
            long r8 = r15.f38998o
            r00.d r15 = p874vr.C20199a.f51248J0
            java.lang.Object r15 = r3.mo51505b(r15)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            long r12 = (long) r15
            long r8 = r8.toMillis(r12)
            int r15 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x008d
            r15 = 1
            goto L_0x008e
        L_0x008d:
            r15 = 0
        L_0x008e:
            if (r15 != 0) goto L_0x00aa
            float r15 = com.moovit.commons.geo.LatLonE6.m40174c(r6, r7)
            r00.d r6 = p874vr.C20199a.f51247I0
            java.lang.Object r3 = r3.mo51505b(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 < 0) goto L_0x00a7
            r15 = 1
            goto L_0x00a8
        L_0x00a7:
            r15 = 0
        L_0x00a8:
            if (r15 == 0) goto L_0x00ab
        L_0x00aa:
            r4 = 1
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            java.lang.String r15 = "inspection"
            goto L_0x00b2
        L_0x00b0:
            java.lang.String r15 = "entrance_qr_code_viewer"
        L_0x00b2:
            androidx.fragment.app.FragmentManager r3 = r0.getChildFragmentManager()
            androidx.fragment.app.Fragment r3 = r3.mo3923A(r15)
            if (r3 != 0) goto L_0x00bf
            r0.mo52272n2(r15, r1, r2, r5)
        L_0x00bf:
            return
        L_0x00c0:
            com.moovit.c r0 = r14.f50844c
            com.moovit.map.MapFragment r0 = (com.moovit.map.MapFragment) r0
            java.lang.Object r1 = r14.f50845d
            r20.b r1 = (r20.C19224b) r1
            java.lang.Object r2 = r14.f50846e
            com.android.billingclient.api.s r2 = (com.android.billingclient.api.C1963s) r2
            java.util.List r15 = (java.util.List) r15
            i0.c r3 = com.moovit.map.MapFragment.f42333I0
            boolean r3 = r0.mo48624U2()
            if (r3 == 0) goto L_0x0108
            boolean r3 = r1.f48824d
            if (r3 != 0) goto L_0x0108
            boolean r3 = c00.C13717b.m34258e(r15)
            if (r3 == 0) goto L_0x00e1
            goto L_0x0108
        L_0x00e1:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r15.size()
            r3.<init>(r4)
            java.util.Iterator r15 = r15.iterator()
        L_0x00ee:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x0106
            java.lang.Object r4 = r15.next()
            o20.s r4 = (o20.C18713s) r4
            java.lang.Object r5 = r2.f6792b
            o20.b r5 = (o20.C18696b) r5
            com.moovit.map.MapFragment$j r4 = r0.mo48652r2(r4, r5)
            r3.add(r4)
            goto L_0x00ee
        L_0x0106:
            r1.f48823c = r3
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p853uu.C19999i.onSuccess(java.lang.Object):void");
    }
}
