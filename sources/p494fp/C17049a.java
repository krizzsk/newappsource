package p494fp;

import android.view.View;
import com.masabi.justride.sdk.p415ui.features.universalticket.main.MainTicketFragment;

/* renamed from: fp.a */
public final class C17049a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MainTicketFragment f44203b;

    public C17049a(MainTicketFragment mainTicketFragment) {
        this.f44203b = mainTicketFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r3 == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
            r9 = this;
            com.masabi.justride.sdk.ui.features.universalticket.main.MainTicketFragment r10 = r9.f44203b
            java.lang.String r0 = "ticketDetails.activationSummary"
            boolean r1 = r10.f37252e
            if (r1 == 0) goto L_0x000a
            goto L_0x00a3
        L_0x000a:
            r1 = 0
            fp.e r2 = r10.f37251d     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            if (r2 == 0) goto L_0x00a3
            qn.h r3 = r2.mo49664e()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            qn.a r3 = r3.f48722o     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mf0.C24362h.m61210e(r3, r0)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mn.b r3 = r3.f48676g     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0030
            qn.i r3 = r2.mo49660a()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            boolean r6 = r3.f48738e     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            if (r6 != 0) goto L_0x002d
            boolean r3 = r3.f48739f     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r4 = 1
        L_0x0031:
            if (r4 == 0) goto L_0x008a
            java.lang.String r3 = r10.mo44488U1()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            qn.h r4 = r2.mo49664e()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            qn.a r4 = r4.f48722o     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mf0.C24362h.m61210e(r4, r0)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mn.b r4 = r4.f48676g     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            if (r4 == 0) goto L_0x0047
            java.lang.String r4 = r4.f46929b     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            goto L_0x0048
        L_0x0047:
            r4 = r1
        L_0x0048:
            qn.h r6 = r2.mo49664e()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            qn.a r6 = r6.f48722o     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mf0.C24362h.m61210e(r6, r0)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            mn.b r0 = r6.f48676g     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.f46928a     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            goto L_0x0059
        L_0x0058:
            r0 = r1
        L_0x0059:
            java.lang.String r2 = r2.mo49662c()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            hp.a r6 = new hp.a     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            r6.<init>()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            r7.<init>()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            java.lang.String r8 = "TICKET_ID_KEY"
            r7.putString(r8, r3)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            java.lang.String r3 = "TITLE"
            r7.putString(r3, r4)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            java.lang.String r3 = "BODY"
            r7.putString(r3, r0)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            java.lang.String r0 = "USAGE_PERIOD_WARNING"
            r7.putString(r0, r2)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            bf0.d r0 = bf0.C21050d.f52856a     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            r6.setArguments(r7)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            androidx.fragment.app.FragmentManager r0 = r10.getChildFragmentManager()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            java.lang.String r2 = "activationModal"
            r6.show((androidx.fragment.app.FragmentManager) r0, (java.lang.String) r2)     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            goto L_0x008d
        L_0x008a:
            r10.mo44478K1()     // Catch:{ UsagePeriodInfoException -> 0x0090 }
        L_0x008d:
            r10.f37252e = r5     // Catch:{ UsagePeriodInfoException -> 0x0090 }
            goto L_0x00a3
        L_0x0090:
            androidx.fragment.app.Fragment r10 = r10.getParentFragment()
            boolean r0 = r10 instanceof p871vo.C20178e
            if (r0 != 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r1 = r10
        L_0x009b:
            vo.e r1 = (p871vo.C20178e) r1
            if (r1 == 0) goto L_0x00a3
            r10 = 3
            r1.mo52425L1(r10)
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p494fp.C17049a.onClick(android.view.View):void");
    }
}
