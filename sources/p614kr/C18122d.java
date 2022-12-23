package p614kr;

import ci0.C21211f;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.payment.CarpoolAddCreditCardActivity;
import com.tranzmate.R;
import java.io.IOException;
import p428cv.C16504e;
import p428cv.C16505f;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: kr.d */
public final class C18122d extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ String f46333b;

    /* renamed from: c */
    public final /* synthetic */ String f46334c;

    /* renamed from: d */
    public final /* synthetic */ String f46335d;

    /* renamed from: e */
    public final /* synthetic */ String f46336e;

    /* renamed from: f */
    public final /* synthetic */ CarpoolAddCreditCardActivity f46337f;

    public C18122d(CarpoolAddCreditCardActivity carpoolAddCreditCardActivity, String str, String str2, String str3, String str4, String str5) {
        this.f46337f = carpoolAddCreditCardActivity;
        this.f46333b = str;
        this.f46334c = str2;
        this.f46335d = str3;
        this.f46336e = str5;
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C16504e eVar = (C16504e) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46337f;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C16504e eVar = (C16504e) cVar;
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46337f;
        String string = carpoolAddCreditCardActivity.getString(R.string.carpool_credit_card_general_error_message);
        int i = CarpoolAddCreditCardActivity.f37786x0;
        carpoolAddCreditCardActivity.mo44872F2(string);
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        boolean z;
        C16504e eVar = (C16504e) cVar;
        C16505f fVar = (C16505f) gVar;
        if (fVar.f43104g) {
            String str = fVar.f43103f;
            String str2 = this.f46333b;
            String substring = str2.substring(str2.length() - 4);
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity = this.f46337f;
            String str3 = this.f46334c;
            String str4 = this.f46335d;
            String str5 = this.f46336e;
            int i = CarpoolAddCreditCardActivity.f37786x0;
            carpoolAddCreditCardActivity.mo44869C2(str, substring, str3, str4, str5);
            z = true;
        } else {
            CarpoolAddCreditCardActivity carpoolAddCreditCardActivity2 = this.f46337f;
            String string = carpoolAddCreditCardActivity2.getString(R.string.carpool_credit_card_general_error_message);
            int i2 = CarpoolAddCreditCardActivity.f37786x0;
            carpoolAddCreditCardActivity2.mo44872F2(string);
            z = false;
        }
        CarpoolAddCreditCardActivity carpoolAddCreditCardActivity3 = this.f46337f;
        carpoolAddCreditCardActivity3.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CARPOOL_ZOOZ_REGISTRATION);
        aVar.mo49941i(AnalyticsAttributeKey.CARPOOL_CREDIT_CARD_ZOOZ_VALIDATION, z);
        carpoolAddCreditCardActivity3.mo44545v2(aVar.mo49933a());
    }
}
