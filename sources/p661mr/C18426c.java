package p661mr;

import ci0.C21211f;
import com.moovit.app.carpool.referral.CarpoolReferralCouponDetails;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: mr.c */
public final class C18426c extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ C18427d f46975b;

    public C18426c(C18427d dVar) {
        this.f46975b = dVar;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C18424a aVar = (C18424a) cVar;
        this.f46975b.f46986q = null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo315c(C20431c cVar, ServerException serverException) {
        C18424a aVar = (C18424a) cVar;
        return true;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ boolean mo316d(C20431c cVar, IOException iOException) {
        C18424a aVar = (C18424a) cVar;
        return true;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ boolean mo319i(C20431c cVar, IOException iOException) {
        C18424a aVar = (C18424a) cVar;
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C18424a aVar = (C18424a) cVar;
        C18427d dVar = this.f46975b;
        dVar.f46979j.setVisibility(0);
        dVar.f46980k.setVisibility(0);
        dVar.f46981l.setEnabled(true);
        dVar.f46982m.setVisibility(0);
        dVar.f46987r.setRepeatCount(0);
        C18427d dVar2 = this.f46975b;
        CarpoolReferralCouponDetails carpoolReferralCouponDetails = ((C18425b) gVar).f46974m;
        dVar2.f46985p = carpoolReferralCouponDetails;
        if (carpoolReferralCouponDetails != null) {
            dVar2.mo50879S1();
        }
    }
}
