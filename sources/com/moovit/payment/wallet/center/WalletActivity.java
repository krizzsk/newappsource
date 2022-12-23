package com.moovit.payment.wallet.center;

import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import ce0.C21100e;
import com.google.android.material.tabs.TabLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.wallet.WalletTab;
import java.util.Collections;
import java.util.List;
import n00.C18492b;
import p543hq.C17474b;
import v40.C25750e;
import v40.C25751f;
import y60.C20709e;
import z60.C20813c;

public class WalletActivity extends MoovitPaymentActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f42881l0 = 0;

    /* renamed from: U */
    public final C16413a f42882U = new C16413a();

    /* renamed from: X */
    public TabLayout f42883X;

    /* renamed from: Y */
    public ViewPager f42884Y;

    /* renamed from: Z */
    public List<WalletTab> f42885Z;

    /* renamed from: com.moovit.payment.wallet.center.WalletActivity$a */
    public class C16413a extends ViewPager.SimpleOnPageChangeListener {
        public C16413a() {
        }

        public final void onPageSelected(int i) {
            int b = WalletActivity.this.f42884Y.mo47353b(i);
            WalletActivity walletActivity = WalletActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
            aVar.mo49945m(AnalyticsAttributeKey.TYPE, WalletActivity.this.f42885Z.get(b).analyticsType);
            walletActivity.mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.wallet_activity);
        setSupportActionBar((Toolbar) findViewById(C25750e.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(true);
            supportActionBar.mo791m(true);
        }
        this.f42884Y = (com.moovit.commons.view.pager.ViewPager) findViewById(C25750e.view_pager);
        this.f42883X = (TabLayout) findViewById(C25750e.tabs);
        C20709e a = C20709e.m48682a();
        C21100e.m49369v(1);
        List<WalletTab> unmodifiableList = Collections.unmodifiableList(a.f52296c);
        this.f42885Z = unmodifiableList;
        WalletTab walletTab = (WalletTab) getIntent().getParcelableExtra("tab");
        int i = 0;
        if (walletTab != null) {
            i = Math.max(0, unmodifiableList.indexOf(walletTab));
        }
        this.f42884Y.setAdapter(new C18492b((PagerAdapter) new C20813c(this, getSupportFragmentManager(), unmodifiableList), this.f42884Y));
        this.f42884Y.setCurrentLogicalItem(i);
        this.f42884Y.addOnPageChangeListener(this.f42882U);
        this.f42883X.setupWithViewPager(this.f42884Y);
    }
}
