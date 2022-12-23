package com.moovit.app.wondo.tickets.rewards;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationType;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenActivity;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.app.wondo.tickets.model.WondoReward;
import com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo;
import com.tranzmate.R;
import p304x.C7078n;
import p453dw.C16745s;
import p471eq.C16850a;
import p881vy.C20253g;
import p881vy.C20254h;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;

public class WondoRewardDetailsActivity extends MoovitAppActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f40769Z = 0;

    /* renamed from: U */
    public final C15671a f40770U = new C15671a();

    /* renamed from: X */
    public RadioGroup f40771X;

    /* renamed from: Y */
    public WondoReward f40772Y;

    /* renamed from: com.moovit.app.wondo.tickets.rewards.WondoRewardDetailsActivity$a */
    public class C15671a extends C20438i<C20253g, C20254h> {
        public C15671a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20253g gVar = (C20253g) cVar;
            WondoRewardDetailsActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20253g gVar2 = (C20253g) cVar;
            C20254h hVar = (C20254h) gVar;
            WondoRewardDetailsActivity wondoRewardDetailsActivity = WondoRewardDetailsActivity.this;
            int i = WondoRewardDetailsActivity.f40769Z;
            wondoRewardDetailsActivity.getClass();
            WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo = hVar.f51360m;
            if (wondoFullScreenDisplayInfo != null) {
                wondoRewardDetailsActivity.startActivity(WondoFullScreenActivity.m39967y2(wondoRewardDetailsActivity, wondoFullScreenDisplayInfo));
                wondoRewardDetailsActivity.finish();
                return;
            }
            wondoRewardDetailsActivity.startActivity(RideSharingRegistrationActivity.m39024z2(wondoRewardDetailsActivity, RideSharingRegistrationType.PURCHASE, hVar.f51361n, "redeem_rewards"));
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C20253g gVar = (C20253g) cVar;
            return false;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_reward_details_activity);
        Intent intent = getIntent();
        if (intent != null) {
            this.f40772Y = (WondoReward) intent.getParcelableExtra("reward");
        }
        WondoRewardDisplayInfo wondoRewardDisplayInfo = this.f40772Y.f40737d;
        ((TextView) findViewById(R.id.reward_title)).setText(wondoRewardDisplayInfo.f40740c);
        ((TextView) findViewById(R.id.reward_subtitle)).setText(wondoRewardDisplayInfo.f40741d);
        TextView textView = (TextView) findViewById(R.id.reward_terms);
        String string = getString(R.string.wondo_reward_terms_and_conditions_link);
        boolean z = true;
        textView.setText(getString(R.string.wondo_reward_terms_and_conditions, new Object[]{string}));
        C20964s0.m49105w(textView, string, false, new C7078n(12, this, wondoRewardDisplayInfo));
        ((Button) findViewById(R.id.reward_action)).setOnClickListener(new C16850a(this, 29));
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.options);
        this.f40771X = radioGroup;
        radioGroup.setOnCheckedChangeListener(new C16745s(this, 1));
        int size = this.f40772Y.f40738e.size();
        RadioGroup radioGroup2 = this.f40771X;
        int childCount = radioGroup2.getChildCount();
        if (childCount != size) {
            if (childCount > size) {
                radioGroup2.removeViews(size, childCount - size);
            } else {
                LayoutInflater layoutInflater = getLayoutInflater();
                while (childCount < size) {
                    layoutInflater.inflate(R.layout.wondo_reward_option_view, radioGroup2, true);
                    childCount++;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            RadioButton radioButton = (RadioButton) this.f40771X.getChildAt(i);
            String str = this.f40772Y.f40738e.get(i);
            radioButton.setTag(str);
            radioButton.setText(str);
        }
        Button button = (Button) findViewById(R.id.reward_action);
        if (mo46738y2() == null) {
            z = false;
        }
        button.setEnabled(z);
    }

    /* renamed from: y2 */
    public final String mo46738y2() {
        int checkedRadioButtonId;
        View findViewById;
        RadioGroup radioGroup = this.f40771X;
        if (radioGroup == null || (checkedRadioButtonId = radioGroup.getCheckedRadioButtonId()) == -1 || (findViewById = this.f40771X.findViewById(checkedRadioButtonId)) == null) {
            return null;
        }
        return (String) findViewById.getTag();
    }
}
