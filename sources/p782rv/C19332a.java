package p782rv;

import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;

/* renamed from: rv.a */
public abstract class C19332a extends C15682c<RideSharingRegistrationActivity> {
    public C19332a() {
        super(RideSharingRegistrationActivity.class);
    }

    /* renamed from: S1 */
    public final void mo46784S1() {
        if (this.f40822c != null) {
            super.mo46784S1();
        }
    }

    /* renamed from: m2 */
    public final RideSharingRegistrationInfo mo51742m2() {
        return ((RideSharingRegistrationActivity) this.f40822c).f39380Y;
    }

    /* renamed from: n2 */
    public abstract AnalyticsEventKey mo51743n2();

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    /* renamed from: o2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51744o2() {
        /*
            r6 = this;
            r6.mo46784S1()
            A r0 = r6.f40822c
            com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity r0 = (com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity) r0
            r1 = 0
            r0.mo45780E2(r1)
            java.util.ArrayList r2 = r0.f39381Z
            boolean r2 = r2.isEmpty()
            r3 = 2131362998(0x7f0a04b6, float:1.8345792E38)
            r4 = 0
            if (r2 == 0) goto L_0x0018
            goto L_0x0035
        L_0x0018:
            androidx.fragment.app.Fragment r2 = r0.mo44529n1(r3)
            rv.a r2 = (p782rv.C19332a) r2
            if (r2 != 0) goto L_0x0029
            java.util.ArrayList r2 = r0.f39381Z
            java.lang.Object r2 = r2.get(r1)
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x0041
        L_0x0029:
            java.util.ArrayList r5 = r0.f39381Z
            java.lang.Class r2 = r2.getClass()
            int r2 = r5.indexOf(r2)
            if (r2 != 0) goto L_0x0037
        L_0x0035:
            r2 = r4
            goto L_0x0041
        L_0x0037:
            java.util.ArrayList r5 = r0.f39381Z
            int r2 = r2 + -1
            java.lang.Object r2 = r5.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
        L_0x0041:
            if (r2 != 0) goto L_0x004a
            r0.setResult(r1)
            r0.finish()
            goto L_0x0079
        L_0x004a:
            java.lang.String r1 = r2.getName()
            androidx.fragment.app.Fragment r1 = androidx.fragment.app.Fragment.instantiate(r0, r1)
            rv.a r1 = (p782rv.C19332a) r1
            androidx.fragment.app.FragmentManager r2 = r0.getSupportFragmentManager()
            r2.getClass()
            androidx.fragment.app.a r5 = new androidx.fragment.app.a
            r5.<init>(r2)
            r5.mo4111f(r3, r1, r4)
            r5.mo4046l()
            boolean r2 = r0.f37311x
            if (r2 == 0) goto L_0x006e
            r2 = 1
            r0.mo45780E2(r2)
        L_0x006e:
            hq.b$a r2 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r1 = r1.mo51743n2()
            r2.<init>(r1)
            r0.f39382l0 = r2
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p782rv.C19332a.mo51744o2():void");
    }

    /* renamed from: p2 */
    public final void mo51745p2(boolean z) {
        mo46784S1();
        RideSharingRegistrationActivity rideSharingRegistrationActivity = (RideSharingRegistrationActivity) this.f40822c;
        if (z) {
            rideSharingRegistrationActivity.mo45779D2();
            return;
        }
        rideSharingRegistrationActivity.mo45781y2();
        rideSharingRegistrationActivity.mo45776A2();
    }

    /* renamed from: q2 */
    public void mo51746q2() {
    }
}
