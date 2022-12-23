package p661mr;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import b00.C13556a;
import com.moovit.C15676b;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.referral.CarpoolReferralCouponDetails;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import p304x.C7078n;
import p358af.C13437d;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: mr.d */
public class C18427d extends C15676b<MoovitActivity> {

    /* renamed from: s */
    public static final /* synthetic */ int f46976s = 0;

    /* renamed from: h */
    public TextView f46977h;

    /* renamed from: i */
    public TextView f46978i;

    /* renamed from: j */
    public LinearLayout f46979j;

    /* renamed from: k */
    public LinearLayout f46980k;

    /* renamed from: l */
    public Button f46981l;

    /* renamed from: m */
    public TextView f46982m;

    /* renamed from: n */
    public TextView f46983n;

    /* renamed from: o */
    public View f46984o;

    /* renamed from: p */
    public CarpoolReferralCouponDetails f46985p = null;

    /* renamed from: q */
    public C13556a f46986q = null;

    /* renamed from: r */
    public RotateAnimation f46987r;

    /* renamed from: mr.d$a */
    public class C18428a implements View.OnClickListener {
        public C18428a() {
        }

        public final void onClick(View view) {
            C18427d dVar = C18427d.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "share_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.REFERRAL_CODE, C18427d.this.f46985p.f37811b);
            C17474b a = aVar.mo49933a();
            Fragment parentFragment = dVar.getParentFragment();
            if (parentFragment == null || !(parentFragment instanceof C15682c)) {
                dVar.mo22564R1(a);
            } else {
                ((C15682c) parentFragment).mo46797j2(a);
            }
            C18427d dVar2 = C18427d.this;
            CarpoolReferralCouponDetails carpoolReferralCouponDetails = dVar2.f46985p;
            String str = carpoolReferralCouponDetails.f37811b;
            String currencyAmount = carpoolReferralCouponDetails.f37814e.toString();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", dVar2.getString(R.string.carpool_referral_share_social_body, str, currencyAmount) + "\n" + dVar2.f46985p.f37812c);
            intent.setType("text/plain");
            intent.addFlags(1);
            dVar2.startActivity(Intent.createChooser(intent, (CharSequence) null));
            C18427d.this.dismiss();
        }
    }

    public C18427d() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public final void mo50879S1() {
        this.f46977h.setText(this.f46985p.f37814e.toString());
        this.f46978i.setText(this.f46985p.f37815f.toString());
        this.f46982m.setText(getString(R.string.carpool_referral_popup_code_text, this.f46985p.f37811b));
        this.f46981l.setEnabled(true);
        this.f46981l.setOnClickListener(new C18428a());
        String string = getString(R.string.carpool_referral_terms_and_conditions_a);
        String string2 = getString(R.string.carpool_referral_terms_and_conditions_b);
        this.f46983n.setText(C13437d.m33706k(string, " ", string2));
        C20964s0.m49105w(this.f46983n, string2, false, new C7078n(10, this, string2));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.carpool_share_referral_coupon_dialog_layout, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        C13556a aVar = this.f46986q;
        if (aVar != null) {
            aVar.cancel(true);
            this.f46986q = null;
        }
    }

    public final void onResume() {
        super.onResume();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "referral_popup");
        C17474b a = aVar.mo49933a();
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || !(parentFragment instanceof C15682c)) {
            mo22564R1(a);
        } else {
            ((C15682c) parentFragment).mo46797j2(a);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("carpoolReferralCouponDetails", this.f46985p);
        super.onSaveInstanceState(bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f46977h = (TextView) view.findViewById(R.id.passenger_credit);
        this.f46978i = (TextView) view.findViewById(R.id.driver_bonus);
        this.f46979j = (LinearLayout) view.findViewById(R.id.passenger_credit_container);
        this.f46980k = (LinearLayout) view.findViewById(R.id.driver_bonus_container);
        this.f46981l = (Button) view.findViewById(R.id.share_coupon_button);
        this.f46982m = (TextView) view.findViewById(R.id.coupon_code);
        this.f46984o = view.findViewById(R.id.plus_sign);
        this.f46983n = (TextView) view.findViewById(R.id.terms_of_use);
        if (bundle != null) {
            this.f46985p = (CarpoolReferralCouponDetails) bundle.getParcelable("carpoolReferralCouponDetails");
        }
        if (this.f46985p != null) {
            mo50879S1();
            return;
        }
        this.f46979j.setVisibility(4);
        this.f46980k.setVisibility(4);
        this.f46981l.setEnabled(false);
        this.f46982m.setVisibility(4);
        RotateAnimation rotateAnimation = (RotateAnimation) AnimationUtils.loadAnimation(getContext(), R.anim.loading_rotate_anim);
        this.f46987r = rotateAnimation;
        rotateAnimation.setRepeatCount(-1);
        this.f46984o.setAnimation(this.f46987r);
        C18424a aVar = new C18424a(this.f40792c.mo44548x1());
        this.f40792c.getClass();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f46986q = this.f40792c.mo44527k2("get_referral_details", aVar, requestOptions, new C18426c(this));
    }
}
