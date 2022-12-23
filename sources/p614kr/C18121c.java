package p614kr;

import ci0.C21211f;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.commons.request.ServerException;
import com.tranzmate.R;
import java.io.IOException;
import p428cv.C16506g;
import p428cv.C16507h;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: kr.c */
public final class C18121c extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ CarpoolAddCreditCardActivity f46332b;

    public C18121c(CarpoolAddCreditCardActivity carpoolAddCreditCardActivity) {
        this.f46332b = carpoolAddCreditCardActivity;
    }

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        C16506g gVar = (C16506g) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46332b;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C16506g gVar = (C16506g) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46332b;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C16506g gVar = (C16506g) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46332b;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        boolean z;
        C16506g gVar2 = (C16506g) cVar;
        C16507h hVar = (C16507h) gVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46332b;
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.getClass();
        if (hVar.mo49299e()) {
            carpoolAddCreditCardActivity.mo44869C2(hVar.f43107f, hVar.f43108g, hVar.f43109h, hVar.f43110i, (String) null);
            z = true;
        } else {
            z = false;
            carpoolAddCreditCardActivity.mo44872F2(carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message));
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_ZOOZ_REGISTRATION);
        aVar.mo49941i(AnalyticsAttributeKey.CARPOOL_CREDIT_CARD_ZOOZ_VALIDATION, z);
        carpoolAddCreditCardActivity.mo44545v2(aVar.mo49933a());
    }
}
