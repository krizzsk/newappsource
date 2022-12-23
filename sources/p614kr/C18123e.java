package p614kr;

import c70.C13751d;
import ci0.C21211f;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.io.IOException;
import p428cv.C16508i;
import p428cv.C16509j;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: kr.e */
public final class C18123e extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ CarpoolAddCreditCardActivity f46338b;

    public C18123e(CarpoolAddCreditCardActivity carpoolAddCreditCardActivity) {
        this.f46338b = carpoolAddCreditCardActivity;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C16508i iVar = (C16508i) cVar;
        this.f46338b.mo44506I1();
    }

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        C16508i iVar = (C16508i) cVar;
        if (serverException instanceof UserRequestError) {
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46338b;
            carpoolAddCreditCardActivity.mo44530n2(C13751d.m34341b(carpoolAddCreditCardActivity, (String) null, serverException));
            return true;
        }
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity2 = this.f46338b;
        String string = carpoolAddCreditCardActivity2.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity2.mo44872F2(string);
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C16508i iVar = (C16508i) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46338b;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C16508i iVar = (C16508i) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46338b;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C16508i iVar = (C16508i) cVar;
        C16509j jVar = (C16509j) gVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46338b;
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44873G2(true);
        UiUtils.m40252k(carpoolAddCreditCardActivity.getWindow().getDecorView());
        carpoolAddCreditCardActivity.setResult(-1);
        carpoolAddCreditCardActivity.finish();
    }
}
