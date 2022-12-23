package p430cx;

import android.text.format.DateUtils;
import android.text.style.StyleSpan;
import androidx.lifecycle.C1044w;
import androidx.recyclerview.widget.C1164b;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.google.android.material.tabs.TabLayout;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.creditcard.PaymentCreditCardActivity;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.search.C7606b;
import com.moovit.search.SearchLocationActivity;
import com.moovit.search.specialactions.SearchLocationSpecialActions;
import com.moovit.ticketing.purchase.history.TransactionHistoryActivity;
import com.moovit.util.time.C7925b;
import g80.C12692a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import o00.C18673i;
import p977zz.C20964s0;
import v40.C25754i;
import w50.C20283g;
import y50.C20703a;
import z00.C20795a;
import z70.C13322b;
import z70.C13329g;

/* renamed from: cx.d */
public final /* synthetic */ class C16522d implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f43134a;

    /* renamed from: b */
    public final /* synthetic */ Object f43135b;

    public /* synthetic */ C16522d(Object obj, int i) {
        this.f43134a = i;
        this.f43135b = obj;
    }

    public final void onChanged(Object obj) {
        List list;
        int i = 0;
        boolean z = true;
        switch (this.f43134a) {
            case 0:
                TodRidesCenterActivity todRidesCenterActivity = (TodRidesCenterActivity) this.f43135b;
                List list2 = (List) obj;
                TodRidesCenterActivity.C15487b bVar = todRidesCenterActivity.f40204Y;
                if (list2 != null) {
                    list = list2;
                } else {
                    list = Collections.emptyList();
                }
                C1208m.C1212d a = C1208m.m3293a(new C18673i(bVar.f40207o, list), true);
                bVar.f40207o.clear();
                bVar.f40207o.addAll(list);
                a.mo5103b(new C1164b(bVar));
                if (C13717b.m34258e(list2) || list2.size() <= 1) {
                    z = false;
                }
                TabLayout tabLayout = todRidesCenterActivity.f40203X;
                if (!z) {
                    i = 8;
                }
                tabLayout.setVisibility(i);
                return;
            case 1:
                C20283g gVar = (C20283g) this.f43135b;
                gVar.mo52457i(gVar.f51438l.getValue(), (PaymentOptions) obj, gVar.f51436j.getValue(), gVar.f51435i.getValue());
                return;
            case 2:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) this.f43135b;
                List list3 = (List) obj;
                C20703a e = paymentGatewayFragment.f42664p.mo52454e();
                PaymentGatewayInstructions paymentGatewayInstructions = null;
                if (e != null) {
                    paymentGatewayInstructions = e.f52278b;
                }
                if (paymentGatewayInstructions != null) {
                    CreditCardInstructions creditCardInstructions = paymentGatewayInstructions.f42679d;
                    if (e.f52283g && C13717b.m34258e(list3) && paymentGatewayFragment.f42672x && paymentGatewayInstructions.f42680e == null && creditCardInstructions != null) {
                        paymentGatewayFragment.f42672x = false;
                        paymentGatewayFragment.f42663o.mo772a(PaymentCreditCardActivity.m64074y2(paymentGatewayFragment.requireContext(), creditCardInstructions, CreditCardRequest.Action.ADD, true, C25754i.payment_my_account_add_title, C25754i.payment_my_account_add_subtitle));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SearchLocationActivity searchLocationActivity = (SearchLocationActivity) this.f43135b;
                C7606b.C7608b bVar2 = (C7606b.C7608b) obj;
                RecyclerView.Adapter adapter = searchLocationActivity.f23128o0.getAdapter();
                searchLocationActivity.f23128o0.setTag(bVar2);
                searchLocationActivity.f23124Z.mo51055y(bVar2.f23178c);
                searchLocationActivity.mo23893D2(bVar2);
                if (bVar2.f23181f != null) {
                    C20795a aVar = searchLocationActivity.f23123Y;
                    if (adapter != aVar) {
                        searchLocationActivity.f23128o0.mo4627l0(aVar);
                        return;
                    }
                    return;
                } else if (C20964s0.m49090h(bVar2.f23177b) || !bVar2.f23178c.isEmpty()) {
                    C13322b bVar3 = searchLocationActivity.f23124Z;
                    if (adapter != bVar3) {
                        searchLocationActivity.f23128o0.mo4627l0(bVar3);
                        return;
                    }
                    return;
                } else if (!"autocomplete".equals(bVar2.f23176a) || !(true ^ searchLocationActivity.f23129p0.f23162g.isEmpty())) {
                    SearchLocationActivity.C7599b bVar4 = searchLocationActivity.f23122X;
                    if (adapter != bVar4) {
                        searchLocationActivity.f23128o0.mo4627l0(bVar4);
                        return;
                    }
                    return;
                } else {
                    RecyclerView recyclerView = searchLocationActivity.f23128o0;
                    String str = bVar2.f23177b;
                    StyleSpan styleSpan = C13329g.f33089a;
                    C13322b bVar5 = new C13322b(searchLocationActivity);
                    bVar5.mo51055y(Collections.singletonList(C12692a.m32433i(searchLocationActivity, "special_actions", str, new SearchLocationSpecialActions("deep_search", "chose_on_map"))));
                    recyclerView.mo4627l0(bVar5);
                    return;
                }
            default:
                TransactionHistoryActivity transactionHistoryActivity = (TransactionHistoryActivity) this.f43135b;
                Calendar calendar = (Calendar) obj;
                transactionHistoryActivity.f23374X.setTag(calendar);
                ListItemView listItemView = transactionHistoryActivity.f23374X;
                long timeInMillis = calendar.getTimeInMillis();
                SimpleDateFormat simpleDateFormat = C7925b.f23934a;
                listItemView.setSubtitle((CharSequence) DateUtils.formatDateTime(transactionHistoryActivity, timeInMillis, 52));
                return;
        }
    }
}
