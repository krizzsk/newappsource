package p501fw;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.C15364b;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o00.C18665b;
import p122i7.C5297a;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: fw.g */
public class C17108g extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f44278o = 0;

    /* renamed from: n */
    public C15364b f44279n;

    /* renamed from: fw.g$a */
    public class C17109a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final List<SubscriptionDetails> f44280g;

        public C17109a(List<SubscriptionDetails> list) {
            C21100e.m49373x(list, "subscriptions");
            this.f44280g = list;
        }

        public final int getItemCount() {
            return this.f44280g.size();
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            C12797f fVar = (C12797f) a0Var;
            SubscriptionDetails subscriptionDetails = this.f44280g.get(i);
            ((TextView) fVar.mo39639f(R.id.title)).setText(subscriptionDetails.f39790d);
            ((TextView) fVar.mo39639f(R.id.subtitle)).setText(C20964s0.m49102t(C17108g.this.getString(R.string.string_list_delimiter_dot), subscriptionDetails.f39789c, subscriptionDetails.f39791e));
            ((TextView) fVar.mo39639f(R.id.price)).setText(subscriptionDetails.f39794h.toString());
            ((TextView) fVar.mo39639f(R.id.priceSubtitle)).setText(C17108g.this.getString(R.string.subscription_per_month));
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, R.layout.subscription_active_list_item, viewGroup, false));
        }
    }

    public C17108g() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f44279n = (C15364b) new C1026n0(requireActivity()).mo4313a(C15364b.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.subscriptions_fragment_active, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.mo4593g(new C18665b(recyclerView.getContext(), R.drawable.divider_horizontal), -1);
        String string = getString(R.string.terms_of_service);
        C17106e eVar = new C17106e(this);
        String string2 = getString(R.string.privacy_policy);
        C17107f fVar = new C17107f(this);
        String string3 = getString(R.string.terms_and_privacy, string, string2);
        SpannableString spannableString = new SpannableString(string3);
        int indexOf = string3.indexOf(string);
        if (indexOf != -1) {
            spannableString.setSpan(eVar, indexOf, string.length() + indexOf, 33);
        }
        int indexOf2 = string3.indexOf(string2);
        if (indexOf2 != -1) {
            spannableString.setSpan(fVar, indexOf2, string2.length() + indexOf2, 33);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.legal);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "active_subscription_screen_impression");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f44279n.f39783e.observe(getViewLifecycleOwner(), new C5297a(this, 3));
    }
}
