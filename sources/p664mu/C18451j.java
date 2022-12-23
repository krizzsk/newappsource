package p664mu;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.view.PromotionBannerView;
import com.tranzmate.R;
import java.util.Set;
import p039c7.C1800c;
import p073e7.C4584b;
import p130j2.C5367a;
import p244s3.C6442q;
import p259t5.C6592b;
import p297w5.C6996c;
import p532hf.C17427b;
import p543hq.C17474b;
import p858uz.C20061g;
import w40.C25761d;

/* renamed from: mu.j */
public class C18451j extends C15682c<MoovitAppActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f47036q = 0;

    /* renamed from: n */
    public final C18452a f47037n = new C18452a();

    /* renamed from: o */
    public ListItemView f47038o;

    /* renamed from: p */
    public ViewGroup f47039p;

    /* renamed from: mu.j$a */
    public class C18452a extends BroadcastReceiver {
        public C18452a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C18451j jVar = C18451j.this;
            int i = C18451j.f47036q;
            jVar.mo50896o2();
        }
    }

    public C18451j() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "MOT_SUPPORT_VALIDATOR");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo50896o2();
    }

    /* renamed from: m2 */
    public final void mo50894m2(Trace trace) {
        trace.putAttribute("type", "hide");
        trace.stop();
        mo50895n2();
        this.f47038o.setVisibility(8);
    }

    /* renamed from: n2 */
    public final void mo50895n2() {
        if (this.f47039p.getChildCount() > 1) {
            ViewGroup viewGroup = this.f47039p;
            viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        }
    }

    /* renamed from: o2 */
    public final void mo50896o2() {
        if (getView() != null && this.f40824e && mo46775H1()) {
            C17427b.m43467a().getClass();
            Trace d = Trace.m36075d("mot_section");
            d.start();
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C6442q(2, this, d)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18448g(this, d, 0));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f40824e) {
            mo50896o2();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mot_section_fragment, viewGroup, false);
        this.f47039p = (ViewGroup) inflate.findViewById(R.id.container);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.header);
        this.f47038o = listItemView;
        listItemView.getAccessoryView().setOnClickListener(new C1800c(this, 15));
        this.f47038o.getAccessoryView().setVisibility(8);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C18452a aVar = this.f47037n;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21146b(aVar, new IntentFilter("com.moovit.app.mot.action.updated"));
        mo50896o2();
    }

    public final void onStop() {
        super.onStop();
        Context requireContext = requireContext();
        C18452a aVar = this.f47037n;
        C18443f fVar = C18443f.f47013e;
        C5367a.m13473a(requireContext).mo21148d(aVar);
    }

    /* renamed from: p2 */
    public final void mo50897p2(Trace trace, PaymentAccount paymentAccount) {
        String str;
        Context context = getContext();
        if (context != null) {
            if (!Boolean.TRUE.equals((Boolean) mo46776J1("MOT_SUPPORT_VALIDATOR"))) {
                mo50894m2(trace);
                return;
            }
            boolean z = true;
            if (PaymentAccount.m64175c(paymentAccount, "IsraelMot", PaymentAccountContextStatus.DISCONNECTED)) {
                trace.putAttribute("type", "mot_state_reconnect");
                trace.stop();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_state_reconnect");
                mo46797j2(aVar.mo49933a());
                mo50895n2();
                this.f47038o.setVisibility(0);
                this.f47038o.getAccessoryView().setVisibility(0);
                this.f47038o.setTag((Object) null);
                View inflate = getLayoutInflater().inflate(R.layout.mot_section_reconnect_user_view, this.f47039p, false);
                inflate.setOnClickListener(new C6996c(this, 19));
                this.f47039p.addView(inflate);
                return;
            }
            if (PaymentAccount.m64175c(paymentAccount, "IsraelMot", PaymentAccountContextStatus.BLACKLIST)) {
                Context requireContext = requireContext();
                TrackingEvent trackingEvent = TrackingEvent.MOT_ACCOUNT_BLACKLIST_CLICKED;
                if (requireContext.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) < trackingEvent.getMaxOccurrences()) {
                    z = false;
                }
                if (z) {
                    mo50894m2(trace);
                    return;
                }
                trace.putAttribute("type", "mot_state_blacklist");
                trace.stop();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_state_blacklist");
                mo46797j2(aVar2.mo49933a());
                mo50895n2();
                this.f47038o.setVisibility(0);
                this.f47038o.getAccessoryView().setVisibility(0);
                this.f47038o.setTag((Object) null);
                View inflate2 = getLayoutInflater().inflate(R.layout.mot_section_blacklist_user_view, this.f47039p, false);
                inflate2.setOnClickListener(new C6592b(this, 17));
                this.f47039p.addView(inflate2);
                return;
            }
            if (PaymentAccount.m64175c(paymentAccount, "IsraelMot", PaymentAccountContextStatus.CONNECTED)) {
                LayoutInflater from = LayoutInflater.from(context);
                this.f47038o.setVisibility(0);
                this.f47038o.getAccessoryView().setVisibility(0);
                ListItemView listItemView = (ListItemView) from.inflate(R.layout.mot_section_registered_user_view, this.f47039p, false);
                listItemView.setOnClickListener(new C4584b(this, 18));
                if (this.f47039p.findViewById(R.id.registered_user_view) == null) {
                    this.f47039p.addView(listItemView);
                }
                C18443f.m45298d().mo50888b().addOnSuccessListener((Activity) requireActivity(), new C18449h(this, trace, paymentAccount, from)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18450i(this, trace, 0));
                return;
            }
            trace.putAttribute("type", "mot_state_join_service");
            trace.stop();
            mo50895n2();
            this.f47038o.setVisibility(0);
            this.f47038o.getAccessoryView().setVisibility(8);
            this.f47038o.setTag((Object) null);
            PromotionBannerView promotionBannerView = (PromotionBannerView) getLayoutInflater().inflate(R.layout.mot_section_join_banner_view, this.f47039p, false);
            promotionBannerView.setListener(new C18453k(this, paymentAccount));
            long dismissTime = promotionBannerView.getDismissTime();
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "mot_state_join_service");
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.BANNER_TYPE;
            if (((Integer) promotionBannerView.getTag(R.id.view_tag_param1)).intValue() == R.layout.promotion_banner_large_view) {
                str = "mot_join_banner_large";
            } else {
                str = "mot_join_banner_standard";
            }
            aVar3.mo49939g(analyticsAttributeKey, str);
            AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.DATE;
            if (dismissTime == -1) {
                dismissTime = Long.MAX_VALUE;
            }
            aVar3.mo49936d(analyticsAttributeKey2, dismissTime);
            mo46797j2(aVar3.mo49933a());
            this.f47039p.addView(promotionBannerView);
        }
    }
}
