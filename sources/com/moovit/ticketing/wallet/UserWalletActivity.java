package com.moovit.ticketing.wallet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14753n;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.pager.ViewPager;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12875k;
import m80.C12887v;
import p373au.C13533e;
import p431cy.C16525b;
import p453dw.C16740o;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17060e;
import p543hq.C17474b;
import p80.C12991b;

public class UserWalletActivity extends MoovitActivity {

    /* renamed from: m0 */
    public static final HashSet f23612m0 = new HashSet(Arrays.asList(new UserWalletTab[]{UserWalletTab.STORED_VALUE, UserWalletTab.AVAILABLE, UserWalletTab.EXPIRED}));

    /* renamed from: U */
    public final C7779a f23613U = new C7779a();

    /* renamed from: X */
    public ViewPager f23614X;

    /* renamed from: Y */
    public List<UserWalletTab> f23615Y;

    /* renamed from: Z */
    public View f23616Z;

    /* renamed from: l0 */
    public Button f23617l0;

    /* renamed from: com.moovit.ticketing.wallet.UserWalletActivity$a */
    public class C7779a extends ViewPager.SimpleOnPageChangeListener {
        public C7779a() {
        }

        public final void onPageSelected(int i) {
            int b = UserWalletActivity.this.f23614X.mo47353b(i);
            UserWalletActivity userWalletActivity = UserWalletActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SWIPE);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, b);
            aVar.mo49945m(AnalyticsAttributeKey.TYPE, UserWalletActivity.this.f23615Y.get(b).analyticsType);
            userWalletActivity.mo44545v2(aVar.mo49933a());
            UserWalletActivity.this.mo24280z2(b);
        }
    }

    /* renamed from: com.moovit.ticketing.wallet.UserWalletActivity$b */
    public static /* synthetic */ class C7780b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23619a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.ticketing.wallet.UserWalletTab[] r0 = com.moovit.ticketing.wallet.UserWalletTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23619a = r0
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.VALIDATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23619a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.STORED_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23619a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.AVAILABLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23619a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.ticketing.wallet.UserWalletTab r1 = com.moovit.ticketing.wallet.UserWalletTab.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.ticketing.wallet.UserWalletActivity.C7780b.<clinit>():void");
        }
    }

    /* renamed from: y2 */
    public static Intent m17744y2(Context context) {
        Intent intent = new Intent(context, UserWalletActivity.class);
        intent.putExtra("tab", (Parcelable) null);
        return intent;
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        int i = C12869e.view_pager;
        C16525b c = new C17060e(this).mo49508c();
        c.mo49314a(TimeUnit.SECONDS.toMillis(30));
        return new C16855d(this, i, Collections.singletonList((C16851b) c.f43144b));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.user_wallet_activity);
        setSupportActionBar((Toolbar) findViewById(C12869e.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(true);
            supportActionBar.mo791m(true);
        }
        this.f23614X = (com.moovit.commons.view.pager.ViewPager) findViewById(C12869e.view_pager);
        this.f23616Z = findViewById(C12869e.shadow);
        Button button = (Button) findViewById(C12869e.action_button);
        this.f23617l0 = button;
        button.setOnClickListener(new C16740o(this, 26));
        C12887v.m32668b().mo39736g(false).continueWith(MoovitExecutors.COMPUTATION, new C13533e((C12991b) mo44537r1("TICKETING_CONFIGURATION"), 1)).addOnSuccessListener((Activity) this, new C14753n(this, 10));
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("TICKETING_CONFIGURATION");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo24280z2(int i) {
        int i2;
        C12991b bVar = (C12991b) mo44537r1("TICKETING_CONFIGURATION");
        Button button = this.f23617l0;
        int i3 = C7780b.f23619a[this.f23615Y.get(i).ordinal()];
        if (i3 != 1) {
            i2 = 0;
            if (i3 != 2) {
                if ((i3 == 3 || i3 == 4) && bVar.mo39881b(TicketingAgencyCapability.TICKETS)) {
                    i2 = C12873i.tickets_center_action_buy_ticket;
                }
            } else if (bVar.mo39881b(TicketingAgencyCapability.STORED_VALUE)) {
                i2 = C12873i.tickets_center_stored_topup_bottom_btn;
            }
        } else {
            i2 = C12875k.m32665e(bVar);
        }
        UiUtils.m40233A(button, i2);
        UiUtils.m40267z(this.f23617l0, this.f23616Z);
    }
}
