package v30;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.confirmation.MicroMobilityConfirmationStep;
import com.moovit.micromobility.purchase.step.confirmation.MicroMobilityRideDisclaimer;
import com.moovit.micromobility.purchase.step.filter.MicroMobilityAppliedFilters;
import com.moovit.micromobility.ride.MicroMobilityVehicleCondition;
import com.moovit.payment.confirmation.summary.PaymentSummaryFragment;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.util.CurrencyAmount;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l30.C5566a0;
import l30.C5577i;
import l30.C5597z;
import p145k5.C5488g;
import p216q1.C6133b;
import p242s1.C6333d0;
import p310x5.C7156a;
import p373au.C13536h;
import p376ax.C13545g;
import p484ff.C16982k0;
import p543hq.C17474b;
import p644lx.C18284b;
import p735pt.C18983d;
import p805su.C19558n;
import p858uz.C20061g;
import p977zz.C20941h;
import p977zz.C20963s;
import p977zz.C20964s0;
import u30.C6688b;
import w50.C20283g;
import y50.C20703a;

/* renamed from: v30.a */
public class C6855a extends C15682c<MicroMobilityPurchaseActivity> implements PaymentGatewayFragment.C16322a {

    /* renamed from: q */
    public static final /* synthetic */ int f21206q = 0;

    /* renamed from: n */
    public MicroMobilityConfirmationStep f21207n;

    /* renamed from: o */
    public C6688b f21208o;

    /* renamed from: p */
    public C20283g f21209p;

    public C6855a() {
        super(MicroMobilityPurchaseActivity.class);
    }

    /* renamed from: A1 */
    public final /* synthetic */ boolean mo23103A1() {
        return false;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo23104E() {
    }

    /* renamed from: I */
    public final PaymentGatewayInfo mo23105I() {
        return new PaymentGatewayInfo(this.f21207n.f14932m, PurchaseVerificationType.NONE, (String) null, Collections.singletonMap("context_id", this.f21207n.f14920b));
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: L */
    public final CharSequence mo23106L() {
        return this.f21207n.f14924e;
    }

    /* renamed from: M */
    public final /* synthetic */ void mo23107M() {
    }

    /* renamed from: c0 */
    public final void mo23108c0(PaymentGatewayToken paymentGatewayToken) {
        String str;
        mo46796i2();
        C20703a e = this.f21209p.mo52454e();
        if (e != null) {
            str = e.f52279c;
        } else {
            str = null;
        }
        String str2 = str;
        LatLonE6 j = LatLonE6.m40177j(mo46780O1());
        C6688b bVar = this.f21208o;
        String str3 = this.f21207n.f14920b;
        bVar.getClass();
        C5577i a = C5577i.m13786a();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C5488g(a, 7)).onSuccessTask(executorService, new C19558n(str3, paymentGatewayToken, str2, j, 1)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C18983d(1)).addOnCompleteListener((Executor) executorService, new C16982k0(a, 2)).addOnCompleteListener((Executor) executorService, new C20963s(bVar.f20767b));
    }

    /* renamed from: n0 */
    public final C17474b.C17475a mo23109n0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, this.f21207n.f14921c);
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21207n = (MicroMobilityConfirmationStep) mo46782Q1().getParcelable("step");
        this.f21208o = (C6688b) new C1026n0(this).mo4313a(C6688b.class);
        this.f21209p = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
        this.f21208o.f20767b.observe(this, new C13545g(this, 2));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_confirmation_step_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        ((MicroMobilityPurchaseActivity) this.f40822c).setTitle(this.f21207n.f14922d);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_step_impression");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, this.f21207n.f14921c);
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        SpannableStringBuilder spannableStringBuilder;
        super.onViewCreated(view, bundle);
        MicroMobilityAppliedFilters microMobilityAppliedFilters = this.f21207n.f14929j;
        View findViewById = view.findViewById(C5597z.filters);
        if (microMobilityAppliedFilters == null) {
            findViewById.setVisibility(8);
        } else {
            TextView textView = (TextView) findViewById.findViewById(C5597z.applied_filters);
            if (microMobilityAppliedFilters.f14939b.size() == 0) {
                spannableStringBuilder = null;
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < microMobilityAppliedFilters.f14939b.size(); i++) {
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append(C20964s0.f52718a);
                    }
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(microMobilityAppliedFilters.f14939b.get(i)).append(": ");
                    spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append(microMobilityAppliedFilters.f14940c.get(i));
                }
            }
            textView.setText(spannableStringBuilder);
            ((Button) findViewById.findViewById(C5597z.change_filters)).setOnClickListener(new C18284b(this, 6));
            findViewById.setVisibility(0);
        }
        ListItemView listItemView = (ListItemView) view.findViewById(C5597z.title);
        listItemView.setTitle((CharSequence) this.f21207n.f14925f);
        listItemView.setSubtitle((CharSequence) this.f21207n.f14926g);
        TextView textView2 = (TextView) view.findViewById(C5597z.description);
        String str = this.f21207n.f14927h;
        if (C20964s0.m49090h(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(C6133b.m14694a(str));
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById2 = view.findViewById(C5597z.card_divider);
        ListItemView listItemView2 = (ListItemView) view.findViewById(C5597z.condition);
        MicroMobilityVehicleCondition microMobilityVehicleCondition = this.f21207n.f14928i;
        if (microMobilityVehicleCondition != null) {
            listItemView2.setIcon(microMobilityVehicleCondition.f15000b);
            listItemView2.setTitle((CharSequence) microMobilityVehicleCondition.f15001c);
            listItemView2.setAccessoryText((CharSequence) microMobilityVehicleCondition.f15003e);
            View accessoryView = listItemView2.getAccessoryView();
            if (accessoryView != null) {
                accessoryView.setOnClickListener(new C13536h(4, this, microMobilityVehicleCondition));
            }
            String str2 = microMobilityVehicleCondition.f15002d;
            if (str2 != null) {
                listItemView2.setOnClickListener(new C7156a(6, this, str2));
            } else {
                listItemView2.setOnClickListener((View.OnClickListener) null);
                listItemView2.setClickable(false);
            }
            UiUtils.m40238F(0, findViewById2, listItemView2);
        } else {
            UiUtils.m40238F(8, findViewById2, listItemView2);
        }
        ListItemView listItemView3 = (ListItemView) view.findViewById(C5597z.disclaimer_view);
        MicroMobilityRideDisclaimer microMobilityRideDisclaimer = this.f21207n.f14930k;
        if (microMobilityRideDisclaimer == null) {
            listItemView3.setVisibility(8);
        } else {
            listItemView3.setIcon(microMobilityRideDisclaimer.f14934b);
            listItemView3.setTitle((CharSequence) microMobilityRideDisclaimer.f14935c);
            listItemView3.setSubtitle((CharSequence) microMobilityRideDisclaimer.f14936d);
            C6333d0.m15032t(listItemView3, C20941h.m49044g(microMobilityRideDisclaimer.f14937e.getColorAttrId(), view.getContext()));
            listItemView3.setVisibility(0);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.mo3923A("payment_summary") == null) {
            C0909a aVar = new C0909a(childFragmentManager);
            aVar.mo4111f(C5597z.payment_summary, PaymentSummaryFragment.m41613m2(this.f21207n.f14931l, (CurrencyAmount) null), "payment_summary");
            aVar.mo4040d();
        }
    }
}
