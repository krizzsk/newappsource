package z80;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.clearance.model.CreditCardFields;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions;
import com.moovit.view.p340cc.CreditCardFormView;
import m80.C12869e;
import m80.C12870f;
import p304x.C7099r1;
import p543hq.C17474b;

/* renamed from: z80.b */
public class C13341b extends C15682c<PurchaseSplitActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f33130n = 0;

    public C13341b() {
        super(PurchaseSplitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo40233m2(boolean z) {
        boolean z2 = requireArguments().getBoolean("isPrimary");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "credit_card");
        aVar.mo49941i(AnalyticsAttributeKey.IS_PRIMARY_CREDIT_CARD, z2);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        mo46797j2(aVar.mo49933a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.split_purchase_credit_card_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        ((PurchaseSplitActivity) this.f40822c).setTitle("");
        MoovitExecutors.MAIN_THREAD.execute(new C7099r1(this, 14));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        Bundle Q1 = mo46782Q1();
        PurchaseSplitInstructions purchaseSplitInstructions = (PurchaseSplitInstructions) Q1.getParcelable("instructions");
        String string = Q1.getString("title");
        String string2 = Q1.getString("subtitle");
        if (purchaseSplitInstructions == null || string == null || string2 == null) {
            throw new IllegalStateException("Did you use SplitPurchaseCreditCardFragment.newInstance(...)?");
        }
        ((TextView) view.findViewById(C12869e.title)).setText(string);
        ((TextView) view.findViewById(C12869e.subtitle)).setText(string2);
        CreditCardFormView creditCardFormView = (CreditCardFormView) view.findViewById(C12869e.card_form);
        CreditCardFields creditCardFields = purchaseSplitInstructions.f23289c;
        if (creditCardFields != null) {
            i = creditCardFields.mo48870b();
        } else {
            i = 0;
        }
        creditCardFormView.setRequiredFields(i);
        ((Button) view.findViewById(C12869e.button)).setOnClickListener(new C4054t(10, this, creditCardFormView));
    }
}
