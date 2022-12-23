package p501fw;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.C15364b;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.app.subscription.model.SubscriptionPeriod;
import com.moovit.commons.utils.UiUtils;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import ja0.C12793c;
import ja0.C12797f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p102h0.C5021e;
import p145k5.C5488g;
import p259t5.C6592b;
import p297w5.C6994a;
import p304x.C7072l1;
import p543hq.C17474b;
import p977zz.C20963s;
import p977zz.C20964s0;
import z20.C20806a;

/* renamed from: fw.k */
public class C17113k extends C15682c<MoovitActivity> {

    /* renamed from: p */
    public static final BigDecimal f44286p = new BigDecimal(100);

    /* renamed from: n */
    public C15364b f44287n;

    /* renamed from: o */
    public ViewGroup f44288o;

    /* renamed from: fw.k$a */
    public class C17114a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C6592b f44289g = new C6592b(this, 29);

        /* renamed from: h */
        public final List<SubscriptionDetails> f44290h;

        /* renamed from: i */
        public final SubscriptionDetails f44291i;

        /* renamed from: j */
        public final SubscriptionDetails f44292j;

        /* renamed from: k */
        public int f44293k;

        public C17114a(List<SubscriptionDetails> list) {
            C21100e.m49373x(list, "offers");
            this.f44290h = Collections.unmodifiableList(list);
            C7072l1 l1Var = new C7072l1(5);
            this.f44291i = (SubscriptionDetails) Collections.max(list, l1Var);
            SubscriptionDetails subscriptionDetails = (SubscriptionDetails) Collections.min(list, l1Var);
            this.f44292j = subscriptionDetails;
            this.f44293k = list.indexOf(subscriptionDetails);
        }

        public final int getItemCount() {
            return this.f44290h.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            boolean z;
            boolean z2;
            int i2;
            boolean z3;
            String str;
            C12797f fVar = (C12797f) a0Var;
            Context e = fVar.mo39638e();
            SubscriptionDetails subscriptionDetails = this.f44290h.get(i);
            RadioButton radioButton = (RadioButton) fVar.mo39639f(R.id.radio);
            if (this.f44293k == i) {
                z = true;
            } else {
                z = false;
            }
            radioButton.setChecked(z);
            ((TextView) fVar.mo39639f(R.id.title)).setText(subscriptionDetails.f39790d);
            ((TextView) fVar.mo39639f(R.id.subtitle)).setText(C20964s0.m49102t(e.getString(R.string.string_list_delimiter_dot), subscriptionDetails.f39789c, subscriptionDetails.f39791e));
            ((TextView) fVar.mo39639f(R.id.price)).setText(subscriptionDetails.f39794h.toString());
            ((TextView) fVar.mo39639f(R.id.priceSubtitle)).setText(e.getString(R.string.subscription_per_month));
            View view = fVar.itemView;
            if (this.f44293k == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            view.setActivated(z2);
            View f = fVar.mo39639f(R.id.popular);
            if (this.f44292j.equals(subscriptionDetails)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            f.setVisibility(i2);
            TextView textView = (TextView) fVar.mo39639f(R.id.discount_badge);
            if (this.f44293k == i) {
                z3 = true;
            } else {
                z3 = false;
            }
            textView.setActivated(z3);
            CurrencyAmount currencyAmount = this.f44291i.f39794h;
            CurrencyAmount currencyAmount2 = subscriptionDetails.f39794h;
            BigDecimal bigDecimal = C17113k.f44286p;
            BigDecimal bigDecimal2 = currencyAmount.f23845c;
            BigDecimal bigDecimal3 = currencyAmount2.f23845c;
            if (bigDecimal3.compareTo(bigDecimal2) >= 0) {
                str = null;
            } else {
                BigDecimal bigDecimal4 = C17113k.f44286p;
                str = e.getString(R.string.subscription_save_percent, new Object[]{Integer.valueOf(bigDecimal4.subtract(bigDecimal3.multiply(bigDecimal4).divide(bigDecimal2, RoundingMode.FLOOR)).intValue())});
            }
            UiUtils.m40236D(textView, str, 8);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.subscription_offer_list_item, viewGroup, false));
            fVar.itemView.setTag(fVar);
            fVar.itemView.setOnClickListener(this.f44289g);
            return fVar;
        }
    }

    public C17113k() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: m2 */
    public final void mo49696m2() {
        String str;
        View view = getView();
        if (view != null && this.f44288o != null) {
            RecyclerView.Adapter adapter = ((RecyclerView) view.findViewById(R.id.recycler_view)).getAdapter();
            if (adapter instanceof C17114a) {
                C17114a aVar = (C17114a) adapter;
                SubscriptionDetails subscriptionDetails = aVar.f44290h.get(aVar.f44293k);
                aVar.f44292j.equals(subscriptionDetails);
                SubscriptionDetails subscriptionDetails2 = subscriptionDetails;
                SubscriptionPeriod subscriptionPeriod = subscriptionDetails.f39795i;
                if (subscriptionPeriod == null || subscriptionPeriod.f39797c.getDays() <= 0) {
                    str = getString(R.string.subscription_ad_free_button);
                } else {
                    str = getString(R.string.subscription_ad_free_button_trial, Integer.valueOf(subscriptionPeriod.f39797c.getDays()));
                }
                ((Button) this.f44288o.findViewById(R.id.subscribe_button)).setText(str);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44287n = (C15364b) new C1026n0(requireActivity()).mo4313a(C15364b.class);
        MarketingEventImpressionBinder.m41586a(this, new C20806a("subscription_purchase_view"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.subscriptions_fragment_purchase, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(new C12793c());
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.button_container);
        this.f44288o = viewGroup2;
        ((Button) viewGroup2.findViewById(R.id.subscribe_button)).setOnClickListener(new C6994a(this, 22));
        String string = getString(R.string.terms_of_service);
        C17111i iVar = new C17111i(this);
        String string2 = getString(R.string.privacy_policy);
        C17112j jVar = new C17112j(this);
        String string3 = getString(R.string.terms_and_privacy, string, string2);
        SpannableString spannableString = new SpannableString(string3);
        int indexOf = string3.indexOf(string);
        if (indexOf != -1) {
            spannableString.setSpan(iVar, indexOf, string.length() + indexOf, 33);
        }
        int indexOf2 = string3.indexOf(string2);
        if (indexOf2 != -1) {
            spannableString.setSpan(jVar, indexOf2, string2.length() + indexOf2, 33);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.legal);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_subscription_screen_impression");
        mo46797j2(aVar.mo49933a());
        C15364b bVar = this.f44287n;
        MoovitSubscriptionsManager c = MoovitSubscriptionsManager.m39315c((MoovitApplication) bVar.f3907b);
        c.getClass();
        Tasks.call(MoovitExecutors.f37327IO, new C5488g(c, 4)).onSuccessTask(MoovitExecutors.COMPUTATION, new C5021e(c, 12)).addOnCompleteListener(new C20963s(bVar.f39782d));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f44287n.f39782d.observe(getViewLifecycleOwner(), new C17110h(this, 0));
    }
}
