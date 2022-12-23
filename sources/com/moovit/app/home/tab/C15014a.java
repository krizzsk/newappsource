package com.moovit.app.home.tab;

import a00.C13382a;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.AdsFrequencyCappingExperiment;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.home.HomeActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.tranzmate.R;
import p543hq.C17474b;
import z20.C20806a;

/* renamed from: com.moovit.app.home.tab.a */
public final class C15014a implements View.OnClickListener {

    /* renamed from: b */
    public final View f38425b;

    /* renamed from: c */
    public final HomeTab f38426c;

    /* renamed from: d */
    public final int f38427d;

    /* renamed from: e */
    public final int f38428e;

    /* renamed from: f */
    public final C15015a f38429f;

    /* renamed from: g */
    public final ImageView f38430g;

    /* renamed from: h */
    public final TextView f38431h;

    /* renamed from: i */
    public boolean f38432i = false;

    /* renamed from: j */
    public boolean f38433j = false;

    /* renamed from: com.moovit.app.home.tab.a$a */
    public interface C15015a {
    }

    public C15014a(View view, HomeTab homeTab, int i, int i2, C15015a aVar) {
        C21100e.m49373x(view, "tab");
        this.f38425b = view;
        C21100e.m49373x(homeTab, "homeTab");
        this.f38426c = homeTab;
        this.f38427d = i;
        this.f38428e = i2;
        this.f38429f = aVar;
        view.setOnClickListener(this);
        HomeTabUi ui = homeTab.getUi();
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        this.f38430g = imageView;
        if (imageView != null) {
            imageView.setImageResource(ui.iconResId);
        }
        TextView textView = (TextView) view.findViewById(R.id.text);
        this.f38431h = textView;
        if (textView != null) {
            textView.setText(ui.textResId);
        }
        if (imageView == null && textView == null) {
            throw new ApplicationBugException("ImageView and/or TextView must be defied!");
        }
        mo45233a();
    }

    /* renamed from: a */
    public final void mo45233a() {
        String str;
        ImageView imageView = this.f38430g;
        if (imageView != null) {
            imageView.setActivated(this.f38433j);
            this.f38430g.setSelected(this.f38432i);
        }
        TextView textView = this.f38431h;
        if (textView != null) {
            textView.setActivated(this.f38433j);
            this.f38431h.setSelected(this.f38432i);
        }
        HomeTabUi ui = this.f38426c.getUi();
        Resources resources = this.f38425b.getResources();
        String string = resources.getString(ui.textResId);
        if (this.f38432i) {
            str = resources.getString(R.string.voiceover_home_selected_tab, new Object[]{string, Integer.valueOf(this.f38427d + 1), Integer.valueOf(this.f38428e)});
        } else {
            str = resources.getString(R.string.voiceover_home_tab, new Object[]{string, Integer.valueOf(this.f38427d + 1), Integer.valueOf(this.f38428e)});
        }
        int i = ui.contentDescriptionResId;
        if (i != 0) {
            str = C13382a.m33667c(str, resources.getString(i));
        }
        C13382a.m33674j(this.f38425b, str);
    }

    public final void onClick(View view) {
        C15015a aVar = this.f38429f;
        if (aVar != null) {
            HomeActivity homeActivity = (HomeActivity) aVar;
            int i = this.f38427d;
            if (i != homeActivity.f38155m0) {
                homeActivity.mo45094B2(i);
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, this.f38426c.getUi().analyticTabButtonType);
            homeActivity.mo44545v2(aVar2.mo49933a());
            new C20806a.C20807a(this.f38426c.getUi().marketingTabButtonType).mo52935c();
            if (AdsFrequencyCappingExperiment.shouldShowAdOnHomeTabChange(this.f38426c)) {
                MobileAdsManager.m37073h().mo44716q(homeActivity, AdSource.TRANSITION_INTERSTITIAL);
            }
        }
    }
}
