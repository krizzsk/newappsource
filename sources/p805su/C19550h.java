package p805su;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b00.C13556a;
import c00.C13717b;
import c70.C13751d;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.DistanceUtils;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import p073e7.C4583a;
import p373au.C13533e;
import p543hq.C17474b;
import p736pu.C19008p;
import p736pu.C19009q;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import z20.C20806a;

/* renamed from: su.h */
public class C19550h extends C19539a {

    /* renamed from: y */
    public static final /* synthetic */ int f49679y = 0;

    /* renamed from: n */
    public final C19551a f49680n = new C19551a();

    /* renamed from: o */
    public C13556a f49681o;

    /* renamed from: p */
    public TextView f49682p;

    /* renamed from: q */
    public View f49683q;

    /* renamed from: r */
    public PriceView f49684r;

    /* renamed from: s */
    public NumericStepperView f49685s;

    /* renamed from: t */
    public View f49686t;

    /* renamed from: u */
    public String f49687u;

    /* renamed from: v */
    public MotQrCodeActivationFare f49688v;

    /* renamed from: w */
    public ServerId f49689w;

    /* renamed from: x */
    public ServerId f49690x;

    /* renamed from: su.h$a */
    public class C19551a extends C20438i<C19008p, C19009q> {
        public C19551a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19008p pVar = (C19008p) cVar;
            C19550h hVar = C19550h.this;
            hVar.f49681o = null;
            hVar.f49686t.setEnabled(true);
            C19550h.this.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            CurrencyAmount currencyAmount;
            CurrencyAmount currencyAmount2;
            C19008p pVar = (C19008p) cVar;
            C19009q qVar = (C19009q) gVar;
            if (C19550h.this.isAdded()) {
                C19550h hVar = C19550h.this;
                ArrayList arrayList = qVar.f48364m;
                int i = C19550h.f49679y;
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) hVar.f40822c;
                if (motQrCodeActivationActivity != null) {
                    if (!C13717b.m34258e(arrayList)) {
                        MotActivation motActivation = (MotActivation) arrayList.get(0);
                        MotActivationPrice motActivationPrice = motActivation.f38995l;
                        C20806a.C20807a aVar = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                        aVar.mo52934b("mot", "feature");
                        aVar.mo52934b("IsraelMot", "payment_context");
                        aVar.mo52936d("item_id", motActivation.f38985b);
                        aVar.mo52934b(motActivation.f38986c, "item_name");
                        aVar.mo52934b(Integer.valueOf(arrayList.size()), "number_of_items");
                        aVar.mo52934b(C25541a.m63895z(C7843b.m17877d(motActivation.mo45524b())), "transit_type");
                        aVar.mo52934b(motActivation.mo45529f(), "agency_name");
                        CurrencyAmount currencyAmount3 = null;
                        if (motActivationPrice != null) {
                            currencyAmount = motActivationPrice.f39005b;
                        } else {
                            currencyAmount = null;
                        }
                        aVar.mo52938f(currencyAmount);
                        if (motActivationPrice != null) {
                            currencyAmount2 = motActivationPrice.f39005b;
                        } else {
                            currencyAmount2 = null;
                        }
                        aVar.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount2);
                        if (motActivationPrice != null) {
                            currencyAmount3 = motActivationPrice.mo45548b(arrayList.size());
                        }
                        aVar.mo52937e("revenue", currencyAmount3);
                        aVar.mo52935c();
                    }
                    int i2 = MotActivationConfirmationActivity.f38971Y;
                    Intent intent = new Intent(motQrCodeActivationActivity, MotActivationConfirmationActivity.class);
                    intent.putParcelableArrayListExtra("activations", C13717b.m34264k(arrayList));
                    motQrCodeActivationActivity.startActivity(intent);
                    motQrCodeActivationActivity.finish();
                }
            }
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19008p pVar = (C19008p) cVar;
            if (!C19550h.this.isAdded()) {
                return true;
            }
            C19550h hVar = C19550h.this;
            hVar.mo46795h2(C13751d.m34341b(hVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: p2 */
    public static CharSequence m46922p2(Context context, MotQrCodeActivationFare motQrCodeActivationFare) {
        String str = motQrCodeActivationFare.f39056c.f39013b.f39011d;
        String string = context.getString(R.string.payment_mot_passenger_distance, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(context, (float) motQrCodeActivationFare.f39055b.f39017c), context)});
        return C20964s0.m49099q(C20964s0.f52718a, str, string);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: m2 */
    public final int mo51895m2() {
        return R.string.payment_mot_passenger_title;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle Q1 = mo46782Q1();
        this.f49687u = Q1.getString("activationContext");
        this.f49688v = (MotQrCodeActivationFare) Q1.getParcelable("activationFare");
        this.f49689w = (ServerId) Q1.getParcelable("lineId");
        this.f49690x = (ServerId) Q1.getParcelable("destinationStopId");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.mot_qr_code_activation_fare_summery_fragment, viewGroup, false);
        NumericStepperView numericStepperView = (NumericStepperView) inflate.findViewById(R.id.numeric_stepper_view);
        this.f49685s = numericStepperView;
        numericStepperView.setListener(new C13533e(this, 8));
        MotActivationPrice motActivationPrice = this.f49688v.f39056c.f39014c;
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.passenger_ticket_view).findViewById(R.id.ticket_fare_view);
        if (motActivationPrice.mo45549c()) {
            i = R.string.payment_mot_passenger_fare_discount;
        } else {
            i = R.string.payment_mot_passenger_fare_regular;
        }
        listItemView.setTitle(i);
        listItemView.setSubtitle(m46922p2(inflate.getContext(), this.f49688v));
        ((PriceView) listItemView.getAccessoryView()).mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
        View findViewById = inflate.findViewById(R.id.additional_passenger_ticket_view);
        this.f49683q = findViewById;
        ListItemView listItemView2 = (ListItemView) findViewById.findViewById(R.id.ticket_fare_view);
        listItemView2.setTitle((int) R.string.payment_mot_passenger_fare_extra);
        listItemView2.setSubtitle(m46922p2(inflate.getContext(), this.f49688v));
        this.f49682p = (TextView) inflate.findViewById(R.id.ticket_fare_info);
        this.f49684r = (PriceView) ((ListItemView) inflate.findViewById(R.id.total_price_sum)).getAccessoryView();
        View findViewById2 = inflate.findViewById(R.id.validate_view);
        this.f49686t = findViewById2;
        findViewById2.setEnabled(true);
        this.f49686t.setOnClickListener(new C4583a(this, 18));
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        mo51897o2();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_fare_summary_impression");
        aVar.mo49937e(AnalyticsAttributeKey.ID, this.f49688v.f39055b.f39016b);
        aVar.mo49937e(AnalyticsAttributeKey.ITEM_ID, this.f49688v.f39056c.f39013b.f39009b);
        mo46797j2(aVar.mo49933a());
        C20806a.C20807a aVar2 = new C20806a.C20807a("fare_confirmation_view");
        aVar2.mo52934b("mot", "feature");
        MarketingEventImpressionBinder.m41586a(this, aVar2.mo52933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51906q2();
    }

    /* renamed from: q2 */
    public final void mo51906q2() {
        this.f49684r.setPrice(this.f49688v.f39056c.f39014c.mo45548b(this.f49685s.getCounter()));
        String string = getString(R.string.payment_mot_extra_passenger_fare_explanation);
        String string2 = getString(R.string.payment_mot_passenger_fare_explanation);
        if (this.f49685s.getCounter() - 1 > 0) {
            C20964s0.m49081B(this.f49682p, string, R.attr.textAppearanceBodySmallStrong, R.attr.colorOnSurfaceEmphasisHigh, string2, R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisHigh, C20964s0.f52718a);
            MotActivationPrice motActivationPrice = this.f49688v.f39056c.f39014c;
            TextView textView = (TextView) this.f49683q.findViewById(R.id.price);
            textView.setText(motActivationPrice.f39006c.toString());
            int counter = this.f49685s.getCounter() - 1;
            ((FormatTextView) this.f49683q.findViewById(R.id.passenger_count)).setArguments(Integer.valueOf(counter));
            C13382a.m33674j(this.f49683q, ((ListItemView) this.f49683q.findViewById(R.id.ticket_fare_view)).getContentDescription(), this.f49683q.getResources().getString(R.string.voiceover_number_passengers_price_for_each, new Object[]{Integer.valueOf(counter), textView.getText()}));
            this.f49683q.setVisibility(0);
            return;
        }
        this.f49682p.setText(string2);
        C20964s0.m49107y(this.f49682p, R.attr.textAppearanceBodySmall, R.attr.colorOnSurfaceEmphasisHigh);
        this.f49683q.setVisibility(8);
    }
}
