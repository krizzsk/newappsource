package p520gr;

import android.text.format.DateUtils;
import android.widget.TextView;
import ci0.C21211f;
import com.moovit.app.carpool.coupon.CouponType;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.C15780a;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.io.IOException;
import java.util.Date;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20941h;

/* renamed from: gr.b */
public final class C17221b extends C21211f {

    /* renamed from: b */
    public final /* synthetic */ C17217a f44520b;

    public C17221b(C17217a aVar) {
        this.f44520b = aVar;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C17222c cVar2 = (C17222c) cVar;
        C17217a aVar = this.f44520b;
        aVar.f44512k.setVisibility(4);
        aVar.f44513l.setVisibility(0);
        this.f44520b.f44509h.setEnabled(true);
    }

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        C17222c cVar2 = (C17222c) cVar;
        C17217a.m43214T1(this.f44520b, false);
        C17217a.m43213S1(this.f44520b, serverException.getLocalizedMessage());
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(C20431c cVar, IOException iOException) {
        C17222c cVar2 = (C17222c) cVar;
        C17217a.m43214T1(this.f44520b, false);
        C17217a aVar = this.f44520b;
        C17217a.m43213S1(aVar, aVar.getString(R.string.general_error_title));
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        C17222c cVar2 = (C17222c) cVar;
        C17217a.m43214T1(this.f44520b, false);
        C17217a aVar = this.f44520b;
        C17217a.m43213S1(aVar, aVar.getString(R.string.general_error_title));
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C17222c cVar2 = (C17222c) cVar;
        C17223d dVar = (C17223d) gVar;
        C17217a.m43214T1(this.f44520b, true);
        C17217a aVar = this.f44520b;
        CurrencyAmount currencyAmount = dVar.f44521m;
        CurrencyAmount currencyAmount2 = dVar.f44522n;
        Date date = dVar.f44523o;
        CouponType couponType = dVar.f44524p;
        aVar.f44513l.setVisibility(0);
        C15780a.m40272e(aVar.f44513l, R.drawable.ic_check_mark_circ_16_good);
        TextView textView = aVar.f44513l;
        textView.setTextColor(C20941h.m49044g(R.attr.colorGood, textView.getContext()));
        aVar.f44513l.setText(R.string.carpool_passenger_promo_code_confirmed_title);
        if (couponType.equals(CouponType.REFERRAL)) {
            aVar.f44514m.setVisibility(0);
            aVar.f44514m.setText(aVar.getString(R.string.carpool_passenger_promo_code_confirmed_subtitle, currencyAmount.toString()));
        } else if (couponType.equals(CouponType.SOCIAL) && currencyAmount2 != null) {
            aVar.f44514m.setVisibility(0);
            aVar.f44514m.setText(aVar.getString(R.string.carpool_promo_code_confirmed_subtitle_passenger_conditions, currencyAmount.toString(), currencyAmount2.toString()));
        }
        if (date != null) {
            aVar.f44515n.setVisibility(0);
            String formatDateTime = DateUtils.formatDateTime(aVar.f40792c, date.getTime(), 131076);
            aVar.f44515n.setText(aVar.getString(R.string.carpool_passenger_promo_code_expiry_date, formatDateTime));
        }
        aVar.f44509h.setText(R.string.action_done);
        aVar.f44516o = true;
        aVar.f44510i.setEnabled(false);
    }
}
