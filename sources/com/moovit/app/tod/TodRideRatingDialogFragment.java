package com.moovit.app.tod;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import b00.C13556a;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p066e0.C4452q0;
import p543hq.C17474b;
import p567iq.C17635b;
import p596jx.C17970r;
import p596jx.C17971s;
import p900wt.C20415e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

public class TodRideRatingDialogFragment extends C15676b<MoovitAppActivity> {

    /* renamed from: q */
    public static final String f40018q = TodRideRatingDialogFragment.class.getSimpleName();

    /* renamed from: r */
    public static final SparseArray<RatingReaction> f40019r;

    /* renamed from: h */
    public String f40020h;

    /* renamed from: i */
    public RatingBar f40021i;

    /* renamed from: j */
    public TextView f40022j;

    /* renamed from: k */
    public TextInputLayout f40023k;

    /* renamed from: l */
    public EditText f40024l;

    /* renamed from: m */
    public Button f40025m;

    /* renamed from: n */
    public ProgressBar f40026n;

    /* renamed from: o */
    public C13556a f40027o;

    /* renamed from: p */
    public final C15453a f40028p = new C15453a();

    public enum RatingReaction {
        BAD(R.string.tod_passenger_rate_bad_response, R.string.tod_passenger_rate_bad_placeholder),
        AVERAGE(R.string.tod_passenger_rate_avg_response, R.string.tod_passenger_rate_avg_placeholder),
        GOOD(R.string.tod_passenger_rate_good_response, R.string.tod_passenger_rate_good_placeholder),
        GREAT(R.string.tod_passenger_rate_great_response, R.string.tod_passenger_rate_great_placeholder);
        
        public final int commentHintResId;
        public final int reactionResId;

        private RatingReaction(int i, int i2) {
            this.reactionResId = i;
            this.commentHintResId = i2;
        }
    }

    /* renamed from: com.moovit.app.tod.TodRideRatingDialogFragment$a */
    public class C15453a extends C20438i<C17970r, C17971s> {
        public C15453a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17970r rVar = (C17970r) cVar;
            TodRideRatingDialogFragment todRideRatingDialogFragment = TodRideRatingDialogFragment.this;
            todRideRatingDialogFragment.f40027o = null;
            todRideRatingDialogFragment.mo46192S1(false);
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17970r rVar = (C17970r) cVar;
            C17971s sVar = (C17971s) gVar;
            TodRideRatingDialogFragment todRideRatingDialogFragment = TodRideRatingDialogFragment.this;
            String str = rVar.f46052w;
            int i = rVar.f46053x;
            String str2 = TodRideRatingDialogFragment.f40018q;
            todRideRatingDialogFragment.getClass();
            todRideRatingDialogFragment.mo46753L1(C15454b.class, new C20415e(str, i));
            Toast.makeText(todRideRatingDialogFragment.getContext(), R.string.tod_passenger_rate_thanks, 1).show();
            todRideRatingDialogFragment.dismissAllowingStateLoss();
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C17970r rVar = (C17970r) cVar;
            return false;
        }
    }

    /* renamed from: com.moovit.app.tod.TodRideRatingDialogFragment$b */
    public interface C15454b {
        /* renamed from: i0 */
        void mo46193i0();

        /* renamed from: r0 */
        void mo46194r0(int i);
    }

    static {
        SparseArray<RatingReaction> sparseArray = new SparseArray<>(5);
        f40019r = sparseArray;
        RatingReaction ratingReaction = RatingReaction.BAD;
        sparseArray.put(1, ratingReaction);
        sparseArray.put(2, ratingReaction);
        sparseArray.put(3, RatingReaction.AVERAGE);
        sparseArray.put(4, RatingReaction.GOOD);
        sparseArray.put(5, RatingReaction.GREAT);
    }

    public TodRideRatingDialogFragment() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(requireContext()).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo46192S1(boolean z) {
        int i;
        ProgressBar progressBar = this.f40026n;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        progressBar.setVisibility(i);
        Button button = this.f40025m;
        if (z) {
            i2 = 4;
        }
        button.setVisibility(i2);
        this.f40021i.setEnabled(!z);
        this.f40023k.setEnabled(!z);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo46753L1(C15454b.class, new C4452q0(12));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f40020h = mo46752K1().getString("rideId");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.tod_ride_rating_dialog_fragment, viewGroup, false);
        RatingBar ratingBar = (RatingBar) inflate.findViewById(R.id.rating);
        this.f40021i = ratingBar;
        ratingBar.setOnRatingBarChangeListener(new C15461a(this));
        Button button = (Button) inflate.findViewById(R.id.action);
        this.f40025m = button;
        button.setOnClickListener(new C4052r(this, 23));
        this.f40022j = (TextView) inflate.findViewById(R.id.reaction);
        this.f40023k = (TextInputLayout) inflate.findViewById(R.id.comment_text_input);
        this.f40024l = (EditText) inflate.findViewById(R.id.comment);
        this.f40026n = (ProgressBar) inflate.findViewById(R.id.progress);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22849g(requireContext, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_tod_ride_rating");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        mo22564R1(new C17474b(AnalyticsEventKey.CLOSE_POPUP));
        Context requireContext = requireContext();
        C17635b.m43779f(requireContext).f50173c.mo22847b(requireContext, AnalyticsFlowKey.POPUP, true);
        C13556a aVar = this.f40027o;
        if (aVar != null) {
            aVar.cancel(true);
            this.f40027o = null;
        }
    }
}
