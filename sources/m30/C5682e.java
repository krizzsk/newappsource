package m30;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.network.model.ServerId;
import l30.C5566a0;
import l30.C5577i;
import p543hq.C17474b;
import p809sy.C19574a;
import p824tp.C19731i;

/* renamed from: m30.e */
public class C5682e extends C15676b<MoovitActivity> {

    /* renamed from: k */
    public static final String f18466k = C5682e.class.getSimpleName();

    /* renamed from: h */
    public ServerId f18467h;

    /* renamed from: i */
    public RatingBar f18468i;

    /* renamed from: j */
    public Button f18469j;

    public C5682e() {
        super(MoovitActivity.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18467h = (ServerId) requireArguments().getParcelable("rideId");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5566a0.micro_mobility_ride_rating_dialog_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_micro_mobility_ride_rating");
        aVar.mo49937e(AnalyticsAttributeKey.ID, this.f18467h);
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_micro_mobility_ride_rating");
        aVar.mo49937e(AnalyticsAttributeKey.ID, this.f18467h);
        mo22564R1(aVar.mo49933a());
        Context requireContext = requireContext();
        C19731i.m47197a(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C5577i.m13786a().mo21403d(this.f18467h).addOnCompleteListener((Activity) this.f40792c, new C19574a(1, this, view));
    }
}
